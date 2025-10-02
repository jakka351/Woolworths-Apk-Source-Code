package me.oriient.ipssdk.realtime.ips;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.SharedFlow;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.realtime.debugInfo.DebugInfoManager;
import me.oriient.ipssdk.realtime.ofs.C1728t2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/Internal;", "", "Lkotlinx/coroutines/flow/SharedFlow;", "getDebugInfo", "()Lkotlinx/coroutines/flow/SharedFlow;", "debugInfo", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class Internal {

    @NotNull
    public static final Internal INSTANCE = new Internal();

    /* renamed from: a, reason: collision with root package name */
    private static final Lazy f25832a;
    private static final Lazy b;

    static {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        f25832a = di.inject(reflectionFactory.b(DebugInfoManager.class));
        b = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RemoteConfigManager.class));
        BuildersKt.c(CoroutineScopeKt.a(((CoroutineContextProvider) DependencyInjectionKt.getDi().inject(reflectionFactory.b(CoroutineContextProvider.class)).getD()).getIo()), null, null, new C1728t2(null), 3);
    }

    private Internal() {
    }

    public static final RemoteConfigManager access$getConfigManager(Internal internal) {
        internal.getClass();
        return (RemoteConfigManager) b.getD();
    }

    public static final DebugInfoManager access$getDebugInfoManager(Internal internal) {
        internal.getClass();
        return (DebugInfoManager) f25832a.getD();
    }

    @NotNull
    public final SharedFlow<Object> getDebugInfo() {
        return ((DebugInfoManager) f25832a.getD()).getDebugInfo();
    }
}
