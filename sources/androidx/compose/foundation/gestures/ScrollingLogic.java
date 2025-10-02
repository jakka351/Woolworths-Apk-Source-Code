package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.unit.Velocity;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ScrollingLogic {

    /* renamed from: a, reason: collision with root package name */
    public ScrollableState f900a;
    public OverscrollEffect b;
    public FlingBehavior c;
    public Orientation d;
    public boolean e;
    public NestedScrollDispatcher f;
    public final Function0 g;
    public boolean h;
    public int i = 1;
    public ScrollScope j = ScrollableKt.b;
    public final ScrollingLogic$nestedScrollScope$1 k = new NestedScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1
        @Override // androidx.compose.foundation.gestures.NestedScrollScope
        public final long a(int i, long j) {
            ScrollingLogic scrollingLogic = this.f902a;
            scrollingLogic.i = i;
            OverscrollEffect overscrollEffect = scrollingLogic.b;
            return (overscrollEffect == null || !(scrollingLogic.f900a.b() || scrollingLogic.f900a.d())) ? ScrollingLogic.a(scrollingLogic, scrollingLogic.j, j, i) : overscrollEffect.k(j, scrollingLogic.i, scrollingLogic.l);
        }

        @Override // androidx.compose.foundation.gestures.NestedScrollScope
        public final long b(long j) {
            ScrollingLogic scrollingLogic = this.f902a;
            return ScrollingLogic.a(scrollingLogic, scrollingLogic.j, j, 1);
        }
    };
    public final Function1 l = new Function1<Offset, Offset>() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$performScrollForOverscroll$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            long j = ((Offset) obj).f1751a;
            ScrollingLogic scrollingLogic = this.h;
            return new Offset(ScrollingLogic.a(scrollingLogic, scrollingLogic.j, j, scrollingLogic.i));
        }
    };

    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1] */
    public ScrollingLogic(ScrollableState scrollableState, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, Orientation orientation, boolean z, NestedScrollDispatcher nestedScrollDispatcher, Function0 function0) {
        this.f900a = scrollableState;
        this.b = overscrollEffect;
        this.c = flingBehavior;
        this.d = orientation;
        this.e = z;
        this.f = nestedScrollDispatcher;
        this.g = function0;
    }

    public static final long a(ScrollingLogic scrollingLogic, ScrollScope scrollScope, long j, int i) {
        NestedScrollNode nestedScrollNode = scrollingLogic.f.f1845a;
        NestedScrollNode nestedScrollNode2 = null;
        NestedScrollNode nestedScrollNode3 = (nestedScrollNode == null || !nestedScrollNode.q) ? null : (NestedScrollNode) TraversableNodeKt.a(nestedScrollNode);
        long jB0 = nestedScrollNode3 != null ? nestedScrollNode3.b0(i, j) : 0L;
        long jG = Offset.g(j, jB0);
        long jE = scrollingLogic.e(scrollingLogic.h(scrollScope.f(scrollingLogic.g(scrollingLogic.e(Offset.a(jG, BitmapDescriptorFactory.HUE_RED, scrollingLogic.d == Orientation.e ? 1 : 2))))));
        long jG2 = Offset.g(jG, jE);
        NestedScrollNode nestedScrollNode4 = scrollingLogic.f.f1845a;
        if (nestedScrollNode4 != null && nestedScrollNode4.q) {
            nestedScrollNode2 = (NestedScrollNode) TraversableNodeKt.a(nestedScrollNode4);
        }
        NestedScrollNode nestedScrollNode5 = nestedScrollNode2;
        return Offset.h(Offset.h(jB0, jE), nestedScrollNode5 != null ? nestedScrollNode5.n0(i, jE, jG2) : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r11, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.jvm.internal.Ref$LongRef r11 = r0.q
            androidx.compose.foundation.gestures.ScrollingLogic r12 = r0.p
            kotlin.ResultKt.b(r13)
            r5 = r10
            goto L59
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            kotlin.ResultKt.b(r13)
            kotlin.jvm.internal.Ref$LongRef r6 = new kotlin.jvm.internal.Ref$LongRef
            r6.<init>()
            r6.d = r11
            r10.h = r3
            androidx.compose.foundation.MutatePriority r13 = androidx.compose.foundation.MutatePriority.d
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r4 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r9)
            r0.p = r5
            r0.q = r6
            r0.t = r3
            java.lang.Object r11 = r10.f(r13, r4, r0)
            if (r11 != r1) goto L57
            return r1
        L57:
            r12 = r5
            r11 = r6
        L59:
            r13 = 0
            r12.h = r13
            long r11 = r11.d
            androidx.compose.ui.unit.Velocity r11 = androidx.compose.ui.unit.Velocity.a(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.b(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object c(long j, boolean z, SuspendLambda suspendLambda) {
        Unit unit = Unit.f24250a;
        if (z) {
            Function1 function1 = ScrollableKt.f898a;
            return unit;
        }
        long jB = Velocity.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.d == Orientation.e ? 1 : 2, j);
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this, null);
        OverscrollEffect overscrollEffect = this.b;
        if (overscrollEffect == null || !(this.f900a.b() || this.f900a.d())) {
            Object objInvoke = scrollingLogic$onScrollStopped$performFling$1.invoke(Velocity.a(jB), suspendLambda);
            if (objInvoke == CoroutineSingletons.d) {
                return objInvoke;
            }
        } else {
            Object objL = overscrollEffect.l(jB, scrollingLogic$onScrollStopped$performFling$1, suspendLambda);
            if (objL == CoroutineSingletons.d) {
                return objL;
            }
        }
        return unit;
    }

    public final float d(float f) {
        return this.e ? f * (-1) : f;
    }

    public final long e(long j) {
        return this.e ? Offset.i(j, -1.0f) : j;
    }

    public final Object f(MutatePriority mutatePriority, Function2 function2, ContinuationImpl continuationImpl) {
        Object objE = this.f900a.e(mutatePriority, new ScrollingLogic$scroll$2(this, null, function2), continuationImpl);
        return objE == CoroutineSingletons.d ? objE : Unit.f24250a;
    }

    public final float g(long j) {
        return Float.intBitsToFloat((int) (this.d == Orientation.e ? j >> 32 : j & 4294967295L));
    }

    public final long h(float f) {
        long jFloatToRawIntBits;
        long j;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return 0L;
        }
        if (this.d == Orientation.e) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f);
            jFloatToRawIntBits = Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED);
            jFloatToRawIntBits = Float.floatToRawIntBits(f);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (jFloatToRawIntBits & 4294967295L);
    }
}
