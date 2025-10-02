package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfig;
import me.oriient.ipssdk.realtime.ips.Navigation;

/* loaded from: classes8.dex */
public final class C2 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public static final C2 f25920a = new C2();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object objOnNewConfig = Navigation.access$getNavigationManager(Navigation.INSTANCE).onNewConfig(((RemoteConfig) obj).getRealTime().getNavigationConfig(), continuation);
        return objOnNewConfig == CoroutineSingletons.d ? objOnNewConfig : Unit.f24250a;
    }
}
