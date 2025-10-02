package au.com.woolworths.shop.lists.ui.lists.compose;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.android.onesite.models.text.PluralResText;
import au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui.f;
import au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelKt;
import au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelStyle;
import au.com.woolworths.shop.checkout.ui.compose.k;
import au.com.woolworths.shop.lists.data.model.ShoppingListWithItems;
import au.com.woolworths.shop.lists.ui.ListTitleRowKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class WatchlistUiKt {
    public static final void a(ShoppingListWithItems watchlist, final PluralResText pluralResText, Function0 onClick, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.h(watchlist, "watchlist");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-452688227);
        int i2 = i | (composerImplV.I(watchlist) ? 4 : 2) | (composerImplV.I(pluralResText) ? 32 : 16) | (composerImplV.I(onClick) ? 256 : 128) | 3072;
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            composerImplV.o(5004770);
            boolean z = (i2 & 896) == 256;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new f(27, onClick);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            modifier2 = Modifier.Companion.d;
            Modifier modifierD = ClickableKt.d(modifier2, false, null, null, (Function0) objG, 7);
            composerImplV.o(-1241679565);
            String strC = watchlist.getItemCount() == 0 ? StringResources_androidKt.c(composerImplV, R.string.shop_lists_watchlist_subtitle) : null;
            composerImplV.V(false);
            ListTitleRowKt.a(watchlist, modifierD, strC, ComposableLambdaKt.c(-1065591755, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.lists.compose.WatchlistUiKt$WatchlistUi$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    RowScope ListTitleRow = (RowScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(ListTitleRow, "$this$ListTitleRow");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        PluralResText pluralResText2 = pluralResText;
                        if (pluralResText2 != null) {
                            BrandLabelKt.b(pluralResText2.getText((Context) composer2.x(AndroidCompositionLocals_androidKt.b)).toString(), BrandLabelStyle.i, false, true, null, true, composer2, 1576368, 48);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i2 & 14) | 3072, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new k(watchlist, pluralResText, onClick, modifier2, i, 3);
        }
    }
}
