package com.example.stuedent_soes

object Constants{
    const val USER_NAME : String ="user_name"
    const val TOTAL_QUESTIONS: String ="total_question"
    const val CORRECT_ANSWERS: String ="correct_answers"
    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(
            1,
            "When was JUST founded? ",
            R.drawable.just,
            "1986",
            "1970",
            "1999",
            "1980",
            1)
        questionList.add(que1)
        val que2 = Question(
            2,
            "When did Jordan gain independence?",
            R.drawable.jordan,
            "1930",
            "1946",
            "1950",
            "1910",
            2)
        questionList.add((que2))
        val que3 = Question(
            3,
            "Who was the first man on the moon?",
            R.drawable.moon,
            "John wick",
            "Van gogh",
            "Neil Armstrong",
            "Jack Black",
            3)
        questionList.add((que3))
        val que4 = Question(
            4,
            "What does SOES stands for?",
            R.drawable.soes,
            "Smart Online Examination System",
            "Siri's Online Extra Security",
            "Sam's Organisation of Electrical Systems ",
            "Sanctuary of every sunday ",
            1)
        questionList.add((que4))

        val que5 = Question(
            5,
            "Who was the first king of jordan?",
            R.drawable.king,
            "King Talal",
            "King Abdullah II",
            "King Hussain ",
            "King Abdullah I",
            4)
        questionList.add((que5))

        val que6 = Question(
            6,
            "What is the capital of Sudan",
            R.drawable.sudan,
            "Khartoum",
            "Amman",
            "Sana'a ",
            "Al Ahjar",
            1)
        questionList.add((que6))

        val que7 = Question(
            7,
            "What is the Name of this delicious food?",
            R.drawable.mensaf,
            "Mandi",
            "Kabseh",
            "Mansaf",
            "Maqlobeh",
            3)
        questionList.add((que7))

        val que8 = Question(
            8,
            "Who is the queen of England?",
            R.drawable.queen,
            "Elizabeth I",
            "Elizabeth II",
            "Sam Collins",
            "Emma Wilson",
            2)
        questionList.add((que8))

        val que9 = Question(
            9,
            "Answer according to the picture",
            R.drawable.sqr4,
            "0",
            "1",
            "2",
            "3",
            3)
        questionList.add((que9))

        val que10 = Question(
            10,
            "What is the largest desert in the world?",
            R.drawable.des2,
            "Russain Arctic 2.1 million square miles",
            "Australian Desert 1 million square miles",
            "Sahara desert 3.3 million square miles",
            "Antarctic desert 5.5 million square miles",
            4)
        questionList.add((que10))

        return questionList
    }
}