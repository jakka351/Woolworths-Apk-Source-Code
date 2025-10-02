package me.oriient.internal.infra.observable.java;

import androidx.annotation.Keep;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lme/oriient/internal/infra/observable/java/ObservableOperationJob;", "Lme/oriient/internal/infra/observable/java/ObservableOperation;", "job", "Lkotlinx/coroutines/Job;", "(Lkotlinx/coroutines/Job;)V", "cancel", "", "isActive", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ObservableOperationJob implements ObservableOperation {

    @NotNull
    private final Job job;

    public ObservableOperationJob(@NotNull Job job) {
        Intrinsics.h(job, "job");
        this.job = job;
    }

    @Override // me.oriient.internal.infra.observable.java.ObservableOperation
    public void cancel() {
        this.job.cancel((CancellationException) null);
    }

    @Override // me.oriient.internal.infra.observable.java.ObservableOperation
    public boolean isActive() {
        return this.job.isActive();
    }
}
