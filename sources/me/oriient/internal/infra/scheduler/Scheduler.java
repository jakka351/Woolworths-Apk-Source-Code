package me.oriient.internal.infra.scheduler;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ<\u0010\u000e\u001a\u00020\t\"\b\b\u0000\u0010\u000f*\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Lme/oriient/internal/infra/scheduler/Scheduler;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "logger", "Lme/oriient/internal/infra/utils/core/Logger;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "setLogger", "(Lme/oriient/internal/infra/utils/core/Logger;)V", "cancel", "", "tag", "Lme/oriient/internal/infra/scheduler/WorkTag;", "cancel-OTYe2P0", "(Ljava/lang/String;)V", "schedule", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lme/oriient/internal/infra/scheduler/Work;", "clazz", "Ljava/lang/Class;", "options", "Lme/oriient/internal/infra/scheduler/ScheduleOptions;", "schedule-PsKN-H0", "(Ljava/lang/String;Ljava/lang/Class;Lme/oriient/internal/infra/scheduler/ScheduleOptions;)V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface Scheduler extends DiProvidable {
    /* renamed from: cancel-OTYe2P0, reason: not valid java name */
    void mo360cancelOTYe2P0(@NotNull String tag);

    @Nullable
    Logger getLogger();

    /* renamed from: schedule-PsKN-H0, reason: not valid java name */
    <T extends Work> void mo361schedulePsKNH0(@NotNull String tag, @NotNull Class<T> clazz, @NotNull ScheduleOptions options);

    void setLogger(@Nullable Logger logger);
}
