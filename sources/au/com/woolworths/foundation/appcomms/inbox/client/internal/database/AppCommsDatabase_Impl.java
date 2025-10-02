package au.com.woolworths.foundation.appcomms.inbox.client.internal.database;

import android.database.SQLException;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao_Impl;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataDao;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataDao_Impl;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/database/AppCommsDatabase_Impl;", "Lau/com/woolworths/foundation/appcomms/inbox/client/internal/database/AppCommsDatabase;", "<init>", "()V", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppCommsDatabase_Impl extends AppCommsDatabase {
    public final Lazy m;
    public final Lazy n;

    public AppCommsDatabase_Impl() {
        final int i = 0;
        this.m = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.foundation.appcomms.inbox.client.internal.database.a
            public final /* synthetic */ AppCommsDatabase_Impl e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new InboxMessageDao_Impl(this.e);
                    default:
                        return new SyncMetadataDao_Impl(this.e);
                }
            }
        });
        final int i2 = 1;
        this.n = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.foundation.appcomms.inbox.client.internal.database.a
            public final /* synthetic */ AppCommsDatabase_Impl e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new InboxMessageDao_Impl(this.e);
                    default:
                        return new SyncMetadataDao_Impl(this.e);
                }
            }
        });
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker e() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "inbox_message", "sync_metadata");
    }

    @Override // androidx.room.RoomDatabase
    public final SupportSQLiteOpenHelper f(DatabaseConfiguration databaseConfiguration) {
        RoomOpenHelper roomOpenHelper = new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate() { // from class: au.com.woolworths.foundation.appcomms.inbox.client.internal.database.AppCommsDatabase_Impl$createOpenHelper$_openCallback$1
            {
                super(1);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws SQLException {
                frameworkSQLiteDatabase.c1("CREATE TABLE IF NOT EXISTS `inbox_message` (`id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `campaign_code` TEXT NOT NULL, `campaign_variant` TEXT, `title` TEXT, `body` TEXT, `cta` TEXT, `created_on` TEXT NOT NULL, `ttl` TEXT NOT NULL, `seen` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, PRIMARY KEY(`id`, `user_id`))");
                frameworkSQLiteDatabase.c1("CREATE INDEX IF NOT EXISTS `index_inbox_message_seen` ON `inbox_message` (`seen`)");
                frameworkSQLiteDatabase.c1("CREATE INDEX IF NOT EXISTS `index_inbox_message_deleted` ON `inbox_message` (`deleted`)");
                frameworkSQLiteDatabase.c1("CREATE TABLE IF NOT EXISTS `sync_metadata` (`user_id` TEXT NOT NULL, `resource_type` TEXT NOT NULL, `last_sync_time` TEXT NOT NULL, PRIMARY KEY(`user_id`, `resource_type`))");
                frameworkSQLiteDatabase.c1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                frameworkSQLiteDatabase.c1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '21194a5dd9f4b9ebff87850c283136a6')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws SQLException {
                frameworkSQLiteDatabase.c1("DROP TABLE IF EXISTS `inbox_message`");
                frameworkSQLiteDatabase.c1("DROP TABLE IF EXISTS `sync_metadata`");
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
                HashMap map = new HashMap(11);
                map.put("id", new TableInfo.Column(1, "id", "TEXT", null, true, 1));
                map.put("user_id", new TableInfo.Column(2, "user_id", "TEXT", null, true, 1));
                map.put("campaign_code", new TableInfo.Column(0, "campaign_code", "TEXT", null, true, 1));
                map.put("campaign_variant", new TableInfo.Column(0, "campaign_variant", "TEXT", null, false, 1));
                map.put("title", new TableInfo.Column(0, "title", "TEXT", null, false, 1));
                map.put("body", new TableInfo.Column(0, "body", "TEXT", null, false, 1));
                map.put("cta", new TableInfo.Column(0, "cta", "TEXT", null, false, 1));
                map.put("created_on", new TableInfo.Column(0, "created_on", "TEXT", null, true, 1));
                map.put("ttl", new TableInfo.Column(0, "ttl", "TEXT", null, true, 1));
                map.put("seen", new TableInfo.Column(0, "seen", "INTEGER", null, true, 1));
                map.put("deleted", new TableInfo.Column(0, "deleted", "INTEGER", null, true, 1));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new TableInfo.Index("index_inbox_message_seen", false, CollectionsKt.Q("seen"), CollectionsKt.Q("ASC")));
                hashSet2.add(new TableInfo.Index("index_inbox_message_deleted", false, CollectionsKt.Q("deleted"), CollectionsKt.Q("ASC")));
                TableInfo tableInfo = new TableInfo("inbox_message", map, hashSet, hashSet2);
                TableInfo tableInfoA = TableInfo.Companion.a(frameworkSQLiteDatabase, "inbox_message");
                if (!tableInfo.equals(tableInfoA)) {
                    return new RoomOpenHelper.ValidationResult(false, "inbox_message(au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfoA);
                }
                HashMap map2 = new HashMap(3);
                map2.put("user_id", new TableInfo.Column(1, "user_id", "TEXT", null, true, 1));
                map2.put("resource_type", new TableInfo.Column(2, "resource_type", "TEXT", null, true, 1));
                map2.put("last_sync_time", new TableInfo.Column(0, "last_sync_time", "TEXT", null, true, 1));
                TableInfo tableInfo2 = new TableInfo("sync_metadata", map2, new HashSet(0), new HashSet(0));
                TableInfo tableInfoA2 = TableInfo.Companion.a(frameworkSQLiteDatabase, "sync_metadata");
                if (tableInfo2.equals(tableInfoA2)) {
                    return new RoomOpenHelper.ValidationResult(true, null);
                }
                return new RoomOpenHelper.ValidationResult(false, "sync_metadata(au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataEntity).\n Expected:\n" + tableInfo2 + "\n Found:\n" + tableInfoA2);
            }
        }, "21194a5dd9f4b9ebff87850c283136a6", "bc3f7cdacc4943bae9b6dfc5a2da1649");
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
        EmptyList emptyList = EmptyList.d;
        map.put(InboxMessageDao.class, emptyList);
        map.put(SyncMetadataDao.class, emptyList);
        return map;
    }

    @Override // au.com.woolworths.foundation.appcomms.inbox.client.internal.database.AppCommsDatabase
    public final InboxMessageDao t() {
        return (InboxMessageDao) this.m.getD();
    }

    @Override // au.com.woolworths.foundation.appcomms.inbox.client.internal.database.AppCommsDatabase
    public final SyncMetadataDao u() {
        return (SyncMetadataDao) this.n.getD();
    }
}
