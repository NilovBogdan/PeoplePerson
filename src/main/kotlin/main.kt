fun main() {
    val likes = 1421// Колличество лайков
    val strLikes = likes.toString() // Преобразование значения типа Int в значение типа String
    val lastChar = strLikes.last()  // Берем последний символ из строки
    val peoples = " людям"
    val person = " человеку"
    val peoplePerson = "Понравилось " + likes + if (lastChar == '1' &&
        (strLikes.substring( strLikes.length - 2)) != "11")
        person else peoples // Сравнивание и присваивание нужного результата
    println(peoplePerson)
}