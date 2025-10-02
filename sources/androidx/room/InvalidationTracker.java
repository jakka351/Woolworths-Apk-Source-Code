package androidx.room;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.room.InvalidationTracker;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/room/InvalidationTracker;", "", "Companion", "ObservedTableTracker", "Observer", "ObserverWrapper", "WeakObserver", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class InvalidationTracker {
    public static final String[] o = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f3712a;
    public final HashMap b;
    public final HashMap c;
    public final String[] e;
    public volatile boolean g;
    public volatile SupportSQLiteStatement h;
    public final ObservedTableTracker i;
    public final InvalidationLiveDataContainer j;
    public final InvalidationTracker$refreshRunnable$1 n;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final SafeIterableMap k = new SafeIterableMap();
    public final Object l = new Object();
    public final Object m = new Object();
    public final LinkedHashMap d = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Landroidx/room/InvalidationTracker$Companion;", "", "", "CREATE_TRACKING_TABLE_SQL", "Ljava/lang/String;", "INVALIDATED_COLUMN_NAME", "TABLE_ID_COLUMN_NAME", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static String a(String tableName, String triggerType) {
            Intrinsics.h(tableName, "tableName");
            Intrinsics.h(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/InvalidationTracker$ObservedTableTracker;", "", "Companion", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class ObservedTableTracker {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f3713a;
        public final boolean[] b;
        public final int[] c;
        public boolean d;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/room/InvalidationTracker$ObservedTableTracker$Companion;", "", "", "ADD", "I", "NO_OP", "REMOVE", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
        }

        public ObservedTableTracker(int i) {
            this.f3713a = new long[i];
            this.b = new boolean[i];
            this.c = new int[i];
        }

        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.d) {
                        return null;
                    }
                    long[] jArr = this.f3713a;
                    int length = jArr.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        int i3 = i2 + 1;
                        int i4 = 1;
                        boolean z = jArr[i] > 0;
                        boolean[] zArr = this.b;
                        if (z != zArr[i2]) {
                            int[] iArr = this.c;
                            if (!z) {
                                i4 = 2;
                            }
                            iArr[i2] = i4;
                        } else {
                            this.c[i2] = 0;
                        }
                        zArr[i2] = z;
                        i++;
                        i2 = i3;
                    }
                    this.d = false;
                    return (int[]) this.c.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/InvalidationTracker$Observer;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static abstract class Observer {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f3714a;

        public Observer(String[] tables) {
            Intrinsics.h(tables, "tables");
            this.f3714a = tables;
        }

        public abstract void a(Set set);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/InvalidationTracker$ObserverWrapper;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class ObserverWrapper {

        /* renamed from: a, reason: collision with root package name */
        public final Observer f3715a;
        public final int[] b;
        public final String[] c;
        public final Set d;

        public ObserverWrapper(Observer observer, int[] iArr, String[] strArr) {
            this.f3715a = observer;
            this.b = iArr;
            this.c = strArr;
            this.d = strArr.length == 0 ? EmptySet.d : SetsKt.i(strArr[0]);
            if (iArr.length != strArr.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        public final void a(Set invalidatedTablesIds) {
            Intrinsics.h(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.b;
            int length = iArr.length;
            Set setA = EmptySet.d;
            if (length != 0) {
                int i = 0;
                if (length != 1) {
                    SetBuilder setBuilder = new SetBuilder();
                    int length2 = iArr.length;
                    int i2 = 0;
                    while (i < length2) {
                        int i3 = i2 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr[i]))) {
                            setBuilder.add(this.c[i2]);
                        }
                        i++;
                        i2 = i3;
                    }
                    setA = SetsKt.a(setBuilder);
                } else if (invalidatedTablesIds.contains(Integer.valueOf(iArr[0]))) {
                    setA = this.d;
                }
            }
            if (setA.isEmpty()) {
                return;
            }
            this.f3715a.a(setA);
        }

        public final void b(String[] strArr) {
            String[] strArr2 = this.c;
            int length = strArr2.length;
            Set setA = EmptySet.d;
            if (length != 0) {
                if (length != 1) {
                    SetBuilder setBuilder = new SetBuilder();
                    for (String str : strArr) {
                        for (String str2 : strArr2) {
                            if (StringsKt.y(str2, str, true)) {
                                setBuilder.add(str2);
                            }
                        }
                    }
                    setA = SetsKt.a(setBuilder);
                } else {
                    int length2 = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length2) {
                            break;
                        }
                        if (StringsKt.y(strArr[i], strArr2[0], true)) {
                            setA = this.d;
                            break;
                        }
                        i++;
                    }
                }
            }
            if (setA.isEmpty()) {
                return;
            }
            this.f3715a.a(setA);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/InvalidationTracker$WeakObserver;", "Landroidx/room/InvalidationTracker$Observer;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WeakObserver extends Observer {
        public final InvalidationTracker b;
        public final WeakReference c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WeakObserver(InvalidationTracker tracker, Observer delegate) {
            super(delegate.f3714a);
            Intrinsics.h(tracker, "tracker");
            Intrinsics.h(delegate, "delegate");
            this.b = tracker;
            this.c = new WeakReference(delegate);
        }

        @Override // androidx.room.InvalidationTracker.Observer
        public final void a(Set tables) {
            Intrinsics.h(tables, "tables");
            Observer observer = (Observer) this.c.get();
            if (observer == null) {
                this.b.c(this);
            } else {
                observer.a(tables);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.room.InvalidationTracker$refreshRunnable$1] */
    public InvalidationTracker(RoomDatabase roomDatabase, HashMap map, HashMap map2, String... strArr) {
        String lowerCase;
        this.f3712a = roomDatabase;
        this.b = map;
        this.c = map2;
        this.i = new ObservedTableTracker(strArr.length);
        this.j = new InvalidationLiveDataContainer(roomDatabase);
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String strM = androidx.constraintlayout.core.state.a.m(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
            this.d.put(strM, Integer.valueOf(i));
            String str2 = (String) this.b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                Intrinsics.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                strM = lowerCase;
            }
            strArr2[i] = strM;
        }
        this.e = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String strM2 = androidx.constraintlayout.core.state.a.m(locale2, "US", str3, locale2, "this as java.lang.String).toLowerCase(locale)");
            if (this.d.containsKey(strM2)) {
                String lowerCase2 = ((String) entry.getKey()).toLowerCase(locale2);
                Intrinsics.g(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.d;
                linkedHashMap.put(lowerCase2, MapsKt.e(strM2, linkedHashMap));
            }
        }
        this.n = new Runnable() { // from class: androidx.room.InvalidationTracker$refreshRunnable$1
            public final SetBuilder a() throws IOException {
                InvalidationTracker invalidationTracker = this.d;
                SetBuilder setBuilder = new SetBuilder();
                Cursor cursorO = invalidationTracker.f3712a.o(new SimpleSQLiteQuery("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
                while (cursorO.moveToNext()) {
                    try {
                        setBuilder.add(Integer.valueOf(cursorO.getInt(0)));
                    } finally {
                    }
                }
                cursorO.close();
                SetBuilder setBuilderA = SetsKt.a(setBuilder);
                if (setBuilderA.d.isEmpty()) {
                    return setBuilderA;
                }
                if (this.d.h == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                SupportSQLiteStatement supportSQLiteStatement = this.d.h;
                if (supportSQLiteStatement == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                supportSQLiteStatement.P();
                return setBuilderA;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Set setA;
                ReentrantReadWriteLock.ReadLock lock = this.d.f3712a.i.readLock();
                Intrinsics.g(lock, "readWriteLock.readLock()");
                lock.lock();
                try {
                    try {
                        try {
                        } catch (IllegalStateException e) {
                            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                            setA = EmptySet.d;
                        }
                    } catch (SQLiteException e2) {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                        setA = EmptySet.d;
                    }
                    if (this.d.b()) {
                        if (this.d.f.compareAndSet(true, false)) {
                            if (this.d.f3712a.h().getWritableDatabase().l2()) {
                                return;
                            }
                            SupportSQLiteDatabase writableDatabase = this.d.f3712a.h().getWritableDatabase();
                            writableDatabase.W();
                            try {
                                setA = a();
                                writableDatabase.o1();
                                if (setA.isEmpty()) {
                                    return;
                                }
                                InvalidationTracker invalidationTracker = this.d;
                                synchronized (invalidationTracker.k) {
                                    Iterator it = invalidationTracker.k.iterator();
                                    while (it.hasNext()) {
                                        ((InvalidationTracker.ObserverWrapper) ((Map.Entry) it.next()).getValue()).a(setA);
                                    }
                                }
                            } finally {
                                writableDatabase.v1();
                            }
                        }
                    }
                } finally {
                    lock.unlock();
                }
            }
        };
    }

    public final void a(Observer observer) {
        ObserverWrapper observerWrapper;
        boolean z;
        String[] strArrD = d(observer.f3714a);
        ArrayList arrayList = new ArrayList(strArrD.length);
        for (String str : strArrD) {
            LinkedHashMap linkedHashMap = this.d;
            Locale locale = Locale.US;
            Integer num = (Integer) linkedHashMap.get(androidx.constraintlayout.core.state.a.m(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)"));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str));
            }
            arrayList.add(num);
        }
        int[] iArrF0 = CollectionsKt.F0(arrayList);
        ObserverWrapper observerWrapper2 = new ObserverWrapper(observer, iArrF0, strArrD);
        synchronized (this.k) {
            observerWrapper = (ObserverWrapper) this.k.d(observer, observerWrapper2);
        }
        if (observerWrapper == null) {
            ObservedTableTracker observedTableTracker = this.i;
            int[] tableIds = Arrays.copyOf(iArrF0, iArrF0.length);
            observedTableTracker.getClass();
            Intrinsics.h(tableIds, "tableIds");
            synchronized (observedTableTracker) {
                z = false;
                for (int i : tableIds) {
                    long[] jArr = observedTableTracker.f3713a;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        z = true;
                        observedTableTracker.d = true;
                    }
                }
            }
            if (z) {
                f();
            }
        }
    }

    public final boolean b() {
        if (!this.f3712a.n()) {
            return false;
        }
        if (!this.g) {
            this.f3712a.h().getWritableDatabase();
        }
        if (this.g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void c(Observer observer) {
        ObserverWrapper observerWrapper;
        boolean z;
        synchronized (this.k) {
            observerWrapper = (ObserverWrapper) this.k.g(observer);
        }
        if (observerWrapper != null) {
            ObservedTableTracker observedTableTracker = this.i;
            int[] iArr = observerWrapper.b;
            int[] tableIds = Arrays.copyOf(iArr, iArr.length);
            observedTableTracker.getClass();
            Intrinsics.h(tableIds, "tableIds");
            synchronized (observedTableTracker) {
                z = false;
                for (int i : tableIds) {
                    long[] jArr = observedTableTracker.f3713a;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        z = true;
                        observedTableTracker.d = true;
                    }
                }
            }
            if (z) {
                f();
            }
        }
    }

    public final String[] d(String[] strArr) {
        SetBuilder setBuilder = new SetBuilder();
        for (String str : strArr) {
            Locale locale = Locale.US;
            String strM = androidx.constraintlayout.core.state.a.m(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
            HashMap map = this.c;
            if (map.containsKey(strM)) {
                String lowerCase = str.toLowerCase(locale);
                Intrinsics.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map.get(lowerCase);
                Intrinsics.e(obj);
                setBuilder.addAll((Collection) obj);
            } else {
                setBuilder.add(str);
            }
        }
        return (String[]) SetsKt.a(setBuilder).toArray(new String[0]);
    }

    public final void e(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        supportSQLiteDatabase.c1("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.e[i];
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = o[i2];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + Companion.a(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            Intrinsics.g(str3, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase.c1(str3);
        }
    }

    public final void f() {
        RoomDatabase roomDatabase = this.f3712a;
        if (roomDatabase.n()) {
            g(roomDatabase.h().getWritableDatabase());
        }
    }

    public final void g(SupportSQLiteDatabase database) {
        Intrinsics.h(database, "database");
        if (database.l2()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.f3712a.i.readLock();
            Intrinsics.g(lock, "readWriteLock.readLock()");
            lock.lock();
            try {
                synchronized (this.l) {
                    int[] iArrA = this.i.a();
                    if (iArrA != null) {
                        if (database.r2()) {
                            database.W();
                        } else {
                            database.N();
                        }
                        try {
                            int length = iArrA.length;
                            int i = 0;
                            int i2 = 0;
                            while (i < length) {
                                int i3 = iArrA[i];
                                int i4 = i2 + 1;
                                if (i3 == 1) {
                                    e(database, i2);
                                } else if (i3 == 2) {
                                    String str = this.e[i2];
                                    String[] strArr = o;
                                    for (int i5 = 0; i5 < 3; i5++) {
                                        String str2 = "DROP TRIGGER IF EXISTS " + Companion.a(str, strArr[i5]);
                                        Intrinsics.g(str2, "StringBuilder().apply(builderAction).toString()");
                                        database.c1(str2);
                                    }
                                }
                                i++;
                                i2 = i4;
                            }
                            database.o1();
                            database.v1();
                        } catch (Throwable th) {
                            database.v1();
                            throw th;
                        }
                    }
                }
            } finally {
                lock.unlock();
            }
        } catch (SQLiteException e) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
        } catch (IllegalStateException e2) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
        }
    }
}
