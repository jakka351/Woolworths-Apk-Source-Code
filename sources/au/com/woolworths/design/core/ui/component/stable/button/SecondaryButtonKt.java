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
import au.com.woolworths.shop.lists.ui.shoppinglist.compose.ComposableSingletons$ListDetailsEmptyUiKt;
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
public final class SecondaryButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r17, kotlin.jvm.functions.Function0 r18, androidx.compose.ui.Modifier r19, boolean r20, java.lang.String r21, androidx.compose.ui.graphics.vector.ImageVector r22, androidx.compose.ui.graphics.vector.ImageVector r23, au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec.Size r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.design.core.ui.component.stable.button.SecondaryButtonKt.a(java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, java.lang.String, androidx.compose.ui.graphics.vector.ImageVector, androidx.compose.ui.graphics.vector.ImageVector, au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec$Size, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(String label, Function0 onClick, boolean z, ButtonSpec.Size size, Composer composer, int i) {
        int i2;
        String str;
        Function0 function0;
        boolean z2;
        ButtonSpec.Size size2;
        ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$ListDetailsEmptyUiKt.f12373a;
        Intrinsics.h(label, "label");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-10052928);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(label) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(null) ? 2048 : 1024;
        }
        int i3 = i & 24576;
        Modifier.Companion companion = Modifier.Companion.d;
        if (i3 == 0) {
            i2 |= composerImplV.n(companion) ? 16384 : 8192;
        }
        int i4 = i2 | 14352384;
        if ((4793491 & i4) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            size2 = size;
            z2 = z;
            function0 = onClick;
            str = label;
        } else {
            ButtonSpec.Size size3 = ButtonSpec.Size.g;
            int i5 = i4 >> 3;
            int i6 = (i4 & 14) | ((i4 >> 15) & 112) | ((i4 << 3) & 896) | (i5 & 7168) | (i5 & 57344);
            int i7 = i4 << 9;
            c(label, null, onClick, companion, true, composableLambdaImpl, null, size3, composerImplV, i6 | (458752 & i7) | (i7 & 3670016) | (29360128 & i4));
            str = label;
            function0 = onClick;
            z2 = true;
            size2 = size3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.pullrefresh.a(str, function0, z2, size2, i);
        }
    }

    public static final void c(final String str, String str2, Function0 onClick, Modifier modifier, boolean z, Function2 function2, Function2 function22, ButtonSpec.Size size, Composer composer, int i) {
        int i2;
        boolean z2;
        Function2 function23;
        Function2 function24;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-196716012);
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
            composerImplV.o(-65506549);
            ComposableLambdaImpl composableLambdaImplC = str == null ? null : ComposableLambdaKt.c(1808967917, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.button.SecondaryButtonKt$SecondaryButtonImpl$1$1
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
            recomposeScopeImplX.d = new c(str, str2, onClick, modifier, z, function2, function22, size, i, 1);
        }
    }

    public static final void d(String str, Function0 onClick, Modifier modifier, boolean z, Function2 function2, Function2 function22, ButtonSpec.Size size, Function2 function23, Composer composer, int i) {
        String str2;
        int i2;
        Function2 function24;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(1815690717);
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
            function24 = function22;
            i2 |= composerImplV.I(function24) ? 131072 : 65536;
        } else {
            function24 = function22;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.r(size == null ? -1 : size.ordinal()) ? 1048576 : 524288;
        }
        int i3 = i2 | 918552576;
        int i4 = composerImplV.I(function23) ? 4 : 2;
        if ((306783379 & i3) == 306783378 && (i4 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(5004770);
            boolean z2 = (i3 & 7168) == 2048;
            Object objG = composerImplV.G();
            if (z2 || objG == Composer.Companion.f1624a) {
                objG = new ButtonSpec.Variant.Secondary(z);
                composerImplV.A(objG);
            }
            ButtonSpec.Variant.Secondary secondary = (ButtonSpec.Variant.Secondary) objG;
            composerImplV.V(false);
            int i5 = i3 >> 6;
            int i6 = (i3 & 126) | (i5 & 896) | (i5 & 7168) | (458752 & i5) | (i5 & 3670016);
            int i7 = i3 << 18;
            ButtonImplKt.a(str2, onClick, function2, function24, secondary, null, null, null, modifier, z, size, function23, composerImplV, (i7 & 1879048192) | i6 | (234881024 & i7), ((i3 >> 18) & 14) | ((i4 << 3) & 112), 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(str, onClick, modifier, z, function2, function22, size, function23, i, 1);
        }
    }
}
