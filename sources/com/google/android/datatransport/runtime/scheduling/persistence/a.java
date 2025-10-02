package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements SQLiteEventStore.Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14490a;

    public /* synthetic */ a(int i) {
        this.f14490a = i;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        int i = 1;
        switch (this.f14490a) {
            case 0:
                Encoding encoding = SQLiteEventStore.i;
                return (List) SQLiteEventStore.j(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new a(i));
            default:
                Cursor cursor = (Cursor) obj;
                Encoding encoding2 = SQLiteEventStore.i;
                ArrayList arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    TransportContext.Builder builderA = TransportContext.a();
                    builderA.b(cursor.getString(1));
                    builderA.d(PriorityMapping.b(cursor.getInt(2)));
                    String string = cursor.getString(3);
                    builderA.c(string == null ? null : Base64.decode(string, 0));
                    arrayList.add(builderA.a());
                }
                return arrayList;
        }
    }
}
