package au.com.woolworths.feature.rewards.account.settings;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.base.rewards.account.data.AccountHomeFooter;
import au.com.woolworths.base.rewards.account.ui.AccountHomeFooterItemKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.rewards.account.ItemAccountHomeErrorOptionBindingModel_;
import au.com.woolworths.feature.rewards.account.ItemAccountHomeLoadingOptionBindingModel_;
import au.com.woolworths.feature.rewards.account.ItemAccountHomeLoadingSectionBindingModel_;
import au.com.woolworths.feature.rewards.account.ItemAccountHomeLogoutBindingModel_;
import au.com.woolworths.feature.rewards.account.ItemAccountHomeOptionBindingModel_;
import au.com.woolworths.feature.rewards.account.ItemAccountHomeSectionBindingModel_;
import au.com.woolworths.feature.rewards.account.ItemAccountSettingsAppVersionBindingModel_;
import au.com.woolworths.feature.rewards.account.data.AccountHomeAndroidAppReviewLinkItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeAndroidMedalliaItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeError;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOnboardingItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOption;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionCanCloseAccountItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionLoading;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionMagicLinkItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionMandyItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeSection;
import au.com.woolworths.feature.rewards.account.data.AccountHomeSectionLoading;
import au.com.woolworths.feature.rewards.account.data.AccountSettingsAppVersionData;
import au.com.woolworths.feature.rewards.account.data.AccountSettingsChangeCountry;
import au.com.woolworths.feature.rewards.account.data.AccountSettingsDevOptions;
import au.com.woolworths.feature.rewards.account.data.AccountSettingsLogoutData;
import au.com.woolworths.feature.rewards.account.data.HomeOptionAction;
import au.com.woolworths.foundation.rewards.banner.model.RewardsNotificationBannerApiData;
import au.com.woolworths.foundation.rewards.banner.model.RewardsNotificationBannerApiDataKt;
import au.com.woolworths.foundation.rewards.common.ui.banners.RewardsNotificationBannerKt;
import au.com.woolworths.foundation.rewards.common.ui.banners.data.RewardsNotificationBannerData;
import au.com.woolworths.rewards.base.RewardsBaseFeature;
import au.com.woolworths.rewards.base.homepage.RewardsBannerInteractor;
import au.com.woolworths.sdui.common.alert.StandardAlertKt;
import au.com.woolworths.sdui.common.alert.model.BasicInsetAlertModel;
import com.airbnb.epoxy.ComposeInteropKt;
import com.airbnb.epoxy.TypedEpoxyController;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J'\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¢\u0006\u0002\u0010\u0015J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsControllerOld;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "", "viewModel", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsViewModelOld;", "analyticsManager", "Lau/com/woolworths/android/onesite/analytics/AnalyticsManager;", "featureToggleManager", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "rewardsBannerInteractor", "Lau/com/woolworths/rewards/base/homepage/RewardsBannerInteractor;", "<init>", "(Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsViewModelOld;Lau/com/woolworths/android/onesite/analytics/AnalyticsManager;Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;Lau/com/woolworths/rewards/base/homepage/RewardsBannerInteractor;)V", "buildModels", "", "data", "buildAccountHomeOptions", "options", "clickListener", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsClickListenerOld;", "(Ljava/util/List;Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsClickListenerOld;)Lkotlin/Unit;", "shouldBeExcluded", "", "option", "Lau/com/woolworths/feature/rewards/account/data/AccountHomeOption;", "buildAccountBanner", "apiData", "Lau/com/woolworths/foundation/rewards/banner/model/RewardsNotificationBannerApiData;", "buildAccountFooter", "footer", "Lau/com/woolworths/base/rewards/account/data/AccountHomeFooter;", "buildAlert", "alertData", "Lau/com/woolworths/sdui/common/alert/model/BasicInsetAlertModel;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AccountSettingsControllerOld extends TypedEpoxyController<List<? extends Object>> {
    public static final int $stable = 8;

    @NotNull
    private final AnalyticsManager analyticsManager;

    @NotNull
    private final FeatureToggleManager featureToggleManager;

    @NotNull
    private final RewardsBannerInteractor rewardsBannerInteractor;

    @NotNull
    private final AccountSettingsViewModelOld viewModel;

    public AccountSettingsControllerOld(@NotNull AccountSettingsViewModelOld viewModel, @NotNull AnalyticsManager analyticsManager, @NotNull FeatureToggleManager featureToggleManager, @NotNull RewardsBannerInteractor rewardsBannerInteractor) {
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(rewardsBannerInteractor, "rewardsBannerInteractor");
        this.viewModel = viewModel;
        this.analyticsManager = analyticsManager;
        this.featureToggleManager = featureToggleManager;
        this.rewardsBannerInteractor = rewardsBannerInteractor;
    }

    private final void buildAccountBanner(final RewardsNotificationBannerApiData apiData, final AccountSettingsClickListenerOld clickListener) {
        ComposeInteropKt.a(this, apiData.getId(), new Object[]{apiData}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.settings.AccountSettingsControllerOld.buildAccountBanner.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final AccountSettingsClickListenerOld accountSettingsClickListenerOld = clickListener;
                    final AccountSettingsControllerOld accountSettingsControllerOld = this;
                    final RewardsNotificationBannerApiData rewardsNotificationBannerApiData = apiData;
                    ThemeKt.a(48, composer, ComposableLambdaKt.c(-158127072, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.settings.AccountSettingsControllerOld.buildAccountBanner.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Number) obj4).intValue() & 3;
                            Unit unit = Unit.f24250a;
                            if (iIntValue == 2 && composer2.c()) {
                                composer2.j();
                                return unit;
                            }
                            final RewardsNotificationBannerApiData rewardsNotificationBannerApiData2 = rewardsNotificationBannerApiData;
                            RewardsNotificationBannerData rewardsNotificationBannerDataA = RewardsNotificationBannerApiDataKt.a(rewardsNotificationBannerApiData2);
                            composer2.o(-1746271574);
                            final AccountSettingsClickListenerOld accountSettingsClickListenerOld2 = accountSettingsClickListenerOld;
                            boolean zI = composer2.I(accountSettingsClickListenerOld2) | composer2.I(rewardsNotificationBannerApiData2);
                            final AccountSettingsControllerOld accountSettingsControllerOld2 = accountSettingsControllerOld;
                            boolean zI2 = zI | composer2.I(accountSettingsControllerOld2);
                            Object objG = composer2.G();
                            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                            if (zI2 || objG == composer$Companion$Empty$1) {
                                final int i = 0;
                                objG = new Function0() { // from class: au.com.woolworths.feature.rewards.account.settings.b
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i) {
                                            case 0:
                                                AccountSettingsClickListenerOld accountSettingsClickListenerOld3 = accountSettingsClickListenerOld2;
                                                RewardsNotificationBannerApiData rewardsNotificationBannerApiData3 = rewardsNotificationBannerApiData2;
                                                accountSettingsClickListenerOld3.h3(rewardsNotificationBannerApiData3);
                                                AnalyticsManager analyticsManager = accountSettingsControllerOld2.analyticsManager;
                                                Action action = new Action() { // from class: au.com.woolworths.feature.rewards.account.settings.AccountSettingsControllerOld$buildAccountBanner$1$1$1$1$1
                                                    public final Screens d = Screens.D;
                                                    public final Category e = Category.G;
                                                    public final String f = "Close";

                                                    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                                                    /* renamed from: a, reason: from getter */
                                                    public final String getF() {
                                                        return this.f;
                                                    }

                                                    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                                                    /* renamed from: b, reason: from getter */
                                                    public final Category getE() {
                                                        return this.e;
                                                    }

                                                    @Override // au.com.woolworths.android.onesite.analytics.Action
                                                    /* renamed from: f */
                                                    public final Screen getD() {
                                                        return this.d;
                                                    }
                                                };
                                                TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.q0, rewardsNotificationBannerApiData3.getId());
                                                TrackableValue trackableValue = TrackableValue.o0;
                                                String title = rewardsNotificationBannerApiData3.getTitle();
                                                if (title == null) {
                                                    title = "";
                                                }
                                                trackingMetadataA.b(trackableValue, title);
                                                analyticsManager.j(action, trackingMetadataA);
                                                break;
                                            default:
                                                AccountSettingsClickListenerOld accountSettingsClickListenerOld4 = accountSettingsClickListenerOld2;
                                                RewardsNotificationBannerApiData rewardsNotificationBannerApiData4 = rewardsNotificationBannerApiData2;
                                                accountSettingsClickListenerOld4.P2(rewardsNotificationBannerApiData4);
                                                AnalyticsManager analyticsManager2 = accountSettingsControllerOld2.analyticsManager;
                                                Action action2 = new Action(rewardsNotificationBannerApiData4) { // from class: au.com.woolworths.feature.rewards.account.settings.AccountSettingsControllerOld$buildAccountBanner$1$1$2$1$1
                                                    public final Screens d = Screens.D;
                                                    public final Category e = Category.G;
                                                    public final String f;

                                                    {
                                                        String label;
                                                        ContentCta primaryCta = rewardsNotificationBannerApiData4.getPrimaryCta();
                                                        this.f = (primaryCta == null || (label = primaryCta.getLabel()) == null) ? "" : label;
                                                    }

                                                    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                                                    /* renamed from: a, reason: from getter */
                                                    public final String getF() {
                                                        return this.f;
                                                    }

                                                    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                                                    /* renamed from: b, reason: from getter */
                                                    public final Category getE() {
                                                        return this.e;
                                                    }

                                                    @Override // au.com.woolworths.android.onesite.analytics.Action
                                                    /* renamed from: f */
                                                    public final Screen getD() {
                                                        return this.d;
                                                    }
                                                };
                                                TrackingMetadata trackingMetadataA2 = TrackingMetadata.Companion.a(TrackableValue.q0, rewardsNotificationBannerApiData4.getId());
                                                TrackableValue trackableValue2 = TrackableValue.o0;
                                                String title2 = rewardsNotificationBannerApiData4.getTitle();
                                                if (title2 == null) {
                                                    title2 = "";
                                                }
                                                trackingMetadataA2.b(trackableValue2, title2);
                                                analyticsManager2.j(action2, trackingMetadataA2);
                                                break;
                                        }
                                        return Unit.f24250a;
                                    }
                                };
                                composer2.A(objG);
                            }
                            Function0 function0 = (Function0) objG;
                            composer2.l();
                            composer2.o(-1746271574);
                            boolean zI3 = composer2.I(accountSettingsClickListenerOld2) | composer2.I(rewardsNotificationBannerApiData2) | composer2.I(accountSettingsControllerOld2);
                            Object objG2 = composer2.G();
                            if (zI3 || objG2 == composer$Companion$Empty$1) {
                                final int i2 = 1;
                                objG2 = new Function0() { // from class: au.com.woolworths.feature.rewards.account.settings.b
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i2) {
                                            case 0:
                                                AccountSettingsClickListenerOld accountSettingsClickListenerOld3 = accountSettingsClickListenerOld2;
                                                RewardsNotificationBannerApiData rewardsNotificationBannerApiData3 = rewardsNotificationBannerApiData2;
                                                accountSettingsClickListenerOld3.h3(rewardsNotificationBannerApiData3);
                                                AnalyticsManager analyticsManager = accountSettingsControllerOld2.analyticsManager;
                                                Action action = new Action() { // from class: au.com.woolworths.feature.rewards.account.settings.AccountSettingsControllerOld$buildAccountBanner$1$1$1$1$1
                                                    public final Screens d = Screens.D;
                                                    public final Category e = Category.G;
                                                    public final String f = "Close";

                                                    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                                                    /* renamed from: a, reason: from getter */
                                                    public final String getF() {
                                                        return this.f;
                                                    }

                                                    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                                                    /* renamed from: b, reason: from getter */
                                                    public final Category getE() {
                                                        return this.e;
                                                    }

                                                    @Override // au.com.woolworths.android.onesite.analytics.Action
                                                    /* renamed from: f */
                                                    public final Screen getD() {
                                                        return this.d;
                                                    }
                                                };
                                                TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.q0, rewardsNotificationBannerApiData3.getId());
                                                TrackableValue trackableValue = TrackableValue.o0;
                                                String title = rewardsNotificationBannerApiData3.getTitle();
                                                if (title == null) {
                                                    title = "";
                                                }
                                                trackingMetadataA.b(trackableValue, title);
                                                analyticsManager.j(action, trackingMetadataA);
                                                break;
                                            default:
                                                AccountSettingsClickListenerOld accountSettingsClickListenerOld4 = accountSettingsClickListenerOld2;
                                                RewardsNotificationBannerApiData rewardsNotificationBannerApiData4 = rewardsNotificationBannerApiData2;
                                                accountSettingsClickListenerOld4.P2(rewardsNotificationBannerApiData4);
                                                AnalyticsManager analyticsManager2 = accountSettingsControllerOld2.analyticsManager;
                                                Action action2 = new Action(rewardsNotificationBannerApiData4) { // from class: au.com.woolworths.feature.rewards.account.settings.AccountSettingsControllerOld$buildAccountBanner$1$1$2$1$1
                                                    public final Screens d = Screens.D;
                                                    public final Category e = Category.G;
                                                    public final String f;

                                                    {
                                                        String label;
                                                        ContentCta primaryCta = rewardsNotificationBannerApiData4.getPrimaryCta();
                                                        this.f = (primaryCta == null || (label = primaryCta.getLabel()) == null) ? "" : label;
                                                    }

                                                    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                                                    /* renamed from: a, reason: from getter */
                                                    public final String getF() {
                                                        return this.f;
                                                    }

                                                    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                                                    /* renamed from: b, reason: from getter */
                                                    public final Category getE() {
                                                        return this.e;
                                                    }

                                                    @Override // au.com.woolworths.android.onesite.analytics.Action
                                                    /* renamed from: f */
                                                    public final Screen getD() {
                                                        return this.d;
                                                    }
                                                };
                                                TrackingMetadata trackingMetadataA2 = TrackingMetadata.Companion.a(TrackableValue.q0, rewardsNotificationBannerApiData4.getId());
                                                TrackableValue trackableValue2 = TrackableValue.o0;
                                                String title2 = rewardsNotificationBannerApiData4.getTitle();
                                                if (title2 == null) {
                                                    title2 = "";
                                                }
                                                trackingMetadataA2.b(trackableValue2, title2);
                                                analyticsManager2.j(action2, trackingMetadataA2);
                                                break;
                                        }
                                        return Unit.f24250a;
                                    }
                                };
                                composer2.A(objG2);
                            }
                            composer2.l();
                            RewardsNotificationBannerKt.a(rewardsNotificationBannerDataA, function0, (Function0) objG2, null, composer2, 0);
                            composer2.o(-1633490746);
                            boolean zI4 = composer2.I(accountSettingsControllerOld2) | composer2.I(rewardsNotificationBannerApiData2);
                            Object objG3 = composer2.G();
                            if (zI4 || objG3 == composer$Companion$Empty$1) {
                                objG3 = new AccountSettingsControllerOld$buildAccountBanner$1$1$3$1(accountSettingsControllerOld2, rewardsNotificationBannerApiData2, null);
                                composer2.A(objG3);
                            }
                            composer2.l();
                            EffectsKt.e(composer2, unit, (Function2) objG3);
                            return unit;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1087983827));
    }

    private final void buildAccountFooter(final AccountHomeFooter footer, final AccountSettingsClickListenerOld clickListener) {
        ComposeInteropKt.a(this, String.valueOf(footer.hashCode()), new Object[]{footer}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.settings.AccountSettingsControllerOld.buildAccountFooter.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final AccountHomeFooter accountHomeFooter = footer;
                    final AccountSettingsClickListenerOld accountSettingsClickListenerOld = clickListener;
                    ThemeKt.a(48, composer, ComposableLambdaKt.c(-1678990161, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.settings.AccountSettingsControllerOld.buildAccountFooter.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                composer2.o(5004770);
                                AccountSettingsClickListenerOld accountSettingsClickListenerOld2 = accountSettingsClickListenerOld;
                                boolean zI = composer2.I(accountSettingsClickListenerOld2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new c(accountSettingsClickListenerOld2, 0);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                AccountHomeFooterItemKt.AccountHomeFooterItem(accountHomeFooter, null, (Function1) objG, composer2, AccountHomeFooter.$stable, 2);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 165023836));
    }

    private final Unit buildAccountHomeOptions(List<? extends Object> options, AccountSettingsClickListenerOld clickListener) {
        if (options == null) {
            return null;
        }
        for (Object obj : options) {
            if (!shouldBeExcluded(obj instanceof AccountHomeOption ? (AccountHomeOption) obj : null)) {
                if (obj instanceof AccountHomeOptionItem) {
                    ItemAccountHomeOptionBindingModel_ itemAccountHomeOptionBindingModel_ = new ItemAccountHomeOptionBindingModel_();
                    AccountHomeOptionItem accountHomeOptionItem = (AccountHomeOptionItem) obj;
                    Boolean bool = accountHomeOptionItem.e;
                    itemAccountHomeOptionBindingModel_.M("option_" + accountHomeOptionItem.f5707a + "_" + accountHomeOptionItem.hashCode());
                    itemAccountHomeOptionBindingModel_.R(new PlainText(accountHomeOptionItem.b));
                    itemAccountHomeOptionBindingModel_.P(accountHomeOptionItem.d);
                    itemAccountHomeOptionBindingModel_.Q(Boolean.valueOf(accountHomeOptionItem.c.f5702a == HomeOptionAction.d && !Intrinsics.c(bool, Boolean.TRUE)));
                    itemAccountHomeOptionBindingModel_.O(Boolean.valueOf(Intrinsics.c(bool, Boolean.TRUE)));
                    itemAccountHomeOptionBindingModel_.N(new androidx.navigation.compose.a(23, clickListener, accountHomeOptionItem));
                    add(itemAccountHomeOptionBindingModel_);
                } else if (obj instanceof AccountHomeOptionMagicLinkItem) {
                    ItemAccountHomeOptionBindingModel_ itemAccountHomeOptionBindingModel_2 = new ItemAccountHomeOptionBindingModel_();
                    AccountHomeOptionMagicLinkItem accountHomeOptionMagicLinkItem = (AccountHomeOptionMagicLinkItem) obj;
                    itemAccountHomeOptionBindingModel_2.M("option_" + accountHomeOptionMagicLinkItem.f5710a + "_" + accountHomeOptionMagicLinkItem.hashCode());
                    itemAccountHomeOptionBindingModel_2.R(new PlainText(accountHomeOptionMagicLinkItem.b));
                    itemAccountHomeOptionBindingModel_2.P(accountHomeOptionMagicLinkItem.d);
                    itemAccountHomeOptionBindingModel_2.Q(Boolean.FALSE);
                    itemAccountHomeOptionBindingModel_2.O(Boolean.valueOf(Intrinsics.c(accountHomeOptionMagicLinkItem.e, Boolean.TRUE)));
                    itemAccountHomeOptionBindingModel_2.N(new androidx.navigation.compose.a(24, clickListener, accountHomeOptionMagicLinkItem));
                    add(itemAccountHomeOptionBindingModel_2);
                } else if (obj instanceof AccountHomeOptionMandyItem) {
                    ItemAccountHomeOptionBindingModel_ itemAccountHomeOptionBindingModel_3 = new ItemAccountHomeOptionBindingModel_();
                    AccountHomeOptionMandyItem accountHomeOptionMandyItem = (AccountHomeOptionMandyItem) obj;
                    itemAccountHomeOptionBindingModel_3.M("option_" + accountHomeOptionMandyItem.f5711a);
                    itemAccountHomeOptionBindingModel_3.R(new PlainText(accountHomeOptionMandyItem.b));
                    itemAccountHomeOptionBindingModel_3.P(accountHomeOptionMandyItem.d);
                    itemAccountHomeOptionBindingModel_3.Q(Boolean.FALSE);
                    itemAccountHomeOptionBindingModel_3.O(Boolean.valueOf(Intrinsics.c(accountHomeOptionMandyItem.e, Boolean.TRUE)));
                    Boolean boolValueOf = Boolean.valueOf(accountHomeOptionMandyItem.f);
                    itemAccountHomeOptionBindingModel_3.t();
                    itemAccountHomeOptionBindingModel_3.r = boolValueOf;
                    itemAccountHomeOptionBindingModel_3.N(new androidx.navigation.compose.a(25, clickListener, accountHomeOptionMandyItem));
                    add(itemAccountHomeOptionBindingModel_3);
                } else if (obj instanceof AccountHomeAndroidAppReviewLinkItem) {
                    ItemAccountHomeOptionBindingModel_ itemAccountHomeOptionBindingModel_4 = new ItemAccountHomeOptionBindingModel_();
                    AccountHomeAndroidAppReviewLinkItem accountHomeAndroidAppReviewLinkItem = (AccountHomeAndroidAppReviewLinkItem) obj;
                    Boolean bool2 = accountHomeAndroidAppReviewLinkItem.e;
                    itemAccountHomeOptionBindingModel_4.M("option_" + accountHomeAndroidAppReviewLinkItem.f5698a);
                    itemAccountHomeOptionBindingModel_4.R(new PlainText(accountHomeAndroidAppReviewLinkItem.b));
                    itemAccountHomeOptionBindingModel_4.P(accountHomeAndroidAppReviewLinkItem.d);
                    itemAccountHomeOptionBindingModel_4.Q(Boolean.valueOf(true ^ Intrinsics.c(bool2, Boolean.TRUE)));
                    itemAccountHomeOptionBindingModel_4.O(bool2);
                    itemAccountHomeOptionBindingModel_4.N(new androidx.navigation.compose.a(26, clickListener, accountHomeAndroidAppReviewLinkItem));
                    add(itemAccountHomeOptionBindingModel_4);
                } else if (obj instanceof AccountHomeAndroidMedalliaItem) {
                    ItemAccountHomeOptionBindingModel_ itemAccountHomeOptionBindingModel_5 = new ItemAccountHomeOptionBindingModel_();
                    AccountHomeAndroidMedalliaItem accountHomeAndroidMedalliaItem = (AccountHomeAndroidMedalliaItem) obj;
                    Boolean bool3 = accountHomeAndroidMedalliaItem.e;
                    itemAccountHomeOptionBindingModel_5.M("option_" + accountHomeAndroidMedalliaItem.f5699a);
                    itemAccountHomeOptionBindingModel_5.R(new PlainText(accountHomeAndroidMedalliaItem.b));
                    itemAccountHomeOptionBindingModel_5.P(accountHomeAndroidMedalliaItem.d);
                    Boolean bool4 = Boolean.TRUE;
                    itemAccountHomeOptionBindingModel_5.Q(Boolean.valueOf(true ^ Intrinsics.c(bool3, bool4)));
                    itemAccountHomeOptionBindingModel_5.O(Boolean.valueOf(Intrinsics.c(bool3, bool4)));
                    itemAccountHomeOptionBindingModel_5.N(new androidx.navigation.compose.a(27, clickListener, accountHomeAndroidMedalliaItem));
                    add(itemAccountHomeOptionBindingModel_5);
                } else {
                    if (obj instanceof AccountHomeOnboardingItem) {
                        new ItemAccountHomeOptionBindingModel_();
                        throw new IllegalStateException("Item AccountHomeOnboardingItem not supported anymore");
                    }
                    if (obj instanceof AccountHomeOptionCanCloseAccountItem) {
                        ItemAccountHomeOptionBindingModel_ itemAccountHomeOptionBindingModel_6 = new ItemAccountHomeOptionBindingModel_();
                        AccountHomeOptionCanCloseAccountItem accountHomeOptionCanCloseAccountItem = (AccountHomeOptionCanCloseAccountItem) obj;
                        Boolean bool5 = accountHomeOptionCanCloseAccountItem.f;
                        itemAccountHomeOptionBindingModel_6.M("option_" + accountHomeOptionCanCloseAccountItem.f5703a);
                        itemAccountHomeOptionBindingModel_6.R(new PlainText(accountHomeOptionCanCloseAccountItem.b));
                        itemAccountHomeOptionBindingModel_6.P(accountHomeOptionCanCloseAccountItem.e);
                        Boolean bool6 = Boolean.TRUE;
                        itemAccountHomeOptionBindingModel_6.Q(Boolean.valueOf(true ^ Intrinsics.c(bool5, bool6)));
                        itemAccountHomeOptionBindingModel_6.O(Boolean.valueOf(Intrinsics.c(bool5, bool6)));
                        itemAccountHomeOptionBindingModel_6.N(new androidx.navigation.compose.a(28, clickListener, accountHomeOptionCanCloseAccountItem));
                        add(itemAccountHomeOptionBindingModel_6);
                    }
                }
            }
        }
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildAccountHomeOptions$lambda$25$lambda$13$lambda$12(AccountSettingsClickListenerOld accountSettingsClickListenerOld, Object obj) {
        accountSettingsClickListenerOld.R4((AccountHomeOption) obj);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildAccountHomeOptions$lambda$25$lambda$15$lambda$14(AccountSettingsClickListenerOld accountSettingsClickListenerOld, Object obj) {
        accountSettingsClickListenerOld.R4((AccountHomeOption) obj);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildAccountHomeOptions$lambda$25$lambda$17$lambda$16(AccountSettingsClickListenerOld accountSettingsClickListenerOld, Object obj) {
        accountSettingsClickListenerOld.R4((AccountHomeOption) obj);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildAccountHomeOptions$lambda$25$lambda$19$lambda$18(AccountSettingsClickListenerOld accountSettingsClickListenerOld, Object obj) {
        accountSettingsClickListenerOld.R4((AccountHomeOption) obj);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildAccountHomeOptions$lambda$25$lambda$21$lambda$20(AccountSettingsClickListenerOld accountSettingsClickListenerOld, Object obj) {
        accountSettingsClickListenerOld.R4((AccountHomeOption) obj);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildAccountHomeOptions$lambda$25$lambda$24$lambda$23(AccountSettingsClickListenerOld accountSettingsClickListenerOld, Object obj) {
        accountSettingsClickListenerOld.R4((AccountHomeOption) obj);
        return Unit.f24250a;
    }

    private final void buildAlert(final BasicInsetAlertModel alertData, final AccountSettingsClickListenerOld clickListener) {
        ComposeInteropKt.a(this, String.valueOf(alertData.hashCode()), new Object[]{alertData}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.settings.AccountSettingsControllerOld.buildAlert.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final BasicInsetAlertModel basicInsetAlertModel = alertData;
                    final AccountSettingsClickListenerOld accountSettingsClickListenerOld = clickListener;
                    CoreThemeKt.b(6, composer, ComposableLambdaKt.c(1663421798, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.settings.AccountSettingsControllerOld.buildAlert.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                composer2.o(5004770);
                                AccountSettingsClickListenerOld accountSettingsClickListenerOld2 = accountSettingsClickListenerOld;
                                boolean zI = composer2.I(accountSettingsClickListenerOld2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new c(accountSettingsClickListenerOld2, 1);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                StandardAlertKt.a(basicInsetAlertModel, (Function1) objG, PaddingKt.j(PaddingKt.h(Modifier.Companion.d, 16, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 8, 7), composer2, 392);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1494149885));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildModels$lambda$11$lambda$2$lambda$1(AccountSettingsClickListenerOld accountSettingsClickListenerOld) {
        accountSettingsClickListenerOld.q4();
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildModels$lambda$11$lambda$4$lambda$3(AccountSettingsClickListenerOld accountSettingsClickListenerOld) {
        accountSettingsClickListenerOld.a2();
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildModels$lambda$11$lambda$6$lambda$5(AccountSettingsClickListenerOld accountSettingsClickListenerOld) {
        accountSettingsClickListenerOld.m0();
        return Unit.f24250a;
    }

    private final boolean shouldBeExcluded(AccountHomeOption option) {
        return (option == null || !Intrinsics.c(option.getF5710a(), "instore_wifi") || this.featureToggleManager.c(RewardsBaseFeature.j)) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [au.com.woolworths.feature.rewards.account.settings.a] */
    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@NotNull List<? extends Object> data) {
        Intrinsics.h(data, "data");
        final AccountSettingsClickListenerOld accountSettingsClickListenerOld = this.viewModel;
        Intrinsics.f(accountSettingsClickListenerOld, "null cannot be cast to non-null type au.com.woolworths.feature.rewards.account.settings.AccountSettingsClickListenerOld");
        for (Object obj : data) {
            if (obj instanceof AccountHomeSection) {
                ItemAccountHomeSectionBindingModel_ itemAccountHomeSectionBindingModel_ = new ItemAccountHomeSectionBindingModel_();
                AccountHomeSection accountHomeSection = (AccountHomeSection) obj;
                itemAccountHomeSectionBindingModel_.M("section_".concat(accountHomeSection.f5712a));
                itemAccountHomeSectionBindingModel_.t();
                itemAccountHomeSectionBindingModel_.n = accountHomeSection;
                add(itemAccountHomeSectionBindingModel_);
                buildAccountHomeOptions(accountHomeSection.b, accountSettingsClickListenerOld);
            } else if (obj instanceof AccountSettingsChangeCountry) {
                ItemAccountHomeOptionBindingModel_ itemAccountHomeOptionBindingModel_ = new ItemAccountHomeOptionBindingModel_();
                itemAccountHomeOptionBindingModel_.M("change_country");
                itemAccountHomeOptionBindingModel_.R(new ResText(R.string.rewards_account_change_country));
                final int i = 0;
                itemAccountHomeOptionBindingModel_.N(new Function0() { // from class: au.com.woolworths.feature.rewards.account.settings.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                return AccountSettingsControllerOld.buildModels$lambda$11$lambda$2$lambda$1(accountSettingsClickListenerOld);
                            case 1:
                                return AccountSettingsControllerOld.buildModels$lambda$11$lambda$4$lambda$3(accountSettingsClickListenerOld);
                            default:
                                return AccountSettingsControllerOld.buildModels$lambda$11$lambda$6$lambda$5(accountSettingsClickListenerOld);
                        }
                    }
                });
                add(itemAccountHomeOptionBindingModel_);
            } else if (obj instanceof AccountSettingsLogoutData) {
                ItemAccountHomeLogoutBindingModel_ itemAccountHomeLogoutBindingModel_ = new ItemAccountHomeLogoutBindingModel_();
                itemAccountHomeLogoutBindingModel_.M();
                final int i2 = 1;
                ?? r2 = new Function0() { // from class: au.com.woolworths.feature.rewards.account.settings.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                return AccountSettingsControllerOld.buildModels$lambda$11$lambda$2$lambda$1(accountSettingsClickListenerOld);
                            case 1:
                                return AccountSettingsControllerOld.buildModels$lambda$11$lambda$4$lambda$3(accountSettingsClickListenerOld);
                            default:
                                return AccountSettingsControllerOld.buildModels$lambda$11$lambda$6$lambda$5(accountSettingsClickListenerOld);
                        }
                    }
                };
                itemAccountHomeLogoutBindingModel_.t();
                itemAccountHomeLogoutBindingModel_.n = r2;
                add(itemAccountHomeLogoutBindingModel_);
            } else if (obj instanceof AccountSettingsDevOptions) {
                ItemAccountHomeOptionBindingModel_ itemAccountHomeOptionBindingModel_2 = new ItemAccountHomeOptionBindingModel_();
                itemAccountHomeOptionBindingModel_2.M("dev_options");
                itemAccountHomeOptionBindingModel_2.R(new ResText(R.string.rewards_account_developer_options));
                final int i3 = 2;
                itemAccountHomeOptionBindingModel_2.N(new Function0() { // from class: au.com.woolworths.feature.rewards.account.settings.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                return AccountSettingsControllerOld.buildModels$lambda$11$lambda$2$lambda$1(accountSettingsClickListenerOld);
                            case 1:
                                return AccountSettingsControllerOld.buildModels$lambda$11$lambda$4$lambda$3(accountSettingsClickListenerOld);
                            default:
                                return AccountSettingsControllerOld.buildModels$lambda$11$lambda$6$lambda$5(accountSettingsClickListenerOld);
                        }
                    }
                });
                add(itemAccountHomeOptionBindingModel_2);
            } else if (obj instanceof AccountSettingsAppVersionData) {
                ItemAccountSettingsAppVersionBindingModel_ itemAccountSettingsAppVersionBindingModel_ = new ItemAccountSettingsAppVersionBindingModel_();
                itemAccountSettingsAppVersionBindingModel_.M();
                itemAccountSettingsAppVersionBindingModel_.t();
                itemAccountSettingsAppVersionBindingModel_.n = (AccountSettingsAppVersionData) obj;
                add(itemAccountSettingsAppVersionBindingModel_);
            } else if (obj instanceof AccountHomeSectionLoading) {
                ItemAccountHomeLoadingSectionBindingModel_ itemAccountHomeLoadingSectionBindingModel_ = new ItemAccountHomeLoadingSectionBindingModel_();
                itemAccountHomeLoadingSectionBindingModel_.M();
                add(itemAccountHomeLoadingSectionBindingModel_);
            } else if (obj instanceof AccountHomeOptionLoading) {
                ItemAccountHomeLoadingOptionBindingModel_ itemAccountHomeLoadingOptionBindingModel_ = new ItemAccountHomeLoadingOptionBindingModel_();
                itemAccountHomeLoadingOptionBindingModel_.M();
                add(itemAccountHomeLoadingOptionBindingModel_);
            } else if (obj instanceof AccountHomeError) {
                ItemAccountHomeErrorOptionBindingModel_ itemAccountHomeErrorOptionBindingModel_ = new ItemAccountHomeErrorOptionBindingModel_();
                itemAccountHomeErrorOptionBindingModel_.M();
                AccountSettingsErrorStateOld accountSettingsErrorStateOld = ((AccountHomeError) obj).f5700a;
                itemAccountHomeErrorOptionBindingModel_.t();
                itemAccountHomeErrorOptionBindingModel_.n = accountSettingsErrorStateOld;
                AccountSettingsViewModelOld accountSettingsViewModelOld = this.viewModel;
                itemAccountHomeErrorOptionBindingModel_.t();
                itemAccountHomeErrorOptionBindingModel_.o = accountSettingsViewModelOld;
                add(itemAccountHomeErrorOptionBindingModel_);
            } else if (obj instanceof AccountHomeFooter) {
                buildAccountFooter((AccountHomeFooter) obj, this.viewModel);
            } else if (obj instanceof RewardsNotificationBannerApiData) {
                buildAccountBanner((RewardsNotificationBannerApiData) obj, accountSettingsClickListenerOld);
            } else if (obj instanceof BasicInsetAlertModel) {
                buildAlert((BasicInsetAlertModel) obj, accountSettingsClickListenerOld);
            }
        }
    }
}
