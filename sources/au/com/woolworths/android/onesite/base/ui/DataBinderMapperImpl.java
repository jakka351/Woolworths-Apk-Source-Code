package au.com.woolworths.android.onesite.base.ui;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.camera.core.impl.b;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBindingImpl;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeDownloadableAssetBindingImpl;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBindingImpl;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericInlineErrorStateBindingImpl;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBindingImpl;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInlineMessageBindingImpl;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBindingImpl;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeSearchableToolbarWrapperBindingImpl;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeTintableTextBindingImpl;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeVerticalDividerBindingImpl;
import au.com.woolworths.android.onesite.base.ui.databinding.ItemDynamicSizeCardBindingImpl;
import au.com.woolworths.android.onesite.base.ui.databinding.ItemSpacerBindingImpl;
import au.com.woolworths.android.onesite.base.ui.databinding.StatefulButtonCheckedBindingImpl;
import au.com.woolworths.android.onesite.base.ui.databinding.UnlockSliderBindingImpl;
import com.google.android.material.divider.MaterialDivider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f4225a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(30, 0, 1, "_all", "asset");
            sparseArrayB.put(2, "backgroundColor");
            sparseArrayB.put(3, "bannerState");
            sparseArrayB.put(4, "brandLabel");
            sparseArrayB.put(5, "buttonText");
            sparseArrayB.put(6, "buttonTint");
            sparseArrayB.put(7, "clickHandler");
            sparseArrayB.put(8, "clickHandlers");
            sparseArrayB.put(9, "clickListener");
            sparseArrayB.put(10, "data");
            sparseArrayB.put(11, "errorState");
            sparseArrayB.put(12, "heightRes");
            sparseArrayB.put(13, "imageLoaderListener");
            sparseArrayB.put(14, "importantForAccessibility");
            sparseArrayB.put(15, "inlineMessage");
            sparseArrayB.put(16, "isChecked");
            sparseArrayB.put(17, "isEnabled");
            sparseArrayB.put(18, "isLowerPriceYellow");
            sparseArrayB.put(19, "isUnlocking");
            sparseArrayB.put(20, "lottieAutoPlay");
            sparseArrayB.put(21, "lottieBackgroundColor");
            sparseArrayB.put(22, "lottieLoop");
            sparseArrayB.put(23, "margins");
            sparseArrayB.put(24, "onQueryTextChangeListener");
            sparseArrayB.put(25, "onQueryTextFocusChangeListener");
            sparseArrayB.put(26, "onQueryTextSubmitListener");
            sparseArrayB.put(27, "searchQueryHint");
            sparseArrayB.put(28, "state");
            sparseArrayB.put(29, TextBundle.TEXT_ENTRY);
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f4226a;

        static {
            HashMap map = new HashMap(14);
            f4226a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_brand_label, map, "layout/include_brand_label_0", com.woolworths.R.layout.include_downloadable_asset, "layout/include_downloadable_asset_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_generic_error_state, map, "layout/include_generic_error_state_0", com.woolworths.R.layout.include_generic_inline_error_state, "layout/include_generic_inline_error_state_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_horizontal_divider, map, "layout/include_horizontal_divider_0", com.woolworths.R.layout.include_inline_message, "layout/include_inline_message_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_inset_banner, map, "layout/include_inset_banner_0", com.woolworths.R.layout.include_searchable_toolbar_wrapper, "layout/include_searchable_toolbar_wrapper_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.include_tintable_text, map, "layout/include_tintable_text_0", com.woolworths.R.layout.include_vertical_divider, "layout/include_vertical_divider_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.item_dynamic_size_card, map, "layout/item_dynamic_size_card_0", com.woolworths.R.layout.item_spacer, "layout/item_spacer_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.stateful_button_checked, map, "layout/stateful_button_checked_0", com.woolworths.R.layout.unlock_slider, "layout/unlock_slider_0");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(14);
        f4225a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.include_brand_label, 1);
        sparseIntArray.put(com.woolworths.R.layout.include_downloadable_asset, 2);
        sparseIntArray.put(com.woolworths.R.layout.include_generic_error_state, 3);
        sparseIntArray.put(com.woolworths.R.layout.include_generic_inline_error_state, 4);
        sparseIntArray.put(com.woolworths.R.layout.include_horizontal_divider, 5);
        sparseIntArray.put(com.woolworths.R.layout.include_inline_message, 6);
        sparseIntArray.put(com.woolworths.R.layout.include_inset_banner, 7);
        sparseIntArray.put(com.woolworths.R.layout.include_searchable_toolbar_wrapper, 8);
        sparseIntArray.put(com.woolworths.R.layout.include_tintable_text, 9);
        sparseIntArray.put(com.woolworths.R.layout.include_vertical_divider, 10);
        sparseIntArray.put(com.woolworths.R.layout.item_dynamic_size_card, 11);
        sparseIntArray.put(com.woolworths.R.layout.item_spacer, 12);
        sparseIntArray.put(com.woolworths.R.layout.stateful_button_checked, 13);
        sparseIntArray.put(com.woolworths.R.layout.unlock_slider, 14);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f4225a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if (!"layout/include_brand_label_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for include_brand_label is invalid. Received: "));
                    }
                    IncludeBrandLabelBindingImpl includeBrandLabelBindingImpl = new IncludeBrandLabelBindingImpl(dataBindingComponent, view, (CheckedTextView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    includeBrandLabelBindingImpl.D = -1L;
                    includeBrandLabelBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, includeBrandLabelBindingImpl);
                    includeBrandLabelBindingImpl.r();
                    return includeBrandLabelBindingImpl;
                case 2:
                    if ("layout/include_downloadable_asset_0".equals(tag)) {
                        return new IncludeDownloadableAssetBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for include_downloadable_asset is invalid. Received: "));
                case 3:
                    if ("layout/include_generic_error_state_0".equals(tag)) {
                        return new IncludeGenericErrorStateBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for include_generic_error_state is invalid. Received: "));
                case 4:
                    if ("layout/include_generic_inline_error_state_0".equals(tag)) {
                        return new IncludeGenericInlineErrorStateBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for include_generic_inline_error_state is invalid. Received: "));
                case 5:
                    if (!"layout/include_horizontal_divider_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for include_horizontal_divider is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 1, null, null);
                    IncludeHorizontalDividerBindingImpl includeHorizontalDividerBindingImpl = new IncludeHorizontalDividerBindingImpl(dataBindingComponent, view, 0);
                    includeHorizontalDividerBindingImpl.y = -1L;
                    ((MaterialDivider) objArrT[0]).setTag(null);
                    includeHorizontalDividerBindingImpl.E(view);
                    includeHorizontalDividerBindingImpl.r();
                    return includeHorizontalDividerBindingImpl;
                case 6:
                    if ("layout/include_inline_message_0".equals(tag)) {
                        return new IncludeInlineMessageBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for include_inline_message is invalid. Received: "));
                case 7:
                    if ("layout/include_inset_banner_0".equals(tag)) {
                        return new IncludeInsetBannerBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for include_inset_banner is invalid. Received: "));
                case 8:
                    if ("layout/include_searchable_toolbar_wrapper_0".equals(tag)) {
                        return new IncludeSearchableToolbarWrapperBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for include_searchable_toolbar_wrapper is invalid. Received: "));
                case 9:
                    if ("layout/include_tintable_text_0".equals(tag)) {
                        return new IncludeTintableTextBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for include_tintable_text is invalid. Received: "));
                case 10:
                    if (!"layout/include_vertical_divider_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for include_vertical_divider is invalid. Received: "));
                    }
                    Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 1, null, null);
                    IncludeVerticalDividerBindingImpl includeVerticalDividerBindingImpl = new IncludeVerticalDividerBindingImpl(dataBindingComponent, view, 0);
                    includeVerticalDividerBindingImpl.y = -1L;
                    ((MaterialDivider) objArrT2[0]).setTag(null);
                    includeVerticalDividerBindingImpl.E(view);
                    includeVerticalDividerBindingImpl.r();
                    return includeVerticalDividerBindingImpl;
                case 11:
                    if ("layout/item_dynamic_size_card_0".equals(tag)) {
                        return new ItemDynamicSizeCardBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for item_dynamic_size_card is invalid. Received: "));
                case 12:
                    if ("layout/item_spacer_0".equals(tag)) {
                        return new ItemSpacerBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for item_spacer is invalid. Received: "));
                case 13:
                    if ("layout/stateful_button_checked_0".equals(tag)) {
                        return new StatefulButtonCheckedBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for stateful_button_checked is invalid. Received: "));
                case 14:
                    if ("layout/unlock_slider_0".equals(tag)) {
                        return new UnlockSliderBindingImpl(dataBindingComponent, new View[]{view});
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for unlock_slider is invalid. Received: "));
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        int i2;
        if (viewArr.length == 0 || (i2 = f4225a.get(i)) <= 0) {
            return null;
        }
        Object tag = viewArr[0].getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 != 14) {
            return null;
        }
        if ("layout/unlock_slider_0".equals(tag)) {
            return new UnlockSliderBindingImpl(dataBindingComponent, viewArr);
        }
        throw new IllegalArgumentException(b.m(tag, "The tag for unlock_slider is invalid. Received: "));
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f4226a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
