package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
class u3 extends h1<t3> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16733a = "localNotificationData";
    static final String b = "getLNWithMinDelay";

    public class a extends HashMap<String, String> {
        public a() {
            put("title", "TEXT");
            put("body", "TEXT");
            put("appIconPath", "TEXT");
            put("expiration", "INTEGER");
            put("activityNameString", "TEXT");
            put("formId", "TEXT");
            put("delay", "INTEGER");
        }
    }

    /* loaded from: classes6.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final String f16735a = "title";
        private static final String b = "body";
        private static final String c = "appIconPath";
        private static final String d = "expiration";
        private static final String e = "activityNameString";
        private static final String f = "formId";
        private static final String g = "delay";

        private b() {
        }
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public boolean a(t3 t3Var) {
        String strConcat;
        boolean z = true;
        if (t3Var == null || TextUtils.isEmpty(t3Var.getFormId())) {
            strConcat = "delete (invalid data) - ".concat(t3Var == null ? "record is null" : "formId is not valid");
        } else {
            z = f1.a().getWritableDatabase().delete(d(), YU.a.o(new StringBuilder("formId='"), t3Var.getFormId(), "'"), null) > 0;
            z = !z;
            strConcat = "delete - " + t3Var;
        }
        a(z, strConcat);
        return z;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public long b() {
        try {
            return DatabaseUtils.queryNumEntries(f1.a().getWritableDatabase(), f16733a);
        } catch (Exception e) {
            a4.c(e.getMessage());
            return 0L;
        }
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public ArrayList<t3> c(Object... objArr) {
        SQLiteDatabase readableDatabase;
        String strD;
        String str;
        String str2;
        Object obj;
        ArrayList<t3> arrayList = new ArrayList<>();
        if (objArr == null || objArr.length <= 0 || (obj = objArr[0]) == null || !(obj instanceof String) || !obj.equals(b)) {
            readableDatabase = f1.a().getReadableDatabase();
            strD = d();
            str = null;
            str2 = null;
        } else {
            readableDatabase = f1.a().getReadableDatabase();
            strD = d();
            str = null;
            str2 = "delay ASC";
        }
        Cursor cursorQuery = readableDatabase.query(strD, null, null, null, null, str, str2);
        if (cursorQuery != null) {
            if (cursorQuery.moveToFirst()) {
                do {
                    arrayList.add(new t3(cursorQuery.getString(cursorQuery.getColumnIndex("formId")), cursorQuery.getString(cursorQuery.getColumnIndex("title")), cursorQuery.getString(cursorQuery.getColumnIndex("body")), cursorQuery.getString(cursorQuery.getColumnIndex("appIconPath")), cursorQuery.getLong(cursorQuery.getColumnIndex("expiration")), cursorQuery.getLong(cursorQuery.getColumnIndex("delay"))));
                } while (cursorQuery.moveToNext());
            }
            cursorQuery.close();
        }
        return arrayList;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public t3 b(Object... objArr) {
        Object obj;
        if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && (obj instanceof String)) {
            if (obj.equals(b)) {
                return f();
            }
            Cursor cursorQuery = f1.a().getReadableDatabase().query(d(), null, YU.a.h("formId='", (String) objArr[0], "'"), null, null, null, null);
            if (cursorQuery != null) {
                t3Var = cursorQuery.moveToFirst() ? new t3(cursorQuery.getString(cursorQuery.getColumnIndex("formId")), cursorQuery.getString(cursorQuery.getColumnIndex("title")), cursorQuery.getString(cursorQuery.getColumnIndex("body")), cursorQuery.getString(cursorQuery.getColumnIndex("appIconPath")), cursorQuery.getLong(cursorQuery.getColumnIndex("expiration")), cursorQuery.getLong(cursorQuery.getColumnIndex("delay"))) : null;
                cursorQuery.close();
            }
        }
        return t3Var;
    }

    public t3 f() {
        Cursor cursorQuery = f1.a().getReadableDatabase().query(d(), null, null, null, null, null, "delay ASC", "1");
        if (cursorQuery != null) {
            t3Var = cursorQuery.moveToFirst() ? new t3(cursorQuery.getString(cursorQuery.getColumnIndex("formId")), cursorQuery.getString(cursorQuery.getColumnIndex("title")), cursorQuery.getString(cursorQuery.getColumnIndex("body")), cursorQuery.getString(cursorQuery.getColumnIndex("appIconPath")), cursorQuery.getLong(cursorQuery.getColumnIndex("expiration")), cursorQuery.getLong(cursorQuery.getColumnIndex("delay"))) : null;
            cursorQuery.close();
        }
        return t3Var;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public ContentValues b(t3 t3Var) {
        ContentValues contentValues = new ContentValues();
        if (t3Var != null) {
            contentValues.put("title", t3Var.getTitle());
            contentValues.put("body", t3Var.b());
            contentValues.put("appIconPath", t3Var.a());
            contentValues.put("expiration", Long.valueOf(t3Var.d()));
            contentValues.put("formId", t3Var.getFormId());
            contentValues.put("delay", Long.valueOf(t3Var.c()));
        }
        return contentValues;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public HashMap<String, String> c() {
        return new a();
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public boolean c(t3 t3Var) {
        if (t3Var.getFormId() == null || t3Var.getTitle() == null || t3Var.getTitle().isEmpty() || t3Var.b() == null || t3Var.b().isEmpty()) {
            return false;
        }
        return super.c((u3) t3Var);
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public boolean a(Object... objArr) {
        return false;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public String d() {
        return f16733a;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public boolean d(t3 t3Var) {
        return f1.a().getWritableDatabase().update(d(), b(t3Var), YU.a.o(new StringBuilder("formId='"), t3Var.getFormId(), "'"), null) > 0 || super.c((u3) t3Var);
    }
}
