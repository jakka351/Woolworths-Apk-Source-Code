package au.com.woolworths.feature.rewards.offers;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.rewards.offers.databinding.ActivitySpinSurpriseGameBindingImpl;
import au.com.woolworths.feature.rewards.offers.databinding.EpoxyItemRewardsOfferEmptyStateFullBindingImpl;
import au.com.woolworths.feature.rewards.offers.databinding.EpoxyItemRewardsOfferSectionTitleBindingImpl;
import au.com.woolworths.feature.rewards.offers.databinding.EpoxyItemRewardsOfferTileCompatBindingImpl;
import au.com.woolworths.feature.rewards.offers.databinding.EpoxyItemRewardsOffersFilterBindingImpl;
import au.com.woolworths.feature.rewards.offers.databinding.EpoxyItemRewardsOffersFilterNoOffersBindingImpl;
import au.com.woolworths.feature.rewards.offers.databinding.EpoxyItemRewardsProductOfferEmptyTileBindingImpl;
import au.com.woolworths.feature.rewards.offers.databinding.EpoxyItemRewardsProductOfferTileBindingImpl;
import au.com.woolworths.feature.rewards.offers.databinding.EpoxyItemSpinSurpriseBannerBindingImpl;
import au.com.woolworths.feature.rewards.offers.databinding.EpoxyItemStandardBannerBindingImpl;
import au.com.woolworths.feature.rewards.offers.databinding.FragmentRewardsOffersBindingImpl;
import au.com.woolworths.feature.rewards.offers.databinding.IncludeSpinsurpriseDownloadableAssetBindingImpl;
import au.com.woolworths.feature.rewards.offers.databinding.ItemRewardsOfferGroupTitleBindingImpl;
import au.com.woolworths.feature.rewards.offers.databinding.ItemRewardsOffersFilterGroupBindingImpl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f6225a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = au.com.woolworths.android.onesite.a.b(63, 0, 1, "_all", "actionState");
            sparseArrayB.put(2, "asset");
            sparseArrayB.put(3, "backgroundColor");
            sparseArrayB.put(4, "banner");
            sparseArrayB.put(5, "bannerState");
            sparseArrayB.put(6, "brandLabel");
            sparseArrayB.put(7, "buttonText");
            sparseArrayB.put(8, "buttonTint");
            sparseArrayB.put(9, "clickHandler");
            sparseArrayB.put(10, "clickHandlers");
            sparseArrayB.put(11, "clickListener");
            sparseArrayB.put(12, "coachMark");
            sparseArrayB.put(13, "ctaText");
            sparseArrayB.put(14, "data");
            sparseArrayB.put(15, "emptyState");
            sparseArrayB.put(16, "enabled");
            sparseArrayB.put(17, "errorState");
            sparseArrayB.put(18, "filter");
            sparseArrayB.put(19, "groupTitle");
            sparseArrayB.put(20, "handler");
            sparseArrayB.put(21, "heightRes");
            sparseArrayB.put(22, "imageLoaderListener");
            sparseArrayB.put(23, "importantForAccessibility");
            sparseArrayB.put(24, "index");
            sparseArrayB.put(25, "infoSectionItem");
            sparseArrayB.put(26, "inlineMessage");
            sparseArrayB.put(27, "isAccountNotificationBadgeShown");
            sparseArrayB.put(28, "isChecked");
            sparseArrayB.put(29, "isCtaInProgress");
            sparseArrayB.put(30, "isEnabled");
            sparseArrayB.put(31, "isLowerPriceYellow");
            sparseArrayB.put(32, "isRewardStyle");
            sparseArrayB.put(33, "isSelected");
            sparseArrayB.put(34, "isUnlocking");
            sparseArrayB.put(35, "item");
            sparseArrayB.put(36, "itemWidthRes");
            sparseArrayB.put(37, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(38, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(39, "loadingMessage");
            sparseArrayB.put(40, "lottieAutoPlay");
            sparseArrayB.put(41, "lottieBackgroundColor");
            sparseArrayB.put(42, "lottieLoop");
            sparseArrayB.put(43, "margins");
            sparseArrayB.put(44, "offerViewItem");
            sparseArrayB.put(45, "onBannerClick");
            sparseArrayB.put(46, "onClick");
            sparseArrayB.put(47, "onPointsBalanceClick");
            sparseArrayB.put(48, "onQueryTextChangeListener");
            sparseArrayB.put(49, "onQueryTextFocusChangeListener");
            sparseArrayB.put(50, "onQueryTextSubmitListener");
            sparseArrayB.put(51, "paddingBottom");
            sparseArrayB.put(52, "rewardsPointsBalance");
            sparseArrayB.put(53, "rewardsPointsBalanceData");
            sparseArrayB.put(54, "searchQueryHint");
            sparseArrayB.put(55, "section");
            sparseArrayB.put(56, "sectionTitle");
            sparseArrayB.put(57, "showNewDismissIcon");
            sparseArrayB.put(58, "state");
            sparseArrayB.put(59, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(60, "title");
            sparseArrayB.put(61, "viewListener");
            sparseArrayB.put(62, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f6226a;

        static {
            HashMap map = new HashMap(14);
            f6226a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_spin_surprise_game, map, "layout/activity_spin_surprise_game_0", com.woolworths.R.layout.epoxy_item_rewards_offer_empty_state_full, "layout/epoxy_item_rewards_offer_empty_state_full_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_rewards_offer_section_title, map, "layout/epoxy_item_rewards_offer_section_title_0", com.woolworths.R.layout.epoxy_item_rewards_offer_tile_compat, "layout/epoxy_item_rewards_offer_tile_compat_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_rewards_offers_filter, map, "layout/epoxy_item_rewards_offers_filter_0", com.woolworths.R.layout.epoxy_item_rewards_offers_filter_no_offers, "layout/epoxy_item_rewards_offers_filter_no_offers_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_rewards_product_offer_empty_tile, map, "layout/epoxy_item_rewards_product_offer_empty_tile_0", com.woolworths.R.layout.epoxy_item_rewards_product_offer_tile, "layout/epoxy_item_rewards_product_offer_tile_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_spin_surprise_banner, map, "layout/epoxy_item_spin_surprise_banner_0", com.woolworths.R.layout.epoxy_item_standard_banner, "layout/epoxy_item_standard_banner_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.fragment_rewards_offers, map, "layout/fragment_rewards_offers_0", com.woolworths.R.layout.include_spinsurprise_downloadable_asset, "layout/include_spinsurprise_downloadable_asset_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.item_rewards_offer_group_title, map, "layout/item_rewards_offer_group_title_0", com.woolworths.R.layout.item_rewards_offers_filter_group, "layout/item_rewards_offers_filter_group_0");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(14);
        f6225a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_spin_surprise_game, 1);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_rewards_offer_empty_state_full, 2);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_rewards_offer_section_title, 3);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_rewards_offer_tile_compat, 4);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_rewards_offers_filter, 5);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_rewards_offers_filter_no_offers, 6);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_rewards_product_offer_empty_tile, 7);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_rewards_product_offer_tile, 8);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_spin_surprise_banner, 9);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_standard_banner, 10);
        sparseIntArray.put(com.woolworths.R.layout.fragment_rewards_offers, 11);
        sparseIntArray.put(com.woolworths.R.layout.include_spinsurprise_downloadable_asset, 12);
        sparseIntArray.put(com.woolworths.R.layout.item_rewards_offer_group_title, 13);
        sparseIntArray.put(com.woolworths.R.layout.item_rewards_offers_filter_group, 14);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.foundation.rewards.offers.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.marketing.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.rewards.base.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f6225a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if ("layout/activity_spin_surprise_game_0".equals(tag)) {
                        return new ActivitySpinSurpriseGameBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for activity_spin_surprise_game is invalid. Received: "));
                case 2:
                    if ("layout/epoxy_item_rewards_offer_empty_state_full_0".equals(tag)) {
                        return new EpoxyItemRewardsOfferEmptyStateFullBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_rewards_offer_empty_state_full is invalid. Received: "));
                case 3:
                    if ("layout/epoxy_item_rewards_offer_section_title_0".equals(tag)) {
                        return new EpoxyItemRewardsOfferSectionTitleBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_rewards_offer_section_title is invalid. Received: "));
                case 4:
                    if (!"layout/epoxy_item_rewards_offer_tile_compat_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_rewards_offer_tile_compat is invalid. Received: "));
                    }
                    EpoxyItemRewardsOfferTileCompatBindingImpl epoxyItemRewardsOfferTileCompatBindingImpl = new EpoxyItemRewardsOfferTileCompatBindingImpl(dataBindingComponent, view, (ComposeView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    epoxyItemRewardsOfferTileCompatBindingImpl.z = -1L;
                    epoxyItemRewardsOfferTileCompatBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, epoxyItemRewardsOfferTileCompatBindingImpl);
                    epoxyItemRewardsOfferTileCompatBindingImpl.r();
                    return epoxyItemRewardsOfferTileCompatBindingImpl;
                case 5:
                    if ("layout/epoxy_item_rewards_offers_filter_0".equals(tag)) {
                        return new EpoxyItemRewardsOffersFilterBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_rewards_offers_filter is invalid. Received: "));
                case 6:
                    if (!"layout/epoxy_item_rewards_offers_filter_no_offers_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_rewards_offers_filter_no_offers is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, null, EpoxyItemRewardsOffersFilterNoOffersBindingImpl.D);
                    ImageView imageView = (ImageView) objArrT[1];
                    EpoxyItemRewardsOffersFilterNoOffersBindingImpl epoxyItemRewardsOffersFilterNoOffersBindingImpl = new EpoxyItemRewardsOffersFilterNoOffersBindingImpl(view, imageView, (TextView) objArrT[3], (TextView) objArrT[2], dataBindingComponent);
                    epoxyItemRewardsOffersFilterNoOffersBindingImpl.C = -1L;
                    epoxyItemRewardsOffersFilterNoOffersBindingImpl.y.setTag(null);
                    epoxyItemRewardsOffersFilterNoOffersBindingImpl.z.setTag(null);
                    epoxyItemRewardsOffersFilterNoOffersBindingImpl.A.setTag(null);
                    ((ConstraintLayout) objArrT[0]).setTag(null);
                    epoxyItemRewardsOffersFilterNoOffersBindingImpl.E(view);
                    epoxyItemRewardsOffersFilterNoOffersBindingImpl.r();
                    return epoxyItemRewardsOffersFilterNoOffersBindingImpl;
                case 7:
                    if ("layout/epoxy_item_rewards_product_offer_empty_tile_0".equals(tag)) {
                        return new EpoxyItemRewardsProductOfferEmptyTileBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_rewards_product_offer_empty_tile is invalid. Received: "));
                case 8:
                    if ("layout/epoxy_item_rewards_product_offer_tile_0".equals(tag)) {
                        return new EpoxyItemRewardsProductOfferTileBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_rewards_product_offer_tile is invalid. Received: "));
                case 9:
                    if ("layout/epoxy_item_spin_surprise_banner_0".equals(tag)) {
                        return new EpoxyItemSpinSurpriseBannerBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_spin_surprise_banner is invalid. Received: "));
                case 10:
                    if ("layout/epoxy_item_standard_banner_0".equals(tag)) {
                        return new EpoxyItemStandardBannerBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_standard_banner is invalid. Received: "));
                case 11:
                    if ("layout/fragment_rewards_offers_0".equals(tag)) {
                        return new FragmentRewardsOffersBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for fragment_rewards_offers is invalid. Received: "));
                case 12:
                    if ("layout/include_spinsurprise_downloadable_asset_0".equals(tag)) {
                        return new IncludeSpinsurpriseDownloadableAssetBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for include_spinsurprise_downloadable_asset is invalid. Received: "));
                case 13:
                    if ("layout/item_rewards_offer_group_title_0".equals(tag)) {
                        return new ItemRewardsOfferGroupTitleBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for item_rewards_offer_group_title is invalid. Received: "));
                case 14:
                    if (!"layout/item_rewards_offers_filter_group_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for item_rewards_offers_filter_group is invalid. Received: "));
                    }
                    Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 2, null, ItemRewardsOffersFilterGroupBindingImpl.z);
                    ItemRewardsOffersFilterGroupBindingImpl itemRewardsOffersFilterGroupBindingImpl = new ItemRewardsOffersFilterGroupBindingImpl(dataBindingComponent, view, 0);
                    itemRewardsOffersFilterGroupBindingImpl.y = -1L;
                    ((HorizontalScrollView) objArrT2[0]).setTag(null);
                    itemRewardsOffersFilterGroupBindingImpl.E(view);
                    itemRewardsOffersFilterGroupBindingImpl.r();
                    return itemRewardsOffersFilterGroupBindingImpl;
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f6225a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f6226a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
