package me.oriient.internal.services.dataManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.dataManager.building.C1233a;
import me.oriient.internal.services.dataManager.building.C1234b;
import me.oriient.internal.services.dataManager.building.C1235c;

/* renamed from: me.oriient.internal.services.dataManager.z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1417z extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1417z f25422a = new C1417z();

    public C1417z() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C1235c c1235c = me.oriient.internal.services.dataManager.building.v.Companion;
        InternalConfig config = (InternalConfig) ((InternalConfigManager) InternalDiKt.getDi().get(Reflection.f24268a.b(InternalConfigManager.class))).getConfig().getValue();
        c1235c.getClass();
        Intrinsics.h(config, "config");
        return new me.oriient.internal.services.dataManager.building.v(new DataRepositoryImpl("BuildingRepository", "Building", new InMemoryDataCache(config.getCommonDataRepositoryConfig().getInMemoryStorageLimit(), config.getCommonDataRepositoryConfig().getInMemoryStorageCleanUpLimit(), null, 4, null), new SimpleDataSource("BuildingSource", config.getCommonDataRepositoryConfig().getRetryRequestCount(), new C1233a(null))), new DataRepositoryImpl("BuildingRepository", "BuildingByClientId", new InMemoryDataCache(config.getCommonDataRepositoryConfig().getInMemoryStorageLimit(), config.getCommonDataRepositoryConfig().getInMemoryStorageCleanUpLimit(), null, 4, null), new SimpleDataSource("BuildingByClientIdSource", config.getCommonDataRepositoryConfig().getRetryRequestCount(), new C1234b(null))));
    }
}
