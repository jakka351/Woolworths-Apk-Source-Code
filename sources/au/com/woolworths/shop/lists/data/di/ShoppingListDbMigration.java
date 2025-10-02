package au.com.woolworths.shop.lists.data.di;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import au.com.woolworths.android.onesite.gson.KeepHierarchy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeepHierarchy
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/shop/lists/data/di/ShoppingListDbMigration;", "Landroidx/room/migration/Migration;", "Migration1to2", "Migration2to3", "Migration3to4", "Migration4to5", "Migration5to6", "Migration7to8", "Lau/com/woolworths/shop/lists/data/di/ShoppingListDbMigration$Migration1to2;", "Lau/com/woolworths/shop/lists/data/di/ShoppingListDbMigration$Migration2to3;", "Lau/com/woolworths/shop/lists/data/di/ShoppingListDbMigration$Migration3to4;", "Lau/com/woolworths/shop/lists/data/di/ShoppingListDbMigration$Migration4to5;", "Lau/com/woolworths/shop/lists/data/di/ShoppingListDbMigration$Migration5to6;", "Lau/com/woolworths/shop/lists/data/di/ShoppingListDbMigration$Migration7to8;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ShoppingListDbMigration extends Migration {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/shop/lists/data/di/ShoppingListDbMigration$Migration1to2;", "Lau/com/woolworths/shop/lists/data/di/ShoppingListDbMigration;", "<init>", "()V", "migrate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "equals", "", "other", "", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Migration1to2 extends ShoppingListDbMigration {

        @NotNull
        public static final Migration1to2 INSTANCE = new Migration1to2();

        private Migration1to2() {
            super(1, 2);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Migration1to2);
        }

        public int hashCode() {
            return 162342535;
        }

        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase db) {
            Intrinsics.h(db, "db");
            db.c1("ALTER TABLE product ADD COLUMN offer_info_offerId TEXT");
            db.c1("ALTER TABLE product ADD COLUMN offer_info_displayStatus TEXT");
            db.c1("ALTER TABLE product ADD COLUMN offer_info_displayExpiry TEXT");
            db.c1("ALTER TABLE product ADD COLUMN offer_info_offerStatus TEXT");
        }

        @NotNull
        public String toString() {
            return "Migration1to2";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/shop/lists/data/di/ShoppingListDbMigration$Migration2to3;", "Lau/com/woolworths/shop/lists/data/di/ShoppingListDbMigration;", "<init>", "()V", "migrate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "equals", "", "other", "", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Migration2to3 extends ShoppingListDbMigration {

        @NotNull
        public static final Migration2to3 INSTANCE = new Migration2to3();

        private Migration2to3() {
            super(2, 3);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Migration2to3);
        }

        public int hashCode() {
            return 162372327;
        }

        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase db) {
            Intrinsics.h(db, "db");
            db.c1("ALTER TABLE product ADD COLUMN disclaimer TEXT");
            db.c1("ALTER TABLE product ADD COLUMN tag_label_text TEXT");
            db.c1("ALTER TABLE product ADD COLUMN tag_label_style TEXT");
        }

        @NotNull
        public String toString() {
            return "Migration2to3";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/shop/lists/data/di/ShoppingListDbMigration$Migration3to4;", "Lau/com/woolworths/shop/lists/data/di/ShoppingListDbMigration;", "<init>", "()V", "migrate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "equals", "", "other", "", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Migration3to4 extends ShoppingListDbMigration {

        @NotNull
        public static final Migration3to4 INSTANCE = new Migration3to4();

        private Migration3to4() {
            super(3, 4);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Migration3to4);
        }

        public int hashCode() {
            return 162402119;
        }

        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase db) {
            Intrinsics.h(db, "db");
            db.c1("ALTER TABLE product ADD COLUMN offer_info_offerAnalytics TEXT");
        }

        @NotNull
        public String toString() {
            return "Migration3to4";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/shop/lists/data/di/ShoppingListDbMigration$Migration4to5;", "Lau/com/woolworths/shop/lists/data/di/ShoppingListDbMigration;", "<init>", "()V", "migrate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "equals", "", "other", "", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Migration4to5 extends ShoppingListDbMigration {

        @NotNull
        public static final Migration4to5 INSTANCE = new Migration4to5();

        private Migration4to5() {
            super(4, 5);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Migration4to5);
        }

        public int hashCode() {
            return 162431911;
        }

        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase db) {
            Intrinsics.h(db, "db");
            db.c1("ALTER TABLE product ADD COLUMN offer_info_boostButton TEXT");
        }

        @NotNull
        public String toString() {
            return "Migration4to5";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/shop/lists/data/di/ShoppingListDbMigration$Migration5to6;", "Lau/com/woolworths/shop/lists/data/di/ShoppingListDbMigration;", "<init>", "()V", "migrate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "equals", "", "other", "", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Migration5to6 extends ShoppingListDbMigration {

        @NotNull
        public static final Migration5to6 INSTANCE = new Migration5to6();

        private Migration5to6() {
            super(5, 6);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Migration5to6);
        }

        public int hashCode() {
            return 162461703;
        }

        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase db) {
            Intrinsics.h(db, "db");
            db.c1("ALTER TABLE product ADD COLUMN marketplace_info_imageUrl TEXT");
            db.c1("ALTER TABLE product ADD COLUMN marketplace_info_title TEXT");
            db.c1("ALTER TABLE product ADD COLUMN marketplace_info_sellerName TEXT");
            db.c1("ALTER TABLE product ADD COLUMN marketplace_info_brandName TEXT");
        }

        @NotNull
        public String toString() {
            return "Migration5to6";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/shop/lists/data/di/ShoppingListDbMigration$Migration7to8;", "Lau/com/woolworths/shop/lists/data/di/ShoppingListDbMigration;", "<init>", "()V", "migrate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "equals", "", "other", "", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Migration7to8 extends ShoppingListDbMigration {

        @NotNull
        public static final Migration7to8 INSTANCE = new Migration7to8();

        private Migration7to8() {
            super(7, 8);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Migration7to8);
        }

        public int hashCode() {
            return 162521287;
        }

        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase db) {
            Intrinsics.h(db, "db");
            db.c1("UPDATE shopping_list SET color = -16743992 WHERE color = -9728");
        }

        @NotNull
        public String toString() {
            return "Migration7to8";
        }
    }
}
