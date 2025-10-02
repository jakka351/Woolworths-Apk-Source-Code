package androidx.compose.material;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.util.MathHelpersKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OutlinedTextFieldKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1306a = 4;
    public static final long b = TextUnitKt.c(8);

    /* JADX WARN: Removed duplicated region for block: B:101:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final androidx.compose.ui.text.input.TextFieldValue r63, final kotlin.jvm.functions.Function1 r64, final androidx.compose.ui.Modifier r65, boolean r66, boolean r67, final androidx.compose.ui.text.TextStyle r68, kotlin.jvm.functions.Function2 r69, final kotlin.jvm.functions.Function2 r70, kotlin.jvm.functions.Function2 r71, kotlin.jvm.functions.Function2 r72, final boolean r73, androidx.compose.ui.text.input.VisualTransformation r74, final androidx.compose.foundation.text.KeyboardOptions r75, final androidx.compose.foundation.text.KeyboardActions r76, final boolean r77, int r78, int r79, androidx.compose.foundation.interaction.MutableInteractionSource r80, final androidx.compose.ui.graphics.Shape r81, final androidx.compose.material.TextFieldColors r82, androidx.compose.runtime.Composer r83, final int r84, final int r85, final int r86) {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.a(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:305:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.lang.String r47, final kotlin.jvm.functions.Function1 r48, final androidx.compose.ui.Modifier r49, boolean r50, boolean r51, androidx.compose.ui.text.TextStyle r52, kotlin.jvm.functions.Function2 r53, kotlin.jvm.functions.Function2 r54, kotlin.jvm.functions.Function2 r55, kotlin.jvm.functions.Function2 r56, boolean r57, androidx.compose.ui.text.input.VisualTransformation r58, androidx.compose.foundation.text.KeyboardOptions r59, androidx.compose.foundation.text.KeyboardActions r60, boolean r61, int r62, int r63, androidx.compose.foundation.interaction.MutableInteractionSource r64, androidx.compose.ui.graphics.Shape r65, androidx.compose.material.TextFieldColors r66, androidx.compose.runtime.Composer r67, final int r68, final int r69, final int r70) {
        /*
            Method dump skipped, instructions count: 1355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.b(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [int] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v24 */
    public static final void c(final Modifier modifier, Function2 function2, Function3 function3, Function2 function22, final Function2 function23, final Function2 function24, final boolean z, final float f, final Function1 function1, final ComposableLambdaImpl composableLambdaImpl, PaddingValues paddingValues, Composer composer, final int i) {
        int i2;
        Function2 function25;
        Function3 function32;
        final Function2 function26;
        boolean z2;
        ?? r14;
        Function3 function33;
        Function2 function27;
        boolean z3;
        Function2 function28 = function22;
        final PaddingValues paddingValues2 = paddingValues;
        ComposerImpl composerImplV = composer.v(-2049536174);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function28) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function23) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(function24) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.p(z) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.q(f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerImplV.I(function1) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 536870912 : 268435456;
        }
        char c = composerImplV.n(paddingValues2) ? (char) 4 : (char) 2;
        int i3 = i2;
        if (composerImplV.z(i3 & 1, ((i2 & 306783379) == 306783378 && (c & 3) == 2) ? false : true)) {
            boolean z4 = ((i3 & 234881024) == 67108864) | ((i3 & 3670016) == 1048576) | ((i3 & 29360128) == 8388608) | ((c & 14) == 4);
            Object objG = composerImplV.G();
            if (z4 || objG == Composer.Companion.f1624a) {
                objG = new OutlinedTextFieldMeasurePolicy(function1, z, f, paddingValues2);
                composerImplV.A(objG);
            }
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) objG;
            LayoutDirection layoutDirection = (LayoutDirection) composerImplV.x(CompositionLocalsKt.n);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function29 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, outlinedTextFieldMeasurePolicy, function29);
            Function2 function210 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function210);
            Function2 function211 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                b.B(i4, composerImplV, i4, function211);
            }
            Function2 function212 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function212);
            composableLambdaImpl.invoke(composerImplV, Integer.valueOf((i3 >> 27) & 14));
            Modifier.Companion companion = Modifier.Companion.d;
            BiasAlignment biasAlignment = Alignment.Companion.e;
            if (function23 != null) {
                composerImplV.o(-978132235);
                Modifier modifierB = LayoutIdKt.b(companion, "Leading");
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = InteractiveComponentSizeKt.f1291a;
                Modifier modifierX0 = modifierB.x0(MinimumInteractiveModifier.d);
                MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
                int i5 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierX0);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD, function29);
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, function210);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                    b.B(i5, composerImplV, i5, function211);
                }
                Updater.b(composerImplV, modifierD2, function212);
                function23.invoke(composerImplV, Integer.valueOf((i3 >> 12) & 14));
                composerImplV.V(true);
                z2 = false;
                composerImplV.V(false);
            } else {
                z2 = false;
                composerImplV.o(-977887180);
                composerImplV.V(false);
            }
            if (function24 != null) {
                composerImplV.o(-977844493);
                Modifier modifierB2 = LayoutIdKt.b(companion, "Trailing");
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = InteractiveComponentSizeKt.f1291a;
                Modifier modifierX02 = modifierB2.x0(MinimumInteractiveModifier.d);
                MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, z2);
                int i6 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
                Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierX02);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD2, function29);
                Updater.b(composerImplV, persistentCompositionLocalMapQ3, function210);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                    b.B(i6, composerImplV, i6, function211);
                }
                Updater.b(composerImplV, modifierD3, function212);
                function24.invoke(composerImplV, Integer.valueOf((i3 >> 15) & 14));
                composerImplV.V(true);
                r14 = 0;
                composerImplV.V(false);
            } else {
                composerImplV.o(-977597516);
                composerImplV.V(z2);
                r14 = z2;
            }
            paddingValues2 = paddingValues;
            float fD = PaddingKt.d(paddingValues2, layoutDirection);
            float fC = PaddingKt.c(paddingValues2, layoutDirection);
            if (function23 != null) {
                fD -= TextFieldImplKt.b;
                float f2 = (float) r14;
                if (fD < f2) {
                    fD = f2;
                }
            }
            float f3 = fD;
            if (function24 != null) {
                fC -= TextFieldImplKt.b;
                float f4 = (float) r14;
                if (fC < f4) {
                    fC = f4;
                }
            }
            Modifier modifierJ = PaddingKt.j(companion, f3, BitmapDescriptorFactory.HUE_RED, fC, BitmapDescriptorFactory.HUE_RED, 10);
            if (function3 != null) {
                composerImplV.o(-976746535);
                Function3 function34 = function3;
                function34.invoke(LayoutIdKt.b(companion, "Hint").x0(modifierJ), composerImplV, Integer.valueOf((i3 >> 3) & 112));
                composerImplV.V(false);
                function33 = function34;
            } else {
                function33 = function3;
                composerImplV.o(-976659084);
                composerImplV.V(false);
            }
            Modifier modifierX03 = LayoutIdKt.b(companion, "TextField").x0(modifierJ);
            BiasAlignment biasAlignment2 = Alignment.Companion.f1719a;
            MeasurePolicy measurePolicyD3 = BoxKt.d(biasAlignment2, true);
            int i7 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImplV.Q();
            Modifier modifierD4 = ComposedModifierKt.d(composerImplV, modifierX03);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD3, function29);
            Updater.b(composerImplV, persistentCompositionLocalMapQ4, function210);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                b.B(i7, composerImplV, i7, function211);
            }
            Updater.b(composerImplV, modifierD4, function212);
            function25 = function2;
            a.z((i3 >> 3) & 14, function25, composerImplV, true);
            if (function22 != null) {
                composerImplV.o(-976429250);
                Modifier modifierB3 = LayoutIdKt.b(companion, "Label");
                MeasurePolicy measurePolicyD4 = BoxKt.d(biasAlignment2, false);
                int i8 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ5 = composerImplV.Q();
                Modifier modifierD5 = ComposedModifierKt.d(composerImplV, modifierB3);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD4, function29);
                Updater.b(composerImplV, persistentCompositionLocalMapQ5, function210);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                    b.B(i8, composerImplV, i8, function211);
                }
                Updater.b(composerImplV, modifierD5, function212);
                Function2 function213 = function22;
                function213.invoke(composerImplV, Integer.valueOf((i3 >> 9) & 14));
                z3 = true;
                composerImplV.V(true);
                composerImplV.V(false);
                function27 = function213;
            } else {
                function27 = function22;
                z3 = true;
                composerImplV.o(-976346604);
                composerImplV.V(false);
            }
            composerImplV.V(z3);
            function26 = function27;
            function32 = function33;
        } else {
            function25 = function2;
            function32 = function3;
            composerImplV.j();
            function26 = function28;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            final Function2 function214 = function25;
            final Function3 function35 = function32;
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextFieldLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    OutlinedTextFieldKt.c(modifier, function214, function35, function26, function23, function24, z, f, function1, composableLambdaImpl, paddingValues2, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final int d(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, PaddingValues paddingValues) {
        int iMax = Math.max(i3, Math.max(i5, MathHelpersKt.c(f, i4, 0)));
        float b2 = paddingValues.getB() * f2;
        return ConstraintsKt.f(Math.max(i, Math.max(i2, MathKt.b(MathHelpersKt.b(b2, Math.max(b2, i4 / 2.0f), f) + iMax + (paddingValues.getD() * f2)))), j);
    }

    public static final int e(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, PaddingValues paddingValues) {
        int iMax = Math.max(i3, Math.max(MathHelpersKt.c(f, i4, 0), i5)) + i + i2;
        LayoutDirection layoutDirection = LayoutDirection.d;
        return ConstraintsKt.g(Math.max(iMax, MathKt.b((i4 + ((paddingValues.c(layoutDirection) + paddingValues.b(layoutDirection)) * f2)) * f)), j);
    }
}
