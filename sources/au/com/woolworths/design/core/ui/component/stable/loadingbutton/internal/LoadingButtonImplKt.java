package au.com.woolworths.design.core.ui.component.stable.loadingbutton.internal;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import au.com.woolworths.design.core.ui.component.stable.button.internal.ButtonImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class LoadingButtonImplKt {
    public static final void a(final String label, final boolean z, final ImageVector imageVector, final ImageVector imageVector2, final ButtonSpec.Variant buttonVariant, final String str, final ButtonSpec.Size size, final long j, final Function0 onClick, final Color color, final Color color2, final BorderStroke borderStroke, final String str2, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        ComposableLambdaImpl composableLambdaImplC;
        boolean z2;
        ComposerImpl composerImpl;
        Intrinsics.h(label, "label");
        Intrinsics.h(buttonVariant, "buttonVariant");
        Intrinsics.h(size, "size");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(3271650);
        if ((i & 6) == 0) {
            i3 = (composerImplV.n(label) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(imageVector) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerImplV.n(imageVector2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? composerImplV.n(buttonVariant) : composerImplV.I(buttonVariant) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerImplV.n(str) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerImplV.r(size.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerImplV.s(j) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerImplV.I(onClick) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerImplV.n(color) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = (composerImplV.n(color2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerImplV.n(borderStroke) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.n(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerImplV.n(modifier) ? 2048 : 1024;
        }
        if ((i6 & 306783379) == 306783378 && (i4 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            final boolean z3 = (imageVector == null && imageVector2 == null) && z;
            composerImplV.o(-1150886232);
            ComposableLambdaImpl composableLambdaImplC2 = null;
            if (imageVector != null) {
                i5 = i4;
                composableLambdaImplC = ComposableLambdaKt.c(-1682365254, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.loadingbutton.internal.LoadingButtonImplKt$LoadingButtonImpl$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            ButtonIconOrSpinnerKt.a(z, imageVector, size, j, composer2, 0);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV);
            } else {
                i5 = i4;
                composableLambdaImplC = null;
            }
            composerImplV.V(false);
            composerImplV.o(-1150876022);
            if (imageVector2 != null) {
                z2 = z;
                composableLambdaImplC2 = ComposableLambdaKt.c(-1459633377, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.loadingbutton.internal.LoadingButtonImplKt$LoadingButtonImpl$2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            ButtonIconOrSpinnerKt.a(z, imageVector2, size, j, composer2, 0);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV);
            } else {
                z2 = z;
            }
            composerImplV.V(false);
            boolean z4 = !z2;
            composerImplV.o(-1633490746);
            int i7 = i5;
            boolean z5 = ((i7 & 896) == 256) | ((i6 & 112) == 32);
            Object objG = composerImplV.G();
            if (z5 || objG == Composer.Companion.f1624a) {
                objG = new b(str2, z2, 0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            int i8 = i7 << 18;
            composerImpl = composerImplV;
            ButtonImplKt.a(str, onClick, composableLambdaImplC, composableLambdaImplC2, buttonVariant, color, color2, borderStroke, SemanticsModifierKt.b(modifier, false, (Function1) objG), z4, size, ComposableLambdaKt.c(-1894914567, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.loadingbutton.internal.LoadingButtonImplKt$LoadingButtonImpl$4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ButtonLabelOrSpinnerKt.a(z3, label, size, j, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, ((i6 >> 15) & 14) | ((i6 >> 21) & 112) | (i6 & 57344) | ((i6 >> 12) & 458752) | (3670016 & i8) | (i8 & 29360128), ((i6 >> 18) & 14) | 48, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.design.core.ui.component.stable.loadingbutton.internal.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    LoadingButtonImplKt.a(label, z, imageVector, imageVector2, buttonVariant, str, size, j, onClick, color, color2, borderStroke, str2, modifier, (Composer) obj, iA, iA2);
                    return Unit.f24250a;
                }
            };
        }
    }
}
