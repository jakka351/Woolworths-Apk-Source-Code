package au.com.woolworths.feature.shop.ask.olive;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.camera.core.impl.b;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.feature.shop.ask.olive.databinding.ActivityChatWithOliveBindingImpl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f6607a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(99, 0, 1, "_all", "actionState");
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
            sparseArrayB.put(36, "iconResId");
            sparseArrayB.put(37, "imageLoaderListener");
            sparseArrayB.put(38, "importantForAccessibility");
            sparseArrayB.put(39, "index");
            sparseArrayB.put(40, "info");
            sparseArrayB.put(41, "infoSectionItem");
            sparseArrayB.put(42, "inlineMessage");
            sparseArrayB.put(43, "isAccountNotificationBadgeShown");
            sparseArrayB.put(44, "isChecked");
            sparseArrayB.put(45, "isCtaInProgress");
            sparseArrayB.put(46, "isEnabled");
            sparseArrayB.put(47, "isLowerPriceYellow");
            sparseArrayB.put(48, "isMarketplace");
            sparseArrayB.put(49, "isPopup");
            sparseArrayB.put(50, "isRewardStyle");
            sparseArrayB.put(51, "isSelected");
            sparseArrayB.put(52, "isUnlocking");
            sparseArrayB.put(53, "isWatchlisted");
            sparseArrayB.put(54, "item");
            sparseArrayB.put(55, "itemWidthRes");
            sparseArrayB.put(56, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(57, "labelStyle");
            sparseArrayB.put(58, "linkHandler");
            sparseArrayB.put(59, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(60, "loadingMessage");
            sparseArrayB.put(61, "lottieAutoPlay");
            sparseArrayB.put(62, "lottieBackgroundColor");
            sparseArrayB.put(63, "lottieLoop");
            sparseArrayB.put(64, "margins");
            sparseArrayB.put(65, "markdownContent");
            sparseArrayB.put(66, "memberPriceInfo");
            sparseArrayB.put(67, "message");
            sparseArrayB.put(68, "offerViewItem");
            sparseArrayB.put(69, "onBannerClick");
            sparseArrayB.put(70, "onClick");
            sparseArrayB.put(71, "onPointsBalanceClick");
            sparseArrayB.put(72, "onQueryTextChangeListener");
            sparseArrayB.put(73, "onQueryTextFocusChangeListener");
            sparseArrayB.put(74, "onQueryTextSubmitListener");
            sparseArrayB.put(75, "optionText");
            sparseArrayB.put(76, "paddingBottom");
            sparseArrayB.put(77, "product");
            sparseArrayB.put(78, "productCard");
            sparseArrayB.put(79, "productCardConfig");
            sparseArrayB.put(80, "productConfig");
            sparseArrayB.put(81, "productData");
            sparseArrayB.put(82, "rewardsPointsBalance");
            sparseArrayB.put(83, "rewardsPointsBalanceData");
            sparseArrayB.put(84, "searchQueryHint");
            sparseArrayB.put(85, "section");
            sparseArrayB.put(86, "sectionTitle");
            sparseArrayB.put(87, "seller");
            sparseArrayB.put(88, "showAddToListButton");
            sparseArrayB.put(89, "showBoostAnimation");
            sparseArrayB.put(90, "showNewDismissIcon");
            sparseArrayB.put(91, "showTigerDisplayExpiry");
            sparseArrayB.put(92, "showTigerOffersLabel");
            sparseArrayB.put(93, "singleLine");
            sparseArrayB.put(94, "state");
            sparseArrayB.put(95, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(96, "title");
            sparseArrayB.put(97, "viewListener");
            sparseArrayB.put(98, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f6608a;

        static {
            HashMap map = new HashMap(1);
            f6608a = map;
            map.put("layout/activity_chat_with_olive_0", Integer.valueOf(com.woolworths.R.layout.activity_chat_with_olive));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f6607a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_chat_with_olive, 1);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.feature.shared.web.file.uploader.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shop.cart.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f6607a.get(i);
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
        if ("layout/activity_chat_with_olive_0".equals(tag)) {
            return new ActivityChatWithOliveBindingImpl(dataBindingComponent, view);
        }
        throw new IllegalArgumentException(b.m(tag, "The tag for activity_chat_with_olive is invalid. Received: "));
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f6607a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f6608a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
