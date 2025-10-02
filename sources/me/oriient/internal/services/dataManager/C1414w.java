package me.oriient.internal.services.dataManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.dataManager.plaiCategories.C1384i;
import me.oriient.internal.services.dataManager.plaiCategories.C1386k;
import me.oriient.internal.services.dataManager.plaiCategories.C1387l;
import me.oriient.internal.services.dataManager.plaiCategories.C1397w;

/* renamed from: me.oriient.internal.services.dataManager.w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1414w extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1414w f25419a = new C1414w();

    public C1414w() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C1387l c1387l = C1397w.Companion;
        InternalConfig config = (InternalConfig) ((InternalConfigManager) InternalDiKt.getDi().get(Reflection.f24268a.b(InternalConfigManager.class))).getConfig().getValue();
        CoroutineScope scope = (CoroutineScope) J.c.getD();
        c1387l.getClass();
        Intrinsics.h(config, "config");
        Intrinsics.h(scope, "scope");
        C1384i c1384i = new C1384i();
        me.oriient.internal.services.dataManager.plaiCategories.D d = new me.oriient.internal.services.dataManager.plaiCategories.D(new DataRepositoryImpl("PlaiCategoryRepository", "PLAI-cat-url", new InMemoryDataCache(config.getCommonDataRepositoryConfig().getInMemoryStorageLimit(), config.getCommonDataRepositoryConfig().getInMemoryStorageCleanUpLimit(), Long.valueOf(config.getPlaiConfig().getDownloadLinkExpirationTimeMillis())), new SimpleDataSource("PlaiCategoryRepository", config.getCommonDataRepositoryConfig().getRetryRequestCount(), new C1386k(null))));
        return new C1397w(c1384i, d, new DataRepositoryImpl("PlaiCategoryRepository", "PLAI-categories", c1384i, d), scope);
    }
}
