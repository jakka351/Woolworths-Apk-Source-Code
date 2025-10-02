package au.com.woolworths.shop.lists.data.database;

import android.database.SQLException;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/lists/data/database/ShoppingListRoomDatabase_Impl;", "Lau/com/woolworths/shop/lists/data/database/ShoppingListRoomDatabase;", "<init>", "()V", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShoppingListRoomDatabase_Impl extends ShoppingListRoomDatabase {
    public final Lazy m;
    public final Lazy n;
    public final Lazy o;
    public final Lazy p;
    public final Lazy q;

    public ShoppingListRoomDatabase_Impl() {
        final int i = 0;
        this.m = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.shop.lists.data.database.b
            public final /* synthetic */ ShoppingListRoomDatabase_Impl e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new ShoppingListDao_Impl(this.e);
                    case 1:
                        return new ProductListItemDao_Impl(this.e);
                    case 2:
                        return new TextListItemDao_Impl(this.e);
                    case 3:
                        return new ProductDao_Impl(this.e);
                    default:
                        return new CategoryDao_Impl(this.e);
                }
            }
        });
        final int i2 = 1;
        this.n = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.shop.lists.data.database.b
            public final /* synthetic */ ShoppingListRoomDatabase_Impl e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new ShoppingListDao_Impl(this.e);
                    case 1:
                        return new ProductListItemDao_Impl(this.e);
                    case 2:
                        return new TextListItemDao_Impl(this.e);
                    case 3:
                        return new ProductDao_Impl(this.e);
                    default:
                        return new CategoryDao_Impl(this.e);
                }
            }
        });
        final int i3 = 2;
        this.o = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.shop.lists.data.database.b
            public final /* synthetic */ ShoppingListRoomDatabase_Impl e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return new ShoppingListDao_Impl(this.e);
                    case 1:
                        return new ProductListItemDao_Impl(this.e);
                    case 2:
                        return new TextListItemDao_Impl(this.e);
                    case 3:
                        return new ProductDao_Impl(this.e);
                    default:
                        return new CategoryDao_Impl(this.e);
                }
            }
        });
        final int i4 = 3;
        this.p = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.shop.lists.data.database.b
            public final /* synthetic */ ShoppingListRoomDatabase_Impl e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return new ShoppingListDao_Impl(this.e);
                    case 1:
                        return new ProductListItemDao_Impl(this.e);
                    case 2:
                        return new TextListItemDao_Impl(this.e);
                    case 3:
                        return new ProductDao_Impl(this.e);
                    default:
                        return new CategoryDao_Impl(this.e);
                }
            }
        });
        final int i5 = 4;
        this.q = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.shop.lists.data.database.b
            public final /* synthetic */ ShoppingListRoomDatabase_Impl e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return new ShoppingListDao_Impl(this.e);
                    case 1:
                        return new ProductListItemDao_Impl(this.e);
                    case 2:
                        return new TextListItemDao_Impl(this.e);
                    case 3:
                        return new ProductDao_Impl(this.e);
                    default:
                        return new CategoryDao_Impl(this.e);
                }
            }
        });
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker e() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "shopping_list", "product_list_item", "text_list_item", "product", "category");
    }

    @Override // androidx.room.RoomDatabase
    public final SupportSQLiteOpenHelper f(DatabaseConfiguration databaseConfiguration) {
        RoomOpenHelper roomOpenHelper = new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate() { // from class: au.com.woolworths.shop.lists.data.database.ShoppingListRoomDatabase_Impl$createOpenHelper$_openCallback$1
            {
                super(18);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws SQLException {
                frameworkSQLiteDatabase.c1("CREATE TABLE IF NOT EXISTS `shopping_list` (`id` TEXT NOT NULL, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `remote_id` TEXT, `remote_timestamp` INTEGER NOT NULL, `edited` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, `remote_edited` INTEGER NOT NULL, `last_synced_time` INTEGER NOT NULL, `title` TEXT NOT NULL, `color` INTEGER NOT NULL, `watchlisted` INTEGER, PRIMARY KEY(`id`))");
                frameworkSQLiteDatabase.c1("CREATE TABLE IF NOT EXISTS `product_list_item` (`id` TEXT NOT NULL, `list_id` TEXT NOT NULL, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `remote_id` TEXT, `remote_timestamp` INTEGER NOT NULL, `edited` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, `checked` INTEGER NOT NULL, `product_id` TEXT NOT NULL, `quantity` REAL NOT NULL, `product_found_in_response` INTEGER NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`list_id`) REFERENCES `shopping_list`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                frameworkSQLiteDatabase.c1("CREATE UNIQUE INDEX IF NOT EXISTS `index_product_list_item_list_id_product_id` ON `product_list_item` (`list_id`, `product_id`)");
                frameworkSQLiteDatabase.c1("CREATE TABLE IF NOT EXISTS `text_list_item` (`id` TEXT NOT NULL, `list_id` TEXT NOT NULL, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `remote_id` TEXT, `remote_timestamp` INTEGER NOT NULL, `edited` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, `checked` INTEGER NOT NULL, `text` TEXT NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`list_id`) REFERENCES `shopping_list`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                frameworkSQLiteDatabase.c1("CREATE INDEX IF NOT EXISTS `index_text_list_item_list_id` ON `text_list_item` (`list_id`)");
                frameworkSQLiteDatabase.c1("CREATE TABLE IF NOT EXISTS `product` (`product_id` TEXT NOT NULL, `name` TEXT NOT NULL, `product_image` TEXT, `badge_image` TEXT, `price` INTEGER, `unit_price` TEXT, `available` INTEGER NOT NULL, `was_price` TEXT, `multibuy_price` TEXT, `multibuy_unitprice` TEXT, `purchase_warning` TEXT, `inline_labels` TEXT, `disclaimer` TEXT, `tobacco` INTEGER, `source` TEXT, `listminimum` REAL NOT NULL, `listmaximum` REAL NOT NULL, `listincrement` REAL NOT NULL, `listdefault_` REAL NOT NULL, `listunitLabel` TEXT, `instore_detailslocationText` TEXT, `instore_detailslocationType` TEXT, `promo_infotype` TEXT, `promo_infolabel` TEXT, `offer_info_offerId` TEXT, `offer_info_displayStatus` TEXT, `offer_info_displayExpiry` TEXT, `offer_info_minimumSpend` TEXT, `offer_info_offerStatus` TEXT, `offer_info_offerAnalytics` TEXT, `offer_info_boostButton` TEXT, `tag_label_text` TEXT, `tag_label_style` TEXT, `in_store_availability_info_button` TEXT, `in_store_availability_info_status` TEXT, `in_store_availability_info_infoSheet` TEXT, `marketplace_info_imageUrl` TEXT, `marketplace_info_title` TEXT, `marketplace_info_sellerName` TEXT, `marketplace_info_brandName` TEXT, `marketplace_info_lowestMarketPriceDescription` TEXT, `multi_buy_price_info_price` TEXT, `multi_buy_price_info_unitPrice` TEXT, `member_price_info_header` TEXT, `member_price_info_title` TEXT, `member_price_info_subtitle` TEXT, `instore_location_data_details` TEXT, `instore_location_data_displayInfo` TEXT, PRIMARY KEY(`product_id`))");
                frameworkSQLiteDatabase.c1("CREATE UNIQUE INDEX IF NOT EXISTS `index_product_product_id` ON `product` (`product_id`)");
                frameworkSQLiteDatabase.c1("CREATE TABLE IF NOT EXISTS `category` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `product_id` TEXT NOT NULL, `name` TEXT NOT NULL, `category_level` INTEGER NOT NULL, FOREIGN KEY(`product_id`) REFERENCES `product`(`product_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                frameworkSQLiteDatabase.c1("CREATE UNIQUE INDEX IF NOT EXISTS `index_category_id_product_id` ON `category` (`id`, `product_id`)");
                frameworkSQLiteDatabase.c1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                frameworkSQLiteDatabase.c1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7fb3b01a4642e6a06ad21cc260529806')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws SQLException {
                frameworkSQLiteDatabase.c1("DROP TABLE IF EXISTS `shopping_list`");
                frameworkSQLiteDatabase.c1("DROP TABLE IF EXISTS `product_list_item`");
                frameworkSQLiteDatabase.c1("DROP TABLE IF EXISTS `text_list_item`");
                frameworkSQLiteDatabase.c1("DROP TABLE IF EXISTS `product`");
                frameworkSQLiteDatabase.c1("DROP TABLE IF EXISTS `category`");
                List list = this.b.g;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).getClass();
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void c(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
                List list = this.b.g;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).getClass();
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void d(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws SQLException {
                this.b.f3718a = frameworkSQLiteDatabase;
                frameworkSQLiteDatabase.c1("PRAGMA foreign_keys = ON");
                this.b.m(frameworkSQLiteDatabase);
                List list = this.b.g;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).a(frameworkSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void e(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void f(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws IOException, SQLException {
                DBUtil.a(frameworkSQLiteDatabase);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final RoomOpenHelper.ValidationResult g(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws IOException {
                HashMap map = new HashMap(12);
                map.put("id", new TableInfo.Column(1, "id", "TEXT", null, true, 1));
                map.put("created_at", new TableInfo.Column(0, "created_at", "INTEGER", null, true, 1));
                map.put("updated_at", new TableInfo.Column(0, "updated_at", "INTEGER", null, true, 1));
                map.put("remote_id", new TableInfo.Column(0, "remote_id", "TEXT", null, false, 1));
                map.put("remote_timestamp", new TableInfo.Column(0, "remote_timestamp", "INTEGER", null, true, 1));
                map.put("edited", new TableInfo.Column(0, "edited", "INTEGER", null, true, 1));
                map.put("deleted", new TableInfo.Column(0, "deleted", "INTEGER", null, true, 1));
                map.put("remote_edited", new TableInfo.Column(0, "remote_edited", "INTEGER", null, true, 1));
                map.put("last_synced_time", new TableInfo.Column(0, "last_synced_time", "INTEGER", null, true, 1));
                map.put("title", new TableInfo.Column(0, "title", "TEXT", null, true, 1));
                map.put("color", new TableInfo.Column(0, "color", "INTEGER", null, true, 1));
                map.put("watchlisted", new TableInfo.Column(0, "watchlisted", "INTEGER", null, false, 1));
                TableInfo tableInfo = new TableInfo("shopping_list", map, new HashSet(0), new HashSet(0));
                TableInfo tableInfoA = TableInfo.Companion.a(frameworkSQLiteDatabase, "shopping_list");
                if (!tableInfo.equals(tableInfoA)) {
                    return new RoomOpenHelper.ValidationResult(false, "shopping_list(au.com.woolworths.shop.lists.data.entity.ShoppingListEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfoA);
                }
                HashMap map2 = new HashMap(12);
                map2.put("id", new TableInfo.Column(1, "id", "TEXT", null, true, 1));
                map2.put("list_id", new TableInfo.Column(0, "list_id", "TEXT", null, true, 1));
                map2.put("created_at", new TableInfo.Column(0, "created_at", "INTEGER", null, true, 1));
                map2.put("updated_at", new TableInfo.Column(0, "updated_at", "INTEGER", null, true, 1));
                map2.put("remote_id", new TableInfo.Column(0, "remote_id", "TEXT", null, false, 1));
                map2.put("remote_timestamp", new TableInfo.Column(0, "remote_timestamp", "INTEGER", null, true, 1));
                map2.put("edited", new TableInfo.Column(0, "edited", "INTEGER", null, true, 1));
                map2.put("deleted", new TableInfo.Column(0, "deleted", "INTEGER", null, true, 1));
                map2.put("checked", new TableInfo.Column(0, "checked", "INTEGER", null, true, 1));
                map2.put("product_id", new TableInfo.Column(0, "product_id", "TEXT", null, true, 1));
                map2.put("quantity", new TableInfo.Column(0, "quantity", "REAL", null, true, 1));
                map2.put("product_found_in_response", new TableInfo.Column(0, "product_found_in_response", "INTEGER", null, true, 1));
                HashSet hashSet = new HashSet(1);
                hashSet.add(new TableInfo.ForeignKey("shopping_list", "CASCADE", "NO ACTION", CollectionsKt.Q("list_id"), CollectionsKt.Q("id")));
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new TableInfo.Index("index_product_list_item_list_id_product_id", true, CollectionsKt.R("list_id", "product_id"), CollectionsKt.R("ASC", "ASC")));
                TableInfo tableInfo2 = new TableInfo("product_list_item", map2, hashSet, hashSet2);
                TableInfo tableInfoA2 = TableInfo.Companion.a(frameworkSQLiteDatabase, "product_list_item");
                if (!tableInfo2.equals(tableInfoA2)) {
                    return new RoomOpenHelper.ValidationResult(false, "product_list_item(au.com.woolworths.shop.lists.data.entity.ProductListItemEntity).\n Expected:\n" + tableInfo2 + "\n Found:\n" + tableInfoA2);
                }
                HashMap map3 = new HashMap(10);
                map3.put("id", new TableInfo.Column(1, "id", "TEXT", null, true, 1));
                map3.put("list_id", new TableInfo.Column(0, "list_id", "TEXT", null, true, 1));
                map3.put("created_at", new TableInfo.Column(0, "created_at", "INTEGER", null, true, 1));
                map3.put("updated_at", new TableInfo.Column(0, "updated_at", "INTEGER", null, true, 1));
                map3.put("remote_id", new TableInfo.Column(0, "remote_id", "TEXT", null, false, 1));
                map3.put("remote_timestamp", new TableInfo.Column(0, "remote_timestamp", "INTEGER", null, true, 1));
                map3.put("edited", new TableInfo.Column(0, "edited", "INTEGER", null, true, 1));
                map3.put("deleted", new TableInfo.Column(0, "deleted", "INTEGER", null, true, 1));
                map3.put("checked", new TableInfo.Column(0, "checked", "INTEGER", null, true, 1));
                map3.put(TextBundle.TEXT_ENTRY, new TableInfo.Column(0, TextBundle.TEXT_ENTRY, "TEXT", null, true, 1));
                HashSet hashSet3 = new HashSet(1);
                hashSet3.add(new TableInfo.ForeignKey("shopping_list", "CASCADE", "NO ACTION", CollectionsKt.Q("list_id"), CollectionsKt.Q("id")));
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new TableInfo.Index("index_text_list_item_list_id", false, CollectionsKt.Q("list_id"), CollectionsKt.Q("ASC")));
                TableInfo tableInfo3 = new TableInfo("text_list_item", map3, hashSet3, hashSet4);
                TableInfo tableInfoA3 = TableInfo.Companion.a(frameworkSQLiteDatabase, "text_list_item");
                if (!tableInfo3.equals(tableInfoA3)) {
                    return new RoomOpenHelper.ValidationResult(false, "text_list_item(au.com.woolworths.shop.lists.data.entity.TextListItemEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfoA3);
                }
                HashMap map4 = new HashMap(48);
                map4.put("product_id", new TableInfo.Column(1, "product_id", "TEXT", null, true, 1));
                map4.put(AppMeasurementSdk.ConditionalUserProperty.NAME, new TableInfo.Column(0, AppMeasurementSdk.ConditionalUserProperty.NAME, "TEXT", null, true, 1));
                map4.put("product_image", new TableInfo.Column(0, "product_image", "TEXT", null, false, 1));
                map4.put("badge_image", new TableInfo.Column(0, "badge_image", "TEXT", null, false, 1));
                map4.put("price", new TableInfo.Column(0, "price", "INTEGER", null, false, 1));
                map4.put("unit_price", new TableInfo.Column(0, "unit_price", "TEXT", null, false, 1));
                map4.put("available", new TableInfo.Column(0, "available", "INTEGER", null, true, 1));
                map4.put("was_price", new TableInfo.Column(0, "was_price", "TEXT", null, false, 1));
                map4.put("multibuy_price", new TableInfo.Column(0, "multibuy_price", "TEXT", null, false, 1));
                map4.put("multibuy_unitprice", new TableInfo.Column(0, "multibuy_unitprice", "TEXT", null, false, 1));
                map4.put("purchase_warning", new TableInfo.Column(0, "purchase_warning", "TEXT", null, false, 1));
                map4.put("inline_labels", new TableInfo.Column(0, "inline_labels", "TEXT", null, false, 1));
                map4.put("disclaimer", new TableInfo.Column(0, "disclaimer", "TEXT", null, false, 1));
                map4.put("tobacco", new TableInfo.Column(0, "tobacco", "INTEGER", null, false, 1));
                map4.put("source", new TableInfo.Column(0, "source", "TEXT", null, false, 1));
                map4.put("listminimum", new TableInfo.Column(0, "listminimum", "REAL", null, true, 1));
                map4.put("listmaximum", new TableInfo.Column(0, "listmaximum", "REAL", null, true, 1));
                map4.put("listincrement", new TableInfo.Column(0, "listincrement", "REAL", null, true, 1));
                map4.put("listdefault_", new TableInfo.Column(0, "listdefault_", "REAL", null, true, 1));
                map4.put("listunitLabel", new TableInfo.Column(0, "listunitLabel", "TEXT", null, false, 1));
                map4.put("instore_detailslocationText", new TableInfo.Column(0, "instore_detailslocationText", "TEXT", null, false, 1));
                map4.put("instore_detailslocationType", new TableInfo.Column(0, "instore_detailslocationType", "TEXT", null, false, 1));
                map4.put("promo_infotype", new TableInfo.Column(0, "promo_infotype", "TEXT", null, false, 1));
                map4.put("promo_infolabel", new TableInfo.Column(0, "promo_infolabel", "TEXT", null, false, 1));
                map4.put("offer_info_offerId", new TableInfo.Column(0, "offer_info_offerId", "TEXT", null, false, 1));
                map4.put("offer_info_displayStatus", new TableInfo.Column(0, "offer_info_displayStatus", "TEXT", null, false, 1));
                map4.put("offer_info_displayExpiry", new TableInfo.Column(0, "offer_info_displayExpiry", "TEXT", null, false, 1));
                map4.put("offer_info_minimumSpend", new TableInfo.Column(0, "offer_info_minimumSpend", "TEXT", null, false, 1));
                map4.put("offer_info_offerStatus", new TableInfo.Column(0, "offer_info_offerStatus", "TEXT", null, false, 1));
                map4.put("offer_info_offerAnalytics", new TableInfo.Column(0, "offer_info_offerAnalytics", "TEXT", null, false, 1));
                map4.put("offer_info_boostButton", new TableInfo.Column(0, "offer_info_boostButton", "TEXT", null, false, 1));
                map4.put("tag_label_text", new TableInfo.Column(0, "tag_label_text", "TEXT", null, false, 1));
                map4.put("tag_label_style", new TableInfo.Column(0, "tag_label_style", "TEXT", null, false, 1));
                map4.put("in_store_availability_info_button", new TableInfo.Column(0, "in_store_availability_info_button", "TEXT", null, false, 1));
                map4.put("in_store_availability_info_status", new TableInfo.Column(0, "in_store_availability_info_status", "TEXT", null, false, 1));
                map4.put("in_store_availability_info_infoSheet", new TableInfo.Column(0, "in_store_availability_info_infoSheet", "TEXT", null, false, 1));
                map4.put("marketplace_info_imageUrl", new TableInfo.Column(0, "marketplace_info_imageUrl", "TEXT", null, false, 1));
                map4.put("marketplace_info_title", new TableInfo.Column(0, "marketplace_info_title", "TEXT", null, false, 1));
                map4.put("marketplace_info_sellerName", new TableInfo.Column(0, "marketplace_info_sellerName", "TEXT", null, false, 1));
                map4.put("marketplace_info_brandName", new TableInfo.Column(0, "marketplace_info_brandName", "TEXT", null, false, 1));
                map4.put("marketplace_info_lowestMarketPriceDescription", new TableInfo.Column(0, "marketplace_info_lowestMarketPriceDescription", "TEXT", null, false, 1));
                map4.put("multi_buy_price_info_price", new TableInfo.Column(0, "multi_buy_price_info_price", "TEXT", null, false, 1));
                map4.put("multi_buy_price_info_unitPrice", new TableInfo.Column(0, "multi_buy_price_info_unitPrice", "TEXT", null, false, 1));
                map4.put("member_price_info_header", new TableInfo.Column(0, "member_price_info_header", "TEXT", null, false, 1));
                map4.put("member_price_info_title", new TableInfo.Column(0, "member_price_info_title", "TEXT", null, false, 1));
                map4.put("member_price_info_subtitle", new TableInfo.Column(0, "member_price_info_subtitle", "TEXT", null, false, 1));
                map4.put("instore_location_data_details", new TableInfo.Column(0, "instore_location_data_details", "TEXT", null, false, 1));
                map4.put("instore_location_data_displayInfo", new TableInfo.Column(0, "instore_location_data_displayInfo", "TEXT", null, false, 1));
                HashSet hashSet5 = new HashSet(0);
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new TableInfo.Index("index_product_product_id", true, CollectionsKt.Q("product_id"), CollectionsKt.Q("ASC")));
                TableInfo tableInfo4 = new TableInfo("product", map4, hashSet5, hashSet6);
                TableInfo tableInfoA4 = TableInfo.Companion.a(frameworkSQLiteDatabase, "product");
                if (!tableInfo4.equals(tableInfoA4)) {
                    return new RoomOpenHelper.ValidationResult(false, "product(au.com.woolworths.shop.lists.data.entity.ProductEntity).\n Expected:\n" + tableInfo4 + "\n Found:\n" + tableInfoA4);
                }
                HashMap map5 = new HashMap(4);
                map5.put("id", new TableInfo.Column(1, "id", "INTEGER", null, true, 1));
                map5.put("product_id", new TableInfo.Column(0, "product_id", "TEXT", null, true, 1));
                map5.put(AppMeasurementSdk.ConditionalUserProperty.NAME, new TableInfo.Column(0, AppMeasurementSdk.ConditionalUserProperty.NAME, "TEXT", null, true, 1));
                map5.put("category_level", new TableInfo.Column(0, "category_level", "INTEGER", null, true, 1));
                HashSet hashSet7 = new HashSet(1);
                hashSet7.add(new TableInfo.ForeignKey("product", "CASCADE", "NO ACTION", CollectionsKt.Q("product_id"), CollectionsKt.Q("product_id")));
                HashSet hashSet8 = new HashSet(1);
                hashSet8.add(new TableInfo.Index("index_category_id_product_id", true, CollectionsKt.R("id", "product_id"), CollectionsKt.R("ASC", "ASC")));
                TableInfo tableInfo5 = new TableInfo("category", map5, hashSet7, hashSet8);
                TableInfo tableInfoA5 = TableInfo.Companion.a(frameworkSQLiteDatabase, "category");
                if (tableInfo5.equals(tableInfoA5)) {
                    return new RoomOpenHelper.ValidationResult(true, null);
                }
                return new RoomOpenHelper.ValidationResult(false, "category(au.com.woolworths.shop.lists.data.entity.CategoryByProductEntity).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfoA5);
            }
        }, "7fb3b01a4642e6a06ad21cc260529806", "a2eb752835bef6e2b614c16c4de55125");
        SupportSQLiteOpenHelper.Configuration.Builder builderA = SupportSQLiteOpenHelper.Configuration.Companion.a(databaseConfiguration.f3709a);
        builderA.b = databaseConfiguration.b;
        builderA.c = roomOpenHelper;
        return databaseConfiguration.c.d(builderA.a());
    }

    @Override // androidx.room.RoomDatabase
    public final List g(Map autoMigrationSpecs) {
        Intrinsics.h(autoMigrationSpecs, "autoMigrationSpecs");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ShoppingListRoomDatabase_AutoMigration_6_7_Impl(6, 7));
        arrayList.add(new ShoppingListRoomDatabase_AutoMigration_8_9_Impl(8, 9));
        arrayList.add(new ShoppingListRoomDatabase_AutoMigration_9_10_Impl(9, 10));
        arrayList.add(new ShoppingListRoomDatabase_AutoMigration_10_11_Impl(10, 11));
        arrayList.add(new ShoppingListRoomDatabase_AutoMigration_11_12_Impl(11, 12));
        arrayList.add(new ShoppingListRoomDatabase_AutoMigration_12_13_Impl(12, 13));
        arrayList.add(new ShoppingListRoomDatabase_AutoMigration_13_14_Impl(13, 14));
        arrayList.add(new ShoppingListRoomDatabase_AutoMigration_14_15_Impl(14, 15));
        arrayList.add(new ShoppingListRoomDatabase_AutoMigration_15_16_Impl(15, 16));
        arrayList.add(new ShoppingListRoomDatabase_AutoMigration_16_17_Impl(16, 17));
        arrayList.add(new ShoppingListRoomDatabase_AutoMigration_17_18_Impl(17, 18));
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    public final Set j() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map k() {
        HashMap map = new HashMap();
        EmptyList emptyList = EmptyList.d;
        map.put(ShoppingListDao.class, emptyList);
        map.put(ProductListItemDao.class, emptyList);
        map.put(TextListItemDao.class, emptyList);
        map.put(ProductDao.class, emptyList);
        map.put(CategoryDao.class, emptyList);
        return map;
    }

    @Override // au.com.woolworths.shop.lists.data.database.ShoppingListRoomDatabase
    public final CategoryDao t() {
        return (CategoryDao) this.q.getD();
    }

    @Override // au.com.woolworths.shop.lists.data.database.ShoppingListRoomDatabase
    public final ProductDao u() {
        return (ProductDao) this.p.getD();
    }

    @Override // au.com.woolworths.shop.lists.data.database.ShoppingListRoomDatabase
    public final ProductListItemDao v() {
        return (ProductListItemDao) this.n.getD();
    }

    @Override // au.com.woolworths.shop.lists.data.database.ShoppingListRoomDatabase
    public final ShoppingListDao w() {
        return (ShoppingListDao) this.m.getD();
    }

    @Override // au.com.woolworths.shop.lists.data.database.ShoppingListRoomDatabase
    public final TextListItemDao x() {
        return (TextListItemDao) this.o.getD();
    }
}
