package me.oriient.positioningengine.ondevice.util.locationReporter;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.eventManager.model.EventError;

/* loaded from: classes8.dex */
public final class c extends Lambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f26484a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar) {
        super(3);
        this.f26484a = hVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String requestId = (String) obj2;
        EventError error = (EventError) obj3;
        Intrinsics.h((String) obj, "<anonymous parameter 0>");
        Intrinsics.h(requestId, "requestId");
        Intrinsics.h(error, "error");
        Logger logger = (Logger) this.f26484a.k.getD();
        StringBuilder sbU = YU.a.u("Message ", requestId, " was not sent ");
        sbU.append(error.getLocalizedMessage());
        logger.e("LocationReporter", sbU.toString(), error);
        return Unit.f24250a;
    }
}
