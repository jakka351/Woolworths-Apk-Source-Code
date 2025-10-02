package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextFieldKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1516a = 8;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v37 */
    public static final void a(Function2 function2, final Function2 function22, Function3 function3, final Function2 function23, final Function2 function24, final Function2 function25, final Function2 function26, final boolean z, float f, final ComposableLambdaImpl composableLambdaImpl, Function2 function27, PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        final PaddingValues paddingValues2;
        LayoutDirection layoutDirection;
        Function2 function28;
        float f2;
        float f3;
        Function3 function32;
        Function2 function29;
        boolean z2;
        Function3 function33;
        Function2 function210;
        ComposerImpl composerImplV = composer.v(-1830307184);
        int i5 = i & 6;
        Modifier.Companion companion = Modifier.Companion.d;
        if (i5 == 0) {
            i3 = i | (composerImplV.n(companion) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.I(function2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(function22) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerImplV.I(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerImplV.I(function23) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerImplV.I(function24) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerImplV.I(function25) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerImplV.I(function26) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= composerImplV.p(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerImplV.q(f) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerImplV.I(composableLambdaImpl) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerImplV.I(function27) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            paddingValues2 = paddingValues;
            i4 |= composerImplV.n(paddingValues2) ? 256 : 128;
        } else {
            paddingValues2 = paddingValues;
        }
        int i6 = i4;
        if ((i3 & 306783379) == 306783378 && (i6 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            function29 = function27;
            function210 = function2;
            function33 = function3;
            f3 = f;
        } else {
            boolean z3 = ((i3 & 234881024) == 67108864) | ((i3 & 1879048192) == 536870912) | ((i6 & 896) == 256);
            Object objG = composerImplV.G();
            if (z3 || objG == Composer.Companion.f1624a) {
                objG = new TextFieldMeasurePolicy(z, f, paddingValues2);
                composerImplV.A(objG);
            }
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) objG;
            LayoutDirection layoutDirection2 = (LayoutDirection) composerImplV.x(CompositionLocalsKt.n);
            int i7 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function211 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, textFieldMeasurePolicy, function211);
            Function2 function212 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function212);
            Function2 function213 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                androidx.camera.core.impl.b.B(i7, composerImplV, i7, function213);
            }
            Function2 function214 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function214);
            composableLambdaImpl.invoke(composerImplV, Integer.valueOf(i6 & 14));
            composerImplV.o(1341517187);
            BiasAlignment biasAlignment = Alignment.Companion.e;
            if (function23 != null) {
                Modifier modifierX0 = LayoutIdKt.b(companion, "Leading").x0(TextFieldImplKt.i);
                MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
                int i8 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierX0);
                composerImplV.i();
                layoutDirection = layoutDirection2;
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD, function211);
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, function212);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                    androidx.camera.core.impl.b.B(i8, composerImplV, i8, function213);
                }
                Updater.b(composerImplV, modifierD2, function214);
                android.support.v4.media.session.a.z((i3 >> 12) & 14, function23, composerImplV, true);
            } else {
                layoutDirection = layoutDirection2;
            }
            ?? r9 = 0;
            composerImplV.V(false);
            composerImplV.o(1341526310);
            if (function24 != null) {
                Modifier modifierX02 = LayoutIdKt.b(companion, "Trailing").x0(TextFieldImplKt.i);
                MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
                int i9 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
                Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierX02);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD2, function211);
                Updater.b(composerImplV, persistentCompositionLocalMapQ3, function212);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i9))) {
                    androidx.camera.core.impl.b.B(i9, composerImplV, i9, function213);
                }
                Updater.b(composerImplV, modifierD3, function214);
                android.support.v4.media.session.a.z((i3 >> 15) & 14, function24, composerImplV, true);
                r9 = 0;
            }
            composerImplV.V(r9);
            LayoutDirection layoutDirection3 = layoutDirection;
            float fD = PaddingKt.d(paddingValues2, layoutDirection3);
            float fC = PaddingKt.c(paddingValues2, layoutDirection3);
            if (function23 != null) {
                fD -= TextFieldImplKt.c;
                float f4 = (float) r9;
                if (fD < f4) {
                    fD = f4;
                }
            }
            float f5 = fD;
            if (function24 != null) {
                fC -= TextFieldImplKt.c;
                float f6 = (float) r9;
                if (fC < f6) {
                    fC = f6;
                }
            }
            composerImplV.o(1341556924);
            BiasAlignment biasAlignment2 = Alignment.Companion.f1719a;
            if (function25 != null) {
                Modifier modifierJ = PaddingKt.j(SizeKt.x(SizeKt.i(LayoutIdKt.b(companion, "Prefix"), TextFieldImplKt.f, BitmapDescriptorFactory.HUE_RED, 2), Alignment.Companion.k, false), f5, BitmapDescriptorFactory.HUE_RED, TextFieldImplKt.e, BitmapDescriptorFactory.HUE_RED, 10);
                MeasurePolicy measurePolicyD3 = BoxKt.d(biasAlignment2, false);
                int i10 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImplV.Q();
                Modifier modifierD4 = ComposedModifierKt.d(composerImplV, modifierJ);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD3, function211);
                Updater.b(composerImplV, persistentCompositionLocalMapQ4, function212);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i10))) {
                    androidx.camera.core.impl.b.B(i10, composerImplV, i10, function213);
                }
                Updater.b(composerImplV, modifierD4, function214);
                function28 = function25;
                android.support.v4.media.session.a.z((i3 >> 18) & 14, function28, composerImplV, true);
            } else {
                function28 = function25;
            }
            composerImplV.V(false);
            composerImplV.o(1341568890);
            if (function26 != null) {
                float f7 = fC;
                Modifier modifierJ2 = PaddingKt.j(SizeKt.x(SizeKt.i(LayoutIdKt.b(companion, "Suffix"), TextFieldImplKt.f, BitmapDescriptorFactory.HUE_RED, 2), Alignment.Companion.k, false), TextFieldImplKt.e, BitmapDescriptorFactory.HUE_RED, f7, BitmapDescriptorFactory.HUE_RED, 10);
                f2 = f7;
                MeasurePolicy measurePolicyD4 = BoxKt.d(biasAlignment2, false);
                int i11 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ5 = composerImplV.Q();
                Modifier modifierD5 = ComposedModifierKt.d(composerImplV, modifierJ2);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD4, function211);
                Updater.b(composerImplV, persistentCompositionLocalMapQ5, function212);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i11))) {
                    androidx.camera.core.impl.b.B(i11, composerImplV, i11, function213);
                }
                Updater.b(composerImplV, modifierD5, function214);
                android.support.v4.media.session.a.z((i3 >> 21) & 14, function26, composerImplV, true);
            } else {
                f2 = fC;
            }
            composerImplV.V(false);
            composerImplV.o(1341581092);
            if (function22 != null) {
                f3 = f;
                Modifier modifierJ3 = PaddingKt.j(SizeKt.x(SizeKt.i(LayoutIdKt.b(companion, "Label"), MathHelpersKt.b(TextFieldImplKt.f, TextFieldImplKt.g, f3), BitmapDescriptorFactory.HUE_RED, 2), Alignment.Companion.k, false), f5, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, 10);
                MeasurePolicy measurePolicyD5 = BoxKt.d(biasAlignment2, false);
                int i12 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ6 = composerImplV.Q();
                Modifier modifierD6 = ComposedModifierKt.d(composerImplV, modifierJ3);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD5, function211);
                Updater.b(composerImplV, persistentCompositionLocalMapQ6, function212);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i12))) {
                    androidx.camera.core.impl.b.B(i12, composerImplV, i12, function213);
                }
                Updater.b(composerImplV, modifierD6, function214);
                android.support.v4.media.session.a.z((i3 >> 6) & 14, function22, composerImplV, true);
            } else {
                f3 = f;
            }
            composerImplV.V(false);
            Modifier modifierJ4 = PaddingKt.j(SizeKt.x(SizeKt.i(companion, TextFieldImplKt.f, BitmapDescriptorFactory.HUE_RED, 2), Alignment.Companion.k, false), function28 == null ? f5 : 0, BitmapDescriptorFactory.HUE_RED, function26 == null ? f2 : 0, BitmapDescriptorFactory.HUE_RED, 10);
            composerImplV.o(1341611627);
            if (function3 != null) {
                Function3 function34 = function3;
                function34.invoke(LayoutIdKt.b(companion, "Hint").x0(modifierJ4), composerImplV, Integer.valueOf((i3 >> 6) & 112));
                function32 = function34;
            } else {
                function32 = function3;
            }
            composerImplV.V(false);
            Modifier modifierX03 = LayoutIdKt.b(companion, "TextField").x0(modifierJ4);
            MeasurePolicy measurePolicyD6 = BoxKt.d(biasAlignment2, true);
            int i13 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ7 = composerImplV.Q();
            Modifier modifierD7 = ComposedModifierKt.d(composerImplV, modifierX03);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD6, function211);
            Updater.b(composerImplV, persistentCompositionLocalMapQ7, function212);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i13))) {
                androidx.camera.core.impl.b.B(i13, composerImplV, i13, function213);
            }
            Updater.b(composerImplV, modifierD7, function214);
            Function2 function215 = function2;
            function215.invoke(composerImplV, Integer.valueOf((i3 >> 3) & 14));
            composerImplV.V(true);
            composerImplV.o(1341622624);
            if (function27 != null) {
                Modifier modifierE = PaddingKt.e(SizeKt.x(SizeKt.i(LayoutIdKt.b(companion, "Supporting"), TextFieldImplKt.h, BitmapDescriptorFactory.HUE_RED, 2), Alignment.Companion.k, false), TextFieldDefaults.b());
                MeasurePolicy measurePolicyD7 = BoxKt.d(biasAlignment2, false);
                int i14 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ8 = composerImplV.Q();
                Modifier modifierD8 = ComposedModifierKt.d(composerImplV, modifierE);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD7, function211);
                Updater.b(composerImplV, persistentCompositionLocalMapQ8, function212);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i14))) {
                    androidx.camera.core.impl.b.B(i14, composerImplV, i14, function213);
                }
                Updater.b(composerImplV, modifierD8, function214);
                function29 = function27;
                z2 = true;
                android.support.v4.media.session.a.z((i6 >> 3) & 14, function29, composerImplV, true);
            } else {
                function29 = function27;
                z2 = true;
            }
            composerImplV.V(false);
            composerImplV.V(z2);
            function210 = function215;
            function33 = function32;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            final Function2 function216 = function210;
            final Function3 function35 = function33;
            final float f8 = f3;
            final Function2 function217 = function29;
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextFieldLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    TextFieldKt.a(function216, function22, function35, function23, function24, function25, function26, z, f8, composableLambdaImpl, function217, paddingValues2, (Composer) obj, iA, iA2);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final int b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, long j, float f2, PaddingValues paddingValues) {
        boolean z = i2 > 0;
        float d = (paddingValues.getD() + paddingValues.getB()) * f2;
        if (z) {
            d = MathHelpersKt.b(TextFieldImplKt.b * 2 * f2, d, f);
        }
        return Math.max(Constraints.i(j), Math.max(i3, Math.max(i4, MathKt.b(d + MathHelpersKt.c(f, 0, i2) + ComparisonsKt.c(i, i7, i5, i6, MathHelpersKt.c(f, i2, 0))))) + i8);
    }

    public static final int c(boolean z, int i, int i2, Placeable placeable) {
        return z ? Alignment.Companion.k.a(placeable.e, i) : i2;
    }
}
