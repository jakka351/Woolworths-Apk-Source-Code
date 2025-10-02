package au.com.woolworths.design.core.ui.component.stable.button.internal;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.InteractiveComponentSizeKt;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.material3.RippleKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import au.com.woolworths.design.core.ui.foundation.color.ContentColorKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "isPressed", "ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ButtonImplKt {
    public static final void a(final String str, final Function0 onClick, final Function2 function2, final Function2 function22, final ButtonSpec.Variant variant, final Color color, final Color color2, final BorderStroke borderStroke, final Modifier modifier, boolean z, final ButtonSpec.Size size, final Function2 function23, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function2 function24;
        Function2 function25;
        boolean z2;
        int i5;
        MutableInteractionSource mutableInteractionSource;
        int i6;
        long jB;
        long j;
        long jC;
        BorderStroke borderStroke2;
        boolean z3;
        Modifier modifierA;
        final boolean z4;
        Intrinsics.h(onClick, "onClick");
        Intrinsics.h(variant, "variant");
        ComposerImpl composerImplV = composer.v(2031179316);
        if ((i & 6) == 0) {
            i4 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= composerImplV.I(onClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            function24 = function2;
            i4 |= composerImplV.I(function24) ? 256 : 128;
        } else {
            function24 = function2;
        }
        if ((i & 3072) == 0) {
            function25 = function22;
            i4 |= composerImplV.I(function25) ? 2048 : 1024;
        } else {
            function25 = function22;
        }
        if ((i & 24576) == 0) {
            i4 |= (32768 & i) == 0 ? composerImplV.n(variant) : composerImplV.I(variant) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= composerImplV.n(color) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= composerImplV.n(color2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= composerImplV.n(borderStroke) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= composerImplV.n(modifier) ? 67108864 : 33554432;
        }
        int i7 = i3 & 512;
        if (i7 != 0) {
            i4 |= 805306368;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 805306368) == 0) {
                i4 |= composerImplV.p(z2) ? 536870912 : 268435456;
            }
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (composerImplV.r(size == null ? -1 : size.ordinal()) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= composerImplV.I(function23) ? 32 : 16;
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            z4 = z2;
        } else {
            if (i7 != 0) {
                z2 = true;
            }
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = InteractionSourceKt.a();
                composerImplV.A(objG);
            }
            MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objG;
            composerImplV.V(false);
            MutableState mutableStateA = PressInteractionKt.a(mutableInteractionSource2, composerImplV);
            composerImplV.o(2048190893);
            if (color == null) {
                i6 = i4;
                mutableInteractionSource = mutableInteractionSource2;
                jB = variant.b(((Boolean) mutableStateA.getD()).booleanValue(), composerImplV);
            } else {
                mutableInteractionSource = mutableInteractionSource2;
                i6 = i4;
                jB = color.f1766a;
            }
            composerImplV.V(false);
            composerImplV.o(2048193737);
            if (color2 == null) {
                j = jB;
                jC = variant.c(((Boolean) mutableStateA.getD()).booleanValue(), composerImplV);
            } else {
                j = jB;
                jC = color2.f1766a;
            }
            composerImplV.V(false);
            composerImplV.o(2048196253);
            BorderStroke borderStrokeA = borderStroke == null ? variant.a(((Boolean) mutableStateA.getD()).booleanValue(), composerImplV) : borderStroke;
            composerImplV.V(false);
            composerImplV.o(2048206810);
            if (str == null) {
                borderStroke2 = borderStrokeA;
                modifierA = null;
                z3 = false;
            } else {
                composerImplV.o(-1633490746);
                borderStroke2 = borderStrokeA;
                boolean zN = composerImplV.n(str) | ((i6 & 112) == 32);
                Object objG2 = composerImplV.G();
                if (zN || objG2 == composer$Companion$Empty$1) {
                    objG2 = new d(0, str, onClick);
                    composerImplV.A(objG2);
                }
                z3 = false;
                composerImplV.V(false);
                modifierA = SemanticsModifierKt.a(modifier, (Function1) objG2);
            }
            composerImplV.V(z3);
            Modifier modifier2 = modifierA == null ? modifier : modifierA;
            int i8 = i6 >> 3;
            Function2 function26 = function24;
            boolean z5 = z2;
            b(onClick, function26, function25, j, jC, borderStroke2, modifier2, z5, size, mutableInteractionSource, function23, composerImplV, (i8 & 896) | (i8 & 14) | 805306368 | (i8 & 112) | (29360128 & (i6 >> 6)) | ((i5 << 24) & 234881024), (i5 >> 3) & 14);
            z4 = z5;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.design.core.ui.component.stable.button.internal.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    ButtonImplKt.a(str, onClick, function2, function22, variant, color, color2, borderStroke, modifier, z4, size, function23, (Composer) obj, iA, iA2, i3);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final Function0 onClick, final Function2 function2, final Function2 function22, final long j, final long j2, final BorderStroke borderStroke, final Modifier modifier, final boolean z, final ButtonSpec.Size size, final MutableInteractionSource mutableInteractionSource, final Function2 function23, Composer composer, final int i, final int i2) {
        int i3;
        BorderStroke borderStroke2;
        Modifier modifier2;
        int i4;
        PaddingValuesImpl paddingValuesImpl;
        ComposerImpl composerImpl;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(747894225);
        if ((i & 6) == 0) {
            i3 = (composerImplV.I(onClick) ? 4 : 2) | i;
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
            i3 |= composerImplV.s(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerImplV.s(j2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            borderStroke2 = borderStroke;
            i3 |= composerImplV.n(borderStroke2) ? 131072 : 65536;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((1572864 & i) == 0) {
            modifier2 = modifier;
            i3 |= composerImplV.n(modifier2) ? 1048576 : 524288;
        } else {
            modifier2 = modifier;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerImplV.p(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerImplV.r(size == null ? -1 : size.ordinal()) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= composerImplV.n(mutableInteractionSource) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerImplV.I(function23) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            if (function2 != null && function22 != null) {
                throw new IllegalArgumentException("Adding both leading icon and trailing icon is unsupported.");
            }
            boolean z2 = function23 == null && function22 != null;
            if (z2) {
                float f = size.f;
                paddingValuesImpl = new PaddingValuesImpl(f, f, f, f);
            } else {
                float f2 = ButtonSpec.Tokens.b;
                float f3 = size.f;
                paddingValuesImpl = new PaddingValuesImpl(f2, f3, f2, f3);
            }
            final PaddingValuesImpl paddingValuesImpl2 = paddingValuesImpl;
            float f4 = size.e;
            Modifier modifierT = SizeKt.t(modifier2, f4, f4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = InteractiveComponentSizeKt.f1454a;
            Modifier modifierX0 = modifierT.x0(MinimumInteractiveModifier.d);
            float f5 = ButtonSpec.Tokens.f4749a;
            Modifier modifierA = ClipKt.a(modifierX0, RoundedCornerShapeKt.b(f5));
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = RippleKt.f1479a;
            Modifier modifierB = ClickableKt.b(modifierA, mutableInteractionSource, RippleKt.a(true, Float.NaN, Color.k), z, null, new Role(0), onClick, 8);
            RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(f5);
            final boolean z3 = z2;
            ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(786914581, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.button.internal.ButtonImplKt$ButtonImpl$8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ProvidedValue providedValueG = androidx.camera.core.impl.b.g(j2, ContentColorKt.f4780a);
                        final Function2 function24 = function22;
                        final boolean z4 = z3;
                        final PaddingValuesImpl paddingValuesImpl3 = paddingValuesImpl2;
                        final Function2 function25 = function2;
                        final Function2 function26 = function23;
                        CompositionLocalKt.a(providedValueG, ComposableLambdaKt.c(-1179754027, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.button.internal.ButtonImplKt$ButtonImpl$8.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    Modifier.Companion companion = Modifier.Companion.d;
                                    Modifier modifierZ = SizeKt.z(companion, null, 3);
                                    MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                                    int p = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                    Modifier modifierD = ComposedModifierKt.d(composer3, modifierZ);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function0 = ComposeUiNode.Companion.b;
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function0);
                                    } else {
                                        composer3.e();
                                    }
                                    Function2 function27 = ComposeUiNode.Companion.g;
                                    Updater.b(composer3, measurePolicyD, function27);
                                    Function2 function28 = ComposeUiNode.Companion.f;
                                    Updater.b(composer3, persistentCompositionLocalMapD, function28);
                                    Function2 function29 = ComposeUiNode.Companion.j;
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                        androidx.camera.core.impl.b.z(p, composer3, p, function29);
                                    }
                                    Function2 function210 = ComposeUiNode.Companion.d;
                                    Updater.b(composer3, modifierD, function210);
                                    Modifier modifierE = PaddingKt.e(companion, paddingValuesImpl3);
                                    RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.e, Alignment.Companion.k, composer3, 54);
                                    int p2 = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer3.d();
                                    Modifier modifierD2 = ComposedModifierKt.d(composer3, modifierE);
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function0);
                                    } else {
                                        composer3.e();
                                    }
                                    Updater.b(composer3, rowMeasurePolicyA, function27);
                                    Updater.b(composer3, persistentCompositionLocalMapD2, function28);
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p2))) {
                                        androidx.camera.core.impl.b.z(p2, composer3, p2, function29);
                                    }
                                    Updater.b(composer3, modifierD2, function210);
                                    composer3.o(32604917);
                                    Function2 function211 = function25;
                                    if (function211 != null) {
                                        function211.invoke(composer3, 0);
                                        SpacerKt.a(composer3, SizeKt.u(companion, ButtonSpec.Tokens.e));
                                    }
                                    composer3.l();
                                    composer3.o(32611341);
                                    Function2 function212 = function26;
                                    if (function212 != null) {
                                        function212.invoke(composer3, 0);
                                    }
                                    composer3.l();
                                    composer3.o(32614720);
                                    Function2 function213 = function24;
                                    if (function213 != null) {
                                        composer3.o(32616271);
                                        if (!z4) {
                                            SpacerKt.a(composer3, SizeKt.u(companion, ButtonSpec.Tokens.e));
                                        }
                                        composer3.l();
                                        function213.invoke(composer3, 0);
                                    }
                                    composer3.l();
                                    composer3.f();
                                    composer3.f();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 56);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV);
            composerImpl = composerImplV;
            SurfaceKt.b(modifierB, roundedCornerShapeB, j, j2, borderStroke2, null, composableLambdaImplC, composerImpl, 32);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.design.core.ui.component.stable.button.internal.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    ButtonImplKt.b(onClick, function2, function22, j, j2, borderStroke, modifier, z, size, mutableInteractionSource, function23, (Composer) obj, iA, iA2);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void c(final String str, final Function0 onClick, final Function2 function2, final Function2 function22, final long j, final long j2, final Modifier modifier, final boolean z, final ButtonSpec.Size size, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i) {
        int i2;
        Function2 function23;
        Function2 function24;
        long j3;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-599205081);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            function23 = function2;
            i2 |= composerImplV.I(function23) ? 256 : 128;
        } else {
            function23 = function2;
        }
        if ((i & 3072) == 0) {
            function24 = function22;
            i2 |= composerImplV.I(function24) ? 2048 : 1024;
        } else {
            function24 = function22;
        }
        if ((i & 24576) == 0) {
            j3 = j;
            i2 |= composerImplV.s(j3) ? 16384 : 8192;
        } else {
            j3 = j;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.s(j2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.n(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.n(modifier) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerImplV.p(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= composerImplV.r(size == null ? -1 : size.ordinal()) ? 536870912 : 268435456;
        }
        if ((306783379 & i2) == 306783378 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-310438830);
            ComposableLambdaImpl composableLambdaImplC = str != null ? ComposableLambdaKt.c(-1031385598, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.button.internal.ButtonImplKt$ButtonImpl$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ButtonLabelKt.a(0, 2, composer2, null, str);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV) : null;
            composerImplV.V(false);
            b(onClick, function23, function24, j3, j2, null, modifier, z, size, mutableInteractionSource, composableLambdaImplC, composerImplV, ((i2 >> 3) & 268435454) | 805306368, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.design.core.ui.component.stable.button.internal.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ButtonImplKt.c(str, onClick, function2, function22, j, j2, modifier, z, size, mutableInteractionSource, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
