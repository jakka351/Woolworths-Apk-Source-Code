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
/* loaded from: classes.dex */
public final class PrimaryButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r16, kotlin.jvm.functions.Function0 r17, androidx.compose.ui.Modifier r18, boolean r19, java.lang.String r20, androidx.compose.ui.graphics.vector.ImageVector r21, androidx.compose.ui.graphics.vector.ImageVector r22, au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec.Size r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt.a(java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, java.lang.String, androidx.compose.ui.graphics.vector.ImageVector, androidx.compose.ui.graphics.vector.ImageVector, au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec$Size, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(String label, Function0 onClick, Function2 function2, Modifier modifier, boolean z, ButtonSpec.Size size, Composer composer, int i) {
        int i2;
        Function2 function22;
        Modifier modifier2;
        boolean z2;
        ButtonSpec.Size size2;
        Intrinsics.h(label, "label");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(1527155648);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(label) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            function22 = function2;
            i2 |= composerImplV.I(function2) ? 256 : 128;
        } else {
            function22 = function2;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            modifier2 = modifier;
            i2 |= composerImplV.n(modifier2) ? 16384 : 8192;
        } else {
            modifier2 = modifier;
        }
        if ((196608 & i) == 0) {
            z2 = z;
            i2 |= composerImplV.p(z2) ? 131072 : 65536;
        } else {
            z2 = z;
        }
        int i3 = i2 | 14155776;
        if ((4793491 & i3) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            size2 = size;
        } else {
            ButtonSpec.Size size3 = ButtonSpec.Size.g;
            int i4 = i3 >> 3;
            int i5 = (i3 & 14) | ((i3 >> 15) & 112) | ((i3 << 3) & 896) | (i4 & 7168) | (i4 & 57344);
            int i6 = i3 << 9;
            c(label, null, onClick, modifier2, z2, function22, null, size3, composerImplV, i5 | (458752 & i6) | (i6 & 3670016) | (i3 & 29360128));
            size2 = size3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(label, onClick, function2, modifier, z, size2, i);
        }
    }

    public static final void c(final String str, String str2, Function0 onClick, Modifier modifier, boolean z, Function2 function2, Function2 function22, ButtonSpec.Size size, Composer composer, int i) {
        int i2;
        boolean z2;
        Function2 function23;
        Function2 function24;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-1992009452);
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
            composerImplV.o(1234350475);
            ComposableLambdaImpl composableLambdaImplC = str == null ? null : ComposableLambdaKt.c(2046521599, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt$PrimaryButtonImpl$1$1
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
            d(str2, onClick, modifier, z2, function23, function24, size, composableLambdaImplC, composerImplV, 4194302 & (i2 >> 3));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(str, str2, onClick, modifier, z, function2, function22, size, i, 0);
        }
    }

    public static final void d(String str, Function0 onClick, Modifier modifier, boolean z, Function2 function2, Function2 function22, ButtonSpec.Size size, Function2 function23, Composer composer, int i) {
        String str2;
        int i2;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-2097067798);
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
                objG = new ButtonSpec.Variant.Primary(z);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            int i4 = i3 >> 6;
            int i5 = (i3 & 14) | 12582912 | (i3 & 112) | (i4 & 896) | (i4 & 7168) | (458752 & i4) | (i4 & 3670016);
            int i6 = i3 << 18;
            ButtonImplKt.a(str2, onClick, function2, function22, (ButtonSpec.Variant.Primary) objG, null, null, null, modifier, z, size, function23, composerImplV, i5 | (234881024 & i6) | (i6 & 1879048192), ((i3 >> 18) & 14) | ((i3 >> 24) & 112), 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(str, onClick, modifier, z, function2, function22, size, function23, i, 0);
        }
    }
}
