package com.sortedqueue.practicecode_pro.base

/**
 * Created by Alok on 07/02/18.
 */
class CodeBase( var parentId : String = "",
                var codeBaseId : String = "",
                var programLanguage : Int = LANGUAGE_JAVA,
                var title : String = "",
                var subTitle : String = "",
                var description : String = "",
                var imageUrl : String = "",
                var programCode : String = "",
                var commentsCode : String = "",
                var questionCode : String = "",
                var options : String = "",
                var correctAnswer : String = "",
                var explanation : String = "",
                var questionType : Int = TYPE_NONE ) {

    fun getProgramCodeList() : ArrayList<String> {
        return ArrayList(programCode.split(Regex.fromLiteral("\n")))
    }

    fun getCommentsCodeList() : ArrayList<String> {
        return ArrayList(commentsCode.split(Regex.fromLiteral("\n")))
    }

    fun getQuestionCodeList() : ArrayList<String> {
        return ArrayList(questionCode.split(Regex.fromLiteral("\n")))
    }

    fun getOptionsList() : ArrayList<String> {
        return ArrayList(options.split(Regex.fromLiteral(OPTION_DELIMITER)))
    }

    fun getCorrectOptions() : ArrayList<String> {
        return ArrayList(correctAnswer.split(Regex.fromLiteral(OPTION_DELIMITER)))
    }

    fun checkSequence( optionsList : ArrayList<String> ) : ArrayList<String> {

        val answersList = getCorrectOptions()
        val resultList = ArrayList<String>()

        for((index, option) in optionsList.withIndex()) {

            val answer = answersList[index]
            if( option == answer ) {
                resultList[index] = ""
            }
            else {
                resultList[index] = answer
            }

        }
        return resultList

    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CodeBase

        if (parentId != other.parentId) return false
        if (codeBaseId != other.codeBaseId) return false

        return true
    }

    override fun hashCode(): Int {
        var result = parentId.hashCode()
        result = 31 * result + codeBaseId.hashCode()
        return result
    }
}