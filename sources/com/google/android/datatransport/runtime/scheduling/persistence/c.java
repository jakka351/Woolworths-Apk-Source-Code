package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements SQLiteEventStore.Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14492a;
    public final /* synthetic */ SQLiteEventStore b;
    public final /* synthetic */ TransportContext c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c(SQLiteEventStore sQLiteEventStore, Object obj, TransportContext transportContext, int i) {
        this.f14492a = i;
        this.b = sQLiteEventStore;
        this.d = obj;
        this.c = transportContext;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        int i = this.f14492a;
        int i2 = 0;
        int i3 = 1;
        TransportContext transportContext = this.c;
        Object obj2 = this.d;
        SQLiteEventStore sQLiteEventStore = this.b;
        switch (i) {
            case 0:
                EventInternal eventInternal = (EventInternal) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Encoding encoding = SQLiteEventStore.i;
                long jSimpleQueryForLong = sQLiteEventStore.e().compileStatement("PRAGMA page_size").simpleQueryForLong() * sQLiteEventStore.e().compileStatement("PRAGMA page_count").simpleQueryForLong();
                EventStoreConfig eventStoreConfig = sQLiteEventStore.g;
                if (jSimpleQueryForLong >= eventStoreConfig.e()) {
                    sQLiteEventStore.c(1L, LogEventDropped.Reason.CACHE_FULL, eventInternal.l());
                    return -1L;
                }
                Long lF = SQLiteEventStore.f(sQLiteDatabase, transportContext);
                if (lF != null) {
                    jInsert = lF.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", transportContext.b());
                    contentValues.put("priority", Integer.valueOf(PriorityMapping.a(transportContext.d())));
                    contentValues.put("next_request_ms", (Integer) 0);
                    if (transportContext.c() != null) {
                        contentValues.put("extras", Base64.encodeToString(transportContext.c(), 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int iD = eventStoreConfig.d();
                byte[] bArr = eventInternal.e().b;
                boolean z = bArr.length <= iD;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", eventInternal.l());
                contentValues2.put("timestamp_ms", Long.valueOf(eventInternal.f()));
                contentValues2.put("uptime_ms", Long.valueOf(eventInternal.m()));
                contentValues2.put("payload_encoding", eventInternal.e().f14439a.f14388a);
                contentValues2.put("code", eventInternal.d());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr : new byte[0]);
                contentValues2.put("product_id", eventInternal.j());
                contentValues2.put("pseudonymous_id", eventInternal.k());
                contentValues2.put("experiment_ids_clear_blob", eventInternal.g());
                contentValues2.put("experiment_ids_encrypted_blob", eventInternal.h());
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(bArr.length / iD);
                    for (int i4 = 1; i4 <= iCeil; i4++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (i4 - 1) * iD, Math.min(i4 * iD, bArr.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i4));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(eventInternal.c()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put(AppMeasurementSdk.ConditionalUserProperty.NAME, (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            default:
                ArrayList arrayList = (ArrayList) obj2;
                Cursor cursor2 = (Cursor) obj;
                Encoding encoding2 = SQLiteEventStore.i;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(i2);
                    int i5 = cursor2.getInt(7) != 0 ? i3 : i2;
                    EventInternal.Builder builderA = EventInternal.a();
                    builderA.k(cursor2.getString(i3));
                    builderA.f(cursor2.getLong(2));
                    builderA.l(cursor2.getLong(3));
                    if (i5 != 0) {
                        String string = cursor2.getString(4);
                        builderA.e(new EncodedPayload(string == null ? SQLiteEventStore.i : new Encoding(string), cursor2.getBlob(5)));
                    } else {
                        String string2 = cursor2.getString(4);
                        Encoding encoding3 = string2 == null ? SQLiteEventStore.i : new Encoding(string2);
                        Cursor cursorQuery = sQLiteEventStore.e().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            Encoding encoding4 = SQLiteEventStore.i;
                            ArrayList arrayList2 = new ArrayList();
                            int length = i2;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(i2);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr2 = new byte[length];
                            int length2 = i2;
                            int i6 = length2;
                            while (i6 < arrayList2.size()) {
                                byte[] bArr3 = (byte[]) arrayList2.get(i6);
                                int i7 = i6;
                                cursor = cursorQuery;
                                try {
                                    System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
                                    length2 += bArr3.length;
                                    i6 = i7 + 1;
                                    cursorQuery = cursor;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            cursorQuery.close();
                            builderA.e(new EncodedPayload(encoding3, bArr2));
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        builderA.d(Integer.valueOf(cursor2.getInt(6)));
                    }
                    if (!cursor2.isNull(8)) {
                        builderA.i(Integer.valueOf(cursor2.getInt(8)));
                    }
                    if (!cursor2.isNull(9)) {
                        builderA.j(cursor2.getString(9));
                    }
                    if (!cursor2.isNull(10)) {
                        builderA.g(cursor2.getBlob(10));
                    }
                    if (!cursor2.isNull(11)) {
                        builderA.h(cursor2.getBlob(11));
                    }
                    arrayList.add(new AutoValue_PersistedEvent(j, transportContext, builderA.b()));
                    i2 = 0;
                    i3 = 1;
                }
                return null;
        }
    }
}
