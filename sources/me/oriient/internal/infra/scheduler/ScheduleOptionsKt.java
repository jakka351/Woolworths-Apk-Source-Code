package me.oriient.internal.infra.scheduler;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"asWorkTag", "Lme/oriient/internal/infra/scheduler/WorkTag;", "", "getAsWorkTag", "(Ljava/lang/String;)Ljava/lang/String;", "internal_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ScheduleOptionsKt {
    @NotNull
    public static final String getAsWorkTag(@NotNull String str) {
        Intrinsics.h(str, "<this>");
        return WorkTag.m363constructorimpl(str);
    }
}
