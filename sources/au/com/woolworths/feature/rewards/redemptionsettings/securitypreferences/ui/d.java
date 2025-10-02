package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.feature.shop.brandedshop.data.BrandedShopProductGridConfig;
import au.com.woolworths.feature.shop.brandedshop.ui.product.ProductCardKt;
import au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartScreenKt;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionUnlinkedCreditCardItemKt;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.shop.cart.ui.productreview.ProductReviewScreenKt;
import au.com.woolworths.shop.cart.ui.productreview.ProductsReviewCallbacks;
import au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.SortingDropDownButtonKt;
import au.com.woolworths.shop.specials.SpecialsHomeViewModel;
import au.com.woolworths.shop.specials.ui.HorizontalListKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ d(int i, int i2, Object obj, Object obj2, Object obj3, boolean z) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.e = z;
        this.h = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                SecurePreferenceUIKt.a((String) this.f, (String) this.g, this.e, (Modifier) this.h, (Composer) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(1);
                ProductCardKt.b((List) this.f, (BrandedShopProductGridConfig) this.g, (ProductClickListener) this.h, this.e, (Composer) obj, iA2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iA3 = RecomposeScopeImplKt.a(1);
                InstoreCartScreenKt.g((ArrayList) this.f, this.e, (Function1) this.g, (Modifier) this.h, (Composer) obj, iA3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iA4 = RecomposeScopeImplKt.a(1);
                SectionOptionUnlinkedCreditCardItemKt.a((PaymentMethodItem.CreditCard.Unlinked) this.f, this.e, (Function0) this.g, (Function0) this.h, (Composer) obj, iA4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iA5 = RecomposeScopeImplKt.a(385);
                ProductReviewScreenKt.a(this.e, (ProductsReviewCallbacks) this.f, (Function0) this.g, (Function0) this.h, (Composer) obj, iA5);
                break;
            case 5:
                List list = (List) this.f;
                Function0 function0 = (Function0) this.g;
                Function1 function1 = (Function1) this.h;
                ((Integer) obj2).getClass();
                SortingDropDownButtonKt.a(RecomposeScopeImplKt.a(391), (Composer) obj, list, function0, function1, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA6 = RecomposeScopeImplKt.a(1);
                HorizontalListKt.b((HorizontalListData) this.f, (SpecialsHomeViewModel) this.g, this.e, (List) this.h, (Composer) obj, iA6);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ d(Object obj, boolean z, Function function, Object obj2, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.e = z;
        this.g = function;
        this.h = obj2;
    }

    public /* synthetic */ d(List list, BrandedShopProductGridConfig brandedShopProductGridConfig, ProductClickListener productClickListener, boolean z, int i) {
        this.d = 1;
        this.f = list;
        this.g = brandedShopProductGridConfig;
        this.h = productClickListener;
        this.e = z;
    }

    public /* synthetic */ d(boolean z, ProductsReviewCallbacks productsReviewCallbacks, Function0 function0, Function0 function02, int i) {
        this.d = 4;
        this.e = z;
        this.f = productsReviewCallbacks;
        this.g = function0;
        this.h = function02;
    }
}
