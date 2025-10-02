package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class SystemIdInfoDao_Impl implements SystemIdInfoDao {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f3984a;
    public final EntityInsertionAdapter b;
    public final SharedSQLiteStatement c;
    public final SharedSQLiteStatement d;

    /* renamed from: androidx.work.impl.model.SystemIdInfoDao_Impl$1, reason: invalid class name */
    class AnonymousClass1 extends EntityInsertionAdapter<SystemIdInfo> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            supportSQLiteStatement.z(1, ((SystemIdInfo) obj).f3983a);
            supportSQLiteStatement.C0(2, r5.b);
            supportSQLiteStatement.C0(3, r5.c);
        }
    }

    /* renamed from: androidx.work.impl.model.SystemIdInfoDao_Impl$2, reason: invalid class name */
    class AnonymousClass2 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    /* renamed from: androidx.work.impl.model.SystemIdInfoDao_Impl$3, reason: invalid class name */
    class AnonymousClass3 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public SystemIdInfoDao_Impl(WorkDatabase_Impl workDatabase_Impl) {
        this.f3984a = workDatabase_Impl;
        this.b = new AnonymousClass1(workDatabase_Impl);
        this.c = new AnonymousClass2(workDatabase_Impl);
        this.d = new AnonymousClass3(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public final void b(SystemIdInfo systemIdInfo) {
        WorkDatabase_Impl workDatabase_Impl = this.f3984a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.b.e(systemIdInfo);
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.l();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public final SystemIdInfo c(int i, String str) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        roomSQLiteQueryA.z(1, str);
        roomSQLiteQueryA.C0(2, i);
        WorkDatabase_Impl workDatabase_Impl = this.f3984a;
        workDatabase_Impl.b();
        Cursor cursorB = DBUtil.b(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            return cursorB.moveToFirst() ? new SystemIdInfo(cursorB.getString(CursorUtil.b(cursorB, "work_spec_id")), cursorB.getInt(CursorUtil.b(cursorB, "generation")), cursorB.getInt(CursorUtil.b(cursorB, "system_id"))) : null;
        } finally {
            cursorB.close();
            roomSQLiteQueryA.release();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public final ArrayList e() {
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = this.f3984a;
        workDatabase_Impl.b();
        Cursor cursorB = DBUtil.b(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            roomSQLiteQueryA.release();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public final void f(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f3984a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.c;
        SupportSQLiteStatement supportSQLiteStatementA = sharedSQLiteStatement.a();
        supportSQLiteStatementA.z(1, str);
        supportSQLiteStatementA.C0(2, i);
        try {
            workDatabase_Impl.c();
            try {
                supportSQLiteStatementA.P();
                workDatabase_Impl.r();
            } finally {
                workDatabase_Impl.l();
            }
        } finally {
            sharedSQLiteStatement.c(supportSQLiteStatementA);
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public final void g(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f3984a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.d;
        SupportSQLiteStatement supportSQLiteStatementA = sharedSQLiteStatement.a();
        supportSQLiteStatementA.z(1, str);
        try {
            workDatabase_Impl.c();
            try {
                supportSQLiteStatementA.P();
                workDatabase_Impl.r();
            } finally {
                workDatabase_Impl.l();
            }
        } finally {
            sharedSQLiteStatement.c(supportSQLiteStatementA);
        }
    }
}
