package au.com.woolworths.feature.shop.more;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.banners.broadcastbanner.BroadcastBannerKt;
import au.com.woolworths.feature.shop.more.data.MoreChatToUs;
import au.com.woolworths.feature.shop.more.data.MoreCiscoWiFi;
import au.com.woolworths.feature.shop.more.data.MoreData;
import au.com.woolworths.feature.shop.more.data.MoreDeleteAccount;
import au.com.woolworths.feature.shop.more.data.MoreDeliveryUnlimited;
import au.com.woolworths.feature.shop.more.data.MoreDeliveryUnlimitedUnavailable;
import au.com.woolworths.feature.shop.more.data.MoreExplainingValue;
import au.com.woolworths.feature.shop.more.data.MoreFoodTracker;
import au.com.woolworths.feature.shop.more.data.MoreNotifications;
import au.com.woolworths.feature.shop.more.data.MoreOnlineShopping;
import au.com.woolworths.feature.shop.more.data.MoreReceiptPreferences;
import au.com.woolworths.feature.shop.more.data.MoreRewardsCard;
import au.com.woolworths.feature.shop.more.data.MoreTileItem;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.sdui.shop.alert.StandardAlertKt;
import au.com.woolworths.sdui.shop.alert.model.BasicInsetAlertModel;
import com.airbnb.epoxy.ComposeInteropKt;
import com.airbnb.epoxy.TypedEpoxyController;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0014J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreEpoxyController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "Lau/com/woolworths/feature/shop/more/data/MoreData;", "viewModel", "Lau/com/woolworths/feature/shop/more/MoreViewModel;", "<init>", "(Lau/com/woolworths/feature/shop/more/MoreViewModel;)V", "buildModels", "", "viewState", "buildRewardsHeaderModel", "buildAlert", "data", "buildBroadcastBanner", "Companion", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MoreEpoxyController extends TypedEpoxyController<MoreData> {
    public static final int $stable = 8;

    @NotNull
    public static final String REWARDS_CARD = "rewards_card";

    @NotNull
    private final MoreViewModel viewModel;

    public MoreEpoxyController(@NotNull MoreViewModel viewModel) {
        Intrinsics.h(viewModel, "viewModel");
        this.viewModel = viewModel;
    }

    private final void buildAlert(MoreData data) {
        List listA = data.g.getFeed();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (obj instanceof BasicInsetAlertModel) {
                arrayList.add(obj);
            }
        }
        final BasicInsetAlertModel basicInsetAlertModel = (BasicInsetAlertModel) CollectionsKt.F(arrayList);
        if (basicInsetAlertModel != null) {
            ComposeInteropKt.a(this, "more_alert_1", new Object[]{basicInsetAlertModel}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.more.MoreEpoxyController$buildAlert$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer = (Composer) obj2;
                    if ((((Number) obj3).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final BasicInsetAlertModel basicInsetAlertModel2 = basicInsetAlertModel;
                        final MoreEpoxyController moreEpoxyController = this;
                        CoreThemeKt.c(6, composer, ComposableLambdaKt.c(521755393, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.more.MoreEpoxyController$buildAlert$1$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer2 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    composer2.o(5004770);
                                    MoreEpoxyController moreEpoxyController2 = moreEpoxyController;
                                    boolean zI = composer2.I(moreEpoxyController2);
                                    Object objG = composer2.G();
                                    if (zI || objG == Composer.Companion.f1624a) {
                                        objG = new a(moreEpoxyController2, 0);
                                        composer2.A(objG);
                                    }
                                    composer2.l();
                                    StandardAlertKt.a(basicInsetAlertModel2, (Function1) objG, PaddingKt.j(PaddingKt.h(Modifier.Companion.d, 16, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 8, 7), null, composer2, 392, 8);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, -1235333979));
        }
    }

    private final void buildBroadcastBanner(MoreData data) {
        List listA = data.g.getFeed();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (obj instanceof BroadcastBannerData) {
                arrayList.add(obj);
            }
        }
        final BroadcastBannerData broadcastBannerData = (BroadcastBannerData) CollectionsKt.F(arrayList);
        if (broadcastBannerData != null) {
            ComposeInteropKt.a(this, "more_broadcast_banner_1", new Object[]{broadcastBannerData}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.more.MoreEpoxyController$buildBroadcastBanner$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer = (Composer) obj2;
                    if ((((Number) obj3).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final BroadcastBannerData broadcastBannerData2 = broadcastBannerData;
                        final MoreEpoxyController moreEpoxyController = this;
                        ThemeKt.b(6, composer, ComposableLambdaKt.c(2007416691, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.more.MoreEpoxyController$buildBroadcastBanner$1$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer2 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    composer2.o(5004770);
                                    MoreEpoxyController moreEpoxyController2 = moreEpoxyController;
                                    boolean zI = composer2.I(moreEpoxyController2);
                                    Object objG = composer2.G();
                                    Object obj6 = Composer.Companion.f1624a;
                                    if (zI || objG == obj6) {
                                        objG = new a(moreEpoxyController2, 1);
                                        composer2.A(objG);
                                    }
                                    Function1 function1 = (Function1) objG;
                                    composer2.l();
                                    composer2.o(5004770);
                                    boolean zI2 = composer2.I(moreEpoxyController2);
                                    Object objG2 = composer2.G();
                                    if (zI2 || objG2 == obj6) {
                                        objG2 = new a(moreEpoxyController2, 2);
                                        composer2.A(objG2);
                                    }
                                    composer2.l();
                                    BroadcastBannerKt.a(broadcastBannerData2, function1, (Function1) objG2, PaddingKt.j(PaddingKt.h(Modifier.Companion.d, 16, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 8, 7), null, composer2, 3072, 16);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, -566124245));
        }
    }

    private final void buildRewardsHeaderModel(MoreData viewState) {
        Object next;
        Iterator it = viewState.g.getFeed().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof MoreRewardsCard) {
                    break;
                }
            }
        }
        if (next == null || !(next instanceof MoreRewardsCard)) {
            return;
        }
        ItemMoreRewardsCardBindingModel_ itemMoreRewardsCardBindingModel_ = new ItemMoreRewardsCardBindingModel_();
        itemMoreRewardsCardBindingModel_.M();
        itemMoreRewardsCardBindingModel_.t();
        itemMoreRewardsCardBindingModel_.o = (MoreRewardsCard) next;
        MoreViewModel moreViewModel = this.viewModel;
        itemMoreRewardsCardBindingModel_.t();
        itemMoreRewardsCardBindingModel_.n = moreViewModel;
        add(itemMoreRewardsCardBindingModel_);
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@NotNull MoreData viewState) {
        Intrinsics.h(viewState, "viewState");
        buildRewardsHeaderModel(viewState);
        buildBroadcastBanner(viewState);
        buildAlert(viewState);
        Text text = viewState.c;
        if (text != null) {
            ItemMoreUsernameBindingModel_ itemMoreUsernameBindingModel_ = new ItemMoreUsernameBindingModel_();
            itemMoreUsernameBindingModel_.r(Integer.valueOf(text.hashCode()));
            MoreViewModel moreViewModel = this.viewModel;
            itemMoreUsernameBindingModel_.t();
            itemMoreUsernameBindingModel_.n = moreViewModel;
            add(itemMoreUsernameBindingModel_);
        } else {
            ItemMoreLoginSignupBindingModel_ itemMoreLoginSignupBindingModel_ = new ItemMoreLoginSignupBindingModel_();
            itemMoreLoginSignupBindingModel_.M();
            MoreViewModel moreViewModel2 = this.viewModel;
            itemMoreLoginSignupBindingModel_.t();
            itemMoreLoginSignupBindingModel_.n = moreViewModel2;
            add(itemMoreLoginSignupBindingModel_);
        }
        for (Object obj : viewState.g.getFeed()) {
            if (obj instanceof MoreDeliveryUnlimited) {
                ItemDeliveryUnlimitedBindingModel_ itemDeliveryUnlimitedBindingModel_ = new ItemDeliveryUnlimitedBindingModel_();
                MoreDeliveryUnlimited moreDeliveryUnlimited = (MoreDeliveryUnlimited) obj;
                itemDeliveryUnlimitedBindingModel_.r(Integer.valueOf(moreDeliveryUnlimited.hashCode()));
                itemDeliveryUnlimitedBindingModel_.t();
                itemDeliveryUnlimitedBindingModel_.n = moreDeliveryUnlimited;
                MoreViewModel moreViewModel3 = this.viewModel;
                itemDeliveryUnlimitedBindingModel_.t();
                itemDeliveryUnlimitedBindingModel_.o = moreViewModel3;
                add(itemDeliveryUnlimitedBindingModel_);
            } else if (obj instanceof MoreDeliveryUnlimitedUnavailable) {
                ItemDeliveryUnlimitedUnavailableBindingModel_ itemDeliveryUnlimitedUnavailableBindingModel_ = new ItemDeliveryUnlimitedUnavailableBindingModel_();
                MoreDeliveryUnlimitedUnavailable moreDeliveryUnlimitedUnavailable = (MoreDeliveryUnlimitedUnavailable) obj;
                itemDeliveryUnlimitedUnavailableBindingModel_.r(Integer.valueOf(moreDeliveryUnlimitedUnavailable.f7630a.hashCode()));
                itemDeliveryUnlimitedUnavailableBindingModel_.t();
                itemDeliveryUnlimitedUnavailableBindingModel_.n = moreDeliveryUnlimitedUnavailable;
                MoreViewModel moreViewModel4 = this.viewModel;
                itemDeliveryUnlimitedUnavailableBindingModel_.t();
                itemDeliveryUnlimitedUnavailableBindingModel_.o = moreViewModel4;
                add(itemDeliveryUnlimitedUnavailableBindingModel_);
            } else if (obj instanceof MoreCiscoWiFi) {
                ItemMoreWifiBindingModel_ itemMoreWifiBindingModel_ = new ItemMoreWifiBindingModel_();
                MoreCiscoWiFi moreCiscoWiFi = (MoreCiscoWiFi) obj;
                itemMoreWifiBindingModel_.r(Integer.valueOf(moreCiscoWiFi.hashCode()));
                itemMoreWifiBindingModel_.t();
                itemMoreWifiBindingModel_.n = moreCiscoWiFi;
                MoreViewModel moreViewModel5 = this.viewModel;
                itemMoreWifiBindingModel_.t();
                itemMoreWifiBindingModel_.o = moreViewModel5;
                add(itemMoreWifiBindingModel_);
            } else if (obj instanceof MoreChatToUs) {
                ItemMoreChatToUsBindingModel_ itemMoreChatToUsBindingModel_ = new ItemMoreChatToUsBindingModel_();
                itemMoreChatToUsBindingModel_.M();
                itemMoreChatToUsBindingModel_.t();
                itemMoreChatToUsBindingModel_.n = (MoreChatToUs) obj;
                MoreViewModel moreViewModel6 = this.viewModel;
                itemMoreChatToUsBindingModel_.t();
                itemMoreChatToUsBindingModel_.o = moreViewModel6;
                Boolean boolValueOf = Boolean.valueOf(viewState.h);
                itemMoreChatToUsBindingModel_.t();
                itemMoreChatToUsBindingModel_.p = boolValueOf;
                add(itemMoreChatToUsBindingModel_);
            } else if (obj instanceof MoreReceiptPreferences) {
                ItemMoreReceiptPreferencesBindingModel_ itemMoreReceiptPreferencesBindingModel_ = new ItemMoreReceiptPreferencesBindingModel_();
                MoreReceiptPreferences moreReceiptPreferences = (MoreReceiptPreferences) obj;
                itemMoreReceiptPreferencesBindingModel_.M(String.valueOf(moreReceiptPreferences.hashCode()));
                itemMoreReceiptPreferencesBindingModel_.t();
                itemMoreReceiptPreferencesBindingModel_.n = moreReceiptPreferences;
                MoreViewModel moreViewModel7 = this.viewModel;
                itemMoreReceiptPreferencesBindingModel_.t();
                itemMoreReceiptPreferencesBindingModel_.o = moreViewModel7;
                add(itemMoreReceiptPreferencesBindingModel_);
            } else if (obj instanceof MoreOnlineShopping) {
                ItemMoreOnlineShoppingBindingModel_ itemMoreOnlineShoppingBindingModel_ = new ItemMoreOnlineShoppingBindingModel_();
                MoreOnlineShopping moreOnlineShopping = (MoreOnlineShopping) obj;
                itemMoreOnlineShoppingBindingModel_.M(String.valueOf(moreOnlineShopping.hashCode()));
                itemMoreOnlineShoppingBindingModel_.t();
                itemMoreOnlineShoppingBindingModel_.n = moreOnlineShopping;
                MoreViewModel moreViewModel8 = this.viewModel;
                itemMoreOnlineShoppingBindingModel_.t();
                itemMoreOnlineShoppingBindingModel_.o = moreViewModel8;
                add(itemMoreOnlineShoppingBindingModel_);
            } else if (obj instanceof MoreExplainingValue) {
                ItemMoreExplainingValueBindingModel_ itemMoreExplainingValueBindingModel_ = new ItemMoreExplainingValueBindingModel_();
                MoreExplainingValue moreExplainingValue = (MoreExplainingValue) obj;
                itemMoreExplainingValueBindingModel_.M(String.valueOf(moreExplainingValue.hashCode()));
                itemMoreExplainingValueBindingModel_.t();
                itemMoreExplainingValueBindingModel_.n = moreExplainingValue;
                MoreViewModel moreViewModel9 = this.viewModel;
                itemMoreExplainingValueBindingModel_.t();
                itemMoreExplainingValueBindingModel_.o = moreViewModel9;
                add(itemMoreExplainingValueBindingModel_);
            } else if (obj instanceof MoreFoodTracker) {
                ItemMoreFoodTrackerBindingModel_ itemMoreFoodTrackerBindingModel_ = new ItemMoreFoodTrackerBindingModel_();
                MoreFoodTracker moreFoodTracker = (MoreFoodTracker) obj;
                itemMoreFoodTrackerBindingModel_.M(String.valueOf(moreFoodTracker.hashCode()));
                itemMoreFoodTrackerBindingModel_.t();
                itemMoreFoodTrackerBindingModel_.n = moreFoodTracker;
                MoreViewModel moreViewModel10 = this.viewModel;
                itemMoreFoodTrackerBindingModel_.t();
                itemMoreFoodTrackerBindingModel_.o = moreViewModel10;
                add(itemMoreFoodTrackerBindingModel_);
            } else if (obj instanceof MoreTileItem) {
                ItemMoreTileBindingModel_ itemMoreTileBindingModel_ = new ItemMoreTileBindingModel_();
                MoreTileItem moreTileItem = (MoreTileItem) obj;
                itemMoreTileBindingModel_.M(String.valueOf(moreTileItem.hashCode()));
                itemMoreTileBindingModel_.t();
                itemMoreTileBindingModel_.n = moreTileItem;
                MoreViewModel moreViewModel11 = this.viewModel;
                itemMoreTileBindingModel_.t();
                itemMoreTileBindingModel_.o = moreViewModel11;
                add(itemMoreTileBindingModel_);
            } else if (obj instanceof MoreNotifications) {
                ItemMoreNotificationsBindingModel_ itemMoreNotificationsBindingModel_ = new ItemMoreNotificationsBindingModel_();
                MoreNotifications moreNotifications = (MoreNotifications) obj;
                itemMoreNotificationsBindingModel_.M(String.valueOf(moreNotifications.hashCode()));
                itemMoreNotificationsBindingModel_.t();
                itemMoreNotificationsBindingModel_.n = moreNotifications;
                MoreViewModel moreViewModel12 = this.viewModel;
                itemMoreNotificationsBindingModel_.t();
                itemMoreNotificationsBindingModel_.o = moreViewModel12;
                add(itemMoreNotificationsBindingModel_);
            } else if (obj instanceof MoreDeleteAccount) {
                ItemMoreDeleteAccountBindingModel_ itemMoreDeleteAccountBindingModel_ = new ItemMoreDeleteAccountBindingModel_();
                MoreDeleteAccount moreDeleteAccount = (MoreDeleteAccount) obj;
                itemMoreDeleteAccountBindingModel_.M(String.valueOf(moreDeleteAccount.hashCode()));
                itemMoreDeleteAccountBindingModel_.t();
                itemMoreDeleteAccountBindingModel_.n = moreDeleteAccount;
                MoreViewModel moreViewModel13 = this.viewModel;
                itemMoreDeleteAccountBindingModel_.t();
                itemMoreDeleteAccountBindingModel_.o = moreViewModel13;
                add(itemMoreDeleteAccountBindingModel_);
            }
        }
        ItemMoreAppVersionBindingModel_ itemMoreAppVersionBindingModel_ = new ItemMoreAppVersionBindingModel_();
        itemMoreAppVersionBindingModel_.r(Integer.valueOf(viewState.f.hashCode()));
        MoreViewModel moreViewModel14 = this.viewModel;
        itemMoreAppVersionBindingModel_.t();
        itemMoreAppVersionBindingModel_.n = moreViewModel14;
        add(itemMoreAppVersionBindingModel_);
    }
}
