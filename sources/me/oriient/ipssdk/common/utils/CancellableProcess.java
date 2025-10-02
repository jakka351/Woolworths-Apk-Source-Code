package me.oriient.ipssdk.common.utils;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import me.oriient.ipssdk.api.models.IPSCancelable;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lme/oriient/ipssdk/common/utils/CancellableProcess;", "Lme/oriient/ipssdk/api/models/IPSCancelable;", "Lkotlinx/coroutines/Job;", "job", "<init>", "(Lkotlinx/coroutines/Job;)V", "", "cancel", "()V", "", "isCanceled", "()Z", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CancellableProcess implements IPSCancelable {

    /* renamed from: a, reason: collision with root package name */
    private final Job f25783a;

    public CancellableProcess(@NotNull Job job) {
        Intrinsics.h(job, "job");
        this.f25783a = job;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCancelable
    public void cancel() {
        this.f25783a.cancel((CancellationException) null);
    }

    @Override // me.oriient.ipssdk.api.models.IPSCancelable
    public boolean isCanceled() {
        return this.f25783a.isCancelled();
    }
}
