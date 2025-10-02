package androidx.work.impl;

import android.database.SQLException;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.DependencyDao_Impl;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.PreferenceDao_Impl;
import androidx.work.impl.model.RawWorkInfoDao;
import androidx.work.impl.model.RawWorkInfoDao_Impl;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.SystemIdInfoDao_Impl;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkNameDao_Impl;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkProgressDao_Impl;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecDao_Impl;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.model.WorkTagDao_Impl;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile WorkSpecDao_Impl m;
    public volatile DependencyDao_Impl n;
    public volatile WorkTagDao_Impl o;
    public volatile SystemIdInfoDao_Impl p;
    public volatile WorkNameDao_Impl q;
    public volatile WorkProgressDao_Impl r;
    public volatile PreferenceDao_Impl s;
    public volatile RawWorkInfoDao_Impl t;

    @Override // androidx.work.impl.WorkDatabase
    public final WorkTagDao A() {
        WorkTagDao_Impl workTagDao_Impl;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new WorkTagDao_Impl(this);
                }
                workTagDao_Impl = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return workTagDao_Impl;
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker e() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.RoomDatabase
    public final SupportSQLiteOpenHelper f(DatabaseConfiguration databaseConfiguration) {
        RoomOpenHelper roomOpenHelper = new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate() { // from class: androidx.work.impl.WorkDatabase_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws SQLException {
                frameworkSQLiteDatabase.c1("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                frameworkSQLiteDatabase.c1("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                frameworkSQLiteDatabase.c1("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                frameworkSQLiteDatabase.c1("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                frameworkSQLiteDatabase.c1("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                frameworkSQLiteDatabase.c1("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                frameworkSQLiteDatabase.c1("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                frameworkSQLiteDatabase.c1("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                frameworkSQLiteDatabase.c1("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                frameworkSQLiteDatabase.c1("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                frameworkSQLiteDatabase.c1("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                frameworkSQLiteDatabase.c1("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                frameworkSQLiteDatabase.c1("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                frameworkSQLiteDatabase.c1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                frameworkSQLiteDatabase.c1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws SQLException {
                frameworkSQLiteDatabase.c1("DROP TABLE IF EXISTS `Dependency`");
                frameworkSQLiteDatabase.c1("DROP TABLE IF EXISTS `WorkSpec`");
                frameworkSQLiteDatabase.c1("DROP TABLE IF EXISTS `WorkTag`");
                frameworkSQLiteDatabase.c1("DROP TABLE IF EXISTS `SystemIdInfo`");
                frameworkSQLiteDatabase.c1("DROP TABLE IF EXISTS `WorkName`");
                frameworkSQLiteDatabase.c1("DROP TABLE IF EXISTS `WorkProgress`");
                frameworkSQLiteDatabase.c1("DROP TABLE IF EXISTS `Preference`");
                List list = WorkDatabase_Impl.this.g;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).getClass();
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void c(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
                List list = WorkDatabase_Impl.this.g;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).getClass();
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void d(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws SQLException {
                WorkDatabase_Impl.this.f3718a = frameworkSQLiteDatabase;
                frameworkSQLiteDatabase.c1("PRAGMA foreign_keys = ON");
                WorkDatabase_Impl.this.m(frameworkSQLiteDatabase);
                List list = WorkDatabase_Impl.this.g;
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
            public final RoomOpenHelper.ValidationResult g(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
                HashMap map = new HashMap(2);
                map.put("work_spec_id", new TableInfo.Column(1, "work_spec_id", "TEXT", null, true, 1));
                map.put("prerequisite_id", new TableInfo.Column(2, "prerequisite_id", "TEXT", null, true, 1));
                HashSet hashSet = new HashSet(2);
                hashSet.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                hashSet.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new TableInfo.Index("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                hashSet2.add(new TableInfo.Index("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
                TableInfo tableInfo = new TableInfo("Dependency", map, hashSet, hashSet2);
                TableInfo tableInfoA = TableInfo.a(frameworkSQLiteDatabase, "Dependency");
                if (!tableInfo.equals(tableInfoA)) {
                    return new RoomOpenHelper.ValidationResult(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfoA);
                }
                HashMap map2 = new HashMap(32);
                map2.put("id", new TableInfo.Column(1, "id", "TEXT", null, true, 1));
                map2.put("state", new TableInfo.Column(0, "state", "INTEGER", null, true, 1));
                map2.put("worker_class_name", new TableInfo.Column(0, "worker_class_name", "TEXT", null, true, 1));
                map2.put("input_merger_class_name", new TableInfo.Column(0, "input_merger_class_name", "TEXT", null, true, 1));
                map2.put("input", new TableInfo.Column(0, "input", "BLOB", null, true, 1));
                map2.put("output", new TableInfo.Column(0, "output", "BLOB", null, true, 1));
                map2.put("initial_delay", new TableInfo.Column(0, "initial_delay", "INTEGER", null, true, 1));
                map2.put("interval_duration", new TableInfo.Column(0, "interval_duration", "INTEGER", null, true, 1));
                map2.put("flex_duration", new TableInfo.Column(0, "flex_duration", "INTEGER", null, true, 1));
                map2.put("run_attempt_count", new TableInfo.Column(0, "run_attempt_count", "INTEGER", null, true, 1));
                map2.put("backoff_policy", new TableInfo.Column(0, "backoff_policy", "INTEGER", null, true, 1));
                map2.put("backoff_delay_duration", new TableInfo.Column(0, "backoff_delay_duration", "INTEGER", null, true, 1));
                map2.put("last_enqueue_time", new TableInfo.Column(0, "last_enqueue_time", "INTEGER", "-1", true, 1));
                map2.put("minimum_retention_duration", new TableInfo.Column(0, "minimum_retention_duration", "INTEGER", null, true, 1));
                map2.put("schedule_requested_at", new TableInfo.Column(0, "schedule_requested_at", "INTEGER", null, true, 1));
                map2.put("run_in_foreground", new TableInfo.Column(0, "run_in_foreground", "INTEGER", null, true, 1));
                map2.put("out_of_quota_policy", new TableInfo.Column(0, "out_of_quota_policy", "INTEGER", null, true, 1));
                map2.put("period_count", new TableInfo.Column(0, "period_count", "INTEGER", "0", true, 1));
                map2.put("generation", new TableInfo.Column(0, "generation", "INTEGER", "0", true, 1));
                map2.put("next_schedule_time_override", new TableInfo.Column(0, "next_schedule_time_override", "INTEGER", "9223372036854775807", true, 1));
                map2.put("next_schedule_time_override_generation", new TableInfo.Column(0, "next_schedule_time_override_generation", "INTEGER", "0", true, 1));
                map2.put("stop_reason", new TableInfo.Column(0, "stop_reason", "INTEGER", "-256", true, 1));
                map2.put("trace_tag", new TableInfo.Column(0, "trace_tag", "TEXT", null, false, 1));
                map2.put("required_network_type", new TableInfo.Column(0, "required_network_type", "INTEGER", null, true, 1));
                map2.put("required_network_request", new TableInfo.Column(0, "required_network_request", "BLOB", "x''", true, 1));
                map2.put("requires_charging", new TableInfo.Column(0, "requires_charging", "INTEGER", null, true, 1));
                map2.put("requires_device_idle", new TableInfo.Column(0, "requires_device_idle", "INTEGER", null, true, 1));
                map2.put("requires_battery_not_low", new TableInfo.Column(0, "requires_battery_not_low", "INTEGER", null, true, 1));
                map2.put("requires_storage_not_low", new TableInfo.Column(0, "requires_storage_not_low", "INTEGER", null, true, 1));
                map2.put("trigger_content_update_delay", new TableInfo.Column(0, "trigger_content_update_delay", "INTEGER", null, true, 1));
                map2.put("trigger_max_content_delay", new TableInfo.Column(0, "trigger_max_content_delay", "INTEGER", null, true, 1));
                map2.put("content_uri_triggers", new TableInfo.Column(0, "content_uri_triggers", "BLOB", null, true, 1));
                HashSet hashSet3 = new HashSet(0);
                HashSet hashSet4 = new HashSet(2);
                hashSet4.add(new TableInfo.Index("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
                hashSet4.add(new TableInfo.Index("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
                TableInfo tableInfo2 = new TableInfo("WorkSpec", map2, hashSet3, hashSet4);
                TableInfo tableInfoA2 = TableInfo.a(frameworkSQLiteDatabase, "WorkSpec");
                if (!tableInfo2.equals(tableInfoA2)) {
                    return new RoomOpenHelper.ValidationResult(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + tableInfo2 + "\n Found:\n" + tableInfoA2);
                }
                HashMap map3 = new HashMap(2);
                map3.put("tag", new TableInfo.Column(1, "tag", "TEXT", null, true, 1));
                map3.put("work_spec_id", new TableInfo.Column(2, "work_spec_id", "TEXT", null, true, 1));
                HashSet hashSet5 = new HashSet(1);
                hashSet5.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new TableInfo.Index("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                TableInfo tableInfo3 = new TableInfo("WorkTag", map3, hashSet5, hashSet6);
                TableInfo tableInfoA3 = TableInfo.a(frameworkSQLiteDatabase, "WorkTag");
                if (!tableInfo3.equals(tableInfoA3)) {
                    return new RoomOpenHelper.ValidationResult(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfoA3);
                }
                HashMap map4 = new HashMap(3);
                map4.put("work_spec_id", new TableInfo.Column(1, "work_spec_id", "TEXT", null, true, 1));
                map4.put("generation", new TableInfo.Column(2, "generation", "INTEGER", "0", true, 1));
                map4.put("system_id", new TableInfo.Column(0, "system_id", "INTEGER", null, true, 1));
                HashSet hashSet7 = new HashSet(1);
                hashSet7.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                TableInfo tableInfo4 = new TableInfo("SystemIdInfo", map4, hashSet7, new HashSet(0));
                TableInfo tableInfoA4 = TableInfo.a(frameworkSQLiteDatabase, "SystemIdInfo");
                if (!tableInfo4.equals(tableInfoA4)) {
                    return new RoomOpenHelper.ValidationResult(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + tableInfo4 + "\n Found:\n" + tableInfoA4);
                }
                HashMap map5 = new HashMap(2);
                map5.put(AppMeasurementSdk.ConditionalUserProperty.NAME, new TableInfo.Column(1, AppMeasurementSdk.ConditionalUserProperty.NAME, "TEXT", null, true, 1));
                map5.put("work_spec_id", new TableInfo.Column(2, "work_spec_id", "TEXT", null, true, 1));
                HashSet hashSet8 = new HashSet(1);
                hashSet8.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                HashSet hashSet9 = new HashSet(1);
                hashSet9.add(new TableInfo.Index("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                TableInfo tableInfo5 = new TableInfo("WorkName", map5, hashSet8, hashSet9);
                TableInfo tableInfoA5 = TableInfo.a(frameworkSQLiteDatabase, "WorkName");
                if (!tableInfo5.equals(tableInfoA5)) {
                    return new RoomOpenHelper.ValidationResult(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfoA5);
                }
                HashMap map6 = new HashMap(2);
                map6.put("work_spec_id", new TableInfo.Column(1, "work_spec_id", "TEXT", null, true, 1));
                map6.put("progress", new TableInfo.Column(0, "progress", "BLOB", null, true, 1));
                HashSet hashSet10 = new HashSet(1);
                hashSet10.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                TableInfo tableInfo6 = new TableInfo("WorkProgress", map6, hashSet10, new HashSet(0));
                TableInfo tableInfoA6 = TableInfo.a(frameworkSQLiteDatabase, "WorkProgress");
                if (!tableInfo6.equals(tableInfoA6)) {
                    return new RoomOpenHelper.ValidationResult(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + tableInfo6 + "\n Found:\n" + tableInfoA6);
                }
                HashMap map7 = new HashMap(2);
                map7.put("key", new TableInfo.Column(1, "key", "TEXT", null, true, 1));
                map7.put("long_value", new TableInfo.Column(0, "long_value", "INTEGER", null, false, 1));
                TableInfo tableInfo7 = new TableInfo("Preference", map7, new HashSet(0), new HashSet(0));
                TableInfo tableInfoA7 = TableInfo.a(frameworkSQLiteDatabase, "Preference");
                if (tableInfo7.equals(tableInfoA7)) {
                    return new RoomOpenHelper.ValidationResult(true, null);
                }
                return new RoomOpenHelper.ValidationResult(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfoA7);
            }
        }, "86254750241babac4b8d52996a675549", "1cbd3130fa23b59692c061c594c16cc0");
        SupportSQLiteOpenHelper.Configuration.Builder builderA = SupportSQLiteOpenHelper.Configuration.Companion.a(databaseConfiguration.f3709a);
        builderA.b = databaseConfiguration.b;
        builderA.c = roomOpenHelper;
        return databaseConfiguration.c.d(builderA.a());
    }

    @Override // androidx.room.RoomDatabase
    public final List g(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WorkDatabase_AutoMigration_13_14_Impl(13, 14));
        arrayList.add(new WorkDatabase_AutoMigration_14_15_Impl(14, 15));
        arrayList.add(new WorkDatabase_AutoMigration_16_17_Impl(16, 17));
        arrayList.add(new WorkDatabase_AutoMigration_17_18_Impl(17, 18));
        arrayList.add(new WorkDatabase_AutoMigration_18_19_Impl(18, 19));
        arrayList.add(new WorkDatabase_AutoMigration_19_20_Impl(19, 20));
        arrayList.add(new WorkDatabase_AutoMigration_20_21_Impl(20, 21));
        arrayList.add(new WorkDatabase_AutoMigration_22_23_Impl(22, 23));
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    public final Set j() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map k() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(WorkSpecDao.class, list);
        map.put(DependencyDao.class, list);
        map.put(WorkTagDao.class, list);
        map.put(SystemIdInfoDao.class, list);
        map.put(WorkNameDao.class, list);
        map.put(WorkProgressDao.class, list);
        map.put(PreferenceDao.class, list);
        map.put(RawWorkInfoDao.class, list);
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final DependencyDao t() {
        DependencyDao_Impl dependencyDao_Impl;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new DependencyDao_Impl(this);
                }
                dependencyDao_Impl = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dependencyDao_Impl;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final PreferenceDao u() {
        PreferenceDao_Impl preferenceDao_Impl;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            try {
                if (this.s == null) {
                    this.s = new PreferenceDao_Impl(this);
                }
                preferenceDao_Impl = this.s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return preferenceDao_Impl;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final RawWorkInfoDao v() {
        RawWorkInfoDao_Impl rawWorkInfoDao_Impl;
        if (this.t != null) {
            return this.t;
        }
        synchronized (this) {
            try {
                if (this.t == null) {
                    this.t = new RawWorkInfoDao_Impl();
                }
                rawWorkInfoDao_Impl = this.t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rawWorkInfoDao_Impl;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final SystemIdInfoDao w() {
        SystemIdInfoDao_Impl systemIdInfoDao_Impl;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    this.p = new SystemIdInfoDao_Impl(this);
                }
                systemIdInfoDao_Impl = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return systemIdInfoDao_Impl;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final WorkNameDao x() {
        WorkNameDao_Impl workNameDao_Impl;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new WorkNameDao_Impl(this);
                }
                workNameDao_Impl = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return workNameDao_Impl;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final WorkProgressDao y() {
        WorkProgressDao_Impl workProgressDao_Impl;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    this.r = new WorkProgressDao_Impl(this);
                }
                workProgressDao_Impl = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return workProgressDao_Impl;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final WorkSpecDao z() {
        WorkSpecDao_Impl workSpecDao_Impl;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            try {
                if (this.m == null) {
                    this.m = new WorkSpecDao_Impl(this);
                }
                workSpecDao_Impl = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return workSpecDao_Impl;
    }
}
