package au.com.woolworths.feature.shop.imagegallery;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.camera.core.impl.b;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.feature.shop.imagegallery.databinding.ActivityProductImageGalleryBindingImpl;
import au.com.woolworths.feature.shop.imagegallery.databinding.ItemCarouselImageBindingImpl;
import com.github.piasy.biv.view.BigImageView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f7255a;

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
            sparseArrayB.put(18, "imageUrl");
            sparseArrayB.put(19, "importantForAccessibility");
            sparseArrayB.put(20, "index");
            sparseArrayB.put(21, "infoSectionItem");
            sparseArrayB.put(22, "inlineMessage");
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
            sparseArrayB.put(36, "onQueryTextChangeListener");
            sparseArrayB.put(37, "onQueryTextFocusChangeListener");
            sparseArrayB.put(38, "onQueryTextSubmitListener");
            sparseArrayB.put(39, "searchQueryHint");
            sparseArrayB.put(40, "sectionTitle");
            sparseArrayB.put(41, "state");
            sparseArrayB.put(42, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(43, "viewListener");
            sparseArrayB.put(44, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f7256a;

        static {
            HashMap map = new HashMap(2);
            f7256a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_product_image_gallery, map, "layout/activity_product_image_gallery_0", com.woolworths.R.layout.item_carousel_image, "layout/item_carousel_image_0");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        f7255a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_product_image_gallery, 1);
        sparseIntArray.put(com.woolworths.R.layout.item_carousel_image, 2);
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
        int i2 = f7255a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i2 == 1) {
                if ("layout/activity_product_image_gallery_0".equals(tag)) {
                    return new ActivityProductImageGalleryBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(tag, "The tag for activity_product_image_gallery is invalid. Received: "));
            }
            if (i2 == 2) {
                if (!"layout/item_carousel_image_0".equals(tag)) {
                    throw new IllegalArgumentException(b.m(tag, "The tag for item_carousel_image is invalid. Received: "));
                }
                ItemCarouselImageBindingImpl itemCarouselImageBindingImpl = new ItemCarouselImageBindingImpl(dataBindingComponent, view, (BigImageView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                itemCarouselImageBindingImpl.B = -1L;
                itemCarouselImageBindingImpl.y.setTag(null);
                view.setTag(com.woolworths.R.id.dataBinding, itemCarouselImageBindingImpl);
                itemCarouselImageBindingImpl.r();
                return itemCarouselImageBindingImpl;
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f7255a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f7256a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
