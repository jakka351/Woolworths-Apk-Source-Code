package au.com.woolworths.foundation.shop.olive.voice.ui.onboarding;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.foundation.shop.nhp.ui.edr.c;
import au.com.woolworths.foundation.shop.olive.voice.ui.lottie.GlowBlurLottieKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.lottie.OliveIntroLottieKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"olive-voice_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class OliveVoiceOnboardingScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final kotlin.jvm.functions.Function0 r19, final kotlin.jvm.functions.Function0 r20, kotlin.jvm.functions.Function0 r21, kotlin.jvm.functions.Function0 r22, final boolean r23, androidx.compose.ui.Modifier r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.shop.olive.voice.ui.onboarding.OliveVoiceOnboardingScreenKt.a(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(PaddingValues paddingValues, Function0 onPrimaryAction, boolean z, Composer composer, int i) {
        int i2;
        Intrinsics.h(paddingValues, "paddingValues");
        Intrinsics.h(onPrimaryAction, "onPrimaryAction");
        ComposerImpl composerImplV = composer.v(94450945);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(paddingValues) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onPrimaryAction) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            int i3 = z ? R.string.olive_voice_onboarding_description_vps : R.string.olive_voice_onboarding_description_vpf;
            float f = 16;
            Modifier modifierJ = PaddingKt.j(PaddingKt.f(SizeKt.c, f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paddingValues.getD(), 7);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new c(5);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifierJ, false, (Function1) objG);
            BiasAlignment biasAlignment = Alignment.Companion.e;
            MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicyD, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f944a;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierG = boxScopeInstance.g(companion, biasAlignment);
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new c(6);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier modifierB2 = SemanticsModifierKt.b(modifierG, true, (Function1) objG2);
            int i5 = i2;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierB2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            MeasurePolicy measurePolicyD2 = BoxKt.d(Alignment.Companion.f1719a, false);
            int i7 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                androidx.camera.core.impl.b.B(i7, composerImplV, i7, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            float f2 = 380;
            GlowBlurLottieKt.a(SizeKt.r(companion, f2, f2), composerImplV, 6);
            float f3 = 250;
            OliveIntroLottieKt.a(boxScopeInstance.g(SizeKt.r(companion, f3, f3), biasAlignment), false, composerImplV, 0, 2);
            composerImplV.V(true);
            float f4 = 8;
            TextKt.a(StringResources_androidKt.c(composerImplV, R.string.olive_voice_onboarding_title), CoreTheme.f(composerImplV).d.f5129a.b, PaddingKt.h(companion, f4, BitmapDescriptorFactory.HUE_RED, 2), CoreTheme.b(composerImplV).e.d.c.b, null, 3, 0, false, 0, null, composerImplV, KyberEngine.KyberPolyBytes, 976);
            SpacerKt.a(composerImplV, SizeKt.g(companion, f));
            TextKt.a(StringResources_androidKt.c(composerImplV, i3), CoreTheme.f(composerImplV).f5120a.b.f5123a, PaddingKt.h(companion, f4, BitmapDescriptorFactory.HUE_RED, 2), Color.b(CoreTheme.b(composerImplV).e.d.c.b, 0.7f), null, 3, 0, false, 0, null, composerImplV, KyberEngine.KyberPolyBytes, 976);
            composerImplV.V(true);
            PrimaryButtonKt.a(StringResources_androidKt.c(composerImplV, R.string.olive_voice_action_continue), onPrimaryAction, boxScopeInstance.g(SizeKt.e(companion, 1.0f), Alignment.Companion.h), false, null, null, null, null, composerImplV, i5 & 112, 248);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.filter.b(paddingValues, onPrimaryAction, z, i, 10);
        }
    }
}
