package au.com.woolworths.feature.rewards.everydayextras.signup;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.camera.core.impl.b;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.base.wallet.digipay.framesview.EpoxyCardCaptureFramesView;
import au.com.woolworths.feature.rewards.everydayextras.signup.databinding.LayoutEverydayExtrasWpaySchemeCardInputWebViewBindingImpl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f5848a;

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
        public static final HashMap f5849a;

        static {
            HashMap map = new HashMap(1);
            f5849a = map;
            map.put("layout/layout_everyday_extras_wpay_scheme_card_input_web_view_0", Integer.valueOf(com.woolworths.R.layout.layout_everyday_extras_wpay_scheme_card_input_web_view));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f5848a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.layout_everyday_extras_wpay_scheme_card_input_web_view, 1);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.wallet.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.product.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.rewards.base.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shared.ui.views.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f5848a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i2 == 1) {
                if (!"layout/layout_everyday_extras_wpay_scheme_card_input_web_view_0".equals(tag)) {
                    throw new IllegalArgumentException(b.m(tag, "The tag for layout_everyday_extras_wpay_scheme_card_input_web_view is invalid. Received: "));
                }
                LayoutEverydayExtrasWpaySchemeCardInputWebViewBindingImpl layoutEverydayExtrasWpaySchemeCardInputWebViewBindingImpl = new LayoutEverydayExtrasWpaySchemeCardInputWebViewBindingImpl(dataBindingComponent, view, (EpoxyCardCaptureFramesView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                layoutEverydayExtrasWpaySchemeCardInputWebViewBindingImpl.A = -1L;
                layoutEverydayExtrasWpaySchemeCardInputWebViewBindingImpl.y.setTag(null);
                view.setTag(com.woolworths.R.id.dataBinding, layoutEverydayExtrasWpaySchemeCardInputWebViewBindingImpl);
                layoutEverydayExtrasWpaySchemeCardInputWebViewBindingImpl.r();
                return layoutEverydayExtrasWpaySchemeCardInputWebViewBindingImpl;
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f5848a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f5849a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
