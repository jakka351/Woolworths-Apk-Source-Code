package me.oriient.navigation.ondevice;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.elog.ELog;

/* loaded from: classes8.dex */
public final class u extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NdkBridgeImpl f26358a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(NdkBridgeImpl ndkBridgeImpl) {
        super(0);
        this.f26358a = ndkBridgeImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((ELog) this.f26358a.c.getD()).v("NdkBridge", "terminateEngine called", t.f26357a);
        if (NdkBridgeImpl.f) {
            NdkBridgeImpl.f = false;
            this.f26358a.terminateEngineNative();
        }
        return Unit.f24250a;
    }
}
