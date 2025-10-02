package au.com.woolworths.design.core.ui.component.stable.button;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import au.com.woolworths.design.core.ui.component.stable.button.internal.ButtonImplKt;
import au.com.woolworths.design.core.ui.component.stable.button.internal.ButtonLabelKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TertiaryButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r14, kotlin.jvm.functions.Function0 r15, androidx.compose.ui.Modifier r16, boolean r17, androidx.compose.ui.graphics.vector.ImageVector r18, androidx.compose.ui.graphics.vector.ImageVector r19, au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec.Size r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.design.core.ui.component.stable.button.TertiaryButtonKt.a(java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.vector.ImageVector, androidx.compose.ui.graphics.vector.ImageVector, au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec$Size, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(final String str, String str2, Function0 onClick, Modifier modifier, boolean z, Function2 function2, Function2 function22, ButtonSpec.Size size, Composer composer, int i) {
        int i2;
        boolean z2;
        Function2 function23;
        Function2 function24;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(218766422);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i2 |= composerImplV.p(z2) ? 16384 : 8192;
        } else {
            z2 = z;
        }
        if ((196608 & i) == 0) {
            function23 = function2;
            i2 |= composerImplV.I(function23) ? 131072 : 65536;
        } else {
            function23 = function2;
        }
        if ((1572864 & i) == 0) {
            function24 = function22;
            i2 |= composerImplV.I(function24) ? 1048576 : 524288;
        } else {
            function24 = function22;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.r(size == null ? -1 : size.ordinal()) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) == 4793490 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-218846067);
            ComposableLambdaImpl composableLambdaImplC = str == null ? null : ComposableLambdaKt.c(85438149, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.button.TertiaryButtonKt$TertiaryButtonImpl$1$1
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
            }, composerImplV);
            composerImplV.V(false);
            c(str2, onClick, modifier, z2, function23, function24, size, composableLambdaImplC, composerImplV, 4194302 & (i2 >> 3));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(str, str2, onClick, modifier, z, function2, function22, size, i);
        }
    }

    public static final void c(String str, Function0 onClick, Modifier modifier, boolean z, Function2 function2, Function2 function22, ButtonSpec.Size size, Function2 function23, Composer composer, int i) {
        String str2;
        int i2;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(1702974872);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (composerImplV.n(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.p(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(function22) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.r(size == null ? -1 : size.ordinal()) ? 1048576 : 524288;
        }
        int i3 = i2 | 113246208;
        if ((805306368 & i) == 0) {
            i3 |= composerImplV.I(function23) ? 536870912 : 268435456;
        }
        if ((306783379 & i3) == 306783378 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(5004770);
            boolean z2 = (i3 & 7168) == 2048;
            Object objG = composerImplV.G();
            if (z2 || objG == Composer.Companion.f1624a) {
                objG = new ButtonSpec.Variant.Tertiary(z);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            int i4 = i3 >> 6;
            int i5 = (i3 & 14) | 12582912 | (i3 & 112) | (i4 & 896) | (i4 & 7168) | (458752 & i4) | (i4 & 3670016);
            int i6 = i3 << 18;
            ButtonImplKt.a(str2, onClick, function2, function22, (ButtonSpec.Variant.Tertiary) objG, null, null, null, modifier, z, size, function23, composerImplV, i5 | (234881024 & i6) | (i6 & 1879048192), ((i3 >> 18) & 14) | ((i3 >> 24) & 112), 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(str, onClick, modifier, z, function2, function22, size, function23, i);
        }
    }
}
