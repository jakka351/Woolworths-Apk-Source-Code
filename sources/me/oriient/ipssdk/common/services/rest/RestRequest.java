package me.oriient.ipssdk.common.services.rest;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.state.a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lme/oriient/ipssdk/common/services/rest/RestRequest;", "", "job", "Lkotlinx/coroutines/Job;", "(Lkotlinx/coroutines/Job;)V", "id", "", "getId$me_oriient_sdk_common", "()Ljava/lang/String;", "cancel", "", "isCanceled", "", "isCompleted", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RestRequest {

    @NotNull
    private final String id;

    @NotNull
    private final Job job;

    public RestRequest(@NotNull Job job) {
        Intrinsics.h(job, "job");
        this.job = job;
        this.id = a.h("toString(...)");
    }

    public final void cancel() {
        this.job.cancel((CancellationException) null);
    }

    @NotNull
    /* renamed from: getId$me_oriient_sdk_common, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean isCanceled() {
        return this.job.isCancelled();
    }

    public final boolean isCompleted() {
        return this.job.isCompleted();
    }
}
