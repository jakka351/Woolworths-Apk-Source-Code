package androidx.work;

import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/WorkRequest;", "", "Builder", "Companion", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class WorkRequest {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f3911a;
    public final WorkSpec b;
    public final Set c;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/work/WorkRequest$Builder;", "B", "Landroidx/work/WorkRequest;", "W", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static abstract class Builder<B extends Builder<B, ?>, W extends WorkRequest> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3912a;
        public UUID b;
        public WorkSpec c;
        public final LinkedHashSet d;

        public Builder(Class cls) {
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.g(uuidRandomUUID, "randomUUID()");
            this.b = uuidRandomUUID;
            String string = this.b.toString();
            Intrinsics.g(string, "id.toString()");
            this.c = new WorkSpec(string, (WorkInfo.State) null, cls.getName(), (String) null, (Data) null, (Data) null, 0L, 0L, 0L, (Constraints) null, 0, (BackoffPolicy) null, 0L, 0L, 0L, 0L, false, (OutOfQuotaPolicy) null, 0, 0L, 0, 0, (String) null, 16777210);
            this.d = SetsKt.f(cls.getName());
        }

        public final WorkRequest a() {
            WorkRequest workRequestB = b();
            Constraints constraints = this.c.j;
            boolean z = constraints.b() || constraints.e || constraints.c || constraints.d;
            WorkSpec workSpec = this.c;
            if (workSpec.q) {
                if (z) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (workSpec.g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            if (workSpec.x == null) {
                List listT = StringsKt.T(workSpec.c, new String[]{"."}, 6);
                String strF0 = listT.size() == 1 ? (String) listT.get(0) : (String) CollectionsKt.O(listT);
                if (strF0.length() > 127) {
                    strF0 = StringsKt.f0(127, strF0);
                }
                workSpec.x = strF0;
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.g(uuidRandomUUID, "randomUUID()");
            this.b = uuidRandomUUID;
            String string = uuidRandomUUID.toString();
            Intrinsics.g(string, "id.toString()");
            WorkSpec other = this.c;
            Intrinsics.h(other, "other");
            this.c = new WorkSpec(string, other.b, other.c, other.d, new Data(other.e), new Data(other.f), other.g, other.h, other.i, new Constraints(other.j), other.k, other.l, other.m, other.n, other.o, other.p, other.q, other.r, other.s, other.u, other.v, other.w, other.x, 524288);
            return workRequestB;
        }

        public abstract WorkRequest b();

        public abstract Builder c();

        public final Builder d(long j, TimeUnit timeUnit) {
            Intrinsics.h(timeUnit, "timeUnit");
            this.f3912a = true;
            WorkSpec workSpec = this.c;
            workSpec.l = BackoffPolicy.e;
            long millis = timeUnit.toMillis(j);
            String str = WorkSpec.y;
            if (millis > 18000000) {
                Logger.e().h(str, "Backoff delay duration exceeds maximum value");
            }
            if (millis < 10000) {
                Logger.e().h(str, "Backoff delay duration less than minimum value");
            }
            workSpec.m = RangesKt.e(millis, 10000L, 18000000L);
            return c();
        }

        public final Builder e(Constraints constraints) {
            Intrinsics.h(constraints, "constraints");
            this.c.j = constraints;
            return (OneTimeWorkRequest.Builder) this;
        }

        public final Builder f(long j, TimeUnit timeUnit) {
            Intrinsics.h(timeUnit, "timeUnit");
            this.c.g = timeUnit.toMillis(j);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.c.g) {
                return c();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"Landroidx/work/WorkRequest$Companion;", "", "", "DEFAULT_BACKOFF_DELAY_MILLIS", "J", "MAX_BACKOFF_MILLIS", "", "MAX_TRACE_SPAN_LENGTH", "I", "MIN_BACKOFF_MILLIS", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public WorkRequest(UUID id, WorkSpec workSpec, LinkedHashSet tags) {
        Intrinsics.h(id, "id");
        Intrinsics.h(workSpec, "workSpec");
        Intrinsics.h(tags, "tags");
        this.f3911a = id;
        this.b = workSpec;
        this.c = tags;
    }
}
