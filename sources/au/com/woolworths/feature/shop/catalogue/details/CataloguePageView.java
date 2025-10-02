package au.com.woolworths.feature.shop.catalogue.details;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.navigation.ui.a;
import au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCataloguePageImageBinding;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCataloguePageTileBinding;
import au.com.woolworths.feature.shop.catalogue.models.CataloguePage;
import au.com.woolworths.feature.shop.catalogue.models.CataloguePageItem;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001fB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CataloguePageView;", "Landroid/view/ViewGroup;", "Lau/com/woolworths/android/onesite/common/imageloading/ImageLoaderListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lau/com/woolworths/feature/shop/catalogue/models/CataloguePage;", "page", "", "setCataloguePageInfo", "(Lau/com/woolworths/feature/shop/catalogue/models/CataloguePage;)V", "Lau/com/woolworths/feature/shop/catalogue/details/CataloguePageItemClickListener;", "g", "Lau/com/woolworths/feature/shop/catalogue/details/CataloguePageItemClickListener;", "getCataloguePageItemClickListener", "()Lau/com/woolworths/feature/shop/catalogue/details/CataloguePageItemClickListener;", "setCataloguePageItemClickListener", "(Lau/com/woolworths/feature/shop/catalogue/details/CataloguePageItemClickListener;)V", "cataloguePageItemClickListener", "h", "Lau/com/woolworths/android/onesite/common/imageloading/ImageLoaderListener;", "getCatalogueImageLoaderListener", "()Lau/com/woolworths/android/onesite/common/imageloading/ImageLoaderListener;", "setCatalogueImageLoaderListener", "(Lau/com/woolworths/android/onesite/common/imageloading/ImageLoaderListener;)V", "catalogueImageLoaderListener", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CataloguePageView extends ViewGroup implements ImageLoaderListener {
    public static final /* synthetic */ int i = 0;
    public int d;
    public int e;
    public final ArrayList f;

    /* renamed from: g, reason: from kotlin metadata */
    public CataloguePageItemClickListener cataloguePageItemClickListener;

    /* renamed from: h, reason: from kotlin metadata */
    public ImageLoaderListener catalogueImageLoaderListener;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CataloguePageView$Companion;", "", "", "BG_IMAGE_VIEW_INDEX", "I", "ADD_AT_END_INDEX", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CataloguePageView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    @Override // au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener
    public final boolean a(ViewDataBinding viewDataBinding) {
        ImageLoaderListener imageLoaderListener = this.catalogueImageLoaderListener;
        if (imageLoaderListener != null) {
            return imageLoaderListener.a(viewDataBinding);
        }
        return false;
    }

    @Override // au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener
    public final boolean b(ViewDataBinding viewDataBinding, Drawable drawable) {
        ImageLoaderListener imageLoaderListener = this.catalogueImageLoaderListener;
        if (imageLoaderListener != null) {
            return imageLoaderListener.b(null, drawable);
        }
        return false;
    }

    @Nullable
    public final ImageLoaderListener getCatalogueImageLoaderListener() {
        return this.catalogueImageLoaderListener;
    }

    @Nullable
    public final CataloguePageItemClickListener getCataloguePageItemClickListener() {
        return this.cataloguePageItemClickListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (z) {
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            int childCount = getChildCount();
            ArrayList arrayList = this.f;
            if (childCount == arrayList.size() + 1) {
                int i8 = 0;
                getChildAt(0).layout(0, 0, i6, i7);
                for (Object obj : arrayList) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    if (((CataloguePageItem) obj).getCoordinates() != null) {
                        double d = i6;
                        double d2 = i7;
                        getChildAt(i9).layout((int) Math.ceil((d / this.d) * r10.left), (int) Math.ceil((d2 / this.e) * r10.top), (int) Math.ceil((d / this.d) * r10.right), (int) Math.ceil((d2 / this.e) * r10.bottom));
                    }
                    i8 = i9;
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4 = this.d;
        int i5 = this.e;
        if (i4 <= 0 || i5 <= 0) {
            super.onMeasure(i2, i3);
        } else {
            setMeasuredDimension(i4, i5);
        }
    }

    public final void setCatalogueImageLoaderListener(@Nullable ImageLoaderListener imageLoaderListener) {
        this.catalogueImageLoaderListener = imageLoaderListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Collection] */
    public final void setCataloguePageInfo(@Nullable CataloguePage page) {
        ?? arrayList;
        String strFlattenToString;
        if (page == null) {
            return;
        }
        this.d = page.getPageImageWidth();
        this.e = page.getPageImageHeight();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i2 = ItemCataloguePageImageBinding.B;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        ItemCataloguePageImageBinding itemCataloguePageImageBinding = (ItemCataloguePageImageBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.item_catalogue_page_image, this, true, null);
        Intrinsics.g(itemCataloguePageImageBinding, "inflate(...)");
        itemCataloguePageImageBinding.L(page);
        itemCataloguePageImageBinding.M(this);
        ArrayList arrayList2 = this.f;
        arrayList2.clear();
        List<CataloguePageItem> pageItems = page.getPageItems();
        if (pageItems != null) {
            arrayList = new ArrayList();
            for (Object obj : pageItems) {
                if (((CataloguePageItem) obj).getCoordinates() != null) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = EmptyList.d;
        }
        arrayList2.addAll(arrayList);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            CataloguePageItem cataloguePageItem = (CataloguePageItem) it.next();
            LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(getContext());
            int i3 = ItemCataloguePageTileBinding.z;
            DataBinderMapperImpl dataBinderMapperImpl2 = DataBindingUtil.f2545a;
            ItemCataloguePageTileBinding itemCataloguePageTileBinding = (ItemCataloguePageTileBinding) ViewDataBinding.q(layoutInflaterFrom2, R.layout.item_catalogue_page_tile, this, false, null);
            Intrinsics.e(itemCataloguePageTileBinding);
            View view = itemCataloguePageTileBinding.h;
            itemCataloguePageTileBinding.L(cataloguePageItem);
            Rect coordinates = cataloguePageItem.getCoordinates();
            if (coordinates == null || (strFlattenToString = coordinates.flattenToString()) == null) {
                strFlattenToString = "";
            }
            view.setTag(strFlattenToString);
            view.setOnClickListener(new a(7, this, cataloguePageItem));
            addViewInLayout(view, -1, getLayoutParams(), true);
        }
        requestLayout();
    }

    public final void setCataloguePageItemClickListener(@Nullable CataloguePageItemClickListener cataloguePageItemClickListener) {
        this.cataloguePageItemClickListener = cataloguePageItemClickListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CataloguePageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ CataloguePageView(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CataloguePageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.h(context, "context");
        this.f = new ArrayList();
    }
}
