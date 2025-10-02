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
public final class DestructiveButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r14, kotlin.jvm.functions.Function0 r15, androidx.compose.ui.Modifier r16, androidx.compose.ui.graphics.vector.ImageVector r17, androidx.compose.ui.graphics.vector.ImageVector r18, au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec.Size r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.design.core.ui.component.stable.button.DestructiveButtonKt.a(java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.vector.ImageVector, androidx.compose.ui.graphics.vector.ImageVector, au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec$Size, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(String str, Function0 onClick, Modifier modifier, Function2 function2, Function2 function22, ButtonSpec.Size size, Function2 function23, Composer composer, int i) {
        String str2;
        int i2;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(1223607878);
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
            i2 |= composerImplV.I(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function22) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.r(size == null ? -1 : size.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.n(null) ? 1048576 : 524288;
        }
        int i3 = i2 | 12582912;
        if ((100663296 & i) == 0) {
            i3 |= composerImplV.I(function23) ? 67108864 : 33554432;
        }
        if ((38347923 & i3) == 38347922 && composerImplV.c()) {
            composerImplV.j();
        } else {
            int i4 = i3 >> 3;
            String str3 = str2;
            ButtonImplKt.a(str3, onClick, function2, function22, ButtonSpec.Variant.Destructive.f4750a, null, null, null, modifier, false, size, function23, composerImplV, (i3 & 14) | 12607488 | (i3 & 112) | (i4 & 896) | (i4 & 7168) | (458752 & i4) | (i4 & 3670016) | ((i3 << 18) & 234881024), ((i3 >> 15) & 14) | ((i3 >> 21) & 112), 512);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(str, onClick, modifier, function2, function22, size, function23, i);
        }
    }

    public static final void c(final String str, String str2, Function0 onClick, Modifier modifier, Function2 function2, Function2 function22, ButtonSpec.Size size, Composer composer, int i) {
        int i2;
        Function2 function23;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-607990265);
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
            i2 |= composerImplV.I(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function23 = function22;
            i2 |= composerImplV.I(function23) ? 131072 : 65536;
        } else {
            function23 = function22;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.r(size == null ? -1 : size.ordinal()) ? 1048576 : 524288;
        }
        int i3 = i2 | 12582912;
        if ((4793491 & i3) == 4793490 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-163071490);
            ComposableLambdaImpl composableLambdaImplC = str == null ? null : ComposableLambdaKt.c(-1445717613, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.button.DestructiveButtonKt$DestructiveButtonImpl$1$1
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
            b(str2, onClick, modifier, function2, function23, size, composableLambdaImplC, composerImplV, 4194302 & (i3 >> 3));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(str, str2, onClick, modifier, function2, function22, size, i, 0);
        }
    }
}
