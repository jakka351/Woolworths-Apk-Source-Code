package au.com.woolworths.android.onesite.database;

import android.database.SQLException;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.a;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import au.com.woolworths.android.onesite.models.search.RecentSearch;
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
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/database/WoolworthsSupermarketDatabase_Impl;", "Lau/com/woolworths/android/onesite/database/WoolworthsSupermarketDatabase;", "<init>", "()V", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WoolworthsSupermarketDatabase_Impl extends WoolworthsSupermarketDatabase {
    public final Lazy m = LazyKt.b(new a(this, 5));

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker e() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), RecentSearch.TABLE_NAME);
    }

    @Override // androidx.room.RoomDatabase
    public final SupportSQLiteOpenHelper f(DatabaseConfiguration databaseConfiguration) {
        RoomOpenHelper roomOpenHelper = new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate() { // from class: au.com.woolworths.android.onesite.database.WoolworthsSupermarketDatabase_Impl$createOpenHelper$_openCallback$1
            {
                super(1);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws SQLException {
                frameworkSQLiteDatabase.c1("CREATE TABLE IF NOT EXISTS `recentSearch` (`searchTerm` TEXT NOT NULL, `id` TEXT NOT NULL, `searchDateTime` TEXT NOT NULL, PRIMARY KEY(`id`))");
                frameworkSQLiteDatabase.c1("CREATE INDEX IF NOT EXISTS `index_recentSearch_id` ON `recentSearch` (`id`)");
                frameworkSQLiteDatabase.c1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                frameworkSQLiteDatabase.c1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '33d4b38fa453ce0086ef0babc6c6ebb0')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws SQLException {
                frameworkSQLiteDatabase.c1("DROP TABLE IF EXISTS `recentSearch`");
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
            public final void d(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
                this.b.f3718a = frameworkSQLiteDatabase;
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
                HashMap map = new HashMap(3);
                map.put(RecentSearch.COLUMN_NAME_SEARCH_TERM, new TableInfo.Column(0, RecentSearch.COLUMN_NAME_SEARCH_TERM, "TEXT", null, true, 1));
                map.put("id", new TableInfo.Column(1, "id", "TEXT", null, true, 1));
                map.put(RecentSearch.COLUMN_NAME_SEARCH_DATE_TIME, new TableInfo.Column(0, RecentSearch.COLUMN_NAME_SEARCH_DATE_TIME, "TEXT", null, true, 1));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new TableInfo.Index("index_recentSearch_id", false, CollectionsKt.Q("id"), CollectionsKt.Q("ASC")));
                TableInfo tableInfo = new TableInfo(RecentSearch.TABLE_NAME, map, hashSet, hashSet2);
                TableInfo tableInfoA = TableInfo.Companion.a(frameworkSQLiteDatabase, RecentSearch.TABLE_NAME);
                if (tableInfo.equals(tableInfoA)) {
                    return new RoomOpenHelper.ValidationResult(true, null);
                }
                return new RoomOpenHelper.ValidationResult(false, "recentSearch(au.com.woolworths.android.onesite.models.search.RecentSearch).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfoA);
            }
        }, "33d4b38fa453ce0086ef0babc6c6ebb0", "e5717230e3286dbbb6a3b063261f519f");
        SupportSQLiteOpenHelper.Configuration.Builder builderA = SupportSQLiteOpenHelper.Configuration.Companion.a(databaseConfiguration.f3709a);
        builderA.b = databaseConfiguration.b;
        builderA.c = roomOpenHelper;
        return databaseConfiguration.c.d(builderA.a());
    }

    @Override // androidx.room.RoomDatabase
    public final List g(Map autoMigrationSpecs) {
        Intrinsics.h(autoMigrationSpecs, "autoMigrationSpecs");
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public final Set j() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map k() {
        HashMap map = new HashMap();
        map.put(RecentSearchDao.class, EmptyList.d);
        return map;
    }

    @Override // au.com.woolworths.android.onesite.database.WoolworthsSupermarketDatabase
    public final RecentSearchDao t() {
        return (RecentSearchDao) this.m.getD();
    }
}
