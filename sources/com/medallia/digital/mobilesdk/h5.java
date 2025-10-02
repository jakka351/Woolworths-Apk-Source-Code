package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import java.util.HashMap;

/* loaded from: classes.dex */
class h5 extends h1<e5> {

    /* renamed from: a, reason: collision with root package name */
    private static final int f16508a = 7;
    private static final int b = 3;
    private static final String c = "mediaFeedbacks";

    public class a extends HashMap<String, String> {
        public a() {
            put("mediaCaptureClientCorrelationId", "TEXT");
            put("feedbackClientCorrelationId", "TEXT");
            put("formId", "TEXT");
            put("formName", "TEXT");
            put("submittedTimestamp", "INTEGER");
            put("mediaPath", "TEXT");
            put("mediaType", "TEXT");
            put("ecId", "TEXT");
            put("numberOfRetries", "INTEGER");
        }
    }

    /* loaded from: classes6.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16510a;

        static {
            int[] iArr = new int[d.values().length];
            f16510a = iArr;
            try {
                iArr[d.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16510a[d.AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private static final String f16511a = "mediaCaptureClientCorrelationId";
        private static final String b = "feedbackClientCorrelationId";
        private static final String c = "formId";
        private static final String d = "formName";
        private static final String e = "submittedTimestamp";
        private static final String f = "mediaPath";
        private static final String g = "mediaType";
        private static final String h = "ecId";
        private static final String i = "numberOfRetries";

        private c() {
        }
    }

    /* loaded from: classes6.dex */
    public enum d {
        VIDEO,
        AUDIO
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public boolean a(e5 e5Var) {
        return f1.a().getWritableDatabase().delete(d(), "mediaCaptureClientCorrelationId=?", new String[]{e5Var.d()}) > 0;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public long b() {
        try {
            return DatabaseUtils.queryNumEntries(f1.a().getWritableDatabase(), c);
        } catch (Exception e) {
            a4.c(e.getMessage());
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    @Override // com.medallia.digital.mobilesdk.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<com.medallia.digital.mobilesdk.e5> c(java.lang.Object... r14) {
        /*
            r13 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r14 == 0) goto L50
            int r1 = r14.length
            if (r1 <= 0) goto L50
            r1 = 0
            r14 = r14[r1]
            boolean r1 = r14 instanceof com.medallia.digital.mobilesdk.h5.d
            if (r1 == 0) goto L4e
            com.medallia.digital.mobilesdk.h5$d r14 = (com.medallia.digital.mobilesdk.h5.d) r14
            int[] r1 = com.medallia.digital.mobilesdk.h5.b.f16510a
            int r14 = r14.ordinal()
            r14 = r1[r14]
            r1 = 1
            if (r14 == r1) goto L3b
            r1 = 2
            if (r14 == r1) goto L22
            goto L4e
        L22:
            com.medallia.digital.mobilesdk.f1 r14 = com.medallia.digital.mobilesdk.f1.a()
            android.database.sqlite.SQLiteDatabase r1 = r14.getReadableDatabase()
            java.lang.String r2 = r13.d()
            r7 = 0
            java.lang.String r8 = "submittedTimestamp DESC"
            r3 = 0
            java.lang.String r4 = "mediaType='audio/wav'"
        L34:
            r5 = 0
            r6 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)
            goto L62
        L3b:
            com.medallia.digital.mobilesdk.f1 r14 = com.medallia.digital.mobilesdk.f1.a()
            android.database.sqlite.SQLiteDatabase r1 = r14.getReadableDatabase()
            java.lang.String r2 = r13.d()
            r7 = 0
            java.lang.String r8 = "submittedTimestamp DESC"
            r3 = 0
            java.lang.String r4 = "mediaType='video/mp4'"
            goto L34
        L4e:
            r14 = 0
            goto L62
        L50:
            com.medallia.digital.mobilesdk.f1 r14 = com.medallia.digital.mobilesdk.f1.a()
            android.database.sqlite.SQLiteDatabase r1 = r14.getReadableDatabase()
            java.lang.String r2 = r13.d()
            r7 = 0
            java.lang.String r8 = "submittedTimestamp DESC"
            r3 = 0
            r4 = 0
            goto L34
        L62:
            if (r14 == 0) goto Ld5
            boolean r1 = r14.moveToFirst()
            if (r1 == 0) goto Ld2
        L6a:
            com.medallia.digital.mobilesdk.e5 r2 = new com.medallia.digital.mobilesdk.e5
            java.lang.String r1 = "mediaCaptureClientCorrelationId"
            int r1 = r14.getColumnIndex(r1)
            java.lang.String r3 = r14.getString(r1)
            java.lang.String r1 = "feedbackClientCorrelationId"
            int r1 = r14.getColumnIndex(r1)
            java.lang.String r4 = r14.getString(r1)
            java.lang.String r1 = "mediaPath"
            int r1 = r14.getColumnIndex(r1)
            java.lang.String r5 = r14.getString(r1)
            java.lang.String r1 = "formId"
            int r1 = r14.getColumnIndex(r1)
            java.lang.String r6 = r14.getString(r1)
            java.lang.String r1 = "formName"
            int r1 = r14.getColumnIndex(r1)
            java.lang.String r7 = r14.getString(r1)
            java.lang.String r1 = "mediaType"
            int r1 = r14.getColumnIndex(r1)
            java.lang.String r8 = r14.getString(r1)
            java.lang.String r1 = "submittedTimestamp"
            int r1 = r14.getColumnIndex(r1)
            long r9 = r14.getLong(r1)
            java.lang.String r1 = "ecId"
            int r1 = r14.getColumnIndex(r1)
            java.lang.String r11 = r14.getString(r1)
            java.lang.String r1 = "numberOfRetries"
            int r1 = r14.getColumnIndex(r1)
            int r12 = r14.getInt(r1)
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r12)
            r0.add(r2)
            boolean r1 = r14.moveToNext()
            if (r1 != 0) goto L6a
        Ld2:
            r14.close()
        Ld5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.h5.c(java.lang.Object[]):java.util.ArrayList");
    }

    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e5 b(Object... objArr) {
        return null;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public ContentValues b(e5 e5Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("mediaCaptureClientCorrelationId", e5Var.d());
        contentValues.put("feedbackClientCorrelationId", e5Var.b());
        contentValues.put("formId", e5Var.getFormId());
        contentValues.put("formName", e5Var.c());
        contentValues.put("submittedTimestamp", Long.valueOf(e5Var.h()));
        contentValues.put("mediaPath", e5Var.e());
        contentValues.put("mediaType", e5Var.f());
        contentValues.put("ecId", e5Var.a());
        contentValues.put("numberOfRetries", Integer.valueOf(e5Var.g()));
        return contentValues;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public HashMap<String, String> c() {
        return new a();
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public String d() {
        return c;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public boolean a(Object... objArr) {
        Object obj;
        return objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && (obj instanceof Long) && f1.a().getWritableDatabase().delete(d(), "submittedTimestamp<=?", new String[]{String.valueOf(objArr[0])}) > 0;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public boolean c(e5 e5Var) {
        Cursor cursorQuery;
        String string;
        int size = c(new Object[0]).size();
        int size2 = c(d.VIDEO).size();
        String strD = j5.d(e5Var.f());
        if (size2 >= 3 && strD != null && (strD.equals("video") || strD.equals("upload"))) {
            cursorQuery = f1.a().getReadableDatabase().query(d(), new String[]{"mediaCaptureClientCorrelationId", "submittedTimestamp", "mediaPath"}, "mediaType='video/mp4'", null, null, null, "submittedTimestamp ASC ");
            if (cursorQuery != null && cursorQuery.getColumnName(0) != null && cursorQuery.getColumnName(1) != null && cursorQuery.getColumnName(2) != null && cursorQuery.moveToFirst()) {
                if (Long.parseLong(cursorQuery.getString(1)) > e5Var.h()) {
                    return false;
                }
                f1.a().getWritableDatabase().delete(d(), "mediaCaptureClientCorrelationId=?", new String[]{cursorQuery.getString(0)});
                string = cursorQuery.getColumnName(2);
                g2.c(string);
                cursorQuery.close();
            }
        } else if (size >= 7 && (cursorQuery = f1.a().getReadableDatabase().query(d(), new String[]{"mediaCaptureClientCorrelationId", "submittedTimestamp", "mediaPath"}, null, null, null, null, "submittedTimestamp ASC ")) != null && cursorQuery.moveToFirst() && cursorQuery.getColumnName(0) != null && cursorQuery.getColumnName(1) != null && cursorQuery.getColumnName(2) != null) {
            if (Long.parseLong(cursorQuery.getString(1)) > e5Var.h()) {
                return false;
            }
            f1.a().getWritableDatabase().delete(d(), "mediaCaptureClientCorrelationId=?", new String[]{cursorQuery.getString(0)});
            string = cursorQuery.getString(2);
            g2.c(string);
            cursorQuery.close();
        }
        return super.c((h5) e5Var);
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public boolean d(e5 e5Var) {
        return f1.a().getWritableDatabase().update(d(), b(e5Var), "mediaCaptureClientCorrelationId=?", new String[]{e5Var.d()}) > 0 || c(e5Var);
    }
}
