package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.sdui.legacy.downloadableasset.DownloadableAssetUiKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class LandingScreenHeaderItemKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f6108a = 24;

    public static final void a(float f, DownloadableAsset downloadableAsset, ScrollState scrollState, Composer composer, int i) {
        Modifier modifierA;
        DownloadableAsset downloadableAsset2 = downloadableAsset;
        ComposerImpl composerImplV = composer.v(-465120684);
        int i2 = (composerImplV.q(f) ? 4 : 2) | i | (composerImplV.I(downloadableAsset2) ? 32 : 16);
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(scrollState) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-304372246);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.h;
            float fC = ((Density) composerImplV.x(staticProvidableCompositionLocal)).C((((Density) composerImplV.x(staticProvidableCompositionLocal)).T1(f) / downloadableAsset2.getAssetWidth()) * downloadableAsset2.getAssetHeight());
            composerImplV.V(false);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierG = SizeKt.g(SizeKt.e(companion, 1.0f), fC - f6108a);
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(downloadableAsset2);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new i(downloadableAsset2, 0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierA2 = SemanticsModifierKt.a(modifierG, (Function1) objG);
            composerImplV.o(-304358445);
            if (scrollState != null) {
                composerImplV.o(5004770);
                boolean z = (i2 & 896) == 256;
                Object objG2 = composerImplV.G();
                if (z || objG2 == composer$Companion$Empty$1) {
                    objG2 = new f(scrollState, 1);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                modifierA = GraphicsLayerModifierKt.a(companion, (Function1) objG2);
            } else {
                modifierA = companion;
            }
            composerImplV.V(false);
            Modifier modifierX0 = modifierA2.x0(modifierA);
            BiasAlignment biasAlignment = Alignment.Companion.b;
            MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierX0);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Modifier modifierG2 = SizeKt.g(SizeKt.x(SizeKt.e(companion, 1.0f), Alignment.Companion.j, true), fC);
            MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierG2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            downloadableAsset2 = downloadableAsset;
            DownloadableAssetUiKt.b(downloadableAsset2, null, false, false, false, null, null, composerImplV, (i2 >> 3) & 14, 126);
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.progressindicator.b(f, downloadableAsset2, scrollState, i);
        }
    }
}
