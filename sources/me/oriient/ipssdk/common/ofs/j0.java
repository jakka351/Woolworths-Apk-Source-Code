package me.oriient.ipssdk.common.ofs;

import defpackage.RemoteLoggerFactory;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.internal.infra.utils.core.BuildData;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.elog.ELogRemoteLogFactory;
import me.oriient.internal.services.remoteLog.RemoteLog;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;

/* loaded from: classes2.dex */
public final class j0 implements ELogRemoteLogFactory {
    @Override // me.oriient.internal.services.elog.ELogRemoteLogFactory
    public final RemoteLog createLog(String url) {
        Intrinsics.h(url, "url");
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        if (((BuildData) di.get(reflectionFactory.b(BuildData.class))).getDebug()) {
            RemoteLoggerFactory.INSTANCE.enableLogging(((ContextProvider) DependencyInjectionKt.getDi().get(reflectionFactory.b(ContextProvider.class))).getContext(), (Logger) DependencyInjectionKt.getDi().get(reflectionFactory.b(Logger.class)));
        }
        return RemoteLoggerFactory.INSTANCE.create(((ContextProvider) DependencyInjectionKt.getDi().get(reflectionFactory.b(ContextProvider.class))).getContext(), url);
    }
}
