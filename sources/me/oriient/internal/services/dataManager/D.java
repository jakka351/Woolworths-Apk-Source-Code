package me.oriient.internal.services.dataManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;

/* loaded from: classes7.dex */
public final class D extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final D f25069a = new D();

    public D() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        me.oriient.internal.services.dataManager.floorTransitions.d.Companion.getClass();
        InternalConfig internalConfig = (InternalConfig) ((InternalConfigManager) InternalDiKt.getDi().get(Reflection.f24268a.b(InternalConfigManager.class))).getConfig().getValue();
        return new me.oriient.internal.services.dataManager.floorTransitions.d(new DataRepositoryImpl("FloorTransitionsReposit", "FloorTransitions", new InMemoryDataCache(internalConfig.getCommonDataRepositoryConfig().getInMemoryStorageLimit(), internalConfig.getCommonDataRepositoryConfig().getInMemoryStorageCleanUpLimit(), null, 4, null), new SimpleDataSource("FloorTransitionsSource", internalConfig.getCommonDataRepositoryConfig().getRetryRequestCount(), new me.oriient.internal.services.dataManager.floorTransitions.a(null))));
    }
}
