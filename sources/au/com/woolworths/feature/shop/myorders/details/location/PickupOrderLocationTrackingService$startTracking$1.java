package au.com.woolworths.feature.shop.myorders.details.location;

import android.location.Location;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "location", "Landroid/location/Location;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.location.PickupOrderLocationTrackingService$startTracking$1", f = "PickupOrderLocationTrackingService.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PickupOrderLocationTrackingService$startTracking$1 extends SuspendLambda implements Function2<Location, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ PickupOrderLocationTrackingService r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickupOrderLocationTrackingService$startTracking$1(PickupOrderLocationTrackingService pickupOrderLocationTrackingService, int i, Continuation continuation) {
        super(2, continuation);
        this.r = pickupOrderLocationTrackingService;
        this.s = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PickupOrderLocationTrackingService$startTracking$1 pickupOrderLocationTrackingService$startTracking$1 = new PickupOrderLocationTrackingService$startTracking$1(this.r, this.s, continuation);
        pickupOrderLocationTrackingService$startTracking$1.q = obj;
        return pickupOrderLocationTrackingService$startTracking$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PickupOrderLocationTrackingService$startTracking$1) create((Location) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r12.p
            r2 = 0
            r3 = 1
            au.com.woolworths.feature.shop.myorders.details.location.PickupOrderLocationTrackingService r4 = r12.r
            if (r1 == 0) goto L1c
            if (r1 != r3) goto L14
            kotlin.ResultKt.b(r13)     // Catch: java.lang.Exception -> L11
            r11 = r12
            goto L3d
        L11:
            r11 = r12
            goto L8b
        L14:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1c:
            kotlin.ResultKt.b(r13)
            java.lang.Object r13 = r12.q
            android.location.Location r13 = (android.location.Location) r13
            au.com.woolworths.feature.shop.myorders.details.PickupOrderLocationInteractor r1 = r4.i     // Catch: java.lang.Exception -> L11
            if (r1 == 0) goto L84
            int r6 = r12.s     // Catch: java.lang.Exception -> L11
            double r7 = r13.getLatitude()     // Catch: java.lang.Exception -> L11
            double r9 = r13.getLongitude()     // Catch: java.lang.Exception -> L11
            r12.p = r3     // Catch: java.lang.Exception -> L11
            au.com.woolworths.feature.shop.myorders.details.PickupOrderLocationRepository r5 = r1.f7679a     // Catch: java.lang.Exception -> L11
            r11 = r12
            java.lang.Object r13 = r5.a(r6, r7, r9, r11)     // Catch: java.lang.Exception -> L8b
            if (r13 != r0) goto L3d
            return r0
        L3d:
            com.woolworths.feature.shop.myorders.UpdatePickupOrderLocationMutation$UpdatePickupOrderLocation r13 = (com.woolworths.feature.shop.myorders.UpdatePickupOrderLocationMutation.UpdatePickupOrderLocation) r13     // Catch: java.lang.Exception -> L8b
            if (r13 == 0) goto La0
            kotlinx.coroutines.Job r0 = r4.m     // Catch: java.lang.Exception -> L8b
            java.lang.String r1 = "defaultTerminateServiceJob"
            if (r0 == 0) goto L80
            kotlinx.coroutines.AbstractCoroutine r0 = (kotlinx.coroutines.AbstractCoroutine) r0     // Catch: java.lang.Exception -> L8b
            boolean r0 = r0.isActive()     // Catch: java.lang.Exception -> L8b
            if (r0 == 0) goto L76
            kotlinx.coroutines.Job r0 = r4.m     // Catch: java.lang.Exception -> L8b
            if (r0 == 0) goto L72
            kotlinx.coroutines.JobSupport r0 = (kotlinx.coroutines.JobSupport) r0     // Catch: java.lang.Exception -> L8b
            r0.cancel(r2)     // Catch: java.lang.Exception -> L8b
            int r0 = r13.b     // Catch: java.lang.Exception -> L8b
            int r1 = r13.f20027a     // Catch: java.lang.Exception -> L8b
            int r0 = r0 + r1
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Exception -> L8b
            long r5 = (long) r0     // Catch: java.lang.Exception -> L8b
            long r0 = r1.toMillis(r5)     // Catch: java.lang.Exception -> L8b
            androidx.lifecycle.LifecycleCoroutineScopeImpl r3 = androidx.lifecycle.LifecycleOwnerKt.a(r4)     // Catch: java.lang.Exception -> L8b
            au.com.woolworths.feature.shop.myorders.details.location.PickupOrderLocationTrackingService$startTerminateServiceTimer$1 r5 = new au.com.woolworths.feature.shop.myorders.details.location.PickupOrderLocationTrackingService$startTerminateServiceTimer$1     // Catch: java.lang.Exception -> L8b
            r5.<init>(r0, r4, r2)     // Catch: java.lang.Exception -> L8b
            r0 = 3
            kotlinx.coroutines.BuildersKt.c(r3, r2, r2, r5, r0)     // Catch: java.lang.Exception -> L8b
            goto L76
        L72:
            kotlin.jvm.internal.Intrinsics.p(r1)     // Catch: java.lang.Exception -> L8b
            throw r2     // Catch: java.lang.Exception -> L8b
        L76:
            boolean r13 = r13.c     // Catch: java.lang.Exception -> L8b
            if (r13 == 0) goto La0
            java.lang.String r13 = "backend driven"
            r4.a(r13)     // Catch: java.lang.Exception -> L8b
            goto La0
        L80:
            kotlin.jvm.internal.Intrinsics.p(r1)     // Catch: java.lang.Exception -> L8b
            throw r2     // Catch: java.lang.Exception -> L8b
        L84:
            r11 = r12
            java.lang.String r13 = "pickupOrderLocationInteractor"
            kotlin.jvm.internal.Intrinsics.p(r13)     // Catch: java.lang.Exception -> L8b
            throw r2     // Catch: java.lang.Exception -> L8b
        L8b:
            au.com.woolworths.android.onesite.analytics.AnalyticsManager r13 = r4.l
            if (r13 == 0) goto La3
            au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions r0 = au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions.G
            au.com.woolworths.analytics.model.TrackableValue r1 = au.com.woolworths.analytics.model.TrackableValue.h1
            int r2 = r11.s
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            au.com.woolworths.analytics.model.TrackingMetadata r1 = au.com.woolworths.analytics.model.TrackingMetadata.Companion.a(r1, r2)
            r13.j(r0, r1)
        La0:
            kotlin.Unit r13 = kotlin.Unit.f24250a
            return r13
        La3:
            java.lang.String r13 = "analyticsManager"
            kotlin.jvm.internal.Intrinsics.p(r13)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.location.PickupOrderLocationTrackingService$startTracking$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
