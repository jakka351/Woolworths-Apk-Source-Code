package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
class a9 extends h1<z8> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16377a = "workerManager";
    private static final int b = 7;

    public class a extends HashMap<String, String> {
        public a() {
            put("mediaCaptureClientCorrelationId", "TEXT");
            put("requestId", "TEXT");
        }
    }

    /* loaded from: classes6.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final String f16379a = "mediaCaptureClientCorrelationId";
        private static final String b = "requestId";

        private b() {
        }
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public boolean a(z8 z8Var) {
        return f1.a().getWritableDatabase().delete(d(), "mediaCaptureClientCorrelationId=?", new String[]{z8Var.a()}) > 0;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public long b() {
        try {
            return DatabaseUtils.queryNumEntries(f1.a().getWritableDatabase(), f16377a);
        } catch (Exception e) {
            a4.c(e.getMessage());
            return 0L;
        }
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public ArrayList<z8> c(Object... objArr) {
        ArrayList<z8> arrayList = new ArrayList<>();
        Cursor cursorQuery = f1.a().getReadableDatabase().query(d(), null, null, null, null, null, null);
        if (cursorQuery != null) {
            if (cursorQuery.moveToFirst()) {
                do {
                    arrayList.add(new z8(cursorQuery.getString(cursorQuery.getColumnIndex("mediaCaptureClientCorrelationId")), cursorQuery.getString(cursorQuery.getColumnIndex("requestId"))));
                } while (cursorQuery.moveToNext());
            }
            cursorQuery.close();
        }
        return arrayList;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public z8 b(Object... objArr) {
        return null;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public ContentValues b(z8 z8Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("mediaCaptureClientCorrelationId", z8Var.a());
        contentValues.put("requestId", z8Var.b());
        return contentValues;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public HashMap<String, String> c() {
        return new a();
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public String d() {
        return f16377a;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public boolean a(Object... objArr) {
        return false;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public boolean c(z8 z8Var) {
        if (c(new Object[0]).size() >= 7) {
            Cursor cursorQuery = f1.a().getReadableDatabase().query(d(), new String[]{"mediaCaptureClientCorrelationId"}, null, null, null, null, null);
            ArrayList arrayList = new ArrayList();
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                do {
                    arrayList.add(cursorQuery.getString(0));
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
            }
            for (int i = 0; i < arrayList.size(); i++) {
                f1.a().getWritableDatabase().delete(d(), "mediaCaptureClientCorrelationId=?", new String[]{(String) arrayList.get(i)});
            }
        }
        return super.c((a9) z8Var);
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public boolean d(z8 z8Var) {
        return f1.a().getWritableDatabase().update(d(), b(z8Var), "mediaCaptureClientCorrelationId=?", new String[]{z8Var.a()}) > 0 || c(z8Var);
    }
}
