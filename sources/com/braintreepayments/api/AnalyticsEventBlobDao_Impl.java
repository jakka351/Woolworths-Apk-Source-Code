package com.braintreepayments.api;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AnalyticsEventBlobDao_Impl implements AnalyticsEventBlobDao {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f13695a;
    public final EntityInsertionAdapter b;
    public final EntityDeletionOrUpdateAdapter c;

    /* renamed from: com.braintreepayments.api.AnalyticsEventBlobDao_Impl$1, reason: invalid class name */
    class AnonymousClass1 extends EntityInsertionAdapter<AnalyticsEventBlob> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR ABORT INTO `analytics_event_blob` (`json_string`,`_id`) VALUES (?,nullif(?, 0))";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            AnalyticsEventBlob analyticsEventBlob = (AnalyticsEventBlob) obj;
            String str = analyticsEventBlob.f13694a;
            if (str == null) {
                supportSQLiteStatement.N0(1);
            } else {
                supportSQLiteStatement.z(1, str);
            }
            supportSQLiteStatement.C0(2, analyticsEventBlob.b);
        }
    }

    /* renamed from: com.braintreepayments.api.AnalyticsEventBlobDao_Impl$2, reason: invalid class name */
    class AnonymousClass2 extends EntityDeletionOrUpdateAdapter<AnalyticsEventBlob> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM `analytics_event_blob` WHERE `_id` = ?";
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            supportSQLiteStatement.C0(1, ((AnalyticsEventBlob) obj).b);
        }
    }

    public AnalyticsEventBlobDao_Impl(AnalyticsDatabase database) {
        this.f13695a = database;
        Intrinsics.h(database, "database");
        this.b = new AnonymousClass1(database);
        this.c = new AnonymousClass2(database);
    }

    @Override // com.braintreepayments.api.AnalyticsEventBlobDao
    public final void a(List list) {
        RoomDatabase roomDatabase = this.f13695a;
        roomDatabase.b();
        roomDatabase.c();
        try {
            EntityDeletionOrUpdateAdapter entityDeletionOrUpdateAdapter = this.c;
            entityDeletionOrUpdateAdapter.getClass();
            SupportSQLiteStatement supportSQLiteStatementA = entityDeletionOrUpdateAdapter.a();
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    entityDeletionOrUpdateAdapter.d(supportSQLiteStatementA, it.next());
                    supportSQLiteStatementA.P();
                }
                entityDeletionOrUpdateAdapter.c(supportSQLiteStatementA);
                roomDatabase.r();
            } catch (Throwable th) {
                entityDeletionOrUpdateAdapter.c(supportSQLiteStatementA);
                throw th;
            }
        } finally {
            roomDatabase.l();
        }
    }

    @Override // com.braintreepayments.api.AnalyticsEventBlobDao
    public final void b(AnalyticsEventBlob analyticsEventBlob) {
        RoomDatabase roomDatabase = this.f13695a;
        roomDatabase.b();
        roomDatabase.c();
        try {
            this.b.e(analyticsEventBlob);
            roomDatabase.r();
        } finally {
            roomDatabase.l();
        }
    }

    @Override // com.braintreepayments.api.AnalyticsEventBlobDao
    public final ArrayList c() {
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(0, "SELECT * FROM analytics_event_blob");
        RoomDatabase roomDatabase = this.f13695a;
        roomDatabase.b();
        Cursor cursorB = DBUtil.b(roomDatabase, roomSQLiteQueryA, false);
        try {
            int iB = CursorUtil.b(cursorB, "json_string");
            int iB2 = CursorUtil.b(cursorB, "_id");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(new AnalyticsEventBlob(cursorB.isNull(iB) ? null : cursorB.getString(iB), cursorB.getLong(iB2)));
            }
            return arrayList;
        } finally {
            cursorB.close();
            roomSQLiteQueryA.release();
        }
    }
}
