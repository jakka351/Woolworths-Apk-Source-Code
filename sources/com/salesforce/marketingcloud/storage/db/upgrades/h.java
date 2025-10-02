package com.salesforce.marketingcloud.storage.db.upgrades;

import android.annotation.SuppressLint;

@SuppressLint
/* loaded from: classes6.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17059a = com.salesforce.marketingcloud.g.a("Version7ToVersion8");

    private h() {
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(@androidx.annotation.NonNull android.database.sqlite.SQLiteDatabase r9) throws android.database.SQLException {
        /*
            java.lang.String r0 = "DELETE FROM cloud_page_messages WHERE message_type=1"
            java.lang.String r1 = "id"
            r2 = 0
            r3 = 0
            java.lang.String r4 = "SELECT id,read,message_deleted FROM cloud_page_messages WHERE message_type=1"
            android.database.Cursor r4 = r9.rawQuery(r4, r2)     // Catch: java.lang.Exception -> L62
            if (r4 == 0) goto L9d
            boolean r5 = r4.moveToFirst()     // Catch: java.lang.Exception -> L62
            if (r5 == 0) goto L5d
        L14:
            r5 = 1
            java.lang.String r6 = "message_deleted"
            int r6 = r4.getColumnIndex(r6)     // Catch: java.lang.Exception -> L54
            int r6 = r4.getInt(r6)     // Catch: java.lang.Exception -> L54
            r7 = -1
            if (r6 != r5) goto L24
            r6 = 2
            goto L33
        L24:
            java.lang.String r6 = "read"
            int r6 = r4.getColumnIndex(r6)     // Catch: java.lang.Exception -> L54
            int r6 = r4.getInt(r6)     // Catch: java.lang.Exception -> L54
            if (r6 != r5) goto L32
            r6 = r5
            goto L33
        L32:
            r6 = r7
        L33:
            if (r6 == r7) goto L56
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch: java.lang.Exception -> L54
            r7.<init>()     // Catch: java.lang.Exception -> L54
            int r8 = r4.getColumnIndex(r1)     // Catch: java.lang.Exception -> L54
            java.lang.String r8 = r4.getString(r8)     // Catch: java.lang.Exception -> L54
            r7.put(r1, r8)     // Catch: java.lang.Exception -> L54
            java.lang.String r8 = "status"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L54
            r7.put(r8, r6)     // Catch: java.lang.Exception -> L54
            java.lang.String r6 = "inbox_message_status"
            r9.insert(r6, r2, r7)     // Catch: java.lang.Exception -> L54
            goto L56
        L54:
            r1 = move-exception
            goto L64
        L56:
            boolean r6 = r4.moveToNext()     // Catch: java.lang.Exception -> L54
            if (r6 != 0) goto L14
            goto L5e
        L5d:
            r5 = r3
        L5e:
            r4.close()     // Catch: java.lang.Exception -> L54
            goto L6d
        L62:
            r1 = move-exception
            r5 = r3
        L64:
            java.lang.String r4 = com.salesforce.marketingcloud.storage.db.upgrades.h.f17059a
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r7 = "Unable to set inbox message statuses for legacy messages"
            com.salesforce.marketingcloud.g.b(r4, r1, r7, r6)
        L6d:
            if (r5 == 0) goto L9d
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Exception -> L85
            r1.<init>()     // Catch: java.lang.Exception -> L85
            java.lang.String r4 = "message_type"
            r5 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L85
            r1.put(r4, r5)     // Catch: java.lang.Exception -> L85
            java.lang.String r4 = "cloud_page_messages"
            r9.update(r4, r1, r2, r2)     // Catch: java.lang.Exception -> L85
            goto L9d
        L85:
            r1 = move-exception
            java.lang.String r4 = com.salesforce.marketingcloud.storage.db.upgrades.h.f17059a
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = "Unable to update message_type for legacy Inbox messages.  Attempting to delete them."
            com.salesforce.marketingcloud.g.b(r4, r1, r6, r5)
            r9.execSQL(r0, r2)     // Catch: java.lang.Exception -> L93
            goto L9d
        L93:
            r1 = move-exception
            java.lang.String r4 = com.salesforce.marketingcloud.storage.db.upgrades.h.f17059a
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = "Unable to delete legacy Inbox messages."
            com.salesforce.marketingcloud.g.b(r4, r1, r6, r5)
        L9d:
            r9.execSQL(r0, r2)     // Catch: java.lang.Exception -> La1
            goto Lab
        La1:
            r9 = move-exception
            java.lang.String r0 = com.salesforce.marketingcloud.storage.db.upgrades.h.f17059a
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "Final attempt to delete legacy Inbox messages failed."
            com.salesforce.marketingcloud.g.b(r0, r9, r2, r1)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.storage.db.upgrades.h.a(android.database.sqlite.SQLiteDatabase):void");
    }
}
