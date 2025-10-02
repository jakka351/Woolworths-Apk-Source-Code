package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
class v8 extends h1<c0> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16750a = "userJourney";

    public class a extends HashMap<String, String> {
        public a() {
            put("sessionId", "TEXT");
            put(AppMeasurementSdk.ConditionalUserProperty.NAME, "TEXT");
            put("value", "TEXT");
            put("valueType", "TEXT");
            put("lifetime", "TEXT");
            put("timestamp", "INTEGER");
            put("groupType", "TEXT");
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16752a;

        static {
            int[] iArr = new int[d.values().length];
            f16752a = iArr;
            try {
                iArr[d.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16752a[d.ALL_DESC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16752a[d.SESSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16752a[d.EVENTS_SESSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16752a[d.DISTINCT_LATEST_NO_CP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16752a[d.DISTINCT_SESSION_COLLECTORS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16752a[d.CUSTOM_PARAMS_DESC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16752a[d.CUSTOM_PARAMS_SESSION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private static final String f16753a = "sessionId";
        private static final String b = "name";
        private static final String c = "value";
        private static final String d = "valueType";
        private static final String e = "lifetime";
        private static final String f = "timestamp";
        private static final String g = "groupType";

        private c() {
        }
    }

    public enum d {
        ALL,
        ALL_DESC,
        SESSION,
        EVENTS_SESSION,
        DISTINCT_LATEST_NO_CP,
        DISTINCT_SESSION_COLLECTORS,
        CUSTOM_PARAMS_DESC,
        CUSTOM_PARAMS_SESSION
    }

    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ContentValues b(c0 c0Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sessionId", c0Var.g());
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, c0Var.getName());
        contentValues.put("value", c0Var.i() == null ? null : c0Var.i().toString());
        contentValues.put("valueType", c0Var.j() == null ? null : c0Var.j().name());
        contentValues.put("timestamp", Long.valueOf(c0Var.h()));
        contentValues.put("lifetime", c0Var.f() == null ? null : c0Var.f().name());
        contentValues.put("groupType", c0Var.e() != null ? c0Var.e().name() : null);
        return contentValues;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public long b() {
        try {
            return DatabaseUtils.queryNumEntries(f1.a().getWritableDatabase(), f16750a);
        } catch (Exception e) {
            a4.c(e.getMessage());
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0122  */
    @Override // com.medallia.digital.mobilesdk.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<com.medallia.digital.mobilesdk.c0> c(java.lang.Object... r17) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.v8.c(java.lang.Object[]):java.util.ArrayList");
    }

    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public c0 b(Object... objArr) {
        return null;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public String e() {
        return "timestamp";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    @Override // com.medallia.digital.mobilesdk.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.Object... r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto Lb9
            int r1 = r9.length
            if (r1 != 0) goto L8
            goto Lb9
        L8:
            r1 = r9[r0]
            com.medallia.digital.mobilesdk.Lifetime r2 = com.medallia.digital.mobilesdk.Lifetime.Session
            boolean r3 = r1 instanceof com.medallia.digital.mobilesdk.Lifetime
            if (r3 == 0) goto L13
            com.medallia.digital.mobilesdk.Lifetime r1 = (com.medallia.digital.mobilesdk.Lifetime) r1
            goto L14
        L13:
            r1 = r2
        L14:
            com.medallia.digital.mobilesdk.Lifetime r3 = com.medallia.digital.mobilesdk.Lifetime.Forever
            r4 = 1
            if (r1 == r3) goto L71
            java.lang.String[] r3 = new java.lang.String[r4]
            java.lang.String r5 = r1.name()
            r3[r0] = r5
            int r5 = r9.length
            r6 = 2
            if (r5 <= r4) goto L3e
            r9 = r9[r4]
            boolean r5 = r9 instanceof com.medallia.digital.mobilesdk.GroupType
            if (r5 == 0) goto L3e
            com.medallia.digital.mobilesdk.GroupType r9 = (com.medallia.digital.mobilesdk.GroupType) r9
            java.lang.String[] r3 = new java.lang.String[r6]
            java.lang.String r5 = r1.name()
            r3[r0] = r5
            java.lang.String r9 = r9.name()
            r3[r4] = r9
            java.lang.String r9 = "lifetime=? AND groupType!=?"
            goto L40
        L3e:
            java.lang.String r9 = "lifetime=?"
        L40:
            com.medallia.digital.mobilesdk.Lifetime r5 = com.medallia.digital.mobilesdk.Lifetime.Application
            if (r1 != r5) goto L73
            java.lang.String r5 = " OR lifetime=?"
            java.lang.String r9 = YU.a.g(r9, r5)
            int r5 = r3.length
            if (r5 <= r4) goto L62
            r3 = r3[r4]
            r5 = 3
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.String r7 = r1.name()
            r5[r0] = r7
            r5[r4] = r3
            java.lang.String r2 = r2.name()
            r5[r6] = r2
            r3 = r5
            goto L73
        L62:
            java.lang.String[] r3 = new java.lang.String[r6]
            java.lang.String r5 = r1.name()
            r3[r0] = r5
            java.lang.String r2 = r2.name()
            r3[r4] = r2
            goto L73
        L71:
            r9 = 0
            r3 = r9
        L73:
            com.medallia.digital.mobilesdk.f1 r2 = com.medallia.digital.mobilesdk.f1.a()
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()
            java.lang.String r5 = r8.d()
            int r9 = r2.delete(r5, r9, r3)
            if (r9 <= 0) goto L86
            r0 = r4
        L86:
            if (r0 == 0) goto L9d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "Delete records by criterion "
            r9.<init>(r2)
            java.lang.String r2 = r1.name()
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.medallia.digital.mobilesdk.a4.e(r9)
        L9d:
            r9 = r0 ^ 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "delete by "
            r2.<init>(r3)
            java.lang.String r1 = r1.name()
            r2.append(r1)
            java.lang.String r1 = " criterion"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r8.a(r9, r1)
        Lb9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.v8.a(java.lang.Object[]):boolean");
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public String d() {
        return f16750a;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean c(c0 c0Var) {
        if (!TextUtils.isEmpty(c0Var.g()) && c0Var.h() > 0) {
            return super.c((v8) c0Var);
        }
        a(true, "insert (invalid data from event) - " + c0Var);
        return false;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public HashMap<String, String> c() {
        return new a();
    }

    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: c, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean d(c0 c0Var) {
        StringBuilder sb = new StringBuilder("name=?");
        ArrayList arrayList = new ArrayList();
        arrayList.add(c0Var.getName());
        if (c0Var instanceof n8) {
            sb.append(" AND value=?");
            n8 n8Var = (n8) c0Var;
            arrayList.add("Name: " + n8Var.n() + " Value: " + n8Var.m());
        }
        return f1.a().getWritableDatabase().update(d(), b(c0Var), sb.toString(), (String[]) arrayList.toArray(new String[0])) > 0 || super.c((v8) c0Var);
    }
}
