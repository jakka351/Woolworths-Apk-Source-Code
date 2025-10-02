package au.com.woolworths.shop.deliveryunlimited.signup.selectplan;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.base.shopapp.modules.spacer.SpacerApiData;
import au.com.woolworths.base.shopapp.modules.spacer.SpacerApiDataKt;
import au.com.woolworths.shop.deliveryunlimited.signup.ItemDeliveryUnlimitedPlanBindingModel_;
import au.com.woolworths.shop.deliveryunlimited.signup.ItemDeliveryUnlimitedPlanFeatureBindingModel_;
import au.com.woolworths.shop.deliveryunlimited.signup.ItemDeliveryUnlimitedPlanTypeTabLayoutBindingModel_;
import au.com.woolworths.shop.deliveryunlimited.signup.ItemDeliveryUnlimitedSignUpInsetBannerBindingModel_;
import au.com.woolworths.shop.deliveryunlimited.signup.ItemDeliveryUnlimitedSpacerWrapperBindingModel_;
import au.com.woolworths.shop.deliveryunlimited.signup.analytics.SelectPlanActionData;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpPlanFeature;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpPlanTypeUiModel;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpPlanUiModel;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.EpoxyItemDeliveryUnlimitedPlanTypeTabLayoutBinding;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.TypedEpoxyController;
import com.google.android.material.tabs.TabLayout;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\u0016\u0010\r\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\f\u0010\u0012\u001a\u00020\u000b*\u00020\u0013H\u0002J\f\u0010\u0012\u001a\u00020\u000b*\u00020\u0014H\u0002J\f\u0010\u0012\u001a\u00020\u000b*\u00020\u0015H\u0002J\f\u0010\u0012\u001a\u00020\u000b*\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/selectplan/SelectPlanEpoxyController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpPlanTypeUiModel;", "clickListener", "Lau/com/woolworths/shop/deliveryunlimited/signup/selectplan/SelectPlanClickListener;", "analyticsManager", "Lau/com/woolworths/android/onesite/analytics/AnalyticsManager;", "<init>", "(Lau/com/woolworths/shop/deliveryunlimited/signup/selectplan/SelectPlanClickListener;Lau/com/woolworths/android/onesite/analytics/AnalyticsManager;)V", "buildModels", "", "data", "buildTabLayout", "buildTabs", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "planTypes", "buildModel", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBanner;", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpPlanFeature;", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpPlanUiModel;", "Lau/com/woolworths/base/shopapp/modules/spacer/SpacerApiData;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SelectPlanEpoxyController extends TypedEpoxyController<List<? extends DeliveryUnlimitedSignUpPlanTypeUiModel>> {
    public static final int $stable = 8;

    @NotNull
    private final AnalyticsManager analyticsManager;

    @NotNull
    private final SelectPlanClickListener clickListener;

    public SelectPlanEpoxyController(@NotNull SelectPlanClickListener clickListener, @NotNull AnalyticsManager analyticsManager) {
        Intrinsics.h(clickListener, "clickListener");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.clickListener = clickListener;
        this.analyticsManager = analyticsManager;
    }

    private final void buildModel(InsetBanner insetBanner) {
        ItemDeliveryUnlimitedSignUpInsetBannerBindingModel_ itemDeliveryUnlimitedSignUpInsetBannerBindingModel_ = new ItemDeliveryUnlimitedSignUpInsetBannerBindingModel_();
        itemDeliveryUnlimitedSignUpInsetBannerBindingModel_.M("banner_" + itemDeliveryUnlimitedSignUpInsetBannerBindingModel_.hashCode());
        itemDeliveryUnlimitedSignUpInsetBannerBindingModel_.t();
        itemDeliveryUnlimitedSignUpInsetBannerBindingModel_.o = insetBanner;
        SelectPlanClickListener selectPlanClickListener = this.clickListener;
        itemDeliveryUnlimitedSignUpInsetBannerBindingModel_.t();
        itemDeliveryUnlimitedSignUpInsetBannerBindingModel_.p = selectPlanClickListener;
        au.com.woolworths.product.details.b bVar = new au.com.woolworths.product.details.b(7, insetBanner, this);
        itemDeliveryUnlimitedSignUpInsetBannerBindingModel_.t();
        itemDeliveryUnlimitedSignUpInsetBannerBindingModel_.n = bVar;
        add(itemDeliveryUnlimitedSignUpInsetBannerBindingModel_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModel$lambda$7$lambda$6(InsetBanner insetBanner, SelectPlanEpoxyController selectPlanEpoxyController, ItemDeliveryUnlimitedSignUpInsetBannerBindingModel_ itemDeliveryUnlimitedSignUpInsetBannerBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        Text title = insetBanner.getE();
        if (title == null && (title = insetBanner.getF()) == null) {
            return;
        }
        AnalyticsManager analyticsManager = selectPlanEpoxyController.analyticsManager;
        SelectPlanActionData selectPlanActionData = SelectPlanActionData.f;
        TrackableValue trackableValue = TrackableValue.n;
        Context context = dataBindingHolder.f13309a.h.getContext();
        Intrinsics.g(context, "getContext(...)");
        analyticsManager.j(selectPlanActionData, TrackingMetadata.Companion.a(trackableValue, title.getText(context)));
    }

    private final void buildTabLayout(List<DeliveryUnlimitedSignUpPlanTypeUiModel> data) {
        if (data.size() <= 1) {
            return;
        }
        ItemDeliveryUnlimitedPlanTypeTabLayoutBindingModel_ itemDeliveryUnlimitedPlanTypeTabLayoutBindingModel_ = new ItemDeliveryUnlimitedPlanTypeTabLayoutBindingModel_();
        itemDeliveryUnlimitedPlanTypeTabLayoutBindingModel_.M();
        au.com.woolworths.product.details.b bVar = new au.com.woolworths.product.details.b(6, this, data);
        itemDeliveryUnlimitedPlanTypeTabLayoutBindingModel_.t();
        itemDeliveryUnlimitedPlanTypeTabLayoutBindingModel_.n = bVar;
        add(itemDeliveryUnlimitedPlanTypeTabLayoutBindingModel_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildTabLayout$lambda$3$lambda$2(SelectPlanEpoxyController selectPlanEpoxyController, List list, ItemDeliveryUnlimitedPlanTypeTabLayoutBindingModel_ itemDeliveryUnlimitedPlanTypeTabLayoutBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        ViewDataBinding viewDataBinding = dataBindingHolder.f13309a;
        Intrinsics.f(viewDataBinding, "null cannot be cast to non-null type au.com.woolworths.shop.deliveryunlimited.signup.databinding.EpoxyItemDeliveryUnlimitedPlanTypeTabLayoutBinding");
        TabLayout tabLayout = ((EpoxyItemDeliveryUnlimitedPlanTypeTabLayoutBinding) viewDataBinding).z;
        Intrinsics.g(tabLayout, "tabLayout");
        selectPlanEpoxyController.buildTabs(tabLayout, list);
    }

    private final void buildTabs(TabLayout tabLayout, List<DeliveryUnlimitedSignUpPlanTypeUiModel> planTypes) {
        for (DeliveryUnlimitedSignUpPlanTypeUiModel deliveryUnlimitedSignUpPlanTypeUiModel : planTypes) {
            TabLayout.Tab tabI = tabLayout.i();
            tabI.b(deliveryUnlimitedSignUpPlanTypeUiModel.f10870a);
            tabLayout.a(new TabLayout.OnTabSelectedListener() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanEpoxyController$buildTabs$1$tab$1$1
                @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
                public final void a(TabLayout.Tab tab) {
                    this.f10901a.clickListener.F1(tab.d);
                }

                @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
                public final void b(TabLayout.Tab tab) {
                }

                @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
                public final void c(TabLayout.Tab tab) {
                }
            });
            tabLayout.b(tabI, deliveryUnlimitedSignUpPlanTypeUiModel.c);
        }
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends DeliveryUnlimitedSignUpPlanTypeUiModel> list) {
        buildModels2((List<DeliveryUnlimitedSignUpPlanTypeUiModel>) list);
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(@NotNull List<DeliveryUnlimitedSignUpPlanTypeUiModel> data) {
        Intrinsics.h(data, "data");
        for (DeliveryUnlimitedSignUpPlanTypeUiModel deliveryUnlimitedSignUpPlanTypeUiModel : data) {
            if (deliveryUnlimitedSignUpPlanTypeUiModel.c) {
                buildTabLayout(data);
                for (Object obj : deliveryUnlimitedSignUpPlanTypeUiModel.b) {
                    if (obj instanceof InsetBanner) {
                        buildModel((InsetBanner) obj);
                    } else if (obj instanceof DeliveryUnlimitedSignUpPlanFeature) {
                        buildModel((DeliveryUnlimitedSignUpPlanFeature) obj);
                    } else if (obj instanceof DeliveryUnlimitedSignUpPlanUiModel) {
                        buildModel((DeliveryUnlimitedSignUpPlanUiModel) obj);
                    } else if (obj instanceof SpacerApiData) {
                        buildModel((SpacerApiData) obj);
                    }
                }
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final void buildModel(DeliveryUnlimitedSignUpPlanFeature deliveryUnlimitedSignUpPlanFeature) {
        ItemDeliveryUnlimitedPlanFeatureBindingModel_ itemDeliveryUnlimitedPlanFeatureBindingModel_ = new ItemDeliveryUnlimitedPlanFeatureBindingModel_();
        itemDeliveryUnlimitedPlanFeatureBindingModel_.M("feature_item_" + itemDeliveryUnlimitedPlanFeatureBindingModel_.hashCode());
        itemDeliveryUnlimitedPlanFeatureBindingModel_.t();
        itemDeliveryUnlimitedPlanFeatureBindingModel_.n = deliveryUnlimitedSignUpPlanFeature;
        add(itemDeliveryUnlimitedPlanFeatureBindingModel_);
    }

    private final void buildModel(DeliveryUnlimitedSignUpPlanUiModel deliveryUnlimitedSignUpPlanUiModel) {
        ItemDeliveryUnlimitedPlanBindingModel_ itemDeliveryUnlimitedPlanBindingModel_ = new ItemDeliveryUnlimitedPlanBindingModel_();
        itemDeliveryUnlimitedPlanBindingModel_.M("plan_item_" + itemDeliveryUnlimitedPlanBindingModel_.hashCode());
        itemDeliveryUnlimitedPlanBindingModel_.t();
        itemDeliveryUnlimitedPlanBindingModel_.n = deliveryUnlimitedSignUpPlanUiModel;
        SelectPlanClickListener selectPlanClickListener = this.clickListener;
        itemDeliveryUnlimitedPlanBindingModel_.t();
        itemDeliveryUnlimitedPlanBindingModel_.o = selectPlanClickListener;
        add(itemDeliveryUnlimitedPlanBindingModel_);
    }

    private final void buildModel(SpacerApiData spacerApiData) {
        ItemDeliveryUnlimitedSpacerWrapperBindingModel_ itemDeliveryUnlimitedSpacerWrapperBindingModel_ = new ItemDeliveryUnlimitedSpacerWrapperBindingModel_();
        itemDeliveryUnlimitedSpacerWrapperBindingModel_.M("spacer_" + itemDeliveryUnlimitedSpacerWrapperBindingModel_.hashCode());
        int iA = SpacerApiDataKt.a(spacerApiData);
        itemDeliveryUnlimitedSpacerWrapperBindingModel_.t();
        itemDeliveryUnlimitedSpacerWrapperBindingModel_.n = iA;
        add(itemDeliveryUnlimitedSpacerWrapperBindingModel_);
    }
}
