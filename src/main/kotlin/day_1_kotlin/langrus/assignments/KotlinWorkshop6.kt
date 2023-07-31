package day_1_kotlin.langrus.assignments

// Workshop #6 - special classes, objects, data classes


/* Рабочая зона */

// TODO 1: Добавь в data class 2-4 свойства.
data class VideoGame(val name: String, val genre: Genre, val age: Int, val price: Int = 100)

// TODO 2: Создай объект "VideoGamesTest", который будет использоваться для тестирования игр.
val VideoGamesTest = VideoGame("GTA", Genre.ADVENTURE, 18)

// Раскомментируй после объявления объекта.
//@JvmStatic
fun main(args: Array<String>) {
// TODO 3: Создай экземпляр класса "VideoGame".
//  Создай копию игры с помощью функции ата класса ".copy()", сохрани копию в другой переменной.
    val game = VideoGame("Skyrim", Genre.ROLE_PLAYINGS, 18)
    val copy = game.copy()

// TODO 4: Выведи в консоль результат сравнения игры и её копии, используя оператор сравнения "==".
//  Результат должен быть типа Boolean "true".
    val equal = game.equals(copy)
    println("Objects are equal $equal")

// TODO 5: Создай массив игр. В момент создания, наполни его несколькими играми и массив в консоль.
    val games = arrayOf(game, copy, VideoGamesTest)
    games.forEach {
        print("${it.name} ,")
    }

}


/* Бонусные задания */

// TODO 6: Создай "enum class", назови его "Genre", добавь в него несколько вариантов значений.
//  Добавь его, как новое свойство класса "VideoGame".
//  Поправь созданные сущности видеоигр в коде коде воркшопа.
//  Запусти выполнение функции "main()" и посмотри результат.

enum class Genre {
    STRATEGY,
    ROLE_PLAYINGS,
    ADVENTURE
}

// TODO 7: Добавь новое свойство класса "VideoGame", присвой ему значение "по-умолчанию".
//  Как ты можешь убедиться, новое свойство со значением "по-умолчанию" не требует делать исправлений в таком коде.
//  Но надо помнить, что поведение созданных сущностей может измениться.
//  Запусти выполнение функции "main()" и посмотри результат.