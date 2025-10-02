package au.com.woolworths.foundation.rewards.offers.ui;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.foundation.rewards.offers.ui.databinding.EpoxyItemRewardsOfferCardBindingImpl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f8620a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = au.com.woolworths.android.onesite.a.b(49, 0, 1, "_all", "actionState");
            sparseArrayB.put(2, "asset");
            sparseArrayB.put(3, "backgroundColor");
            sparseArrayB.put(4, "bannerState");
            sparseArrayB.put(5, "brandLabel");
            sparseArrayB.put(6, "buttonText");
            sparseArrayB.put(7, "buttonTint");
            sparseArrayB.put(8, "clickHandler");
            sparseArrayB.put(9, "clickHandlers");
            sparseArrayB.put(10, "clickListener");
            sparseArrayB.put(11, "coachMark");
            sparseArrayB.put(12, "data");
            sparseArrayB.put(13, "enabled");
            sparseArrayB.put(14, "errorState");
            sparseArrayB.put(15, "handler");
            sparseArrayB.put(16, "heightRes");
            sparseArrayB.put(17, "imageLoaderListener");
            sparseArrayB.put(18, "importantForAccessibility");
            sparseArrayB.put(19, "index");
            sparseArrayB.put(20, "infoSectionItem");
            sparseArrayB.put(21, "inlineMessage");
            sparseArrayB.put(22, "isAccountNotificationBadgeShown");
            sparseArrayB.put(23, "isChecked");
            sparseArrayB.put(24, "isEnabled");
            sparseArrayB.put(25, "isLowerPriceYellow");
            sparseArrayB.put(26, "isRewardStyle");
            sparseArrayB.put(27, "isUnlocking");
            sparseArrayB.put(28, "itemWidthRes");
            sparseArrayB.put(29, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(30, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(31, "loadingMessage");
            sparseArrayB.put(32, "lottieAutoPlay");
            sparseArrayB.put(33, "lottieBackgroundColor");
            sparseArrayB.put(34, "lottieLoop");
            sparseArrayB.put(35, "margins");
            sparseArrayB.put(36, "offerViewItem");
            sparseArrayB.put(37, "onPointsBalanceClick");
            sparseArrayB.put(38, "onQueryTextChangeListener");
            sparseArrayB.put(39, "onQueryTextFocusChangeListener");
            sparseArrayB.put(40, "onQueryTextSubmitListener");
            sparseArrayB.put(41, "rewardsPointsBalance");
            sparseArrayB.put(42, "rewardsPointsBalanceData");
            sparseArrayB.put(43, "searchQueryHint");
            sparseArrayB.put(44, "sectionTitle");
            sparseArrayB.put(45, "showNewDismissIcon");
            sparseArrayB.put(46, "state");
            sparseArrayB.put(47, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(48, "viewListener");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f8621a;

        static {
            HashMap map = new HashMap(1);
            f8621a = map;
            map.put("layout/epoxy_item_rewards_offer_card_0", Integer.valueOf(com.woolworths.R.layout.epoxy_item_rewards_offer_card));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f8620a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_rewards_offer_card, 1);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.rewards.base.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f8620a.get(i);
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
        if ("layout/epoxy_item_rewards_offer_card_0".equals(tag)) {
            return new EpoxyItemRewardsOfferCardBindingImpl(dataBindingComponent, view);
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_rewards_offer_card is invalid. Received: "));
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f8620a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f8621a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
