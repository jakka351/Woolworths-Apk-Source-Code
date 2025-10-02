package au.com.woolworths.foundation.rewards.common.ui.shop.core;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.foundation.rewards.common.ui.iconasset.IconAssetUiKt;
import au.com.woolworths.foundation.rewards.common.ui.shop.a;
import au.com.woolworths.rewards.base.data.IconAsset;
import au.com.woolworths.rewards.base.data.TextWithAlt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShippingEtaUiKt {
    public static final void a(TextWithAlt textWithAlt, IconAsset.LocalAsset localAsset, Modifier modifier, Composer composer, int i) {
        int i2;
        IconAsset.LocalAsset localAsset2;
        ComposerImpl composerImplV = composer.v(-1821323380);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(textWithAlt) : composerImplV.I(textWithAlt) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            localAsset2 = localAsset;
            i2 |= composerImplV.I(localAsset2) ? 32 : 16;
        } else {
            localAsset2 = localAsset;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierE = SizeKt.e(modifier, 1.0f);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierE);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            long j = CoreTheme.b(composerImplV).e.c.f4854a;
            Modifier.Companion companion = Modifier.Companion.d;
            IconAssetUiKt.b(localAsset2, j, SizeKt.g(companion, 20), composerImplV, ((i2 >> 3) & 14) | KyberEngine.KyberPolyBytes, 0);
            Modifier modifierA = RowScopeInstance.f974a.a(PaddingKt.j(companion, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), 1.0f, true);
            composerImplV.o(5004770);
            boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && composerImplV.I(textWithAlt));
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new a(textWithAlt, 1);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            TextKt.a(textWithAlt.getText(), CoreTheme.f(composerImplV).f5120a.c.f5124a, SemanticsModifierKt.b(modifierA, false, (Function1) objG), 0L, null, 0, 0, false, 0, null, composerImplV, 0, 1016);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.shop.b(textWithAlt, localAsset, modifier, i, 1);
        }
    }
}
