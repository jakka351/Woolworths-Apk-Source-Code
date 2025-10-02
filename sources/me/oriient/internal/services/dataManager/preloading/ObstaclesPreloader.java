package me.oriient.internal.services.dataManager.preloading;

import androidx.annotation.Keep;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.obstacles.ObstaclesPriorityLoader;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0096@¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lme/oriient/internal/services/dataManager/preloading/ObstaclesPreloader;", "Lme/oriient/internal/services/dataManager/preloading/DataPreloader;", "Lme/oriient/internal/services/dataManager/preloading/FloorDataPreloaderId;", "()V", "dataTypeDescription", "", "getDataTypeDescription", "()Ljava/lang/String;", "obstaclesPriorityLoader", "Lme/oriient/internal/services/dataManager/obstacles/ObstaclesPriorityLoader;", "getObstaclesPriorityLoader", "()Lme/oriient/internal/services/dataManager/obstacles/ObstaclesPriorityLoader;", "obstaclesPriorityLoader$delegate", "Lkotlin/Lazy;", "preloadData", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/internal/infra/utils/core/OriientError;", "dataId", "(Lme/oriient/internal/services/dataManager/preloading/FloorDataPreloaderId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ObstaclesPreloader implements DataPreloader<FloorDataPreloaderId> {

    @NotNull
    private final String dataTypeDescription = "Obstacles";

    /* renamed from: obstaclesPriorityLoader$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy obstaclesPriorityLoader = InternalDiKt.getDi().inject(Reflection.f24268a.b(ObstaclesPriorityLoader.class));

    private final ObstaclesPriorityLoader getObstaclesPriorityLoader() {
        return (ObstaclesPriorityLoader) this.obstaclesPriorityLoader.getD();
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: preloadData, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object preloadData2(@org.jetbrains.annotations.NotNull me.oriient.internal.services.dataManager.preloading.FloorDataPreloaderId r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<kotlin.Unit, me.oriient.internal.infra.utils.core.OriientError>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof me.oriient.internal.services.dataManager.preloading.F
            if (r0 == 0) goto L14
            r0 = r11
            me.oriient.internal.services.dataManager.preloading.F r0 = (me.oriient.internal.services.dataManager.preloading.F) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            me.oriient.internal.services.dataManager.preloading.F r0 = new me.oriient.internal.services.dataManager.preloading.F
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f25366a
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.ResultKt.b(r11)
            goto L54
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            kotlin.ResultKt.b(r11)
            r11 = r2
            me.oriient.internal.services.dataManager.obstacles.u r2 = new me.oriient.internal.services.dataManager.obstacles.u
            java.lang.String r1 = r10.getBuildingId()
            java.lang.String r10 = r10.getFloorId()
            r2.<init>(r1, r10)
            me.oriient.internal.services.dataManager.obstacles.ObstaclesPriorityLoader r1 = r9.getObstaclesPriorityLoader()
            r6.c = r11
            r7 = 6
            r8 = 0
            r3 = 0
            r5 = 0
            java.lang.Object r11 = me.oriient.internal.services.dataPriorityLoader.DataPriorityLoader.DefaultImpls.loadData$default(r1, r2, r3, r5, r6, r7, r8)
            if (r11 != r0) goto L54
            return r0
        L54:
            me.oriient.internal.infra.utils.core.Outcome r11 = (me.oriient.internal.infra.utils.core.Outcome) r11
            me.oriient.internal.infra.utils.core.Outcome r10 = r11.mapToUnit()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.preloading.ObstaclesPreloader.preloadData2(me.oriient.internal.services.dataManager.preloading.FloorDataPreloaderId, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
