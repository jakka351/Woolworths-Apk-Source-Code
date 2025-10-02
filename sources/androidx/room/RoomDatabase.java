package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import android.util.Log;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import com.google.android.gms.ads.RequestConfiguration;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b&\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Landroidx/room/RoomDatabase;", "", "Builder", "Callback", "Companion", "JournalMode", "MigrationContainer", "PrepackagedDatabaseCallback", "QueryCallback", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class RoomDatabase {

    /* renamed from: a, reason: collision with root package name */
    public volatile FrameworkSQLiteDatabase f3718a;
    public Executor b;
    public TransactionExecutor c;
    public SupportSQLiteOpenHelper d;
    public boolean f;
    public List g;
    public final Map k;
    public final LinkedHashMap l;
    public final InvalidationTracker e = e();
    public final LinkedHashMap h = new LinkedHashMap();
    public final ReentrantReadWriteLock i = new ReentrantReadWriteLock();
    public final ThreadLocal j = new ThreadLocal();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/RoomDatabase$Builder;", "Landroidx/room/RoomDatabase;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static class Builder<T extends RoomDatabase> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f3719a;
        public final Class b;
        public final String c;
        public final ArrayList d;
        public final ArrayList e;
        public final ArrayList f;
        public Executor g;
        public Executor h;
        public androidx.compose.runtime.snapshots.a i;
        public boolean j;
        public final JournalMode k;
        public boolean l;
        public boolean m;
        public final long n;
        public final MigrationContainer o;
        public final LinkedHashSet p;
        public HashSet q;

        public Builder(Context context, Class cls, String str) {
            Intrinsics.h(context, "context");
            this.f3719a = context;
            this.b = cls;
            this.c = str;
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.k = JournalMode.d;
            this.l = true;
            this.n = -1L;
            this.o = new MigrationContainer();
            this.p = new LinkedHashSet();
        }

        public final void a(Migration... migrations) {
            Intrinsics.h(migrations, "migrations");
            if (this.q == null) {
                this.q = new HashSet();
            }
            for (Migration migration : migrations) {
                HashSet hashSet = this.q;
                Intrinsics.e(hashSet);
                hashSet.add(Integer.valueOf(migration.startVersion));
                HashSet hashSet2 = this.q;
                Intrinsics.e(hashSet2);
                hashSet2.add(Integer.valueOf(migration.endVersion));
            }
            this.o.a((Migration[]) Arrays.copyOf(migrations, migrations.length));
        }

        public final RoomDatabase b() throws ClassNotFoundException {
            Executor executor = this.g;
            if (executor == null && this.h == null) {
                androidx.arch.core.executor.a aVar = ArchTaskExecutor.d;
                this.h = aVar;
                this.g = aVar;
            } else if (executor != null && this.h == null) {
                this.h = executor;
            } else if (executor == null) {
                this.g = this.h;
            }
            HashSet hashSet = this.q;
            LinkedHashSet linkedHashSet = this.p;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                        throw new IllegalArgumentException(YU.a.d(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                    }
                }
            }
            SupportSQLiteOpenHelper.Factory frameworkSQLiteOpenHelperFactory = this.i;
            if (frameworkSQLiteOpenHelperFactory == null) {
                frameworkSQLiteOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
            }
            SupportSQLiteOpenHelper.Factory factory = frameworkSQLiteOpenHelperFactory;
            if (this.n > 0) {
                if (this.c != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
            }
            boolean z = this.j;
            JournalMode journalMode = this.k;
            journalMode.getClass();
            Context context = this.f3719a;
            Intrinsics.h(context, "context");
            JournalMode journalMode2 = JournalMode.d;
            JournalMode journalMode3 = JournalMode.f;
            if (journalMode == journalMode2) {
                Object systemService = context.getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                journalMode = (activityManager == null || activityManager.isLowRamDevice()) ? JournalMode.e : journalMode3;
            }
            Executor executor2 = this.g;
            if (executor2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor3 = this.h;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            boolean z2 = this.l;
            boolean z3 = this.m;
            String str = this.c;
            MigrationContainer migrationContainer = this.o;
            ArrayList arrayList = this.d;
            ArrayList arrayList2 = this.e;
            ArrayList arrayList3 = this.f;
            DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(context, str, factory, migrationContainer, arrayList, z, journalMode, executor2, executor3, z2, z3, linkedHashSet, arrayList2, arrayList3);
            Class cls = this.b;
            Package r5 = cls.getPackage();
            Intrinsics.e(r5);
            String fullPackage = r5.getName();
            String canonicalName = cls.getCanonicalName();
            Intrinsics.e(canonicalName);
            Intrinsics.g(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                canonicalName = canonicalName.substring(fullPackage.length() + 1);
                Intrinsics.g(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            String strConcat = StringsKt.R(canonicalName, JwtParser.SEPARATOR_CHAR, '_').concat("_Impl");
            try {
                Class<?> cls2 = Class.forName(fullPackage.length() == 0 ? strConcat : fullPackage + JwtParser.SEPARATOR_CHAR + strConcat, true, cls.getClassLoader());
                Intrinsics.f(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
                RoomDatabase roomDatabase = (RoomDatabase) cls2.getDeclaredConstructor(null).newInstance(null);
                InvalidationTracker invalidationTracker = roomDatabase.e;
                LinkedHashMap linkedHashMap = roomDatabase.h;
                roomDatabase.d = roomDatabase.f(databaseConfiguration);
                Set setJ = roomDatabase.j();
                BitSet bitSet = new BitSet();
                Iterator it2 = setJ.iterator();
                while (true) {
                    int i = -1;
                    if (!it2.hasNext()) {
                        int size = arrayList3.size() - 1;
                        if (size >= 0) {
                            while (true) {
                                int i2 = size - 1;
                                if (!bitSet.get(size)) {
                                    throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                }
                                if (i2 < 0) {
                                    break;
                                }
                                size = i2;
                            }
                        }
                        Iterator it3 = roomDatabase.g(linkedHashMap).iterator();
                        while (true) {
                            boolean zContainsKey = false;
                            if (!it3.hasNext()) {
                                break;
                            }
                            Migration migration = (Migration) it3.next();
                            int i3 = migration.startVersion;
                            int i4 = migration.endVersion;
                            LinkedHashMap linkedHashMap2 = migrationContainer.f3720a;
                            if (linkedHashMap2.containsKey(Integer.valueOf(i3))) {
                                Map map = (Map) linkedHashMap2.get(Integer.valueOf(i3));
                                if (map == null) {
                                    map = EmptyMap.d;
                                }
                                zContainsKey = map.containsKey(Integer.valueOf(i4));
                            }
                            if (!zContainsKey) {
                                migrationContainer.a(migration);
                            }
                        }
                        if (((AutoClosingRoomOpenHelper) RoomDatabase.s(AutoClosingRoomOpenHelper.class, roomDatabase.h())) != null) {
                            throw null;
                        }
                        roomDatabase.h().setWriteAheadLoggingEnabled(databaseConfiguration.g == journalMode3);
                        roomDatabase.g = databaseConfiguration.e;
                        roomDatabase.b = databaseConfiguration.h;
                        roomDatabase.c = new TransactionExecutor(databaseConfiguration.i);
                        roomDatabase.f = databaseConfiguration.f;
                        Map mapK = roomDatabase.k();
                        BitSet bitSet2 = new BitSet();
                        for (Map.Entry entry : mapK.entrySet()) {
                            Class cls3 = (Class) entry.getKey();
                            for (Class cls4 : (List) entry.getValue()) {
                                int size2 = arrayList2.size() - 1;
                                if (size2 >= 0) {
                                    while (true) {
                                        int i5 = size2 - 1;
                                        if (cls4.isAssignableFrom(arrayList2.get(size2).getClass())) {
                                            bitSet2.set(size2);
                                            break;
                                        }
                                        if (i5 < 0) {
                                            break;
                                        }
                                        size2 = i5;
                                    }
                                } else {
                                    size2 = -1;
                                }
                                if (!(size2 >= 0)) {
                                    throw new IllegalArgumentException(("A required type converter (" + cls4 + ") for " + cls3.getCanonicalName() + " is missing in the database configuration.").toString());
                                }
                                roomDatabase.l.put(cls4, arrayList2.get(size2));
                            }
                        }
                        int size3 = arrayList2.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i6 = size3 - 1;
                                if (!bitSet2.get(size3)) {
                                    throw new IllegalArgumentException(androidx.camera.core.impl.b.n(arrayList2.get(size3), "Unexpected type converter ", ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."));
                                }
                                if (i6 < 0) {
                                    break;
                                }
                                size3 = i6;
                            }
                        }
                        return roomDatabase;
                    }
                    Class cls5 = (Class) it2.next();
                    int size4 = arrayList3.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i7 = size4 - 1;
                            if (cls5.isAssignableFrom(arrayList3.get(size4).getClass())) {
                                bitSet.set(size4);
                                i = size4;
                                break;
                            }
                            if (i7 < 0) {
                                break;
                            }
                            size4 = i7;
                        }
                    }
                    if (i < 0) {
                        throw new IllegalArgumentException(("A required auto migration spec (" + cls5.getCanonicalName() + ") is missing in the database configuration.").toString());
                    }
                    linkedHashMap.put(cls5, arrayList3.get(i));
                }
            } catch (ClassNotFoundException unused) {
                throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + strConcat + " does not exist");
            } catch (IllegalAccessException unused2) {
                throw new RuntimeException("Cannot access the constructor " + cls.getCanonicalName());
            } catch (InstantiationException unused3) {
                throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomDatabase$Callback;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Callback {
        public void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/RoomDatabase$Companion;", "", "", "MAX_BIND_PARAMETER_CNT", "I", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomDatabase$JournalMode;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class JournalMode {
        public static final JournalMode d;
        public static final JournalMode e;
        public static final JournalMode f;
        public static final /* synthetic */ JournalMode[] g;

        static {
            JournalMode journalMode = new JournalMode("AUTOMATIC", 0);
            d = journalMode;
            JournalMode journalMode2 = new JournalMode("TRUNCATE", 1);
            e = journalMode2;
            JournalMode journalMode3 = new JournalMode("WRITE_AHEAD_LOGGING", 2);
            f = journalMode3;
            g = new JournalMode[]{journalMode, journalMode2, journalMode3};
        }

        public static JournalMode valueOf(String str) {
            return (JournalMode) Enum.valueOf(JournalMode.class, str);
        }

        public static JournalMode[] values() {
            return (JournalMode[]) g.clone();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomDatabase$MigrationContainer;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static class MigrationContainer {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f3720a = new LinkedHashMap();

        public final void a(Migration... migrations) {
            Intrinsics.h(migrations, "migrations");
            for (Migration migration : migrations) {
                int i = migration.startVersion;
                int i2 = migration.endVersion;
                Integer numValueOf = Integer.valueOf(i);
                LinkedHashMap linkedHashMap = this.f3720a;
                Object treeMap = linkedHashMap.get(numValueOf);
                if (treeMap == null) {
                    treeMap = new TreeMap();
                    linkedHashMap.put(numValueOf, treeMap);
                }
                TreeMap treeMap2 = (TreeMap) treeMap;
                if (treeMap2.containsKey(Integer.valueOf(i2))) {
                    Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + migration);
                }
                treeMap2.put(Integer.valueOf(i2), migration);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class PrepackagedDatabaseCallback {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/room/RoomDatabase$QueryCallback;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface QueryCallback {
    }

    public RoomDatabase() {
        Map mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.g(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.k = mapSynchronizedMap;
        this.l = new LinkedHashMap();
    }

    public static Object s(Class cls, SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (cls.isInstance(supportSQLiteOpenHelper)) {
            return supportSQLiteOpenHelper;
        }
        if (supportSQLiteOpenHelper instanceof DelegatingOpenHelper) {
            return s(cls, ((DelegatingOpenHelper) supportSQLiteOpenHelper).getDelegate());
        }
        return null;
    }

    public final void a() {
        if (!this.f && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!h().getWritableDatabase().l2() && this.j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        SupportSQLiteDatabase writableDatabase = h().getWritableDatabase();
        this.e.g(writableDatabase);
        if (writableDatabase.r2()) {
            writableDatabase.W();
        } else {
            writableDatabase.N();
        }
    }

    public final SupportSQLiteStatement d(String sql) {
        Intrinsics.h(sql, "sql");
        a();
        b();
        return h().getWritableDatabase().S1(sql);
    }

    public abstract InvalidationTracker e();

    public abstract SupportSQLiteOpenHelper f(DatabaseConfiguration databaseConfiguration);

    public List g(Map autoMigrationSpecs) {
        Intrinsics.h(autoMigrationSpecs, "autoMigrationSpecs");
        return EmptyList.d;
    }

    public final SupportSQLiteOpenHelper h() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.d;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        Intrinsics.p("internalOpenHelper");
        throw null;
    }

    public final Executor i() {
        Executor executor = this.b;
        if (executor != null) {
            return executor;
        }
        Intrinsics.p("internalQueryExecutor");
        throw null;
    }

    public Set j() {
        return EmptySet.d;
    }

    public Map k() {
        return EmptyMap.d;
    }

    public final void l() {
        h().getWritableDatabase().v1();
        if (h().getWritableDatabase().l2()) {
            return;
        }
        InvalidationTracker invalidationTracker = this.e;
        if (invalidationTracker.f.compareAndSet(false, true)) {
            invalidationTracker.f3712a.i().execute(invalidationTracker.n);
        }
    }

    public final void m(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        InvalidationTracker invalidationTracker = this.e;
        invalidationTracker.getClass();
        synchronized (invalidationTracker.m) {
            if (invalidationTracker.g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            frameworkSQLiteDatabase.c1("PRAGMA temp_store = MEMORY;");
            frameworkSQLiteDatabase.c1("PRAGMA recursive_triggers='ON';");
            frameworkSQLiteDatabase.c1("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            invalidationTracker.g(frameworkSQLiteDatabase);
            invalidationTracker.h = frameworkSQLiteDatabase.S1("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            invalidationTracker.g = true;
        }
    }

    public final boolean n() {
        FrameworkSQLiteDatabase frameworkSQLiteDatabase = this.f3718a;
        return frameworkSQLiteDatabase != null && frameworkSQLiteDatabase.d.isOpen();
    }

    public final Cursor o(SupportSQLiteQuery query) {
        Intrinsics.h(query, "query");
        a();
        b();
        return h().getWritableDatabase().g0(query);
    }

    public final Object p(Callable callable) {
        c();
        try {
            Object objCall = callable.call();
            r();
            return objCall;
        } finally {
            l();
        }
    }

    public final void q(Runnable runnable) {
        c();
        try {
            runnable.run();
            r();
        } finally {
            l();
        }
    }

    public final void r() {
        h().getWritableDatabase().o1();
    }
}
