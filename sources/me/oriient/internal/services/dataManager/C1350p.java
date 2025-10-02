package me.oriient.internal.services.dataManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;

/* renamed from: me.oriient.internal.services.dataManager.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1350p extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1350p f25273a = new C1350p();

    public C1350p() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        me.oriient.internal.services.dataManager.linesOfInterest.b bVar = me.oriient.internal.services.dataManager.linesOfInterest.d.Companion;
        InternalConfig config = (InternalConfig) ((InternalConfigManager) InternalDiKt.getDi().get(Reflection.f24268a.b(InternalConfigManager.class))).getConfig().getValue();
        bVar.getClass();
        Intrinsics.h(config, "config");
        return new me.oriient.internal.services.dataManager.linesOfInterest.d(new DataRepositoryImpl("LinesOfInterestReposito", "LineOfInterest", new InMemoryDataCache(config.getCommonDataRepositoryConfig().getInMemoryStorageLimit(), config.getCommonDataRepositoryConfig().getInMemoryStorageCleanUpLimit(), null, 4, null), new SimpleDataSource("LineOfInterestSource", config.getCommonDataRepositoryConfig().getRetryRequestCount(), new me.oriient.internal.services.dataManager.linesOfInterest.a(null))));
    }
}
