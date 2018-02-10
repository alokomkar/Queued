package com.sortedqueue.practicecode_pro.base

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by Alok on 07/02/18.
 */
class Chapter(var chapterId: String = "",
              var programLanguage: Int = LANGUAGE_JAVA,
              var title: String = "",
              var description: String = "",
              var imageUrl: String = "",
              var isPaid: Boolean = false) : Parcelable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Chapter

        if (chapterId != other.chapterId) return false

        return true
    }

    override fun hashCode(): Int {
        return chapterId.hashCode()
    }

    constructor(source: Parcel) : this(
            source.readString(),
            source.readInt(),
            source.readString(),
            source.readString(),
            source.readString(),
            1 == source.readInt()
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(chapterId)
        writeInt(programLanguage)
        writeString(title)
        writeString(description)
        writeString(imageUrl)
        writeInt((if (isPaid) 1 else 0))
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<Chapter> = object : Parcelable.Creator<Chapter> {
            override fun createFromParcel(source: Parcel): Chapter = Chapter(source)
            override fun newArray(size: Int): Array<Chapter?> = arrayOfNulls(size)
        }
    }
}