package au.com.woolworths.shared.ui.views;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.camera.core.impl.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shared.ui.views.databinding.EpoxyItemHorizontalSelectorBindingImpl;
import au.com.woolworths.shared.ui.views.databinding.LayoutHorizontalSelectorBindingImpl;
import com.airbnb.epoxy.Carousel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f10102a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(34, 0, 1, "_all", "asset");
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
            sparseArrayB.put(15, "index");
            sparseArrayB.put(16, "inlineMessage");
            sparseArrayB.put(17, "isChecked");
            sparseArrayB.put(18, "isEnabled");
            sparseArrayB.put(19, "isLowerPriceYellow");
            sparseArrayB.put(20, "isUnlocking");
            sparseArrayB.put(21, "itemWidthRes");
            sparseArrayB.put(22, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(23, "lottieAutoPlay");
            sparseArrayB.put(24, "lottieBackgroundColor");
            sparseArrayB.put(25, "lottieLoop");
            sparseArrayB.put(26, "margins");
            sparseArrayB.put(27, "onQueryTextChangeListener");
            sparseArrayB.put(28, "onQueryTextFocusChangeListener");
            sparseArrayB.put(29, "onQueryTextSubmitListener");
            sparseArrayB.put(30, "searchQueryHint");
            sparseArrayB.put(31, "state");
            sparseArrayB.put(32, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(33, "viewListener");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f10103a;

        static {
            HashMap map = new HashMap(2);
            f10103a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_horizontal_selector, map, "layout/epoxy_item_horizontal_selector_0", com.woolworths.R.layout.layout_horizontal_selector, "layout/layout_horizontal_selector_0");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        f10102a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_horizontal_selector, 1);
        sparseIntArray.put(com.woolworths.R.layout.layout_horizontal_selector, 2);
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
        int i2 = f10102a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i2 == 1) {
                if ("layout/epoxy_item_horizontal_selector_0".equals(tag)) {
                    return new EpoxyItemHorizontalSelectorBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_horizontal_selector is invalid. Received: "));
            }
            if (i2 == 2) {
                if (!"layout/layout_horizontal_selector_0".equals(tag)) {
                    throw new IllegalArgumentException(b.m(tag, "The tag for layout_horizontal_selector is invalid. Received: "));
                }
                Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, LayoutHorizontalSelectorBindingImpl.D);
                LayoutHorizontalSelectorBindingImpl layoutHorizontalSelectorBindingImpl = new LayoutHorizontalSelectorBindingImpl(dataBindingComponent, view, (View) objArrT[2], (Carousel) objArrT[3], (View) objArrT[1]);
                layoutHorizontalSelectorBindingImpl.C = -1L;
                ((ConstraintLayout) objArrT[0]).setTag(null);
                layoutHorizontalSelectorBindingImpl.E(view);
                layoutHorizontalSelectorBindingImpl.r();
                return layoutHorizontalSelectorBindingImpl;
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f10102a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f10103a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
