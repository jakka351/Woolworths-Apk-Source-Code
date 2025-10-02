package au.com.woolworths.feature.shop.more;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.adobe.data.ActionData;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import au.com.woolworths.feature.shop.banners.BannerClickListener;
import au.com.woolworths.feature.shop.banners.broadcastbanner.BannerDismissInteractor;
import au.com.woolworths.feature.shop.more.MoreContract;
import au.com.woolworths.feature.shop.more.analytics.MoreActions;
import au.com.woolworths.feature.shop.more.data.LocalAction;
import au.com.woolworths.feature.shop.more.data.MoreDeliveryUnlimited;
import au.com.woolworths.feature.shop.more.data.MoreDeliveryUnlimitedUnavailable;
import au.com.woolworths.feature.shop.more.data.MoreFeed;
import au.com.woolworths.feature.shop.more.data.MoreTileType;
import au.com.woolworths.feature.shop.more.newbadge.NewBadgeInteractor;
import au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppFlavorInteractor;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.model.deliveryunilimited.DeliveryUnlimitedStatus;
import au.com.woolworths.foundation.shop.onboarding.data.OnboardingInteractorImpl;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.auth.ShopAuthManager;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/feature/shop/more/MoreClickListener;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/feature/shop/more/MoreContract$RewardsCardListener;", "Lau/com/woolworths/feature/shop/banners/BannerClickListener;", "Companion", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MoreViewModel extends ViewModel implements MoreClickListener, FullPageErrorStateClickHandler, MoreContract.RewardsCardListener, BannerClickListener {
    public String A;
    public String B;
    public MoreFeed C;
    public MoreDeliveryUnlimitedUnavailable D;
    public final RewardsAccountInteractor e;
    public final AnalyticsManager f;
    public final LegacyShopAnalyticsManager g;
    public final SchedulersProvider h;
    public final NewBadgeInteractor i;
    public final AppConfig j;
    public final FeatureToggleManager k;
    public final MoreInteractor l;
    public final BannerDismissInteractor m;
    public final CollectionModeInteractor n;
    public final ShopAuthManager o;
    public final ShopAccountInteractor p;
    public final OnboardingInteractorImpl q;
    public final ShopAppRegionInteractor r;
    public final AppConfigClientImpl s;
    public final ShopAppFlavorInteractor t;
    public final MutableLiveData u;
    public final SharedFlowImpl v;
    public final Flow w;
    public final CompositeDisposable x;
    public final String y;
    public final MutableLiveData z;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreViewModel$Companion;", "", "", "MY_ACCOUNT_INDEX_POSITION", "I", "E_RECEIPTS_POSITION", "LOGIN_AND_SECURITY_INDEX_POSITION", "EVERYDAY_EXTRA_INDEX_POSITION", "CHAT_TO_US_INDEX_POSITION", "DELIVERY_UNLIMITED_INDEX_POSITION", "EXPLAINING_VALUE_INDEX_POSITION", "REWARDS_INDEX_POSITION", "SCAN_AND_GO_INDEX_POSITION", "RECEIPT_PREFERENCES_POSITION", "NOTIFICATIONS_POSITION", "FOOD_TRACKER_INDEX_POSITION", "INSTORE_WIFI_INDEX_POSITION", "ONLINE_SHOPPING_POSITION", "", "MAGIC_LINK_2FA", "Ljava/lang/String;", "MAGIC_LINK_MY_ACCOUNT", "MAGIC_LINK_LOGIN_AND_SECURITY", "FREE_TRIAL", "SUBSCRIBE", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7606a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[MoreTileType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MoreTileType moreTileType = MoreTileType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MoreTileType moreTileType2 = MoreTileType.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MoreTileType moreTileType3 = MoreTileType.d;
                iArr[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MoreTileType moreTileType4 = MoreTileType.d;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                MoreTileType moreTileType5 = MoreTileType.d;
                iArr[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                MoreTileType moreTileType6 = MoreTileType.d;
                iArr[7] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                MoreTileType moreTileType7 = MoreTileType.d;
                iArr[8] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                MoreTileType moreTileType8 = MoreTileType.d;
                iArr[10] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                MoreTileType moreTileType9 = MoreTileType.d;
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                MoreTileType moreTileType10 = MoreTileType.d;
                iArr[11] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                MoreTileType moreTileType11 = MoreTileType.d;
                iArr[12] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                MoreTileType moreTileType12 = MoreTileType.d;
                iArr[13] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                MoreTileType moreTileType13 = MoreTileType.d;
                iArr[14] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                MoreTileType moreTileType14 = MoreTileType.d;
                iArr[15] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                MoreTileType moreTileType15 = MoreTileType.d;
                iArr[16] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                MoreTileType moreTileType16 = MoreTileType.d;
                iArr[17] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                MoreTileType moreTileType17 = MoreTileType.d;
                iArr[4] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                MoreTileType moreTileType18 = MoreTileType.d;
                iArr[19] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            int[] iArr2 = new int[DeliveryUnlimitedStatus.values().length];
            try {
                iArr2[DeliveryUnlimitedStatus.NOT_SUBSCRIBED.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            f7606a = iArr2;
            int[] iArr3 = new int[Activities.RewardsSetupMoreActivity.RewardsSetupEntryPoint.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                Activities.RewardsSetupMoreActivity.RewardsSetupEntryPoint rewardsSetupEntryPoint = Activities.RewardsSetupMoreActivity.RewardsSetupEntryPoint.d;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                Activities.RewardsSetupMoreActivity.RewardsSetupEntryPoint rewardsSetupEntryPoint2 = Activities.RewardsSetupMoreActivity.RewardsSetupEntryPoint.d;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                Activities.RewardsSetupMoreActivity.RewardsSetupEntryPoint rewardsSetupEntryPoint3 = Activities.RewardsSetupMoreActivity.RewardsSetupEntryPoint.d;
                iArr3[3] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr4 = new int[LocalAction.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                LocalAction.Companion companion = LocalAction.e;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            b = iArr4;
        }
    }

    public MoreViewModel(RewardsAccountInteractor rewardsAccountInteractor, AnalyticsManager analyticsManager, LegacyShopAnalyticsManager legacyShopAnalyticsManager, SchedulersProvider schedulersProvider, NewBadgeInteractor newBadgeInteractor, AppConfig appConfig, FeatureToggleManager featureToggleManager, MoreInteractor moreInteractor, BannerDismissInteractor bannerDismissInteractor, CollectionModeInteractor collectionModeInteractor, ShopAuthManager authManager, ShopAccountInteractor shopAccountInteractor, OnboardingInteractorImpl onboardingInteractorImpl, ShopAppRegionInteractor shopAppRegionInteractor, AppConfigClientImpl appConfigClientImpl, ShopAppFlavorInteractor shopAppFlavorInteractor) {
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(legacyShopAnalyticsManager, "legacyShopAnalyticsManager");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(appConfig, "appConfig");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(authManager, "authManager");
        Intrinsics.h(shopAccountInteractor, "shopAccountInteractor");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        Intrinsics.h(shopAppFlavorInteractor, "shopAppFlavorInteractor");
        this.e = rewardsAccountInteractor;
        this.f = analyticsManager;
        this.g = legacyShopAnalyticsManager;
        this.h = schedulersProvider;
        this.i = newBadgeInteractor;
        this.j = appConfig;
        this.k = featureToggleManager;
        this.l = moreInteractor;
        this.m = bannerDismissInteractor;
        this.n = collectionModeInteractor;
        this.o = authManager;
        this.p = shopAccountInteractor;
        this.q = onboardingInteractorImpl;
        this.r = shopAppRegionInteractor;
        this.s = appConfigClientImpl;
        this.t = shopAppFlavorInteractor;
        this.u = new MutableLiveData();
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.v = sharedFlowImplB;
        this.w = FlowKt.a(sharedFlowImplB);
        this.x = new CompositeDisposable();
        this.y = "More screen";
        this.z = new MutableLiveData(0);
        this.A = "";
        this.B = "";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p6(au.com.woolworths.feature.shop.more.MoreViewModel r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof au.com.woolworths.feature.shop.more.MoreViewModel$openMyAccountWebView$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.feature.shop.more.MoreViewModel$openMyAccountWebView$1 r0 = (au.com.woolworths.feature.shop.more.MoreViewModel$openMyAccountWebView$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.more.MoreViewModel$openMyAccountWebView$1 r0 = new au.com.woolworths.feature.shop.more.MoreViewModel$openMyAccountWebView$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.ResultKt.b(r5)
            r0.r = r3
            java.lang.String r5 = "wow_myaccount"
            java.lang.Object r5 = r4.u6(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            au.com.woolworths.android.onesite.analytics.AnalyticsManager r4 = r4.f
            au.com.woolworths.analytics.supers.more.MoreAnalytics$MoreScreen$Action r5 = au.com.woolworths.analytics.supers.more.MoreAnalytics.MoreScreen.Action.e
            r4.g(r5)
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.more.MoreViewModel.p6(au.com.woolworths.feature.shop.more.MoreViewModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void q6(au.com.woolworths.feature.shop.more.MoreViewModel r3, au.com.woolworths.feature.shop.more.data.MoreFeed r4) {
        /*
            if (r4 == 0) goto L36
            java.util.List r4 = r4.getFeed()
            if (r4 == 0) goto L36
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r4.next()
            boolean r2 = r1 instanceof au.com.woolworths.feature.shop.more.data.MoreChatToUs
            if (r2 == 0) goto L13
            r0.add(r1)
            goto L13
        L25:
            java.lang.Object r4 = kotlin.collections.CollectionsKt.F(r0)
            au.com.woolworths.feature.shop.more.data.MoreChatToUs r4 = (au.com.woolworths.feature.shop.more.data.MoreChatToUs) r4
            if (r4 == 0) goto L36
            au.com.woolworths.feature.shop.more.MoreFeedQuery$UnreadChatbotMsg r4 = r4.getUnreadChatbotMsg()
            if (r4 == 0) goto L36
            int r4 = r4.f7602a
            goto L37
        L36:
            r4 = 0
        L37:
            androidx.lifecycle.MutableLiveData r3 = r3.z
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.m(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.more.MoreViewModel.q6(au.com.woolworths.feature.shop.more.MoreViewModel, au.com.woolworths.feature.shop.more.data.MoreFeed):void");
    }

    @Override // au.com.woolworths.feature.shop.more.MoreClickListener
    public final void V(MoreTileType tileType, MoreActions moreActions) {
        String strF;
        Intrinsics.h(tileType, "tileType");
        AnalyticsManager analyticsManager = this.f;
        if (moreActions != null) {
            analyticsManager.c(moreActions);
        }
        int iOrdinal = tileType.ordinal();
        RewardsAccountInteractor rewardsAccountInteractor = this.e;
        AppConfig appConfig = this.j;
        SharedFlowImpl sharedFlowImpl = this.v;
        switch (iOrdinal) {
            case 0:
                sharedFlowImpl.f(MoreContract.Actions.LaunchSngWithNewOnboarding.f7573a);
                break;
            case 1:
                sharedFlowImpl.f(MoreContract.Actions.LaunchStoreLocator.f7574a);
                break;
            case 2:
                RewardsCardData cardData = rewardsAccountInteractor.getCardData();
                strF = cardData != null ? cardData.getNumber() : null;
                sharedFlowImpl.f((strF == null || StringsKt.D(strF)) ? new MoreContract.Actions.LinkRewards(Activities.RewardsSetupMoreActivity.RewardsSetupEntryPoint.d) : MoreContract.Actions.LaunchRewards.f7570a);
                break;
            case 3:
                RewardsCardData cardData2 = rewardsAccountInteractor.getCardData();
                strF = cardData2 != null ? cardData2.getNumber() : null;
                sharedFlowImpl.f((strF == null || StringsKt.D(strF)) ? new MoreContract.Actions.LinkRewards(Activities.RewardsSetupMoreActivity.RewardsSetupEntryPoint.g) : MoreContract.Actions.LaunchEReceipts.f7562a);
                break;
            case 4:
                sharedFlowImpl.f(new MoreContract.Actions.LaunchDeepLink("https://rewards.app.link/extra-wow"));
                break;
            case 5:
                this.i.a(MoreTileType.i);
                sharedFlowImpl.f(MoreContract.Actions.LaunchMyOrders.f7567a);
                break;
            case 6:
                analyticsManager.c(MoreActions.u);
                sharedFlowImpl.f(new MoreContract.Actions.LaunchDeepLink("com.woolworths.shop://help?id=liquor-purchase-notices"));
                break;
            case 7:
                sharedFlowImpl.f(new MoreContract.Actions.LaunchBrowser(YU.a.g(appConfig.getL(), "wow/v2/misc/recalls"), "More Product Recalls screen"));
                break;
            case 8:
                sharedFlowImpl.f(new MoreContract.Actions.LaunchBrowser("https://www.woolworths.com.au/shop/page/help-and-support-faq", "More FAQ screen"));
                break;
            case 9:
                sharedFlowImpl.f(new MoreContract.Actions.LaunchWebView("https://www.woolworths.com.au/shop/discover/healthy-eating/food-safety", com.woolworths.R.string.food_safety_title, "More Food Safety screen"));
                break;
            case 10:
                sharedFlowImpl.f(new MoreContract.Actions.LaunchWebView(YU.a.g(appConfig.getL(), "wow/v2/misc/terms-of-use"), com.woolworths.R.string.terms_of_use_title, "More Terms of Use screen"));
                break;
            case 11:
                sharedFlowImpl.f(new MoreContract.Actions.LaunchWebView(YU.a.g(appConfig.getL(), "wow/v2/misc/privacy"), com.woolworths.R.string.more_privacy_policy, "More Privacy Policy screen"));
                break;
            case 12:
                sharedFlowImpl.f(new MoreContract.Actions.LaunchBrowser("https://www.woolworths.com.au/Shop/page/help-and-support-faq?faq_id=40", "More Feedback screen"));
                break;
            case 13:
                sharedFlowImpl.f(new MoreContract.Actions.OpenLink("security_settings", null));
                break;
            case 14:
                sharedFlowImpl.f(MoreContract.Actions.ShowLogoutConfirmation.f7579a);
                break;
            case 15:
                sharedFlowImpl.f(MoreContract.Actions.LaunchDevelopersOption.f7561a);
                break;
            case 16:
                BuildersKt.c(ViewModelKt.a(this), null, null, new MoreViewModel$onRowItemClicked$2(this, null), 3);
                break;
            case 17:
                BuildersKt.c(ViewModelKt.a(this), null, null, new MoreViewModel$onRowItemClicked$3(this, null), 3);
                break;
            case 19:
                sharedFlowImpl.f(MoreContract.Actions.LaunchChangeCountry.f7556a);
                break;
        }
    }

    @Override // au.com.woolworths.feature.shop.more.MoreClickListener
    public final void j6(MoreDeliveryUnlimited deliveryUnlimited) {
        Intrinsics.h(deliveryUnlimited, "deliveryUnlimited");
        int i = WhenMappings.f7606a[deliveryUnlimited.getStatus().ordinal()];
        SharedFlowImpl sharedFlowImpl = this.v;
        if (i == 1) {
            sharedFlowImpl.f(MoreContract.Actions.LaunchDeliveryUnlimitedSignUp.f7560a);
        } else {
            sharedFlowImpl.f(new MoreContract.Actions.OpenLink(deliveryUnlimited.getSubscribeUrl(), null));
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void o6() {
        this.x.e();
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public final void r6(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r45v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public final boolean s6() {
        BaseShopAppFeature baseShopAppFeature = BaseShopAppFeature.z;
        FeatureToggleManager featureToggleManager = this.k;
        if (featureToggleManager.c(baseShopAppFeature)) {
            return (featureToggleManager.c(BaseShopAppFeature.c0) || this.t.b(Region.j)) && this.r.b() == Region.j;
        }
        return false;
    }

    @Override // au.com.woolworths.feature.shop.more.MoreClickListener
    public final void t2() {
        this.v.f(new MoreContract.Actions.ShowSnackbarMessage());
    }

    public final void t6(String title, String str) {
        Intrinsics.h(title, "title");
        this.z.m(0);
        r6(null);
        NewBadgeInteractor newBadgeInteractor = this.i;
        androidx.constraintlayout.core.state.a.v(newBadgeInteractor.f7631a.f7632a, "has_interacted_new_message", false);
        newBadgeInteractor.a(MoreTileType.t);
        this.f.c(MoreActions.e);
        this.v.f(new MoreContract.Actions.LaunchChatToUs(title, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u6(java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.feature.shop.more.MoreViewModel$openMagicLink$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.feature.shop.more.MoreViewModel$openMagicLink$1 r0 = (au.com.woolworths.feature.shop.more.MoreViewModel$openMagicLink$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.more.MoreViewModel$openMagicLink$1 r0 = new au.com.woolworths.feature.shop.more.MoreViewModel$openMagicLink$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.p
            kotlin.ResultKt.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r6)
            r0.p = r5
            r0.s = r3
            au.com.woolworths.shop.auth.ShopAuthManager r6 = r4.o
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            kotlinx.coroutines.flow.SharedFlowImpl r0 = r4.v
            if (r6 == 0) goto L61
            au.com.woolworths.feature.shop.more.MoreContract$Actions$OpenLink r6 = new au.com.woolworths.feature.shop.more.MoreContract$Actions$OpenLink
            au.com.woolworths.feature.shop.weblink.model.Cookie r1 = new au.com.woolworths.feature.shop.weblink.model.Cookie
            r1.<init>()
            au.com.woolworths.feature.shop.weblink.model.Cookie[] r1 = new au.com.woolworths.feature.shop.weblink.model.Cookie[]{r1}
            java.util.ArrayList r1 = kotlin.collections.CollectionsKt.k(r1)
            r6.<init>(r5, r1)
            r0.f(r6)
            goto L6a
        L61:
            au.com.woolworths.feature.shop.more.MoreContract$Actions$OpenLink r6 = new au.com.woolworths.feature.shop.more.MoreContract$Actions$OpenLink
            r1 = 0
            r6.<init>(r5, r1)
            r0.f(r6)
        L6a:
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.more.MoreViewModel.u6(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void v6(String str) {
        ActionData actionDataA = ActionData.Companion.a("Click on any link on this screen - ".concat(str));
        actionDataA.b(this.y);
        actionDataA.c = "1";
        this.g.d(actionDataA);
    }
}
