package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
class q7 extends h1<p7> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16649a = "templateData";

    public class a extends HashMap<String, String> {
        public a() {
            put("templatePath", "TEXT");
            put("templateUrl", "TEXT");
        }
    }

    /* loaded from: classes6.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final String f16651a = "templateUrl";
        private static final String b = "templatePath";

        private b() {
        }
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public boolean a(p7 p7Var) {
        String strConcat;
        boolean z = true;
        if (p7Var == null || TextUtils.isEmpty(p7Var.b())) {
            strConcat = "delete (invalid data) - ".concat(p7Var == null ? "record is null" : "templateUrl is not valid");
        } else {
            z = f1.a().getWritableDatabase().delete(d(), "templateUrl=?", new String[]{p7Var.b()}) > 0;
            z = !z;
            strConcat = "delete - " + p7Var;
        }
        a(z, strConcat);
        return z;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public long b() {
        try {
            return DatabaseUtils.queryNumEntries(f1.a().getWritableDatabase(), f16649a);
        } catch (Exception e) {
            a4.c(e.getMessage());
            return 0L;
        }
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public ArrayList<p7> c(Object... objArr) {
        ArrayList<p7> arrayList = new ArrayList<>();
        Cursor cursorQuery = f1.a().getReadableDatabase().query(d(), null, null, null, null, null, null);
        if (cursorQuery != null) {
            if (cursorQuery.moveToFirst()) {
                do {
                    arrayList.add(new p7(cursorQuery.getString(cursorQuery.getColumnIndex("templatePath")), cursorQuery.getString(cursorQuery.getColumnIndex("templateUrl"))));
                } while (cursorQuery.moveToNext());
            }
            cursorQuery.close();
        }
        return arrayList;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public p7 b(Object... objArr) {
        Object obj;
        Cursor cursorQuery;
        if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && (obj instanceof String) && (cursorQuery = f1.a().getReadableDatabase().query(d(), null, "templateUrl=?", new String[]{(String) obj}, null, null, null)) != null) {
            p7Var = cursorQuery.moveToFirst() ? new p7(cursorQuery.getString(cursorQuery.getColumnIndex("templatePath")), cursorQuery.getString(cursorQuery.getColumnIndex("templateUrl"))) : null;
            cursorQuery.close();
        }
        return p7Var;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public ContentValues b(p7 p7Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("templatePath", p7Var.a());
        contentValues.put("templateUrl", p7Var.b());
        return contentValues;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public HashMap<String, String> c() {
        return new a();
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public String d() {
        return f16649a;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public boolean a(Object... objArr) {
        Object obj;
        return objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && (obj instanceof String) && f1.a().getWritableDatabase().delete(d(), "templateUrl=?", new String[]{(String) obj}) > 0;
    }
}
