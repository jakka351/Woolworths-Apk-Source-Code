package au.com.woolworths.shop.checkout.ui.compose;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.models.text.PluralResText;
import au.com.woolworths.rewards.tooltip.Tooltip;
import au.com.woolworths.shop.checkout.domain.model.idverification.IdVerificationBottomSheet;
import au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsContract;
import au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsScreenKt;
import au.com.woolworths.shop.checkout.ui.timeselector.compose.InfoModalKt;
import au.com.woolworths.shop.lists.data.model.ShoppingListWithItems;
import au.com.woolworths.shop.lists.ui.lists.compose.WatchlistUiKt;
import au.com.woolworths.shop.product.details.ProductDetailsContract;
import au.com.woolworths.shop.product.details.ui.linkdedicatedviews.FullScreenImageGalleryScreenKt;
import au.com.woolworths.shop.rewards.ShopRewardsActivityUiKt;
import au.com.woolworths.shop.rewards.ShopRewardsContract;
import au.com.woolworths.shop.rewards.promo.PromoRewardsAppContract;
import au.com.woolworths.shop.rewards.promo.composable.PromoRewardsAppScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class k implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ k(IdVerificationBottomSheet idVerificationBottomSheet, Function0 function0, Function0 function02, Function0 function03, int i) {
        this.d = 0;
        this.g = idVerificationBottomSheet;
        this.e = function0;
        this.f = function02;
        this.h = function03;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                IdVerificationBottomSheetKt.b((IdVerificationBottomSheet) this.g, this.e, (Function0) this.f, (Function0) this.h, (Composer) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(1);
                ContactDetailsScreenKt.a((ContactDetailsContract.ViewState) this.g, (Function1) this.h, this.e, (Function0) this.f, (Composer) obj, iA2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iA3 = RecomposeScopeImplKt.a(1);
                InfoModalKt.a((String) this.g, (String) this.f, this.e, (Modifier) this.h, (Composer) obj, iA3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iA4 = RecomposeScopeImplKt.a(1);
                WatchlistUiKt.a((ShoppingListWithItems) this.g, (PluralResText) this.f, this.e, (Modifier) this.h, (Composer) obj, iA4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iA5 = RecomposeScopeImplKt.a(1);
                FullScreenImageGalleryScreenKt.a((ProductDetailsContract.ViewState) this.g, (PagerState) this.f, this.e, (Function1) this.h, (Composer) obj, iA5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iA6 = RecomposeScopeImplKt.a(3073);
                ShopRewardsActivityUiKt.b((ShopRewardsContract.ViewState) this.g, (Tooltip) this.h, this.e, (Function0) this.f, (Composer) obj, iA6);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA7 = RecomposeScopeImplKt.a(9);
                PromoRewardsAppScreenKt.c((PromoRewardsAppContract.ViewState) this.g, (Function1) this.h, this.e, (Function0) this.f, (Composer) obj, iA7);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ k(Object obj, Object obj2, Function0 function0, Object obj3, int i, int i2) {
        this.d = i2;
        this.g = obj;
        this.f = obj2;
        this.e = function0;
        this.h = obj3;
    }

    public /* synthetic */ k(Object obj, Object obj2, Function0 function0, Function0 function02, int i, int i2) {
        this.d = i2;
        this.g = obj;
        this.h = obj2;
        this.e = function0;
        this.f = function02;
    }
}
