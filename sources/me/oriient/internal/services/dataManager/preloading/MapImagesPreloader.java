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
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepository;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0017\u001a\u00020\u0002H\u0096@¢\u0006\u0002\u0010\u0018R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lme/oriient/internal/services/dataManager/preloading/MapImagesPreloader;", "Lme/oriient/internal/services/dataManager/preloading/DataPreloader;", "Lme/oriient/internal/services/dataManager/preloading/FloorDataPreloaderId;", "()V", "configManager", "Lme/oriient/internal/services/config/InternalConfigManager;", "getConfigManager", "()Lme/oriient/internal/services/config/InternalConfigManager;", "configManager$delegate", "Lkotlin/Lazy;", "dataTypeDescription", "", "getDataTypeDescription", "()Ljava/lang/String;", "floorMetadataRepository", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadataRepository;", "getFloorMetadataRepository", "()Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadataRepository;", "floorMetadataRepository$delegate", "preloadData", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/internal/infra/utils/core/OriientError;", "dataId", "(Lme/oriient/internal/services/dataManager/preloading/FloorDataPreloaderId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MapImagesPreloader implements DataPreloader<FloorDataPreloaderId> {

    /* renamed from: configManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy configManager;

    @NotNull
    private final String dataTypeDescription;

    /* renamed from: floorMetadataRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy floorMetadataRepository;

    public MapImagesPreloader() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.floorMetadataRepository = di.inject(reflectionFactory.b(FloorMetadataRepository.class));
        this.configManager = InternalDiKt.getDi().inject(reflectionFactory.b(InternalConfigManager.class));
        this.dataTypeDescription = "MapImages";
    }

    private final InternalConfigManager getConfigManager() {
        return (InternalConfigManager) this.configManager.getD();
    }

    private final FloorMetadataRepository getFloorMetadataRepository() {
        return (FloorMetadataRepository) this.floorMetadataRepository.getD();
    }

    @Override // me.oriient.internal.services.dataManager.preloading.DataPreloader
    @NotNull
    public String getDataTypeDescription() {
        return this.dataTypeDescription;
    }

    @Override // me.oriient.internal.services.dataManager.preloading.DataPreloader
    public /* bridge */ /* synthetic */ Object preloadData(FloorDataPreloaderId floorDataPreloaderId, Continuation continuation) {
        return preloadData2(floorDataPreloaderId, (Continuation<? super Outcome<Unit, OriientError>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: preloadData, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object preloadData2(@org.jetbrains.annotations.NotNull me.oriient.internal.services.dataManager.preloading.FloorDataPreloaderId r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<kotlin.Unit, me.oriient.internal.infra.utils.core.OriientError>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof me.oriient.internal.services.dataManager.preloading.E
            if (r0 == 0) goto L13
            r0 = r6
            me.oriient.internal.services.dataManager.preloading.E r0 = (me.oriient.internal.services.dataManager.preloading.E) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.preloading.E r0 = new me.oriient.internal.services.dataManager.preloading.E
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f25365a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L63
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            me.oriient.internal.services.config.InternalConfigManager r6 = r4.getConfigManager()
            kotlinx.coroutines.flow.StateFlow r6 = r6.getConfig()
            java.lang.Object r6 = r6.getValue()
            me.oriient.internal.services.config.InternalConfig r6 = (me.oriient.internal.services.config.InternalConfig) r6
            boolean r6 = r6.isMapImagesPreloadingEnabled()
            if (r6 != 0) goto L4e
            me.oriient.internal.infra.utils.core.Outcome$Success r5 = new me.oriient.internal.infra.utils.core.Outcome$Success
            kotlin.Unit r6 = kotlin.Unit.f24250a
            r5.<init>(r6)
            return r5
        L4e:
            me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepository r6 = r4.getFloorMetadataRepository()
            java.lang.String r2 = r5.getBuildingId()
            java.lang.String r5 = r5.getFloorId()
            r0.c = r3
            java.lang.Object r6 = r6.fetchFloorMetadataWithBitmap(r2, r5, r0)
            if (r6 != r1) goto L63
            return r1
        L63:
            me.oriient.internal.infra.utils.core.Outcome r6 = (me.oriient.internal.infra.utils.core.Outcome) r6
            me.oriient.internal.infra.utils.core.Outcome r5 = r6.mapToUnit()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.preloading.MapImagesPreloader.preloadData2(me.oriient.internal.services.dataManager.preloading.FloorDataPreloaderId, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
