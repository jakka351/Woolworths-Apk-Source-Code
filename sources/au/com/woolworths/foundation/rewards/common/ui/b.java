package au.com.woolworths.foundation.rewards.common.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferTileKt;
import au.com.woolworths.foundation.rewards.offers.ui.TintableTextKt;
import au.com.woolworths.foundation.rewards.offers.ui.TintableTextSpec;
import au.com.woolworths.foundation.shop.olive.voice.analytics.VoiceAnalytics;
import au.com.woolworths.foundation.shop.olive.voice.ui.lottie.GlowMaskCoverLottieKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.lottie.GlowMaskCoverLottiePhase;
import au.com.woolworths.foundation.swrve.embedded.campaign.consumer.StandardCampaignContent;
import au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui.BannerAssetUiKt;
import au.com.woolworths.shared.ui.compose.shop.chatentrycard.ChatEntryBannerUiKt;
import au.com.woolworths.shared.ui.compose.shop.chatentrycard.ChatEntryCardV3;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.QuickLinkCard;
import au.com.woolworths.shop.aem.components.model.contentcard.ContentCardData;
import au.com.woolworths.shop.aem.components.model.contentcard.ContentCardFooter;
import au.com.woolworths.shop.aem.components.model.contentcard.ContentCardTextHeightType;
import au.com.woolworths.shop.aem.components.model.method.MethodData;
import au.com.woolworths.shop.aem.components.model.method.MethodItemData;
import au.com.woolworths.shop.aem.components.ui.OfferCardKt;
import au.com.woolworths.shop.aem.components.ui.QuickLinkCardKt;
import au.com.woolworths.shop.aem.components.ui.contentcard.ContentCardKt;
import au.com.woolworths.shop.aem.components.ui.method.MethodUiKt;
import au.com.woolworths.shop.aem.components.ui.recipe.RecipeCardKt;
import au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel;
import au.com.woolworths.shop.buyagain.ui.composable.BuyAgainScreenKt;
import au.com.woolworths.shop.cart.domain.model.OfferProductList;
import au.com.woolworths.shop.cart.domain.model.ProductReviewCard;
import au.com.woolworths.shop.cart.ui.productalternative.TargetProductKt;
import au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferSuccessScreenKt;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscounts;
import au.com.woolworths.shop.checkout.ui.components.compose.CheckoutRewardsAndDiscountsUiKt;
import au.com.woolworths.shop.checkout.ui.substitution.SubstitutionContract;
import au.com.woolworths.shop.checkout.ui.substitution.component.SaveButtonKt;
import au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorScreenKt;
import au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorViewModel;
import au.com.woolworths.shop.lists.ui.details.models.ListDetailsTotalSectionSubItemBase;
import au.com.woolworths.shop.lists.ui.details.ui.compose.ListDetailsViewSectionKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.compose.ProductItemUiKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorScreenKt;
import au.com.woolworths.shop.lists.ui.utils.AnimationUtilsKt;
import au.com.woolworths.shop.product.details.ProductDetailsEvent;
import au.com.woolworths.shop.product.details.ProductDetailsPageErrorState;
import au.com.woolworths.shop.product.details.data.ProductDetailsCoreRow;
import au.com.woolworths.shop.product.details.ui.ProductDetailsCoreRowUIKt;
import au.com.woolworths.shop.product.details.ui.ProductDetailsScreenKt;
import au.com.woolworths.shop.product.details.ui.linkdedicatedviews.NutritionalInfoScreenKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(int i, int i2, Object obj, String str) {
        this.d = i2;
        this.f = str;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                TigerBannerKt.b((TigerBannerStatus) this.e, (String) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                RewardsOfferTileKt.b((Modifier) this.e, (ComposableLambdaImpl) this.f, (Composer) obj, RecomposeScopeImplKt.a(49));
                break;
            case 2:
                ((Integer) obj2).getClass();
                RewardsOfferTileKt.e((RewardsOfferData) this.e, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                TintableTextKt.a((TintableTextSpec) this.e, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 4:
                VoiceAnalytics voiceAnalytics = (VoiceAnalytics) this.e;
                Function0 function0 = (Function0) this.f;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                if (zBooleanValue) {
                    if (zBooleanValue2) {
                        voiceAnalytics.d("close");
                    } else {
                        voiceAnalytics.g("close");
                    }
                }
                function0.invoke();
                break;
            case 5:
                ((Integer) obj2).getClass();
                GlowMaskCoverLottieKt.a((GlowMaskCoverLottiePhase) this.e, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(49));
                break;
            case 6:
                ((Integer) obj2).getClass();
                BannerAssetUiKt.a((StandardCampaignContent.BannerAsset) this.e, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ChatEntryBannerUiKt.a((ChatEntryCardV3) this.e, (Function1) this.f, (Composer) obj, RecomposeScopeImplKt.a(9));
                break;
            case 8:
                ((Integer) obj2).getClass();
                OfferCardKt.b((ImageWithAltText) this.e, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                QuickLinkCardKt.b((QuickLinkCard) this.e, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ContentCardKt.c((String) this.f, (ContentCardTextHeightType) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ContentCardKt.d((ContentCardData) this.e, (ContentScale) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ContentCardKt.e((ContentCardFooter) this.e, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                MethodUiKt.b((MethodData) this.e, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(9));
                break;
            case 14:
                ((Integer) obj2).getClass();
                MethodUiKt.a((MethodItemData) this.e, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(49));
                break;
            case 15:
                ((Integer) obj2).getClass();
                RecipeCardKt.b((String) this.f, (Boolean) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                BuyAgainScreenKt.b((BuyAgainViewModel) this.e, (Function0) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                TargetProductKt.a((ProductReviewCard) this.e, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                QuickAddOfferSuccessScreenKt.d((OfferProductList.Success) this.e, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(49));
                break;
            case 19:
                ((Integer) obj2).getClass();
                CheckoutRewardsAndDiscountsUiKt.b((CheckoutRewardsAndDiscounts) this.e, (Function1) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                SaveButtonKt.b((Function0) this.e, (SubstitutionContract.ViewState.ButtonState) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                TimeSelectorScreenKt.a((TimeSelectorViewModel) this.e, (Function0) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                ListDetailsViewSectionKt.a((ListDetailsTotalSectionSubItemBase) this.e, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(49));
                break;
            case 23:
                ((Integer) obj2).getClass();
                ProductItemUiKt.c((ProductItemUiModel) this.e, (Function1) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                ProcessorScreenKt.c((byte[]) this.e, (Function0) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                AnimationUtilsKt.a((List) this.e, (ComposableLambdaImpl) this.f, (Composer) obj, RecomposeScopeImplKt.a(3505));
                break;
            case 26:
                ((Integer) obj2).getClass();
                ProductDetailsCoreRowUIKt.b((ProductDetailsCoreRow) this.e, (Function1) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                ProductDetailsScreenKt.b((ProductDetailsPageErrorState) this.e, (Function0) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 28:
                Function1 function1 = (Function1) this.e;
                Function0 function02 = (Function0) this.f;
                int iIntValue = ((Integer) obj).intValue();
                List images = (List) obj2;
                Intrinsics.h(images, "images");
                function1.invoke(new ProductDetailsEvent.OnOpenImageGallery(iIntValue));
                function02.invoke();
                break;
            default:
                ((Integer) obj2).getClass();
                NutritionalInfoScreenKt.b((List) this.e, (List) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(Object obj, int i, int i2, Object obj2) {
        this.d = i2;
        this.e = obj;
        this.f = obj2;
    }

    public /* synthetic */ b(Object obj, Function0 function0, int i) {
        this.d = i;
        this.e = obj;
        this.f = function0;
    }
}
