package au.com.woolworths.feature.rewards.offers.ui.details;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.foundation.rewards.common.ui.iconasset.IconAssetUiKt;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsCardRow;
import au.com.woolworths.rewards.base.data.IconAsset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OfferDetailsInfoItemUiKt {
    public static final void a(OfferDetailsCardRow.OfferDetailsInfoItem item, Composer composer, int i) {
        Intrinsics.h(item, "item");
        ComposerImpl composerImplV = composer.v(883025235);
        if ((((composerImplV.I(item) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierA = TestTagKt.a(companion, "offer_details_info_item");
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 48);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            IconAsset iconAsset = item.f8606a;
            composerImplV.o(-91144200);
            if (iconAsset != null) {
                IconAssetUiKt.b(iconAsset, Color.i, SizeKt.q(companion, 20), composerImplV, 432, 0);
                SpacerKt.a(composerImplV, SizeKt.u(companion, 8));
            }
            composerImplV.V(false);
            String str = item.b;
            composerImplV.o(-91136000);
            if (str != null) {
                TextKt.b(str, null, CoreTheme.b(composerImplV).e.d.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.b.f5123a, composerImplV, 0, 0, 65530);
                composerImplV = composerImplV;
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.chip.e(i, 16, item);
        }
    }
}
