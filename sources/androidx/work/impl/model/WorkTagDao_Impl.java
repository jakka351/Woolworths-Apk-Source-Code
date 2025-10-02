package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class WorkTagDao_Impl implements WorkTagDao {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f3995a;
    public final EntityInsertionAdapter b;

    /* renamed from: androidx.work.impl.model.WorkTagDao_Impl$1, reason: invalid class name */
    class AnonymousClass1 extends EntityInsertionAdapter<WorkTag> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            WorkTag workTag = (WorkTag) obj;
            supportSQLiteStatement.z(1, workTag.f3994a);
            supportSQLiteStatement.z(2, workTag.b);
        }
    }

    /* renamed from: androidx.work.impl.model.WorkTagDao_Impl$2, reason: invalid class name */
    class AnonymousClass2 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public WorkTagDao_Impl(WorkDatabase_Impl workDatabase_Impl) {
        this.f3995a = workDatabase_Impl;
        this.b = new AnonymousClass1(workDatabase_Impl);
        new AnonymousClass2(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.WorkTagDao
    public final ArrayList b(String str) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        roomSQLiteQueryA.z(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f3995a;
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

    @Override // androidx.work.impl.model.WorkTagDao
    public final void c(WorkTag workTag) {
        WorkDatabase_Impl workDatabase_Impl = this.f3995a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.b.e(workTag);
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.l();
        }
    }
}
