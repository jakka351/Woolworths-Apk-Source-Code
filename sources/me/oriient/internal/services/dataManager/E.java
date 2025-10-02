package me.oriient.internal.services.dataManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.dataManager.floorMetadata.C1281k;
import me.oriient.internal.services.dataManager.floorMetadata.C1282l;
import me.oriient.internal.services.dataManager.floorMetadata.C1283m;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepositoryImpl;

/* loaded from: classes7.dex */
public final class E extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final E f25070a = new E();

    public E() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C1283m c1283m = FloorMetadataRepositoryImpl.Companion;
        InternalConfig config = (InternalConfig) ((InternalConfigManager) InternalDiKt.getDi().get(Reflection.f24268a.b(InternalConfigManager.class))).getConfig().getValue();
        c1283m.getClass();
        Intrinsics.h(config, "config");
        InMemoryDataCache inMemoryDataCache = new InMemoryDataCache(config.getCommonDataRepositoryConfig().getInMemoryStorageLimit(), config.getCommonDataRepositoryConfig().getInMemoryStorageCleanUpLimit(), Long.valueOf(config.getMapMetadataExpirationTimeMillis()));
        SimpleDataSource simpleDataSource = new SimpleDataSource("FloorMetadataSource", config.getCommonDataRepositoryConfig().getRetryRequestCount(), new C1282l(null));
        DataRepositoryImpl dataRepositoryImpl = new DataRepositoryImpl("FloorMetadataRepository", "FloorMetadata", inMemoryDataCache, simpleDataSource);
        return new FloorMetadataRepositoryImpl(dataRepositoryImpl, new DataRepositoryImpl("FloorMetadataRepository", "FloorMetadataWithImage", new me.oriient.internal.services.dataManager.floorMetadata.F(inMemoryDataCache), new me.oriient.internal.services.dataManager.floorMetadata.K(simpleDataSource)), new DataRepositoryImpl("FloorMetadataRepository", "FloorMetadataWithSvgImage", new me.oriient.internal.services.dataManager.floorMetadata.U(inMemoryDataCache), new me.oriient.internal.services.dataManager.floorMetadata.Z(simpleDataSource)), new C1281k(dataRepositoryImpl));
    }
}
