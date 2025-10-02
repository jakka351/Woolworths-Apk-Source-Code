package au.com.woolworths.feature.shop.storelocator.legacy;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.feature.shop.storelocator.legacy.databinding.ActivityPickUpLocationResultBindingImpl;
import au.com.woolworths.feature.shop.storelocator.legacy.databinding.ActivityPickUpLocatorBindingImpl;
import au.com.woolworths.feature.shop.storelocator.legacy.databinding.EpoxyItemStoreLocatorSuburbMatchBindingImpl;
import au.com.woolworths.feature.shop.storelocator.legacy.databinding.EpoxyLegacyItemStoreLocatorLocationBindingImpl;
import au.com.woolworths.feature.shop.storelocator.legacy.databinding.ItemPickUpLocationItemHeaderBindingImpl;
import au.com.woolworths.feature.shop.storelocator.legacy.databinding.LegacyActivityStoreLocatorBindingImpl;
import au.com.woolworths.feature.shop.storelocator.legacy.databinding.LegacyStoreLocatorLocationMapInfoWindowBindingImpl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f8151a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = au.com.woolworths.android.onesite.a.b(96, 0, 1, "_all", "actionState");
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
            sparseArrayB.put(32, "header");
            sparseArrayB.put(33, "heightRes");
            sparseArrayB.put(34, "hostScreen");
            sparseArrayB.put(35, "htmlListener");
            sparseArrayB.put(36, "imageLoaderListener");
            sparseArrayB.put(37, "importantForAccessibility");
            sparseArrayB.put(38, "index");
            sparseArrayB.put(39, "infoSectionItem");
            sparseArrayB.put(40, "inlineMessage");
            sparseArrayB.put(41, "isAccountNotificationBadgeShown");
            sparseArrayB.put(42, "isChecked");
            sparseArrayB.put(43, "isCtaInProgress");
            sparseArrayB.put(44, "isEnabled");
            sparseArrayB.put(45, "isLowerPriceYellow");
            sparseArrayB.put(46, "isPopup");
            sparseArrayB.put(47, "isRewardStyle");
            sparseArrayB.put(48, "isSelected");
            sparseArrayB.put(49, "isUnlocking");
            sparseArrayB.put(50, "isWatchlisted");
            sparseArrayB.put(51, "item");
            sparseArrayB.put(52, "itemWidthRes");
            sparseArrayB.put(53, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(54, "labelStyle");
            sparseArrayB.put(55, "linkHandler");
            sparseArrayB.put(56, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(57, "loadingMessage");
            sparseArrayB.put(58, "location");
            sparseArrayB.put(59, "lottieAutoPlay");
            sparseArrayB.put(60, "lottieBackgroundColor");
            sparseArrayB.put(61, "lottieLoop");
            sparseArrayB.put(62, "margins");
            sparseArrayB.put(63, "memberPriceInfo");
            sparseArrayB.put(64, "message");
            sparseArrayB.put(65, "offerViewItem");
            sparseArrayB.put(66, "onBannerClick");
            sparseArrayB.put(67, "onClick");
            sparseArrayB.put(68, "onPointsBalanceClick");
            sparseArrayB.put(69, "onQueryTextChangeListener");
            sparseArrayB.put(70, "onQueryTextFocusChangeListener");
            sparseArrayB.put(71, "onQueryTextSubmitListener");
            sparseArrayB.put(72, "paddingBottom");
            sparseArrayB.put(73, "product");
            sparseArrayB.put(74, "productCard");
            sparseArrayB.put(75, "productCardConfig");
            sparseArrayB.put(76, "productConfig");
            sparseArrayB.put(77, "productData");
            sparseArrayB.put(78, "queryText");
            sparseArrayB.put(79, "rewardsPointsBalance");
            sparseArrayB.put(80, "rewardsPointsBalanceData");
            sparseArrayB.put(81, "searchQueryHint");
            sparseArrayB.put(82, "section");
            sparseArrayB.put(83, "sectionTitle");
            sparseArrayB.put(84, "showAddToListButton");
            sparseArrayB.put(85, "showBoostAnimation");
            sparseArrayB.put(86, "showNewDismissIcon");
            sparseArrayB.put(87, "showTigerDisplayExpiry");
            sparseArrayB.put(88, "showTigerOffersLabel");
            sparseArrayB.put(89, "singleLine");
            sparseArrayB.put(90, "state");
            sparseArrayB.put(91, "suburb");
            sparseArrayB.put(92, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(93, "title");
            sparseArrayB.put(94, "viewListener");
            sparseArrayB.put(95, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f8152a;

        static {
            HashMap map = new HashMap(7);
            f8152a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_pick_up_location_result, map, "layout/activity_pick_up_location_result_0", com.woolworths.R.layout.activity_pick_up_locator, "layout/activity_pick_up_locator_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_store_locator_suburb_match, map, "layout/epoxy_item_store_locator_suburb_match_0", com.woolworths.R.layout.epoxy_legacy_item_store_locator_location, "layout/epoxy_legacy_item_store_locator_location_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.item_pick_up_location_item_header, map, "layout/item_pick_up_location_item_header_0", com.woolworths.R.layout.legacy_activity_store_locator, "layout/legacy_activity_store_locator_0");
            map.put("layout/legacy_store_locator_location_map_info_window_0", Integer.valueOf(com.woolworths.R.layout.legacy_store_locator_location_map_info_window));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(7);
        f8151a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_pick_up_location_result, 1);
        sparseIntArray.put(com.woolworths.R.layout.activity_pick_up_locator, 2);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_store_locator_suburb_match, 3);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_legacy_item_store_locator_location, 4);
        sparseIntArray.put(com.woolworths.R.layout.item_pick_up_location_item_header, 5);
        sparseIntArray.put(com.woolworths.R.layout.legacy_activity_store_locator, 6);
        sparseIntArray.put(com.woolworths.R.layout.legacy_store_locator_location_map_info_window, 7);
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
        int i2 = f8151a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if (!"layout/activity_pick_up_location_result_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for activity_pick_up_location_result is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, ActivityPickUpLocationResultBindingImpl.E, ActivityPickUpLocationResultBindingImpl.F);
                    IncludeGenericErrorStateBinding includeGenericErrorStateBinding = (IncludeGenericErrorStateBinding) objArrT[3];
                    ActivityPickUpLocationResultBindingImpl activityPickUpLocationResultBindingImpl = new ActivityPickUpLocationResultBindingImpl(view, (ProgressBar) objArrT[2], (Toolbar) objArrT[5], dataBindingComponent, (RecyclerView) objArrT[1], includeGenericErrorStateBinding);
                    activityPickUpLocationResultBindingImpl.D = -1L;
                    IncludeGenericErrorStateBinding includeGenericErrorStateBinding2 = activityPickUpLocationResultBindingImpl.y;
                    if (includeGenericErrorStateBinding2 != null) {
                        includeGenericErrorStateBinding2.n = activityPickUpLocationResultBindingImpl;
                    }
                    activityPickUpLocationResultBindingImpl.z.setTag(null);
                    ((ConstraintLayout) objArrT[0]).setTag(null);
                    activityPickUpLocationResultBindingImpl.A.setTag(null);
                    activityPickUpLocationResultBindingImpl.E(view);
                    activityPickUpLocationResultBindingImpl.r();
                    return activityPickUpLocationResultBindingImpl;
                case 2:
                    if ("layout/activity_pick_up_locator_0".equals(tag)) {
                        return new ActivityPickUpLocatorBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for activity_pick_up_locator is invalid. Received: "));
                case 3:
                    if ("layout/epoxy_item_store_locator_suburb_match_0".equals(tag)) {
                        return new EpoxyItemStoreLocatorSuburbMatchBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_store_locator_suburb_match is invalid. Received: "));
                case 4:
                    if (!"layout/epoxy_legacy_item_store_locator_location_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_legacy_item_store_locator_location is invalid. Received: "));
                    }
                    Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 7, null, EpoxyLegacyItemStoreLocatorLocationBindingImpl.F);
                    TextView textView = (TextView) objArrT2[4];
                    TextView textView2 = (TextView) objArrT2[2];
                    ImageView imageView = (ImageView) objArrT2[1];
                    TextView textView3 = (TextView) objArrT2[3];
                    TextView textView4 = (TextView) objArrT2[5];
                    EpoxyLegacyItemStoreLocatorLocationBindingImpl epoxyLegacyItemStoreLocatorLocationBindingImpl = new EpoxyLegacyItemStoreLocatorLocationBindingImpl(view, imageView, textView, textView2, textView3, textView4, dataBindingComponent);
                    epoxyLegacyItemStoreLocatorLocationBindingImpl.E = -1L;
                    ((ConstraintLayout) objArrT2[0]).setTag(null);
                    epoxyLegacyItemStoreLocatorLocationBindingImpl.y.setTag(null);
                    epoxyLegacyItemStoreLocatorLocationBindingImpl.z.setTag(null);
                    epoxyLegacyItemStoreLocatorLocationBindingImpl.A.setTag(null);
                    epoxyLegacyItemStoreLocatorLocationBindingImpl.B.setTag(null);
                    epoxyLegacyItemStoreLocatorLocationBindingImpl.C.setTag(null);
                    epoxyLegacyItemStoreLocatorLocationBindingImpl.E(view);
                    epoxyLegacyItemStoreLocatorLocationBindingImpl.r();
                    return epoxyLegacyItemStoreLocatorLocationBindingImpl;
                case 5:
                    if (!"layout/item_pick_up_location_item_header_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for item_pick_up_location_item_header is invalid. Received: "));
                    }
                    ItemPickUpLocationItemHeaderBindingImpl itemPickUpLocationItemHeaderBindingImpl = new ItemPickUpLocationItemHeaderBindingImpl(dataBindingComponent, view, (TextView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    itemPickUpLocationItemHeaderBindingImpl.A = -1L;
                    itemPickUpLocationItemHeaderBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, itemPickUpLocationItemHeaderBindingImpl);
                    itemPickUpLocationItemHeaderBindingImpl.r();
                    return itemPickUpLocationItemHeaderBindingImpl;
                case 6:
                    if ("layout/legacy_activity_store_locator_0".equals(tag)) {
                        return new LegacyActivityStoreLocatorBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for legacy_activity_store_locator is invalid. Received: "));
                case 7:
                    if (!"layout/legacy_store_locator_location_map_info_window_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for legacy_store_locator_location_map_info_window is invalid. Received: "));
                    }
                    Object[] objArrT3 = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
                    LegacyStoreLocatorLocationMapInfoWindowBindingImpl legacyStoreLocatorLocationMapInfoWindowBindingImpl = new LegacyStoreLocatorLocationMapInfoWindowBindingImpl(view, (ImageView) objArrT3[1], (TextView) objArrT3[3], (TextView) objArrT3[2], dataBindingComponent);
                    legacyStoreLocatorLocationMapInfoWindowBindingImpl.D = -1L;
                    legacyStoreLocatorLocationMapInfoWindowBindingImpl.y.setTag(null);
                    legacyStoreLocatorLocationMapInfoWindowBindingImpl.z.setTag(null);
                    ((ConstraintLayout) objArrT3[0]).setTag(null);
                    legacyStoreLocatorLocationMapInfoWindowBindingImpl.A.setTag(null);
                    legacyStoreLocatorLocationMapInfoWindowBindingImpl.E(view);
                    legacyStoreLocatorLocationMapInfoWindowBindingImpl.r();
                    return legacyStoreLocatorLocationMapInfoWindowBindingImpl;
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f8151a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f8152a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
