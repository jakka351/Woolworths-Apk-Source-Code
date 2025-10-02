package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.networkManager.NetworkManager;
import me.oriient.internal.infra.persistentStorage.PersistentStorage;
import me.oriient.internal.infra.rest.RestService;
import me.oriient.internal.services.cachedDataProvider.CachedDataProviderFactory;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;

/* renamed from: me.oriient.ipssdk.common.ofs.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1550h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1550h f25751a = new C1550h();

    public C1550h() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        return new CachedDataProviderFactory((RestService) di.get(reflectionFactory.b(RestService.class)), (PersistentStorage) DependencyInjectionKt.getDi().get(reflectionFactory.b(PersistentStorage.class)), (NetworkManager) DependencyInjectionKt.getDi().get(reflectionFactory.b(NetworkManager.class)));
    }
}
