class Users (private var name : String, private val timeAgo: Int) {

    fun wasAgo() {
        val minutes: Int = timeAgo / 60
        val hours: Int = (timeAgo / 60)/60
        when (timeAgo) {
            in 0..60 -> println("$name был(а) только что")
            in 61..(60 * 60) -> println("$name был(а) $minutes ${convertToMin()} назад")
            in (60 * 60) + 1..(24 * 60 * 60) -> println("$name был(а) $hours ${convertToHours()} назад")
            in (24 * 60 * 60) + 1..(24 * 60 * 60 * 2) -> println("сегодня")
            in (24 * 60 * 60 * 2) + 1..(24 * 60 * 60 * 3) -> println("вчера")
            else -> println("давно")
        }
    }

    private fun convertToMin()=
        when ((timeAgo/60)%100) {
            in 11..11 -> "минут"
            in 0..1 -> "минуту"
            in 2..4 -> "минуты"
            else -> "минут"
        }


    private fun convertToHours()=
        when ((timeAgo/60)%100) {
            in 11..11 -> "часов"
            in 0..1 -> "час"
            in 2..4 -> "часа"
            else -> "часов"
        }
}

