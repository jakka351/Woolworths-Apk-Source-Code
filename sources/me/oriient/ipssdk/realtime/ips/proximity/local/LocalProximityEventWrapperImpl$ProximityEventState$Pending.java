package me.oriient.ipssdk.realtime.ips.proximity.local;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import me.oriient.ipssdk.realtime.ofs.AbstractC1733u2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"me/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventWrapperImpl$ProximityEventState$Pending", "Lme/oriient/ipssdk/realtime/ofs/u2;", "", "sinceMillis", "Lkotlinx/coroutines/Job;", "job", "<init>", "(JLkotlinx/coroutines/Job;)V", "a", "J", "getSinceMillis", "()J", "b", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LocalProximityEventWrapperImpl$ProximityEventState$Pending extends AbstractC1733u2 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long sinceMillis;

    /* renamed from: b, reason: from kotlin metadata */
    private final Job job;

    public LocalProximityEventWrapperImpl$ProximityEventState$Pending(long j, @NotNull Job job) {
        Intrinsics.h(job, "job");
        this.sinceMillis = j;
        this.job = job;
    }

    @NotNull
    public final Job getJob() {
        return this.job;
    }

    public final long getSinceMillis() {
        return this.sinceMillis;
    }
}
