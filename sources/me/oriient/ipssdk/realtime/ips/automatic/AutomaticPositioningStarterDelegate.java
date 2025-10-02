package me.oriient.ipssdk.realtime.ips.automatic;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.ipssdk.base.utils.SdkError;
import me.oriient.ipssdk.realtime.utils.models.Position;
import me.oriient.positioningengine.common.EngineStopReason;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\"\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0013\u001a\u00020\u0014H¦@¢\u0006\u0002\u0010\u0015J\"\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0013\u001a\u00020\u0014H¦@¢\u0006\u0002\u0010\u0015J\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0018\u001a\u00020\u0019H¦@¢\u0006\u0002\u0010\u001aR\u0018\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u001b"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/automatic/AutomaticPositioningStarterDelegate;", "", "connectionState", "", "getConnectionState$annotations", "()V", "getConnectionState", "()I", "lastKnownPosition", "Lme/oriient/ipssdk/realtime/utils/models/Position;", "getLastKnownPosition", "()Lme/oriient/ipssdk/realtime/utils/models/Position;", "positioningEngineState", "getPositioningEngineState$annotations", "getPositioningEngineState", "startFromKioskPositioning", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/ipssdk/base/utils/SdkError;", "buildingId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startPositioning", "stopPositioning", "reason", "Lme/oriient/positioningengine/common/EngineStopReason;", "(Lme/oriient/positioningengine/common/EngineStopReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface AutomaticPositioningStarterDelegate {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getConnectionState$annotations() {
        }

        public static /* synthetic */ void getPositioningEngineState$annotations() {
        }
    }

    int getConnectionState();

    @Nullable
    Position getLastKnownPosition();

    int getPositioningEngineState();

    @Nullable
    Object startFromKioskPositioning(@NotNull String str, @NotNull Continuation<? super Outcome<Unit, SdkError>> continuation);

    @Nullable
    Object startPositioning(@NotNull String str, @NotNull Continuation<? super Outcome<Unit, SdkError>> continuation);

    @Nullable
    Object stopPositioning(@NotNull EngineStopReason engineStopReason, @NotNull Continuation<? super Outcome<Unit, SdkError>> continuation);
}
