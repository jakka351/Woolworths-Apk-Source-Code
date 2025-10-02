package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.TreeMap;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class PreferenceDao_Impl implements PreferenceDao {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f3982a;
    public final EntityInsertionAdapter b;

    /* renamed from: androidx.work.impl.model.PreferenceDao_Impl$1, reason: invalid class name */
    class AnonymousClass1 extends EntityInsertionAdapter<Preference> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            Preference preference = (Preference) obj;
            supportSQLiteStatement.z(1, preference.f3981a);
            supportSQLiteStatement.C0(2, preference.b.longValue());
        }
    }

    /* renamed from: androidx.work.impl.model.PreferenceDao_Impl$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass2 implements Callable<Long> {
        @Override // java.util.concurrent.Callable
        public final Long call() {
            throw null;
        }

        public final void finalize() {
            throw null;
        }
    }

    public PreferenceDao_Impl(WorkDatabase_Impl workDatabase_Impl) {
        this.f3982a = workDatabase_Impl;
        this.b = new AnonymousClass1(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public final void a(Preference preference) {
        WorkDatabase_Impl workDatabase_Impl = this.f3982a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.b.e(preference);
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.l();
        }
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public final Long b(String str) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT long_value FROM Preference where `key`=?");
        roomSQLiteQueryA.z(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f3982a;
        workDatabase_Impl.b();
        Cursor cursorB = DBUtil.b(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            Long lValueOf = null;
            if (cursorB.moveToFirst() && !cursorB.isNull(0)) {
                lValueOf = Long.valueOf(cursorB.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorB.close();
            roomSQLiteQueryA.release();
        }
    }
}
