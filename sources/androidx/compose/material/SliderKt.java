package androidx.compose.material;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import com.dynatrace.android.compose.slider.SliderValueChangedCallback;
import com.dynatrace.android.compose.slider.SliderValueFinishedCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SliderKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1325a = 10;
    public static final float b = 24;
    public static final float c = 1;
    public static final float d = 6;
    public static final float e = 4;
    public static final Modifier f = SizeKt.i(SizeKt.w(Modifier.Companion.d, 144, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, 48, 1);
    public static final TweenSpec g = new TweenSpec(100, (Easing) null, 6);

    public static final void a(final float f2, Function1 onValueChange, final Modifier modifier, boolean z, final ClosedFloatingPointRange closedFloatingPointRange, SliderValueFinishedCallback sliderValueFinishedCallback, SliderColors sliderColors, Composer composer, final int i) {
        SliderValueFinishedCallback sliderValueFinishedCallback2;
        SliderValueChangedCallback sliderValueChangedCallback;
        final boolean z2;
        final SliderColors sliderColors2;
        SliderColors defaultSliderColors;
        boolean z3;
        Intrinsics.h(onValueChange, "onValueChange");
        composer.F(1696842313);
        composer.F(1157296644);
        boolean zN = composer.n(sliderValueFinishedCallback);
        Object objG = composer.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (zN || objG == composer$Companion$Empty$1) {
            objG = new SliderValueFinishedCallback(onValueChange, modifier, sliderValueFinishedCallback);
            composer.A(objG);
        }
        composer.N();
        final SliderValueFinishedCallback finishedCallback = (SliderValueFinishedCallback) objG;
        composer.N();
        Intrinsics.h(finishedCallback, "finishedCallback");
        composer.F(-352491528);
        composer.F(1157296644);
        boolean zN2 = composer.n(onValueChange);
        Object objG2 = composer.G();
        if (zN2 || objG2 == composer$Companion$Empty$1) {
            objG2 = new SliderValueChangedCallback(onValueChange, finishedCallback);
            composer.A(objG2);
        }
        composer.N();
        final SliderValueChangedCallback sliderValueChangedCallback2 = (SliderValueChangedCallback) objG2;
        composer.N();
        ComposerImpl composerImplV = composer.v(-1962335196);
        int i2 = i | (composerImplV.q(f2) ? 4 : 2) | (composerImplV.I(sliderValueChangedCallback2) ? 32 : 16) | (composerImplV.n(modifier) ? 256 : 128) | 3072 | (composerImplV.n(closedFloatingPointRange) ? 16384 : 8192) | 47906816;
        if (composerImplV.z(i2 & 1, (38347923 & i2) != 38347922)) {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                long jE = MaterialTheme.a(composerImplV).e();
                long jG = ColorKt.g(Color.b(MaterialTheme.a(composerImplV).d(), ContentAlpha.a(0.38f, 0.38f, composerImplV)), MaterialTheme.a(composerImplV).g());
                long jE2 = MaterialTheme.a(composerImplV).e();
                long jB = Color.b(jE2, 0.24f);
                long jB2 = Color.b(MaterialTheme.a(composerImplV).d(), 0.32f);
                long jB3 = Color.b(jB2, 0.12f);
                long jB4 = Color.b(ColorsKt.b(jE2, composerImplV), 0.54f);
                defaultSliderColors = new DefaultSliderColors(jE, jG, jE2, jB, jB2, jB3, jB4, Color.b(jE2, 0.54f), Color.b(jB4, 0.12f), Color.b(jB3, 0.12f));
                z3 = true;
            } else {
                composerImplV.j();
                z3 = z;
                defaultSliderColors = sliderColors;
            }
            composerImplV.W();
            composerImplV.o(246381876);
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = InteractionSourceKt.a();
                composerImplV.A(objG3);
            }
            final MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objG3;
            composerImplV.V(false);
            final MutableState mutableStateL = SnapshotStateKt.l(sliderValueChangedCallback2, composerImplV);
            final MutableState mutableStateL2 = SnapshotStateKt.l(finishedCallback, composerImplV);
            Object objG4 = composerImplV.G();
            if (objG4 == composer$Companion$Empty$1) {
                objG4 = EmptyList.d;
                composerImplV.A(objG4);
            }
            final List list = (List) objG4;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = InteractiveComponentSizeKt.f1291a;
            Modifier modifierX0 = modifier.x0(MinimumInteractiveModifier.d);
            float f3 = f1325a * 2;
            Modifier modifierN = SizeKt.n(modifierX0, f3, f3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12);
            final float fB = RangesKt.b(f2, ((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue());
            final int i3 = 0;
            final boolean z4 = z3;
            sliderValueChangedCallback = sliderValueChangedCallback2;
            Modifier modifierA = FocusableKt.a(ProgressSemanticsKt.b(SemanticsModifierKt.b(modifierN, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SliderKt$sliderSemantics$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                    if (!z4) {
                        SemanticsPropertiesKt.c(semanticsPropertyReceiver);
                    }
                    final Function1 function1 = sliderValueChangedCallback2;
                    final Function0 function0 = finishedCallback;
                    final ClosedFloatingPointRange closedFloatingPointRange2 = closedFloatingPointRange;
                    final int i4 = i3;
                    final float f4 = fB;
                    SemanticsPropertiesKt.p(semanticsPropertyReceiver, new Function1<Float, Boolean>() { // from class: androidx.compose.material.SliderKt$sliderSemantics$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i5;
                            float fFloatValue = ((Number) obj2).floatValue();
                            ClosedFloatingPointRange closedFloatingPointRange3 = closedFloatingPointRange2;
                            float fB2 = RangesKt.b(fFloatValue, ((Number) closedFloatingPointRange3.getStart()).floatValue(), ((Number) closedFloatingPointRange3.getEndInclusive()).floatValue());
                            boolean z5 = false;
                            int i6 = i4;
                            if (i6 > 0 && (i5 = i6 + 1) >= 0) {
                                float fAbs = fB2;
                                float f5 = fAbs;
                                int i7 = 0;
                                while (true) {
                                    float fB3 = MathHelpersKt.b(((Number) closedFloatingPointRange3.getStart()).floatValue(), ((Number) closedFloatingPointRange3.getEndInclusive()).floatValue(), i7 / i5);
                                    float f6 = fB3 - fB2;
                                    if (Math.abs(f6) <= fAbs) {
                                        fAbs = Math.abs(f6);
                                        f5 = fB3;
                                    }
                                    if (i7 == i5) {
                                        break;
                                    }
                                    i7++;
                                }
                                fB2 = f5;
                            }
                            if (fB2 != f4) {
                                function1.invoke(Float.valueOf(fB2));
                                function0.invoke();
                                z5 = true;
                            }
                            return Boolean.valueOf(z5);
                        }
                    });
                    return Unit.f24250a;
                }
            }), f2, closedFloatingPointRange, 0), z4, mutableInteractionSource);
            final boolean z5 = composerImplV.x(CompositionLocalsKt.n) == LayoutDirection.e;
            Modifier modifierA2 = KeyInputModifierKt.a(modifierA, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material.SliderKt$slideOnKeyEvents$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    android.view.KeyEvent keyEvent = ((KeyEvent) obj).f1844a;
                    if (!z4) {
                        return Boolean.FALSE;
                    }
                    int iB = KeyEvent_androidKt.b(keyEvent);
                    boolean z6 = false;
                    if (iB == 2) {
                        ClosedFloatingPointRange closedFloatingPointRange2 = closedFloatingPointRange;
                        float fAbs = Math.abs(((Number) closedFloatingPointRange2.getEndInclusive()).floatValue() - ((Number) closedFloatingPointRange2.getStart()).floatValue()) / 100;
                        long jA = Key_androidKt.a(keyEvent.getKeyCode());
                        boolean zA = Key.a(jA, Key.b);
                        float f4 = f2;
                        MutableState mutableState = mutableStateL;
                        if (zA) {
                            ((Function1) mutableState.getD()).invoke(RangesKt.f(Float.valueOf(f4 + fAbs), closedFloatingPointRange2));
                        } else if (Key.a(jA, Key.c)) {
                            ((Function1) mutableState.getD()).invoke(RangesKt.f(Float.valueOf(f4 - fAbs), closedFloatingPointRange2));
                        } else {
                            boolean zA2 = Key.a(jA, Key.e);
                            boolean z7 = z5;
                            if (zA2) {
                                ((Function1) mutableState.getD()).invoke(RangesKt.f(Float.valueOf(((z7 ? -1 : 1) * fAbs) + f4), closedFloatingPointRange2));
                            } else if (Key.a(jA, Key.d)) {
                                ((Function1) mutableState.getD()).invoke(RangesKt.f(Float.valueOf(f4 - ((z7 ? -1 : 1) * fAbs)), closedFloatingPointRange2));
                            } else if (Key.a(jA, Key.k)) {
                                ((Function1) mutableState.getD()).invoke(closedFloatingPointRange2.getStart());
                            } else if (Key.a(jA, Key.l)) {
                                ((Function1) mutableState.getD()).invoke(closedFloatingPointRange2.getEndInclusive());
                            } else if (Key.a(jA, Key.m)) {
                                ((Function1) mutableState.getD()).invoke(RangesKt.f(Float.valueOf(f4 - (RangesKt.c(10, 1, 10) * fAbs)), closedFloatingPointRange2));
                            } else if (Key.a(jA, Key.n)) {
                                ((Function1) mutableState.getD()).invoke(RangesKt.f(Float.valueOf((RangesKt.c(10, 1, 10) * fAbs) + f4), closedFloatingPointRange2));
                            }
                        }
                        z6 = true;
                    } else if (iB == 1) {
                        long jA2 = Key_androidKt.a(keyEvent.getKeyCode());
                        if (Key.a(jA2, Key.b) ? true : Key.a(jA2, Key.c) ? true : Key.a(jA2, Key.e) ? true : Key.a(jA2, Key.d) ? true : Key.a(jA2, Key.k) ? true : Key.a(jA2, Key.l) ? true : Key.a(jA2, Key.m) ? true : Key.a(jA2, Key.n)) {
                            Function0 function0 = (Function0) mutableStateL2.getD();
                            if (function0 != null) {
                                function0.invoke();
                            }
                            z6 = true;
                        }
                    }
                    return Boolean.valueOf(z6);
                }
            });
            sliderColors2 = defaultSliderColors;
            sliderValueFinishedCallback2 = finishedCallback;
            BoxWithConstraintsKt.a(modifierA2, null, false, ComposableLambdaKt.c(2085116814, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$Slider$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    MutableFloatState mutableFloatState;
                    Ref.FloatRef floatRef;
                    ClosedFloatingPointRange closedFloatingPointRange2;
                    final SliderDraggableState sliderDraggableState;
                    final MutableFloatState mutableFloatState2;
                    Ref.FloatRef floatRef2;
                    BoxWithConstraintsScope boxWithConstraintsScope = (BoxWithConstraintsScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(boxWithConstraintsScope) ? 4 : 2;
                    }
                    if (composer2.z(iIntValue & 1, (iIntValue & 19) != 18)) {
                        final boolean z6 = composer2.x(CompositionLocalsKt.n) == LayoutDirection.e;
                        final float fH = Constraints.h(boxWithConstraintsScope.getB());
                        final Ref.FloatRef floatRef3 = new Ref.FloatRef();
                        final Ref.FloatRef floatRef4 = new Ref.FloatRef();
                        Density density = (Density) composer2.x(CompositionLocalsKt.h);
                        float f4 = SliderKt.f1325a;
                        floatRef3.d = Math.max(fH - density.T1(f4), BitmapDescriptorFactory.HUE_RED);
                        floatRef4.d = Math.min(density.T1(f4), floatRef3.d);
                        Object objG5 = composer2.G();
                        Object obj4 = Composer.Companion.f1624a;
                        if (objG5 == obj4) {
                            objG5 = a.i(composer2.y(), composer2);
                        }
                        final CoroutineScope coroutineScope = (CoroutineScope) objG5;
                        Object objG6 = composer2.G();
                        float f5 = f2;
                        final ClosedFloatingPointRange closedFloatingPointRange3 = closedFloatingPointRange;
                        if (objG6 == obj4) {
                            objG6 = PrimitiveSnapshotStateKt.a(SliderKt.i(((Number) closedFloatingPointRange3.getStart()).floatValue(), ((Number) closedFloatingPointRange3.getEndInclusive()).floatValue(), f5, floatRef4.d, floatRef3.d));
                            composer2.A(objG6);
                        }
                        final MutableFloatState mutableFloatState3 = (MutableFloatState) objG6;
                        Object objG7 = composer2.G();
                        if (objG7 == obj4) {
                            objG7 = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
                            composer2.A(objG7);
                        }
                        final MutableFloatState mutableFloatState4 = (MutableFloatState) objG7;
                        boolean zQ = composer2.q(floatRef4.d) | composer2.q(floatRef3.d) | composer2.n(closedFloatingPointRange3);
                        Object objG8 = composer2.G();
                        if (zQ || objG8 == obj4) {
                            final MutableState mutableState = mutableStateL;
                            Function1<Float, Unit> function1 = new Function1<Float, Unit>() { // from class: androidx.compose.material.SliderKt$Slider$2$draggableState$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    float fFloatValue = ((Number) obj5).floatValue();
                                    MutableFloatState mutableFloatState5 = mutableFloatState3;
                                    float fA = mutableFloatState5.a() + fFloatValue;
                                    MutableFloatState mutableFloatState6 = mutableFloatState4;
                                    mutableFloatState5.p(mutableFloatState6.a() + fA);
                                    mutableFloatState6.p(BitmapDescriptorFactory.HUE_RED);
                                    float fA2 = mutableFloatState5.a();
                                    Ref.FloatRef floatRef5 = floatRef4;
                                    float f6 = floatRef5.d;
                                    Ref.FloatRef floatRef6 = floatRef3;
                                    float fB2 = RangesKt.b(fA2, f6, floatRef6.d);
                                    Function1 function12 = (Function1) mutableState.getD();
                                    float f7 = floatRef5.d;
                                    float f8 = floatRef6.d;
                                    ClosedFloatingPointRange closedFloatingPointRange4 = closedFloatingPointRange3;
                                    function12.invoke(Float.valueOf(SliderKt.i(f7, f8, fB2, ((Number) closedFloatingPointRange4.getStart()).floatValue(), ((Number) closedFloatingPointRange4.getEndInclusive()).floatValue())));
                                    return Unit.f24250a;
                                }
                            };
                            mutableFloatState = mutableFloatState4;
                            floatRef = floatRef4;
                            closedFloatingPointRange2 = closedFloatingPointRange3;
                            objG8 = new SliderDraggableState(function1);
                            composer2.A(objG8);
                        } else {
                            closedFloatingPointRange2 = closedFloatingPointRange3;
                            mutableFloatState = mutableFloatState4;
                            floatRef = floatRef4;
                        }
                        SliderDraggableState sliderDraggableState2 = (SliderDraggableState) objG8;
                        boolean zN3 = composer2.n(closedFloatingPointRange2) | composer2.q(floatRef.d) | composer2.q(floatRef3.d);
                        Object objG9 = composer2.G();
                        if (zN3 || objG9 == obj4) {
                            objG9 = new SliderKt$Slider$2$2$1(closedFloatingPointRange2, floatRef, floatRef3);
                            composer2.A(objG9);
                        }
                        SliderKt.d((Function1) ((KFunction) objG9), closedFloatingPointRange2, RangesKt.j(floatRef.d, floatRef3.d), mutableFloatState3, f2, composer2, 3072);
                        boolean zI = composer2.I(list) | composer2.q(floatRef.d) | composer2.q(floatRef3.d) | composer2.I(coroutineScope) | composer2.I(sliderDraggableState2);
                        final SliderValueFinishedCallback sliderValueFinishedCallback3 = finishedCallback;
                        boolean zN4 = zI | composer2.n(sliderValueFinishedCallback3);
                        Object objG10 = composer2.G();
                        if (zN4 || objG10 == obj4) {
                            final Ref.FloatRef floatRef5 = floatRef;
                            final List list2 = list;
                            sliderDraggableState = sliderDraggableState2;
                            mutableFloatState2 = mutableFloatState3;
                            Object obj5 = new Function1<Float, Unit>() { // from class: androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1

                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                @DebugMetadata(c = "androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1$1", f = "Slider.kt", l = {235}, m = "invokeSuspend")
                                /* renamed from: androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1$1, reason: invalid class name */
                                final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    public int p;
                                    public final /* synthetic */ SliderDraggableState q;
                                    public final /* synthetic */ float r;
                                    public final /* synthetic */ float s;
                                    public final /* synthetic */ float t;
                                    public final /* synthetic */ SliderValueFinishedCallback u;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(SliderDraggableState sliderDraggableState, float f, float f2, float f3, SliderValueFinishedCallback sliderValueFinishedCallback, Continuation continuation) {
                                        super(2, continuation);
                                        this.q = sliderDraggableState;
                                        this.r = f;
                                        this.s = f2;
                                        this.t = f3;
                                        this.u = sliderValueFinishedCallback;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation create(Object obj, Continuation continuation) {
                                        return new AnonymousClass1(this.q, this.r, this.s, this.t, this.u, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                                        int i = this.p;
                                        Unit unit = Unit.f24250a;
                                        if (i == 0) {
                                            ResultKt.b(obj);
                                            this.p = 1;
                                            float f = SliderKt.f1325a;
                                            SliderKt$animateToTarget$2 sliderKt$animateToTarget$2 = new SliderKt$animateToTarget$2(this.r, this.s, this.t, null);
                                            Object objA = this.q.a(MutatePriority.d, sliderKt$animateToTarget$2, this);
                                            if (objA != coroutineSingletons) {
                                                objA = unit;
                                            }
                                            if (objA == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.b(obj);
                                        }
                                        this.u.invoke();
                                        return unit;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    float fFloatValue = ((Number) obj6).floatValue();
                                    float fA = mutableFloatState2.a();
                                    float fG = SliderKt.g(fA, list2, floatRef5.d, floatRef3.d);
                                    SliderValueFinishedCallback sliderValueFinishedCallback4 = sliderValueFinishedCallback3;
                                    if (fA != fG) {
                                        BuildersKt.c(coroutineScope, null, null, new AnonymousClass1(sliderDraggableState, fA, fG, fFloatValue, sliderValueFinishedCallback4, null), 3);
                                    } else if (!((Boolean) ((SnapshotMutableStateImpl) sliderDraggableState.b).getD()).booleanValue()) {
                                        sliderValueFinishedCallback4.invoke();
                                    }
                                    return Unit.f24250a;
                                }
                            };
                            floatRef2 = floatRef5;
                            composer2.A(obj5);
                            objG10 = obj5;
                        } else {
                            floatRef2 = floatRef;
                            sliderDraggableState = sliderDraggableState2;
                            mutableFloatState2 = mutableFloatState3;
                        }
                        final MutableState mutableStateL3 = SnapshotStateKt.l((Function1) objG10, composer2);
                        Function1 function1A = InspectableValueKt.a();
                        final boolean z7 = z4;
                        final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                        final SliderDraggableState sliderDraggableState3 = sliderDraggableState;
                        final MutableFloatState mutableFloatState5 = mutableFloatState;
                        Function3<Modifier, Composer, Integer, Modifier> function3 = new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.SliderKt$sliderTapModifier$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                Modifier modifierX02 = (Modifier) obj6;
                                Composer composer3 = (Composer) obj7;
                                ((Number) obj8).intValue();
                                composer3.o(1945228890);
                                if (z7) {
                                    composer3.o(-394118969);
                                    Object objG11 = composer3.G();
                                    Object obj9 = Composer.Companion.f1624a;
                                    if (objG11 == obj9) {
                                        objG11 = a.i(composer3.y(), composer3);
                                    }
                                    CoroutineScope coroutineScope2 = (CoroutineScope) objG11;
                                    float f6 = fH;
                                    Float fValueOf = Float.valueOf(f6);
                                    boolean z8 = z6;
                                    Boolean boolValueOf = Boolean.valueOf(z8);
                                    DraggableState draggableState = sliderDraggableState3;
                                    Object[] objArr = {draggableState, mutableInteractionSource2, fValueOf, boolValueOf};
                                    boolean zQ2 = composer3.q(f6) | composer3.p(z8) | composer3.n(mutableFloatState5) | composer3.n(mutableFloatState2) | composer3.I(coroutineScope2) | composer3.I(draggableState);
                                    MutableState mutableState2 = mutableStateL3;
                                    boolean zN5 = zQ2 | composer3.n(mutableState2);
                                    Object objG12 = composer3.G();
                                    if (zN5 || objG12 == obj9) {
                                        objG12 = new SliderKt$sliderTapModifier$2$1$1(z6, fH, mutableFloatState5, mutableFloatState2, coroutineScope2, sliderDraggableState3, mutableState2, null);
                                        composer3.A(objG12);
                                    }
                                    modifierX02 = modifierX02.x0(new SuspendPointerInputElement(null, null, objArr, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((Function2) objG12), 3));
                                    composer3.l();
                                } else {
                                    composer3.o(-393026932);
                                    composer3.l();
                                }
                                composer3.l();
                                return modifierX02;
                            }
                        };
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierA3 = ComposedModifierKt.a(companion, function1A, function3);
                        Orientation orientation = Orientation.e;
                        boolean zBooleanValue = ((Boolean) ((SnapshotMutableStateImpl) sliderDraggableState3.b).getD()).booleanValue();
                        boolean zN5 = composer2.n(mutableStateL3);
                        Object objG11 = composer2.G();
                        if (zN5 || objG11 == obj4) {
                            objG11 = new SliderKt$Slider$2$drag$1$1(mutableStateL3, null);
                            composer2.A(objG11);
                        }
                        SliderKt.e(z4, SliderKt.h(((Number) closedFloatingPointRange2.getStart()).floatValue(), ((Number) closedFloatingPointRange2.getEndInclusive()).floatValue(), RangesKt.b(f5, ((Number) closedFloatingPointRange2.getStart()).floatValue(), ((Number) closedFloatingPointRange2.getEndInclusive()).floatValue())), list, sliderColors2, floatRef3.d - floatRef2.d, mutableInteractionSource, modifierA3.x0(DraggableKt.b(companion, sliderDraggableState3, orientation, z4, mutableInteractionSource, zBooleanValue, (Function3) objG11, z6, 32)), composer2, 0);
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 3072, 6);
            z2 = z4;
        } else {
            sliderValueFinishedCallback2 = finishedCallback;
            sliderValueChangedCallback = sliderValueChangedCallback2;
            composerImplV.j();
            z2 = z;
            sliderColors2 = sliderColors;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            final SliderValueFinishedCallback sliderValueFinishedCallback3 = sliderValueFinishedCallback2;
            final SliderValueChangedCallback sliderValueChangedCallback3 = sliderValueChangedCallback;
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(f2, sliderValueChangedCallback3, modifier, z2, closedFloatingPointRange, sliderValueFinishedCallback3, sliderColors2, i) { // from class: androidx.compose.material.SliderKt$Slider$3
                public final /* synthetic */ float h;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Modifier j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ ClosedFloatingPointRange l;
                public final /* synthetic */ SliderValueFinishedCallback m;
                public final /* synthetic */ SliderColors n;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(1);
                    SliderKt.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final Modifier modifier, final float f2, final MutableInteractionSource mutableInteractionSource, final SliderColors sliderColors, final boolean z, final float f3, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(428907178);
        int i3 = i & 6;
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f944a;
        if (i3 == 0) {
            i2 = (composerImplV.n(boxScopeInstance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.q(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(sliderColors) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.p(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.q(f3) ? 1048576 : 524288;
        }
        if (composerImplV.z(i2 & 1, (599187 & i2) != 599186)) {
            Modifier modifierG = boxScopeInstance.g(PaddingKt.j(Modifier.Companion.d, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), Alignment.Companion.d);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierG);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new SnapshotStateList();
                composerImplV.A(objG);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objG;
            boolean z2 = (i2 & 7168) == 2048;
            Object objG2 = composerImplV.G();
            if (z2 || objG2 == composer$Companion$Empty$1) {
                objG2 = new SliderKt$SliderThumb$1$1$1(mutableInteractionSource, snapshotStateList, null);
                composerImplV.A(objG2);
            }
            EffectsKt.e(composerImplV, mutableInteractionSource, (Function2) objG2);
            float f4 = !snapshotStateList.isEmpty() ? d : c;
            Modifier modifierA = HoverableKt.a(IndicationKt.a(SizeKt.r(modifier, f3, f3), mutableInteractionSource, RippleKt.b(b, 4, 0L, false)), mutableInteractionSource);
            if (!z) {
                f4 = 0;
            }
            float f5 = f4;
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.f1100a;
            SpacerKt.a(composerImplV, BackgroundKt.b(ShadowKt.a(modifierA, f5, roundedCornerShape, false, 0L, 0L, 24), ((Color) sliderColors.b(z, composerImplV).getD()).f1766a, roundedCornerShape));
            composerImplV.V(true);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$SliderThumb$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    SliderKt.b(modifier, f2, mutableInteractionSource, sliderColors, z, f3, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void c(final Modifier modifier, final SliderColors sliderColors, final boolean z, final float f2, final float f3, final List list, final float f4, final float f5, Composer composer, final int i) {
        int i2;
        float f6;
        ComposerImpl composerImplV = composer.v(1833126050);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(sliderColors) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.q(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            f6 = f3;
            i2 |= composerImplV.q(f6) ? 16384 : 8192;
        } else {
            f6 = f3;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(list) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.q(f4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.q(f5) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (composerImplV.z(i3 & 1, (4793491 & i3) != 4793490)) {
            final MutableState mutableStateA = sliderColors.a(z, false, composerImplV);
            final MutableState mutableStateA2 = sliderColors.a(z, true, composerImplV);
            final MutableState mutableStateC = sliderColors.c(z, false, composerImplV);
            final MutableState mutableStateC2 = sliderColors.c(z, true, composerImplV);
            boolean zN = ((i3 & 3670016) == 1048576) | composerImplV.n(mutableStateA) | ((29360128 & i3) == 8388608) | ((57344 & i3) == 16384) | ((i3 & 7168) == 2048) | composerImplV.n(mutableStateA2) | composerImplV.I(list) | composerImplV.n(mutableStateC) | composerImplV.n(mutableStateC2);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                final float f7 = f6;
                Function1<DrawScope, Unit> function1 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.SliderKt$Track$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        long j;
                        long j2;
                        DrawScope drawScope = (DrawScope) obj;
                        boolean z2 = drawScope.getLayoutDirection() == LayoutDirection.e;
                        float f8 = Offset.f(drawScope.M0());
                        float f9 = f4;
                        long jA = OffsetKt.a(f9, f8);
                        long jA2 = OffsetKt.a(Size.d(drawScope.h()) - f9, Offset.f(drawScope.M0()));
                        if (z2) {
                            j2 = jA;
                            j = jA2;
                        } else {
                            j = jA;
                            j2 = j;
                        }
                        if (!z2) {
                            j2 = jA2;
                        }
                        drawScope.b1(((Color) mutableStateA.getD()).f1766a, j, j2, f5, (464 & 16) != 0 ? 0 : 1, (464 & 32) != 0 ? null : null, 3);
                        long j3 = j;
                        float fE = Offset.e(j3);
                        float fE2 = Offset.e(j2) - Offset.e(j3);
                        float f10 = f7;
                        long jA3 = OffsetKt.a((fE2 * f10) + fE, Offset.f(drawScope.M0()));
                        float fE3 = Offset.e(j3);
                        float fE4 = Offset.e(j2) - Offset.e(j3);
                        float f11 = f2;
                        long j4 = j2;
                        drawScope.b1(((Color) mutableStateA2.getD()).f1766a, OffsetKt.a((fE4 * f11) + fE3, Offset.f(drawScope.M0())), jA3, f5, (464 & 16) != 0 ? 0 : 1, (464 & 32) != 0 ? null : null, 3);
                        List list2 = list;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj2 : list2) {
                            float fFloatValue = ((Number) obj2).floatValue();
                            Boolean boolValueOf = Boolean.valueOf(fFloatValue > f10 || fFloatValue < f11);
                            Object arrayList = linkedHashMap.get(boolValueOf);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(boolValueOf, arrayList);
                            }
                            ((List) arrayList).add(obj2);
                        }
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                            List list3 = (List) entry.getValue();
                            ArrayList arrayList2 = new ArrayList(list3.size());
                            int size = list3.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                arrayList2.add(new Offset(OffsetKt.a(Offset.e(OffsetKt.b(j3, ((Number) list3.get(i4)).floatValue(), j4)), Offset.f(drawScope.M0()))));
                            }
                            drawScope.X1(arrayList2, ((Color) (zBooleanValue ? mutableStateC : mutableStateC2).getD()).f1766a, f5);
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(function1);
                objG = function1;
            }
            CanvasKt.a(modifier, (Function1) objG, composerImplV, i3 & 14);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$Track$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    SliderKt.c(modifier, sliderColors, z, f2, f3, list, f4, f5, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void d(final Function1 function1, final ClosedFloatingPointRange closedFloatingPointRange, final ClosedFloatingPointRange closedFloatingPointRange2, final MutableState mutableState, final float f2, Composer composer, final int i) {
        int i2;
        float f3;
        ComposerImpl composerImplV = composer.v(-743965752);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(closedFloatingPointRange) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(closedFloatingPointRange2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(mutableState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            f3 = f2;
            i2 |= composerImplV.q(f3) ? 16384 : 8192;
        } else {
            f3 = f2;
        }
        if (composerImplV.z(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((57344 & i2) == 16384) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                final float f4 = f3;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.SliderKt$CorrectValueSideEffect$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ClosedFloatingPointRange closedFloatingPointRange3 = closedFloatingPointRange;
                        float fFloatValue = (((Number) closedFloatingPointRange3.getEndInclusive()).floatValue() - ((Number) closedFloatingPointRange3.getStart()).floatValue()) / 1000;
                        float fFloatValue2 = ((Number) function1.invoke(Float.valueOf(f4))).floatValue();
                        MutableState mutableState2 = mutableState;
                        if (Math.abs(fFloatValue2 - ((Number) mutableState2.getD()).floatValue()) > fFloatValue) {
                            if (closedFloatingPointRange2.contains((Comparable) mutableState2.getD())) {
                                mutableState2.setValue(Float.valueOf(fFloatValue2));
                            }
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(function0);
                objG = function0;
            }
            composerImplV.g((Function0) objG);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$CorrectValueSideEffect$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    SliderKt.d(function1, closedFloatingPointRange, closedFloatingPointRange2, mutableState, f2, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void e(final boolean z, final float f2, final List list, final SliderColors sliderColors, final float f3, final MutableInteractionSource mutableInteractionSource, final Modifier modifier, Composer composer, final int i) {
        int i2;
        SliderColors sliderColors2;
        ComposerImpl composerImplV = composer.v(1679682785);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.q(f2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            sliderColors2 = sliderColors;
            i2 |= composerImplV.n(sliderColors2) ? 2048 : 1024;
        } else {
            sliderColors2 = sliderColors;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.q(f3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.n(mutableInteractionSource) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.n(modifier) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (composerImplV.z(i3 & 1, (599187 & i3) != 599186)) {
            Modifier modifierX0 = modifier.x0(f);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierX0);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Density density = (Density) composerImplV.x(CompositionLocalsKt.h);
            float fT1 = density.T1(e);
            float f4 = f1325a;
            float fT12 = density.T1(f4);
            float fC = density.C(f3) * f2;
            int i5 = i3 >> 6;
            int i6 = i3 << 9;
            c(SizeKt.c, sliderColors2, z, BitmapDescriptorFactory.HUE_RED, f2, list, fT12, fT1, composerImplV, (i6 & 458752) | ((i3 << 6) & 896) | (i5 & 112) | 3078 | (i6 & 57344));
            composerImplV = composerImplV;
            b(Modifier.Companion.d, fC, mutableInteractionSource, sliderColors, z, f4 * 2, composerImplV, (i5 & 7168) | 1572918 | ((i3 << 3) & 57344) | ((i3 << 15) & 458752));
            composerImplV.V(true);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$SliderImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    SliderKt.e(z, f2, list, sliderColors, f3, mutableInteractionSource, modifier, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable f(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, long r9, int r11, kotlin.coroutines.jvm.internal.BaseContinuationImpl r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.material.SliderKt$awaitSlop$1
            if (r0 == 0) goto L14
            r0 = r12
            androidx.compose.material.SliderKt$awaitSlop$1 r0 = (androidx.compose.material.SliderKt$awaitSlop$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.r = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.material.SliderKt$awaitSlop$1 r0 = new androidx.compose.material.SliderKt$awaitSlop$1
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.r
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.jvm.internal.Ref$FloatRef r8 = r6.p
            kotlin.ResultKt.b(r12)
            goto L51
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.ResultKt.b(r12)
            kotlin.jvm.internal.Ref$FloatRef r12 = new kotlin.jvm.internal.Ref$FloatRef
            r12.<init>()
            androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1 r5 = new androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1
            r5.<init>()
            r6.p = r12
            r6.r = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material.DragGestureDetectorCopyKt.a(r1, r2, r4, r5, r6)
            if (r8 != r0) goto L4e
            return r0
        L4e:
            r7 = r12
            r12 = r8
            r8 = r7
        L51:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            if (r12 == 0) goto L62
            float r8 = r8.d
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r8)
            kotlin.Pair r8 = new kotlin.Pair
            r8.<init>(r12, r9)
            return r8
        L62:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.f(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.io.Serializable");
    }

    public static final float g(float f2, List list, float f3, float f4) {
        Object obj;
        if (list.isEmpty()) {
            obj = null;
        } else {
            Object obj2 = list.get(0);
            float fAbs = Math.abs(MathHelpersKt.b(f3, f4, ((Number) obj2).floatValue()) - f2);
            int I = CollectionsKt.I(list);
            int i = 1;
            if (1 <= I) {
                while (true) {
                    Object obj3 = list.get(i);
                    float fAbs2 = Math.abs(MathHelpersKt.b(f3, f4, ((Number) obj3).floatValue()) - f2);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        obj2 = obj3;
                        fAbs = fAbs2;
                    }
                    if (i == I) {
                        break;
                    }
                    i++;
                }
            }
            obj = obj2;
        }
        Float f5 = (Float) obj;
        return f5 != null ? MathHelpersKt.b(f3, f4, f5.floatValue()) : f2;
    }

    public static final float h(float f2, float f3, float f4) {
        float f5 = f3 - f2;
        float f6 = BitmapDescriptorFactory.HUE_RED;
        float f7 = f5 == BitmapDescriptorFactory.HUE_RED ? 0.0f : (f4 - f2) / f5;
        if (f7 >= BitmapDescriptorFactory.HUE_RED) {
            f6 = f7;
        }
        if (f6 > 1.0f) {
            return 1.0f;
        }
        return f6;
    }

    public static final float i(float f2, float f3, float f4, float f5, float f6) {
        return MathHelpersKt.b(f5, f6, h(f2, f3, f4));
    }
}
