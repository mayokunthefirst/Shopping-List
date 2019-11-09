package com.mayokun.shoppinglist.database


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.mayokun.shoppinglist.utils.getCurrentSystemTime


/**
 * Created by Mayokun Adeniyi on 2019-11-08.
 */

@Entity(tableName = "shopping_list_table")
data class ShoppingItem(

    @PrimaryKey(autoGenerate = true)
    var itemId: Int = 0,

    @ColumnInfo(name = "item_name")
    var itemName: String,

    @ColumnInfo(name = "item_quantity")
    var itemQuantity: Int,

    @ColumnInfo(name = "date_created")
    var dateItemCreated: String = getCurrentSystemTime()
)

