package au.com.woolworths.design.core.ui.component.stable.broadcastbanner;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.design.core.ui.component.experimental.tag.TagKt;
import au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerSpec;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.component.stable.internal.TextWithInlineIconKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BroadcastBannerKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f4745a = 48;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType r19, java.lang.String r20, final java.lang.String r21, androidx.compose.ui.Modifier r22, androidx.compose.ui.graphics.painter.Painter r23, au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BannerTagSpec r24, kotlin.jvm.functions.Function0 r25, java.lang.String r26, au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerSpec.Action r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerKt.a(au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.painter.Painter, au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BannerTagSpec, kotlin.jvm.functions.Function0, java.lang.String, au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerSpec$Action, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public static final void b(BroadcastBannerType broadcastBannerType, String str, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, BannerTagSpec bannerTagSpec, Function0 function0, String str2, BroadcastBannerSpec.Action action, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        boolean z;
        Modifier modifierD;
        Function2 function2;
        Modifier.Companion companion2;
        Function2 function22;
        Function0 function02;
        ?? r3;
        ComposerImpl composerImpl;
        Modifier.Companion companion3;
        ComposerImpl composerImpl2;
        BroadcastBannerSpec.Action action2;
        ComposerImpl composerImpl3;
        BroadcastBannerType broadcastBannerType2;
        ComposerImpl composerImpl4;
        BroadcastBannerType broadcastBannerType3;
        ComposerImpl composerImplV = composer.v(1838503695);
        if ((i & 6) == 0) {
            i2 = (composerImplV.r(broadcastBannerType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(bannerTagSpec) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(function0) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.n(str2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.n(action) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if ((i3 & 4793491) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            broadcastBannerType3 = broadcastBannerType;
            action2 = action;
            composerImpl4 = composerImplV;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.android.onesite.repository.b(22);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            float f = 8;
            Modifier modifierA = ClipKt.a(BackgroundKt.b(SemanticsModifierKt.b(modifier, true, (Function1) objG), broadcastBannerType.b(composerImplV), RoundedCornerShapeKt.b(f)), RoundedCornerShapeKt.b(f));
            composerImplV.o(1570516008);
            Modifier.Companion companion4 = Modifier.Companion.d;
            if (action != null) {
                composerImplV.o(5004770);
                boolean z2 = (i3 & 29360128) == 8388608;
                Object objG2 = composerImplV.G();
                if (z2 || objG2 == composer$Companion$Empty$1) {
                    objG2 = new androidx.lifecycle.a(action, 13);
                    composerImplV.A(objG2);
                }
                z = false;
                composerImplV.V(false);
                modifierD = ClickableKt.d(companion4, false, null, null, (Function0) objG2, 7);
                companion = companion4;
            } else {
                companion = companion4;
                z = false;
                modifierD = companion;
            }
            composerImplV.V(z);
            Modifier modifierX0 = modifierA.x0(modifierD);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, z);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierX0);
            ComposeUiNode.e3.getClass();
            Function0 function03 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Function2 function23 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicyD, function23);
            Function2 function24 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function24);
            Function2 function25 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function25);
            }
            Function2 function26 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD2, function26);
            float f2 = 16;
            Modifier modifierG = PaddingKt.g(companion, f2, 12);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierG);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function23);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function24);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function25);
            }
            Updater.b(composerImplV, modifierD3, function26);
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, Alignment.Companion.n, composerImplV, 48);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD4 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function23);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function24);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function25);
            }
            Updater.b(composerImplV, modifierD4, function26);
            composableLambdaImpl.invoke(composerImplV, Integer.valueOf((i3 >> 6) & 14));
            composerImplV.o(-1503522578);
            if (bannerTagSpec != null) {
                TagSpec.Style style = TagSpec.Style.h;
                TagSpec.Size size = TagSpec.Size.g;
                composerImplV.o(1849434622);
                Object objG3 = composerImplV.G();
                if (objG3 == composer$Companion$Empty$1) {
                    objG3 = new androidx.camera.core.processing.concurrent.b(2);
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                Modifier modifierA2 = LayoutModifierKt.a(companion, (Function3) objG3);
                function2 = function24;
                r3 = 0;
                companion2 = companion;
                function22 = function25;
                function02 = function03;
                TagKt.b("TIPS", style, modifierA2, size, null, null, composerImplV, 3072, 112);
                composerImpl = composerImplV;
            } else {
                function2 = function24;
                companion2 = companion;
                function22 = function25;
                function02 = function03;
                r3 = 0;
                composerImpl = composerImplV;
            }
            composerImpl.V(r3);
            composerImpl.V(true);
            SpacerKt.a(composerImpl, SizeKt.u(companion2, f2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            Modifier modifierB = rowScopeInstance.b(rowScopeInstance.a(companion2, 1.0f, true), Alignment.Companion.k);
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, Alignment.Companion.m, composerImpl, r3);
            int i7 = composerImpl.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImpl.Q();
            Modifier modifierD5 = ComposedModifierKt.d(composerImpl, modifierB);
            composerImpl.i();
            if (composerImpl.O) {
                composerImpl.K(function02);
            } else {
                composerImpl.e();
            }
            Updater.b(composerImpl, columnMeasurePolicyA2, function23);
            Updater.b(composerImpl, persistentCompositionLocalMapQ4, function2);
            if (composerImpl.O || !Intrinsics.c(composerImpl.G(), Integer.valueOf(i7))) {
                androidx.camera.core.impl.b.B(i7, composerImpl, i7, function22);
            }
            Updater.b(composerImpl, modifierD5, function26);
            Composer composer2 = composerImpl;
            TextKt.a(str, CoreTheme.f(composerImpl).f5120a.b.b, PaddingKt.h(companion2, BitmapDescriptorFactory.HUE_RED, 4, 1), CoreTheme.b(composerImpl).e.d.d, null, 0, 0, false, 0, null, composer2, ((i3 >> 3) & 14) | KyberEngine.KyberPolyBytes, 1008);
            Composer composer3 = composer2;
            composer3.o(435260398);
            if (str2 == null) {
                companion3 = companion2;
                composerImpl2 = composer3;
            } else {
                SpacerKt.a(composer3, SizeKt.g(companion2, 2));
                companion3 = companion2;
                TextKt.a(str2, CoreTheme.f(composer3).f5120a.c.f5124a, null, CoreTheme.b(composer3).e.d.d, null, 0, 0, false, 0, null, composer3, 0, 1012);
                composerImpl2 = composer3;
            }
            composerImpl2.V(r3);
            composerImpl2.o(435271724);
            if (action == null) {
                broadcastBannerType2 = broadcastBannerType;
                action2 = action;
                composerImpl3 = composerImpl2;
            } else {
                SpacerKt.a(composerImpl2, SizeKt.g(companion3, 6));
                action2 = action;
                if (action2.b) {
                    composerImpl2.o(-2128116963);
                    BroadcastBannerType broadcastBannerType4 = broadcastBannerType;
                    Composer composer4 = composerImpl2;
                    TextWithInlineIconKt.a(action2.f4747a, broadcastBannerType4.a(composerImpl2), TextUnitKt.c(20), CoreTheme.f(composerImpl2).e.f5133a.b, CoreTheme.e(composerImpl2).e.p, BitmapDescriptorFactory.HUE_RED, composer4, KyberEngine.KyberPolyBytes);
                    ComposerImpl composerImpl5 = composer4;
                    composerImpl5.V(r3);
                    broadcastBannerType2 = broadcastBannerType4;
                    composerImpl3 = composerImpl5;
                } else {
                    BroadcastBannerType broadcastBannerType5 = broadcastBannerType;
                    composerImpl2.o(-2127723387);
                    Composer composer5 = composerImpl2;
                    TextKt.a(action2.f4747a, CoreTheme.f(composerImpl2).e.f5133a.b, null, broadcastBannerType5.a(composerImpl2), null, 0, 0, false, 0, null, composer5, 0, 1012);
                    ComposerImpl composerImpl6 = composer5;
                    composerImpl6.V(r3);
                    broadcastBannerType2 = broadcastBannerType5;
                    composerImpl3 = composerImpl6;
                }
            }
            composerImpl3.V(r3);
            composerImpl3.V(true);
            composerImpl3.o(-18417469);
            if (function0 != null) {
                SpacerKt.a(composerImpl3, SizeKt.u(companion3, 36));
            }
            composerImpl3.V(r3);
            composerImpl3.V(true);
            composerImpl3.o(1519956620);
            if (function0 != null) {
                IconButtonKt.c(CoreTheme.e(composerImpl3).f4879a.G, "Close banner", function0, BoxScopeInstance.f944a.g(companion3, str2 != null ? Alignment.Companion.c : Alignment.Companion.f), false, null, CoreTheme.b(composerImpl3).e.c.d, composerImpl3, ((i3 >> 9) & 896) | 48, 48);
            }
            composerImpl3.V(r3);
            composerImpl3.V(true);
            broadcastBannerType3 = broadcastBannerType2;
            composerImpl4 = composerImpl3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl4.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(broadcastBannerType3, str, composableLambdaImpl, modifier, bannerTagSpec, function0, str2, action2, i);
        }
    }
}
