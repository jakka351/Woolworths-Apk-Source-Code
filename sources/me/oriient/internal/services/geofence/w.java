package me.oriient.internal.services.geofence;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3;

/* loaded from: classes7.dex */
public final class w extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25522a;
    public final /* synthetic */ GeneralGeofenceStatusProviderImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(GeneralGeofenceStatusProviderImpl generalGeofenceStatusProviderImpl, Continuation continuation) {
        super(2, continuation);
        this.b = generalGeofenceStatusProviderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new w(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new w(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25522a;
        if (i == 0) {
            ResultKt.b(obj);
            FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3K = FlowKt.k(this.b.getPermissionManager().isLocationPermissionGranted(), FlowKt.i(this.b.getGeofenceManager().isCircularStrategyEnabled(), this.b.getGeofenceManager().isLiveCircularStrategyEnabled(), this.b.getGeofenceManager().isPolygonalStrategyEnabled(), new v(null)), this.b.getGeofenceManager().isPolygonalStrategyEnabled(), this.b.getGeofenceManager().getPolygonalStatus(), this.b.getGeofenceManager().getCircularStatus(), new t(this.b, null));
            u uVar = new u(this.b);
            this.f25522a = 1;
            if (flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3K.collect(uVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
