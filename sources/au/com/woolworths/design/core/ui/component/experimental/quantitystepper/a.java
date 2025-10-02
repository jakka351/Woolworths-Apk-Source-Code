package au.com.woolworths.design.core.ui.component.experimental.quantitystepper;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsTrackerRowUiKt;
import au.com.woolworths.feature.shop.modeselector.ui.PeekLazyRowKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.search.ContentStateKt;
import au.com.woolworths.sdui.legacy.title.CoreRowListTitleUIKt;
import au.com.woolworths.shared.ui.compose.StatefulButtonKt;
import au.com.woolworths.shop.checkout.ui.compose.FulfilmentFeesBottomSheetKt;
import au.com.woolworths.shop.product.details.ui.ProductNameKt;
import au.com.woolworths.shop.productcard.ui.components.PriceIntoTitleKt;
import au.com.woolworths.shop.ratingsandreviews.ui.reviewitem.ReviewCardKt;
import com.woolworths.shop.product.ui.tags.promotional.RewardsProductPromotionLabelKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ int g;

    public /* synthetic */ a(String str, Modifier modifier, int i, int i2) {
        this.d = 1;
        this.e = str;
        this.f = modifier;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                QuantityStepperKt.d(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 1:
                OfferDetailsTrackerRowUiKt.a(RecomposeScopeImplKt.a(1), this.g, composer, this.f, this.e);
                break;
            case 2:
                PeekLazyRowKt.a(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 3:
                ContentStateKt.f(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 4:
                ContentStateKt.g(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 5:
                CoreRowListTitleUIKt.a(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 6:
                StatefulButtonKt.a(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 7:
                FulfilmentFeesBottomSheetKt.g(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 8:
                ProductNameKt.a(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 9:
                PriceIntoTitleKt.a(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 10:
                ReviewCardKt.a(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            default:
                RewardsProductPromotionLabelKt.a(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(String str, Modifier modifier, int i, int i2, byte b) {
        this.d = i2;
        this.e = str;
        this.f = modifier;
        this.g = i;
    }
}
