package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {814}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements Function2<NestedScrollScope, Continuation<? super Unit>, Object> {
    public ScrollingLogic p;
    public Ref.LongRef q;
    public long r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ ScrollingLogic u;
    public final /* synthetic */ Ref.LongRef v;
    public final /* synthetic */ long w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, Ref.LongRef longRef, long j, Continuation continuation) {
        super(2, continuation);
        this.u = scrollingLogic;
        this.v = longRef;
        this.w = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.u, this.v, this.w, continuation);
        scrollingLogic$doFlingAnimation$2.t = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollingLogic$doFlingAnimation$2) create((NestedScrollScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final ScrollingLogic scrollingLogic;
        Ref.LongRef longRef;
        long j;
        ScrollingLogic scrollingLogic2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.s;
        if (i == 0) {
            ResultKt.b(obj);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.t;
            scrollingLogic = this.u;
            ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$reverseScope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public final float f(float f) {
                    float fAbs = Math.abs(f);
                    ScrollingLogic scrollingLogic3 = scrollingLogic;
                    if (fAbs != BitmapDescriptorFactory.HUE_RED && ((f > BitmapDescriptorFactory.HUE_RED && !scrollingLogic3.f900a.b()) || ((f < BitmapDescriptorFactory.HUE_RED && !scrollingLogic3.f900a.d()) || !((Boolean) ((ScrollableNode$scrollingLogic$1) scrollingLogic3.g).invoke()).booleanValue()))) {
                        throw new FlingCancellationException("The fling animation was cancelled");
                    }
                    return scrollingLogic3.d(scrollingLogic3.g(nestedScrollScope.a(2, scrollingLogic3.e(scrollingLogic3.h(f)))));
                }
            };
            FlingBehavior flingBehavior = scrollingLogic.c;
            longRef = this.v;
            long j2 = longRef.d;
            Orientation orientation = scrollingLogic.d;
            Orientation orientation2 = Orientation.e;
            long j3 = this.w;
            float fD = scrollingLogic.d(orientation == orientation2 ? Velocity.d(j3) : Velocity.e(j3));
            this.t = scrollingLogic;
            this.p = scrollingLogic;
            this.q = longRef;
            this.r = j2;
            this.s = 1;
            obj = flingBehavior.a(scrollScope, fD, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            j = j2;
            scrollingLogic2 = scrollingLogic;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.r;
            longRef = this.q;
            scrollingLogic = this.p;
            scrollingLogic2 = (ScrollingLogic) this.t;
            ResultKt.b(obj);
        }
        float fD2 = scrollingLogic2.d(((Number) obj).floatValue());
        longRef.d = scrollingLogic.d == Orientation.e ? Velocity.b(fD2, BitmapDescriptorFactory.HUE_RED, 2, j) : Velocity.b(BitmapDescriptorFactory.HUE_RED, fD2, 1, j);
        return Unit.f24250a;
    }
}
