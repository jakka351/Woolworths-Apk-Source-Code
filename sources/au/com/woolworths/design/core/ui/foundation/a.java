package au.com.woolworths.design.core.ui.foundation;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.ui.ProductFinderOnboardingScreenKt;
import au.com.woolworths.feature.shop.storelocator.details.StoreDetailsContract;
import au.com.woolworths.feature.shop.storelocator.details.StoreDetailsScreenKt;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsContract;
import au.com.woolworths.feature.shop.trafficdrivers.ui.TagLabelUiKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.TagLabel;
import au.com.woolworths.shop.deliveryunlimited.signup.domain.model.DeliveryUnlimitedPaymentResponse;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContentKt;
import au.com.woolworths.shop.product.details.ui.ProductDetailsScreenKt;
import com.halilibo.richtext.ui.HorizontalRuleKt;
import com.halilibo.richtext.ui.RichTextScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(int i, int i2, Object obj) {
        this.d = i2;
        this.f = obj;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) this.f;
                ((Integer) obj2).getClass();
                CoreThemeKt.b(RecomposeScopeImplKt.a(this.e | 1), (Composer) obj, composableLambdaImpl);
                break;
            case 1:
                ((Integer) obj2).intValue();
                ProductFinderOnboardingScreenKt.c((RowScope) this.f, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                StoreDetailsScreenKt.b((StoreDetailsContract.ViewState) this.f, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsScreenKt.b((StoreDetailsContract.ViewState) this.f, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                TagLabelUiKt.a((TagLabel) this.f, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                PaymentContentKt.c((DeliveryUnlimitedPaymentResponse) this.f, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                ProductDetailsScreenKt.e((ProductCard) this.f, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                HorizontalRuleKt.a((RichTextScope) this.f, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
        }
        return Unit.f24250a;
    }
}
