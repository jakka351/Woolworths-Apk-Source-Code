package au.com.woolworths.shop.lists.ui.shoppinglist.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SpecialsBannerKt {
    public static final void a(int i, Composer composer, Modifier modifier, Function0 onClick) {
        int i2;
        ComposerImpl composerImpl;
        Modifier modifier2;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(1572519789);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(onClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            modifier2 = modifier;
        } else {
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(12);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            composerImplV.o(5004770);
            boolean z = (i3 & 14) == 4;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.shop.lists.ui.magicmatch.ui.c(1, onClick);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierG = PaddingKt.g(ClickableKt.d(modifierE, false, null, null, (Function0) objG, 7), 20, 40);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(spacedAlignedG, Alignment.Companion.n, composerImplV, 54);
            int i4 = composerImplV.P;
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.shop_lists_specials_banner_title), null, 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).d.c.b, composerImplV, 0, 0, 65022);
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.shop_lists_specials_banner_link), null, CoreTheme.b(composerImplV).f4782a.d.b.f4798a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.b.b, composerImplV, 0, 0, 65530);
            composerImpl = composerImplV;
            composerImpl.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.card.unlock.b(onClick, modifier2, i, 17);
        }
    }
}
