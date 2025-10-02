package au.com.woolworths.feature.shop.inbox.ui.component;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.ProductFinderOnboardingViewModel;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.ui.ProductFinderOnboardingScreenKt;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductCard;
import au.com.woolworths.product.composeui.ProductLocationInfoKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.aem.components.model.offercard.OfferCardData;
import au.com.woolworths.shop.aem.components.ui.OfferCardKt;
import au.com.woolworths.shop.cart.ui.ProductSectionItemListener;
import au.com.woolworths.shop.cart.ui.cart.CartProductKt;
import au.com.woolworths.shop.checkout.ui.timeselector.compose.timeofdayselector.TimeOfDayItemKt;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.RatingSubmissionTermsAndConditionsKt;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ a(ProductCard productCard, Modifier modifier, boolean z, Function0 function0, Function0 function02, int i, int i2) {
        this.d = 2;
        this.i = productCard;
        this.g = modifier;
        this.f = z;
        this.j = function0;
        this.k = function02;
        this.e = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                LinkButtonKt.a((String) this.i, (Function0) this.j, (Modifier) this.g, this.f, (PaddingValues) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1), this.h);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ProductFinderOnboardingScreenKt.b((List) this.i, this.e, (PagerState) this.j, (ProductFinderOnboardingViewModel) this.k, this.f, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ProductLocationInfoKt.a((ProductCard) this.i, (Modifier) this.g, this.f, (Function0) this.j, (Function0) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1), this.h);
                break;
            case 3:
                ((Integer) obj2).getClass();
                OfferCardKt.a((OfferCardData) this.i, (Function1) this.j, (Modifier) this.g, this.f, (SharedIntrinsicHeightState) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1), this.h);
                break;
            case 4:
                ((Integer) obj2).getClass();
                CartProductKt.a(this.f, (CartProductCard) this.i, (Double) this.j, (ProductSectionItemListener) this.g, (Function1) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1), this.h);
                break;
            case 5:
                ((Integer) obj2).getClass();
                TimeOfDayItemKt.a(this.f, (String) this.i, (ImageVector) this.k, (Function0) this.j, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1), this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                RatingSubmissionTermsAndConditionsKt.a((String) this.i, this.f, (Function1) this.j, (String) this.k, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1), this.h);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(Object obj, Function function, Modifier modifier, boolean z, Object obj2, int i, int i2, int i3) {
        this.d = i3;
        this.i = obj;
        this.j = function;
        this.g = modifier;
        this.f = z;
        this.k = obj2;
        this.e = i;
        this.h = i2;
    }

    public /* synthetic */ a(String str, boolean z, Function1 function1, String str2, Modifier modifier, int i, int i2) {
        this.d = 6;
        this.i = str;
        this.f = z;
        this.j = function1;
        this.k = str2;
        this.g = modifier;
        this.e = i;
        this.h = i2;
    }

    public /* synthetic */ a(List list, int i, PagerState pagerState, ProductFinderOnboardingViewModel productFinderOnboardingViewModel, boolean z, Modifier modifier, int i2) {
        this.d = 1;
        this.i = list;
        this.e = i;
        this.j = pagerState;
        this.k = productFinderOnboardingViewModel;
        this.f = z;
        this.g = modifier;
        this.h = i2;
    }

    public /* synthetic */ a(boolean z, CartProductCard cartProductCard, Double d, ProductSectionItemListener productSectionItemListener, Function1 function1, int i, int i2) {
        this.d = 4;
        this.f = z;
        this.i = cartProductCard;
        this.j = d;
        this.g = productSectionItemListener;
        this.k = function1;
        this.e = i;
        this.h = i2;
    }

    public /* synthetic */ a(boolean z, String str, ImageVector imageVector, Function0 function0, Modifier modifier, int i, int i2) {
        this.d = 5;
        this.f = z;
        this.i = str;
        this.k = imageVector;
        this.j = function0;
        this.g = modifier;
        this.e = i;
        this.h = i2;
    }
}
