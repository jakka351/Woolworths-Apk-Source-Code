package me.oriient.internal.services.dataManager.preloading;

import androidx.annotation.Keep;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.dataManager.plai.PlaiRepository;
import me.oriient.internal.services.dataModel.plai.PlaiConfig;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u001a\u001a\u00020\u0002H\u0096@¢\u0006\u0002\u0010\u001bR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0002X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, d2 = {"Lme/oriient/internal/services/dataManager/preloading/PlaiDataPreloader;", "Lme/oriient/internal/services/dataManager/preloading/DataPreloader;", "", "()V", "configManager", "Lme/oriient/internal/services/config/InternalConfigManager;", "getConfigManager", "()Lme/oriient/internal/services/config/InternalConfigManager;", "configManager$delegate", "Lkotlin/Lazy;", "dataTypeDescription", "getDataTypeDescription", "()Ljava/lang/String;", "plaiConfig", "Lme/oriient/internal/services/dataModel/plai/PlaiConfig;", "getPlaiConfig", "()Lme/oriient/internal/services/dataModel/plai/PlaiConfig;", "plaiRepo", "Lme/oriient/internal/services/dataManager/plai/PlaiRepository;", "getPlaiRepo", "()Lme/oriient/internal/services/dataManager/plai/PlaiRepository;", "plaiRepo$delegate", "preloadData", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/internal/infra/utils/core/OriientError;", "dataId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PlaiDataPreloader implements DataPreloader<String> {

    /* renamed from: configManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy configManager;

    @NotNull
    private final String dataTypeDescription = "FloorTransitions";

    /* renamed from: plaiRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy plaiRepo;

    public PlaiDataPreloader() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.plaiRepo = di.inject(reflectionFactory.b(PlaiRepository.class));
        this.configManager = InternalDiKt.getDi().inject(reflectionFactory.b(InternalConfigManager.class));
    }

    private final InternalConfigManager getConfigManager() {
        return (InternalConfigManager) this.configManager.getD();
    }

    private final PlaiConfig getPlaiConfig() {
        return ((InternalConfig) getConfigManager().getConfig().getValue()).getPlaiConfig();
    }

    private final PlaiRepository getPlaiRepo() {
        return (PlaiRepository) this.plaiRepo.getD();
    }

    @Override // me.oriient.internal.services.dataManager.preloading.DataPreloader
    @NotNull
    public String getDataTypeDescription() {
        return this.dataTypeDescription;
    }

    @Override // me.oriient.internal.services.dataManager.preloading.DataPreloader
    public /* bridge */ /* synthetic */ Object preloadData(String str, Continuation continuation) {
        return preloadData2(str, (Continuation<? super Outcome<Unit, OriientError>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: preloadData, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object preloadData2(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<kotlin.Unit, me.oriient.internal.infra.utils.core.OriientError>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof me.oriient.internal.services.dataManager.preloading.G
            if (r0 == 0) goto L13
            r0 = r6
            me.oriient.internal.services.dataManager.preloading.G r0 = (me.oriient.internal.services.dataManager.preloading.G) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.preloading.G r0 = new me.oriient.internal.services.dataManager.preloading.G
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f25367a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            me.oriient.internal.services.dataModel.plai.PlaiConfig r6 = r4.getPlaiConfig()
            boolean r6 = r6.getShouldPreloadPLAI()
            if (r6 == 0) goto L52
            me.oriient.internal.services.dataManager.plai.PlaiRepository r6 = r4.getPlaiRepo()
            r0.c = r3
            java.lang.Object r6 = r6.getPlaiInfo(r5, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            me.oriient.internal.infra.utils.core.Outcome r6 = (me.oriient.internal.infra.utils.core.Outcome) r6
            me.oriient.internal.services.dataManager.preloading.H r5 = me.oriient.internal.services.dataManager.preloading.H.f25368a
            me.oriient.internal.infra.utils.core.Outcome r5 = r6.map(r5)
            return r5
        L52:
            kotlin.Unit r5 = kotlin.Unit.f24250a
            me.oriient.internal.infra.utils.core.Outcome r5 = me.oriient.internal.infra.utils.core.OutcomeKt.toOutcomeSuccess(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.preloading.PlaiDataPreloader.preloadData2(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
