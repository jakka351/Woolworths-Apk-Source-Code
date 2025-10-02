package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.networkManager.NetworkManager;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.common.utils.runtimedata.CommonRuntimeDataProvider;
import me.oriient.ipssdk.realtime.services.tag.EventTaggingDatabase;
import me.oriient.ipssdk.realtime.services.tag.EventTaggingManagerImpl;
import me.oriient.ipssdk.realtime.services.tag.EventTaggingRestService;

/* renamed from: me.oriient.ipssdk.realtime.ofs.h4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1659h4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1659h4 f26084a = new C1659h4();

    public C1659h4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        return new EventTaggingManagerImpl((EventTaggingRestService) di.get(reflectionFactory.b(EventTaggingRestService.class)), (EventTaggingDatabase) DependencyInjectionKt.getDi().get(reflectionFactory.b(EventTaggingDatabase.class)), (CoroutineContextProvider) DependencyInjectionKt.getDi().get(reflectionFactory.b(CoroutineContextProvider.class)), (NetworkManager) DependencyInjectionKt.getDi().get(reflectionFactory.b(NetworkManager.class)), (CommonRuntimeDataProvider) DependencyInjectionKt.getDi().get(reflectionFactory.b(CommonRuntimeDataProvider.class)), (RemoteConfigManager) DependencyInjectionKt.getDi().get(reflectionFactory.b(RemoteConfigManager.class)), (ELog) DependencyInjectionKt.getDi().get(reflectionFactory.b(ELog.class)), (Logger) DependencyInjectionKt.getDi().get(reflectionFactory.b(Logger.class)));
    }
}
