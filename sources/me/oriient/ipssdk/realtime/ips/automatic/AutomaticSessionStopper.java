package me.oriient.ipssdk.realtime.ips.automatic;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.ipssdk.base.utils.SdkError;
import me.oriient.positioningengine.common.EngineStopReason;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/automatic/AutomaticSessionStopper;", "", "start", "", "building", "Lme/oriient/internal/services/dataManager/building/Building;", "stop", "Delegate", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface AutomaticSessionStopper {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000eR\u0018\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/automatic/AutomaticSessionStopper$Delegate;", "", "positioningEngineState", "", "getPositioningEngineState$annotations", "()V", "getPositioningEngineState", "()I", "stopSession", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/ipssdk/base/utils/SdkError;", "reason", "Lme/oriient/positioningengine/common/EngineStopReason;", "(Lme/oriient/positioningengine/common/EngineStopReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Delegate {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void getPositioningEngineState$annotations() {
            }
        }

        int getPositioningEngineState();

        @Nullable
        Object stopSession(@NotNull EngineStopReason engineStopReason, @NotNull Continuation<? super Outcome<Unit, SdkError>> continuation);
    }

    void start(@NotNull Building building);

    void stop();
}
