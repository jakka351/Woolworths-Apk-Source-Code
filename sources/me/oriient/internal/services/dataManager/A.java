package me.oriient.internal.services.dataManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;

/* loaded from: classes7.dex */
public final class A extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final A f25066a = new A();

    public A() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        me.oriient.internal.services.dataManager.obstaclesPolygonsFinder.e eVar = me.oriient.internal.services.dataManager.obstaclesPolygonsFinder.f.Companion;
        InternalConfig config = (InternalConfig) ((InternalConfigManager) InternalDiKt.getDi().get(Reflection.f24268a.b(InternalConfigManager.class))).getConfig().getValue();
        eVar.getClass();
        Intrinsics.h(config, "config");
        return new me.oriient.internal.services.dataManager.obstaclesPolygonsFinder.f(new DataRepositoryImpl("ObstaclesPolygonsFinderRepository", "ObstaclesPolygonsFinder", new InMemoryDataCache(config.getCommonDataRepositoryConfig().getInMemoryStorageLimit(), config.getCommonDataRepositoryConfig().getInMemoryStorageCleanUpLimit(), Long.valueOf(config.getMapMetadataExpirationTimeMillis())), new me.oriient.internal.services.dataManager.obstaclesPolygonsFinder.c()));
    }
}
