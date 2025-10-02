package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.ipssdk.api.listeners.IPSLiveNavigationListener;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.realtime.ips.Navigation;
import me.oriient.ipssdk.realtime.utils.ExtensionsKt;
import me.oriient.navigation.common.util.NavigationError;

/* loaded from: classes8.dex */
public final class K2 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public static final K2 f25965a = new K2();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        IPSError ipsError = ExtensionsKt.toIpsError((NavigationError) obj);
        for (IPSLiveNavigationListener iPSLiveNavigationListener : ExtensionsKt.copyOf(Navigation.h)) {
            if (iPSLiveNavigationListener != null) {
                iPSLiveNavigationListener.onError(ipsError);
            }
        }
        return Unit.f24250a;
    }
}
