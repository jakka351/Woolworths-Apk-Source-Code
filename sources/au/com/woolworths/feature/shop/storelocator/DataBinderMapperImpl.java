package au.com.woolworths.feature.shop.storelocator;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.storelocator.databinding.ActivityStoreLocatorBindingImpl;
import au.com.woolworths.feature.shop.storelocator.databinding.EpoxyItemStoreLocatorLocationBindingImpl;
import au.com.woolworths.feature.shop.storelocator.databinding.EpoxyItemStoreLocatorSuburbBindingImpl;
import au.com.woolworths.feature.shop.storelocator.databinding.StoreLocatorLocationMapInfoWindowBindingImpl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f8115a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = au.com.woolworths.android.onesite.a.b(95, 0, 1, "_all", "actionState");
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
            sparseArrayB.put(57, "location");
            sparseArrayB.put(58, "lottieAutoPlay");
            sparseArrayB.put(59, "lottieBackgroundColor");
            sparseArrayB.put(60, "lottieLoop");
            sparseArrayB.put(61, "margins");
            sparseArrayB.put(62, "memberPriceInfo");
            sparseArrayB.put(63, "message");
            sparseArrayB.put(64, "offerViewItem");
            sparseArrayB.put(65, "onBannerClick");
            sparseArrayB.put(66, "onClick");
            sparseArrayB.put(67, "onPointsBalanceClick");
            sparseArrayB.put(68, "onQueryTextChangeListener");
            sparseArrayB.put(69, "onQueryTextFocusChangeListener");
            sparseArrayB.put(70, "onQueryTextSubmitListener");
            sparseArrayB.put(71, "paddingBottom");
            sparseArrayB.put(72, "product");
            sparseArrayB.put(73, "productCard");
            sparseArrayB.put(74, "productCardConfig");
            sparseArrayB.put(75, "productConfig");
            sparseArrayB.put(76, "productData");
            sparseArrayB.put(77, "queryText");
            sparseArrayB.put(78, "rewardsPointsBalance");
            sparseArrayB.put(79, "rewardsPointsBalanceData");
            sparseArrayB.put(80, "searchQueryHint");
            sparseArrayB.put(81, "section");
            sparseArrayB.put(82, "sectionTitle");
            sparseArrayB.put(83, "showAddToListButton");
            sparseArrayB.put(84, "showBoostAnimation");
            sparseArrayB.put(85, "showNewDismissIcon");
            sparseArrayB.put(86, "showTigerDisplayExpiry");
            sparseArrayB.put(87, "showTigerOffersLabel");
            sparseArrayB.put(88, "singleLine");
            sparseArrayB.put(89, "state");
            sparseArrayB.put(90, "suburb");
            sparseArrayB.put(91, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(92, "title");
            sparseArrayB.put(93, "viewListener");
            sparseArrayB.put(94, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f8116a;

        static {
            HashMap map = new HashMap(4);
            f8116a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_store_locator, map, "layout/activity_store_locator_0", com.woolworths.R.layout.epoxy_item_store_locator_location, "layout/epoxy_item_store_locator_location_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_store_locator_suburb, map, "layout/epoxy_item_store_locator_suburb_0", com.woolworths.R.layout.store_locator_location_map_info_window, "layout/store_locator_location_map_info_window_0");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f8115a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_store_locator, 1);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_store_locator_location, 2);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_store_locator_suburb, 3);
        sparseIntArray.put(com.woolworths.R.layout.store_locator_location_map_info_window, 4);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f8115a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i2 == 1) {
                if ("layout/activity_store_locator_0".equals(tag)) {
                    return new ActivityStoreLocatorBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for activity_store_locator is invalid. Received: "));
            }
            if (i2 == 2) {
                if (!"layout/epoxy_item_store_locator_location_0".equals(tag)) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_store_locator_location is invalid. Received: "));
                }
                Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 7, null, EpoxyItemStoreLocatorLocationBindingImpl.F);
                TextView textView = (TextView) objArrT[4];
                TextView textView2 = (TextView) objArrT[2];
                ImageView imageView = (ImageView) objArrT[1];
                TextView textView3 = (TextView) objArrT[3];
                TextView textView4 = (TextView) objArrT[5];
                EpoxyItemStoreLocatorLocationBindingImpl epoxyItemStoreLocatorLocationBindingImpl = new EpoxyItemStoreLocatorLocationBindingImpl(view, imageView, textView, textView2, textView3, textView4, dataBindingComponent);
                epoxyItemStoreLocatorLocationBindingImpl.E = -1L;
                ((ConstraintLayout) objArrT[0]).setTag(null);
                epoxyItemStoreLocatorLocationBindingImpl.y.setTag(null);
                epoxyItemStoreLocatorLocationBindingImpl.z.setTag(null);
                epoxyItemStoreLocatorLocationBindingImpl.A.setTag(null);
                epoxyItemStoreLocatorLocationBindingImpl.B.setTag(null);
                epoxyItemStoreLocatorLocationBindingImpl.C.setTag(null);
                epoxyItemStoreLocatorLocationBindingImpl.E(view);
                epoxyItemStoreLocatorLocationBindingImpl.r();
                return epoxyItemStoreLocatorLocationBindingImpl;
            }
            if (i2 == 3) {
                if ("layout/epoxy_item_store_locator_suburb_0".equals(tag)) {
                    return new EpoxyItemStoreLocatorSuburbBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_store_locator_suburb is invalid. Received: "));
            }
            if (i2 == 4) {
                if (!"layout/store_locator_location_map_info_window_0".equals(tag)) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for store_locator_location_map_info_window is invalid. Received: "));
                }
                Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
                StoreLocatorLocationMapInfoWindowBindingImpl storeLocatorLocationMapInfoWindowBindingImpl = new StoreLocatorLocationMapInfoWindowBindingImpl(view, (ImageView) objArrT2[1], (TextView) objArrT2[3], (TextView) objArrT2[2], dataBindingComponent);
                storeLocatorLocationMapInfoWindowBindingImpl.D = -1L;
                storeLocatorLocationMapInfoWindowBindingImpl.y.setTag(null);
                storeLocatorLocationMapInfoWindowBindingImpl.z.setTag(null);
                ((ConstraintLayout) objArrT2[0]).setTag(null);
                storeLocatorLocationMapInfoWindowBindingImpl.A.setTag(null);
                storeLocatorLocationMapInfoWindowBindingImpl.E(view);
                storeLocatorLocationMapInfoWindowBindingImpl.r();
                return storeLocatorLocationMapInfoWindowBindingImpl;
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f8115a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f8116a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
