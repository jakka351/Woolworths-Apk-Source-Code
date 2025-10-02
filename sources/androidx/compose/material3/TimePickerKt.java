package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.RememberedCoroutineScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.os.LocaleListCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\t²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"", "a11yServicesEnabled", "Landroidx/compose/ui/text/input/TextFieldValue;", "hourValue", "minuteValue", "Landroidx/compose/ui/geometry/Offset;", "center", "Landroidx/compose/ui/unit/IntOffset;", "parentCenter", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TimePickerKt {
    public static final float c;
    public static final float d;
    public static final MutableIntList f;
    public static final float g;

    /* renamed from: a, reason: collision with root package name */
    public static final float f1519a = 101;
    public static final float b = 36;
    public static final float e = 74;

    static {
        float f2 = 24;
        c = f2;
        d = f2;
        IntListKt.a(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);
        MutableIntList mutableIntListA = IntListKt.a(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        MutableIntList mutableIntList = new MutableIntList(mutableIntListA.b);
        int[] iArr = mutableIntListA.f676a;
        int i = mutableIntListA.b;
        for (int i2 = 0; i2 < i; i2++) {
            mutableIntList.c((iArr[i2] % 12) + 12);
        }
        f = mutableIntList;
        g = 12;
    }

    public static final void a(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-934561141);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(timePickerState) : composerImplV.I(timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(timePickerColors) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CompositionLocalKt.b(new ProvidedValue[]{TextKt.f1518a.b(TypographyKt.a(TimePickerTokens.k, composerImplV)), CompositionLocalsKt.n.b(LayoutDirection.d)}, ComposableLambdaKt.c(-477913269, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockDisplayNumbers$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierD = ComposedModifierKt.d(composer2, companion);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        float f2 = TimePickerTokens.j;
                        float f3 = TimePickerTokens.h;
                        Modifier modifierR = SizeKt.r(companion, f2, f3);
                        float f4 = TimePickerKt.f1519a;
                        TimePickerState timePickerState2 = timePickerState;
                        int iA = timePickerState2.getF1524a() ? timePickerState2.a() % 24 : timePickerState2.a() % 12 == 0 ? 12 : timePickerState2.b() ? timePickerState2.a() - 12 : timePickerState2.a();
                        TimePickerColors timePickerColors2 = timePickerColors;
                        TimePickerKt.f(modifierR, iA, timePickerState2, 0, timePickerColors2, composer2, 3078);
                        TimePickerKt.l(SizeKt.r(companion, TimePickerKt.d, TimePickerTokens.f), composer2, 6);
                        TimePickerKt.f(SizeKt.r(companion, f2, f3), timePickerState2.f(), timePickerState2, 1, timePickerColors2, composer2, 3078);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 56);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockDisplayNumbers$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    TimePickerKt.a(timePickerState, timePickerColors, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final AnalogTimePickerState analogTimePickerState, final TimePickerColors timePickerColors, final boolean z, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-1170157036);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(analogTimePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(timePickerColors) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerImplV.c()) {
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.f1100a;
            timePickerColors.getClass();
            BackgroundKt.b(Modifier.Companion.d, 0L, roundedCornerShape);
            throw null;
        }
        composerImplV.j();
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    TimePickerKt.b(analogTimePickerState, timePickerColors, z, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void c(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i) {
        int i2;
        boolean z;
        boolean z2;
        ComposerImpl composerImplV = composer.v(755539561);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(timePickerState) : composerImplV.I(timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(timePickerColors) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.e, Alignment.Companion.m, composerImplV, 6);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            a(timePickerState, timePickerColors, composerImplV, i2 & 126);
            composerImplV.o(919638492);
            if (timePickerState.getF1524a()) {
                z = true;
                z2 = false;
            } else {
                int i4 = i2;
                z2 = false;
                Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, g, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                int i5 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierJ);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD, function2);
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                    androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
                }
                Updater.b(composerImplV, modifierD2, function24);
                int i6 = i4 << 3;
                d(SizeKt.r(companion, TimePickerTokens.d, TimePickerTokens.c), timePickerState, timePickerColors, composerImplV, (i6 & 896) | (i6 & 112) | 6);
                z = true;
                composerImplV.V(true);
            }
            composerImplV.V(z2);
            composerImplV.V(z);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$HorizontalClockDisplay$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    TimePickerKt.c(timePickerState, timePickerColors, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void d(final Modifier modifier, final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1261215927);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(timePickerState) : composerImplV.I(timePickerState) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(timePickerColors) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1.f1521a;
                composerImplV.A(objG);
            }
            Shape shapeB = ShapesKt.b(TimePickerTokens.b, composerImplV);
            Intrinsics.f(shapeB, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) shapeB;
            float f2 = (float) 0.0d;
            e(modifier, timePickerState, timePickerColors, (MeasurePolicy) objG, CornerBasedShape.c(cornerBasedShape, null, CornerSizeKt.b(f2), CornerSizeKt.b(f2), null, 9), ShapesKt.a(cornerBasedShape), composerImplV, (i2 & 896) | (i2 & 14) | 3072 | (i2 & 112));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    TimePickerKt.d(modifier, timePickerState, timePickerColors, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void e(final Modifier modifier, final TimePickerState timePickerState, final TimePickerColors timePickerColors, final MeasurePolicy measurePolicy, final Shape shape, final Shape shape2, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1374241901);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(timePickerState) : composerImplV.I(timePickerState) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(timePickerColors) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(measurePolicy) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(shape) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.n(shape2) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f2 = TimePickerTokens.e;
            timePickerColors.getClass();
            BorderStroke borderStrokeA = BorderStrokeKt.a(0L, f2);
            Shape shapeB = ShapesKt.b(TimePickerTokens.b, composerImplV);
            Intrinsics.f(shapeB, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) shapeB;
            final String strA = Strings_androidKt.a(composerImplV, com.woolworths.R.string.m3c_time_picker_period_toggle_description);
            boolean zN = composerImplV.n(strA);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (zN || objG == obj) {
                objG = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj2;
                        SemanticsPropertiesKt.u(semanticsPropertyReceiver);
                        SemanticsPropertiesKt.k(semanticsPropertyReceiver, strA);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            Modifier modifierB = BorderKt.b(SelectableGroupKt.a(SemanticsModifierKt.b(modifier, false, (Function1) objG)), borderStrokeA.f828a, borderStrokeA.b, cornerBasedShape);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicy, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            boolean z = !timePickerState.b();
            int i4 = i2 & 112;
            boolean z2 = i4 == 32 || ((i2 & 64) != 0 && composerImplV.I(timePickerState));
            Object objG2 = composerImplV.G();
            if (z2 || objG2 == obj) {
                objG2 = new Function0<Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$1$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        timePickerState.c(false);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG2);
            }
            int i5 = (i2 << 3) & 7168;
            int i6 = i2;
            g(z, shape, (Function0) objG2, timePickerColors, ComposableSingletons$TimePickerKt.f1426a, composerImplV, ((i2 >> 9) & 112) | 24576 | i5);
            SpacerKt.a(composerImplV, BackgroundKt.b(ZIndexModifierKt.a(LayoutIdKt.b(Modifier.Companion.d, "Spacer"), 2.0f).x0(SizeKt.c), 0L, RectangleShapeKt.f1779a));
            boolean zB = timePickerState.b();
            boolean z3 = i4 == 32 || ((i6 & 64) != 0 && composerImplV.I(timePickerState));
            Object objG3 = composerImplV.G();
            if (z3 || objG3 == obj) {
                objG3 = new Function0<Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$2$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        timePickerState.c(true);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG3);
            }
            g(zB, shape2, (Function0) objG3, timePickerColors, ComposableSingletons$TimePickerKt.b, composerImplV, ((i6 >> 12) & 112) | 24576 | i5);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    TimePickerKt.e(modifier, timePickerState, timePickerColors, measurePolicy, shape, shape2, (Composer) obj2, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void f(final Modifier modifier, final int i, final TimePickerState timePickerState, final int i2, final TimePickerColors timePickerColors, Composer composer, final int i3) {
        int i4;
        final int i5;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1148055889);
        if ((i3 & 6) == 0) {
            i4 = (composerImplV.n(modifier) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 = i;
            i4 |= composerImplV.r(i5) ? 32 : 16;
        } else {
            i5 = i;
        }
        if ((i3 & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= (i3 & 512) == 0 ? composerImplV.n(timePickerState) : composerImplV.I(timePickerState) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerImplV.r(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= composerImplV.n(timePickerColors) ? 16384 : 8192;
        }
        if ((i4 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            boolean z = true;
            boolean z2 = timePickerState.e() == i2;
            final String strA = Strings_androidKt.a(composerImplV, i2 == 0 ? com.woolworths.R.string.m3c_time_picker_hour_selection : com.woolworths.R.string.m3c_time_picker_minute_selection);
            if (z2) {
                timePickerColors.getClass();
            } else {
                timePickerColors.getClass();
            }
            if (z2) {
                timePickerColors.getClass();
            } else {
                timePickerColors.getClass();
            }
            boolean zN = composerImplV.n(strA);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (zN || objG == obj) {
                objG = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj2;
                        SemanticsPropertiesKt.r(semanticsPropertyReceiver, 3);
                        SemanticsPropertiesKt.k(semanticsPropertyReceiver, strA);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            Modifier modifierB = SemanticsModifierKt.b(modifier, true, (Function1) objG);
            Shape shapeB = ShapesKt.b(TimePickerTokens.i, composerImplV);
            boolean z3 = (i4 & 7168) == 2048;
            if ((i4 & 896) != 256 && ((i4 & 512) == 0 || !composerImplV.I(timePickerState))) {
                z = false;
            }
            boolean z4 = z3 | z;
            Object objG2 = composerImplV.G();
            if (z4 || objG2 == obj) {
                objG2 = new Function0<Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        TimePickerState timePickerState2 = timePickerState;
                        int iE = timePickerState2.e();
                        int i6 = i2;
                        if (i6 != iE) {
                            timePickerState2.d(i6);
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG2);
            }
            Function0 function0 = (Function0) objG2;
            final long j = 0;
            composerImpl = composerImplV;
            SurfaceKt.b(z2, function0, modifierB, false, shapeB, 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, null, ComposableLambdaKt.c(-1477282471, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    if ((((Number) obj3).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        boolean f1524a = timePickerState.getF1524a();
                        float f2 = TimePickerKt.f1519a;
                        int i6 = i2 == 1 ? com.woolworths.R.string.m3c_time_picker_minute_suffix : f1524a ? com.woolworths.R.string.m3c_time_picker_hour_24h_suffix : com.woolworths.R.string.m3c_time_picker_hour_suffix;
                        int i7 = i5;
                        Object[] objArr = {Integer.valueOf(i7)};
                        String strA2 = Strings_androidKt.a(composer2, i6);
                        Locale localeB = LocaleListCompat.f(((Configuration) composer2.x(AndroidCompositionLocals_androidKt.f1950a)).getLocales()).b(0);
                        if (localeB == null) {
                            localeB = Locale.getDefault();
                        }
                        Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
                        final String str = String.format(localeB, strA2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierD = ComposedModifierKt.d(composer2, companion);
                        ComposeUiNode.e3.getClass();
                        Function0 function02 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function02);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        boolean zN2 = composer2.n(str);
                        Object objG3 = composer2.G();
                        if (zN2 || objG3 == Composer.Companion.f1624a) {
                            objG3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$3$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    SemanticsPropertiesKt.k((SemanticsPropertyReceiver) obj4, str);
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG3);
                        }
                        TextKt.b(CalendarLocale_jvmKt.a(i7, 6), SemanticsModifierKt.b(companion, false, (Function1) objG3), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131064);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 0, 1992);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    TimePickerKt.f(modifier, i, timePickerState, i2, timePickerColors, (Composer) obj2, RecomposeScopeImplKt.a(i3 | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void g(final boolean z, final Shape shape, final Function0 function0, TimePickerColors timePickerColors, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        Shape shape2;
        Function0 function02;
        TimePickerColors timePickerColors2;
        ComposerImpl composerImplV = composer.v(-1937408098);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            shape2 = shape;
            i2 |= composerImplV.n(shape2) ? 32 : 16;
        } else {
            shape2 = shape;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            function02 = function0;
            i2 |= composerImplV.I(function02) ? 256 : 128;
        } else {
            function02 = function0;
        }
        if ((i & 3072) == 0) {
            timePickerColors2 = timePickerColors;
            i2 |= composerImplV.n(timePickerColors2) ? 2048 : 1024;
        } else {
            timePickerColors2 = timePickerColors;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (z) {
                timePickerColors2.getClass();
            } else {
                timePickerColors2.getClass();
            }
            if (z) {
                timePickerColors2.getClass();
            } else {
                timePickerColors2.getClass();
            }
            Modifier modifierX0 = ZIndexModifierKt.a(Modifier.Companion.d, z ? BitmapDescriptorFactory.HUE_RED : 1.0f).x0(SizeKt.c);
            boolean z2 = (i2 & 14) == 4;
            Object objG = composerImplV.G();
            if (z2 || objG == Composer.Companion.f1624a) {
                objG = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ToggleItem$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        SemanticsPropertiesKt.s((SemanticsPropertyReceiver) obj, z);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            Modifier modifierB = SemanticsModifierKt.b(modifierX0, false, (Function1) objG);
            float f2 = 0;
            ButtonKt.b(function02, modifierB, false, shape2, ButtonDefaults.b(0L, 0L, composerImplV, 12), new PaddingValuesImpl(f2, f2, f2, f2), composableLambdaImpl, composerImplV, ((i2 >> 6) & 14) | 12582912 | ((i2 << 6) & 7168) | ((i2 << 15) & 1879048192), 356);
            composerImplV = composerImplV;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            final TimePickerColors timePickerColors3 = timePickerColors2;
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ToggleItem$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    TimePickerKt.g(z, shape, function0, timePickerColors3, composableLambdaImpl, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void h(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i) {
        int i2;
        boolean z;
        boolean z2;
        ComposerImpl composerImplV = composer.v(2054675515);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(timePickerState) : composerImplV.I(timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(timePickerColors) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.e, Alignment.Companion.j, composerImplV, 6);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            a(timePickerState, timePickerColors, composerImplV, i2 & 126);
            composerImplV.o(-709485014);
            if (timePickerState.getF1524a()) {
                z = true;
                z2 = false;
            } else {
                int i4 = i2;
                z2 = false;
                Modifier modifierJ = PaddingKt.j(companion, g, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                int i5 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierJ);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD, function2);
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                    androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
                }
                Updater.b(composerImplV, modifierD2, function24);
                int i6 = i4 << 3;
                i(SizeKt.r(companion, TimePickerTokens.g, TimePickerTokens.f), timePickerState, timePickerColors, composerImplV, (i6 & 896) | (i6 & 112) | 6);
                z = true;
                composerImplV.V(true);
            }
            composerImplV.V(z2);
            composerImplV.V(z);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$VerticalClockDisplay$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    TimePickerKt.h(timePickerState, timePickerColors, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void i(final Modifier modifier, final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-1898918107);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(timePickerState) : composerImplV.I(timePickerState) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(timePickerColors) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1.f1522a;
                composerImplV.A(objG);
            }
            Shape shapeB = ShapesKt.b(TimePickerTokens.b, composerImplV);
            Intrinsics.f(shapeB, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) shapeB;
            float f2 = (float) 0.0d;
            e(modifier, timePickerState, timePickerColors, (MeasurePolicy) objG, ShapesKt.c(cornerBasedShape), CornerBasedShape.c(cornerBasedShape, CornerSizeKt.b(f2), CornerSizeKt.b(f2), null, null, 12), composerImplV, (i2 & 896) | (i2 & 14) | 3072 | (i2 & 112));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    TimePickerKt.i(modifier, timePickerState, timePickerColors, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void j(final float f2, final int i, Composer composer, final ComposableLambdaImpl composableLambdaImpl, final Modifier modifier) {
        int i2;
        ComposerImpl composerImplV = composer.v(1548175696);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.q(f2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean z = (i2 & 112) == 32;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult c(MeasureScope measureScope, List list, final long j) {
                        LayoutId layoutId;
                        LayoutId layoutId2;
                        Object obj;
                        Object obj2;
                        final float fT1 = measureScope.T1(f2);
                        int i3 = 0;
                        long jA = Constraints.a(j, 0, 0, 0, 0, 10);
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        int i4 = 0;
                        while (true) {
                            layoutId = LayoutId.e;
                            layoutId2 = LayoutId.d;
                            if (i4 >= size) {
                                break;
                            }
                            Object obj3 = list.get(i4);
                            Measurable measurable = (Measurable) obj3;
                            if (LayoutIdKt.a(measurable) != layoutId2 && LayoutIdKt.a(measurable) != layoutId) {
                                arrayList.add(obj3);
                            }
                            i4++;
                        }
                        final ArrayList arrayList2 = new ArrayList(arrayList.size());
                        int size2 = arrayList.size();
                        for (int iF = 0; iF < size2; iF = androidx.camera.core.impl.b.f((Measurable) arrayList.get(iF), jA, arrayList2, iF, 1)) {
                        }
                        int size3 = list.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size3) {
                                obj = null;
                                break;
                            }
                            obj = list.get(i5);
                            if (LayoutIdKt.a((Measurable) obj) == layoutId2) {
                                break;
                            }
                            i5++;
                        }
                        Measurable measurable2 = (Measurable) obj;
                        int size4 = list.size();
                        while (true) {
                            if (i3 >= size4) {
                                obj2 = null;
                                break;
                            }
                            obj2 = list.get(i3);
                            if (LayoutIdKt.a((Measurable) obj2) == layoutId) {
                                break;
                            }
                            i3++;
                        }
                        Measurable measurable3 = (Measurable) obj2;
                        final float size5 = 6.2831855f / arrayList2.size();
                        final Placeable placeableC0 = measurable2 != null ? measurable2.c0(jA) : null;
                        final Placeable placeableC02 = measurable3 != null ? measurable3.c0(jA) : null;
                        return measureScope.L0(Constraints.j(j), Constraints.i(j), EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                long j2;
                                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj4;
                                int i6 = 0;
                                Placeable placeable = placeableC0;
                                if (placeable != null) {
                                    placementScope.e(placeable, 0, 0, BitmapDescriptorFactory.HUE_RED);
                                }
                                ArrayList arrayList3 = arrayList2;
                                int size6 = arrayList3.size();
                                while (true) {
                                    j2 = j;
                                    if (i6 >= size6) {
                                        break;
                                    }
                                    Placeable placeable2 = (Placeable) arrayList3.get(i6);
                                    int iH = (Constraints.h(j2) / 2) - (placeable2.d / 2);
                                    int iG = (Constraints.g(j2) / 2) - (placeable2.e / 2);
                                    double d2 = fT1;
                                    double d3 = (size5 * i6) - 1.5707963267948966d;
                                    placementScope.e(placeable2, MathKt.a((Math.cos(d3) * d2) + iH), MathKt.a((Math.sin(d3) * d2) + iG), BitmapDescriptorFactory.HUE_RED);
                                    i6++;
                                    arrayList3 = arrayList3;
                                }
                                Placeable placeable3 = placeableC02;
                                if (placeable3 != null) {
                                    placementScope.e(placeable3, (Constraints.j(j2) - placeable3.d) / 2, (Constraints.i(j2) - placeable3.e) / 2, BitmapDescriptorFactory.HUE_RED);
                                }
                                return Unit.f24250a;
                            }
                        });
                    }
                };
                composerImplV.A(objG);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objG;
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            int i4 = (((((i2 << 3) & 112) | ((i2 >> 6) & 14)) << 6) & 896) | 6;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicy, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            android.support.v4.media.session.a.y((i4 >> 6) & 14, composableLambdaImpl, composerImplV, true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    TimePickerKt.j(f2, iA, (Composer) obj, composableLambdaImpl, modifier);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void k(final Modifier modifier, final AnalogTimePickerState analogTimePickerState, final int i, final boolean z, Composer composer, final int i2) {
        int i3;
        ComposerImpl composerImplV = composer.v(-206784607);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.n(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.I(analogTimePickerState) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.r(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerImplV.p(z) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
            if (recomposeScopeImplX != null) {
                recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Number) obj2).intValue();
                        TimePickerKt.k(modifier, analogTimePickerState, i, z, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                        return Unit.f24250a;
                    }
                };
                return;
            }
            return;
        }
        float f2 = TimePickerTokens.f1609a;
        TypographyKt.a(TypographyKeyTokens.d, composerImplV);
        ((Density) composerImplV.x(CompositionLocalsKt.h)).T1(e);
        Object objG = composerImplV.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (objG == composer$Companion$Empty$1) {
            objG = SnapshotStateKt.f(new Offset(0L));
            composerImplV.A(objG);
        }
        Object objG2 = composerImplV.G();
        if (objG2 == composer$Companion$Empty$1) {
            objG2 = SnapshotStateKt.f(new IntOffset(0L));
            composerImplV.A(objG2);
        }
        Object objG3 = composerImplV.G();
        if (objG3 == composer$Companion$Empty$1) {
            objG3 = new CompositionScopedCoroutineScopeCanceller(new RememberedCoroutineScope(composerImplV.y()));
            composerImplV.A(objG3);
        }
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objG3).d;
        throw null;
    }

    public static final void l(final Modifier modifier, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(2100674302);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            TextStyle textStyleA = TextStyle.a((TextStyle) composerImplV.x(TextKt.f1518a), 0L, 0L, null, null, 0L, 0L, null, new LineHeightStyle(LineHeightStyle.Alignment.b, 17), 0, 15695871);
            Modifier modifierA = SemanticsModifierKt.a(modifier, TimePickerKt$DisplaySeparator$1.h);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.b(":", null, ColorSchemeKt.d(TimeInputTokens.b, composerImplV), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleA, composerImplV, 6, 0, 65530);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$DisplaySeparator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    TimePickerKt.l(modifier, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m(androidx.compose.material3.AnalogTimePickerState r2, float r3, float r4, float r5, boolean r6, long r7, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            boolean r2 = r9 instanceof androidx.compose.material3.TimePickerKt$onTap$1
            if (r2 == 0) goto L13
            r2 = r9
            androidx.compose.material3.TimePickerKt$onTap$1 r2 = (androidx.compose.material3.TimePickerKt$onTap$1) r2
            int r5 = r2.q
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r6
            if (r0 == 0) goto L13
            int r5 = r5 - r6
            r2.q = r5
            goto L18
        L13:
            androidx.compose.material3.TimePickerKt$onTap$1 r2 = new androidx.compose.material3.TimePickerKt$onTap$1
            r2.<init>(r9)
        L18:
            java.lang.Object r5 = r2.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r2.q
            r6 = 0
            if (r2 == 0) goto L39
            r3 = 1
            if (r2 == r3) goto L35
            r3 = 2
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r5)
            kotlin.Unit r2 = kotlin.Unit.f24250a
            return r2
        L2d:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r3)
            throw r2
        L35:
            kotlin.ResultKt.b(r5)
            throw r6
        L39:
            kotlin.ResultKt.b(r5)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r7
            int r2 = (int) r0
            float r2 = (float) r2
            float r4 = r4 - r2
            r2 = 32
            long r7 = r7 >> r2
            int r2 = (int) r7
            float r2 = (float) r2
            float r3 = r3 - r2
            double r4 = (double) r4
            double r2 = (double) r3
            java.lang.Math.atan2(r4, r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m(androidx.compose.material3.AnalogTimePickerState, float, float, float, boolean, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
