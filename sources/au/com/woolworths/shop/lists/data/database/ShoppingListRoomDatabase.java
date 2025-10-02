package au.com.woolworths.shop.lists.data.database;

import androidx.room.Database;
import androidx.room.DeleteColumn;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.room.migration.AutoMigrationSpec;
import kotlin.Metadata;

@TypeConverters
@Database
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/lists/data/database/ShoppingListRoomDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "RemoveMemberPricingTypeColumnMigration", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ShoppingListRoomDatabase extends RoomDatabase {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/lists/data/database/ShoppingListRoomDatabase$Companion;", "", "", "DB_NAME", "Ljava/lang/String;", "", "LATEST_SHOPPING_LIST_DB_VERSION", "I", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @DeleteColumn
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/database/ShoppingListRoomDatabase$RemoveMemberPricingTypeColumnMigration;", "Landroidx/room/migration/AutoMigrationSpec;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RemoveMemberPricingTypeColumnMigration implements AutoMigrationSpec {
    }

    public abstract CategoryDao t();

    public abstract ProductDao u();

    public abstract ProductListItemDao v();

    public abstract ShoppingListDao w();

    public abstract TextListItemDao x();
}
