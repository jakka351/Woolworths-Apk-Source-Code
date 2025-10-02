package au.com.woolworths.feature.shop.barcode.scanner;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.barcode.scanner.databinding.ActivityBarcodeScannerBindingImpl;
import au.com.woolworths.feature.shop.barcode.scanner.databinding.FragmentCameraViewBindingImpl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f6650a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = au.com.woolworths.android.onesite.a.b(113, 0, 1, "_all", "actionState");
            sparseArrayB.put(2, "asset");
            sparseArrayB.put(3, "backgroundColor");
            sparseArrayB.put(4, "badgeImageUrl");
            sparseArrayB.put(5, "banner");
            sparseArrayB.put(6, "bannerAsset");
            sparseArrayB.put(7, "bannerIcon");
            sparseArrayB.put(8, "bannerState");
            sparseArrayB.put(9, "body");
            sparseArrayB.put(10, "boostAnimationVisibility");
            sparseArrayB.put(11, "boostViewListener");
            sparseArrayB.put(12, "brandLabel");
            sparseArrayB.put(13, "buttonText");
            sparseArrayB.put(14, "buttonTint");
            sparseArrayB.put(15, "canShowWatchlist");
            sparseArrayB.put(16, "clickHandler");
            sparseArrayB.put(17, "clickHandlers");
            sparseArrayB.put(18, "clickListener");
            sparseArrayB.put(19, "coachMark");
            sparseArrayB.put(20, "collectionMode");
            sparseArrayB.put(21, "color");
            sparseArrayB.put(22, "colorName");
            sparseArrayB.put(23, "containerTitle");
            sparseArrayB.put(24, "content");
            sparseArrayB.put(25, "cta");
            sparseArrayB.put(26, "ctaText");
            sparseArrayB.put(27, "data");
            sparseArrayB.put(28, "displayExpiryExtended");
            sparseArrayB.put(29, "emptyState");
            sparseArrayB.put(30, "enableBoostAnimationContainerGap");
            sparseArrayB.put(31, "enabled");
            sparseArrayB.put(32, "errorState");
            sparseArrayB.put(33, "filter");
            sparseArrayB.put(34, "footer");
            sparseArrayB.put(35, "groupTitle");
            sparseArrayB.put(36, "handler");
            sparseArrayB.put(37, "header");
            sparseArrayB.put(38, "heightRes");
            sparseArrayB.put(39, "hostScreen");
            sparseArrayB.put(40, "htmlListener");
            sparseArrayB.put(41, "iconResId");
            sparseArrayB.put(42, "imageLoaderListener");
            sparseArrayB.put(43, "importantForAccessibility");
            sparseArrayB.put(44, "inMappedStore");
            sparseArrayB.put(45, "index");
            sparseArrayB.put(46, "info");
            sparseArrayB.put(47, "infoSectionItem");
            sparseArrayB.put(48, "infoView");
            sparseArrayB.put(49, "inlineMessage");
            sparseArrayB.put(50, "isAccountNotificationBadgeShown");
            sparseArrayB.put(51, "isChecked");
            sparseArrayB.put(52, "isCtaInProgress");
            sparseArrayB.put(53, "isEnabled");
            sparseArrayB.put(54, "isLowerPriceYellow");
            sparseArrayB.put(55, "isMarketplace");
            sparseArrayB.put(56, "isPopup");
            sparseArrayB.put(57, "isRewardStyle");
            sparseArrayB.put(58, "isSelected");
            sparseArrayB.put(59, "isShoppingListBeingSaved");
            sparseArrayB.put(60, "isUnlocking");
            sparseArrayB.put(61, "isWatchlisted");
            sparseArrayB.put(62, "item");
            sparseArrayB.put(63, "itemClickListener");
            sparseArrayB.put(64, "itemWidthRes");
            sparseArrayB.put(65, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(66, "labelStyle");
            sparseArrayB.put(67, "linkHandler");
            sparseArrayB.put(68, "listIndex");
            sparseArrayB.put(69, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(70, "loadingMessage");
            sparseArrayB.put(71, "lottieAutoPlay");
            sparseArrayB.put(72, "lottieBackgroundColor");
            sparseArrayB.put(73, "lottieLoop");
            sparseArrayB.put(74, "margins");
            sparseArrayB.put(75, "markdownContent");
            sparseArrayB.put(76, "marketplace");
            sparseArrayB.put(77, "memberPriceInfo");
            sparseArrayB.put(78, "message");
            sparseArrayB.put(79, "offerViewItem");
            sparseArrayB.put(80, "onBannerClick");
            sparseArrayB.put(81, "onClick");
            sparseArrayB.put(82, "onPointsBalanceClick");
            sparseArrayB.put(83, "onQueryTextChangeListener");
            sparseArrayB.put(84, "onQueryTextFocusChangeListener");
            sparseArrayB.put(85, "onQueryTextSubmitListener");
            sparseArrayB.put(86, "onSelected");
            sparseArrayB.put(87, "optionText");
            sparseArrayB.put(88, "paddingBottom");
            sparseArrayB.put(89, "product");
            sparseArrayB.put(90, "productCard");
            sparseArrayB.put(91, "productCardButtonType");
            sparseArrayB.put(92, "productCardConfig");
            sparseArrayB.put(93, "productConfig");
            sparseArrayB.put(94, "productData");
            sparseArrayB.put(95, "rewardsPointsBalance");
            sparseArrayB.put(96, "rewardsPointsBalanceData");
            sparseArrayB.put(97, "searchQueryHint");
            sparseArrayB.put(98, "section");
            sparseArrayB.put(99, "sectionTitle");
            sparseArrayB.put(100, "seller");
            sparseArrayB.put(101, "shoppingList");
            sparseArrayB.put(102, "showAddToListButton");
            sparseArrayB.put(103, "showBoostAnimation");
            sparseArrayB.put(104, "showNewDismissIcon");
            sparseArrayB.put(105, "showTigerDisplayExpiry");
            sparseArrayB.put(106, "showTigerOffersLabel");
            sparseArrayB.put(107, "singleLine");
            sparseArrayB.put(108, "state");
            sparseArrayB.put(109, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(110, "title");
            sparseArrayB.put(111, "viewListener");
            sparseArrayB.put(112, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f6651a;

        static {
            HashMap map = new HashMap(2);
            f6651a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_barcode_scanner, map, "layout/activity_barcode_scanner_0", com.woolworths.R.layout.fragment_camera_view, "layout/fragment_camera_view_0");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        f6650a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_barcode_scanner, 1);
        sparseIntArray.put(com.woolworths.R.layout.fragment_camera_view, 2);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.product.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.product.details.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f6650a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i2 == 1) {
                if ("layout/activity_barcode_scanner_0".equals(tag)) {
                    return new ActivityBarcodeScannerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for activity_barcode_scanner is invalid. Received: "));
            }
            if (i2 == 2) {
                if (!"layout/fragment_camera_view_0".equals(tag)) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for fragment_camera_view is invalid. Received: "));
                }
                Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, null, FragmentCameraViewBindingImpl.B);
                FragmentCameraViewBindingImpl fragmentCameraViewBindingImpl = new FragmentCameraViewBindingImpl(dataBindingComponent, view, (PreviewView) objArrT[1]);
                fragmentCameraViewBindingImpl.A = -1L;
                ((ConstraintLayout) objArrT[0]).setTag(null);
                fragmentCameraViewBindingImpl.E(view);
                fragmentCameraViewBindingImpl.r();
                return fragmentCameraViewBindingImpl;
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f6650a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f6651a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
