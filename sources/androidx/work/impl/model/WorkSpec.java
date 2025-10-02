package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.Entity;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/work/impl/model/WorkSpec;", "", "Companion", "IdAndState", "WorkInfoPojo", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Entity
@RestrictTo
@SourceDebugExtension
/* loaded from: classes.dex */
public final /* data */ class WorkSpec {
    public static final String y;
    public static final a z;

    /* renamed from: a, reason: collision with root package name */
    public final String f3990a;
    public WorkInfo.State b;
    public final String c;
    public final String d;
    public Data e;
    public final Data f;
    public long g;
    public final long h;
    public final long i;
    public Constraints j;
    public final int k;
    public BackoffPolicy l;
    public long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public final OutOfQuotaPolicy r;
    public final int s;
    public final int t;
    public final long u;
    public final int v;
    public final int w;
    public String x;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R,\u0010\f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/work/impl/model/WorkSpec$Companion;", "", "", "SCHEDULE_NOT_REQUESTED_YET", "J", "", "TAG", "Ljava/lang/String;", "Landroidx/arch/core/util/Function;", "", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "Landroidx/work/WorkInfo;", "WORK_INFO_MAPPER", "Landroidx/arch/core/util/Function;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static long a(boolean z, int i, BackoffPolicy backoffPolicy, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
            Intrinsics.h(backoffPolicy, "backoffPolicy");
            if (j6 != Long.MAX_VALUE && z2) {
                if (i2 != 0) {
                    long j7 = j2 + 900000;
                    if (j6 < j7) {
                        return j7;
                    }
                }
                return j6;
            }
            if (z) {
                long jScalb = backoffPolicy == BackoffPolicy.e ? j * i : (long) Math.scalb(j, i - 1);
                if (jScalb > 18000000) {
                    jScalb = 18000000;
                }
                return j2 + jScalb;
            }
            if (z2) {
                long j8 = i2 == 0 ? j2 + j3 : j2 + j5;
                return (j4 == j5 || i2 != 0) ? j8 : (j5 - j4) + j8;
            }
            if (j2 == -1) {
                return Long.MAX_VALUE;
            }
            return j2 + j3;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/model/WorkSpec$IdAndState;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class IdAndState {

        /* renamed from: a, reason: collision with root package name */
        public String f3991a;
        public WorkInfo.State b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) obj;
            return Intrinsics.c(this.f3991a, idAndState.f3991a) && this.b == idAndState.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f3991a.hashCode() * 31);
        }

        public final String toString() {
            return "IdAndState(id=" + this.f3991a + ", state=" + this.b + ')';
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class WorkInfoPojo {

        /* renamed from: a, reason: collision with root package name */
        public final String f3992a;
        public final WorkInfo.State b;
        public final Data c;
        public final long d;
        public final long e;
        public final long f;
        public final Constraints g;
        public final int h;
        public final BackoffPolicy i;
        public final long j;
        public final long k;
        public final int l;
        public final int m;
        public final long n;
        public final int o;
        public final List p;
        public final List q;

        public WorkInfoPojo(String id, WorkInfo.State state, Data output, long j, long j2, long j3, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j4, long j5, int i2, int i3, long j6, int i4, ArrayList tags, ArrayList progress) {
            Intrinsics.h(id, "id");
            Intrinsics.h(state, "state");
            Intrinsics.h(output, "output");
            Intrinsics.h(backoffPolicy, "backoffPolicy");
            Intrinsics.h(tags, "tags");
            Intrinsics.h(progress, "progress");
            this.f3992a = id;
            this.b = state;
            this.c = output;
            this.d = j;
            this.e = j2;
            this.f = j3;
            this.g = constraints;
            this.h = i;
            this.i = backoffPolicy;
            this.j = j4;
            this.k = j5;
            this.l = i2;
            this.m = i3;
            this.n = j6;
            this.o = i4;
            this.p = tags;
            this.q = progress;
        }

        public final WorkInfo a() {
            int i;
            long j;
            long jA;
            boolean z;
            List list = this.q;
            Data data = !list.isEmpty() ? (Data) list.get(0) : Data.b;
            UUID uuidFromString = UUID.fromString(this.f3992a);
            Intrinsics.g(uuidFromString, "fromString(id)");
            HashSet hashSet = new HashSet(this.p);
            long j2 = this.e;
            WorkInfo.PeriodicityInfo periodicityInfo = j2 != 0 ? new WorkInfo.PeriodicityInfo(j2, this.f) : null;
            int i2 = this.h;
            long j3 = this.d;
            WorkInfo.State state = this.b;
            WorkInfo.State state2 = WorkInfo.State.d;
            if (state == state2) {
                String str = WorkSpec.y;
                if (state != state2 || i2 <= 0) {
                    i = i2;
                    z = false;
                } else {
                    i = i2;
                    z = true;
                }
                j = j3;
                jA = Companion.a(z, i, this.i, this.j, this.k, this.l, j2 != 0, j, this.f, j2, this.n);
            } else {
                i = i2;
                j = j3;
                jA = Long.MAX_VALUE;
            }
            return new WorkInfo(uuidFromString, this.b, hashSet, this.c, data, i, this.m, this.g, j, periodicityInfo, jA, this.o);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkInfoPojo)) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) obj;
            return Intrinsics.c(this.f3992a, workInfoPojo.f3992a) && this.b == workInfoPojo.b && Intrinsics.c(this.c, workInfoPojo.c) && this.d == workInfoPojo.d && this.e == workInfoPojo.e && this.f == workInfoPojo.f && Intrinsics.c(this.g, workInfoPojo.g) && this.h == workInfoPojo.h && this.i == workInfoPojo.i && this.j == workInfoPojo.j && this.k == workInfoPojo.k && this.l == workInfoPojo.l && this.m == workInfoPojo.m && this.n == workInfoPojo.n && this.o == workInfoPojo.o && Intrinsics.c(this.p, workInfoPojo.p) && Intrinsics.c(this.q, workInfoPojo.q);
        }

        public final int hashCode() {
            return this.q.hashCode() + androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.a(this.o, androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.a(this.m, androidx.camera.core.impl.b.a(this.l, androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b((this.i.hashCode() + androidx.camera.core.impl.b.a(this.h, (this.g.hashCode() + androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b((this.c.hashCode() + ((this.b.hashCode() + (this.f3992a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31, 31)) * 31, 31, this.j), 31, this.k), 31), 31), 31, this.n), 31), 31, this.p);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WorkInfoPojo(id=");
            sb.append(this.f3992a);
            sb.append(", state=");
            sb.append(this.b);
            sb.append(", output=");
            sb.append(this.c);
            sb.append(", initialDelay=");
            sb.append(this.d);
            sb.append(", intervalDuration=");
            sb.append(this.e);
            sb.append(", flexDuration=");
            sb.append(this.f);
            sb.append(", constraints=");
            sb.append(this.g);
            sb.append(", runAttemptCount=");
            sb.append(this.h);
            sb.append(", backoffPolicy=");
            sb.append(this.i);
            sb.append(", backoffDelayDuration=");
            sb.append(this.j);
            sb.append(", lastEnqueueTime=");
            sb.append(this.k);
            sb.append(", periodCount=");
            sb.append(this.l);
            sb.append(", generation=");
            sb.append(this.m);
            sb.append(", nextScheduleTimeOverride=");
            sb.append(this.n);
            sb.append(", stopReason=");
            sb.append(this.o);
            sb.append(", tags=");
            sb.append(this.p);
            sb.append(", progress=");
            return androidx.compose.ui.input.pointer.a.o(sb, this.q, ')');
        }
    }

    static {
        String strG = Logger.g("WorkSpec");
        Intrinsics.g(strG, "tagWithPrefix(\"WorkSpec\")");
        y = strG;
        z = new a();
    }

    public WorkSpec(String id, WorkInfo.State state, String workerClassName, String inputMergerClassName, Data input, Data output, long j, long j2, long j3, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z2, OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, long j8, int i4, int i5, String str) {
        Intrinsics.h(id, "id");
        Intrinsics.h(state, "state");
        Intrinsics.h(workerClassName, "workerClassName");
        Intrinsics.h(inputMergerClassName, "inputMergerClassName");
        Intrinsics.h(input, "input");
        Intrinsics.h(output, "output");
        Intrinsics.h(constraints, "constraints");
        Intrinsics.h(backoffPolicy, "backoffPolicy");
        Intrinsics.h(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f3990a = id;
        this.b = state;
        this.c = workerClassName;
        this.d = inputMergerClassName;
        this.e = input;
        this.f = output;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = constraints;
        this.k = i;
        this.l = backoffPolicy;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z2;
        this.r = outOfQuotaPolicy;
        this.s = i2;
        this.t = i3;
        this.u = j8;
        this.v = i4;
        this.w = i5;
        this.x = str;
    }

    public final long a() {
        return Companion.a(this.b == WorkInfo.State.d && this.k > 0, this.k, this.l, this.m, this.n, this.s, c(), this.g, this.i, this.h, this.u);
    }

    public final boolean b() {
        return !Intrinsics.c(Constraints.j, this.j);
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkSpec)) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) obj;
        return Intrinsics.c(this.f3990a, workSpec.f3990a) && this.b == workSpec.b && Intrinsics.c(this.c, workSpec.c) && Intrinsics.c(this.d, workSpec.d) && Intrinsics.c(this.e, workSpec.e) && Intrinsics.c(this.f, workSpec.f) && this.g == workSpec.g && this.h == workSpec.h && this.i == workSpec.i && Intrinsics.c(this.j, workSpec.j) && this.k == workSpec.k && this.l == workSpec.l && this.m == workSpec.m && this.n == workSpec.n && this.o == workSpec.o && this.p == workSpec.p && this.q == workSpec.q && this.r == workSpec.r && this.s == workSpec.s && this.t == workSpec.t && this.u == workSpec.u && this.v == workSpec.v && this.w == workSpec.w && Intrinsics.c(this.x, workSpec.x);
    }

    public final int hashCode() {
        int iA = androidx.camera.core.impl.b.a(this.w, androidx.camera.core.impl.b.a(this.v, androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.a(this.t, androidx.camera.core.impl.b.a(this.s, (this.r.hashCode() + androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b((this.l.hashCode() + androidx.camera.core.impl.b.a(this.k, (this.j.hashCode() + androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b((this.f.hashCode() + ((this.e.hashCode() + androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c((this.b.hashCode() + (this.f3990a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q)) * 31, 31), 31), 31, this.u), 31), 31);
        String str = this.x;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return androidx.camera.core.impl.b.r(new StringBuilder("{WorkSpec: "), this.f3990a, '}');
    }

    public /* synthetic */ WorkSpec(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j, long j2, long j3, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z2, OutOfQuotaPolicy outOfQuotaPolicy, int i2, long j8, int i3, int i4, String str4, int i5) {
        this(str, (i5 & 2) != 0 ? WorkInfo.State.d : state, str2, (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i5 & 16) != 0 ? Data.b : data, (i5 & 32) != 0 ? Data.b : data2, (i5 & 64) != 0 ? 0L : j, (i5 & 128) != 0 ? 0L : j2, (i5 & 256) != 0 ? 0L : j3, (i5 & 512) != 0 ? Constraints.j : constraints, (i5 & 1024) != 0 ? 0 : i, (i5 & 2048) != 0 ? BackoffPolicy.d : backoffPolicy, (i5 & 4096) != 0 ? 30000L : j4, (i5 & 8192) != 0 ? -1L : j5, (i5 & 16384) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z2, (131072 & i5) != 0 ? OutOfQuotaPolicy.d : outOfQuotaPolicy, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (i5 & 8388608) != 0 ? null : str4);
    }
}
