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
public final class WorkNameDao_Impl implements WorkNameDao {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f3987a;
    public final EntityInsertionAdapter b;

    /* renamed from: androidx.work.impl.model.WorkNameDao_Impl$1, reason: invalid class name */
    class AnonymousClass1 extends EntityInsertionAdapter<WorkName> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            WorkName workName = (WorkName) obj;
            supportSQLiteStatement.z(1, workName.f3986a);
            supportSQLiteStatement.z(2, workName.b);
        }
    }

    public WorkNameDao_Impl(WorkDatabase_Impl workDatabase_Impl) {
        this.f3987a = workDatabase_Impl;
        this.b = new AnonymousClass1(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.WorkNameDao
    public final void a(WorkName workName) {
        WorkDatabase_Impl workDatabase_Impl = this.f3987a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.b.e(workName);
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.l();
        }
    }

    @Override // androidx.work.impl.model.WorkNameDao
    public final ArrayList b(String str) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT name FROM workname WHERE work_spec_id=?");
        roomSQLiteQueryA.z(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f3987a;
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
}
