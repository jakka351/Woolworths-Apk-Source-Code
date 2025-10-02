package au.com.woolworths.promotion.banner;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.camera.core.impl.b;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.promotion.banner.databinding.ActivityPromotionBindingImpl;
import au.com.woolworths.promotion.banner.databinding.EpoxyItemPromotionBannerBindingImpl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f9338a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(45, 0, 1, "_all", "actionState");
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
            sparseArrayB.put(22, "isChecked");
            sparseArrayB.put(23, "isEnabled");
            sparseArrayB.put(24, "isLowerPriceYellow");
            sparseArrayB.put(25, "isRewardStyle");
            sparseArrayB.put(26, "isUnlocking");
            sparseArrayB.put(27, "itemWidthRes");
            sparseArrayB.put(28, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(29, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(30, "loadingMessage");
            sparseArrayB.put(31, "lottieAutoPlay");
            sparseArrayB.put(32, "lottieBackgroundColor");
            sparseArrayB.put(33, "lottieLoop");
            sparseArrayB.put(34, "margins");
            sparseArrayB.put(35, "markdownContent");
            sparseArrayB.put(36, "onQueryTextChangeListener");
            sparseArrayB.put(37, "onQueryTextFocusChangeListener");
            sparseArrayB.put(38, "onQueryTextSubmitListener");
            sparseArrayB.put(39, "searchQueryHint");
            sparseArrayB.put(40, "sectionTitle");
            sparseArrayB.put(41, "state");
            sparseArrayB.put(42, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(43, "title");
            sparseArrayB.put(44, "viewListener");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f9339a;

        static {
            HashMap map = new HashMap(2);
            f9339a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_promotion, map, "layout/activity_promotion_0", com.woolworths.R.layout.epoxy_item_promotion_banner, "layout/epoxy_item_promotion_banner_0");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        f9338a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_promotion, 1);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_promotion_banner, 2);
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
        int i2 = f9338a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 == 1) {
            if ("layout/activity_promotion_0".equals(tag)) {
                return new ActivityPromotionBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException(b.m(tag, "The tag for activity_promotion is invalid. Received: "));
        }
        if (i2 != 2) {
            return null;
        }
        if ("layout/epoxy_item_promotion_banner_0".equals(tag)) {
            return new EpoxyItemPromotionBannerBindingImpl(dataBindingComponent, view);
        }
        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_promotion_banner is invalid. Received: "));
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f9338a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f9339a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
