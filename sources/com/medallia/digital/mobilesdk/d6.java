package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d6 extends h1<g6> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16428a = "quarantineRules";

    public class a extends HashMap<String, String> {
        public a() {
            put("ruleId", "TEXT");
            put("expirationTime", "INTEGER");
            put("status", "INTEGER");
        }
    }

    /* loaded from: classes6.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16430a;

        static {
            int[] iArr = new int[d.values().length];
            f16430a = iArr;
            try {
                iArr[d.ASC_EXPIRATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private static final String f16431a = "ruleId";
        private static final String b = "expirationTime";
        private static final String c = "status";

        private c() {
        }
    }

    /* loaded from: classes6.dex */
    public enum d {
        ASC_EXPIRATION
    }

    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ContentValues b(g6 g6Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("ruleId", g6Var.f16501a);
        contentValues.put("expirationTime", g6Var.b);
        Boolean bool = g6Var.c;
        contentValues.put("status", Integer.valueOf((bool == null || !bool.booleanValue()) ? 0 : 1));
        return contentValues;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public long b() {
        try {
            return DatabaseUtils.queryNumEntries(f1.a().getWritableDatabase(), f16428a);
        } catch (Exception e) {
            a4.c(e.getMessage());
            return 0L;
        }
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public ArrayList<g6> c(Object... objArr) {
        ArrayList<g6> arrayList = new ArrayList<>();
        Cursor cursorQuery = f1.a().getReadableDatabase().query(d(), null, null, null, null, null, null);
        if (cursorQuery != null) {
            if (cursorQuery.moveToFirst()) {
                do {
                    arrayList.add(new g6(cursorQuery.getString(cursorQuery.getColumnIndex("ruleId")), Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndex("expirationTime"))), Boolean.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("status")) == 1)));
                } while (cursorQuery.moveToNext());
            }
            cursorQuery.close();
        }
        return arrayList;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public g6 b(Object... objArr) {
        Object obj;
        g6 g6Var = null;
        if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && (obj instanceof d)) {
            Cursor cursorQuery = b.f16430a[((d) obj).ordinal()] != 1 ? null : f1.a().getReadableDatabase().query(d(), null, null, null, null, null, "expirationTime ASC");
            if (cursorQuery != null) {
                if (cursorQuery.moveToFirst()) {
                    do {
                        g6Var = new g6(cursorQuery.getString(cursorQuery.getColumnIndex("ruleId")), Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndex("expirationTime"))), Boolean.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("status")) == 1));
                    } while (cursorQuery.moveToNext());
                }
                cursorQuery.close();
            }
        }
        return g6Var;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public boolean a(Object... objArr) {
        return false;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public HashMap<String, String> c() {
        return new a();
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public String d() {
        return f16428a;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean d(g6 g6Var) {
        return f1.a().getWritableDatabase().update(d(), b(g6Var), "ruleId=?", new String[]{g6Var.b()}) > 0 || super.c((d6) g6Var);
    }
}
