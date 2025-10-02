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
import me.oriient.internal.services.dataManager.floorTransitions.FloorTransitionsRepository;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0011\u001a\u00020\u0002H\u0096@¢\u0006\u0002\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0002X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lme/oriient/internal/services/dataManager/preloading/FloorTransitionsDataPreloader;", "Lme/oriient/internal/services/dataManager/preloading/DataPreloader;", "", "()V", "dataTypeDescription", "getDataTypeDescription", "()Ljava/lang/String;", "floorTransitionsRepository", "Lme/oriient/internal/services/dataManager/floorTransitions/FloorTransitionsRepository;", "getFloorTransitionsRepository", "()Lme/oriient/internal/services/dataManager/floorTransitions/FloorTransitionsRepository;", "floorTransitionsRepository$delegate", "Lkotlin/Lazy;", "preloadData", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/internal/infra/utils/core/OriientError;", "dataId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FloorTransitionsDataPreloader implements DataPreloader<String> {

    @NotNull
    private final String dataTypeDescription = "FloorTransitions";

    /* renamed from: floorTransitionsRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy floorTransitionsRepository = InternalDiKt.getDi().inject(Reflection.f24268a.b(FloorTransitionsRepository.class));

    private final FloorTransitionsRepository getFloorTransitionsRepository() {
        return (FloorTransitionsRepository) this.floorTransitionsRepository.getD();
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
            boolean r0 = r6 instanceof me.oriient.internal.services.dataManager.preloading.A
            if (r0 == 0) goto L13
            r0 = r6
            me.oriient.internal.services.dataManager.preloading.A r0 = (me.oriient.internal.services.dataManager.preloading.A) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.preloading.A r0 = new me.oriient.internal.services.dataManager.preloading.A
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f25362a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            me.oriient.internal.services.dataManager.floorTransitions.FloorTransitionsRepository r6 = r4.getFloorTransitionsRepository()
            r0.c = r3
            java.lang.Object r6 = r6.fetchFloorTransitions(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            me.oriient.internal.infra.utils.core.Outcome r6 = (me.oriient.internal.infra.utils.core.Outcome) r6
            me.oriient.internal.services.dataManager.preloading.B r5 = me.oriient.internal.services.dataManager.preloading.B.f25363a
            me.oriient.internal.infra.utils.core.Outcome r5 = r6.map(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.preloading.FloorTransitionsDataPreloader.preloadData2(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
