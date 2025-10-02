package androidx.constraintlayout.compose;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPathEffect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.Motion;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.TransitionParser;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MotionLayoutKt$MotionLayoutCore$11 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ ConstraintSet h;
    public final /* synthetic */ ConstraintSet i;
    public final /* synthetic */ Transition j;
    public final /* synthetic */ float k;
    public final /* synthetic */ LayoutInformationReceiver l;
    public final /* synthetic */ int m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ Modifier q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ Ref s;
    public final /* synthetic */ InvalidationStrategy t;
    public final /* synthetic */ ComposableLambdaImpl u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionLayoutKt$MotionLayoutCore$11(ConstraintSet constraintSet, ConstraintSet constraintSet2, Transition transition, float f, LayoutInformationReceiver layoutInformationReceiver, int i, boolean z, boolean z2, boolean z3, Modifier modifier, MutableState mutableState, Ref ref, InvalidationStrategy invalidationStrategy, ComposableLambdaImpl composableLambdaImpl, int i2, int i3) {
        super(2);
        this.h = constraintSet;
        this.i = constraintSet2;
        this.j = transition;
        this.k = f;
        this.l = layoutInformationReceiver;
        this.m = i;
        this.n = z;
        this.o = z2;
        this.p = z3;
        this.q = modifier;
        this.r = mutableState;
        this.s = ref;
        this.t = invalidationStrategy;
        this.u = composableLambdaImpl;
        this.v = i2;
        this.w = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws NumberFormatException {
        int i;
        int i2;
        float f;
        MutableFloatState mutableFloatState;
        MotionMeasurer motionMeasurer;
        boolean z;
        MutableState mutableState;
        InvalidationStrategy invalidationStrategy;
        boolean z2;
        final boolean z3;
        final boolean z4;
        LayoutInformationReceiver layoutInformationReceiver;
        Transition transition;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.v | 1);
        int iA2 = RecomposeScopeImplKt.a(this.w);
        ComposerImpl composerImplV = ((Composer) obj).v(-657259923);
        int i3 = iA & 6;
        final ConstraintSet constraintSet = this.h;
        if (i3 == 0) {
            i = (composerImplV.n(constraintSet) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i4 = iA & 48;
        final ConstraintSet constraintSet2 = this.i;
        if (i4 == 0) {
            i |= composerImplV.n(constraintSet2) ? 32 : 16;
        }
        int i5 = iA & KyberEngine.KyberPolyBytes;
        Transition transition2 = this.j;
        if (i5 == 0) {
            i |= composerImplV.n(transition2) ? 256 : 128;
        }
        int i6 = iA & 3072;
        float f2 = this.k;
        if (i6 == 0) {
            i |= composerImplV.q(f2) ? 2048 : 1024;
        }
        int i7 = iA & 24576;
        LayoutInformationReceiver layoutInformationReceiver2 = this.l;
        if (i7 == 0) {
            i |= (32768 & iA) == 0 ? composerImplV.n(layoutInformationReceiver2) : composerImplV.I(layoutInformationReceiver2) ? 16384 : 8192;
        }
        int i8 = 196608 & iA;
        int i9 = this.m;
        if (i8 == 0) {
            i |= composerImplV.r(i9) ? 131072 : 65536;
        }
        int i10 = 1572864 & iA;
        boolean z5 = this.n;
        if (i10 == 0) {
            i |= composerImplV.p(z5) ? 1048576 : 524288;
        }
        int i11 = 12582912 & iA;
        boolean z6 = this.o;
        if (i11 == 0) {
            i |= composerImplV.p(z6) ? 8388608 : 4194304;
        }
        int i12 = 100663296 & iA;
        boolean z7 = this.p;
        if (i12 == 0) {
            i |= composerImplV.p(z7) ? 67108864 : 33554432;
        }
        int i13 = iA & 805306368;
        Modifier modifier = this.q;
        if (i13 == 0) {
            i |= composerImplV.n(modifier) ? 536870912 : 268435456;
        }
        int i14 = iA2 & 6;
        final MutableState mutableState2 = this.r;
        if (i14 == 0) {
            i2 = iA2 | (composerImplV.n(mutableState2) ? 4 : 2);
        } else {
            i2 = iA2;
        }
        int i15 = iA2 & 48;
        int i16 = 128;
        final Ref ref = this.s;
        if (i15 == 0) {
            i2 |= (iA2 & 64) == 0 ? composerImplV.n(ref) : composerImplV.I(ref) ? 32 : 16;
        }
        int i17 = iA2 & KyberEngine.KyberPolyBytes;
        final int i18 = i9;
        final InvalidationStrategy invalidationStrategy2 = this.t;
        if (i17 == 0) {
            if (composerImplV.I(invalidationStrategy2)) {
                i16 = 256;
            }
            i2 |= i16;
        }
        int i19 = iA2 & 3072;
        final ComposableLambdaImpl composableLambdaImpl = this.u;
        if (i19 == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 2048 : 1024;
        }
        if ((306783379 & i) == 306783378 && (i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            f = f2;
            invalidationStrategy = invalidationStrategy2;
            z = z5;
            transition = transition2;
            layoutInformationReceiver = layoutInformationReceiver2;
            mutableState = mutableState2;
        } else {
            int i20 = i >> 9;
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = PrimitiveSnapshotStateKt.a(f2);
                composerImplV.A(objG);
            }
            MutableFloatState mutableFloatState2 = (MutableFloatState) objG;
            Object objG2 = composerImplV.G();
            Object obj3 = objG2;
            if (objG2 == composer$Companion$Empty$1) {
                Ref.FloatRef floatRef = new Ref.FloatRef();
                floatRef.d = f2;
                composerImplV.A(floatRef);
                obj3 = floatRef;
            }
            Ref.FloatRef floatRef2 = (Ref.FloatRef) obj3;
            if (floatRef2.d != f2) {
                floatRef2.d = f2;
                mutableFloatState2.p(f2);
            }
            TransitionImpl transitionImpl = transition2 instanceof TransitionImpl ? (TransitionImpl) transition2 : null;
            if (transitionImpl == null) {
                transitionImpl = TransitionImpl.b;
            }
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = SnapshotLongStateKt.a(0L);
                composerImplV.A(objG3);
            }
            MutableLongState mutableLongState = (MutableLongState) objG3;
            mutableLongState.e();
            if (layoutInformationReceiver2 != null) {
                layoutInformationReceiver2.c(mutableLongState);
            }
            MotionLayoutKt.a(mutableFloatState2, layoutInformationReceiver2, composerImplV, i20 & 112);
            Density density = (Density) composerImplV.x(CompositionLocalsKt.h);
            f = f2;
            LayoutDirection layoutDirection = (LayoutDirection) composerImplV.x(CompositionLocalsKt.n);
            Object objG4 = composerImplV.G();
            if (objG4 == composer$Companion$Empty$1) {
                objG4 = new MotionMeasurer(density);
                composerImplV.A(objG4);
            }
            MotionMeasurer motionMeasurer2 = (MotionMeasurer) objG4;
            Object objG5 = composerImplV.G();
            if (objG5 == composer$Companion$Empty$1) {
                objG5 = new MotionLayoutScope(motionMeasurer2, mutableFloatState2);
                composerImplV.A(objG5);
            }
            final MotionLayoutScope motionLayoutScope = (MotionLayoutScope) objG5;
            boolean z8 = ((i & 896) == 256) | ((i & 14) == 4) | ((i & 112) == 32);
            Object objG6 = composerImplV.G();
            if (z8 || objG6 == composer$Companion$Empty$1) {
                float fA = mutableFloatState2.a();
                ConstraintWidgetContainer constraintWidgetContainer = motionMeasurer2.b;
                androidx.constraintlayout.core.state.Transition transition3 = motionMeasurer2.k;
                mutableFloatState = mutableFloatState2;
                transition3.b.clear();
                motionMeasurer2.e.clear();
                State state = motionMeasurer2.f;
                motionMeasurer = motionMeasurer2;
                state.b = !(layoutDirection == LayoutDirection.e);
                EmptyList emptyList = EmptyList.d;
                constraintSet.a(state, emptyList);
                constraintSet.f(transition3, 0);
                state.a(constraintWidgetContainer);
                transition3.l(constraintWidgetContainer, 0);
                constraintSet.a(state, emptyList);
                constraintSet2.f(transition3, 1);
                state.a(constraintWidgetContainer);
                transition3.l(constraintWidgetContainer, 1);
                transition3.h(fA, 0, 0);
                transitionImpl.getClass();
                try {
                    TransitionParser.b(transitionImpl.f2255a, transition3);
                } catch (CLParsingException e) {
                    Log.e("CML", "Error parsing JSON " + e);
                }
                objG6 = Boolean.TRUE;
                composerImplV.A(objG6);
            } else {
                motionMeasurer = motionMeasurer2;
                mutableFloatState = mutableFloatState2;
            }
            ((Boolean) objG6).getClass();
            composerImplV.o(-487863565);
            invalidationStrategy2.getClass();
            composerImplV.V(false);
            final MotionMeasurer motionMeasurer3 = motionMeasurer;
            final TransitionImpl transitionImpl2 = transitionImpl;
            final MutableFloatState mutableFloatState3 = mutableFloatState;
            z = z5;
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$motionLayoutMeasurePolicy$1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x0141  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x0165  */
                /* JADX WARN: Removed duplicated region for block: B:84:0x01c9  */
                /* JADX WARN: Removed duplicated region for block: B:87:0x01d3  */
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final androidx.compose.ui.layout.MeasureResult c(androidx.compose.ui.layout.MeasureScope r21, java.util.List r22, long r23) throws java.lang.NumberFormatException {
                    /*
                        Method dump skipped, instructions count: 521
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionLayoutKt$motionLayoutMeasurePolicy$1.c(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
                }
            };
            mutableState = mutableState2;
            invalidationStrategy = invalidationStrategy2;
            i18 = i18;
            motionMeasurer3.f2248a = layoutInformationReceiver2;
            if (layoutInformationReceiver2 != null) {
                layoutInformationReceiver2.j();
            }
            MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.e;
            MotionLayoutDebugFlags motionLayoutDebugFlags2 = layoutInformationReceiver2 != null ? motionLayoutDebugFlags : null;
            float f3 = motionMeasurer3.i;
            if (motionLayoutDebugFlags2 == null || motionLayoutDebugFlags2 == motionLayoutDebugFlags) {
                z2 = z;
                z3 = z7;
                z4 = z6;
            } else {
                z3 = motionLayoutDebugFlags2 == MotionLayoutDebugFlags.d;
                z4 = z3;
                z2 = z4;
            }
            layoutInformationReceiver = layoutInformationReceiver2;
            composerImplV.o(-487805395);
            transition = transition2;
            boolean z9 = Build.VERSION.SDK_INT >= 30 && Api30Impl.a((View) composerImplV.x(AndroidCompositionLocals_androidKt.f));
            composerImplV.V(false);
            final boolean z10 = z9 ? true : z2;
            Modifier modifierA = !Float.isNaN(f3) ? ScaleKt.a(modifier, f3) : modifier;
            if (z10 || z3 || z4) {
                modifierA = DrawModifierKt.b(modifierA, new Function1<DrawScope, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$motionDebug$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i21;
                        int i22;
                        int i23;
                        Motion motion;
                        Canvas canvas;
                        MotionRenderDebug motionRenderDebug;
                        DrawScope drawScope = (DrawScope) obj4;
                        MotionMeasurer motionMeasurer4 = motionMeasurer3;
                        androidx.constraintlayout.core.state.Transition transition4 = motionMeasurer4.k;
                        AndroidPathEffect androidPathEffect = new AndroidPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, BitmapDescriptorFactory.HUE_RED));
                        ArrayList arrayList = motionMeasurer4.b.v0;
                        int size = arrayList.size();
                        int i24 = 0;
                        int i25 = 0;
                        while (i25 < size) {
                            ConstraintWidget constraintWidget = (ConstraintWidget) arrayList.get(i25);
                            transition4.getClass();
                            WidgetFrame widgetFrame = transition4.g(i24, constraintWidget.k).f2303a;
                            WidgetFrame widgetFrame2 = transition4.g(1, constraintWidget.k).b;
                            if (z10) {
                                long j = Color.h;
                                MotionMeasurer.i(drawScope, widgetFrame, androidPathEffect, j);
                                MotionMeasurer.i(drawScope, widgetFrame2, androidPathEffect, j);
                                drawScope.getE().f1798a.f(2.0f, 2.0f);
                                i21 = size;
                                try {
                                    long j2 = Color.f;
                                    MotionMeasurer.i(drawScope, widgetFrame, androidPathEffect, j2);
                                    MotionMeasurer.i(drawScope, widgetFrame2, androidPathEffect, j2);
                                } finally {
                                    drawScope.getE().f1798a.f(-2.0f, -2.0f);
                                }
                            } else {
                                i21 = size;
                            }
                            float fD = Size.d(drawScope.h());
                            float fB = Size.b(drawScope.h());
                            MotionRenderDebug motionRenderDebug2 = new MotionRenderDebug();
                            new Rect();
                            Paint paint = new Paint();
                            paint.setAntiAlias(true);
                            paint.setColor(-21965);
                            paint.setStrokeWidth(2.0f);
                            Paint.Style style = Paint.Style.STROKE;
                            paint.setStyle(style);
                            Paint paint2 = new Paint();
                            motionRenderDebug2.d = paint2;
                            paint2.setAntiAlias(true);
                            paint2.setColor(-2067046);
                            paint2.setStrokeWidth(2.0f);
                            paint2.setStyle(style);
                            Paint paint3 = new Paint();
                            paint3.setAntiAlias(true);
                            paint3.setColor(-13391360);
                            paint3.setStrokeWidth(2.0f);
                            paint3.setStyle(style);
                            Paint paint4 = new Paint();
                            paint4.setAntiAlias(true);
                            paint4.setColor(-13391360);
                            paint4.setTextSize(23.0f);
                            Paint paint5 = new Paint();
                            motionRenderDebug2.e = paint5;
                            paint5.setAntiAlias(true);
                            ArrayList arrayList2 = arrayList;
                            DrawScope drawScope2 = drawScope;
                            paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, BitmapDescriptorFactory.HUE_RED));
                            float[] fArr = new float[100];
                            motionRenderDebug2.b = fArr;
                            Canvas canvasA = AndroidCanvas_androidKt.a(drawScope2.getE().a());
                            AndroidPathEffect androidPathEffect2 = androidPathEffect;
                            Motion motion2 = transition4.g(0, widgetFrame.f2304a.k).d;
                            int i26 = (int) fD;
                            int i27 = (int) fB;
                            motionRenderDebug2.f = motion2.e(fArr, new int[50], null);
                            float[] fArr2 = motionRenderDebug2.f2252a;
                            if (fArr2 == null || fArr2.length != 124) {
                                motionRenderDebug2.f2252a = new float[124];
                                motionRenderDebug2.c = new Path();
                            }
                            float f4 = 1;
                            canvasA.translate(f4, f4);
                            paint.setColor(1996488704);
                            paint5.setColor(1996488704);
                            paint2.setColor(1996488704);
                            paint3.setColor(1996488704);
                            motion2.f(motionRenderDebug2.f2252a, 62);
                            boolean z11 = z4;
                            if (z11) {
                                float[] fArr3 = motionRenderDebug2.f2252a;
                                Intrinsics.e(fArr3);
                                canvasA.drawLines(fArr3, paint);
                            }
                            boolean z12 = z3;
                            if (z12) {
                                i22 = i26;
                                i23 = i27;
                                motion = motion2;
                                motionRenderDebug2.a(canvasA, motionRenderDebug2.f, motion, i22, i23);
                                motionRenderDebug = motionRenderDebug2;
                                canvas = canvasA;
                            } else {
                                i22 = i26;
                                i23 = i27;
                                motion = motion2;
                                canvas = canvasA;
                                motionRenderDebug = motionRenderDebug2;
                            }
                            paint.setColor(-21965);
                            paint2.setColor(-2067046);
                            paint5.setColor(-2067046);
                            paint3.setColor(-13391360);
                            float f5 = -f4;
                            canvas.translate(f5, f5);
                            if (z11) {
                                float[] fArr4 = motionRenderDebug.f2252a;
                                Intrinsics.e(fArr4);
                                canvas.drawLines(fArr4, paint);
                            }
                            if (z12) {
                                motionRenderDebug.a(canvas, motionRenderDebug.f, motion, i22, i23);
                            }
                            i25++;
                            size = i21;
                            arrayList = arrayList2;
                            drawScope = drawScope2;
                            androidPathEffect = androidPathEffect2;
                            i24 = 0;
                        }
                        return Unit.f24250a;
                    }
                });
            }
            final Transition transition4 = transition == null ? TransitionImpl.b : transition;
            Modifier modifierA2 = ComposedModifierKt.a(modifierA, InspectableValueKt.a(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    Modifier modifier2 = (Modifier) obj4;
                    Composer composer = (Composer) obj5;
                    ((Number) obj6).intValue();
                    composer.o(146198586);
                    MotionMeasurer motionMeasurer4 = motionMeasurer3;
                    if (motionMeasurer4.k.g == null) {
                        composer.l();
                        return modifier2;
                    }
                    Object obj7 = transition4;
                    boolean zN = composer.n(obj7);
                    Object objG7 = composer.G();
                    Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                    if (zN || objG7 == composer$Companion$Empty$12) {
                        objG7 = new TransitionHandler(motionMeasurer4, mutableFloatState3);
                        composer.A(objG7);
                    }
                    TransitionHandler transitionHandler = (TransitionHandler) objG7;
                    boolean zN2 = composer.n(obj7);
                    Object objG8 = composer.G();
                    if (zN2 || objG8 == composer$Companion$Empty$12) {
                        objG8 = ChannelKt.a(-1, 6, null);
                        composer.A(objG8);
                    }
                    Channel channel = (Channel) objG8;
                    boolean zI = composer.I(transitionHandler) | composer.I(channel);
                    Object objG9 = composer.G();
                    if (zI || objG9 == composer$Companion$Empty$12) {
                        objG9 = new MotionDragHandlerKt$motionPointerInput$2$1$1(transitionHandler, channel, null);
                        composer.A(objG9);
                    }
                    EffectsKt.e(composer, obj7, (Function2) objG9);
                    boolean zI2 = composer.I(transitionHandler) | composer.I(channel);
                    Object objG10 = composer.G();
                    if (zI2 || objG10 == composer$Companion$Empty$12) {
                        objG10 = new MotionDragHandlerKt$motionPointerInput$2$2$1(transitionHandler, channel, null);
                        composer.A(objG10);
                    }
                    Modifier modifierX0 = modifier2.x0(new SuspendPointerInputElement(obj7, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((Function2) objG10), 6));
                    composer.l();
                    return modifierX0;
                }
            });
            boolean zI = composerImplV.I(motionMeasurer3);
            Object objG7 = composerImplV.G();
            if (zI || objG7 == composer$Companion$Empty$1) {
                objG7 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$9$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        ToolingUtilsKt.a((SemanticsPropertyReceiver) obj4, motionMeasurer3);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG7);
            }
            composableLambdaImpl = composableLambdaImpl;
            LayoutKt.a(SemanticsModifierKt.b(modifierA2, false, (Function1) objG7), ComposableLambdaKt.c(1008059664, new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$10
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    Composer composer = (Composer) obj4;
                    if ((((Number) obj5).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        composableLambdaImpl.invoke(motionLayoutScope, composer, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), measurePolicy, composerImplV, 48);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new MotionLayoutKt$MotionLayoutCore$11(constraintSet, constraintSet2, transition, f, layoutInformationReceiver, i18, z, z6, z7, modifier, mutableState, ref, invalidationStrategy, composableLambdaImpl, iA, iA2);
        }
        return Unit.f24250a;
    }
}
