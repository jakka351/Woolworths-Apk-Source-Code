package au.com.woolworths.feature.rewards.card.overlay.ui;

import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingsItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanFooterItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtraFaqsSectionItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasLandingFooterItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasSubscribeFooterItem;
import au.com.woolworths.feature.rewards.offers.RewardsOfferBaseContract;
import au.com.woolworths.feature.rewards.offers.SectionViewItem;
import au.com.woolworths.feature.rewards.offers.SpinSurpriseBannerViewItem;
import au.com.woolworths.feature.rewards.offers.StandardBannerViewItem;
import au.com.woolworths.feature.rewards.offers.data.BoostersHeaderAddOn;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsCtaViewState;
import au.com.woolworths.feature.rewards.redemptionsettings.RedemptionItemClickListener;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsViewModel;
import au.com.woolworths.feature.rewards.redemptionsettings.data.RewardsRedemptionAction;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesContract;
import au.com.woolworths.feature.shared.force.upgrade.UpdateDialogType;
import au.com.woolworths.feature.shared.force.upgrade.UpdateFullScreenType;
import au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiContract;
import au.com.woolworths.feature.shared.web.file.uploader.permission.CameraPermissionViewModel;
import au.com.woolworths.feature.shop.contentpage.ContentPageUiEvent;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import au.com.woolworths.product.models.PromotionCard;
import au.com.woolworths.shop.aem.components.model.verticallist.VerticalListData;
import au.com.woolworths.shop.aem.components.model.video.VideoData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ((Function1) this.e).invoke(((RewardsCardData) this.f).getNumber());
                break;
            case 1:
                ((Function1) this.e).invoke((EverydayExtrasChoosePlanFooterItem.Button) this.f);
                break;
            case 2:
                ((Function1) this.e).invoke((EverydayExtrasChoosePlanContentItem.SubscribePlan) this.f);
                break;
            case 3:
                ((Function1) this.e).invoke((EverydayExtrasChoosePlanContentItem.Button) this.f);
                break;
            case 4:
                ((Function1) this.e).invoke((EverydayExtraFaqsSectionItem.FaqsFaqUiItem) this.f);
                break;
            case 5:
                ((Function1) this.e).invoke((EverydayExtrasLandingFooterItem.Button) this.f);
                break;
            case 6:
                ((Function1) this.e).invoke((EverydayExtrasSubscribeFooterItem.Button) this.f);
                break;
            case 7:
                ((Function1) this.e).invoke((EverydayExtrasSubscribeFooterItem.SubscribeContentCta) this.f);
                break;
            case 8:
                break;
            case 9:
                Function2 function2 = (Function2) this.e;
                OfferDetailsCtaViewState.StatelessCtaView statelessCtaView = (OfferDetailsCtaViewState.StatelessCtaView) ((OfferDetailsCtaViewState) this.f);
                function2.invoke(statelessCtaView.b.getLabel(), statelessCtaView.c);
                break;
            case 10:
                ((Function1) this.e).invoke((SectionViewItem) this.f);
                break;
            case 11:
                RewardsOfferBaseContract.RewardsCtaCardListener rewardsCtaCardListener = (RewardsOfferBaseContract.RewardsCtaCardListener) this.e;
                rewardsCtaCardListener.f6239a.invoke((SectionViewItem) this.f);
                break;
            case 12:
                ((Function1) this.e).invoke(((BoostersHeaderAddOn.Cta) this.f).b);
                break;
            case 13:
                ((Function1) this.e).invoke((SpinSurpriseBannerViewItem) this.f);
                break;
            case 14:
                ((Function1) this.e).invoke((StandardBannerViewItem) this.f);
                break;
            case 15:
                ((RewardsRedemptionSettingsViewModel) this.e).p6((RewardsRedemptionSettingsItem) this.f);
                break;
            case 16:
                ((SecurityPreferencesContract.ViewState) this.e).d.invoke(new SecurityPreferencesContract.ViewModelAction.ChangeLock(((SecurityPreferencesContract.Content.UpdateError) ((SecurityPreferencesContract.Content) this.f)).f6456a));
                break;
            case 17:
                ((RedemptionItemClickListener) this.e).X4((RewardsRedemptionAction) this.f);
                break;
            case 18:
                Function1 function1 = (Function1) this.e;
                String str = ((UpdateDialogType.OsFlexibleUpdate) ((UpdateDialogType) this.f)).d;
                if (str == null) {
                    str = "Not now";
                }
                function1.invoke(str);
                break;
            case 19:
                ((Function1) this.e).invoke(((UpdateFullScreenType) this.f).getC());
                break;
            case 20:
                ((Function1) this.e).invoke((InstoreWifiContract.ErrorType) this.f);
                break;
            case 21:
                CameraPermissionViewModel cameraPermissionViewModel = (CameraPermissionViewModel) this.e;
                Function0 function0 = (Function0) this.f;
                cameraPermissionViewModel.p6();
                function0.invoke();
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                ((Function1) this.e).invoke(new ContentPageUiEvent.OnVideoPlayClick((VideoData) this.f));
                break;
            case 26:
                Function1 function12 = (Function1) this.e;
                VideoData videoData = (VideoData) this.f;
                Intrinsics.e(videoData);
                function12.invoke(videoData);
                break;
            case 27:
                Function1 function13 = (Function1) this.e;
                HorizontalListData horizontalListData = (HorizontalListData) this.f;
                if (function13 != null) {
                    function13.invoke(horizontalListData);
                }
                break;
            case 28:
                Function1 function14 = (Function1) this.e;
                PromotionCard promotionCard = (PromotionCard) this.f;
                if (function14 != null) {
                    function14.invoke(promotionCard.getProductCard());
                }
                break;
            default:
                Function1 function15 = (Function1) this.e;
                VerticalListData verticalListData = (VerticalListData) this.f;
                if (function15 != null) {
                    function15.invoke(verticalListData);
                }
                break;
        }
        return Unit.f24250a;
    }
}
