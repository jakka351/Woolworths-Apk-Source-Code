package au.com.woolworths.product;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.camera.core.impl.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeTintableTextBinding;
import au.com.woolworths.product.databinding.EpoxyItemProductCardTileBindingImpl;
import au.com.woolworths.product.databinding.FragmentProductMessageBottomSheetBindingImpl;
import au.com.woolworths.product.databinding.IncludeProductMultibuyLabelBindingImpl;
import au.com.woolworths.product.databinding.IncludeProductMultibuyLabelNzBindingImpl;
import au.com.woolworths.product.databinding.LayoutMemberPriceLabelBindingImpl;
import au.com.woolworths.product.databinding.LayoutProductBoostBindingImpl;
import au.com.woolworths.product.databinding.LayoutProductInfoBindingImpl;
import au.com.woolworths.product.databinding.LayoutProductPriceBindingImpl;
import au.com.woolworths.product.databinding.StockIndicatorBindingImpl;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f9226a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(92, 0, 1, "_all", "actionState");
            sparseArrayB.put(2, "asset");
            sparseArrayB.put(3, "backgroundColor");
            sparseArrayB.put(4, "banner");
            sparseArrayB.put(5, "bannerAsset");
            sparseArrayB.put(6, "bannerIcon");
            sparseArrayB.put(7, "bannerState");
            sparseArrayB.put(8, "body");
            sparseArrayB.put(9, "boostAnimationVisibility");
            sparseArrayB.put(10, "boostViewListener");
            sparseArrayB.put(11, "brandLabel");
            sparseArrayB.put(12, "buttonText");
            sparseArrayB.put(13, "buttonTint");
            sparseArrayB.put(14, "canShowWatchlist");
            sparseArrayB.put(15, "clickHandler");
            sparseArrayB.put(16, "clickHandlers");
            sparseArrayB.put(17, "clickListener");
            sparseArrayB.put(18, "coachMark");
            sparseArrayB.put(19, "containerTitle");
            sparseArrayB.put(20, "cta");
            sparseArrayB.put(21, "ctaText");
            sparseArrayB.put(22, "data");
            sparseArrayB.put(23, "displayExpiryExtended");
            sparseArrayB.put(24, "emptyState");
            sparseArrayB.put(25, "enableBoostAnimationContainerGap");
            sparseArrayB.put(26, "enabled");
            sparseArrayB.put(27, "errorState");
            sparseArrayB.put(28, "filter");
            sparseArrayB.put(29, "footer");
            sparseArrayB.put(30, "groupTitle");
            sparseArrayB.put(31, "handler");
            sparseArrayB.put(32, "heightRes");
            sparseArrayB.put(33, "hostScreen");
            sparseArrayB.put(34, "htmlListener");
            sparseArrayB.put(35, "imageLoaderListener");
            sparseArrayB.put(36, "importantForAccessibility");
            sparseArrayB.put(37, "index");
            sparseArrayB.put(38, "infoSectionItem");
            sparseArrayB.put(39, "inlineMessage");
            sparseArrayB.put(40, "isAccountNotificationBadgeShown");
            sparseArrayB.put(41, "isChecked");
            sparseArrayB.put(42, "isCtaInProgress");
            sparseArrayB.put(43, "isEnabled");
            sparseArrayB.put(44, "isLowerPriceYellow");
            sparseArrayB.put(45, "isPopup");
            sparseArrayB.put(46, "isRewardStyle");
            sparseArrayB.put(47, "isSelected");
            sparseArrayB.put(48, "isUnlocking");
            sparseArrayB.put(49, "isWatchlisted");
            sparseArrayB.put(50, "item");
            sparseArrayB.put(51, "itemWidthRes");
            sparseArrayB.put(52, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(53, "labelStyle");
            sparseArrayB.put(54, "linkHandler");
            sparseArrayB.put(55, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(56, "loadingMessage");
            sparseArrayB.put(57, "lottieAutoPlay");
            sparseArrayB.put(58, "lottieBackgroundColor");
            sparseArrayB.put(59, "lottieLoop");
            sparseArrayB.put(60, "margins");
            sparseArrayB.put(61, "memberPriceInfo");
            sparseArrayB.put(62, "message");
            sparseArrayB.put(63, "offerViewItem");
            sparseArrayB.put(64, "onBannerClick");
            sparseArrayB.put(65, "onClick");
            sparseArrayB.put(66, "onPointsBalanceClick");
            sparseArrayB.put(67, "onQueryTextChangeListener");
            sparseArrayB.put(68, "onQueryTextFocusChangeListener");
            sparseArrayB.put(69, "onQueryTextSubmitListener");
            sparseArrayB.put(70, "paddingBottom");
            sparseArrayB.put(71, "product");
            sparseArrayB.put(72, "productCard");
            sparseArrayB.put(73, "productCardConfig");
            sparseArrayB.put(74, "productConfig");
            sparseArrayB.put(75, "productData");
            sparseArrayB.put(76, "rewardsPointsBalance");
            sparseArrayB.put(77, "rewardsPointsBalanceData");
            sparseArrayB.put(78, "searchQueryHint");
            sparseArrayB.put(79, "section");
            sparseArrayB.put(80, "sectionTitle");
            sparseArrayB.put(81, "showAddToListButton");
            sparseArrayB.put(82, "showBoostAnimation");
            sparseArrayB.put(83, "showNewDismissIcon");
            sparseArrayB.put(84, "showTigerDisplayExpiry");
            sparseArrayB.put(85, "showTigerOffersLabel");
            sparseArrayB.put(86, "singleLine");
            sparseArrayB.put(87, "state");
            sparseArrayB.put(88, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(89, "title");
            sparseArrayB.put(90, "viewListener");
            sparseArrayB.put(91, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f9227a;

        static {
            HashMap map = new HashMap(9);
            f9227a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_product_card_tile, map, "layout/epoxy_item_product_card_tile_0", com.woolworths.R.layout.fragment_product_message_bottom_sheet, "layout/fragment_product_message_bottom_sheet_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_product_multibuy_label, map, "layout/include_product_multibuy_label_0", com.woolworths.R.layout.include_product_multibuy_label_nz, "layout/include_product_multibuy_label_nz_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.layout_member_price_label, map, "layout/layout_member_price_label_0", com.woolworths.R.layout.layout_product_boost, "layout/layout_product_boost_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.layout_product_info, map, "layout/layout_product_info_0", com.woolworths.R.layout.layout_product_price, "layout/layout_product_price_0");
            map.put("layout/stock_indicator_0", Integer.valueOf(com.woolworths.R.layout.stock_indicator));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(9);
        f9226a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_product_card_tile, 1);
        sparseIntArray.put(com.woolworths.R.layout.fragment_product_message_bottom_sheet, 2);
        sparseIntArray.put(com.woolworths.R.layout.include_product_multibuy_label, 3);
        sparseIntArray.put(com.woolworths.R.layout.include_product_multibuy_label_nz, 4);
        sparseIntArray.put(com.woolworths.R.layout.layout_member_price_label, 5);
        sparseIntArray.put(com.woolworths.R.layout.layout_product_boost, 6);
        sparseIntArray.put(com.woolworths.R.layout.layout_product_info, 7);
        sparseIntArray.put(com.woolworths.R.layout.layout_product_price, 8);
        sparseIntArray.put(com.woolworths.R.layout.stock_indicator, 9);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.rewards.offers.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.foundation.rewards.offers.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shared.ui.views.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f9226a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if ("layout/epoxy_item_product_card_tile_0".equals(tag)) {
                        return new EpoxyItemProductCardTileBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_product_card_tile is invalid. Received: "));
                case 2:
                    if ("layout/fragment_product_message_bottom_sheet_0".equals(tag)) {
                        return new FragmentProductMessageBottomSheetBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for fragment_product_message_bottom_sheet is invalid. Received: "));
                case 3:
                    if (!"layout/include_product_multibuy_label_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for include_product_multibuy_label is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
                    IncludeProductMultibuyLabelBindingImpl includeProductMultibuyLabelBindingImpl = new IncludeProductMultibuyLabelBindingImpl(dataBindingComponent, view, (TextView) objArrT[1], (TextView) objArrT[2]);
                    includeProductMultibuyLabelBindingImpl.D = -1L;
                    ((ConstraintLayout) objArrT[0]).setTag(null);
                    includeProductMultibuyLabelBindingImpl.y.setTag(null);
                    includeProductMultibuyLabelBindingImpl.z.setTag(null);
                    includeProductMultibuyLabelBindingImpl.E(view);
                    includeProductMultibuyLabelBindingImpl.r();
                    return includeProductMultibuyLabelBindingImpl;
                case 4:
                    if (!"layout/include_product_multibuy_label_nz_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for include_product_multibuy_label_nz is invalid. Received: "));
                    }
                    Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
                    IncludeProductMultibuyLabelNzBindingImpl includeProductMultibuyLabelNzBindingImpl = new IncludeProductMultibuyLabelNzBindingImpl(dataBindingComponent, view, (TextView) objArrT2[1], (TextView) objArrT2[2]);
                    includeProductMultibuyLabelNzBindingImpl.D = -1L;
                    ((ConstraintLayout) objArrT2[0]).setTag(null);
                    includeProductMultibuyLabelNzBindingImpl.y.setTag(null);
                    includeProductMultibuyLabelNzBindingImpl.z.setTag(null);
                    includeProductMultibuyLabelNzBindingImpl.E(view);
                    includeProductMultibuyLabelNzBindingImpl.r();
                    return includeProductMultibuyLabelNzBindingImpl;
                case 5:
                    if (!"layout/layout_member_price_label_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for layout_member_price_label is invalid. Received: "));
                    }
                    Object[] objArrT3 = ViewDataBinding.t(dataBindingComponent, view, 5, null, LayoutMemberPriceLabelBindingImpl.D);
                    TextView textView = (TextView) objArrT3[1];
                    LayoutMemberPriceLabelBindingImpl layoutMemberPriceLabelBindingImpl = new LayoutMemberPriceLabelBindingImpl(dataBindingComponent, view, textView, (TextView) objArrT3[3], (TextView) objArrT3[2]);
                    layoutMemberPriceLabelBindingImpl.C = -1L;
                    layoutMemberPriceLabelBindingImpl.y.setTag(null);
                    ((ConstraintLayout) objArrT3[0]).setTag(null);
                    layoutMemberPriceLabelBindingImpl.z.setTag(null);
                    layoutMemberPriceLabelBindingImpl.A.setTag(null);
                    layoutMemberPriceLabelBindingImpl.E(view);
                    layoutMemberPriceLabelBindingImpl.r();
                    return layoutMemberPriceLabelBindingImpl;
                case 6:
                    if (!"layout/layout_product_boost_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for layout_product_boost is invalid. Received: "));
                    }
                    Object[] objArrT4 = ViewDataBinding.t(dataBindingComponent, view, 4, LayoutProductBoostBindingImpl.I, null);
                    LayoutProductBoostBindingImpl layoutProductBoostBindingImpl = new LayoutProductBoostBindingImpl(dataBindingComponent, view, (IncludeTintableTextBinding) objArrT4[3], (LottieAnimationView) objArrT4[2], (TextView) objArrT4[1]);
                    layoutProductBoostBindingImpl.H = -1L;
                    IncludeTintableTextBinding includeTintableTextBinding = layoutProductBoostBindingImpl.y;
                    if (includeTintableTextBinding != null) {
                        includeTintableTextBinding.n = layoutProductBoostBindingImpl;
                    }
                    layoutProductBoostBindingImpl.z.setTag(null);
                    ((ConstraintLayout) objArrT4[0]).setTag(null);
                    layoutProductBoostBindingImpl.A.setTag(null);
                    layoutProductBoostBindingImpl.E(view);
                    layoutProductBoostBindingImpl.r();
                    return layoutProductBoostBindingImpl;
                case 7:
                    if ("layout/layout_product_info_0".equals(tag)) {
                        return new LayoutProductInfoBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for layout_product_info is invalid. Received: "));
                case 8:
                    if (!"layout/layout_product_price_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for layout_product_price is invalid. Received: "));
                    }
                    Object[] objArrT5 = ViewDataBinding.t(dataBindingComponent, view, 5, null, LayoutProductPriceBindingImpl.E);
                    LayoutProductPriceBindingImpl layoutProductPriceBindingImpl = new LayoutProductPriceBindingImpl(dataBindingComponent, view, (CheckedTextView) objArrT5[3], (CheckedTextView) objArrT5[1], (CheckedTextView) objArrT5[2], (CheckedTextView) objArrT5[4]);
                    layoutProductPriceBindingImpl.D = -1L;
                    ((ConstraintLayout) objArrT5[0]).setTag(null);
                    layoutProductPriceBindingImpl.E(view);
                    layoutProductPriceBindingImpl.r();
                    return layoutProductPriceBindingImpl;
                case 9:
                    if (!"layout/stock_indicator_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for stock_indicator is invalid. Received: "));
                    }
                    Object[] objArrT6 = ViewDataBinding.t(dataBindingComponent, view, 3, null, StockIndicatorBindingImpl.z);
                    StockIndicatorBindingImpl stockIndicatorBindingImpl = new StockIndicatorBindingImpl(dataBindingComponent, view, 0);
                    stockIndicatorBindingImpl.y = -1L;
                    ((ConstraintLayout) objArrT6[0]).setTag(null);
                    stockIndicatorBindingImpl.E(view);
                    stockIndicatorBindingImpl.r();
                    return stockIndicatorBindingImpl;
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f9226a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f9227a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
