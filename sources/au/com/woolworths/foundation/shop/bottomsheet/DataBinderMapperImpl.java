package au.com.woolworths.foundation.shop.bottomsheet;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.impl.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.foundation.shop.bottomsheet.databinding.EpoxyItemBannerAssetBindingImpl;
import au.com.woolworths.foundation.shop.bottomsheet.databinding.EpoxyItemBannerIconBindingImpl;
import au.com.woolworths.foundation.shop.bottomsheet.databinding.EpoxyItemBodyBindingImpl;
import au.com.woolworths.foundation.shop.bottomsheet.databinding.EpoxyItemFinchInfoBindingImpl;
import au.com.woolworths.foundation.shop.bottomsheet.databinding.EpoxyItemFooterBindingImpl;
import au.com.woolworths.foundation.shop.bottomsheet.databinding.EpoxyItemPrimaryCtaBindingImpl;
import au.com.woolworths.foundation.shop.bottomsheet.databinding.EpoxyItemSecondaryCtaBindingImpl;
import au.com.woolworths.foundation.shop.bottomsheet.databinding.EpoxyItemTitleBindingImpl;
import au.com.woolworths.foundation.shop.bottomsheet.databinding.FragmentBaseBottomSheetBindingImpl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f8667a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(42, 0, 1, "_all", "asset");
            sparseArrayB.put(2, "backgroundColor");
            sparseArrayB.put(3, "bannerAsset");
            sparseArrayB.put(4, "bannerIcon");
            sparseArrayB.put(5, "bannerState");
            sparseArrayB.put(6, "body");
            sparseArrayB.put(7, "brandLabel");
            sparseArrayB.put(8, "buttonText");
            sparseArrayB.put(9, "buttonTint");
            sparseArrayB.put(10, "clickHandler");
            sparseArrayB.put(11, "clickHandlers");
            sparseArrayB.put(12, "clickListener");
            sparseArrayB.put(13, "cta");
            sparseArrayB.put(14, "data");
            sparseArrayB.put(15, "errorState");
            sparseArrayB.put(16, "footer");
            sparseArrayB.put(17, "heightRes");
            sparseArrayB.put(18, "htmlListener");
            sparseArrayB.put(19, "imageLoaderListener");
            sparseArrayB.put(20, "importantForAccessibility");
            sparseArrayB.put(21, "inlineMessage");
            sparseArrayB.put(22, "isChecked");
            sparseArrayB.put(23, "isEnabled");
            sparseArrayB.put(24, "isLowerPriceYellow");
            sparseArrayB.put(25, "isPopup");
            sparseArrayB.put(26, "isUnlocking");
            sparseArrayB.put(27, "item");
            sparseArrayB.put(28, "linkHandler");
            sparseArrayB.put(29, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(30, "lottieAutoPlay");
            sparseArrayB.put(31, "lottieBackgroundColor");
            sparseArrayB.put(32, "lottieLoop");
            sparseArrayB.put(33, "margins");
            sparseArrayB.put(34, "onQueryTextChangeListener");
            sparseArrayB.put(35, "onQueryTextFocusChangeListener");
            sparseArrayB.put(36, "onQueryTextSubmitListener");
            sparseArrayB.put(37, "searchQueryHint");
            sparseArrayB.put(38, "state");
            sparseArrayB.put(39, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(40, "title");
            sparseArrayB.put(41, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f8668a;

        static {
            HashMap map = new HashMap(9);
            f8668a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_banner_asset, map, "layout/epoxy_item_banner_asset_0", com.woolworths.R.layout.epoxy_item_banner_icon, "layout/epoxy_item_banner_icon_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_body, map, "layout/epoxy_item_body_0", com.woolworths.R.layout.epoxy_item_finch_info, "layout/epoxy_item_finch_info_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_footer, map, "layout/epoxy_item_footer_0", com.woolworths.R.layout.epoxy_item_primary_cta, "layout/epoxy_item_primary_cta_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_secondary_cta, map, "layout/epoxy_item_secondary_cta_0", com.woolworths.R.layout.epoxy_item_title, "layout/epoxy_item_title_0");
            map.put("layout/fragment_base_bottom_sheet_0", Integer.valueOf(com.woolworths.R.layout.fragment_base_bottom_sheet));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(9);
        f8667a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_banner_asset, 1);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_banner_icon, 2);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_body, 3);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_finch_info, 4);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_footer, 5);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_primary_cta, 6);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_secondary_cta, 7);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_title, 8);
        sparseIntArray.put(com.woolworths.R.layout.fragment_base_bottom_sheet, 9);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f8667a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if ("layout/epoxy_item_banner_asset_0".equals(tag)) {
                        return new EpoxyItemBannerAssetBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_banner_asset is invalid. Received: "));
                case 2:
                    if ("layout/epoxy_item_banner_icon_0".equals(tag)) {
                        return new EpoxyItemBannerIconBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_banner_icon is invalid. Received: "));
                case 3:
                    if (!"layout/epoxy_item_body_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_body is invalid. Received: "));
                    }
                    EpoxyItemBodyBindingImpl epoxyItemBodyBindingImpl = new EpoxyItemBodyBindingImpl(dataBindingComponent, view, (TextView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    epoxyItemBodyBindingImpl.B = -1L;
                    epoxyItemBodyBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, epoxyItemBodyBindingImpl);
                    epoxyItemBodyBindingImpl.r();
                    return epoxyItemBodyBindingImpl;
                case 4:
                    if (!"layout/epoxy_item_finch_info_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_finch_info is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
                    EpoxyItemFinchInfoBindingImpl epoxyItemFinchInfoBindingImpl = new EpoxyItemFinchInfoBindingImpl(view, (ImageView) objArrT[1], (TextView) objArrT[3], (TextView) objArrT[2], dataBindingComponent);
                    epoxyItemFinchInfoBindingImpl.C = -1L;
                    epoxyItemFinchInfoBindingImpl.y.setTag(null);
                    epoxyItemFinchInfoBindingImpl.z.setTag(null);
                    ((ConstraintLayout) objArrT[0]).setTag(null);
                    epoxyItemFinchInfoBindingImpl.A.setTag(null);
                    epoxyItemFinchInfoBindingImpl.E(view);
                    epoxyItemFinchInfoBindingImpl.r();
                    return epoxyItemFinchInfoBindingImpl;
                case 5:
                    if (!"layout/epoxy_item_footer_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_footer is invalid. Received: "));
                    }
                    EpoxyItemFooterBindingImpl epoxyItemFooterBindingImpl = new EpoxyItemFooterBindingImpl(dataBindingComponent, view, (TextView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    epoxyItemFooterBindingImpl.B = -1L;
                    epoxyItemFooterBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, epoxyItemFooterBindingImpl);
                    epoxyItemFooterBindingImpl.r();
                    return epoxyItemFooterBindingImpl;
                case 6:
                    if ("layout/epoxy_item_primary_cta_0".equals(tag)) {
                        return new EpoxyItemPrimaryCtaBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_primary_cta is invalid. Received: "));
                case 7:
                    if ("layout/epoxy_item_secondary_cta_0".equals(tag)) {
                        return new EpoxyItemSecondaryCtaBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_secondary_cta is invalid. Received: "));
                case 8:
                    if (!"layout/epoxy_item_title_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_title is invalid. Received: "));
                    }
                    EpoxyItemTitleBindingImpl epoxyItemTitleBindingImpl = new EpoxyItemTitleBindingImpl(dataBindingComponent, view, (TextView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    epoxyItemTitleBindingImpl.B = -1L;
                    epoxyItemTitleBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, epoxyItemTitleBindingImpl);
                    epoxyItemTitleBindingImpl.r();
                    return epoxyItemTitleBindingImpl;
                case 9:
                    if ("layout/fragment_base_bottom_sheet_0".equals(tag)) {
                        return new FragmentBaseBottomSheetBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for fragment_base_bottom_sheet is invalid. Received: "));
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f8667a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f8668a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
