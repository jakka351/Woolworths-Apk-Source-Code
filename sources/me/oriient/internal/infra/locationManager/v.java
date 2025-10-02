package me.oriient.internal.infra.locationManager;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class v implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationManagerAndroid f24960a;

    public v(LocationManagerAndroid locationManagerAndroid) {
        this.f24960a = locationManagerAndroid;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof me.oriient.internal.infra.locationManager.C1208u
            if (r0 == 0) goto L13
            r0 = r7
            me.oriient.internal.infra.locationManager.u r0 = (me.oriient.internal.infra.locationManager.C1208u) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            me.oriient.internal.infra.locationManager.u r0 = new me.oriient.internal.infra.locationManager.u
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            me.oriient.internal.infra.locationManager.v r6 = r0.f24959a
            kotlin.ResultKt.b(r7)
            goto L5d
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.ResultKt.b(r7)
            me.oriient.internal.infra.locationManager.LocationManagerAndroid r7 = r5.f24960a
            me.oriient.internal.infra.utils.core.Logger r7 = me.oriient.internal.infra.locationManager.LocationManagerAndroid.access$getLogger(r7)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "startPermissionMonitoring() collect called with: isGranted = "
            r2.<init>(r4)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "LocationManagerAndroid"
            r7.d(r4, r2)
            if (r6 == 0) goto L62
            me.oriient.internal.infra.locationManager.LocationManagerAndroid r6 = r5.f24960a
            r0.f24959a = r5
            r0.d = r3
            java.lang.Object r6 = me.oriient.internal.infra.locationManager.LocationManagerAndroid.access$startLocationUpdatesImpl(r6, r0)
            if (r6 != r1) goto L5c
            return r1
        L5c:
            r6 = r5
        L5d:
            me.oriient.internal.infra.locationManager.LocationManagerAndroid r6 = r6.f24960a
            me.oriient.internal.infra.locationManager.LocationManagerAndroid.access$stopPermissionMonitoring(r6)
        L62:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.infra.locationManager.v.a(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a(((Boolean) obj).booleanValue(), continuation);
    }
}
