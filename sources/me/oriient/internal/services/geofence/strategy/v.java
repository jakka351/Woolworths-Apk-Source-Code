package me.oriient.internal.services.geofence.strategy;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.locationManager.SystemLocation;
import me.oriient.internal.services.dataManager.building.BuildingsSearchResult;

/* loaded from: classes7.dex */
public final class v extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public SystemLocation f25514a;
    public Collection b;
    public Iterator c;
    public Collection d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ z g;
    public final /* synthetic */ SystemLocation h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, SystemLocation systemLocation, Continuation continuation) {
        super(2, continuation);
        this.g = zVar;
        this.h = systemLocation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        v vVar = new v(this.g, this.h, continuation);
        vVar.f = obj;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((BuildingsSearchResult) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0070 -> B:15:0x0071). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.e
            r2 = 1
            if (r1 == 0) goto L21
            if (r1 != r2) goto L19
            java.util.Collection r1 = r7.d
            java.util.Iterator r3 = r7.c
            java.util.Collection r4 = r7.b
            me.oriient.internal.infra.locationManager.SystemLocation r5 = r7.f25514a
            java.lang.Object r6 = r7.f
            me.oriient.internal.services.geofence.strategy.z r6 = (me.oriient.internal.services.geofence.strategy.z) r6
            kotlin.ResultKt.b(r8)
            goto L71
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            kotlin.ResultKt.b(r8)
            java.lang.Object r8 = r7.f
            me.oriient.internal.services.dataManager.building.BuildingsSearchResult r8 = (me.oriient.internal.services.dataManager.building.BuildingsSearchResult) r8
            java.util.List r8 = r8.getResults()
            me.oriient.internal.services.geofence.strategy.z r1 = r7.g
            me.oriient.internal.infra.locationManager.SystemLocation r3 = r7.h
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.s(r8, r5)
            r4.<init>(r5)
            java.util.Iterator r8 = r8.iterator()
            r6 = r1
            r5 = r3
            r3 = r8
        L42:
            r1 = r4
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L77
            java.lang.Object r8 = r3.next()
            me.oriient.internal.services.dataManager.building.BuildingSearchResult r8 = (me.oriient.internal.services.dataManager.building.BuildingSearchResult) r8
            kotlin.Lazy r4 = r6.i
            java.lang.Object r4 = r4.getD()
            me.oriient.internal.services.geofence.y r4 = (me.oriient.internal.services.geofence.y) r4
            java.lang.String r8 = r8.getId()
            r7.f = r6
            r7.f25514a = r5
            r7.b = r1
            r7.c = r3
            r7.d = r1
            r7.e = r2
            me.oriient.internal.services.geofence.C r4 = (me.oriient.internal.services.geofence.C) r4
            java.lang.Object r8 = r4.a(r8, r5, r7)
            if (r8 != r0) goto L70
            return r0
        L70:
            r4 = r1
        L71:
            me.oriient.internal.infra.utils.core.Outcome r8 = (me.oriient.internal.infra.utils.core.Outcome) r8
            r1.add(r8)
            goto L42
        L77:
            java.util.List r1 = (java.util.List) r1
            me.oriient.internal.infra.utils.core.Outcome r8 = me.oriient.internal.infra.utils.core.OutcomeKt.combineOutcomes(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.geofence.strategy.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
