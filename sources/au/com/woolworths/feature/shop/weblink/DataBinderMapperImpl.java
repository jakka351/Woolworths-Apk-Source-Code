package au.com.woolworths.feature.shop.weblink;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.camera.core.impl.b;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.feature.shop.weblink.databinding.ActivityWebLinkBindingImpl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f8252a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(44, 0, 1, "_all", "actionState");
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
            sparseArrayB.put(35, "onQueryTextChangeListener");
            sparseArrayB.put(36, "onQueryTextFocusChangeListener");
            sparseArrayB.put(37, "onQueryTextSubmitListener");
            sparseArrayB.put(38, "searchQueryHint");
            sparseArrayB.put(39, "sectionTitle");
            sparseArrayB.put(40, "state");
            sparseArrayB.put(41, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(42, "viewListener");
            sparseArrayB.put(43, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f8253a;

        static {
            HashMap map = new HashMap(1);
            f8253a = map;
            map.put("layout/activity_web_link_0", Integer.valueOf(com.woolworths.R.layout.activity_web_link));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f8252a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_web_link, 1);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f8252a.get(i);
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
        if ("layout/activity_web_link_0".equals(tag)) {
            return new ActivityWebLinkBindingImpl(dataBindingComponent, view);
        }
        throw new IllegalArgumentException(b.m(tag, "The tag for activity_web_link is invalid. Received: "));
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f8252a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f8253a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
