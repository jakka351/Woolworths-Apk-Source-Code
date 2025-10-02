package au.com.woolworths.shop.productcard.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.shop.aem.components.model.chatentrycard.ChatEntryCard;
import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import au.com.woolworths.shop.productcard.data.ProductTile;
import au.com.woolworths.shop.productcard.ui.containers.ProductTileSheetUiKt;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsViewModel;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewViewModel;
import au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.ReviewsDetailsScreenKt;
import au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.SortingDropDownButtonKt;
import au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.SortingOption;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.SubmitReviewScreenKt;
import au.com.woolworths.shop.ratingsandreviews.ui.ReviewPreviewScreenUIKt;
import au.com.woolworths.shop.specials.SpecialsHomePageErrorState;
import au.com.woolworths.shop.specials.ui.SpecialsHomeScreenKt;
import com.halilibo.richtext.markdown.HtmlBlockKt;
import com.halilibo.richtext.ui.RichTextScope;
import com.halilibo.richtext.ui.RichTextStyle;
import com.halilibo.richtext.ui.RichTextStyleKt;
import com.woolworths.shop.product.ui.AddBannerKt;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(Object obj, int i, int i2, Object obj2) {
        this.d = i2;
        this.f = obj;
        this.e = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                UnitPriceDescriptionKt.a((TextWithAltData) this.f, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ProductTileSheetUiKt.a((ProductTile) this.f, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(49));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ReviewsDetailsScreenKt.g((ReviewsViewModel) this.f, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                SortingDropDownButtonKt.b((Function0) this.f, (SortingOption) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                SubmitReviewScreenKt.f((SubmitReviewViewModel) this.f, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ReviewPreviewScreenUIKt.a((ArrayList) this.f, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                SpecialsHomeScreenKt.b((SpecialsHomePageErrorState) this.f, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                SpecialsHomeScreenKt.a((ChatEntryCard) this.f, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.a(9));
                break;
            case 8:
                ((Integer) obj2).getClass();
                HtmlBlockKt.a((RichTextScope) this.f, (String) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                RichTextStyleKt.a((RichTextStyle) this.f, (ComposableLambdaImpl) this.e, (Composer) obj, RecomposeScopeImplKt.a(385));
                break;
            case 10:
                ((Integer) obj2).getClass();
                AddBannerKt.a((ActionableCard) this.f, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(9));
                break;
            default:
                CoroutineContext[] coroutineContextArr = (CoroutineContext[]) this.f;
                Ref.IntRef intRef = (Ref.IntRef) this.e;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                Intrinsics.h((Unit) obj, "<unused var>");
                Intrinsics.h(element, "element");
                int i = intRef.d;
                intRef.d = i + 1;
                coroutineContextArr[i] = element;
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(CoroutineContext[] coroutineContextArr, Ref.IntRef intRef) {
        this.d = 11;
        this.f = coroutineContextArr;
        this.e = intRef;
    }
}
