package me.oriient.navigation.ondevice;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.Metric;

/* loaded from: classes8.dex */
public final class s extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NdkBridgeImpl f26356a;
    public final /* synthetic */ NavigationData b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(NdkBridgeImpl ndkBridgeImpl, NavigationData navigationData) {
        super(0);
        this.f26356a = ndkBridgeImpl;
        this.b = navigationData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long currentTimeMillis = ((TimeProvider) this.f26356a.b.getD()).getCurrentTimeMillis();
        NdkBridgeImpl ndkBridgeImpl = this.f26356a;
        ndkBridgeImpl.a(new u(ndkBridgeImpl));
        this.f26356a.initNavigationNative(this.b);
        ((Metric) this.f26356a.d.getD()).i("NdkBridge", "setBuildingTime", ((TimeProvider) this.f26356a.b.getD()).timeIntervalSinceNowInSeconds(currentTimeMillis), new r(this.b));
        return Unit.f24250a;
    }
}
