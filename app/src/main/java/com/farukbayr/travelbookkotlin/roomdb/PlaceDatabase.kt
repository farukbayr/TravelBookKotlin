package com.farukbayr.travelbookkotlin.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.farukbayr.travelbookkotlin.model.Place

@Database(entities = arrayOf(Place::class), version = 1)
abstract class PlaceDatabase : RoomDatabase() {
    abstract fun placeDao() : PlaceDao
}