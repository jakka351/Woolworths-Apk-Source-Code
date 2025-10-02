package au.com.woolworths.feature.rewards.account.closeaccount.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.shop.account.ui.details.components.AccountDetailsContentKt;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState;
import au.com.woolworths.foundation.shop.olive.voice.ui.search.ContentStateKt;
import au.com.woolworths.product.composeui.ProductPricingFootnoteLabelKt;
import au.com.woolworths.product.composeui.ProductWasPriceLabelKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.aem.components.model.button.ButtonData;
import au.com.woolworths.shop.cart.domain.model.PageResult;
import au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeScreenKt;
import au.com.woolworths.shop.cart.ui.productalternative.ProductsReviewAlternativeCallbacks;
import au.com.woolworths.shop.lists.ui.shoppinglist.compose.ListDetailsEmptyUiKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ f(ProductCard productCard, boolean z, Modifier modifier, boolean z2, int i) {
        this.d = 3;
        this.i = productCard;
        this.e = z;
        this.g = modifier;
        this.f = z2;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).intValue();
                ConsentPageUiKt.d((ContentCta) this.i, this.e, this.f, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AccountDetailsContentKt.c((ButtonData) this.i, this.e, this.f, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ContentStateKt.a((VoiceSearchState) this.i, this.e, this.f, (Modifier) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ProductPricingFootnoteLabelKt.b((ProductCard) this.i, this.e, (Modifier) this.g, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ProductWasPriceLabelKt.b((String) this.i, (Modifier) this.g, this.e, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ProductReviewAlternativeScreenKt.b(this.e, this.f, (PageResult) this.i, (ProductsReviewAlternativeCallbacks) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ListDetailsEmptyUiKt.a(this.e, this.f, (Function1) this.g, (Function0) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ f(Object obj, boolean z, boolean z2, Object obj2, int i, int i2) {
        this.d = i2;
        this.i = obj;
        this.e = z;
        this.f = z2;
        this.g = obj2;
        this.h = i;
    }

    public /* synthetic */ f(String str, Modifier modifier, boolean z, boolean z2, int i) {
        this.d = 4;
        this.i = str;
        this.g = modifier;
        this.e = z;
        this.f = z2;
        this.h = i;
    }

    public /* synthetic */ f(boolean z, boolean z2, PageResult pageResult, ProductsReviewAlternativeCallbacks productsReviewAlternativeCallbacks, int i) {
        this.d = 5;
        this.e = z;
        this.f = z2;
        this.i = pageResult;
        this.g = productsReviewAlternativeCallbacks;
        this.h = i;
    }

    public /* synthetic */ f(boolean z, boolean z2, Function1 function1, Function0 function0, int i) {
        this.d = 6;
        this.e = z;
        this.f = z2;
        this.g = function1;
        this.i = function0;
        this.h = i;
    }
}
