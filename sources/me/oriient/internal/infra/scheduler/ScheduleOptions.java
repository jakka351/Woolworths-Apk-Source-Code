package me.oriient.internal.infra.scheduler;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lme/oriient/internal/infra/scheduler/ScheduleOptions;", "", "allowMeteredNetworks", "", "requireCharger", "existingWorkPolicy", "Lme/oriient/internal/infra/scheduler/ExistingWorkPolicy;", "(ZZLme/oriient/internal/infra/scheduler/ExistingWorkPolicy;)V", "getAllowMeteredNetworks", "()Z", "getExistingWorkPolicy", "()Lme/oriient/internal/infra/scheduler/ExistingWorkPolicy;", "getRequireCharger", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ScheduleOptions {
    private final boolean allowMeteredNetworks;

    @NotNull
    private final ExistingWorkPolicy existingWorkPolicy;
    private final boolean requireCharger;

    public ScheduleOptions() {
        this(false, false, null, 7, null);
    }

    public static /* synthetic */ ScheduleOptions copy$default(ScheduleOptions scheduleOptions, boolean z, boolean z2, ExistingWorkPolicy existingWorkPolicy, int i, Object obj) {
        if ((i & 1) != 0) {
            z = scheduleOptions.allowMeteredNetworks;
        }
        if ((i & 2) != 0) {
            z2 = scheduleOptions.requireCharger;
        }
        if ((i & 4) != 0) {
            existingWorkPolicy = scheduleOptions.existingWorkPolicy;
        }
        return scheduleOptions.copy(z, z2, existingWorkPolicy);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAllowMeteredNetworks() {
        return this.allowMeteredNetworks;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getRequireCharger() {
        return this.requireCharger;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ExistingWorkPolicy getExistingWorkPolicy() {
        return this.existingWorkPolicy;
    }

    @NotNull
    public final ScheduleOptions copy(boolean allowMeteredNetworks, boolean requireCharger, @NotNull ExistingWorkPolicy existingWorkPolicy) {
        Intrinsics.h(existingWorkPolicy, "existingWorkPolicy");
        return new ScheduleOptions(allowMeteredNetworks, requireCharger, existingWorkPolicy);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleOptions)) {
            return false;
        }
        ScheduleOptions scheduleOptions = (ScheduleOptions) other;
        return this.allowMeteredNetworks == scheduleOptions.allowMeteredNetworks && this.requireCharger == scheduleOptions.requireCharger && this.existingWorkPolicy == scheduleOptions.existingWorkPolicy;
    }

    public final boolean getAllowMeteredNetworks() {
        return this.allowMeteredNetworks;
    }

    @NotNull
    public final ExistingWorkPolicy getExistingWorkPolicy() {
        return this.existingWorkPolicy;
    }

    public final boolean getRequireCharger() {
        return this.requireCharger;
    }

    public int hashCode() {
        return this.existingWorkPolicy.hashCode() + a.a(this.requireCharger, Boolean.hashCode(this.allowMeteredNetworks) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "ScheduleOptions(allowMeteredNetworks=" + this.allowMeteredNetworks + ", requireCharger=" + this.requireCharger + ", existingWorkPolicy=" + this.existingWorkPolicy + ')';
    }

    public ScheduleOptions(boolean z, boolean z2, @NotNull ExistingWorkPolicy existingWorkPolicy) {
        Intrinsics.h(existingWorkPolicy, "existingWorkPolicy");
        this.allowMeteredNetworks = z;
        this.requireCharger = z2;
        this.existingWorkPolicy = existingWorkPolicy;
    }

    public /* synthetic */ ScheduleOptions(boolean z, boolean z2, ExistingWorkPolicy existingWorkPolicy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? ExistingWorkPolicy.REPLACE : existingWorkPolicy);
    }
}
