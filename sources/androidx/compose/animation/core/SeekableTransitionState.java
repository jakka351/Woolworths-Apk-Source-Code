package androidx.compose.animation.core;

import androidx.collection.MutableObjectList;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.navigation.NavBackStackEntry;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/core/SeekableTransitionState;", "S", "Landroidx/compose/animation/core/TransitionState;", "Companion", "SeekingAnimationState", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SeekableTransitionState<S> extends TransitionState<S> {
    public static final AnimationVector1D r = new AnimationVector1D(BitmapDescriptorFactory.HUE_RED);
    public static final AnimationVector1D s = new AnimationVector1D(1.0f);
    public final MutableState b;
    public final MutableState c;
    public Object d;
    public Transition e;
    public long f;
    public CancellableContinuationImpl i;
    public SeekingAnimationState n;
    public float p;
    public final Function0 g = new Function0<Unit>() { // from class: androidx.compose.animation.core.SeekableTransitionState$recalculateTotalDurationNanos$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            SeekableTransitionState seekableTransitionState = this.h;
            Transition transition = seekableTransitionState.e;
            seekableTransitionState.f = transition != null ? transition.h() : 0L;
            return Unit.f24250a;
        }
    };
    public final MutableFloatState h = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
    public final MutexImpl j = MutexKt.a();
    public final MutatorMutex k = new MutatorMutex();
    public long l = Long.MIN_VALUE;
    public final MutableObjectList m = new MutableObjectList();
    public final Function1 o = new Function1<Long, Unit>() { // from class: androidx.compose.animation.core.SeekableTransitionState$firstFrameLambda$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            this.h.l = ((Number) obj).longValue();
            return Unit.f24250a;
        }
    };
    public final Function1 q = new Function1<Long, Unit>() { // from class: androidx.compose.animation.core.SeekableTransitionState$animateOneFrameLambda$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            long jLongValue = ((Number) obj).longValue();
            SeekableTransitionState seekableTransitionState = this.h;
            long j = jLongValue - seekableTransitionState.l;
            seekableTransitionState.l = jLongValue;
            long jC = MathKt.c(j / seekableTransitionState.p);
            MutableObjectList mutableObjectList = seekableTransitionState.m;
            if (mutableObjectList.e()) {
                Object[] objArr = mutableObjectList.f694a;
                int i = mutableObjectList.b;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    SeekableTransitionState.SeekingAnimationState seekingAnimationState = (SeekableTransitionState.SeekingAnimationState) objArr[i3];
                    SeekableTransitionState.g(seekableTransitionState, seekingAnimationState, jC);
                    seekingAnimationState.c = true;
                }
                Transition transition = seekableTransitionState.e;
                if (transition != null) {
                    transition.q();
                }
                int i4 = mutableObjectList.b;
                Object[] objArr2 = mutableObjectList.f694a;
                IntRange intRangeO = RangesKt.o(0, i4);
                int i5 = intRangeO.d;
                int i6 = intRangeO.e;
                if (i5 <= i6) {
                    while (true) {
                        objArr2[i5 - i2] = objArr2[i5];
                        if (((SeekableTransitionState.SeekingAnimationState) objArr2[i5]).c) {
                            i2++;
                        }
                        if (i5 == i6) {
                            break;
                        }
                        i5++;
                    }
                }
                ArraysKt.B(objArr2, i4 - i2, i4, null);
                mutableObjectList.b -= i2;
            }
            SeekableTransitionState.SeekingAnimationState seekingAnimationState2 = seekableTransitionState.n;
            if (seekingAnimationState2 != null) {
                seekingAnimationState2.g = seekableTransitionState.f;
                SeekableTransitionState.g(seekableTransitionState, seekingAnimationState2, jC);
                seekableTransitionState.p(seekingAnimationState2.d);
                if (seekingAnimationState2.d == 1.0f) {
                    seekableTransitionState.n = null;
                }
                seekableTransitionState.o();
            }
            return Unit.f24250a;
        }
    };

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/core/SeekableTransitionState$Companion;", "", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SeekingAnimationState {

        /* renamed from: a, reason: collision with root package name */
        public long f769a;
        public VectorizedFiniteAnimationSpec b;
        public boolean c;
        public float d;
        public final AnimationVector1D e = new AnimationVector1D(BitmapDescriptorFactory.HUE_RED);
        public AnimationVector1D f;
        public long g;
        public long h;

        public final String toString() {
            return "progress nanos: " + this.f769a + ", animationSpec: " + this.b + ", isComplete: " + this.c + ", value: " + this.d + ", start: " + this.e + ", initialVelocity: " + this.f + ", durationNanos: " + this.g + ", animationSpecDuration: " + this.h;
        }
    }

    public SeekableTransitionState(NavBackStackEntry navBackStackEntry) {
        this.b = SnapshotStateKt.f(navBackStackEntry);
        this.c = SnapshotStateKt.f(navBackStackEntry);
        this.d = navBackStackEntry;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(androidx.compose.animation.core.SeekableTransitionState r10) {
        /*
            androidx.compose.runtime.MutableFloatState r0 = r10.h
            androidx.compose.animation.core.Transition r1 = r10.e
            if (r1 != 0) goto L7
            return
        L7:
            androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState r2 = r10.n
            r3 = 0
            if (r2 != 0) goto L63
            long r4 = r10.f
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L62
            androidx.compose.runtime.SnapshotMutableFloatStateImpl r0 = (androidx.compose.runtime.SnapshotMutableFloatStateImpl) r0
            float r2 = r0.a()
            r4 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L21
            goto L62
        L21:
            androidx.compose.runtime.MutableState r2 = r10.c
            androidx.compose.runtime.SnapshotMutableStateImpl r2 = (androidx.compose.runtime.SnapshotMutableStateImpl) r2
            java.lang.Object r2 = r2.getD()
            androidx.compose.runtime.MutableState r4 = r10.b
            androidx.compose.runtime.SnapshotMutableStateImpl r4 = (androidx.compose.runtime.SnapshotMutableStateImpl) r4
            java.lang.Object r4 = r4.getD()
            boolean r2 = kotlin.jvm.internal.Intrinsics.c(r2, r4)
            if (r2 == 0) goto L38
            goto L62
        L38:
            androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState r2 = new androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState
            r2.<init>()
            float r4 = r0.a()
            r2.d = r4
            long r4 = r10.f
            r2.g = r4
            double r4 = (double) r4
            float r6 = r0.a()
            double r6 = (double) r6
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r8 = r8 - r6
            double r8 = r8 * r4
            long r4 = kotlin.math.MathKt.c(r8)
            r2.h = r4
            r4 = 0
            float r0 = r0.a()
            androidx.compose.animation.core.AnimationVector1D r5 = r2.e
            r5.e(r0, r4)
            goto L63
        L62:
            r2 = r3
        L63:
            if (r2 == 0) goto L71
            long r4 = r10.f
            r2.g = r4
            androidx.collection.MutableObjectList r0 = r10.m
            r0.g(r2)
            r1.o(r2)
        L71:
            r10.n = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.f(androidx.compose.animation.core.SeekableTransitionState):void");
    }

    public static final void g(SeekableTransitionState seekableTransitionState, SeekingAnimationState seekingAnimationState, long j) {
        long j2 = seekingAnimationState.f769a;
        AnimationVector1D animationVector1D = seekingAnimationState.e;
        long j3 = j2 + j;
        seekingAnimationState.f769a = j3;
        long j4 = seekingAnimationState.h;
        if (j3 >= j4) {
            seekingAnimationState.d = 1.0f;
            return;
        }
        VectorizedFiniteAnimationSpec vectorizedFiniteAnimationSpec = seekingAnimationState.b;
        if (vectorizedFiniteAnimationSpec == null) {
            float f = j3 / j4;
            seekingAnimationState.d = (f * 1.0f) + ((1 - f) * animationVector1D.a(0));
            return;
        }
        AnimationVector1D animationVector1D2 = seekingAnimationState.f;
        if (animationVector1D2 == null) {
            animationVector1D2 = r;
        }
        seekingAnimationState.d = RangesKt.b(((AnimationVector1D) vectorizedFiniteAnimationSpec.f(j3, animationVector1D, s, animationVector1D2)).a(0), BitmapDescriptorFactory.HUE_RED, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(androidx.compose.animation.core.SeekableTransitionState r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r10.getClass()
            boolean r0 = r11 instanceof androidx.compose.animation.core.SeekableTransitionState$runAnimations$1
            if (r0 == 0) goto L16
            r0 = r11
            androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 r0 = (androidx.compose.animation.core.SeekableTransitionState$runAnimations$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.s = r1
            goto L1b
        L16:
            androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$runAnimations$1
            r0.<init>(r10, r11)
        L1b:
            java.lang.Object r11 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 2
            r4 = 1
            r5 = -9223372036854775808
            kotlin.Unit r7 = kotlin.Unit.f24250a
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            goto L36
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            androidx.compose.animation.core.SeekableTransitionState r10 = r0.p
            kotlin.ResultKt.b(r11)
            goto L7a
        L3c:
            kotlin.ResultKt.b(r11)
            androidx.collection.MutableObjectList r11 = r10.m
            boolean r11 = r11.d()
            if (r11 == 0) goto L4c
            androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState r11 = r10.n
            if (r11 != 0) goto L4c
            return r7
        L4c:
            kotlin.coroutines.CoroutineContext r11 = r0.getE()
            float r11 = androidx.compose.animation.core.SuspendAnimationKt.i(r11)
            r2 = 0
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 != 0) goto L5f
            r10.m()
            r10.l = r5
            return r7
        L5f:
            long r8 = r10.l
            int r11 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r11 != 0) goto L7a
            kotlin.jvm.functions.Function1 r11 = r10.o
            r0.p = r10
            r0.s = r4
            kotlin.coroutines.CoroutineContext r2 = r0.getE()
            androidx.compose.runtime.MonotonicFrameClock r2 = androidx.compose.runtime.MonotonicFrameClockKt.a(r2)
            java.lang.Object r11 = r2.e(r11, r0)
            if (r11 != r1) goto L7a
            goto L94
        L7a:
            androidx.collection.MutableObjectList r11 = r10.m
            boolean r11 = r11.e()
            if (r11 != 0) goto L8a
            androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState r11 = r10.n
            if (r11 == 0) goto L87
            goto L8a
        L87:
            r10.l = r5
            return r7
        L8a:
            r0.p = r10
            r0.s = r3
            java.lang.Object r11 = r10.k(r0)
            if (r11 != r1) goto L7a
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.h(androidx.compose.animation.core.SeekableTransitionState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(androidx.compose.animation.core.SeekableTransitionState r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1
            if (r0 == 0) goto L16
            r0 = r7
            androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 r0 = (androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.t = r1
            goto L1b
        L16:
            androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.q
            androidx.compose.animation.core.SeekableTransitionState r0 = r0.p
            kotlin.ResultKt.b(r7)
            goto L82
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            java.lang.Object r6 = r0.q
            androidx.compose.animation.core.SeekableTransitionState r2 = r0.p
            kotlin.ResultKt.b(r7)
            r7 = r6
            r6 = r2
            goto L5d
        L43:
            kotlin.ResultKt.b(r7)
            androidx.compose.runtime.MutableState r7 = r6.b
            androidx.compose.runtime.SnapshotMutableStateImpl r7 = (androidx.compose.runtime.SnapshotMutableStateImpl) r7
            java.lang.Object r7 = r7.getD()
            kotlinx.coroutines.sync.MutexImpl r2 = r6.j
            r0.p = r6
            r0.q = r7
            r0.t = r4
            java.lang.Object r2 = r2.a(r0)
            if (r2 != r1) goto L5d
            goto L7d
        L5d:
            r0.p = r6
            r0.q = r7
            r0.t = r3
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r0)
            r2.<init>(r4, r0)
            r2.o()
            r6.i = r2
            kotlinx.coroutines.sync.MutexImpl r0 = r6.j
            r3 = 0
            r0.c(r3)
            java.lang.Object r0 = r2.n()
            if (r0 != r1) goto L7e
        L7d:
            return r1
        L7e:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L82:
            boolean r6 = kotlin.jvm.internal.Intrinsics.c(r7, r6)
            if (r6 == 0) goto L8b
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        L8b:
            r6 = -9223372036854775808
            r0.l = r6
            java.util.concurrent.CancellationException r6 = new java.util.concurrent.CancellationException
            java.lang.String r7 = "targetState while waiting for composition"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.i(androidx.compose.animation.core.SeekableTransitionState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(androidx.compose.animation.core.SeekableTransitionState r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1
            if (r0 == 0) goto L16
            r0 = r8
            androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 r0 = (androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.t = r1
            goto L1b
        L16:
            androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.q
            androidx.compose.animation.core.SeekableTransitionState r0 = r0.p
            kotlin.ResultKt.b(r8)
            goto L8b
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.Object r7 = r0.q
            androidx.compose.animation.core.SeekableTransitionState r2 = r0.p
            kotlin.ResultKt.b(r8)
            goto L5d
        L41:
            kotlin.ResultKt.b(r8)
            androidx.compose.runtime.MutableState r8 = r7.b
            androidx.compose.runtime.SnapshotMutableStateImpl r8 = (androidx.compose.runtime.SnapshotMutableStateImpl) r8
            java.lang.Object r8 = r8.getD()
            kotlinx.coroutines.sync.MutexImpl r2 = r7.j
            r0.p = r7
            r0.q = r8
            r0.t = r4
            java.lang.Object r2 = r2.a(r0)
            if (r2 != r1) goto L5b
            goto L89
        L5b:
            r2 = r7
            r7 = r8
        L5d:
            java.lang.Object r8 = r2.d
            kotlinx.coroutines.sync.MutexImpl r5 = r2.j
            boolean r8 = kotlin.jvm.internal.Intrinsics.c(r7, r8)
            r6 = 0
            if (r8 == 0) goto L6c
            r5.c(r6)
            goto L91
        L6c:
            r0.p = r2
            r0.q = r7
            r0.t = r3
            kotlinx.coroutines.CancellableContinuationImpl r8 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r0)
            r8.<init>(r4, r0)
            r8.o()
            r2.i = r8
            r5.c(r6)
            java.lang.Object r8 = r8.n()
            if (r8 != r1) goto L8a
        L89:
            return r1
        L8a:
            r0 = r2
        L8b:
            boolean r1 = kotlin.jvm.internal.Intrinsics.c(r8, r7)
            if (r1 == 0) goto L94
        L91:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        L94:
            r1 = -9223372036854775808
            r0.l = r1
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "snapTo() was canceled because state was changed to "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = " instead of "
            r1.append(r8)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.j(androidx.compose.animation.core.SeekableTransitionState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static Object l(SeekableTransitionState seekableTransitionState, Object obj, Continuation continuation) {
        Object objA;
        Transition transition = seekableTransitionState.e;
        return (transition != null && (objA = MutatorMutex.a(seekableTransitionState.k, new SeekableTransitionState$animateTo$2(seekableTransitionState, transition, obj, null), continuation)) == CoroutineSingletons.d) ? objA : Unit.f24250a;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final Object a() {
        return ((SnapshotMutableStateImpl) this.c).getD();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final Object b() {
        return ((SnapshotMutableStateImpl) this.b).getD();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final void c(Object obj) {
        ((SnapshotMutableStateImpl) this.c).setValue(obj);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final void d(Transition transition) {
        Transition transition2 = this.e;
        if (transition2 != null && !transition.equals(transition2)) {
            PreconditionsKt.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.e + ", new instance: " + transition);
        }
        this.e = transition;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.compose.animation.core.TransitionState
    public final void e() {
        this.e = null;
        ((SnapshotStateObserver) TransitionKt.b.getD()).c(this);
    }

    public final Object k(ContinuationImpl continuationImpl) {
        float fI = SuspendAnimationKt.i(continuationImpl.getE());
        Unit unit = Unit.f24250a;
        if (fI <= BitmapDescriptorFactory.HUE_RED) {
            m();
            return unit;
        }
        this.p = fI;
        Object objE = MonotonicFrameClockKt.a(continuationImpl.getE()).e(this.q, continuationImpl);
        return objE == CoroutineSingletons.d ? objE : unit;
    }

    public final void m() {
        Transition transition = this.e;
        if (transition != null) {
            transition.c();
        }
        this.m.j();
        if (this.n != null) {
            this.n = null;
            p(1.0f);
            o();
        }
    }

    public final Object n(float f, Object obj, SuspendLambda suspendLambda) {
        if (BitmapDescriptorFactory.HUE_RED > f || f > 1.0f) {
            PreconditionsKt.a("Expecting fraction between 0 and 1. Got " + f);
        }
        Transition transition = this.e;
        if (transition != null) {
            Object objA = MutatorMutex.a(this.k, new SeekableTransitionState$seekTo$3(obj, ((SnapshotMutableStateImpl) this.b).getD(), this, transition, f, null), suspendLambda);
            if (objA == CoroutineSingletons.d) {
                return objA;
            }
        }
        return Unit.f24250a;
    }

    public final void o() {
        Transition transition = this.e;
        if (transition == null) {
            return;
        }
        transition.n(MathKt.c(((SnapshotMutableFloatStateImpl) this.h).a() * transition.h()));
    }

    public final void p(float f) {
        ((SnapshotMutableFloatStateImpl) this.h).p(f);
    }

    public final Object q(Object obj, Continuation continuation) {
        Transition transition = this.e;
        if (transition != null && (!Intrinsics.c(((SnapshotMutableStateImpl) this.c).getD(), obj) || !Intrinsics.c(((SnapshotMutableStateImpl) this.b).getD(), obj))) {
            Object objA = MutatorMutex.a(this.k, new SeekableTransitionState$snapTo$2(this, transition, obj, null), continuation);
            if (objA == CoroutineSingletons.d) {
                return objA;
            }
        }
        return Unit.f24250a;
    }
}
