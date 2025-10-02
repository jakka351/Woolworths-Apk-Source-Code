package au.com.woolworths.feature.shop.imagegallery.databinding;

import android.net.Uri;
import au.com.woolworths.feature.shop.imagegallery.ImageProgressIndicator;
import com.github.piasy.biv.view.BigImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class ItemCarouselImageBindingImpl extends ItemCarouselImageBinding {
    public long B;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (107 != i) {
            return false;
        }
        L((String) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.imagegallery.databinding.ItemCarouselImageBinding
    public final void L(String str) throws Throwable {
        this.z = str;
        synchronized (this) {
            this.B |= 1;
        }
        h(107);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        String productImageUrl = this.z;
        if ((j & 3) != 0) {
            BigImageView imageView = this.y;
            Intrinsics.h(imageView, "imageView");
            Intrinsics.h(productImageUrl, "productImageUrl");
            imageView.showImage(Uri.parse(productImageUrl));
            imageView.setProgressIndicator(new ImageProgressIndicator());
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.B = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
