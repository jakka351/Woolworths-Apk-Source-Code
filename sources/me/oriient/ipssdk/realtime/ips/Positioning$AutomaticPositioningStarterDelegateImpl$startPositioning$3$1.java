package me.oriient.ipssdk.realtime.ips;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.SafeContinuation;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.base.utils.SdkError;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"me/oriient/ipssdk/realtime/ips/Positioning$AutomaticPositioningStarterDelegateImpl$startPositioning$3$1", "Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;", "Lme/oriient/ipssdk/api/models/IPSError;", "error", "", "onError", "(Lme/oriient/ipssdk/api/models/IPSError;)V", "onCompleted", "()V", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Positioning$AutomaticPositioningStarterDelegateImpl$startPositioning$3$1 implements IPSCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SafeContinuation f25842a;

    public Positioning$AutomaticPositioningStarterDelegateImpl$startPositioning$3$1(SafeContinuation safeContinuation) {
        this.f25842a = safeContinuation;
    }

    @Override // me.oriient.ipssdk.api.listeners.IPSCompletionListener
    public void onCompleted() {
        Positioning.I = false;
        Logger loggerAccess$getLogger = Positioning.access$getLogger(Positioning.INSTANCE);
        String str = Positioning.f25840a;
        Intrinsics.g(str, "access$getTAG$p(...)");
        loggerAccess$getLogger.d(str, "automatic startPositioning onCompleted() called");
        this.f25842a.resumeWith(new Outcome.Success(Unit.f24250a));
    }

    @Override // me.oriient.ipssdk.api.listeners.IPSFailable
    public void onError(@NotNull IPSError error) {
        Intrinsics.h(error, "error");
        Positioning.I = false;
        Logger loggerAccess$getLogger = Positioning.access$getLogger(Positioning.INSTANCE);
        String str = Positioning.f25840a;
        Intrinsics.g(str, "access$getTAG$p(...)");
        loggerAccess$getLogger.d(str, "automatic startPositioning onError() called with: error = " + error);
        SafeContinuation safeContinuation = this.f25842a;
        String message = error.getMessage();
        Intrinsics.g(message, "getMessage(...)");
        safeContinuation.resumeWith(new Outcome.Failure(new SdkError.General(message)));
    }
}
