package au.com.woolworths.feature.shop.trafficdrivers.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.TextStyle;
import androidx.paging.LoadState;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertSpec;
import au.com.woolworths.feature.shop.trafficdrivers.data.TrafficDriverItem;
import au.com.woolworths.feature.shop.voc.score.VocContract;
import au.com.woolworths.feature.shop.voc.score.VocSurveyCardKt;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContentKt;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderScreenKt;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderViewModel;
import au.com.woolworths.foundation.rewards.common.ui.iconlist.RewardsIconListModel;
import au.com.woolworths.foundation.rewards.common.ui.iconlist.internal.ActionItemUiKt;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.foundation.shop.cart.data.model.CartPromotionInfo;
import au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptBottomSheetKt;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState;
import au.com.woolworths.foundation.shop.olive.voice.ui.search.OliveStateKt;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage;
import au.com.woolworths.markdown.RichTextMarkdownKt;
import au.com.woolworths.sdui.common.alert.StandardAlertKt;
import au.com.woolworths.sdui.common.alert.model.CoreInsetAlertModel;
import au.com.woolworths.sdui.common.button.ButtonKt;
import au.com.woolworths.sdui.common.button.model.CoreButtonModel;
import au.com.woolworths.sdui.legacy.downloadableasset.DownloadableAssetUiKt;
import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthContentCardData;
import au.com.woolworths.shop.aem.components.model.downloadableAsset.DownloadableAssetData;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialBannerData;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialCarousel;
import au.com.woolworths.shop.aem.components.model.herobanner.HeroBanner;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemData;
import au.com.woolworths.shop.aem.components.ui.ParagraphMarkdownKt;
import au.com.woolworths.shop.aem.components.ui.contentcard.FullWidthContentCardKt;
import au.com.woolworths.shop.aem.components.ui.downloadableAsset.DownloadableAssetKt;
import au.com.woolworths.shop.aem.components.ui.editorialbanner.EditorialBannerKt;
import au.com.woolworths.shop.aem.components.ui.herobanner.HeroBannerKt;
import au.com.woolworths.shop.cart.ui.cart.CartItemPromotionInfoKt;
import au.com.woolworths.shop.checkout.domain.model.substitution.CheckoutSubstitutionPreferences;
import au.com.woolworths.shop.checkout.ui.components.compose.CheckoutSubstitutesRowKt;
import au.com.woolworths.shop.checkout.ui.components.compose.SubstitutionOnboardingBannerKt;
import au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector.DateSelectorKt;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentBottomSheetKt;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContract;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentViewModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.ui.InfoDialogKt;
import au.com.woolworths.shop.product.details.data.ButtonData;
import au.com.woolworths.shop.product.details.ui.ProductDetailsFooterUIKt;
import au.com.woolworths.shop.product.details.ui.ProductDetailsOffersRoundelsKt;
import au.com.woolworths.shop.product.details.ui.RoudelSizes;
import au.com.woolworths.shop.product.details.ui.everydaymarket.AboutEverydayMarketKt;
import au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.ReviewsDetailsScreenKt;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsDistributionSection;
import au.com.woolworths.shop.ratingsandreviews.ui.RatingsAndReviewsPreviewUIKt;
import au.com.woolworths.shop.receipts.ui.ReceiptListScreenKt;
import com.halilibo.richtext.markdown.node.AstNode;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ a(int i, int i2, Object obj, Object obj2, Object obj3, boolean z) {
        this.d = i2;
        this.g = obj;
        this.e = obj2;
        this.h = obj3;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                TrafficDriverUiKt.a((TrafficDriverItem) this.g, (Modifier) this.h, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                VocSurveyCardKt.d((VocContract.ViewState) this.g, (Function0) this.e, (Function3) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                WPayForOrderContentKt.g((PaymentMethodItem.PayPal) this.g, (String) this.h, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                WPayForOrderScreenKt.a((WPayForOrderContract.ViewState) this.g, (SheetState) this.h, (WPayForOrderViewModel) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ActionItemUiKt.a((RewardsIconListModel.Item.Action) this.g, (Function1) this.e, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                InstorePresencePromptBottomSheetKt.d((String) this.g, (Function0) this.e, (Function0) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                OliveStateKt.c((VoiceSearchState) this.g, (Function0) this.e, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                RichTextMarkdownKt.a((AstNode) this.g, (TextStyle) this.e, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                StandardAlertKt.b((CoreInsetAlertModel) this.g, (Modifier) this.h, (AlertSpec.Action) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ButtonKt.a((CoreButtonModel) this.g, (Function1) this.e, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                DownloadableAssetUiKt.a((DownloadableAsset) this.g, (ContentScale) this.e, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ParagraphMarkdownKt.a((ParagraphTextItemData) this.g, (Modifier) this.h, (Function2) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                FullWidthContentCardKt.c((FullWidthContentCardData) this.g, (Function1) this.e, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                DownloadableAssetKt.a((DownloadableAssetData) this.g, (ContentScale) this.e, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                EditorialBannerKt.d((EditorialBannerData) this.g, (Modifier) this.h, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                EditorialBannerKt.c((EditorialCarousel) this.g, (Function1) this.e, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                HeroBannerKt.a((HeroBanner) this.g, (Function1) this.h, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                CartItemPromotionInfoKt.a((CartPromotionInfo) this.g, (Function0) this.e, (Function0) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                CheckoutSubstitutesRowKt.a((CheckoutSubstitutionPreferences) this.g, (Function1) this.e, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                SubstitutionOnboardingBannerKt.a((BroadcastBannerData) this.g, (Function1) this.h, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                DateSelectorKt.a((ArrayList) this.g, (Modifier) this.h, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 21:
                PaymentContract.ViewState viewState = (PaymentContract.ViewState) this.g;
                SheetState sheetState = (SheetState) this.h;
                PaymentViewModel paymentViewModel = (PaymentViewModel) this.e;
                ((Integer) obj2).intValue();
                PaymentBottomSheetKt.a(RecomposeScopeImplKt.a(this.f | 1), (Composer) obj, sheetState, viewState, paymentViewModel);
                break;
            case 22:
                ((Integer) obj2).getClass();
                InfoDialogKt.a((ResText) this.g, (ResText) this.h, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                ProductDetailsFooterUIKt.b((ButtonData) this.g, (Modifier) this.h, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                ProductDetailsOffersRoundelsKt.b((RoudelSizes) this.g, (String) this.h, (String) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                AboutEverydayMarketKt.c((InfoSection) this.g, (Function0) this.e, (Modifier) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                ReviewsDetailsScreenKt.b((LoadState.Error) this.g, (Function0) this.e, (Function1) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 27:
                ((Integer) obj2).intValue();
                RatingsAndReviewsPreviewUIKt.a((RatingsDistributionSection) this.g, (Function2) this.h, (Function2) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 28:
                ((Integer) obj2).intValue();
                ReceiptListScreenKt.a((FullPageMessage) this.g, (Function0) this.e, (Function0) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ReceiptListScreenKt.e((LoadState.Error) this.g, (Function0) this.e, (Function0) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.d = i2;
        this.g = obj;
        this.h = obj2;
        this.e = obj3;
        this.f = i;
    }
}
