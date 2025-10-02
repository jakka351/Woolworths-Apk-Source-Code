package me.oriient.internal.services.geofence;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function6;
import me.oriient.internal.services.geofence.GeneralGeofenceStatus;

/* loaded from: classes7.dex */
public final class t extends SuspendLambda implements Function6 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f25519a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;
    public /* synthetic */ Map d;
    public /* synthetic */ Map e;
    public final /* synthetic */ GeneralGeofenceStatusProviderImpl f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(GeneralGeofenceStatusProviderImpl generalGeofenceStatusProviderImpl, Continuation continuation) {
        super(6, continuation);
        this.f = generalGeofenceStatusProviderImpl;
    }

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        t tVar = new t(this.f, (Continuation) obj6);
        tVar.f25519a = zBooleanValue;
        tVar.b = zBooleanValue2;
        tVar.c = zBooleanValue3;
        tVar.d = (Map) obj4;
        tVar.e = (Map) obj5;
        return tVar.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        boolean z = this.f25519a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        Map map = this.d;
        Map map2 = this.e;
        if (!z) {
            return GeneralGeofenceStatus.Undefined.INSTANCE;
        }
        if (!z2) {
            return GeneralGeofenceStatus.Inactive.INSTANCE;
        }
        GeneralGeofenceStatus generalGeofenceStatusConvertBuildingStatusToGeneralStatus = this.f.convertBuildingStatusToGeneralStatus(map, true);
        return (z3 && generalGeofenceStatusConvertBuildingStatusToGeneralStatus.isConsideredInside()) ? generalGeofenceStatusConvertBuildingStatusToGeneralStatus : this.f.convertBuildingStatusToGeneralStatus(map2, false);
    }
}
