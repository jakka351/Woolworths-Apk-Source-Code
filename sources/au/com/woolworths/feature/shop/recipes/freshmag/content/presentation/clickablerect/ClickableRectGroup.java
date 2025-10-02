package au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.clickablerect;

import android.content.Context;
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
import au.com.woolworths.feature.shop.recipes.databinding.ClickableRectGroupBinding;
import au.com.woolworths.feature.shop.recipes.databinding.ItemClickableRectBinding;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.clickablerect.ClickableRectAdapter;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00016B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R.\u0010\u001e\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR.\u0010%\u001a\u0004\u0018\u00010\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R.\u0010-\u001a\u0004\u0018\u00010&2\b\u0010\u0017\u001a\u0004\u0018\u00010&8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00105\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00067"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/clickablerect/ClickableRectGroup;", "Landroid/view/ViewGroup;", "Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/clickablerect/ClickableRectAdapter$Observer;", "Lau/com/woolworths/android/onesite/common/imageloading/ImageLoaderListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "d", "I", "getBackingImageWidth", "()I", "setBackingImageWidth", "(I)V", "backingImageWidth", "e", "getBackingImageHeight", "setBackingImageHeight", "backingImageHeight", "", "value", "f", "Ljava/lang/String;", "getBackingImageUrl", "()Ljava/lang/String;", "setBackingImageUrl", "(Ljava/lang/String;)V", "backingImageUrl", "g", "Lau/com/woolworths/android/onesite/common/imageloading/ImageLoaderListener;", "getBackingImageLoaderListener", "()Lau/com/woolworths/android/onesite/common/imageloading/ImageLoaderListener;", "setBackingImageLoaderListener", "(Lau/com/woolworths/android/onesite/common/imageloading/ImageLoaderListener;)V", "backingImageLoaderListener", "Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/clickablerect/ClickableRectAdapter;", "h", "Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/clickablerect/ClickableRectAdapter;", "getAdapter", "()Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/clickablerect/ClickableRectAdapter;", "setAdapter", "(Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/clickablerect/ClickableRectAdapter;)V", "adapter", "Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/clickablerect/OnItemClickListener;", "i", "Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/clickablerect/OnItemClickListener;", "getOnItemClickListener", "()Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/clickablerect/OnItemClickListener;", "setOnItemClickListener", "(Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/clickablerect/OnItemClickListener;)V", "onItemClickListener", "Companion", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ClickableRectGroup extends ViewGroup implements ClickableRectAdapter.Observer, ImageLoaderListener {
    public static final /* synthetic */ int l = 0;

    /* renamed from: d, reason: from kotlin metadata */
    public int backingImageWidth;

    /* renamed from: e, reason: from kotlin metadata */
    public int backingImageHeight;

    /* renamed from: f, reason: from kotlin metadata */
    public String backingImageUrl;

    /* renamed from: g, reason: from kotlin metadata */
    public ImageLoaderListener backingImageLoaderListener;

    /* renamed from: h, reason: from kotlin metadata */
    public ClickableRectAdapter adapter;

    /* renamed from: i, reason: from kotlin metadata */
    public OnItemClickListener onItemClickListener;
    public final ClickableRectGroupBinding j;
    public final ArrayList k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/clickablerect/ClickableRectGroup$Companion;", "", "", "BACKING_IMAGE_VIEW_INDEX", "I", "ADD_AT_END_INDEX", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ClickableRectGroup(@NotNull Context context) {
        this(context, null);
        Intrinsics.h(context, "context");
    }

    @Override // au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener
    public final boolean a(ViewDataBinding viewDataBinding) {
        ImageLoaderListener imageLoaderListener = this.backingImageLoaderListener;
        if (imageLoaderListener != null) {
            return imageLoaderListener.a(viewDataBinding);
        }
        return false;
    }

    @Override // au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener
    public final boolean b(ViewDataBinding viewDataBinding, Drawable drawable) {
        ImageLoaderListener imageLoaderListener = this.backingImageLoaderListener;
        if (imageLoaderListener != null) {
            return imageLoaderListener.b(null, drawable);
        }
        return false;
    }

    public final void d(List list) {
        removeViewsInLayout(1, getChildCount() - 1);
        ArrayList arrayList = this.k;
        arrayList.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ClickableRect clickableRect = (ClickableRect) it.next();
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            int i = ItemClickableRectBinding.z;
            DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
            ItemClickableRectBinding itemClickableRectBinding = (ItemClickableRectBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.item_clickable_rect, this, false, null);
            Intrinsics.g(itemClickableRectBinding, "inflate(...)");
            View view = itemClickableRectBinding.h;
            view.setOnClickListener(new a(9, this, clickableRect));
            Rect rect = clickableRect.f8043a;
            arrayList.add(new Rect(rect.f8045a, rect.b, rect.c, rect.d));
            addViewInLayout(view, -1, getLayoutParams(), true);
        }
        requestLayout();
    }

    @Nullable
    public final ClickableRectAdapter getAdapter() {
        return this.adapter;
    }

    public final int getBackingImageHeight() {
        return this.backingImageHeight;
    }

    @Nullable
    public final ImageLoaderListener getBackingImageLoaderListener() {
        return this.backingImageLoaderListener;
    }

    @Nullable
    public final String getBackingImageUrl() {
        return this.backingImageUrl;
    }

    public final int getBackingImageWidth() {
        return this.backingImageWidth;
    }

    @Nullable
    public final OnItemClickListener getOnItemClickListener() {
        return this.onItemClickListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ClickableRectAdapter clickableRectAdapter = this.adapter;
        if (clickableRectAdapter != null) {
            clickableRectAdapter.b = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        getChildAt(0).layout(0, 0, i5, i6);
        double d = i5;
        double d2 = i6;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                CollectionsKt.z0();
                throw null;
            }
            Rect rect = (Rect) next;
            getChildAt(i8).layout((int) Math.ceil((d / this.backingImageWidth) * rect.f8045a), (int) Math.ceil((d2 / this.backingImageHeight) * rect.b), (int) Math.ceil((d / this.backingImageWidth) * rect.c), (int) Math.ceil((d2 / this.backingImageHeight) * rect.d));
            i7 = i8;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.backingImageWidth;
        int i4 = this.backingImageHeight;
        if (i3 <= 0 || i4 <= 0) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(i3, i4);
        }
    }

    public final void setAdapter(@Nullable ClickableRectAdapter clickableRectAdapter) {
        this.adapter = clickableRectAdapter;
        if (clickableRectAdapter != null) {
            clickableRectAdapter.b = this;
        }
    }

    public final void setBackingImageHeight(int i) {
        this.backingImageHeight = i;
    }

    public final void setBackingImageLoaderListener(@Nullable ImageLoaderListener imageLoaderListener) {
        this.j.L(imageLoaderListener);
        this.backingImageLoaderListener = imageLoaderListener;
    }

    public final void setBackingImageUrl(@Nullable String str) {
        this.j.M(str);
        this.backingImageUrl = str;
    }

    public final void setBackingImageWidth(int i) {
        this.backingImageWidth = i;
    }

    public final void setOnItemClickListener(@Nullable OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ClickableRectGroup(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.h(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = ClickableRectGroupBinding.B;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        ClickableRectGroupBinding clickableRectGroupBinding = (ClickableRectGroupBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.clickable_rect_group, this, true, null);
        Intrinsics.g(clickableRectGroupBinding, "inflate(...)");
        this.j = clickableRectGroupBinding;
        this.k = new ArrayList();
    }
}
