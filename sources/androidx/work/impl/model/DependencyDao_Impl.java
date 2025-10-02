package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class DependencyDao_Impl implements DependencyDao {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f3980a;
    public final EntityInsertionAdapter b;

    /* renamed from: androidx.work.impl.model.DependencyDao_Impl$1, reason: invalid class name */
    class AnonymousClass1 extends EntityInsertionAdapter<Dependency> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            Dependency dependency = (Dependency) obj;
            supportSQLiteStatement.z(1, dependency.f3979a);
            supportSQLiteStatement.z(2, dependency.b);
        }
    }

    public DependencyDao_Impl(WorkDatabase_Impl workDatabase_Impl) {
        this.f3980a = workDatabase_Impl;
        this.b = new AnonymousClass1(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.DependencyDao
    public final void a(Dependency dependency) {
        WorkDatabase_Impl workDatabase_Impl = this.f3980a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.b.e(dependency);
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.l();
        }
    }

    @Override // androidx.work.impl.model.DependencyDao
    public final ArrayList b(String str) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        roomSQLiteQueryA.z(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f3980a;
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

    @Override // androidx.work.impl.model.DependencyDao
    public final boolean c(String str) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        roomSQLiteQueryA.z(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f3980a;
        workDatabase_Impl.b();
        boolean z = false;
        Cursor cursorB = DBUtil.b(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            if (cursorB.moveToFirst()) {
                z = cursorB.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorB.close();
            roomSQLiteQueryA.release();
        }
    }

    @Override // androidx.work.impl.model.DependencyDao
    public final boolean d(String str) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
        roomSQLiteQueryA.z(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f3980a;
        workDatabase_Impl.b();
        boolean z = false;
        Cursor cursorB = DBUtil.b(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            if (cursorB.moveToFirst()) {
                z = cursorB.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorB.close();
            roomSQLiteQueryA.release();
        }
    }
}
