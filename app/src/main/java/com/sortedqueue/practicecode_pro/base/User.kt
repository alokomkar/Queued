package com.sortedqueue.practicecode_pro.base

/**
 * Created by Alok on 07/02/18.
 */
class User( var userId : String = "",
            var name : String = "",
            var email : String = "",
            var imageUrl : String = "",
            var authType : Int = AUTH_ANON ) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (userId != other.userId) return false

        return true
    }

    override fun hashCode(): Int {
        return userId.hashCode()
    }
}