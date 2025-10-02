package au.com.woolworths.design.core.ui.component.stable.corerow.impl;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.lifecycle.compose.c;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CoreRowImplKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc A[PHI: r20
  0x00cc: PHI (r20v15 int) = (r20v0 int), (r20v6 int), (r20v7 int) binds: [B:71:0x00ca, B:81:0x00e7, B:80:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r30, kotlin.jvm.functions.Function0 r31, androidx.compose.ui.Modifier r32, java.lang.String r33, java.lang.String r34, kotlin.jvm.functions.Function2 r35, kotlin.jvm.functions.Function2 r36, au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec.TrailingDisplay r37, au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec.DividerType r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.design.core.ui.component.stable.corerow.impl.CoreRowImplKt.a(java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec$TrailingDisplay, au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec$DividerType, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(String str, String str2, String str3, Composer composer, int i) {
        int i2;
        int i3;
        ComposerImpl composerImplV = composer.v(1139164052);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(str3) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-480002550);
            if (str3 == null) {
                i3 = i2;
            } else {
                i3 = i2;
                TextKt.a(str3, CoreTheme.f(composerImplV).b.f5125a.b, null, CoreTheme.b(composerImplV).d.d.e.b, null, 0, 0, false, 0, null, composerImplV, 0, 1012);
                composerImplV = composerImplV;
            }
            composerImplV.V(false);
            TextKt.a(str, CoreTheme.f(composerImplV).f5120a.f5121a.f5122a, null, CoreTheme.b(composerImplV).d.d.c, null, 0, 0, false, 0, null, composerImplV, i3 & 14, 1012);
            if (str2 != null) {
                TextKt.a(str2, CoreTheme.f(composerImplV).f5120a.c.f5124a, null, CoreTheme.b(composerImplV).d.d.e.b, null, 0, 0, false, 0, null, composerImplV, 0, 1012);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(str, str2, str3, i, 5);
        }
    }

    public static final void c(int i, Composer composer, Function2 function2) {
        int i2;
        ComposerImpl composerImplV = composer.v(-1069886500);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else if (function2 != null) {
            float f = CoreRowDimensionTokens.f4759a;
            float f2 = CoreRowDimensionTokens.c;
            Modifier modifierJ = PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, f2, f, f2, 1);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierJ);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function22 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function22);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            android.support.v4.media.session.a.z(0, function2, composerImplV, true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(i, 0, function2);
        }
    }

    public static final void d(int i, Composer composer, Function2 function2) {
        int i2;
        ComposerImpl composerImplV = composer.v(1070899982);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else if (function2 != null) {
            SpacerKt.a(composerImplV, SizeKt.u(Modifier.Companion.d, 8));
            function2.invoke(composerImplV, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(i, 1, function2);
        }
    }

    public static final void e(String str, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1884582410);
        if ((((composerImplV.n(str) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else if (str != null) {
            SpacerKt.a(composerImplV, SizeKt.u(Modifier.Companion.d, 8));
            TextKt.a(str, CoreTheme.f(composerImplV).f5120a.b.f5123a, null, CoreTheme.b(composerImplV).d.d.e.b, null, 0, 0, false, 1, null, composerImplV, 100663296, 756);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(str, i, 0);
        }
    }
}
