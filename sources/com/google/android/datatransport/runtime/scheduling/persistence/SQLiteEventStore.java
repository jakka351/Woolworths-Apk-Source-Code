package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.annotation.WorkerThread;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Provider;
import javax.inject.Singleton;

@Singleton
@WorkerThread
/* loaded from: classes.dex */
public class SQLiteEventStore implements EventStore, SynchronizationGuard, ClientHealthMetricsStore {
    public static final Encoding i = new Encoding("proto");
    public final SchemaManager d;
    public final Clock e;
    public final Clock f;
    public final EventStoreConfig g;
    public final Provider h;

    public interface Function<T, U> {
        Object apply(Object obj);
    }

    public static class Metadata {

        /* renamed from: a, reason: collision with root package name */
        public final String f14487a;
        public final String b;

        public Metadata(String str, String str2) {
            this.f14487a = str;
            this.b = str2;
        }
    }

    public interface Producer<T> {
    }

    public SQLiteEventStore(Clock clock, Clock clock2, EventStoreConfig eventStoreConfig, SchemaManager schemaManager, Provider provider) {
        this.d = schemaManager;
        this.e = clock;
        this.f = clock2;
        this.g = eventStoreConfig;
        this.h = provider;
    }

    public static Long f(SQLiteDatabase sQLiteDatabase, TransportContext transportContext) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(transportContext.b(), String.valueOf(PriorityMapping.a(transportContext.d()))));
        if (transportContext.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(transportContext.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String i(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((PersistedEvent) it.next()).b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object j(Cursor cursor, Function function) {
        try {
            return function.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final long D1(TransportContext transportContext) {
        Cursor cursorRawQuery = e().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{transportContext.b(), String.valueOf(PriorityMapping.a(transportContext.d()))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            return lValueOf.longValue();
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final boolean E1(TransportContext transportContext) {
        Boolean bool;
        SQLiteDatabase sQLiteDatabaseE = e();
        sQLiteDatabaseE.beginTransaction();
        try {
            Long lF = f(sQLiteDatabaseE, transportContext);
            if (lF == null) {
                bool = Boolean.FALSE;
            } else {
                Cursor cursorRawQuery = e().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lF.toString()});
                try {
                    Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                    cursorRawQuery.close();
                    bool = boolValueOf;
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
            sQLiteDatabaseE.setTransactionSuccessful();
            sQLiteDatabaseE.endTransaction();
            return bool.booleanValue();
        } catch (Throwable th2) {
            sQLiteDatabaseE.endTransaction();
            throw th2;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final void G1(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + i(iterable);
            SQLiteDatabase sQLiteDatabaseE = e();
            sQLiteDatabaseE.beginTransaction();
            try {
                sQLiteDatabaseE.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseE.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        c(cursorRawQuery.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseE.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseE.setTransactionSuccessful();
            } finally {
                sQLiteDatabaseE.endTransaction();
            }
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final Iterable T1(final TransportContext transportContext) {
        return (Iterable) g(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.d
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                SQLiteEventStore sQLiteEventStore = this.f14493a;
                EventStoreConfig eventStoreConfig = sQLiteEventStore.g;
                int iC = eventStoreConfig.c();
                TransportContext transportContext2 = transportContext;
                ArrayList arrayListH = sQLiteEventStore.h(sQLiteDatabase, transportContext2, iC);
                for (Priority priority : Priority.values()) {
                    if (priority != transportContext2.d()) {
                        int iC2 = eventStoreConfig.c() - arrayListH.size();
                        if (iC2 <= 0) {
                            break;
                        }
                        arrayListH.addAll(sQLiteEventStore.h(sQLiteDatabase, transportContext2.e(priority), iC2));
                    }
                }
                HashMap map = new HashMap();
                StringBuilder sb = new StringBuilder("event_id IN (");
                for (int i2 = 0; i2 < arrayListH.size(); i2++) {
                    sb.append(((PersistedEvent) arrayListH.get(i2)).b());
                    if (i2 < arrayListH.size() - 1) {
                        sb.append(',');
                    }
                }
                sb.append(')');
                SQLiteEventStore.j(sQLiteDatabase.query("event_metadata", new String[]{"event_id", AppMeasurementSdk.ConditionalUserProperty.NAME, "value"}, sb.toString(), null, null, null, null), new f(map, 1));
                ListIterator listIterator = arrayListH.listIterator();
                while (listIterator.hasNext()) {
                    PersistedEvent persistedEvent = (PersistedEvent) listIterator.next();
                    if (map.containsKey(Long.valueOf(persistedEvent.b()))) {
                        EventInternal.Builder builderN = persistedEvent.a().n();
                        for (SQLiteEventStore.Metadata metadata : (Set) map.get(Long.valueOf(persistedEvent.b()))) {
                            builderN.a(metadata.f14487a, metadata.b);
                        }
                        listIterator.set(new AutoValue_PersistedEvent(persistedEvent.b(), persistedEvent.c(), builderN.b()));
                    }
                }
                return arrayListH;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final void Z0(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            e().compileStatement("DELETE FROM events WHERE _id in " + i(iterable)).execute();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public final void a() {
        g(new f(this, 0));
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public final ClientMetrics b() {
        int i2 = ClientMetrics.e;
        final ClientMetrics.Builder builder = new ClientMetrics.Builder();
        final HashMap map = new HashMap();
        SQLiteDatabase sQLiteDatabaseE = e();
        sQLiteDatabaseE.beginTransaction();
        try {
            ClientMetrics clientMetrics = (ClientMetrics) j(sQLiteDatabaseE.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.h
                @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
                public final Object apply(Object obj) {
                    HashMap map2;
                    ClientMetrics.Builder builder2 = builder;
                    ArrayList arrayList = builder2.b;
                    Cursor cursor = (Cursor) obj;
                    Encoding encoding = SQLiteEventStore.i;
                    while (true) {
                        boolean zMoveToNext = cursor.moveToNext();
                        map2 = map;
                        if (!zMoveToNext) {
                            break;
                        }
                        String string = cursor.getString(0);
                        int i3 = cursor.getInt(1);
                        LogEventDropped.Reason reason = LogEventDropped.Reason.REASON_UNKNOWN;
                        if (i3 != 0) {
                            if (i3 == 1) {
                                reason = LogEventDropped.Reason.MESSAGE_TOO_OLD;
                            } else if (i3 == 2) {
                                reason = LogEventDropped.Reason.CACHE_FULL;
                            } else if (i3 == 3) {
                                reason = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
                            } else if (i3 == 4) {
                                reason = LogEventDropped.Reason.MAX_RETRIES_REACHED;
                            } else if (i3 == 5) {
                                reason = LogEventDropped.Reason.INVALID_PAYLOD;
                            } else if (i3 == 6) {
                                reason = LogEventDropped.Reason.SERVER_ERROR;
                            } else {
                                Logging.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i3));
                            }
                        }
                        long j = cursor.getLong(2);
                        if (!map2.containsKey(string)) {
                            map2.put(string, new ArrayList());
                        }
                        List list = (List) map2.get(string);
                        int i4 = LogEventDropped.c;
                        LogEventDropped.Builder builder3 = new LogEventDropped.Builder();
                        builder3.b = reason;
                        builder3.f14461a = j;
                        list.add(builder3.a());
                    }
                    for (Map.Entry entry : map2.entrySet()) {
                        int i5 = LogSourceMetrics.c;
                        LogSourceMetrics.Builder builder4 = new LogSourceMetrics.Builder();
                        builder4.f14463a = (String) entry.getKey();
                        builder4.b = (List) entry.getValue();
                        arrayList.add(builder4.a());
                    }
                    SQLiteEventStore sQLiteEventStore = this.f14497a;
                    final long jA = sQLiteEventStore.e.a();
                    builder2.f14458a = (TimeWindow) sQLiteEventStore.g(new SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.b
                        @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
                        public final Object apply(Object obj2) {
                            long j2 = jA;
                            Encoding encoding2 = SQLiteEventStore.i;
                            Cursor cursorRawQuery = ((SQLiteDatabase) obj2).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                            try {
                                Encoding encoding3 = SQLiteEventStore.i;
                                cursorRawQuery.moveToNext();
                                long j3 = cursorRawQuery.getLong(0);
                                TimeWindow.Builder builder5 = new TimeWindow.Builder();
                                builder5.f14466a = 0L;
                                builder5.b = 0L;
                                builder5.f14466a = j3;
                                builder5.b = j2;
                                return new TimeWindow(builder5.f14466a, builder5.b);
                            } finally {
                                cursorRawQuery.close();
                            }
                        }
                    });
                    builder2.c = new GlobalMetrics(new StorageMetrics(sQLiteEventStore.e().compileStatement("PRAGMA page_size").simpleQueryForLong() * sQLiteEventStore.e().compileStatement("PRAGMA page_count").simpleQueryForLong(), EventStoreConfig.f14482a.b));
                    builder2.d = (String) sQLiteEventStore.h.get();
                    return new ClientMetrics(builder2.f14458a, Collections.unmodifiableList(arrayList), builder2.c, builder2.d);
                }
            });
            sQLiteDatabaseE.setTransactionSuccessful();
            return clientMetrics;
        } finally {
            sQLiteDatabaseE.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public final void c(final long j, final LogEventDropped.Reason reason, final String str) {
        g(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.g
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) throws SQLException {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Encoding encoding = SQLiteEventStore.i;
                int i2 = reason.d;
                String string = Integer.toString(i2);
                String str2 = str;
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, string});
                try {
                    Encoding encoding2 = SQLiteEventStore.i;
                    boolean z = cursorRawQuery.getCount() > 0;
                    cursorRawQuery.close();
                    long j2 = j;
                    if (z) {
                        sQLiteDatabase.execSQL(androidx.camera.core.impl.b.l(j2, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str2, Integer.toString(i2)});
                        return null;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(i2));
                    contentValues.put("events_dropped_count", Long.valueOf(j2));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                    return null;
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard
    public final Object d(SynchronizationGuard.CriticalSection criticalSection) {
        SQLiteDatabase sQLiteDatabaseE = e();
        Clock clock = this.f;
        long jA = clock.a();
        while (true) {
            try {
                sQLiteDatabaseE.beginTransaction();
                try {
                    Object objExecute = criticalSection.execute();
                    sQLiteDatabaseE.setTransactionSuccessful();
                    return objExecute;
                } finally {
                    sQLiteDatabaseE.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (clock.a() >= this.g.a() + jA) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final SQLiteDatabase e() {
        SchemaManager schemaManager = this.d;
        Objects.requireNonNull(schemaManager);
        Clock clock = this.f;
        long jA = clock.a();
        while (true) {
            try {
                return schemaManager.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (clock.a() >= this.g.a() + jA) {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object g(Function function) {
        SQLiteDatabase sQLiteDatabaseE = e();
        sQLiteDatabaseE.beginTransaction();
        try {
            Object objApply = function.apply(sQLiteDatabaseE);
            sQLiteDatabaseE.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseE.endTransaction();
        }
    }

    public final ArrayList h(SQLiteDatabase sQLiteDatabase, TransportContext transportContext, int i2) {
        ArrayList arrayList = new ArrayList();
        Long lF = f(sQLiteDatabase, transportContext);
        if (lF == null) {
            return arrayList;
        }
        j(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lF.toString()}, null, null, null, String.valueOf(i2)), new c(this, arrayList, transportContext, 1));
        return arrayList;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final void h2(final long j, final TransportContext transportContext) {
        g(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.e
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Encoding encoding = SQLiteEventStore.i;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j));
                TransportContext transportContext2 = transportContext;
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{transportContext2.b(), String.valueOf(PriorityMapping.a(transportContext2.d()))}) < 1) {
                    contentValues.put("backend_name", transportContext2.b());
                    contentValues.put("priority", Integer.valueOf(PriorityMapping.a(transportContext2.d())));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final Iterable j1() {
        return (Iterable) g(new a(0));
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final int m() {
        long jA = this.e.a() - this.g.b();
        SQLiteDatabase sQLiteDatabaseE = e();
        sQLiteDatabaseE.beginTransaction();
        try {
            String[] strArr = {String.valueOf(jA)};
            Cursor cursorRawQuery = sQLiteDatabaseE.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
            while (cursorRawQuery.moveToNext()) {
                try {
                    c(cursorRawQuery.getInt(0), LogEventDropped.Reason.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
            cursorRawQuery.close();
            int iDelete = sQLiteDatabaseE.delete("events", "timestamp_ms < ?", strArr);
            sQLiteDatabaseE.setTransactionSuccessful();
            return iDelete;
        } finally {
            sQLiteDatabaseE.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final PersistedEvent n2(TransportContext transportContext, EventInternal eventInternal) {
        Logging.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", transportContext.d(), eventInternal.l(), transportContext.b());
        long jLongValue = ((Long) g(new c(this, eventInternal, transportContext, 0))).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return new AutoValue_PersistedEvent(jLongValue, transportContext, eventInternal);
    }
}
