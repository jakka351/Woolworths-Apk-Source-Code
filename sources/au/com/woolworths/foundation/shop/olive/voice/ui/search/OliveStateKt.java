package au.com.woolworths.foundation.shop.olive.voice.ui.search;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.k;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState;
import au.com.woolworths.foundation.shop.olive.voice.ui.lottie.GlowBlurLottieKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.lottie.OliveErrorLottieKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.lottie.OliveIntroLottieKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.lottie.OliveWaveformLottieKt;
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
public final class OliveStateKt {
    public static final void a(int i, Composer composer, Modifier modifier, Function0 function0) {
        int i2;
        ComposerImpl composerImplV = composer.v(-1150103033);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            GlowBlurLottieKt.a(modifier.x0(SizeKt.c), composerImplV, 0);
            Modifier modifierQ = SizeKt.q(modifier, 100);
            composerImplV.o(5004770);
            boolean z = (i2 & 112) == 32;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new k(27, function0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            OliveErrorLottieKt.a(ClickableKt.d(modifierQ, false, null, null, (Function0) objG, 7), composerImplV, 0);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.card.unlock.b(modifier, function0, i, 7);
        }
    }

    public static final void b(int i, Composer composer, Modifier modifier, Function0 function0) {
        int i2;
        ComposerImpl composerImplV = composer.v(1817261315);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            GlowBlurLottieKt.a(modifier.x0(SizeKt.c), composerImplV, 0);
            Modifier modifierQ = SizeKt.q(modifier, 100);
            composerImplV.o(5004770);
            boolean z = (i2 & 112) == 32;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new k(26, function0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            OliveIntroLottieKt.a(ClickableKt.d(modifierQ, false, null, null, (Function0) objG, 7), false, composerImplV, 48, 0);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.card.unlock.b(modifier, function0, i, 8);
        }
    }

    public static final void c(VoiceSearchState voiceSearchState, Function0 function0, Modifier modifier, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(2145041469);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(voiceSearchState) : composerImplV.I(voiceSearchState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else if (voiceSearchState instanceof VoiceSearchState.Idle) {
            composerImplV.o(-1887806002);
            b((i2 & 112) | ((i2 >> 6) & 14), composerImplV, modifier, function0);
            composerImplV.V(false);
        } else if ((voiceSearchState instanceof VoiceSearchState.Listening) || (voiceSearchState instanceof VoiceSearchState.Recognising) || (voiceSearchState instanceof VoiceSearchState.Processing)) {
            composerImplV.o(-1887611911);
            e(voiceSearchState, modifier, composerImplV, ((i2 >> 3) & 112) | (i2 & 14));
            composerImplV.V(false);
        } else {
            if (!(voiceSearchState instanceof VoiceSearchState.Failure)) {
                throw au.com.woolworths.android.onesite.a.w(-199445028, composerImplV, false);
            }
            composerImplV.o(-1887271376);
            if (((VoiceSearchState.Failure) voiceSearchState).f8831a.b()) {
                composerImplV.o(-1887220350);
                b((i2 & 112) | ((i2 >> 6) & 14), composerImplV, modifier, function0);
                composerImplV.V(false);
            } else {
                composerImplV.o(-1887053539);
                a((i2 & 112) | ((i2 >> 6) & 14), composerImplV, modifier, function0);
                composerImplV.V(false);
            }
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(i, 6, voiceSearchState, function0, modifier, false);
        }
    }

    public static final void d(VoiceSearchState voiceSearchState, Function0 onOliveTap, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.h(onOliveTap, "onOliveTap");
        ComposerImpl composerImplV = composer.v(1228091125);
        int i2 = i | (composerImplV.n(voiceSearchState) ? 4 : 2) | (composerImplV.I(onOliveTap) ? 32 : 16) | KyberEngine.KyberPolyBytes;
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierG = SizeKt.g(SizeKt.e(companion, 1.0f), 200);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierG);
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
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            String strC = StringResources_androidKt.c(composerImplV, R.string.olive_button);
            Modifier modifierG2 = BoxScopeInstance.f944a.g(companion, Alignment.Companion.e);
            composerImplV.o(-1633490746);
            boolean zN = ((i2 & 14) == 4) | composerImplV.n(strC);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a(25, strC, voiceSearchState);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            c(voiceSearchState, onOliveTap, SemanticsModifierKt.a(modifierG2, (Function1) objG), composerImplV, i2 & 126);
            composerImplV.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.marketplace.ui.personalised.b(voiceSearchState, onOliveTap, modifier2, i, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState r18, androidx.compose.ui.Modifier r19, androidx.compose.runtime.Composer r20, int r21) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.shop.olive.voice.ui.search.OliveStateKt.e(au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    public static final void f(Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1360897453);
        if ((((composerImplV.n(modifier) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
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
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            OliveWaveformLottieKt.a(BoxScopeInstance.f944a.g(SizeKt.r(Modifier.Companion.d, 45, 30), Alignment.Companion.h), composerImplV, 0);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.compose.utils.layout.a(i, 28, modifier);
        }
    }
}
