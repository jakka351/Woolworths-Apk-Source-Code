package me.oriient.internal.services.dataManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;

/* loaded from: classes7.dex */
public final class r extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final r f25391a = new r();

    public r() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        me.oriient.internal.services.dataManager.buildingCoordinateConverter.d dVar = me.oriient.internal.services.dataManager.buildingCoordinateConverter.e.Companion;
        InternalConfig config = (InternalConfig) ((InternalConfigManager) InternalDiKt.getDi().get(Reflection.f24268a.b(InternalConfigManager.class))).getConfig().getValue();
        dVar.getClass();
        Intrinsics.h(config, "config");
        return new me.oriient.internal.services.dataManager.buildingCoordinateConverter.e(new DataRepositoryImpl("CoordinateConverterRepo", "buildingCoordinateConverter", new InMemoryDataCache(config.getCommonDataRepositoryConfig().getInMemoryStorageLimit(), config.getCommonDataRepositoryConfig().getInMemoryStorageCleanUpLimit(), null, 4, null), new SimpleDataSource("CoordinateConverterRepo", config.getCommonDataRepositoryConfig().getRetryRequestCount(), new me.oriient.internal.services.dataManager.buildingCoordinateConverter.c(null))));
    }
}
