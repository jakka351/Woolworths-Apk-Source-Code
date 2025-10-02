package au.com.woolworths.shop.lists.data.database;

import android.database.SQLException;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/database/ShoppingListRoomDatabase_AutoMigration_13_14_Impl;", "Landroidx/room/migration/Migration;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShoppingListRoomDatabase_AutoMigration_13_14_Impl extends Migration {
    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) throws SQLException {
        FrameworkSQLiteDatabase frameworkSQLiteDatabase = (FrameworkSQLiteDatabase) supportSQLiteDatabase;
        frameworkSQLiteDatabase.c1("ALTER TABLE `product` ADD COLUMN `multi_buy_price_info_price` TEXT DEFAULT NULL");
        frameworkSQLiteDatabase.c1("ALTER TABLE `product` ADD COLUMN `multi_buy_price_info_unitPrice` TEXT DEFAULT NULL");
        frameworkSQLiteDatabase.c1("ALTER TABLE `product` ADD COLUMN `member_price_info_header` TEXT DEFAULT NULL");
        frameworkSQLiteDatabase.c1("ALTER TABLE `product` ADD COLUMN `member_price_info_title` TEXT DEFAULT NULL");
        frameworkSQLiteDatabase.c1("ALTER TABLE `product` ADD COLUMN `member_price_info_subtitle` TEXT DEFAULT NULL");
    }
}
