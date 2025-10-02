package me.oriient.ipssdk.realtime.ips;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.base.utils.SdkError;
import me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopper;
import me.oriient.positioningengine.common.EngineStopReason;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class i implements AutomaticSessionStopper.Delegate {
    @Override // me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopper.Delegate
    public final int getPositioningEngineState() {
        return Positioning.INSTANCE.getPositioningEngineState();
    }

    @Override // me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopper.Delegate
    public final Object stopSession(EngineStopReason engineStopReason, Continuation continuation) {
        Positioning positioning = Positioning.INSTANCE;
        Logger loggerAccess$getLogger = Positioning.access$getLogger(positioning);
        String str = Positioning.f25840a;
        Intrinsics.g(str, "access$getTAG$p(...)");
        loggerAccess$getLogger.d(str, "AutomaticSessionStopperDelegateImpl stopSession() called with: reason = " + engineStopReason);
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.b(continuation));
        int positioningState = positioning.getPositioningState();
        if (positioningState == 0 || positioningState == 1) {
            safeContinuation.resumeWith(new Outcome.Success(Unit.f24250a));
        } else if (positioningState == 2) {
            Positioning.access$getAutomaticPositioningStarter(positioning).onPositioningAutoStopped();
            Positioning.access$stopPositioningImpl(positioning, engineStopReason, new IPSCompletionListener() { // from class: me.oriient.ipssdk.realtime.ips.Positioning$AutomaticLockedSessionStopperDelegateImpl$stopSession$2$1
                @Override // me.oriient.ipssdk.api.listeners.IPSCompletionListener
                public void onCompleted() {
                    Logger loggerAccess$getLogger2 = Positioning.access$getLogger(Positioning.INSTANCE);
                    String str2 = Positioning.f25840a;
                    Intrinsics.g(str2, "access$getTAG$p(...)");
                    loggerAccess$getLogger2.d(str2, "automatic stopPositioning onCompleted() called");
                    safeContinuation.resumeWith(new Outcome.Success(Unit.f24250a));
                }

                @Override // me.oriient.ipssdk.api.listeners.IPSFailable
                public void onError(@NotNull IPSError error) {
                    Intrinsics.h(error, "error");
                    Logger loggerAccess$getLogger2 = Positioning.access$getLogger(Positioning.INSTANCE);
                    String str2 = Positioning.f25840a;
                    Intrinsics.g(str2, "access$getTAG$p(...)");
                    loggerAccess$getLogger2.d(str2, "automatic stopPositioning onError() called with: error = " + error);
                    SafeContinuation safeContinuation2 = safeContinuation;
                    String message = error.getMessage();
                    Intrinsics.g(message, "getMessage(...)");
                    safeContinuation2.resumeWith(new Outcome.Failure(new SdkError.General(message)));
                }
            });
        }
        Object objA = safeContinuation.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objA;
    }
}
