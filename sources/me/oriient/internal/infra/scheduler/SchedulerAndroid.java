package me.oriient.internal.infra.scheduler;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.impl.utils.CancelWorkRunnable;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.utils.core.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0011\u001a\u00020\f\"\b\b\u0000\u0010\u0012*\u00020\u00132\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lme/oriient/internal/infra/scheduler/SchedulerAndroid;", "Lme/oriient/internal/infra/scheduler/Scheduler;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "logger", "Lme/oriient/internal/infra/utils/core/Logger;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "setLogger", "(Lme/oriient/internal/infra/utils/core/Logger;)V", "cancel", "", "tag", "Lme/oriient/internal/infra/scheduler/WorkTag;", "cancel-OTYe2P0", "(Ljava/lang/String;)V", "schedule", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lme/oriient/internal/infra/scheduler/Work;", "clazz", "Ljava/lang/Class;", "options", "Lme/oriient/internal/infra/scheduler/ScheduleOptions;", "schedule-PsKN-H0", "(Ljava/lang/String;Ljava/lang/Class;Lme/oriient/internal/infra/scheduler/ScheduleOptions;)V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SchedulerAndroid implements Scheduler {

    @NotNull
    private final Context context;

    @Nullable
    private Logger logger;

    public SchedulerAndroid(@NotNull Context context) {
        Intrinsics.h(context, "context");
        this.context = context;
    }

    @Override // me.oriient.internal.infra.scheduler.Scheduler
    /* renamed from: cancel-OTYe2P0 */
    public void mo360cancelOTYe2P0(@NotNull String tag) {
        Intrinsics.h(tag, "tag");
        Logger logger = getLogger();
        if (logger != null) {
            logger.d("SchedulerAndroid", "cancel() called with: tag = " + ((Object) WorkTag.m367toStringimpl(tag)));
        }
        try {
            CancelWorkRunnable.d(WorkManager.Companion.a(this.context), tag);
        } catch (Exception e) {
            Logger logger2 = getLogger();
            if (logger2 != null) {
                logger2.e("SchedulerAndroid", "failed to cancel work " + ((Object) WorkTag.m367toStringimpl(tag)) + ": " + e.getMessage());
            }
        }
    }

    @Override // me.oriient.internal.infra.scheduler.Scheduler
    @Nullable
    public Logger getLogger() {
        return this.logger;
    }

    @Override // me.oriient.internal.infra.scheduler.Scheduler
    /* renamed from: schedule-PsKN-H0 */
    public <T extends Work> void mo361schedulePsKNH0(@NotNull String tag, @NotNull Class<T> clazz, @NotNull ScheduleOptions options) {
        androidx.work.ExistingWorkPolicy existingWorkPolicy;
        Intrinsics.h(tag, "tag");
        Intrinsics.h(clazz, "clazz");
        Intrinsics.h(options, "options");
        Logger logger = getLogger();
        if (logger != null) {
            logger.d("SchedulerAndroid", "schedule() called with: tag = " + ((Object) WorkTag.m367toStringimpl(tag)) + ", clazz = " + clazz + ", options = " + options);
        }
        Constraints.Builder builder = new Constraints.Builder();
        if (options.getAllowMeteredNetworks()) {
            builder.b(NetworkType.e);
        } else {
            builder.b(NetworkType.f);
        }
        builder.f3894a = options.getRequireCharger();
        int i = b.$EnumSwitchMapping$0[options.getExistingWorkPolicy().ordinal()];
        if (i == 1) {
            existingWorkPolicy = androidx.work.ExistingWorkPolicy.e;
        } else if (i == 2) {
            existingWorkPolicy = androidx.work.ExistingWorkPolicy.d;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            existingWorkPolicy = androidx.work.ExistingWorkPolicy.f;
        }
        OneTimeWorkRequest.Builder builder2 = new OneTimeWorkRequest.Builder(WorkWrapper.class);
        builder2.c.j = builder.a();
        Data.Builder builder3 = new Data.Builder();
        builder3.d("workerClassName", clazz.getCanonicalName());
        builder2.c.e = builder3.a();
        WorkManager.Companion.a(this.context).c(tag, existingWorkPolicy, (OneTimeWorkRequest) builder2.a());
    }

    @Override // me.oriient.internal.infra.scheduler.Scheduler
    public void setLogger(@Nullable Logger logger) {
        this.logger = logger;
    }
}
