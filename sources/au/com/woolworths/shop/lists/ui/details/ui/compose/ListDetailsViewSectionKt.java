package au.com.woolworths.shop.lists.ui.details.ui.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.design.wx.foundation.AccentColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.shop.lists.ui.details.models.ListDetailsPotentialSavings;
import au.com.woolworths.shop.lists.ui.details.models.ListDetailsRewardsSummary;
import au.com.woolworths.shop.lists.ui.details.models.ListDetailsTotalSectionHeader;
import au.com.woolworths.shop.lists.ui.details.models.ListDetailsTotalSectionSubItemBase;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ListDetailsViewSectionKt {
    public static final void a(ListDetailsTotalSectionSubItemBase section, Modifier modifier, Composer composer, int i) {
        long jC;
        Intrinsics.h(section, "section");
        ComposerImpl composerImplV = composer.v(1963918678);
        if ((((composerImplV.n(section) ? 4 : 2) | i) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierJ = PaddingKt.j(modifier, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2, 7);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i2 = composerImplV.P;
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
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.b(section.getF12313a(), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, b(section, composerImplV), composerImplV, 0, 0, 65534);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            Modifier.Companion companion = Modifier.Companion.d;
            SpacerKt.a(composerImplV, rowScopeInstance.a(companion, 1.0f, true));
            SingletonAsyncImageKt.a(section.getC(), null, PaddingKt.j(SizeKt.k(companion, 26), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, 11), null, null, composerImplV, 432, 2040);
            String b = section.getB();
            TextStyle textStyleB = b(section, composerImplV);
            composerImplV.o(288748828);
            if (section instanceof ListDetailsPotentialSavings) {
                composerImplV.o(-1685244703);
                jC = WxTheme.a(composerImplV).g();
                composerImplV.V(false);
            } else if (section instanceof ListDetailsRewardsSummary) {
                composerImplV.o(-1685242813);
                composerImplV.V(false);
                jC = AccentColors.d;
            } else {
                composerImplV.o(-1685241405);
                jC = WxTheme.a(composerImplV).c();
                composerImplV.V(false);
            }
            composerImplV.V(false);
            TextKt.b(b, null, jC, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleB, composerImplV, 0, 0, 65530);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.b(section, i, 22, modifier);
        }
    }

    public static final TextStyle b(ListDetailsTotalSectionSubItemBase listDetailsTotalSectionSubItemBase, Composer composer) {
        TextStyle textStyle;
        composer.o(1659518545);
        if (listDetailsTotalSectionSubItemBase instanceof ListDetailsTotalSectionHeader) {
            composer.o(1364460923);
            textStyle = WxTheme.b(composer).o;
            composer.l();
        } else {
            composer.o(1364462389);
            textStyle = WxTheme.b(composer).n;
            composer.l();
        }
        composer.l();
        return textStyle;
    }
}
