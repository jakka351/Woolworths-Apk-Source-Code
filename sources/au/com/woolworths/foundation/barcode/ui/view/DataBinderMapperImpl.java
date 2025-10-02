package au.com.woolworths.foundation.barcode.ui.view;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.camera.core.impl.b;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.foundation.barcode.ui.view.databinding.BarcodeHolderBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f8481a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(31, 0, 1, "_all", "asset");
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
            sparseArrayB.put(28, "showError");
            sparseArrayB.put(29, "state");
            sparseArrayB.put(30, TextBundle.TEXT_ENTRY);
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f8482a;

        static {
            HashMap map = new HashMap(1);
            f8482a = map;
            map.put("layout/barcode_holder_0", Integer.valueOf(com.woolworths.R.layout.barcode_holder));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f8481a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.barcode_holder, 1);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f8481a.get(i);
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
        if ("layout/barcode_holder_0".equals(tag)) {
            return new BarcodeHolderBindingImpl(dataBindingComponent, new View[]{view});
        }
        throw new IllegalArgumentException(b.m(tag, "The tag for barcode_holder is invalid. Received: "));
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        int i2;
        if (viewArr.length == 0 || (i2 = f8481a.get(i)) <= 0) {
            return null;
        }
        Object tag = viewArr[0].getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 != 1) {
            return null;
        }
        if ("layout/barcode_holder_0".equals(tag)) {
            return new BarcodeHolderBindingImpl(dataBindingComponent, viewArr);
        }
        throw new IllegalArgumentException(b.m(tag, "The tag for barcode_holder is invalid. Received: "));
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f8482a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
