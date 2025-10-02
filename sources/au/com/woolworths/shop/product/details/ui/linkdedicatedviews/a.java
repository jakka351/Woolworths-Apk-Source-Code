package au.com.woolworths.shop.product.details.ui.linkdedicatedviews;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemData;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsContract;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsViewModel;
import au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.ReviewsDetailsScreenKt;
import au.com.woolworths.shop.rewards.ShopRewardsActivityUiKt;
import au.com.woolworths.shop.rewards.ShopRewardsViewModel;
import au.com.woolworths.shop.rewards.promo.PromoAppViewModel;
import au.com.woolworths.shop.rewards.promo.composable.PromoRewardsAppScreenKt;
import com.halilibo.richtext.ui.RichTextStyle;
import com.halilibo.richtext.ui.material.RichTextKt;
import com.woolworths.scanlibrary.ui.scanner.ScannerScreenKt;
import com.woolworths.scanlibrary.ui.scanner.ScannerViewModel;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ a(ViewModel viewModel, Function0 function0, Object obj, int i, int i2) {
        this.d = i2;
        this.f = viewModel;
        this.e = function0;
        this.g = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ParagraphTextScreenKt.a((String) this.f, (ParagraphTextItemData) this.g, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ReviewsDetailsScreenKt.d((ReviewsViewModel) this.f, (Function0) this.e, (ReviewsContract.ViewState) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ShopRewardsActivityUiKt.d((ShopRewardsViewModel) this.f, (Function0) this.e, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                PromoRewardsAppScreenKt.b((PromoAppViewModel) this.f, (Function1) this.g, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                RichTextKt.a((Modifier) this.f, (RichTextStyle) this.g, (ComposableLambdaImpl) this.e, (Composer) obj, RecomposeScopeImplKt.a(385));
                break;
            default:
                ((Integer) obj2).getClass();
                ScannerScreenKt.a((ScannerViewModel) this.f, (Function0) this.e, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(Object obj, Object obj2, Function function, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.e = function;
    }
}
