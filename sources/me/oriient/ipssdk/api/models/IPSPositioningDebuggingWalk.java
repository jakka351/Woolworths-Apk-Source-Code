package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.positioningengine.ondevice.debugging.PositioningDebuggingWalk;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/ipssdk/api/models/IPSPositioningDebuggingWalk;", "", "walk", "Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalk;", "(Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalk;)V", "getWalk$me_oriient_sdk_realtime", "()Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalk;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IPSPositioningDebuggingWalk {

    @NotNull
    private final PositioningDebuggingWalk walk;

    public IPSPositioningDebuggingWalk(@NotNull PositioningDebuggingWalk walk) {
        Intrinsics.h(walk, "walk");
        this.walk = walk;
    }

    @NotNull
    /* renamed from: getWalk$me_oriient_sdk_realtime, reason: from getter */
    public final PositioningDebuggingWalk getWalk() {
        return this.walk;
    }
}
