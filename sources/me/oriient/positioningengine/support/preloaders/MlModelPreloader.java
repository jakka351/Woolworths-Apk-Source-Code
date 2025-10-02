package me.oriient.positioningengine.support.preloaders;

import androidx.annotation.Keep;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.preloading.DataPreloader;
import me.oriient.positioningengine.common.DiKt;
import me.oriient.positioningengine.ondevice.ml.i;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lme/oriient/positioningengine/support/preloaders/MlModelPreloader;", "Lme/oriient/internal/services/dataManager/preloading/DataPreloader;", "", "<init>", "()V", "dataId", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/internal/infra/utils/core/OriientError;", "preloadData", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "dataTypeDescription", "Ljava/lang/String;", "getDataTypeDescription", "()Ljava/lang/String;", "Lme/oriient/positioningengine/ondevice/ml/i;", "mlModelRepository$delegate", "Lkotlin/Lazy;", "getMlModelRepository", "()Lme/oriient/positioningengine/ondevice/ml/i;", "mlModelRepository", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MlModelPreloader implements DataPreloader<Unit> {

    @NotNull
    private final String dataTypeDescription = "MlModel";

    /* renamed from: mlModelRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mlModelRepository = DiKt.getDi().inject(Reflection.f24268a.b(i.class));

    private final i getMlModelRepository() {
        return (i) this.mlModelRepository.getD();
    }

    @Override // me.oriient.internal.services.dataManager.preloading.DataPreloader
    @NotNull
    public String getDataTypeDescription() {
        return this.dataTypeDescription;
    }

    @Override // me.oriient.internal.services.dataManager.preloading.DataPreloader
    public /* bridge */ /* synthetic */ Object preloadData(Unit unit, Continuation continuation) {
        return preloadData2(unit, (Continuation<? super Outcome<Unit, OriientError>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: preloadData, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object preloadData2(@org.jetbrains.annotations.NotNull kotlin.Unit r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<kotlin.Unit, me.oriient.internal.infra.utils.core.OriientError>> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r5 = r6 instanceof me.oriient.positioningengine.support.preloaders.a
            if (r5 == 0) goto L13
            r5 = r6
            me.oriient.positioningengine.support.preloaders.a r5 = (me.oriient.positioningengine.support.preloaders.a) r5
            int r0 = r5.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.c = r0
            goto L18
        L13:
            me.oriient.positioningengine.support.preloaders.a r5 = new me.oriient.positioningengine.support.preloaders.a
            r5.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r5.f26566a
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r5.c
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            kotlin.ResultKt.b(r6)
            goto L53
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            me.oriient.positioningengine.ondevice.ml.i r6 = r4.getMlModelRepository()
            r5.c = r2
            me.oriient.positioningengine.ondevice.ml.o r6 = (me.oriient.positioningengine.ondevice.ml.o) r6
            kotlin.Lazy r1 = r6.d
            java.lang.Object r1 = r1.getD()
            me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider r1 = (me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider) r1
            kotlin.coroutines.CoroutineContext r1 = r1.getIo()
            me.oriient.positioningengine.ondevice.ml.n r2 = new me.oriient.positioningengine.ondevice.ml.n
            r3 = 0
            r2.<init>(r6, r3)
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.f(r1, r2, r5)
            if (r6 != r0) goto L53
            return r0
        L53:
            me.oriient.internal.infra.utils.core.Outcome r6 = (me.oriient.internal.infra.utils.core.Outcome) r6
            boolean r5 = r6 instanceof me.oriient.internal.infra.utils.core.Outcome.Success
            if (r5 == 0) goto L61
            me.oriient.internal.infra.utils.core.Outcome$Success r5 = new me.oriient.internal.infra.utils.core.Outcome$Success
            kotlin.Unit r6 = kotlin.Unit.f24250a
            r5.<init>(r6)
            return r5
        L61:
            boolean r5 = r6 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r5 == 0) goto L80
            me.oriient.internal.infra.utils.core.Outcome$Failure r5 = new me.oriient.internal.infra.utils.core.Outcome$Failure
            me.oriient.internal.infra.utils.core.InternalError r0 = new me.oriient.internal.infra.utils.core.InternalError
            me.oriient.internal.infra.utils.core.Outcome$Failure r6 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r6
            java.lang.Exception r6 = r6.getValue()
            me.oriient.positioningengine.common.util.PositioningEngineError r6 = (me.oriient.positioningengine.common.util.PositioningEngineError) r6
            java.lang.String r6 = r6.getMessage()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        L80:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.preloaders.MlModelPreloader.preloadData2(kotlin.Unit, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
