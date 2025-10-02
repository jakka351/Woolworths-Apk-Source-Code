package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements SQLiteEventStore.Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14495a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i) {
        this.f14495a = i;
        this.b = obj;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        int i = this.f14495a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Encoding encoding = SQLiteEventStore.i;
                sQLiteEventStore.getClass();
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + sQLiteEventStore.e.a()).execute();
                break;
            default:
                HashMap map = (HashMap) obj2;
                Cursor cursor = (Cursor) obj;
                Encoding encoding2 = SQLiteEventStore.i;
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(0);
                    Set hashSet = (Set) map.get(Long.valueOf(j));
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(Long.valueOf(j), hashSet);
                    }
                    hashSet.add(new SQLiteEventStore.Metadata(cursor.getString(1), cursor.getString(2)));
                }
                break;
        }
        return null;
    }
}
