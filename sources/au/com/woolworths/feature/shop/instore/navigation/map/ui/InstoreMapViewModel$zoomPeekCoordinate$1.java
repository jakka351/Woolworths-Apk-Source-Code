package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMetersCoordinate;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$zoomPeekCoordinate$1", f = "InstoreMapViewModel.kt", l = {775, 781, 783}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InstoreMapViewModel$zoomPeekCoordinate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public InstoreMapViewModel p;
    public InstoreMapContract.ViewState.MapData q;
    public int r;
    public final /* synthetic */ InstoreMapViewModel s;
    public final /* synthetic */ OriientMetersCoordinate t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreMapViewModel$zoomPeekCoordinate$1(InstoreMapViewModel instoreMapViewModel, OriientMetersCoordinate oriientMetersCoordinate, Continuation continuation) {
        super(2, continuation);
        this.s = instoreMapViewModel;
        this.t = oriientMetersCoordinate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstoreMapViewModel$zoomPeekCoordinate$1(this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstoreMapViewModel$zoomPeekCoordinate$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ba, code lost:
    
        if (ovh.plrapps.mapcompose.api.LayoutApiKt.e(r2, 0.5d, 0.5d, r3 / r0, (16 & 8) != 0 ? new androidx.compose.animation.core.SpringSpec(null, 5) : null, androidx.compose.ui.geometry.OffsetKt.a(-0.5f, -0.5f), r15) != r10) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[PHI: r0 r1
  0x0076: PHI (r0v11 au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$MapData) = 
  (r0v10 au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$MapData)
  (r0v23 au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$MapData)
 binds: [B:21:0x0073, B:10:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0076: PHI (r1v4 au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel) = 
  (r1v3 au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel)
  (r1v9 au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel)
 binds: [B:21:0x0073, B:10:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r10 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r15.r
            r11 = 3
            r12 = 2
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L24
            if (r0 == r12) goto L1c
            if (r0 != r11) goto L14
            kotlin.ResultKt.b(r16)
            goto Lbd
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1c:
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$MapData r0 = r15.q
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel r1 = r15.p
            kotlin.ResultKt.b(r16)
            goto L76
        L24:
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$MapData r0 = r15.q
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel r1 = r15.p
            kotlin.ResultKt.b(r16)
            goto L67
        L2c:
            kotlin.ResultKt.b(r16)
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel r13 = r15.s
            kotlinx.coroutines.flow.MutableStateFlow r0 = r13.s
            java.lang.Object r0 = r0.getValue()
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState r0 = (au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract.ViewState) r0
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$Content r0 = r0.b()
            if (r0 == 0) goto Lbd
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$MapData r14 = r0.b
            if (r14 == 0) goto Lbd
            au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMetersCoordinate r0 = r15.t
            au.com.woolworths.feature.shop.instore.navigation.map.utils.RelativePosition r0 = au.com.woolworths.feature.shop.instore.navigation.map.utils.CoordinateUtilsKt.a(r0, r14)
            ovh.plrapps.mapcompose.ui.state.MapState r2 = r14.f7384a
            double r3 = r0.f7412a
            double r5 = r0.b
            r15.p = r13
            r15.q = r14
            r15.r = r1
            r0 = r2
            r1 = r3
            r3 = r5
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 0
            r9 = 24
            r8 = r15
            java.lang.Object r0 = ovh.plrapps.mapcompose.api.LayoutApiKt.f(r0, r1, r3, r5, r7, r8, r9)
            if (r0 != r10) goto L65
            goto Lbc
        L65:
            r1 = r13
            r0 = r14
        L67:
            r15.p = r1
            r15.q = r0
            r15.r = r12
            r2 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r2 = kotlinx.coroutines.DelayKt.b(r2, r15)
            if (r2 != r10) goto L76
            goto Lbc
        L76:
            ovh.plrapps.mapcompose.ui.state.MapState r2 = r0.f7384a
            au.com.woolworths.feature.shop.instore.navigation.map.data.ImageMapData r0 = r0.b
            android.graphics.Bitmap r0 = r0.f
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            java.lang.String r4 = "getDisplayMetrics(...)"
            kotlin.jvm.internal.Intrinsics.g(r3, r4)
            r1.getClass()
            int r1 = r3.widthPixels
            double r3 = (double) r1
            int r1 = r0.getWidth()
            int r5 = r0.getHeight()
            if (r1 <= r5) goto L9f
            int r0 = r0.getHeight()
        L9d:
            double r0 = (double) r0
            goto La4
        L9f:
            int r0 = r0.getWidth()
            goto L9d
        La4:
            double r5 = r3 / r0
            r0 = 0
            r15.p = r0
            r15.q = r0
            r15.r = r11
            r0 = r2
            r1 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r3 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r7 = 0
            r9 = 24
            r8 = r15
            java.lang.Object r0 = ovh.plrapps.mapcompose.api.LayoutApiKt.f(r0, r1, r3, r5, r7, r8, r9)
            if (r0 != r10) goto Lbd
        Lbc:
            return r10
        Lbd:
            kotlin.Unit r0 = kotlin.Unit.f24250a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$zoomPeekCoordinate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
