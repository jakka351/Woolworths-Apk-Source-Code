package me.oriient.internal.services.uploadingManager.scheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledJob;", "Landroid/app/job/JobService;", "()V", "onStartJob", "", "params", "Landroid/app/job/JobParameters;", "onStopJob", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DataUploadScheduledJob extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(@NotNull JobParameters params) {
        Intrinsics.h(params, "params");
        BuildersKt.c(GlobalScope.d, null, null, new c(this, params, null), 3);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@NotNull JobParameters params) {
        Intrinsics.h(params, "params");
        return true;
    }
}
