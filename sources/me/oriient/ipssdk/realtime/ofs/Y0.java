package me.oriient.ipssdk.realtime.ofs;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.locationManager.SystemLocation;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.ipssdk.api.models.IPSStartingPosition;
import me.oriient.positioningengine.common.PositioningContext;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.ondevice.models.OnDeviceEngineSession;

/* loaded from: classes8.dex */
public final class Y0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f26033a;
    public PositioningContext b;
    public int c;
    public final /* synthetic */ SystemLocation d;
    public final /* synthetic */ Building e;
    public final /* synthetic */ IPSStartingPosition f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ List h;
    public final /* synthetic */ OnDeviceEngineSession i;
    public final /* synthetic */ long j;
    public final /* synthetic */ PositioningEngine k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(SystemLocation systemLocation, Building building, IPSStartingPosition iPSStartingPosition, boolean z, List list, OnDeviceEngineSession onDeviceEngineSession, long j, PositioningEngine positioningEngine, Continuation continuation) {
        super(2, continuation);
        this.d = systemLocation;
        this.e = building;
        this.f = iPSStartingPosition;
        this.g = z;
        this.h = list;
        this.i = onDeviceEngineSession;
        this.j = j;
        this.k = positioningEngine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Y0(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Y0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0213, code lost:
    
        if (r4.startPositioning(r2, r38) != r1) goto L87;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ofs.Y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
