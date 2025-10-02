package me.oriient.ipssdk.base.di;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.persistentStorage.PersistentStorage;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigDataGenerator;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigRest;
import me.oriient.ipssdk.base.rest.SdkOriientApiProvider;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"initializeSdkBaseDi", "", "di", "Lme/oriient/internal/infra/di/DependencyInjection;", "me.oriient.sdk-base"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BaseDiKt {
    @Keep
    public static final void initializeSdkBaseDi(@NotNull DependencyInjection di) {
        Intrinsics.h(di, "di");
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(ContextProvider.class), null, a.f25684a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(RemoteConfigDataGenerator.class), null, b.f25685a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(RemoteConfigRest.class), null, c.f25686a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(RemoteConfigManager.class), null, d.f25687a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(SdkOriientApiProvider.class), null, e.f25688a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(OriientApiProvider.class), null, f.f25689a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(PersistentStorage.class), null, new g(di), 2, null);
    }
}
