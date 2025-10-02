package me.oriient.positioningengine.common;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.networkManager.NetworkManager;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.eventManager.EventManagerFactoryImpl;
import me.oriient.internal.services.websocket.SocketProviderImpl;
import me.oriient.internal.services.websocket.util.ELogIOManager;

/* loaded from: classes8.dex */
public final class l extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final l f26383a = new l();

    public l() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        return new EventManagerFactoryImpl(new SocketProviderImpl((ELog) di.get(reflectionFactory.b(ELog.class), null), (ELogIOManager) DiKt.getDi().get(reflectionFactory.b(ELogIOManager.class), null)), (CoroutineContextProvider) DiKt.getDi().get(reflectionFactory.b(CoroutineContextProvider.class), null), (ELog) DiKt.getDi().get(reflectionFactory.b(ELog.class), null), (NetworkManager) DiKt.getDi().get(reflectionFactory.b(NetworkManager.class), null));
    }
}
