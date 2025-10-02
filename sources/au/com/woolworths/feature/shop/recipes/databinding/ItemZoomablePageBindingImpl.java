package au.com.woolworths.feature.shop.recipes.databinding;

import android.util.SparseIntArray;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.clickablerect.ClickableRectGroup;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.clickablerect.OnItemClickListener;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.zoomablepage.ZoomablePage;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.zoomablepage.ZoomablePageViewState;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class ItemZoomablePageBindingImpl extends ItemZoomablePageBinding {
    public static final SparseIntArray H;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.zoom_layout, 4);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (251 == i) {
            O((ZoomablePageViewState) obj);
            return true;
        }
        if (178 == i) {
            M((OnItemClickListener) obj);
            return true;
        }
        if (193 == i) {
            N((ZoomablePage) obj);
            return true;
        }
        if (9 != i) {
            return false;
        }
        L((ImageLoaderListener) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.recipes.databinding.ItemZoomablePageBinding
    public final void L(ImageLoaderListener imageLoaderListener) throws Throwable {
        this.D = imageLoaderListener;
        synchronized (this) {
            this.G |= 8;
        }
        h(9);
        y();
    }

    @Override // au.com.woolworths.feature.shop.recipes.databinding.ItemZoomablePageBinding
    public final void M(OnItemClickListener onItemClickListener) throws Throwable {
        this.E = onItemClickListener;
        synchronized (this) {
            this.G |= 2;
        }
        h(178);
        y();
    }

    @Override // au.com.woolworths.feature.shop.recipes.databinding.ItemZoomablePageBinding
    public final void N(ZoomablePage zoomablePage) throws Throwable {
        this.B = zoomablePage;
        synchronized (this) {
            this.G |= 4;
        }
        h(193);
        y();
    }

    @Override // au.com.woolworths.feature.shop.recipes.databinding.ItemZoomablePageBinding
    public final void O(ZoomablePageViewState zoomablePageViewState) throws Throwable {
        this.C = zoomablePageViewState;
        synchronized (this) {
            this.G |= 1;
        }
        h(251);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        boolean z2;
        String backingImageUrl;
        int i;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        ZoomablePageViewState zoomablePageViewState = this.C;
        OnItemClickListener onItemClickListener = this.E;
        ZoomablePage zoomablePage = this.B;
        ImageLoaderListener backingImageLoaderListener = this.D;
        long j2 = 17 & j;
        int i2 = 0;
        if (j2 != 0) {
            z2 = true;
            z = zoomablePageViewState == ZoomablePageViewState.d;
            if (zoomablePageViewState != ZoomablePageViewState.f) {
                z2 = false;
            }
        } else {
            z = false;
            z2 = false;
        }
        long j3 = j & 30;
        if (j3 == 0 || zoomablePage == null) {
            backingImageUrl = null;
            i = 0;
        } else {
            int i3 = zoomablePage.c;
            int i4 = zoomablePage.b;
            backingImageUrl = zoomablePage.f8046a;
            i2 = i4;
            i = i3;
        }
        if (j3 != 0) {
            ClickableRectGroup clickableRectGroup = this.y;
            Intrinsics.h(clickableRectGroup, "clickableRectGroup");
            Intrinsics.h(backingImageUrl, "backingImageUrl");
            Intrinsics.h(backingImageLoaderListener, "backingImageLoaderListener");
            Intrinsics.h(onItemClickListener, "onItemClickListener");
            clickableRectGroup.setBackingImageUrl(backingImageUrl);
            clickableRectGroup.setBackingImageLoaderListener(backingImageLoaderListener);
            clickableRectGroup.setBackingImageWidth(i2);
            clickableRectGroup.setBackingImageHeight(i);
            clickableRectGroup.setOnItemClickListener(onItemClickListener);
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.z, z);
            BindingAdaptersKt.o(this.A, z2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.G = 16L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
