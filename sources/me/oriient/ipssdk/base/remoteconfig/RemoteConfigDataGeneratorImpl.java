package me.oriient.ipssdk.base.remoteconfig;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.BuildData;
import me.oriient.internal.infra.utils.core.DeviceIdProvider;
import me.oriient.internal.infra.utils.core.OsData;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lme/oriient/ipssdk/base/remoteconfig/RemoteConfigDataGeneratorImpl;", "Lme/oriient/ipssdk/base/remoteconfig/RemoteConfigDataGenerator;", "<init>", "()V", "Lme/oriient/ipssdk/base/auth/User;", "user", "", "sdkType", "Lme/oriient/ipssdk/base/remoteconfig/RemoteConfigAppData;", "generate", "(Lme/oriient/ipssdk/base/auth/User;Ljava/lang/String;)Lme/oriient/ipssdk/base/remoteconfig/RemoteConfigAppData;", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RemoteConfigDataGeneratorImpl implements RemoteConfigDataGenerator {

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f25700a;
    private final Lazy b;
    private final Lazy c;

    public RemoteConfigDataGeneratorImpl() {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f25700a = di.inject(reflectionFactory.b(BuildData.class));
        this.b = DependencyInjectionKt.getDi().inject(reflectionFactory.b(OsData.class));
        this.c = DependencyInjectionKt.getDi().inject(reflectionFactory.b(DeviceIdProvider.class));
    }

    @Override // me.oriient.ipssdk.base.remoteconfig.RemoteConfigDataGenerator
    @NotNull
    public RemoteConfigAppData generate(@NotNull User user, @NotNull String sdkType) {
        Intrinsics.h(user, "user");
        Intrinsics.h(sdkType, "sdkType");
        return new RemoteConfigAppData(user.getDomain(), user.getSpace().getId(), user.getApiKey(), ((BuildData) this.f25700a.getD()).getAppVersionCode(), ((BuildData) this.f25700a.getD()).getAppVersionName(), ((BuildData) this.f25700a.getD()).getBundleId(), ((DeviceIdProvider) this.c.getD()).getDeviceId(), ((BuildData) this.f25700a.getD()).getDebug(), ((BuildData) this.f25700a.getD()).getAppDebug(), sdkType, ((OsData) this.b.getD()).getOsType(), ((OsData) this.b.getD()).getOsVersion(), ((OsData) this.b.getD()).getApiLevel(), ((BuildData) this.f25700a.getD()).getVersionName(), ((BuildData) this.f25700a.getD()).getVersionCode(), ((OsData) this.b.getD()).getManufacturer(), ((OsData) this.b.getD()).getModel(), ((OsData) this.b.getD()).getUserCountryByNetwork(), ((OsData) this.b.getD()).getLocale());
    }
}
