package au.com.woolworths.feature.shop.bundles;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.bundles.databinding.FragmentAddBundlesToCartBindingImpl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f6743a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = au.com.woolworths.android.onesite.a.b(100, 0, 1, "_all", "actionState");
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
            sparseArrayB.put(12, "bundleData");
            sparseArrayB.put(13, "buttonText");
            sparseArrayB.put(14, "buttonTint");
            sparseArrayB.put(15, "canShowWatchlist");
            sparseArrayB.put(16, "clickHandler");
            sparseArrayB.put(17, "clickHandlers");
            sparseArrayB.put(18, "clickListener");
            sparseArrayB.put(19, "coachMark");
            sparseArrayB.put(20, "containerTitle");
            sparseArrayB.put(21, "cta");
            sparseArrayB.put(22, "ctaText");
            sparseArrayB.put(23, "data");
            sparseArrayB.put(24, "displayExpiryExtended");
            sparseArrayB.put(25, "emptyState");
            sparseArrayB.put(26, "enableBoostAnimationContainerGap");
            sparseArrayB.put(27, "enabled");
            sparseArrayB.put(28, "errorState");
            sparseArrayB.put(29, "filter");
            sparseArrayB.put(30, "footer");
            sparseArrayB.put(31, "groupTitle");
            sparseArrayB.put(32, "handler");
            sparseArrayB.put(33, "header");
            sparseArrayB.put(34, "heightRes");
            sparseArrayB.put(35, "hostScreen");
            sparseArrayB.put(36, "htmlListener");
            sparseArrayB.put(37, "iconResId");
            sparseArrayB.put(38, "imageLoaderListener");
            sparseArrayB.put(39, "importantForAccessibility");
            sparseArrayB.put(40, "index");
            sparseArrayB.put(41, "info");
            sparseArrayB.put(42, "infoSectionItem");
            sparseArrayB.put(43, "inlineMessage");
            sparseArrayB.put(44, "isAccountNotificationBadgeShown");
            sparseArrayB.put(45, "isChecked");
            sparseArrayB.put(46, "isCtaInProgress");
            sparseArrayB.put(47, "isEnabled");
            sparseArrayB.put(48, "isLowerPriceYellow");
            sparseArrayB.put(49, "isMarketplace");
            sparseArrayB.put(50, "isPopup");
            sparseArrayB.put(51, "isRewardStyle");
            sparseArrayB.put(52, "isSelected");
            sparseArrayB.put(53, "isUnlocking");
            sparseArrayB.put(54, "isWatchlisted");
            sparseArrayB.put(55, "item");
            sparseArrayB.put(56, "itemWidthRes");
            sparseArrayB.put(57, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(58, "labelStyle");
            sparseArrayB.put(59, "linkHandler");
            sparseArrayB.put(60, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(61, "loadingMessage");
            sparseArrayB.put(62, "lottieAutoPlay");
            sparseArrayB.put(63, "lottieBackgroundColor");
            sparseArrayB.put(64, "lottieLoop");
            sparseArrayB.put(65, "margins");
            sparseArrayB.put(66, "markdownContent");
            sparseArrayB.put(67, "memberPriceInfo");
            sparseArrayB.put(68, "message");
            sparseArrayB.put(69, "offerViewItem");
            sparseArrayB.put(70, "onBannerClick");
            sparseArrayB.put(71, "onClick");
            sparseArrayB.put(72, "onPointsBalanceClick");
            sparseArrayB.put(73, "onQueryTextChangeListener");
            sparseArrayB.put(74, "onQueryTextFocusChangeListener");
            sparseArrayB.put(75, "onQueryTextSubmitListener");
            sparseArrayB.put(76, "optionText");
            sparseArrayB.put(77, "paddingBottom");
            sparseArrayB.put(78, "product");
            sparseArrayB.put(79, "productCard");
            sparseArrayB.put(80, "productCardConfig");
            sparseArrayB.put(81, "productConfig");
            sparseArrayB.put(82, "productData");
            sparseArrayB.put(83, "rewardsPointsBalance");
            sparseArrayB.put(84, "rewardsPointsBalanceData");
            sparseArrayB.put(85, "searchQueryHint");
            sparseArrayB.put(86, "section");
            sparseArrayB.put(87, "sectionTitle");
            sparseArrayB.put(88, "seller");
            sparseArrayB.put(89, "showAddToListButton");
            sparseArrayB.put(90, "showBoostAnimation");
            sparseArrayB.put(91, "showNewDismissIcon");
            sparseArrayB.put(92, "showTigerDisplayExpiry");
            sparseArrayB.put(93, "showTigerOffersLabel");
            sparseArrayB.put(94, "singleLine");
            sparseArrayB.put(95, "state");
            sparseArrayB.put(96, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(97, "title");
            sparseArrayB.put(98, "viewListener");
            sparseArrayB.put(99, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f6744a;

        static {
            HashMap map = new HashMap(1);
            f6744a = map;
            map.put("layout/fragment_add_bundles_to_cart_0", Integer.valueOf(com.woolworths.R.layout.fragment_add_bundles_to_cart));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f6743a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.fragment_add_bundles_to_cart, 1);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.product.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shared.ui.views.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.cart.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f6743a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 != 1) {
            return null;
        }
        if ("layout/fragment_add_bundles_to_cart_0".equals(tag)) {
            return new FragmentAddBundlesToCartBindingImpl(dataBindingComponent, view);
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for fragment_add_bundles_to_cart is invalid. Received: "));
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f6743a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f6744a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
