package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.ipssdk.api.listeners.IPSLiveNavigationListener;
import me.oriient.ipssdk.realtime.ips.Navigation;
import me.oriient.ipssdk.realtime.ips.NavigationExtKt;
import me.oriient.ipssdk.realtime.ips.SdkRoute;
import me.oriient.ipssdk.realtime.utils.ExtensionsKt;
import me.oriient.navigation.common.models.Route;

/* loaded from: classes8.dex */
public final class E2 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public static final E2 f25932a = new E2();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        SdkRoute sdkRoute = NavigationExtKt.toSdkRoute((Route) obj);
        for (IPSLiveNavigationListener iPSLiveNavigationListener : ExtensionsKt.copyOf(Navigation.h)) {
            if (iPSLiveNavigationListener != null) {
                iPSLiveNavigationListener.onNavigationUpdate(sdkRoute);
            }
        }
        return Unit.f24250a;
    }
}
