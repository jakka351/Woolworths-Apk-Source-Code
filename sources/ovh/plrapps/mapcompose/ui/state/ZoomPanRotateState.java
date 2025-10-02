package ovh.plrapps.mapcompose.ui.state;

import YU.a;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FloatExponentialDecaySpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableDoubleState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotDoubleStateKt;
import androidx.compose.runtime.SnapshotMutableDoubleStateImpl;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.Velocity;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import ovh.plrapps.mapcompose.core.GestureConfiguration;
import ovh.plrapps.mapcompose.ui.gestures.model.HitType;
import ovh.plrapps.mapcompose.ui.layout.Fill;
import ovh.plrapps.mapcompose.ui.layout.Fit;
import ovh.plrapps.mapcompose.ui.layout.GestureListener;
import ovh.plrapps.mapcompose.ui.layout.LayoutSizeChangeListener;
import ovh.plrapps.mapcompose.ui.state.markers.CalloutData;
import ovh.plrapps.mapcompose.ui.state.markers.MarkerState;
import ovh.plrapps.mapcompose.utils.RotationUtilsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lovh/plrapps/mapcompose/ui/state/ZoomPanRotateState;", "Lovh/plrapps/mapcompose/ui/layout/GestureListener;", "Lovh/plrapps/mapcompose/ui/layout/LayoutSizeChangeListener;", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ZoomPanRotateState implements GestureListener, LayoutSizeChangeListener {
    public final Animatable A;
    public final Animatable B;
    public final TweenSpec C;
    public final DecayAnimationSpec D;

    /* renamed from: a, reason: collision with root package name */
    public final int f26960a;
    public final int b;
    public final MapState c;
    public CoroutineScope d;
    public final ArrayList e = new ArrayList();
    public final Fit f = Fit.f26943a;
    public final State g = SnapshotStateKt.d(new Function0<Boolean>() { // from class: ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$areGesturesEnabled$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ZoomPanRotateState zoomPanRotateState = this.h;
            return Boolean.valueOf(((Boolean) ((SnapshotMutableStateImpl) zoomPanRotateState.h).getD()).booleanValue() || ((Boolean) ((SnapshotMutableStateImpl) zoomPanRotateState.i).getD()).booleanValue() || zoomPanRotateState.v());
        }
    });
    public final MutableState h;
    public final MutableState i;
    public final MutableState j;
    public final MutableState k;
    public final MutableDoubleState l;
    public final MutableFloatState m;
    public final MutableDoubleState n;
    public final MutableDoubleState o;
    public final MutableDoubleState p;
    public final MutableDoubleState q;
    public final MutableDoubleState r;
    public final MutableDoubleState s;
    public final MutableState t;
    public final VisibleAreaPadding u;
    public final MutableDoubleState v;
    public final double w;
    public final MutableState x;
    public long y;
    public final Animatable z;

    public ZoomPanRotateState(int i, int i2, MapState mapState, GestureConfiguration gestureConfiguration) {
        this.f26960a = i;
        this.b = i2;
        this.c = mapState;
        Boolean bool = Boolean.FALSE;
        this.h = SnapshotStateKt.f(bool);
        Boolean bool2 = Boolean.TRUE;
        this.i = SnapshotStateKt.f(bool2);
        this.j = SnapshotStateKt.f(bool2);
        this.k = SnapshotStateKt.f(bool2);
        this.l = SnapshotDoubleStateKt.a(1.0d);
        this.m = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
        this.n = SnapshotDoubleStateKt.a(0.0d);
        this.o = SnapshotDoubleStateKt.a(0.0d);
        this.p = SnapshotDoubleStateKt.a(0.0d);
        this.q = SnapshotDoubleStateKt.a(0.0d);
        this.r = SnapshotDoubleStateKt.a(0.0d);
        this.s = SnapshotDoubleStateKt.a(0.0d);
        this.t = SnapshotStateKt.f(new IntSize(0L));
        this.u = new VisibleAreaPadding(0, 0, 0, 0);
        this.v = SnapshotDoubleStateKt.a(0.0d);
        this.w = 2.0d;
        this.x = SnapshotStateKt.f(bool);
        this.y = OffsetKt.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.z = AnimatableKt.a(BitmapDescriptorFactory.HUE_RED);
        this.A = new Animatable(new Offset(0L), VectorConvertersKt.f, (Object) null, 12);
        this.B = AnimatableKt.a(BitmapDescriptorFactory.HUE_RED);
        this.C = new TweenSpec(nlnlnnn.xxx00780078x0078, EasingKt.b, 2);
        this.D = DecayAnimationSpecKt.c(new FloatExponentialDecaySpec(1.5f));
    }

    public static void A(ZoomPanRotateState zoomPanRotateState, float f) {
        zoomPanRotateState.getClass();
        float f2 = f % 360.0f;
        if (f2 < BitmapDescriptorFactory.HUE_RED) {
            f2 += 360.0f;
        }
        ((SnapshotMutableFloatStateImpl) zoomPanRotateState.m).p(f2);
        zoomPanRotateState.I();
        zoomPanRotateState.w();
    }

    public static void B(ZoomPanRotateState zoomPanRotateState, double d) {
        ((SnapshotMutableDoubleStateImpl) zoomPanRotateState.l).s(zoomPanRotateState.s(d));
        zoomPanRotateState.I();
        zoomPanRotateState.w();
    }

    public static final Object p(ZoomPanRotateState zoomPanRotateState, double d, double d2, Function2 function2) {
        double d3 = zoomPanRotateState.f26960a;
        SnapshotMutableDoubleStateImpl snapshotMutableDoubleStateImpl = (SnapshotMutableDoubleStateImpl) zoomPanRotateState.l;
        double dF = snapshotMutableDoubleStateImpl.f() * d * d3;
        double d4 = zoomPanRotateState.b;
        double dF2 = snapshotMutableDoubleStateImpl.f() * d2 * d4;
        double dF3 = snapshotMutableDoubleStateImpl.f() * ((SnapshotMutableDoubleStateImpl) zoomPanRotateState.r).f() * d3;
        double dF4 = snapshotMutableDoubleStateImpl.f() * ((SnapshotMutableDoubleStateImpl) zoomPanRotateState.s).f() * d4;
        float fA = ((SnapshotMutableFloatStateImpl) zoomPanRotateState.m).a() * 0.017453292f;
        return function2.invoke(Integer.valueOf((int) RotationUtilsKt.a(dF, dF2, dF3, dF4, fA)), Integer.valueOf((int) RotationUtilsKt.b(dF, dF2, dF3, dF4, fA)));
    }

    public static final Object q(ZoomPanRotateState zoomPanRotateState, float f, float f2, double d, AnimationSpec animationSpec, SuspendLambda suspendLambda) {
        double dS = zoomPanRotateState.s(d);
        double dF = ((SnapshotMutableDoubleStateImpl) zoomPanRotateState.l).f();
        if (dF == d) {
            return Boolean.TRUE;
        }
        double d2 = dS / dF;
        double d3 = f;
        double dF2 = ((((SnapshotMutableDoubleStateImpl) zoomPanRotateState.n).f() + d3) * d2) - d3;
        double d4 = f2;
        return zoomPanRotateState.E(dF2, ((((SnapshotMutableDoubleStateImpl) zoomPanRotateState.o).f() + d4) * d2) - d4, d, animationSpec, suspendLambda);
    }

    public static float y(float f, float f2, float f3) {
        double d = f3;
        double d2 = 2;
        return (f * f2) / ((float) Math.sqrt(((float) Math.pow(f * ((float) Math.sin(d)), d2)) + ((float) Math.pow(f2 * ((float) Math.cos(d)), d2))));
    }

    public final void C(double d, double d2) {
        float f;
        double dA;
        double dA2;
        SnapshotMutableFloatStateImpl snapshotMutableFloatStateImpl = (SnapshotMutableFloatStateImpl) this.m;
        float fY = y((int) (t() >> 32), (int) (t() & 4294967295L), snapshotMutableFloatStateImpl.a() * 0.017453292f);
        float f2 = 2;
        float fT = (fY - ((int) (t() >> 32))) / f2;
        double d3 = this.f26960a;
        SnapshotMutableDoubleStateImpl snapshotMutableDoubleStateImpl = (SnapshotMutableDoubleStateImpl) this.l;
        double d4 = fY;
        if (snapshotMutableDoubleStateImpl.f() * d3 < d4) {
            double dF = snapshotMutableDoubleStateImpl.f() * Offset.e(this.y) * r7;
            double dF2 = ((snapshotMutableDoubleStateImpl.f() * d3) - d4) - dF;
            double d5 = fT;
            dA = RangesKt.a(d, dF2 + d5, dF + d5);
            f = 0.017453292f;
        } else {
            float fE = Offset.e(this.y) * fY;
            f = 0.017453292f;
            dA = RangesKt.a(d, (-fE) + fT, ((snapshotMutableDoubleStateImpl.f() * d3) + (fE + fT)) - d4);
        }
        ((SnapshotMutableDoubleStateImpl) this.n).s(dA);
        float fY2 = y((int) (t() & 4294967295L), (int) (t() >> 32), snapshotMutableFloatStateImpl.a() * f);
        float fT2 = (fY2 - ((int) (t() & 4294967295L))) / f2;
        double d6 = this.b;
        double d7 = fY2;
        if (snapshotMutableDoubleStateImpl.f() * d6 < d7) {
            double dF3 = snapshotMutableDoubleStateImpl.f() * Offset.f(this.y) * r3;
            double d8 = fT2;
            dA2 = RangesKt.a(d2, (((snapshotMutableDoubleStateImpl.f() * d6) - d7) - dF3) + d8, dF3 + d8);
        } else {
            float f3 = Offset.f(this.y) * fY2;
            dA2 = RangesKt.a(d2, (-f3) + fT2, ((snapshotMutableDoubleStateImpl.f() * d6) + (f3 + fT2)) - d7);
        }
        ((SnapshotMutableDoubleStateImpl) this.o).s(dA2);
        I();
        w();
    }

    public final Object D(float f, TweenSpec tweenSpec, Continuation continuation) {
        return u(new ZoomPanRotateState$smoothRotateTo$2(this, f, tweenSpec, null), (ContinuationImpl) continuation);
    }

    public final Object E(double d, double d2, double d3, AnimationSpec animationSpec, SuspendLambda suspendLambda) {
        return u(new ZoomPanRotateState$smoothScrollScaleRotate$2(this, animationSpec, ((SnapshotMutableDoubleStateImpl) this.l).f(), d3, ((SnapshotMutableDoubleStateImpl) this.n).f(), d, ((SnapshotMutableDoubleStateImpl) this.o).f(), d2, null), suspendLambda);
    }

    public final Object F(double d, double d2, AnimationSpec animationSpec, Continuation continuation) {
        double dF = ((SnapshotMutableDoubleStateImpl) this.n).f();
        double dF2 = ((SnapshotMutableDoubleStateImpl) this.o).f();
        double dF3 = ((SnapshotMutableDoubleStateImpl) this.l).f();
        float fA = ((SnapshotMutableFloatStateImpl) this.m).a();
        Ref.FloatRef floatRef = new Ref.FloatRef();
        float f = BitmapDescriptorFactory.HUE_RED % 360;
        floatRef.d = f;
        if (Math.abs(f - fA) > 180.0f) {
            float f2 = floatRef.d;
            floatRef.d = f2 + (f2 > fA ? -360 : 360);
        }
        return u(new ZoomPanRotateState$smoothScrollScaleRotate$4(this, animationSpec, dF3, dF, d, dF2, d2, fA, floatRef, null), (ContinuationImpl) continuation);
    }

    public final Object G(double d, double d2, AnimationSpec animationSpec, Continuation continuation) {
        return u(new ZoomPanRotateState$smoothScrollTo$2(this, animationSpec, ((SnapshotMutableDoubleStateImpl) this.n).f(), d, ((SnapshotMutableDoubleStateImpl) this.o).f(), d2, null), (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r7.i(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object H(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$stopAnimations$1
            if (r0 == 0) goto L13
            r0 = r7
            ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$stopAnimations$1 r0 = (ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$stopAnimations$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$stopAnimations$1 r0 = new ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$stopAnimations$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r7)
            goto L6d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState r2 = r0.p
            kotlin.ResultKt.b(r7)
            goto L5f
        L3b:
            ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState r2 = r0.p
            kotlin.ResultKt.b(r7)
            goto L52
        L41:
            kotlin.ResultKt.b(r7)
            r0.p = r6
            r0.s = r5
            androidx.compose.animation.core.Animatable r7 = r6.B
            java.lang.Object r7 = r7.i(r0)
            if (r7 != r1) goto L51
            goto L6c
        L51:
            r2 = r6
        L52:
            androidx.compose.animation.core.Animatable r7 = r2.A
            r0.p = r2
            r0.s = r4
            java.lang.Object r7 = r7.i(r0)
            if (r7 != r1) goto L5f
            goto L6c
        L5f:
            androidx.compose.animation.core.Animatable r7 = r2.z
            r2 = 0
            r0.p = r2
            r0.s = r3
            java.lang.Object r7 = r7.i(r0)
            if (r7 != r1) goto L6d
        L6c:
            return r1
        L6d:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState.H(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void I() {
        double d = 2;
        MutableDoubleState mutableDoubleState = this.p;
        ((SnapshotMutableDoubleStateImpl) mutableDoubleState).s(((int) (t() >> 32)) / d);
        double dT = ((int) (t() & 4294967295L)) / d;
        MutableDoubleState mutableDoubleState2 = this.q;
        ((SnapshotMutableDoubleStateImpl) mutableDoubleState2).s(dT);
        double dF = ((SnapshotMutableDoubleStateImpl) mutableDoubleState).f() + ((SnapshotMutableDoubleStateImpl) this.n).f();
        double d2 = this.f26960a;
        MutableDoubleState mutableDoubleState3 = this.l;
        ((SnapshotMutableDoubleStateImpl) this.r).s(dF / (((SnapshotMutableDoubleStateImpl) mutableDoubleState3).f() * d2));
        ((SnapshotMutableDoubleStateImpl) this.s).s((((SnapshotMutableDoubleStateImpl) mutableDoubleState2).f() + ((SnapshotMutableDoubleStateImpl) this.o).f()) / (((SnapshotMutableDoubleStateImpl) mutableDoubleState3).f() * this.b));
    }

    @Override // ovh.plrapps.mapcompose.ui.layout.GestureListener
    public final void a(float f) {
        if (((Boolean) ((SnapshotMutableStateImpl) this.h).getD()).booleanValue()) {
            A(this, ((SnapshotMutableFloatStateImpl) this.m).a() + f);
        }
    }

    @Override // ovh.plrapps.mapcompose.ui.layout.LayoutSizeChangeListener
    public final void b(CoroutineScope coroutineScope, long j) {
        Double dValueOf;
        Double dValueOf2;
        double dMax;
        this.d = coroutineScope;
        if (IntSize.b(t(), 0L)) {
            dValueOf = null;
            dValueOf2 = null;
        } else {
            dValueOf = Double.valueOf(((SnapshotMutableDoubleStateImpl) this.n).f() + ((((int) (t() >> 32)) - ((int) (j >> 32))) / 2));
            dValueOf2 = Double.valueOf(((SnapshotMutableDoubleStateImpl) this.o).f() + ((((int) (t() & 4294967295L)) - ((int) (j & 4294967295L))) / 2));
        }
        ((SnapshotMutableStateImpl) this.t).setValue(new IntSize(j));
        double dT = ((int) (t() >> 32)) / this.f26960a;
        double dT2 = ((int) (4294967295L & t())) / this.b;
        Fit fit = Fit.f26943a;
        Fit fit2 = this.f;
        if (Intrinsics.c(fit2, fit)) {
            dMax = Math.min(dT, dT2);
        } else {
            if (!Intrinsics.c(fit2, Fill.f26942a)) {
                throw new NoWhenBranchMatchedException();
            }
            dMax = Math.max(dT, dT2);
        }
        ((SnapshotMutableDoubleStateImpl) this.v).s(dMax);
        B(this, ((SnapshotMutableDoubleStateImpl) this.l).f());
        if (dValueOf != null && dValueOf2 != null) {
            C(dValueOf.doubleValue(), dValueOf2.doubleValue());
        }
        ArrayList arrayList = this.e;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Continuation) it.next()).resumeWith(Unit.f24250a);
        }
        arrayList.clear();
    }

    @Override // ovh.plrapps.mapcompose.ui.layout.GestureListener
    public final void c(long j) {
        float fE;
        float f;
        if (((Boolean) ((SnapshotMutableStateImpl) this.i).getD()).booleanValue()) {
            double dF = ((SnapshotMutableDoubleStateImpl) this.n).f();
            double dF2 = ((SnapshotMutableDoubleStateImpl) this.o).f();
            float f2 = -(((SnapshotMutableFloatStateImpl) this.m).a() * 0.017453292f);
            if (f2 == BitmapDescriptorFactory.HUE_RED) {
                fE = Offset.e(j);
            } else {
                double d = f2;
                fE = (Offset.e(j) * ((float) Math.cos(d))) - (Offset.f(j) * ((float) Math.sin(d)));
            }
            double d2 = dF - fE;
            if (f2 == BitmapDescriptorFactory.HUE_RED) {
                f = Offset.f(j);
            } else {
                double d3 = f2;
                f = (Offset.f(j) * ((float) Math.cos(d3))) + (Offset.e(j) * ((float) Math.sin(d3)));
            }
            C(d2, dF2 - f);
        }
    }

    @Override // ovh.plrapps.mapcompose.ui.layout.GestureListener
    public final void d() {
        SnapshotStateMap snapshotStateMap = this.c.c.f;
        if (snapshotStateMap.isEmpty()) {
            return;
        }
        Iterator it = snapshotStateMap.getE().iterator();
        while (it.hasNext()) {
            ((CalloutData) ((Map.Entry) it.next()).getValue()).getClass();
        }
    }

    @Override // ovh.plrapps.mapcompose.ui.layout.GestureListener
    public final void e() {
        CoroutineScope coroutineScope;
        if (((Boolean) this.g.getD()).booleanValue() && (coroutineScope = this.d) != null) {
            BuildersKt.c(coroutineScope, null, null, new ZoomPanRotateState$onTouchDown$1(this, null), 3);
        }
    }

    @Override // ovh.plrapps.mapcompose.ui.layout.GestureListener
    public final void f(long j) {
        if (v()) {
            double dPow = Math.pow(2.0d, Math.floor(Math.log(((SnapshotMutableDoubleStateImpl) this.l).f() * 2) / Math.log(2.0d)));
            if (((Boolean) ((SnapshotMutableStateImpl) this.x).getD()).booleanValue() && dPow > this.w) {
                dPow = ((SnapshotMutableDoubleStateImpl) this.v).f();
            }
            double d = dPow;
            long jZ = z(j, -(((SnapshotMutableFloatStateImpl) this.m).a() * 0.017453292f));
            CoroutineScope coroutineScope = this.d;
            if (coroutineScope != null) {
                BuildersKt.c(coroutineScope, null, null, new ZoomPanRotateState$onDoubleTap$1(this, jZ, d, null), 3);
            }
        }
    }

    @Override // ovh.plrapps.mapcompose.ui.layout.GestureListener
    public final void g(DecayAnimationSpec flingSpec, long j) {
        float fD;
        float fE;
        Intrinsics.h(flingSpec, "flingSpec");
        if (((Boolean) ((SnapshotMutableStateImpl) this.i).getD()).booleanValue()) {
            float f = -(((SnapshotMutableFloatStateImpl) this.m).a() * 0.017453292f);
            if (f == BitmapDescriptorFactory.HUE_RED) {
                fD = Velocity.d(j);
            } else {
                double d = f;
                fD = (Velocity.d(j) * ((float) Math.cos(d))) - (Velocity.e(j) * ((float) Math.sin(d)));
            }
            float f2 = fD;
            if (f == BitmapDescriptorFactory.HUE_RED) {
                fE = Velocity.e(j);
            } else {
                double d2 = f;
                fE = (Velocity.e(j) * ((float) Math.cos(d2))) + (Velocity.d(j) * ((float) Math.sin(d2)));
            }
            float f3 = fE;
            CoroutineScope coroutineScope = this.d;
            if (coroutineScope != null) {
                BuildersKt.c(coroutineScope, null, null, new ZoomPanRotateState$onFling$1(this, f2, f3, flingSpec, null), 3);
            }
        }
    }

    @Override // ovh.plrapps.mapcompose.ui.layout.GestureListener
    public final void h(double d, long j) {
        if (v()) {
            SnapshotMutableDoubleStateImpl snapshotMutableDoubleStateImpl = (SnapshotMutableDoubleStateImpl) this.l;
            double dF = snapshotMutableDoubleStateImpl.f();
            B(this, snapshotMutableDoubleStateImpl.f() * d);
            double dF2 = snapshotMutableDoubleStateImpl.f() / dF;
            long jZ = z(j, -(((SnapshotMutableFloatStateImpl) this.m).a() * 0.017453292f));
            double dF3 = ((SnapshotMutableDoubleStateImpl) this.n).f();
            double dE = Offset.e(jZ);
            double d2 = ((dF3 + dE) * dF2) - dE;
            double dF4 = ((SnapshotMutableDoubleStateImpl) this.o).f();
            double dF5 = Offset.f(jZ);
            C(d2, ((dF4 + dF5) * dF2) - dF5);
        }
    }

    @Override // ovh.plrapps.mapcompose.ui.layout.GestureListener
    public final void i(long j) {
    }

    @Override // ovh.plrapps.mapcompose.ui.layout.GestureListener
    public final void j(long j) {
        if (v()) {
            double dPow = Math.pow(2.0d, Math.floor(Math.log(((SnapshotMutableDoubleStateImpl) this.l).f() / 2) / Math.log(2.0d)));
            long jZ = z(j, -(((SnapshotMutableFloatStateImpl) this.m).a() * 0.017453292f));
            CoroutineScope coroutineScope = this.d;
            if (coroutineScope != null) {
                BuildersKt.c(coroutineScope, null, null, new ZoomPanRotateState$onTwoFingersTap$1(this, jZ, dPow, null), 3);
            }
        }
    }

    @Override // ovh.plrapps.mapcompose.ui.layout.GestureListener
    public final boolean k(long j) {
        return ((Boolean) x(j, new Function2<Double, Double, Boolean>() { // from class: ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$shouldConsumeTapGesture$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                final double dDoubleValue = ((Number) obj).doubleValue();
                final double dDoubleValue2 = ((Number) obj2).doubleValue();
                final ZoomPanRotateState zoomPanRotateState = this.h;
                return (Boolean) ZoomPanRotateState.p(zoomPanRotateState, dDoubleValue, dDoubleValue2, new Function2<Integer, Integer, Boolean>() { // from class: ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$shouldConsumeTapGesture$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        int iIntValue = ((Number) obj3).intValue();
                        int iIntValue2 = ((Number) obj4).intValue();
                        MapState mapState = zoomPanRotateState.c;
                        MarkerState markerState = mapState.d;
                        HitType hitType = HitType.d;
                        boolean zC = markerState.c(iIntValue, iIntValue2, hitType);
                        return Boolean.valueOf(zC || (!zC ? mapState.e.a(dDoubleValue, dDoubleValue2, ((SnapshotMutableDoubleStateImpl) mapState.b.l).f(), hitType) : false));
                    }
                });
            }
        })).booleanValue();
    }

    @Override // ovh.plrapps.mapcompose.ui.layout.GestureListener
    public final boolean l(long j) {
        return ((Boolean) x(j, new Function2<Double, Double, Boolean>() { // from class: ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$shouldConsumeLongPress$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                final double dDoubleValue = ((Number) obj).doubleValue();
                final double dDoubleValue2 = ((Number) obj2).doubleValue();
                final ZoomPanRotateState zoomPanRotateState = this.h;
                return (Boolean) ZoomPanRotateState.p(zoomPanRotateState, dDoubleValue, dDoubleValue2, new Function2<Integer, Integer, Boolean>() { // from class: ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$shouldConsumeLongPress$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        int iIntValue = ((Number) obj3).intValue();
                        int iIntValue2 = ((Number) obj4).intValue();
                        MapState mapState = zoomPanRotateState.c;
                        MarkerState markerState = mapState.d;
                        HitType hitType = HitType.e;
                        boolean zC = markerState.c(iIntValue, iIntValue2, hitType);
                        return Boolean.valueOf(zC || (!zC ? mapState.e.a(dDoubleValue, dDoubleValue2, ((SnapshotMutableDoubleStateImpl) mapState.b.l).f(), hitType) : false));
                    }
                });
            }
        })).booleanValue();
    }

    @Override // ovh.plrapps.mapcompose.ui.layout.GestureListener
    public final boolean m() {
        return ((Boolean) this.g.getD()).booleanValue();
    }

    @Override // ovh.plrapps.mapcompose.ui.layout.GestureListener
    public final void n(long j) {
    }

    @Override // ovh.plrapps.mapcompose.ui.layout.GestureListener
    public final void o(long j, float f) {
        CoroutineScope coroutineScope;
        if (v() && ((Boolean) ((SnapshotMutableStateImpl) this.k).getD()).booleanValue() && (coroutineScope = this.d) != null) {
            BuildersKt.c(coroutineScope, null, null, new ZoomPanRotateState$onFlingZoom$1(this, f, j, null), 3);
        }
    }

    public final Object r(ContinuationImpl continuationImpl) {
        if (this.d == null) {
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.b(continuationImpl));
            this.e.add(safeContinuation);
            Object objA = safeContinuation.a();
            if (objA == CoroutineSingletons.d) {
                return objA;
            }
        }
        return Unit.f24250a;
    }

    public final double s(double d) {
        MutableDoubleState mutableDoubleState = this.v;
        double dMax = Math.max(((SnapshotMutableDoubleStateImpl) mutableDoubleState).f(), Double.MIN_VALUE);
        double dF = ((SnapshotMutableDoubleStateImpl) mutableDoubleState).f();
        double d2 = this.w;
        return RangesKt.a(d, dMax, d2 < dF ? dF : d2);
    }

    public final long t() {
        return ((IntSize) ((SnapshotMutableStateImpl) this.t).getD()).f2202a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(kotlin.jvm.functions.Function1 r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$invokeAndCheckSuccess$1
            if (r0 == 0) goto L13
            r0 = r8
            ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$invokeAndCheckSuccess$1 r0 = (ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$invokeAndCheckSuccess$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$invokeAndCheckSuccess$1 r0 = new ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$invokeAndCheckSuccess$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.Ref$BooleanRef r7 = r0.p
            kotlin.ResultKt.b(r8)
            goto L60
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.ResultKt.b(r8)
            kotlin.jvm.internal.Ref$BooleanRef r8 = new kotlin.jvm.internal.Ref$BooleanRef
            r8.<init>()
            r8.d = r3
            kotlinx.coroutines.CoroutineScope r2 = r6.d
            if (r2 == 0) goto L61
            ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$invokeAndCheckSuccess$2 r4 = new ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$invokeAndCheckSuccess$2
            r5 = 0
            r4.<init>(r7, r5)
            r7 = 3
            kotlinx.coroutines.Job r7 = kotlinx.coroutines.BuildersKt.c(r2, r5, r5, r4, r7)
            ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$invokeAndCheckSuccess$3$1 r2 = new ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$invokeAndCheckSuccess$3$1
            r2.<init>()
            kotlinx.coroutines.JobSupport r7 = (kotlinx.coroutines.JobSupport) r7
            r7.invokeOnCompletion(r2)
            r0.p = r8
            r0.s = r3
            java.lang.Object r7 = r7.join(r0)
            if (r7 != r1) goto L5f
            return r1
        L5f:
            r7 = r8
        L60:
            r8 = r7
        L61:
            boolean r7 = r8.d
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState.u(kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean v() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.j).getD()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    public final void w() {
        if (IntSize.b(t(), 0L)) {
            return;
        }
        MapState mapState = this.c;
        mapState.n.invoke();
        mapState.h.k(Unit.f24250a);
    }

    public final Object x(long j, Function2 function2) {
        long jZ = z(j, -(((SnapshotMutableFloatStateImpl) this.m).a() * 0.017453292f));
        double dF = ((SnapshotMutableDoubleStateImpl) this.n).f() + Offset.e(jZ);
        SnapshotMutableDoubleStateImpl snapshotMutableDoubleStateImpl = (SnapshotMutableDoubleStateImpl) this.l;
        return function2.invoke(Double.valueOf(dF / (snapshotMutableDoubleStateImpl.f() * this.f26960a)), Double.valueOf((((SnapshotMutableDoubleStateImpl) this.o).f() + Offset.f(jZ)) / (snapshotMutableDoubleStateImpl.f() * this.b)));
    }

    public final long z(long j, float f) {
        float fE;
        float f2;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            fE = Offset.e(j);
        } else {
            double d = f;
            fE = ((Offset.e(j) * ((float) Math.cos(d))) + a.a(1, (float) Math.cos(d), ((int) (t() >> 32)) / 2, (((int) (t() & 4294967295L)) / 2) * ((float) Math.sin(d)))) - (Offset.f(j) * ((float) Math.sin(d)));
        }
        if (f == BitmapDescriptorFactory.HUE_RED) {
            f2 = Offset.f(j);
        } else {
            double d2 = f;
            f2 = (Offset.f(j) * ((float) Math.cos(d2))) + (Offset.e(j) * ((float) Math.sin(d2))) + (((1 - ((float) Math.cos(d2))) * (((int) (4294967295L & t())) / 2)) - ((((int) (t() >> 32)) / 2) * ((float) Math.sin(d2))));
        }
        return OffsetKt.a(fE, f2);
    }
}
