package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.InvalidationLiveDataContainer;
import androidx.room.InvalidationTracker;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RoomTrackingLiveData;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.NetworkRequestCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class WorkSpecDao_Impl implements WorkSpecDao {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f3993a;
    public final EntityInsertionAdapter b;
    public final SharedSQLiteStatement c;
    public final SharedSQLiteStatement d;
    public final SharedSQLiteStatement e;
    public final SharedSQLiteStatement f;
    public final SharedSQLiteStatement g;
    public final SharedSQLiteStatement h;
    public final SharedSQLiteStatement i;
    public final SharedSQLiteStatement j;
    public final SharedSQLiteStatement k;
    public final SharedSQLiteStatement l;
    public final SharedSQLiteStatement m;
    public final SharedSQLiteStatement n;

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$1, reason: invalid class name */
    class AnonymousClass1 extends EntityInsertionAdapter<WorkSpec> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            int i;
            WorkSpec workSpec = (WorkSpec) obj;
            int i2 = 1;
            supportSQLiteStatement.z(1, workSpec.f3990a);
            supportSQLiteStatement.C0(2, WorkTypeConverters.i(workSpec.b));
            supportSQLiteStatement.z(3, workSpec.c);
            supportSQLiteStatement.z(4, workSpec.d);
            Data data = workSpec.e;
            Data data2 = Data.b;
            supportSQLiteStatement.E0(5, Data.Companion.b(data));
            supportSQLiteStatement.E0(6, Data.Companion.b(workSpec.f));
            supportSQLiteStatement.C0(7, workSpec.g);
            supportSQLiteStatement.C0(8, workSpec.h);
            supportSQLiteStatement.C0(9, workSpec.i);
            supportSQLiteStatement.C0(10, workSpec.k);
            BackoffPolicy backoffPolicy = workSpec.l;
            Intrinsics.h(backoffPolicy, "backoffPolicy");
            int iOrdinal = backoffPolicy.ordinal();
            if (iOrdinal == 0) {
                i = 0;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 1;
            }
            supportSQLiteStatement.C0(11, i);
            supportSQLiteStatement.C0(12, workSpec.m);
            supportSQLiteStatement.C0(13, workSpec.n);
            supportSQLiteStatement.C0(14, workSpec.o);
            supportSQLiteStatement.C0(15, workSpec.p);
            supportSQLiteStatement.C0(16, workSpec.q ? 1L : 0L);
            OutOfQuotaPolicy policy = workSpec.r;
            Intrinsics.h(policy, "policy");
            int iOrdinal2 = policy.ordinal();
            if (iOrdinal2 == 0) {
                i2 = 0;
            } else if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            supportSQLiteStatement.C0(17, i2);
            supportSQLiteStatement.C0(18, workSpec.s);
            supportSQLiteStatement.C0(19, workSpec.t);
            supportSQLiteStatement.C0(20, workSpec.u);
            supportSQLiteStatement.C0(21, workSpec.v);
            supportSQLiteStatement.C0(22, workSpec.w);
            String str = workSpec.x;
            if (str == null) {
                supportSQLiteStatement.N0(23);
            } else {
                supportSQLiteStatement.z(23, str);
            }
            Constraints constraints = workSpec.j;
            supportSQLiteStatement.C0(24, WorkTypeConverters.g(constraints.f3893a));
            supportSQLiteStatement.E0(25, WorkTypeConverters.b(constraints.b));
            supportSQLiteStatement.C0(26, constraints.c ? 1L : 0L);
            supportSQLiteStatement.C0(27, constraints.d ? 1L : 0L);
            supportSQLiteStatement.C0(28, constraints.e ? 1L : 0L);
            supportSQLiteStatement.C0(29, constraints.f ? 1L : 0L);
            supportSQLiteStatement.C0(30, constraints.g);
            supportSQLiteStatement.C0(31, constraints.h);
            supportSQLiteStatement.E0(32, WorkTypeConverters.h(constraints.i));
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$10, reason: invalid class name */
    class AnonymousClass10 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$11, reason: invalid class name */
    class AnonymousClass11 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$12, reason: invalid class name */
    class AnonymousClass12 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$13, reason: invalid class name */
    class AnonymousClass13 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$14, reason: invalid class name */
    class AnonymousClass14 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$15, reason: invalid class name */
    class AnonymousClass15 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$16, reason: invalid class name */
    class AnonymousClass16 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$17, reason: invalid class name */
    class AnonymousClass17 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET stop_reason=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$18, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass18 implements Callable<List<String>> {
        @Override // java.util.concurrent.Callable
        public final List<String> call() {
            throw null;
        }

        public final void finalize() {
            throw null;
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$19, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass19 implements Callable<List<WorkSpec.WorkInfoPojo>> {
        @Override // java.util.concurrent.Callable
        public final List<WorkSpec.WorkInfoPojo> call() {
            throw null;
        }

        public final void finalize() {
            throw null;
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$2, reason: invalid class name */
    class AnonymousClass2 extends EntityDeletionOrUpdateAdapter<WorkSpec> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            int i;
            WorkSpec workSpec = (WorkSpec) obj;
            int i2 = 1;
            supportSQLiteStatement.z(1, workSpec.f3990a);
            supportSQLiteStatement.C0(2, WorkTypeConverters.i(workSpec.b));
            supportSQLiteStatement.z(3, workSpec.c);
            supportSQLiteStatement.z(4, workSpec.d);
            Data data = workSpec.e;
            Data data2 = Data.b;
            supportSQLiteStatement.E0(5, Data.Companion.b(data));
            supportSQLiteStatement.E0(6, Data.Companion.b(workSpec.f));
            supportSQLiteStatement.C0(7, workSpec.g);
            supportSQLiteStatement.C0(8, workSpec.h);
            supportSQLiteStatement.C0(9, workSpec.i);
            supportSQLiteStatement.C0(10, workSpec.k);
            BackoffPolicy backoffPolicy = workSpec.l;
            Intrinsics.h(backoffPolicy, "backoffPolicy");
            int iOrdinal = backoffPolicy.ordinal();
            if (iOrdinal == 0) {
                i = 0;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 1;
            }
            supportSQLiteStatement.C0(11, i);
            supportSQLiteStatement.C0(12, workSpec.m);
            supportSQLiteStatement.C0(13, workSpec.n);
            supportSQLiteStatement.C0(14, workSpec.o);
            supportSQLiteStatement.C0(15, workSpec.p);
            supportSQLiteStatement.C0(16, workSpec.q ? 1L : 0L);
            OutOfQuotaPolicy policy = workSpec.r;
            Intrinsics.h(policy, "policy");
            int iOrdinal2 = policy.ordinal();
            if (iOrdinal2 == 0) {
                i2 = 0;
            } else if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            supportSQLiteStatement.C0(17, i2);
            supportSQLiteStatement.C0(18, workSpec.s);
            supportSQLiteStatement.C0(19, workSpec.t);
            supportSQLiteStatement.C0(20, workSpec.u);
            supportSQLiteStatement.C0(21, workSpec.v);
            supportSQLiteStatement.C0(22, workSpec.w);
            String str = workSpec.x;
            if (str == null) {
                supportSQLiteStatement.N0(23);
            } else {
                supportSQLiteStatement.z(23, str);
            }
            Constraints constraints = workSpec.j;
            supportSQLiteStatement.C0(24, WorkTypeConverters.g(constraints.f3893a));
            supportSQLiteStatement.E0(25, WorkTypeConverters.b(constraints.b));
            supportSQLiteStatement.C0(26, constraints.c ? 1L : 0L);
            supportSQLiteStatement.C0(27, constraints.d ? 1L : 0L);
            supportSQLiteStatement.C0(28, constraints.e ? 1L : 0L);
            supportSQLiteStatement.C0(29, constraints.f ? 1L : 0L);
            supportSQLiteStatement.C0(30, constraints.g);
            supportSQLiteStatement.C0(31, constraints.h);
            supportSQLiteStatement.E0(32, WorkTypeConverters.h(constraints.i));
            supportSQLiteStatement.z(33, workSpec.f3990a);
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$20, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass20 implements Callable<List<WorkSpec.WorkInfoPojo>> {
        @Override // java.util.concurrent.Callable
        public final List<WorkSpec.WorkInfoPojo> call() {
            throw null;
        }

        public final void finalize() {
            throw null;
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$21, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass21 implements Callable<List<WorkSpec.WorkInfoPojo>> {
        @Override // java.util.concurrent.Callable
        public final List<WorkSpec.WorkInfoPojo> call() {
            throw null;
        }

        public final void finalize() {
            throw null;
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$22, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass22 implements Callable<List<WorkSpec.WorkInfoPojo>> {
        @Override // java.util.concurrent.Callable
        public final List<WorkSpec.WorkInfoPojo> call() {
            throw null;
        }

        public final void finalize() {
            throw null;
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$24, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass24 implements Callable<List<WorkSpec.WorkInfoPojo>> {
        @Override // java.util.concurrent.Callable
        public final List<WorkSpec.WorkInfoPojo> call() {
            throw null;
        }

        public final void finalize() {
            throw null;
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$26, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass26 implements Callable<Long> {
        @Override // java.util.concurrent.Callable
        public final Long call() {
            throw null;
        }

        public final void finalize() {
            throw null;
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$3, reason: invalid class name */
    class AnonymousClass3 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$4, reason: invalid class name */
    class AnonymousClass4 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$5, reason: invalid class name */
    class AnonymousClass5 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$6, reason: invalid class name */
    class AnonymousClass6 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$7, reason: invalid class name */
    class AnonymousClass7 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$8, reason: invalid class name */
    class AnonymousClass8 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$9, reason: invalid class name */
    class AnonymousClass9 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public WorkSpecDao_Impl(WorkDatabase_Impl workDatabase_Impl) {
        this.f3993a = workDatabase_Impl;
        this.b = new AnonymousClass1(workDatabase_Impl);
        new AnonymousClass2(workDatabase_Impl);
        this.c = new AnonymousClass3(workDatabase_Impl);
        this.d = new AnonymousClass4(workDatabase_Impl);
        this.e = new AnonymousClass5(workDatabase_Impl);
        this.f = new AnonymousClass6(workDatabase_Impl);
        this.g = new AnonymousClass7(workDatabase_Impl);
        this.h = new AnonymousClass8(workDatabase_Impl);
        this.i = new AnonymousClass9(workDatabase_Impl);
        this.j = new AnonymousClass10(workDatabase_Impl);
        new AnonymousClass11(workDatabase_Impl);
        this.k = new AnonymousClass12(workDatabase_Impl);
        this.l = new AnonymousClass13(workDatabase_Impl);
        this.m = new AnonymousClass14(workDatabase_Impl);
        new AnonymousClass15(workDatabase_Impl);
        new AnonymousClass16(workDatabase_Impl);
        this.n = new AnonymousClass17(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void A(String str, Data data) {
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.g;
        SupportSQLiteStatement supportSQLiteStatementA = sharedSQLiteStatement.a();
        Data data2 = Data.b;
        supportSQLiteStatementA.E0(1, Data.Companion.b(data));
        supportSQLiteStatementA.z(2, str);
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

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList B() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
        workDatabase_Impl.b();
        Cursor cursorB = DBUtil.b(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            iB = CursorUtil.b(cursorB, "id");
            iB2 = CursorUtil.b(cursorB, "state");
            iB3 = CursorUtil.b(cursorB, "worker_class_name");
            iB4 = CursorUtil.b(cursorB, "input_merger_class_name");
            iB5 = CursorUtil.b(cursorB, "input");
            iB6 = CursorUtil.b(cursorB, "output");
            iB7 = CursorUtil.b(cursorB, "initial_delay");
            iB8 = CursorUtil.b(cursorB, "interval_duration");
            iB9 = CursorUtil.b(cursorB, "flex_duration");
            iB10 = CursorUtil.b(cursorB, "run_attempt_count");
            iB11 = CursorUtil.b(cursorB, "backoff_policy");
            iB12 = CursorUtil.b(cursorB, "backoff_delay_duration");
            iB13 = CursorUtil.b(cursorB, "last_enqueue_time");
            roomSQLiteQuery = roomSQLiteQueryA;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = roomSQLiteQueryA;
        }
        try {
            int iB14 = CursorUtil.b(cursorB, "minimum_retention_duration");
            int iB15 = CursorUtil.b(cursorB, "schedule_requested_at");
            int iB16 = CursorUtil.b(cursorB, "run_in_foreground");
            int iB17 = CursorUtil.b(cursorB, "out_of_quota_policy");
            int iB18 = CursorUtil.b(cursorB, "period_count");
            int iB19 = CursorUtil.b(cursorB, "generation");
            int iB20 = CursorUtil.b(cursorB, "next_schedule_time_override");
            int iB21 = CursorUtil.b(cursorB, "next_schedule_time_override_generation");
            int iB22 = CursorUtil.b(cursorB, "stop_reason");
            int iB23 = CursorUtil.b(cursorB, "trace_tag");
            int iB24 = CursorUtil.b(cursorB, "required_network_type");
            int iB25 = CursorUtil.b(cursorB, "required_network_request");
            int iB26 = CursorUtil.b(cursorB, "requires_charging");
            int iB27 = CursorUtil.b(cursorB, "requires_device_idle");
            int iB28 = CursorUtil.b(cursorB, "requires_battery_not_low");
            int iB29 = CursorUtil.b(cursorB, "requires_storage_not_low");
            int iB30 = CursorUtil.b(cursorB, "trigger_content_update_delay");
            int iB31 = CursorUtil.b(cursorB, "trigger_max_content_delay");
            int iB32 = CursorUtil.b(cursorB, "content_uri_triggers");
            int i = iB14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iB);
                WorkInfo.State stateF = WorkTypeConverters.f(cursorB.getInt(iB2));
                String string2 = cursorB.getString(iB3);
                String string3 = cursorB.getString(iB4);
                Data dataA = Data.a(cursorB.getBlob(iB5));
                Data dataA2 = Data.a(cursorB.getBlob(iB6));
                long j = cursorB.getLong(iB7);
                long j2 = cursorB.getLong(iB8);
                long j3 = cursorB.getLong(iB9);
                int i2 = cursorB.getInt(iB10);
                BackoffPolicy backoffPolicyC = WorkTypeConverters.c(cursorB.getInt(iB11));
                long j4 = cursorB.getLong(iB12);
                long j5 = cursorB.getLong(iB13);
                int i3 = i;
                long j6 = cursorB.getLong(i3);
                int i4 = iB13;
                int i5 = iB15;
                long j7 = cursorB.getLong(i5);
                iB15 = i5;
                int i6 = iB16;
                boolean z = cursorB.getInt(i6) != 0;
                iB16 = i6;
                int i7 = iB17;
                OutOfQuotaPolicy outOfQuotaPolicyE = WorkTypeConverters.e(cursorB.getInt(i7));
                iB17 = i7;
                int i8 = iB18;
                int i9 = cursorB.getInt(i8);
                iB18 = i8;
                int i10 = iB19;
                int i11 = cursorB.getInt(i10);
                iB19 = i10;
                int i12 = iB20;
                long j8 = cursorB.getLong(i12);
                iB20 = i12;
                int i13 = iB21;
                int i14 = cursorB.getInt(i13);
                iB21 = i13;
                int i15 = iB22;
                int i16 = cursorB.getInt(i15);
                iB22 = i15;
                int i17 = iB23;
                String string4 = cursorB.isNull(i17) ? null : cursorB.getString(i17);
                iB23 = i17;
                int i18 = iB24;
                NetworkType networkTypeD = WorkTypeConverters.d(cursorB.getInt(i18));
                iB24 = i18;
                int i19 = iB25;
                NetworkRequestCompat networkRequestCompatJ = WorkTypeConverters.j(cursorB.getBlob(i19));
                iB25 = i19;
                int i20 = iB26;
                boolean z2 = cursorB.getInt(i20) != 0;
                iB26 = i20;
                int i21 = iB27;
                boolean z3 = cursorB.getInt(i21) != 0;
                iB27 = i21;
                int i22 = iB28;
                boolean z4 = cursorB.getInt(i22) != 0;
                iB28 = i22;
                int i23 = iB29;
                boolean z5 = cursorB.getInt(i23) != 0;
                iB29 = i23;
                int i24 = iB30;
                long j9 = cursorB.getLong(i24);
                iB30 = i24;
                int i25 = iB31;
                long j10 = cursorB.getLong(i25);
                iB31 = i25;
                int i26 = iB32;
                iB32 = i26;
                arrayList.add(new WorkSpec(string, stateF, string2, string3, dataA, dataA2, j, j2, j3, new Constraints(networkRequestCompatJ, networkTypeD, z2, z3, z4, z5, j9, j10, WorkTypeConverters.a(cursorB.getBlob(i26))), i2, backoffPolicyC, j4, j5, j6, j7, z, outOfQuotaPolicyE, i9, i11, j8, i14, i16, string4));
                iB13 = i4;
                i = i3;
            }
            cursorB.close();
            roomSQLiteQuery.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void C(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.n;
        SupportSQLiteStatement supportSQLiteStatementA = sharedSQLiteStatement.a();
        supportSQLiteStatementA.C0(1, i);
        supportSQLiteStatementA.z(2, str);
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

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList D() {
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery.Companion.a(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)").z(1, null);
        throw null;
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int E(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.i;
        SupportSQLiteStatement supportSQLiteStatementA = sharedSQLiteStatement.a();
        supportSQLiteStatementA.z(1, str);
        try {
            workDatabase_Impl.c();
            try {
                int iP = supportSQLiteStatementA.P();
                workDatabase_Impl.r();
                return iP;
            } finally {
                workDatabase_Impl.l();
            }
        } finally {
            sharedSQLiteStatement.c(supportSQLiteStatementA);
        }
    }

    public final void F(HashMap map) {
        Set setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            RelationUtil.b(map, new b(this, 1));
            return;
        }
        StringBuilder sbS = YU.a.s("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        StringUtil.a(size, sbS);
        sbS.append(")");
        String string = sbS.toString();
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(size, string);
        Iterator it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            roomSQLiteQueryA.z(i, (String) it.next());
            i++;
        }
        Cursor cursorB = DBUtil.b(this.f3993a, roomSQLiteQueryA, false);
        try {
            int iA = CursorUtil.a(cursorB, "work_spec_id");
            if (iA == -1) {
                return;
            }
            while (cursorB.moveToNext()) {
                ArrayList arrayList = (ArrayList) map.get(cursorB.getString(iA));
                if (arrayList != null) {
                    arrayList.add(Data.a(cursorB.getBlob(0)));
                }
            }
        } finally {
            cursorB.close();
        }
    }

    public final void G(HashMap map) {
        Set setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            RelationUtil.b(map, new b(this, 0));
            return;
        }
        StringBuilder sbS = YU.a.s("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        StringUtil.a(size, sbS);
        sbS.append(")");
        String string = sbS.toString();
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(size, string);
        Iterator it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            roomSQLiteQueryA.z(i, (String) it.next());
            i++;
        }
        Cursor cursorB = DBUtil.b(this.f3993a, roomSQLiteQueryA, false);
        try {
            int iA = CursorUtil.a(cursorB, "work_spec_id");
            if (iA == -1) {
                return;
            }
            while (cursorB.moveToNext()) {
                ArrayList arrayList = (ArrayList) map.get(cursorB.getString(iA));
                if (arrayList != null) {
                    arrayList.add(cursorB.getString(0));
                }
            }
        } finally {
            cursorB.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void a(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
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

    @Override // androidx.work.impl.model.WorkSpecDao
    public final RoomTrackingLiveData b() {
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        roomSQLiteQueryA.z(1, "SYNC_UNIQUE_WORKER_NAME");
        InvalidationTracker invalidationTracker = this.f3993a.e;
        Callable<List<WorkSpec.WorkInfoPojo>> callable = new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.23
            @Override // java.util.concurrent.Callable
            public final List<WorkSpec.WorkInfoPojo> call() {
                WorkSpecDao_Impl workSpecDao_Impl = WorkSpecDao_Impl.this;
                WorkDatabase_Impl workDatabase_Impl = workSpecDao_Impl.f3993a;
                workDatabase_Impl.c();
                try {
                    Cursor cursorB = DBUtil.b(workDatabase_Impl, roomSQLiteQueryA, true);
                    try {
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        while (cursorB.moveToNext()) {
                            String string = cursorB.getString(0);
                            if (!map.containsKey(string)) {
                                map.put(string, new ArrayList());
                            }
                            String string2 = cursorB.getString(0);
                            if (!map2.containsKey(string2)) {
                                map2.put(string2, new ArrayList());
                            }
                        }
                        cursorB.moveToPosition(-1);
                        workSpecDao_Impl.G(map);
                        workSpecDao_Impl.F(map2);
                        ArrayList arrayList = new ArrayList(cursorB.getCount());
                        while (cursorB.moveToNext()) {
                            String string3 = cursorB.getString(0);
                            WorkInfo.State stateF = WorkTypeConverters.f(cursorB.getInt(1));
                            Data dataA = Data.a(cursorB.getBlob(2));
                            int i = cursorB.getInt(3);
                            int i2 = cursorB.getInt(4);
                            arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateF, dataA, cursorB.getLong(14), cursorB.getLong(15), cursorB.getLong(16), new Constraints(WorkTypeConverters.j(cursorB.getBlob(6)), WorkTypeConverters.d(cursorB.getInt(5)), cursorB.getInt(7) != 0, cursorB.getInt(8) != 0, cursorB.getInt(9) != 0, cursorB.getInt(10) != 0, cursorB.getLong(11), cursorB.getLong(12), WorkTypeConverters.a(cursorB.getBlob(13))), i, WorkTypeConverters.c(cursorB.getInt(17)), cursorB.getLong(18), cursorB.getLong(19), cursorB.getInt(20), i2, cursorB.getLong(21), cursorB.getInt(22), (ArrayList) map.get(cursorB.getString(0)), (ArrayList) map2.get(cursorB.getString(0))));
                        }
                        workDatabase_Impl.r();
                        cursorB.close();
                        return arrayList;
                    } catch (Throwable th) {
                        cursorB.close();
                        throw th;
                    }
                } finally {
                    workDatabase_Impl.l();
                }
            }

            public final void finalize() {
                roomSQLiteQueryA.release();
            }
        };
        invalidationTracker.getClass();
        InvalidationLiveDataContainer invalidationLiveDataContainer = invalidationTracker.j;
        String[] strArrD = invalidationTracker.d(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"});
        for (String str : strArrD) {
            LinkedHashMap linkedHashMap = invalidationTracker.d;
            Locale locale = Locale.US;
            if (!linkedHashMap.containsKey(androidx.constraintlayout.core.state.a.m(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)"))) {
                throw new IllegalArgumentException("There is no table with name ".concat(str).toString());
            }
        }
        invalidationLiveDataContainer.getClass();
        return new RoomTrackingLiveData(invalidationLiveDataContainer.f3711a, invalidationLiveDataContainer, callable, strArrD);
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void c(WorkSpec workSpec) {
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.b.e(workSpec);
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.l();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList d(String str) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        roomSQLiteQueryA.z(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
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

    @Override // androidx.work.impl.model.WorkSpecDao
    public final WorkInfo.State e(String str) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT state FROM workspec WHERE id=?");
        roomSQLiteQueryA.z(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
        workDatabase_Impl.b();
        Cursor cursorB = DBUtil.b(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            WorkInfo.State stateF = null;
            if (cursorB.moveToFirst()) {
                Integer numValueOf = cursorB.isNull(0) ? null : Integer.valueOf(cursorB.getInt(0));
                if (numValueOf != null) {
                    stateF = WorkTypeConverters.f(numValueOf.intValue());
                }
            }
            return stateF;
        } finally {
            cursorB.close();
            roomSQLiteQueryA.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList f() {
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery.Companion.a(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)").z(1, null);
        throw null;
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int g(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.e;
        SupportSQLiteStatement supportSQLiteStatementA = sharedSQLiteStatement.a();
        supportSQLiteStatementA.z(1, str);
        try {
            workDatabase_Impl.c();
            try {
                int iP = supportSQLiteStatementA.P();
                workDatabase_Impl.r();
                return iP;
            } finally {
                workDatabase_Impl.l();
            }
        } finally {
            sharedSQLiteStatement.c(supportSQLiteStatementA);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList h(String str) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        roomSQLiteQueryA.z(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
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

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList i(String str) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
        roomSQLiteQueryA.z(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
        workDatabase_Impl.b();
        Cursor cursorB = DBUtil.b(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(Data.a(cursorB.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorB.close();
            roomSQLiteQueryA.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int j(WorkInfo.State state, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.d;
        SupportSQLiteStatement supportSQLiteStatementA = sharedSQLiteStatement.a();
        supportSQLiteStatementA.C0(1, WorkTypeConverters.i(state));
        supportSQLiteStatementA.z(2, str);
        try {
            workDatabase_Impl.c();
            try {
                int iP = supportSQLiteStatementA.P();
                workDatabase_Impl.r();
                return iP;
            } finally {
                workDatabase_Impl.l();
            }
        } finally {
            sharedSQLiteStatement.c(supportSQLiteStatementA);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void k(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.h;
        SupportSQLiteStatement supportSQLiteStatementA = sharedSQLiteStatement.a();
        supportSQLiteStatementA.C0(1, j);
        supportSQLiteStatementA.z(2, str);
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

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList l() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
        workDatabase_Impl.b();
        Cursor cursorB = DBUtil.b(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            iB = CursorUtil.b(cursorB, "id");
            iB2 = CursorUtil.b(cursorB, "state");
            iB3 = CursorUtil.b(cursorB, "worker_class_name");
            iB4 = CursorUtil.b(cursorB, "input_merger_class_name");
            iB5 = CursorUtil.b(cursorB, "input");
            iB6 = CursorUtil.b(cursorB, "output");
            iB7 = CursorUtil.b(cursorB, "initial_delay");
            iB8 = CursorUtil.b(cursorB, "interval_duration");
            iB9 = CursorUtil.b(cursorB, "flex_duration");
            iB10 = CursorUtil.b(cursorB, "run_attempt_count");
            iB11 = CursorUtil.b(cursorB, "backoff_policy");
            iB12 = CursorUtil.b(cursorB, "backoff_delay_duration");
            iB13 = CursorUtil.b(cursorB, "last_enqueue_time");
            roomSQLiteQuery = roomSQLiteQueryA;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = roomSQLiteQueryA;
        }
        try {
            int iB14 = CursorUtil.b(cursorB, "minimum_retention_duration");
            int iB15 = CursorUtil.b(cursorB, "schedule_requested_at");
            int iB16 = CursorUtil.b(cursorB, "run_in_foreground");
            int iB17 = CursorUtil.b(cursorB, "out_of_quota_policy");
            int iB18 = CursorUtil.b(cursorB, "period_count");
            int iB19 = CursorUtil.b(cursorB, "generation");
            int iB20 = CursorUtil.b(cursorB, "next_schedule_time_override");
            int iB21 = CursorUtil.b(cursorB, "next_schedule_time_override_generation");
            int iB22 = CursorUtil.b(cursorB, "stop_reason");
            int iB23 = CursorUtil.b(cursorB, "trace_tag");
            int iB24 = CursorUtil.b(cursorB, "required_network_type");
            int iB25 = CursorUtil.b(cursorB, "required_network_request");
            int iB26 = CursorUtil.b(cursorB, "requires_charging");
            int iB27 = CursorUtil.b(cursorB, "requires_device_idle");
            int iB28 = CursorUtil.b(cursorB, "requires_battery_not_low");
            int iB29 = CursorUtil.b(cursorB, "requires_storage_not_low");
            int iB30 = CursorUtil.b(cursorB, "trigger_content_update_delay");
            int iB31 = CursorUtil.b(cursorB, "trigger_max_content_delay");
            int iB32 = CursorUtil.b(cursorB, "content_uri_triggers");
            int i = iB14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iB);
                WorkInfo.State stateF = WorkTypeConverters.f(cursorB.getInt(iB2));
                String string2 = cursorB.getString(iB3);
                String string3 = cursorB.getString(iB4);
                Data dataA = Data.a(cursorB.getBlob(iB5));
                Data dataA2 = Data.a(cursorB.getBlob(iB6));
                long j = cursorB.getLong(iB7);
                long j2 = cursorB.getLong(iB8);
                long j3 = cursorB.getLong(iB9);
                int i2 = cursorB.getInt(iB10);
                BackoffPolicy backoffPolicyC = WorkTypeConverters.c(cursorB.getInt(iB11));
                long j4 = cursorB.getLong(iB12);
                long j5 = cursorB.getLong(iB13);
                int i3 = i;
                long j6 = cursorB.getLong(i3);
                int i4 = iB13;
                int i5 = iB15;
                long j7 = cursorB.getLong(i5);
                iB15 = i5;
                int i6 = iB16;
                boolean z = cursorB.getInt(i6) != 0;
                iB16 = i6;
                int i7 = iB17;
                OutOfQuotaPolicy outOfQuotaPolicyE = WorkTypeConverters.e(cursorB.getInt(i7));
                iB17 = i7;
                int i8 = iB18;
                int i9 = cursorB.getInt(i8);
                iB18 = i8;
                int i10 = iB19;
                int i11 = cursorB.getInt(i10);
                iB19 = i10;
                int i12 = iB20;
                long j8 = cursorB.getLong(i12);
                iB20 = i12;
                int i13 = iB21;
                int i14 = cursorB.getInt(i13);
                iB21 = i13;
                int i15 = iB22;
                int i16 = cursorB.getInt(i15);
                iB22 = i15;
                int i17 = iB23;
                String string4 = cursorB.isNull(i17) ? null : cursorB.getString(i17);
                iB23 = i17;
                int i18 = iB24;
                NetworkType networkTypeD = WorkTypeConverters.d(cursorB.getInt(i18));
                iB24 = i18;
                int i19 = iB25;
                NetworkRequestCompat networkRequestCompatJ = WorkTypeConverters.j(cursorB.getBlob(i19));
                iB25 = i19;
                int i20 = iB26;
                boolean z2 = cursorB.getInt(i20) != 0;
                iB26 = i20;
                int i21 = iB27;
                boolean z3 = cursorB.getInt(i21) != 0;
                iB27 = i21;
                int i22 = iB28;
                boolean z4 = cursorB.getInt(i22) != 0;
                iB28 = i22;
                int i23 = iB29;
                boolean z5 = cursorB.getInt(i23) != 0;
                iB29 = i23;
                int i24 = iB30;
                long j9 = cursorB.getLong(i24);
                iB30 = i24;
                int i25 = iB31;
                long j10 = cursorB.getLong(i25);
                iB31 = i25;
                int i26 = iB32;
                iB32 = i26;
                arrayList.add(new WorkSpec(string, stateF, string2, string3, dataA, dataA2, j, j2, j3, new Constraints(networkRequestCompatJ, networkTypeD, z2, z3, z4, z5, j9, j10, WorkTypeConverters.a(cursorB.getBlob(i26))), i2, backoffPolicyC, j4, j5, j6, j7, z, outOfQuotaPolicyE, i9, i11, j8, i14, i16, string4));
                iB13 = i4;
                i = i3;
            }
            cursorB.close();
            roomSQLiteQuery.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int m(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.j;
        SupportSQLiteStatement supportSQLiteStatementA = sharedSQLiteStatement.a();
        supportSQLiteStatementA.z(1, str);
        try {
            workDatabase_Impl.c();
            try {
                int iP = supportSQLiteStatementA.P();
                workDatabase_Impl.r();
                return iP;
            } finally {
                workDatabase_Impl.l();
            }
        } finally {
            sharedSQLiteStatement.c(supportSQLiteStatementA);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int n() {
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
        workDatabase_Impl.b();
        Cursor cursorB = DBUtil.b(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            return cursorB.moveToFirst() ? cursorB.getInt(0) : 0;
        } finally {
            cursorB.close();
            roomSQLiteQueryA.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void o(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.f;
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

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int p(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.l;
        SupportSQLiteStatement supportSQLiteStatementA = sharedSQLiteStatement.a();
        supportSQLiteStatementA.C0(1, j);
        supportSQLiteStatementA.z(2, str);
        try {
            workDatabase_Impl.c();
            try {
                int iP = supportSQLiteStatementA.P();
                workDatabase_Impl.r();
                return iP;
            } finally {
                workDatabase_Impl.l();
            }
        } finally {
            sharedSQLiteStatement.c(supportSQLiteStatementA);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList q(long j) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        roomSQLiteQueryA.C0(1, j);
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
        workDatabase_Impl.b();
        Cursor cursorB = DBUtil.b(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            int iB = CursorUtil.b(cursorB, "id");
            int iB2 = CursorUtil.b(cursorB, "state");
            int iB3 = CursorUtil.b(cursorB, "worker_class_name");
            int iB4 = CursorUtil.b(cursorB, "input_merger_class_name");
            int iB5 = CursorUtil.b(cursorB, "input");
            int iB6 = CursorUtil.b(cursorB, "output");
            int iB7 = CursorUtil.b(cursorB, "initial_delay");
            int iB8 = CursorUtil.b(cursorB, "interval_duration");
            int iB9 = CursorUtil.b(cursorB, "flex_duration");
            int iB10 = CursorUtil.b(cursorB, "run_attempt_count");
            int iB11 = CursorUtil.b(cursorB, "backoff_policy");
            int iB12 = CursorUtil.b(cursorB, "backoff_delay_duration");
            int iB13 = CursorUtil.b(cursorB, "last_enqueue_time");
            roomSQLiteQuery = roomSQLiteQueryA;
            try {
                int iB14 = CursorUtil.b(cursorB, "minimum_retention_duration");
                int iB15 = CursorUtil.b(cursorB, "schedule_requested_at");
                int iB16 = CursorUtil.b(cursorB, "run_in_foreground");
                int iB17 = CursorUtil.b(cursorB, "out_of_quota_policy");
                int iB18 = CursorUtil.b(cursorB, "period_count");
                int iB19 = CursorUtil.b(cursorB, "generation");
                int iB20 = CursorUtil.b(cursorB, "next_schedule_time_override");
                int iB21 = CursorUtil.b(cursorB, "next_schedule_time_override_generation");
                int iB22 = CursorUtil.b(cursorB, "stop_reason");
                int iB23 = CursorUtil.b(cursorB, "trace_tag");
                int iB24 = CursorUtil.b(cursorB, "required_network_type");
                int iB25 = CursorUtil.b(cursorB, "required_network_request");
                int iB26 = CursorUtil.b(cursorB, "requires_charging");
                int iB27 = CursorUtil.b(cursorB, "requires_device_idle");
                int iB28 = CursorUtil.b(cursorB, "requires_battery_not_low");
                int iB29 = CursorUtil.b(cursorB, "requires_storage_not_low");
                int iB30 = CursorUtil.b(cursorB, "trigger_content_update_delay");
                int iB31 = CursorUtil.b(cursorB, "trigger_max_content_delay");
                int iB32 = CursorUtil.b(cursorB, "content_uri_triggers");
                int i = iB14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(iB);
                    WorkInfo.State stateF = WorkTypeConverters.f(cursorB.getInt(iB2));
                    String string2 = cursorB.getString(iB3);
                    String string3 = cursorB.getString(iB4);
                    Data dataA = Data.a(cursorB.getBlob(iB5));
                    Data dataA2 = Data.a(cursorB.getBlob(iB6));
                    long j2 = cursorB.getLong(iB7);
                    long j3 = cursorB.getLong(iB8);
                    long j4 = cursorB.getLong(iB9);
                    int i2 = cursorB.getInt(iB10);
                    BackoffPolicy backoffPolicyC = WorkTypeConverters.c(cursorB.getInt(iB11));
                    long j5 = cursorB.getLong(iB12);
                    long j6 = cursorB.getLong(iB13);
                    int i3 = i;
                    long j7 = cursorB.getLong(i3);
                    int i4 = iB12;
                    int i5 = iB15;
                    long j8 = cursorB.getLong(i5);
                    iB15 = i5;
                    int i6 = iB16;
                    boolean z = cursorB.getInt(i6) != 0;
                    iB16 = i6;
                    int i7 = iB17;
                    OutOfQuotaPolicy outOfQuotaPolicyE = WorkTypeConverters.e(cursorB.getInt(i7));
                    iB17 = i7;
                    int i8 = iB18;
                    int i9 = cursorB.getInt(i8);
                    iB18 = i8;
                    int i10 = iB19;
                    int i11 = cursorB.getInt(i10);
                    iB19 = i10;
                    int i12 = iB20;
                    long j9 = cursorB.getLong(i12);
                    iB20 = i12;
                    int i13 = iB21;
                    int i14 = cursorB.getInt(i13);
                    iB21 = i13;
                    int i15 = iB22;
                    int i16 = cursorB.getInt(i15);
                    iB22 = i15;
                    int i17 = iB23;
                    String string4 = cursorB.isNull(i17) ? null : cursorB.getString(i17);
                    iB23 = i17;
                    int i18 = iB24;
                    NetworkType networkTypeD = WorkTypeConverters.d(cursorB.getInt(i18));
                    iB24 = i18;
                    int i19 = iB25;
                    NetworkRequestCompat networkRequestCompatJ = WorkTypeConverters.j(cursorB.getBlob(i19));
                    iB25 = i19;
                    int i20 = iB26;
                    boolean z2 = cursorB.getInt(i20) != 0;
                    iB26 = i20;
                    int i21 = iB27;
                    boolean z3 = cursorB.getInt(i21) != 0;
                    iB27 = i21;
                    int i22 = iB28;
                    boolean z4 = cursorB.getInt(i22) != 0;
                    iB28 = i22;
                    int i23 = iB29;
                    boolean z5 = cursorB.getInt(i23) != 0;
                    iB29 = i23;
                    int i24 = iB30;
                    long j10 = cursorB.getLong(i24);
                    iB30 = i24;
                    int i25 = iB31;
                    long j11 = cursorB.getLong(i25);
                    iB31 = i25;
                    int i26 = iB32;
                    iB32 = i26;
                    arrayList.add(new WorkSpec(string, stateF, string2, string3, dataA, dataA2, j2, j3, j4, new Constraints(networkRequestCompatJ, networkTypeD, z2, z3, z4, z5, j10, j11, WorkTypeConverters.a(cursorB.getBlob(i26))), i2, backoffPolicyC, j5, j6, j7, j8, z, outOfQuotaPolicyE, i9, i11, j9, i14, i16, string4));
                    iB12 = i4;
                    i = i3;
                }
                cursorB.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryA;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void r(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.k;
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

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList s() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
        workDatabase_Impl.b();
        Cursor cursorB = DBUtil.b(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            iB = CursorUtil.b(cursorB, "id");
            iB2 = CursorUtil.b(cursorB, "state");
            iB3 = CursorUtil.b(cursorB, "worker_class_name");
            iB4 = CursorUtil.b(cursorB, "input_merger_class_name");
            iB5 = CursorUtil.b(cursorB, "input");
            iB6 = CursorUtil.b(cursorB, "output");
            iB7 = CursorUtil.b(cursorB, "initial_delay");
            iB8 = CursorUtil.b(cursorB, "interval_duration");
            iB9 = CursorUtil.b(cursorB, "flex_duration");
            iB10 = CursorUtil.b(cursorB, "run_attempt_count");
            iB11 = CursorUtil.b(cursorB, "backoff_policy");
            iB12 = CursorUtil.b(cursorB, "backoff_delay_duration");
            iB13 = CursorUtil.b(cursorB, "last_enqueue_time");
            roomSQLiteQuery = roomSQLiteQueryA;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = roomSQLiteQueryA;
        }
        try {
            int iB14 = CursorUtil.b(cursorB, "minimum_retention_duration");
            int iB15 = CursorUtil.b(cursorB, "schedule_requested_at");
            int iB16 = CursorUtil.b(cursorB, "run_in_foreground");
            int iB17 = CursorUtil.b(cursorB, "out_of_quota_policy");
            int iB18 = CursorUtil.b(cursorB, "period_count");
            int iB19 = CursorUtil.b(cursorB, "generation");
            int iB20 = CursorUtil.b(cursorB, "next_schedule_time_override");
            int iB21 = CursorUtil.b(cursorB, "next_schedule_time_override_generation");
            int iB22 = CursorUtil.b(cursorB, "stop_reason");
            int iB23 = CursorUtil.b(cursorB, "trace_tag");
            int iB24 = CursorUtil.b(cursorB, "required_network_type");
            int iB25 = CursorUtil.b(cursorB, "required_network_request");
            int iB26 = CursorUtil.b(cursorB, "requires_charging");
            int iB27 = CursorUtil.b(cursorB, "requires_device_idle");
            int iB28 = CursorUtil.b(cursorB, "requires_battery_not_low");
            int iB29 = CursorUtil.b(cursorB, "requires_storage_not_low");
            int iB30 = CursorUtil.b(cursorB, "trigger_content_update_delay");
            int iB31 = CursorUtil.b(cursorB, "trigger_max_content_delay");
            int iB32 = CursorUtil.b(cursorB, "content_uri_triggers");
            int i = iB14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iB);
                WorkInfo.State stateF = WorkTypeConverters.f(cursorB.getInt(iB2));
                String string2 = cursorB.getString(iB3);
                String string3 = cursorB.getString(iB4);
                Data dataA = Data.a(cursorB.getBlob(iB5));
                Data dataA2 = Data.a(cursorB.getBlob(iB6));
                long j = cursorB.getLong(iB7);
                long j2 = cursorB.getLong(iB8);
                long j3 = cursorB.getLong(iB9);
                int i2 = cursorB.getInt(iB10);
                BackoffPolicy backoffPolicyC = WorkTypeConverters.c(cursorB.getInt(iB11));
                long j4 = cursorB.getLong(iB12);
                long j5 = cursorB.getLong(iB13);
                int i3 = i;
                long j6 = cursorB.getLong(i3);
                int i4 = iB13;
                int i5 = iB15;
                long j7 = cursorB.getLong(i5);
                iB15 = i5;
                int i6 = iB16;
                boolean z = cursorB.getInt(i6) != 0;
                iB16 = i6;
                int i7 = iB17;
                OutOfQuotaPolicy outOfQuotaPolicyE = WorkTypeConverters.e(cursorB.getInt(i7));
                iB17 = i7;
                int i8 = iB18;
                int i9 = cursorB.getInt(i8);
                iB18 = i8;
                int i10 = iB19;
                int i11 = cursorB.getInt(i10);
                iB19 = i10;
                int i12 = iB20;
                long j8 = cursorB.getLong(i12);
                iB20 = i12;
                int i13 = iB21;
                int i14 = cursorB.getInt(i13);
                iB21 = i13;
                int i15 = iB22;
                int i16 = cursorB.getInt(i15);
                iB22 = i15;
                int i17 = iB23;
                String string4 = cursorB.isNull(i17) ? null : cursorB.getString(i17);
                iB23 = i17;
                int i18 = iB24;
                NetworkType networkTypeD = WorkTypeConverters.d(cursorB.getInt(i18));
                iB24 = i18;
                int i19 = iB25;
                NetworkRequestCompat networkRequestCompatJ = WorkTypeConverters.j(cursorB.getBlob(i19));
                iB25 = i19;
                int i20 = iB26;
                boolean z2 = cursorB.getInt(i20) != 0;
                iB26 = i20;
                int i21 = iB27;
                boolean z3 = cursorB.getInt(i21) != 0;
                iB27 = i21;
                int i22 = iB28;
                boolean z4 = cursorB.getInt(i22) != 0;
                iB28 = i22;
                int i23 = iB29;
                boolean z5 = cursorB.getInt(i23) != 0;
                iB29 = i23;
                int i24 = iB30;
                long j9 = cursorB.getLong(i24);
                iB30 = i24;
                int i25 = iB31;
                long j10 = cursorB.getLong(i25);
                iB31 = i25;
                int i26 = iB32;
                iB32 = i26;
                arrayList.add(new WorkSpec(string, stateF, string2, string3, dataA, dataA2, j, j2, j3, new Constraints(networkRequestCompatJ, networkTypeD, z2, z3, z4, z5, j9, j10, WorkTypeConverters.a(cursorB.getBlob(i26))), i2, backoffPolicyC, j4, j5, j6, j7, z, outOfQuotaPolicyE, i9, i11, j8, i14, i16, string4));
                iB13 = i4;
                i = i3;
            }
            cursorB.close();
            roomSQLiteQuery.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final WorkSpec t(String str) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT * FROM workspec WHERE id=?");
        roomSQLiteQueryA.z(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
        workDatabase_Impl.b();
        Cursor cursorB = DBUtil.b(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            iB = CursorUtil.b(cursorB, "id");
            iB2 = CursorUtil.b(cursorB, "state");
            iB3 = CursorUtil.b(cursorB, "worker_class_name");
            iB4 = CursorUtil.b(cursorB, "input_merger_class_name");
            iB5 = CursorUtil.b(cursorB, "input");
            iB6 = CursorUtil.b(cursorB, "output");
            iB7 = CursorUtil.b(cursorB, "initial_delay");
            iB8 = CursorUtil.b(cursorB, "interval_duration");
            iB9 = CursorUtil.b(cursorB, "flex_duration");
            iB10 = CursorUtil.b(cursorB, "run_attempt_count");
            iB11 = CursorUtil.b(cursorB, "backoff_policy");
            iB12 = CursorUtil.b(cursorB, "backoff_delay_duration");
            iB13 = CursorUtil.b(cursorB, "last_enqueue_time");
            roomSQLiteQuery = roomSQLiteQueryA;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = roomSQLiteQueryA;
        }
        try {
            int iB14 = CursorUtil.b(cursorB, "minimum_retention_duration");
            int iB15 = CursorUtil.b(cursorB, "schedule_requested_at");
            int iB16 = CursorUtil.b(cursorB, "run_in_foreground");
            int iB17 = CursorUtil.b(cursorB, "out_of_quota_policy");
            int iB18 = CursorUtil.b(cursorB, "period_count");
            int iB19 = CursorUtil.b(cursorB, "generation");
            int iB20 = CursorUtil.b(cursorB, "next_schedule_time_override");
            int iB21 = CursorUtil.b(cursorB, "next_schedule_time_override_generation");
            int iB22 = CursorUtil.b(cursorB, "stop_reason");
            int iB23 = CursorUtil.b(cursorB, "trace_tag");
            int iB24 = CursorUtil.b(cursorB, "required_network_type");
            int iB25 = CursorUtil.b(cursorB, "required_network_request");
            int iB26 = CursorUtil.b(cursorB, "requires_charging");
            int iB27 = CursorUtil.b(cursorB, "requires_device_idle");
            int iB28 = CursorUtil.b(cursorB, "requires_battery_not_low");
            int iB29 = CursorUtil.b(cursorB, "requires_storage_not_low");
            int iB30 = CursorUtil.b(cursorB, "trigger_content_update_delay");
            int iB31 = CursorUtil.b(cursorB, "trigger_max_content_delay");
            int iB32 = CursorUtil.b(cursorB, "content_uri_triggers");
            WorkSpec workSpec = null;
            if (cursorB.moveToFirst()) {
                workSpec = new WorkSpec(cursorB.getString(iB), WorkTypeConverters.f(cursorB.getInt(iB2)), cursorB.getString(iB3), cursorB.getString(iB4), Data.a(cursorB.getBlob(iB5)), Data.a(cursorB.getBlob(iB6)), cursorB.getLong(iB7), cursorB.getLong(iB8), cursorB.getLong(iB9), new Constraints(WorkTypeConverters.j(cursorB.getBlob(iB25)), WorkTypeConverters.d(cursorB.getInt(iB24)), cursorB.getInt(iB26) != 0, cursorB.getInt(iB27) != 0, cursorB.getInt(iB28) != 0, cursorB.getInt(iB29) != 0, cursorB.getLong(iB30), cursorB.getLong(iB31), WorkTypeConverters.a(cursorB.getBlob(iB32))), cursorB.getInt(iB10), WorkTypeConverters.c(cursorB.getInt(iB11)), cursorB.getLong(iB12), cursorB.getLong(iB13), cursorB.getLong(iB14), cursorB.getLong(iB15), cursorB.getInt(iB16) != 0, WorkTypeConverters.e(cursorB.getInt(iB17)), cursorB.getInt(iB18), cursorB.getInt(iB19), cursorB.getLong(iB20), cursorB.getInt(iB21), cursorB.getInt(iB22), cursorB.isNull(iB23) ? null : cursorB.getString(iB23));
            }
            cursorB.close();
            roomSQLiteQuery.release();
            return workSpec;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int u() {
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.m;
        SupportSQLiteStatement supportSQLiteStatementA = sharedSQLiteStatement.a();
        try {
            workDatabase_Impl.c();
            try {
                int iP = supportSQLiteStatementA.P();
                workDatabase_Impl.r();
                return iP;
            } finally {
                workDatabase_Impl.l();
            }
        } finally {
            sharedSQLiteStatement.c(supportSQLiteStatementA);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList v() {
        new StringBuilder().append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        throw null;
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList w() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        roomSQLiteQueryA.C0(1, 200);
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
        workDatabase_Impl.b();
        Cursor cursorB = DBUtil.b(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            int iB = CursorUtil.b(cursorB, "id");
            int iB2 = CursorUtil.b(cursorB, "state");
            int iB3 = CursorUtil.b(cursorB, "worker_class_name");
            int iB4 = CursorUtil.b(cursorB, "input_merger_class_name");
            int iB5 = CursorUtil.b(cursorB, "input");
            int iB6 = CursorUtil.b(cursorB, "output");
            int iB7 = CursorUtil.b(cursorB, "initial_delay");
            int iB8 = CursorUtil.b(cursorB, "interval_duration");
            int iB9 = CursorUtil.b(cursorB, "flex_duration");
            int iB10 = CursorUtil.b(cursorB, "run_attempt_count");
            int iB11 = CursorUtil.b(cursorB, "backoff_policy");
            int iB12 = CursorUtil.b(cursorB, "backoff_delay_duration");
            int iB13 = CursorUtil.b(cursorB, "last_enqueue_time");
            roomSQLiteQuery = roomSQLiteQueryA;
            try {
                int iB14 = CursorUtil.b(cursorB, "minimum_retention_duration");
                int iB15 = CursorUtil.b(cursorB, "schedule_requested_at");
                int iB16 = CursorUtil.b(cursorB, "run_in_foreground");
                int iB17 = CursorUtil.b(cursorB, "out_of_quota_policy");
                int iB18 = CursorUtil.b(cursorB, "period_count");
                int iB19 = CursorUtil.b(cursorB, "generation");
                int iB20 = CursorUtil.b(cursorB, "next_schedule_time_override");
                int iB21 = CursorUtil.b(cursorB, "next_schedule_time_override_generation");
                int iB22 = CursorUtil.b(cursorB, "stop_reason");
                int iB23 = CursorUtil.b(cursorB, "trace_tag");
                int iB24 = CursorUtil.b(cursorB, "required_network_type");
                int iB25 = CursorUtil.b(cursorB, "required_network_request");
                int iB26 = CursorUtil.b(cursorB, "requires_charging");
                int iB27 = CursorUtil.b(cursorB, "requires_device_idle");
                int iB28 = CursorUtil.b(cursorB, "requires_battery_not_low");
                int iB29 = CursorUtil.b(cursorB, "requires_storage_not_low");
                int iB30 = CursorUtil.b(cursorB, "trigger_content_update_delay");
                int iB31 = CursorUtil.b(cursorB, "trigger_max_content_delay");
                int iB32 = CursorUtil.b(cursorB, "content_uri_triggers");
                int i = iB14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(iB);
                    WorkInfo.State stateF = WorkTypeConverters.f(cursorB.getInt(iB2));
                    String string2 = cursorB.getString(iB3);
                    String string3 = cursorB.getString(iB4);
                    Data dataA = Data.a(cursorB.getBlob(iB5));
                    Data dataA2 = Data.a(cursorB.getBlob(iB6));
                    long j = cursorB.getLong(iB7);
                    long j2 = cursorB.getLong(iB8);
                    long j3 = cursorB.getLong(iB9);
                    int i2 = cursorB.getInt(iB10);
                    BackoffPolicy backoffPolicyC = WorkTypeConverters.c(cursorB.getInt(iB11));
                    long j4 = cursorB.getLong(iB12);
                    long j5 = cursorB.getLong(iB13);
                    int i3 = i;
                    long j6 = cursorB.getLong(i3);
                    int i4 = iB12;
                    int i5 = iB15;
                    long j7 = cursorB.getLong(i5);
                    iB15 = i5;
                    int i6 = iB16;
                    boolean z = cursorB.getInt(i6) != 0;
                    iB16 = i6;
                    int i7 = iB17;
                    OutOfQuotaPolicy outOfQuotaPolicyE = WorkTypeConverters.e(cursorB.getInt(i7));
                    iB17 = i7;
                    int i8 = iB18;
                    int i9 = cursorB.getInt(i8);
                    iB18 = i8;
                    int i10 = iB19;
                    int i11 = cursorB.getInt(i10);
                    iB19 = i10;
                    int i12 = iB20;
                    long j8 = cursorB.getLong(i12);
                    iB20 = i12;
                    int i13 = iB21;
                    int i14 = cursorB.getInt(i13);
                    iB21 = i13;
                    int i15 = iB22;
                    int i16 = cursorB.getInt(i15);
                    iB22 = i15;
                    int i17 = iB23;
                    String string4 = cursorB.isNull(i17) ? null : cursorB.getString(i17);
                    iB23 = i17;
                    int i18 = iB24;
                    NetworkType networkTypeD = WorkTypeConverters.d(cursorB.getInt(i18));
                    iB24 = i18;
                    int i19 = iB25;
                    NetworkRequestCompat networkRequestCompatJ = WorkTypeConverters.j(cursorB.getBlob(i19));
                    iB25 = i19;
                    int i20 = iB26;
                    boolean z2 = cursorB.getInt(i20) != 0;
                    iB26 = i20;
                    int i21 = iB27;
                    boolean z3 = cursorB.getInt(i21) != 0;
                    iB27 = i21;
                    int i22 = iB28;
                    boolean z4 = cursorB.getInt(i22) != 0;
                    iB28 = i22;
                    int i23 = iB29;
                    boolean z5 = cursorB.getInt(i23) != 0;
                    iB29 = i23;
                    int i24 = iB30;
                    long j9 = cursorB.getLong(i24);
                    iB30 = i24;
                    int i25 = iB31;
                    long j10 = cursorB.getLong(i25);
                    iB31 = i25;
                    int i26 = iB32;
                    iB32 = i26;
                    arrayList.add(new WorkSpec(string, stateF, string2, string3, dataA, dataA2, j, j2, j3, new Constraints(networkRequestCompatJ, networkTypeD, z2, z3, z4, z5, j9, j10, WorkTypeConverters.a(cursorB.getBlob(i26))), i2, backoffPolicyC, j4, j5, j6, j7, z, outOfQuotaPolicyE, i9, i11, j8, i14, i16, string4));
                    iB12 = i4;
                    i = i3;
                }
                cursorB.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryA;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList x(String str) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        roomSQLiteQueryA.z(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
        workDatabase_Impl.b();
        Cursor cursorB = DBUtil.b(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String id = cursorB.getString(0);
                WorkInfo.State stateF = WorkTypeConverters.f(cursorB.getInt(1));
                Intrinsics.h(id, "id");
                WorkSpec.IdAndState idAndState = new WorkSpec.IdAndState();
                idAndState.f3991a = id;
                idAndState.b = stateF;
                arrayList.add(idAndState);
            }
            return arrayList;
        } finally {
            cursorB.close();
            roomSQLiteQueryA.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final Flow y() {
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        Callable<Boolean> callable = new Callable<Boolean>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.25
            @Override // java.util.concurrent.Callable
            public final Boolean call() {
                Boolean boolValueOf;
                Cursor cursorB = DBUtil.b(WorkSpecDao_Impl.this.f3993a, roomSQLiteQueryA, false);
                try {
                    if (cursorB.moveToFirst()) {
                        boolValueOf = Boolean.valueOf(cursorB.getInt(0) != 0);
                    } else {
                        boolValueOf = Boolean.FALSE;
                    }
                    cursorB.close();
                    return boolValueOf;
                } catch (Throwable th) {
                    cursorB.close();
                    throw th;
                }
            }

            public final void finalize() {
                roomSQLiteQueryA.release();
            }
        };
        return CoroutinesRoom.Companion.a(this.f3993a, false, new String[]{"workspec"}, callable);
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList z(int i) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        roomSQLiteQueryA.C0(1, i);
        WorkDatabase_Impl workDatabase_Impl = this.f3993a;
        workDatabase_Impl.b();
        Cursor cursorB = DBUtil.b(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            int iB = CursorUtil.b(cursorB, "id");
            int iB2 = CursorUtil.b(cursorB, "state");
            int iB3 = CursorUtil.b(cursorB, "worker_class_name");
            int iB4 = CursorUtil.b(cursorB, "input_merger_class_name");
            int iB5 = CursorUtil.b(cursorB, "input");
            int iB6 = CursorUtil.b(cursorB, "output");
            int iB7 = CursorUtil.b(cursorB, "initial_delay");
            int iB8 = CursorUtil.b(cursorB, "interval_duration");
            int iB9 = CursorUtil.b(cursorB, "flex_duration");
            int iB10 = CursorUtil.b(cursorB, "run_attempt_count");
            int iB11 = CursorUtil.b(cursorB, "backoff_policy");
            int iB12 = CursorUtil.b(cursorB, "backoff_delay_duration");
            int iB13 = CursorUtil.b(cursorB, "last_enqueue_time");
            roomSQLiteQuery = roomSQLiteQueryA;
            try {
                int iB14 = CursorUtil.b(cursorB, "minimum_retention_duration");
                int iB15 = CursorUtil.b(cursorB, "schedule_requested_at");
                int iB16 = CursorUtil.b(cursorB, "run_in_foreground");
                int iB17 = CursorUtil.b(cursorB, "out_of_quota_policy");
                int iB18 = CursorUtil.b(cursorB, "period_count");
                int iB19 = CursorUtil.b(cursorB, "generation");
                int iB20 = CursorUtil.b(cursorB, "next_schedule_time_override");
                int iB21 = CursorUtil.b(cursorB, "next_schedule_time_override_generation");
                int iB22 = CursorUtil.b(cursorB, "stop_reason");
                int iB23 = CursorUtil.b(cursorB, "trace_tag");
                int iB24 = CursorUtil.b(cursorB, "required_network_type");
                int iB25 = CursorUtil.b(cursorB, "required_network_request");
                int iB26 = CursorUtil.b(cursorB, "requires_charging");
                int iB27 = CursorUtil.b(cursorB, "requires_device_idle");
                int iB28 = CursorUtil.b(cursorB, "requires_battery_not_low");
                int iB29 = CursorUtil.b(cursorB, "requires_storage_not_low");
                int iB30 = CursorUtil.b(cursorB, "trigger_content_update_delay");
                int iB31 = CursorUtil.b(cursorB, "trigger_max_content_delay");
                int iB32 = CursorUtil.b(cursorB, "content_uri_triggers");
                int i2 = iB14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(iB);
                    WorkInfo.State stateF = WorkTypeConverters.f(cursorB.getInt(iB2));
                    String string2 = cursorB.getString(iB3);
                    String string3 = cursorB.getString(iB4);
                    Data dataA = Data.a(cursorB.getBlob(iB5));
                    Data dataA2 = Data.a(cursorB.getBlob(iB6));
                    long j = cursorB.getLong(iB7);
                    long j2 = cursorB.getLong(iB8);
                    long j3 = cursorB.getLong(iB9);
                    int i3 = cursorB.getInt(iB10);
                    BackoffPolicy backoffPolicyC = WorkTypeConverters.c(cursorB.getInt(iB11));
                    long j4 = cursorB.getLong(iB12);
                    long j5 = cursorB.getLong(iB13);
                    int i4 = i2;
                    long j6 = cursorB.getLong(i4);
                    int i5 = iB12;
                    int i6 = iB15;
                    long j7 = cursorB.getLong(i6);
                    iB15 = i6;
                    int i7 = iB16;
                    boolean z = cursorB.getInt(i7) != 0;
                    iB16 = i7;
                    int i8 = iB17;
                    OutOfQuotaPolicy outOfQuotaPolicyE = WorkTypeConverters.e(cursorB.getInt(i8));
                    iB17 = i8;
                    int i9 = iB18;
                    int i10 = cursorB.getInt(i9);
                    iB18 = i9;
                    int i11 = iB19;
                    int i12 = cursorB.getInt(i11);
                    iB19 = i11;
                    int i13 = iB20;
                    long j8 = cursorB.getLong(i13);
                    iB20 = i13;
                    int i14 = iB21;
                    int i15 = cursorB.getInt(i14);
                    iB21 = i14;
                    int i16 = iB22;
                    int i17 = cursorB.getInt(i16);
                    iB22 = i16;
                    int i18 = iB23;
                    String string4 = cursorB.isNull(i18) ? null : cursorB.getString(i18);
                    iB23 = i18;
                    int i19 = iB24;
                    NetworkType networkTypeD = WorkTypeConverters.d(cursorB.getInt(i19));
                    iB24 = i19;
                    int i20 = iB25;
                    NetworkRequestCompat networkRequestCompatJ = WorkTypeConverters.j(cursorB.getBlob(i20));
                    iB25 = i20;
                    int i21 = iB26;
                    boolean z2 = cursorB.getInt(i21) != 0;
                    iB26 = i21;
                    int i22 = iB27;
                    boolean z3 = cursorB.getInt(i22) != 0;
                    iB27 = i22;
                    int i23 = iB28;
                    boolean z4 = cursorB.getInt(i23) != 0;
                    iB28 = i23;
                    int i24 = iB29;
                    boolean z5 = cursorB.getInt(i24) != 0;
                    iB29 = i24;
                    int i25 = iB30;
                    long j9 = cursorB.getLong(i25);
                    iB30 = i25;
                    int i26 = iB31;
                    long j10 = cursorB.getLong(i26);
                    iB31 = i26;
                    int i27 = iB32;
                    iB32 = i27;
                    arrayList.add(new WorkSpec(string, stateF, string2, string3, dataA, dataA2, j, j2, j3, new Constraints(networkRequestCompatJ, networkTypeD, z2, z3, z4, z5, j9, j10, WorkTypeConverters.a(cursorB.getBlob(i27))), i3, backoffPolicyC, j4, j5, j6, j7, z, outOfQuotaPolicyE, i10, i12, j8, i15, i17, string4));
                    iB12 = i5;
                    i2 = i4;
                }
                cursorB.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryA;
        }
    }
}
