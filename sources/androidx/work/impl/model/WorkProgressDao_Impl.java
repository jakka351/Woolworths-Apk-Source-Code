package androidx.work.impl.model;

import androidx.room.EntityInsertionAdapter;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.Data;
import androidx.work.impl.WorkDatabase_Impl;

/* loaded from: classes.dex */
public final class WorkProgressDao_Impl implements WorkProgressDao {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f3989a;
    public final EntityInsertionAdapter b;
    public final SharedSQLiteStatement c;
    public final SharedSQLiteStatement d;

    /* renamed from: androidx.work.impl.model.WorkProgressDao_Impl$1, reason: invalid class name */
    class AnonymousClass1 extends EntityInsertionAdapter<WorkProgress> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            WorkProgress workProgress = (WorkProgress) obj;
            supportSQLiteStatement.z(1, workProgress.getF3988a());
            Data b = workProgress.getB();
            Data data = Data.b;
            supportSQLiteStatement.E0(2, Data.Companion.b(b));
        }
    }

    /* renamed from: androidx.work.impl.model.WorkProgressDao_Impl$2, reason: invalid class name */
    class AnonymousClass2 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkProgressDao_Impl$3, reason: invalid class name */
    class AnonymousClass3 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM WorkProgress";
        }
    }

    public WorkProgressDao_Impl(WorkDatabase_Impl workDatabase_Impl) {
        this.f3989a = workDatabase_Impl;
        this.b = new AnonymousClass1(workDatabase_Impl);
        this.c = new AnonymousClass2(workDatabase_Impl);
        this.d = new AnonymousClass3(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public final void a(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f3989a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.c;
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

    @Override // androidx.work.impl.model.WorkProgressDao
    public final void b() {
        WorkDatabase_Impl workDatabase_Impl = this.f3989a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.d;
        SupportSQLiteStatement supportSQLiteStatementA = sharedSQLiteStatement.a();
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

    @Override // androidx.work.impl.model.WorkProgressDao
    public final void c(WorkProgress workProgress) {
        WorkDatabase_Impl workDatabase_Impl = this.f3989a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.b.e(workProgress);
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.l();
        }
    }
}
