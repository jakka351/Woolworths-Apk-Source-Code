package au.com.woolworths.design.core.ui.component.stable.corerow;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.stable.CheckBoxState;
import au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CheckboxRowKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6 A[PHI: r20
  0x00e6: PHI (r20v28 int) = (r20v4 int), (r20v10 int), (r20v11 int) binds: [B:79:0x00e4, B:89:0x0101, B:88:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010a A[PHI: r20
  0x010a: PHI (r20v27 int) = (r20v13 int), (r20v19 int), (r20v20 int) binds: [B:91:0x0108, B:101:0x0125, B:100:0x0122] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final java.lang.String r27, final au.com.woolworths.design.core.ui.component.stable.CheckBoxState r28, final kotlin.jvm.functions.Function1 r29, androidx.compose.ui.Modifier r30, boolean r31, java.lang.String r32, java.lang.String r33, kotlin.jvm.functions.Function0 r34, au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec.Image r35, au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec.TrailingDisplay r36, final au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec.DividerType r37, androidx.compose.runtime.Composer r38, final int r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.design.core.ui.component.stable.corerow.CheckboxRowKt.a(java.lang.String, au.com.woolworths.design.core.ui.component.stable.CheckBoxState, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec$Image, au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec$TrailingDisplay, au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec$DividerType, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void b(String str, boolean z, Function1 onCheckedChange, Modifier modifier, boolean z2, Function0 function0, CoreRowSpec.Image image, CoreRowSpec.TrailingDisplay trailingDisplay, CoreRowSpec.DividerType dividerType, Composer composer, int i) {
        String str2;
        int i2;
        Modifier modifier2;
        boolean z3;
        CoreRowSpec.DividerType dividerType2;
        Intrinsics.h(onCheckedChange, "onCheckedChange");
        ComposerImpl composerImplV = composer.v(-485495996);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (composerImplV.n(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onCheckedChange) ? 256 : 128;
        }
        int i3 = i2 | 1797120;
        if ((12582912 & i) == 0) {
            i3 |= composerImplV.I(function0) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= (134217728 & i) == 0 ? composerImplV.n(image) : composerImplV.I(image) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= (1073741824 & i) == 0 ? composerImplV.n(trailingDisplay) : composerImplV.I(trailingDisplay) ? 536870912 : 268435456;
        }
        if ((306783379 & i3) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            z3 = z2;
            dividerType2 = dividerType;
        } else {
            CoreRowSpec.DividerType dividerType3 = CoreRowSpec.DividerType.d;
            CheckBoxState checkBoxState = z ? CheckBoxState.d : CheckBoxState.e;
            composerImplV.o(-1633490746);
            boolean z4 = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objG = composerImplV.G();
            if (z4 || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.design.core.ui.component.stable.b(onCheckedChange, z, 1);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier.Companion companion = Modifier.Companion.d;
            a(str2, checkBoxState, (Function1) objG, companion, true, null, null, function0, image, trailingDisplay, dividerType3, composerImplV, i3 & 2147482638, 6, 0);
            modifier2 = companion;
            z3 = true;
            dividerType2 = dividerType3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(str, z, onCheckedChange, modifier2, z3, function0, image, trailingDisplay, dividerType2, i);
        }
    }
}
