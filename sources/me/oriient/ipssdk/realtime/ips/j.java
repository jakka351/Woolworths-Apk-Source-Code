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
import me.oriient.ipssdk.api.models.IPSStartingPosition;
import me.oriient.ipssdk.base.utils.SdkError;
import me.oriient.ipssdk.realtime.ips.automatic.AutomaticPositioningStarterDelegate;
import me.oriient.ipssdk.realtime.utils.models.Position;
import me.oriient.positioningengine.common.EngineStopReason;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class j implements AutomaticPositioningStarterDelegate {
    @Override // me.oriient.ipssdk.realtime.ips.automatic.AutomaticPositioningStarterDelegate
    public final int getConnectionState() {
        return Core.INSTANCE.getConnectionState();
    }

    @Override // me.oriient.ipssdk.realtime.ips.automatic.AutomaticPositioningStarterDelegate
    public final Position getLastKnownPosition() {
        return Positioning.p;
    }

    @Override // me.oriient.ipssdk.realtime.ips.automatic.AutomaticPositioningStarterDelegate
    public final int getPositioningEngineState() {
        return Positioning.INSTANCE.getPositioningEngineState();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.String, me.oriient.ipssdk.realtime.ips.j] */
    /* JADX WARN: Type inference failed for: r1v21 */
    @Override // me.oriient.ipssdk.realtime.ips.automatic.AutomaticPositioningStarterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object startFromKioskPositioning(java.lang.String r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ips.j.startFromKioskPositioning(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.ipssdk.realtime.ips.automatic.AutomaticPositioningStarterDelegate
    public final Object startPositioning(String str, Continuation continuation) {
        Positioning.I = true;
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.b(continuation));
        Positioning.INSTANCE.a(str, (Integer) null, (IPSStartingPosition) null, (Boolean) null, false, (IPSCompletionListener) new Positioning$AutomaticPositioningStarterDelegateImpl$startPositioning$3$1(safeContinuation));
        Object objA = safeContinuation.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objA;
    }

    @Override // me.oriient.ipssdk.realtime.ips.automatic.AutomaticPositioningStarterDelegate
    public final Object stopPositioning(EngineStopReason engineStopReason, Continuation continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.b(continuation));
        boolean z = Positioning.a0;
        Unit unit = Unit.f24250a;
        if (z) {
            safeContinuation.resumeWith(new Outcome.Success(unit));
        } else {
            Positioning positioning = Positioning.INSTANCE;
            if (positioning.getPositioningState() == 0 || positioning.getPositioningState() == 3) {
                safeContinuation.resumeWith(new Outcome.Success(unit));
            } else {
                positioning.getPositioningState();
                Positioning.access$stopPositioningImpl(positioning, engineStopReason, new IPSCompletionListener() { // from class: me.oriient.ipssdk.realtime.ips.Positioning$AutomaticPositioningStarterDelegateImpl$stopPositioning$2$1
                    @Override // me.oriient.ipssdk.api.listeners.IPSCompletionListener
                    public void onCompleted() {
                        Logger loggerAccess$getLogger = Positioning.access$getLogger(Positioning.INSTANCE);
                        String str = Positioning.f25840a;
                        Intrinsics.g(str, "access$getTAG$p(...)");
                        loggerAccess$getLogger.d(str, "automatic stopPositioning onCompleted() called");
                        safeContinuation.resumeWith(new Outcome.Success(Unit.f24250a));
                    }

                    @Override // me.oriient.ipssdk.api.listeners.IPSFailable
                    public void onError(@NotNull IPSError error) {
                        Intrinsics.h(error, "error");
                        Logger loggerAccess$getLogger = Positioning.access$getLogger(Positioning.INSTANCE);
                        String str = Positioning.f25840a;
                        Intrinsics.g(str, "access$getTAG$p(...)");
                        loggerAccess$getLogger.d(str, "automatic stopPositioning onError() called with: error = " + error);
                        SafeContinuation safeContinuation2 = safeContinuation;
                        String message = error.getMessage();
                        Intrinsics.g(message, "getMessage(...)");
                        safeContinuation2.resumeWith(new Outcome.Failure(new SdkError.General(message)));
                    }
                });
            }
        }
        Object objA = safeContinuation.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objA;
    }
}
