package au.com.woolworths.shop.rewards.priming.ui;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.ImageKt;
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
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.shop.rewards.priming.data.CvpItem;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-rewards_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PrimingCvpTileUiKt {
    public static final void a(CvpItem cvpItem, Modifier modifier, Composer composer, int i) {
        Intrinsics.h(cvpItem, "cvpItem");
        ComposerImpl composerImplV = composer.v(2128387268);
        int i2 = (composerImplV.n(cvpItem) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 48);
            int i3 = composerImplV.P;
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
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier.Companion companion = Modifier.Companion.d;
            ImageKt.a(PainterResources_androidKt.a(cvpItem.f12906a, 0, composerImplV), null, SizeKt.q(companion, 40), null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 432, 120);
            SpacerKt.a(composerImplV, SizeKt.u(companion, 16));
            String strC = StringResources_androidKt.c(composerImplV, cvpItem.b);
            composerImplV.o(1334168323);
            TextStyle textStyleA = TextStyle.a(WxTheme.b(composerImplV).n, Color.b(WxTheme.a(composerImplV).c(), 0.6f), 0L, null, null, 0L, TextUnitKt.c(22), null, null, 0, 16646142);
            composerImplV.V(false);
            TextKt.b(strC, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleA, composerImplV, 0, 0, 65534);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.lists.ui.details.ui.compose.b(cvpItem, i, 15, modifier);
        }
    }
}
