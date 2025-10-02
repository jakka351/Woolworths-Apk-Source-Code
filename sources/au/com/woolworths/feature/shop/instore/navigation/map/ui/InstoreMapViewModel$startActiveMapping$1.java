package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$startActiveMapping$1", f = "InstoreMapViewModel.kt", l = {1041}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InstoreMapViewModel$startActiveMapping$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ InstoreMapViewModel q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$startActiveMapping$1$1, reason: invalid class name */
    final class AnonymousClass1<T> implements FlowCollector {
        public final /* synthetic */ InstoreMapViewModel d;

        public AnonymousClass1(InstoreMapViewModel instoreMapViewModel) {
            this.d = instoreMapViewModel;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
        
            if (ovh.plrapps.mapcompose.api.LayoutApiKt.d(r13, r14, r1, r9) != r0) goto L30;
         */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(au.com.woolworths.feature.shop.instore.navigation.map.data.MapFocus r13, kotlin.coroutines.Continuation r14) {
            /*
                r12 = this;
                boolean r0 = r14 instanceof au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$startActiveMapping$1$1$emit$1
                if (r0 == 0) goto L14
                r0 = r14
                au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$startActiveMapping$1$1$emit$1 r0 = (au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$startActiveMapping$1$1$emit$1) r0
                int r1 = r0.t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L14
                int r1 = r1 - r2
                r0.t = r1
            L12:
                r9 = r0
                goto L1a
            L14:
                au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$startActiveMapping$1$1$emit$1 r0 = new au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$startActiveMapping$1$1$emit$1
                r0.<init>(r12, r14)
                goto L12
            L1a:
                java.lang.Object r14 = r9.r
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r1 = r9.t
                r11 = 2
                r2 = 1
                if (r1 == 0) goto L3d
                if (r1 == r2) goto L35
                if (r1 != r11) goto L2d
                kotlin.ResultKt.b(r14)
                goto L9b
            L2d:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L35:
                au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$MapData r13 = r9.q
                au.com.woolworths.feature.shop.instore.navigation.map.data.MapFocus r1 = r9.p
                kotlin.ResultKt.b(r14)
                goto L7f
            L3d:
                kotlin.ResultKt.b(r14)
                au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel r14 = r12.d
                kotlinx.coroutines.flow.MutableStateFlow r14 = r14.s
                java.lang.Object r14 = r14.getValue()
                au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState r14 = (au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract.ViewState) r14
                au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$Content r14 = r14.b()
                if (r14 == 0) goto L9b
                au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$MapData r14 = r14.b
                if (r14 == 0) goto L9b
                ovh.plrapps.mapcompose.ui.state.MapState r1 = r14.f7384a
                if (r13 == 0) goto L9b
                au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMetersCoordinate r3 = r13.f7337a
                au.com.woolworths.feature.shop.instore.navigation.map.data.ImageMapData r4 = r14.b
                long r5 = ovh.plrapps.mapcompose.api.LayoutApiKt.b(r1)
                au.com.woolworths.feature.shop.instore.navigation.map.utils.RelativePosition r3 = au.com.woolworths.feature.shop.instore.navigation.map.utils.CoordinateUtilsKt.b(r3, r4, r5)
                r5 = r2
                r4 = r3
                double r2 = r4.f7412a
                double r6 = r4.b
                r9.p = r13
                r9.q = r14
                r9.t = r5
                r4 = r6
                r6 = 4609434218613702656(0x3ff8000000000000, double:1.5)
                r8 = 0
                r10 = 24
                java.lang.Object r1 = ovh.plrapps.mapcompose.api.LayoutApiKt.f(r1, r2, r4, r6, r8, r9, r10)
                if (r1 != r0) goto L7d
                goto L9a
            L7d:
                r1 = r13
                r13 = r14
            L7f:
                ovh.plrapps.mapcompose.ui.state.MapState r13 = r13.f7384a
                double r1 = r1.b
                float r14 = (float) r1
                androidx.compose.animation.core.TweenSpec r1 = new androidx.compose.animation.core.TweenSpec
                r2 = 1000(0x3e8, float:1.401E-42)
                androidx.compose.animation.core.CubicBezierEasing r3 = androidx.compose.animation.core.EasingKt.f756a
                r1.<init>(r2, r3, r11)
                r2 = 0
                r9.p = r2
                r9.q = r2
                r9.t = r11
                java.lang.Object r13 = ovh.plrapps.mapcompose.api.LayoutApiKt.d(r13, r14, r1, r9)
                if (r13 != r0) goto L9b
            L9a:
                return r0
            L9b:
                kotlin.Unit r13 = kotlin.Unit.f24250a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$startActiveMapping$1.AnonymousClass1.emit(au.com.woolworths.feature.shop.instore.navigation.map.data.MapFocus, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreMapViewModel$startActiveMapping$1(InstoreMapViewModel instoreMapViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = instoreMapViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstoreMapViewModel$startActiveMapping$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((InstoreMapViewModel$startActiveMapping$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw android.support.v4.media.session.a.v(obj);
        }
        ResultKt.b(obj);
        InstoreMapViewModel instoreMapViewModel = this.q;
        StateFlow stateFlowA = instoreMapViewModel.i.a();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(instoreMapViewModel);
        this.p = 1;
        stateFlowA.collect(anonymousClass1, this);
        return coroutineSingletons;
    }
}
