package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", l = {619}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PagerState$animateScrollToPage$3 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ PagerState r;
    public final /* synthetic */ int s;
    public final /* synthetic */ float t;
    public final /* synthetic */ AnimationSpec u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$animateScrollToPage$3(PagerState pagerState, int i, float f, AnimationSpec animationSpec, Continuation continuation) {
        super(2, continuation);
        this.r = pagerState;
        this.s = i;
        this.t = f;
        this.u = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PagerState$animateScrollToPage$3 pagerState$animateScrollToPage$3 = new PagerState$animateScrollToPage$3(this.r, this.s, this.t, this.u, continuation);
        pagerState$animateScrollToPage$3.q = obj;
        return pagerState$animateScrollToPage$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PagerState$animateScrollToPage$3) create((ScrollScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = this.p;
        Unit unit = Unit.f24250a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        ScrollScope scrollScope = (ScrollScope) this.q;
        final PagerState pagerState = this.r;
        final PagerScrollScopeKt$LazyLayoutScrollScope$1 pagerScrollScopeKt$LazyLayoutScrollScope$1 = new PagerScrollScopeKt$LazyLayoutScrollScope$1(scrollScope, pagerState);
        Function2<ScrollScope, Integer, Unit> function2 = new Function2<ScrollScope, Integer, Unit>() { // from class: androidx.compose.foundation.pager.PagerState$animateScrollToPage$3.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int iIntValue = ((Number) obj3).intValue();
                PagerState pagerState2 = pagerState;
                ((SnapshotMutableIntStateImpl) pagerState2.s).i(pagerState2.i(iIntValue));
                return Unit.f24250a;
            }
        };
        this.p = 1;
        float f = PagerStateKt.f1093a;
        int i3 = this.s;
        function2.invoke(pagerScrollScopeKt$LazyLayoutScrollScope$1, new Integer(i3));
        boolean z = i3 > pagerState.e;
        int iD = (pagerScrollScopeKt$LazyLayoutScrollScope$1.d() - pagerState.e) + 1;
        if (((z && i3 > pagerScrollScopeKt$LazyLayoutScrollScope$1.d()) || (!z && i3 < pagerState.e)) && Math.abs(i3 - pagerState.e) >= 3) {
            if (z) {
                i = i3 - iD;
                int i4 = pagerState.e;
                if (i < i4) {
                    i = i4;
                }
            } else {
                int i5 = iD + i3;
                i = pagerState.e;
                if (i5 <= i) {
                    i = i5;
                }
            }
            pagerScrollScopeKt$LazyLayoutScrollScope$1.b(i);
        }
        float fE = pagerScrollScopeKt$LazyLayoutScrollScope$1.e(i3) + this.t;
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        Object objC = SuspendAnimationKt.c(BitmapDescriptorFactory.HUE_RED, fE, this.u, new Function2<Float, Float, Unit>() { // from class: androidx.compose.foundation.pager.PagerStateKt$animateScrollToPage$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                float fFloatValue = ((Number) obj2).floatValue();
                ((Number) obj3).floatValue();
                Ref.FloatRef floatRef2 = floatRef;
                floatRef2.d += pagerScrollScopeKt$LazyLayoutScrollScope$1.f1091a.f(fFloatValue - floatRef2.d);
                return Unit.f24250a;
            }
        }, this, 4);
        if (objC != coroutineSingletons) {
            objC = unit;
        }
        return objC == coroutineSingletons ? coroutineSingletons : unit;
    }
}
