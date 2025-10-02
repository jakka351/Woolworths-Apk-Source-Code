package me.oriient.internal.services.dataManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;

/* renamed from: me.oriient.internal.services.dataManager.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1300k extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1300k f25183a = new C1300k();

    public C1300k() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        me.oriient.internal.services.dataManager.mapGrid.Y y = me.oriient.internal.services.dataManager.mapGrid.Z.Companion;
        InternalConfig config = (InternalConfig) ((InternalConfigManager) InternalDiKt.getDi().get(Reflection.f24268a.b(InternalConfigManager.class))).getConfig().getValue();
        y.getClass();
        Intrinsics.h(config, "config");
        return new me.oriient.internal.services.dataManager.mapGrid.Z(new DataRepositoryImpl("MapGridUrlRepository", "MapGridUrl", new InMemoryDataCache(0, 0, Long.valueOf(config.getMapGridUrlExpirationTimeMillis()), 3, null), new SimpleDataSource("MapGridUrlSource", config.getCommonDataRepositoryConfig().getRetryRequestCount(), new me.oriient.internal.services.dataManager.mapGrid.X(null))));
    }
}
