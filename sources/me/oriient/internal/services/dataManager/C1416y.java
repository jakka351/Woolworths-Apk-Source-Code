package me.oriient.internal.services.dataManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.dataManager.plai.C1372w;

/* renamed from: me.oriient.internal.services.dataManager.y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1416y extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1416y f25421a = new C1416y();

    public C1416y() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        me.oriient.internal.services.dataManager.plai.G g = me.oriient.internal.services.dataManager.plai.S.Companion;
        InternalConfig config = (InternalConfig) ((InternalConfigManager) InternalDiKt.getDi().get(Reflection.f24268a.b(InternalConfigManager.class))).getConfig().getValue();
        CoroutineScope scope = (CoroutineScope) J.c.getD();
        g.getClass();
        Intrinsics.h(config, "config");
        Intrinsics.h(scope, "scope");
        C1372w c1372w = new C1372w();
        me.oriient.internal.services.dataManager.plai.D d = new me.oriient.internal.services.dataManager.plai.D(new DataRepositoryImpl("PlaiRepository", "PLAI-url", new InMemoryDataCache(config.getCommonDataRepositoryConfig().getInMemoryStorageLimit(), config.getCommonDataRepositoryConfig().getInMemoryStorageCleanUpLimit(), Long.valueOf(config.getPlaiConfig().getDownloadLinkExpirationTimeMillis())), new SimpleDataSource("PlaiRepository", config.getCommonDataRepositoryConfig().getRetryRequestCount(), new me.oriient.internal.services.dataManager.plai.F(null))));
        return new me.oriient.internal.services.dataManager.plai.S(c1372w, d, new DataRepositoryImpl("PlaiRepository", "PLAI-products", c1372w, d), scope);
    }
}
