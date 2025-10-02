package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DatePickerKt$DateEntryContainer$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ Modifier h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ DatePickerColors l;
    public final /* synthetic */ TextStyle m;
    public final /* synthetic */ float n;
    public final /* synthetic */ ComposableLambdaImpl o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DateEntryContainer$3(Modifier modifier, Function2 function2, Function2 function22, Function2 function23, DatePickerColors datePickerColors, TextStyle textStyle, float f, ComposableLambdaImpl composableLambdaImpl, int i) {
        super(2);
        this.h = modifier;
        this.i = function2;
        this.j = function22;
        this.k = function23;
        this.l = datePickerColors;
        this.m = textStyle;
        this.n = f;
        this.o = composableLambdaImpl;
        this.p = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        float f;
        ComposableLambdaImpl composableLambdaImpl;
        Modifier modifier;
        Function2 function2;
        Function2 function22;
        DatePickerColors datePickerColors;
        TextStyle textStyle;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.p | 1);
        float f2 = DatePickerKt.f1433a;
        ComposerImpl composerImplV = ((Composer) obj).v(1507356255);
        int i2 = iA & 6;
        Modifier modifier2 = this.h;
        if (i2 == 0) {
            i = (composerImplV.n(modifier2) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i3 = iA & 48;
        final Function2 function23 = this.i;
        if (i3 == 0) {
            i |= composerImplV.I(function23) ? 32 : 16;
        }
        int i4 = iA & KyberEngine.KyberPolyBytes;
        final Function2 function24 = this.j;
        if (i4 == 0) {
            i |= composerImplV.I(function24) ? 256 : 128;
        }
        int i5 = iA & 3072;
        final Function2 function25 = this.k;
        if (i5 == 0) {
            i |= composerImplV.I(function25) ? 2048 : 1024;
        }
        int i6 = iA & 24576;
        final DatePickerColors datePickerColors2 = this.l;
        if (i6 == 0) {
            i |= composerImplV.n(datePickerColors2) ? 16384 : 8192;
        }
        int i7 = 196608 & iA;
        final TextStyle textStyle2 = this.m;
        if (i7 == 0) {
            i |= composerImplV.n(textStyle2) ? 131072 : 65536;
        }
        int i8 = 1572864 & iA;
        float f3 = this.n;
        if (i8 == 0) {
            i |= composerImplV.q(f3) ? 1048576 : 524288;
        }
        int i9 = 12582912 & iA;
        ComposableLambdaImpl composableLambdaImpl2 = this.o;
        if (i9 == 0) {
            i |= composerImplV.I(composableLambdaImpl2) ? 8388608 : 4194304;
        }
        if ((4793491 & i) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            modifier = modifier2;
            f = f3;
            composableLambdaImpl = composableLambdaImpl2;
            textStyle = textStyle2;
            datePickerColors = datePickerColors2;
            function22 = function25;
            function2 = function24;
        } else {
            f = f3;
            composableLambdaImpl = composableLambdaImpl2;
            modifier = modifier2;
            Modifier modifierB = SemanticsModifierKt.b(SizeKt.t(modifier2, DatePickerModalTokens.b, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), false, DatePickerKt$DateEntryContainer$1.h);
            datePickerColors2.getClass();
            Modifier modifierB2 = BackgroundKt.b(modifierB, 0L, RectangleShapeKt.f1779a);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i10 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB2);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function26 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i10))) {
                androidx.camera.core.impl.b.B(i10, composerImplV, i10, function26);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Function2<Composer, Integer, Unit> function27 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Composer composer = (Composer) obj3;
                    if ((((Number) obj4).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierE = SizeKt.e(companion, 1.0f);
                        ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer, 0);
                        int p = composer.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer, modifierE);
                        ComposeUiNode.e3.getClass();
                        Function0 function02 = ComposeUiNode.Companion.b;
                        if (composer.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer.i();
                        if (composer.getO()) {
                            composer.K(function02);
                        } else {
                            composer.e();
                        }
                        Function2 function28 = ComposeUiNode.Companion.g;
                        Updater.b(composer, columnMeasurePolicyA2, function28);
                        Function2 function29 = ComposeUiNode.Companion.f;
                        Updater.b(composer, persistentCompositionLocalMapD, function29);
                        Function2 function210 = ComposeUiNode.Companion.j;
                        if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer, p, function210);
                        }
                        Function2 function211 = ComposeUiNode.Companion.d;
                        Updater.b(composer, modifierD2, function211);
                        final Function2 function212 = function24;
                        Function2 function213 = function25;
                        Arrangement.Horizontal horizontal = (function212 == null || function213 == null) ? function212 != null ? Arrangement.f934a : Arrangement.b : Arrangement.g;
                        Modifier modifierE2 = SizeKt.e(companion, 1.0f);
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(horizontal, Alignment.Companion.k, composer, 48);
                        int p2 = composer.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer.d();
                        Modifier modifierD3 = ComposedModifierKt.d(composer, modifierE2);
                        if (composer.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer.i();
                        if (composer.getO()) {
                            composer.K(function02);
                        } else {
                            composer.e();
                        }
                        Updater.b(composer, rowMeasurePolicyA, function28);
                        Updater.b(composer, persistentCompositionLocalMapD2, function29);
                        if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p2))) {
                            androidx.camera.core.impl.b.z(p2, composer, p2, function210);
                        }
                        Updater.b(composer, modifierD3, function211);
                        composer.o(-1287344744);
                        if (function212 != null) {
                            TextKt.a(textStyle2, ComposableLambdaKt.c(-962031352, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$2$1$1$1$1
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj5, Object obj6) {
                                    Composer composer2 = (Composer) obj5;
                                    if ((((Number) obj6).intValue() & 3) == 2 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        Modifier modifierA = RowScopeInstance.f974a.a(Modifier.Companion.d, 1.0f, true);
                                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                                        int p3 = composer2.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer2.d();
                                        Modifier modifierD4 = ComposedModifierKt.d(composer2, modifierA);
                                        ComposeUiNode.e3.getClass();
                                        Function0 function03 = ComposeUiNode.Companion.b;
                                        if (composer2.w() == null) {
                                            ComposablesKt.b();
                                            throw null;
                                        }
                                        composer2.i();
                                        if (composer2.getO()) {
                                            composer2.K(function03);
                                        } else {
                                            composer2.e();
                                        }
                                        Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                                        Updater.b(composer2, persistentCompositionLocalMapD3, ComposeUiNode.Companion.f);
                                        Function2 function214 = ComposeUiNode.Companion.j;
                                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p3))) {
                                            androidx.camera.core.impl.b.z(p3, composer2, p3, function214);
                                        }
                                        Updater.b(composer2, modifierD4, ComposeUiNode.Companion.d);
                                        androidx.camera.core.impl.b.A(0, composer2, function212);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer), composer, 48);
                        }
                        composer.l();
                        composer.o(-1287336668);
                        if (function213 != null) {
                            function213.invoke(composer, 0);
                        }
                        composer.l();
                        composer.f();
                        composer.o(1995137078);
                        if (function23 != null || function212 != null || function213 != null) {
                            datePickerColors2.getClass();
                            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 3, 0L, composer, null);
                        }
                        composer.l();
                        composer.f();
                    }
                    return Unit.f24250a;
                }
            };
            function2 = function24;
            function22 = function25;
            datePickerColors = datePickerColors2;
            textStyle = textStyle2;
            DatePickerKt.a(function23, 0L, 0L, f, ComposableLambdaKt.c(-229007058, function27, composerImplV), composerImplV, (i & 112) | 196614 | (57344 & (i >> 6)));
            android.support.v4.media.session.a.y((i >> 21) & 14, composableLambdaImpl, composerImplV, true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            Modifier modifier3 = modifier;
            recomposeScopeImplX.d = new DatePickerKt$DateEntryContainer$3(modifier3, function23, function2, function22, datePickerColors, textStyle, f, composableLambdaImpl, iA);
        }
        return Unit.f24250a;
    }
}
