package me.oriient.positioningengine.ondevice.util.locationReporter;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.Logger;

/* loaded from: classes8.dex */
public final class b extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f26483a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar) {
        super(2);
        this.f26483a = hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String requestId = (String) obj2;
        Intrinsics.h((String) obj, "<anonymous parameter 0>");
        Intrinsics.h(requestId, "requestId");
        ((Logger) this.f26483a.k.getD()).d("LocationReporter", "Message " + requestId + " sent successfully");
        return Unit.f24250a;
    }
}
