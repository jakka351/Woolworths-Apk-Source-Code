package me.oriient.internal.services.dataManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;

/* renamed from: me.oriient.internal.services.dataManager.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1301l extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1301l f25184a = new C1301l();

    public C1301l() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        me.oriient.internal.services.dataManager.region.b bVar = me.oriient.internal.services.dataManager.region.g.Companion;
        InternalConfig config = (InternalConfig) ((InternalConfigManager) InternalDiKt.getDi().get(Reflection.f24268a.b(InternalConfigManager.class))).getConfig().getValue();
        bVar.getClass();
        Intrinsics.h(config, "config");
        return new me.oriient.internal.services.dataManager.region.g(new DataRepositoryImpl("RegionRepository", "regions", new InMemoryDataCache(config.getCommonDataRepositoryConfig().getInMemoryStorageLimit(), config.getCommonDataRepositoryConfig().getInMemoryStorageCleanUpLimit(), null, 4, null), new SimpleDataSource("regionsSource", config.getCommonDataRepositoryConfig().getRetryRequestCount(), new me.oriient.internal.services.dataManager.region.a(null))));
    }
}
