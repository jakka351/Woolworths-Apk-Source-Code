package au.com.woolworths.product.details.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.product.details.ProductDetailsClickHandler;
import au.com.woolworths.product.details.generated.callback.OnClickListener;
import au.com.woolworths.product.details.models.ProductImage;
import au.com.woolworths.product.details.models.ProductImageExtKt;
import au.com.woolworths.product.details.ui.ProductImageLoaderListener;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemProductImageBindingImpl extends EpoxyItemProductImageBinding implements OnClickListener.Listener {
    public static final SparseIntArray G;
    public final ConstraintLayout D;
    public final OnClickListener E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.loading_spinner, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemProductImageBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, G);
        super(dataBindingComponent, view, (ContentLoadingProgressBar) objArrT[2], (ImageView) objArrT[1]);
        this.F = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.D = constraintLayout;
        constraintLayout.setTag(null);
        this.z.setTag(null);
        E(view);
        this.E = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (35 == i) {
            this.B = (ProductDetailsClickHandler) obj;
            synchronized (this) {
                this.F |= 1;
            }
            h(35);
            y();
            return true;
        }
        if (106 == i) {
            this.C = (ProductImageLoaderListener) obj;
            synchronized (this) {
                this.F |= 2;
            }
            h(106);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.A = (ProductImage) obj;
        synchronized (this) {
            this.F |= 4;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.product.details.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ProductDetailsClickHandler productDetailsClickHandler = this.B;
        ProductImage productImage = this.A;
        if (productDetailsClickHandler != null) {
            productDetailsClickHandler.X5(productImage);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        int i;
        String str;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        ProductImageLoaderListener productImageLoaderListener = this.C;
        ProductImage productImage = this.A;
        int i2 = ((14 & j) > 0L ? 1 : ((14 & j) == 0L ? 0 : -1));
        if (i2 != 0) {
            String largeUrl = productImage != null ? productImage.getLargeUrl() : null;
            contentDescription = (j & 12) != 0 ? ProductImageExtKt.getContentDescription(productImage) : null;
            i = i2;
            str = largeUrl;
        } else {
            i = i2;
            str = null;
        }
        if ((8 & j) != 0) {
            this.D.setOnClickListener(this.E);
        }
        if ((j & 12) != 0 && ViewDataBinding.s >= 4) {
            this.z.setContentDescription(contentDescription);
        }
        if (i != 0) {
            ImageView imageView = this.z;
            BindingAdaptersKt.i(imageView, str, null, AppCompatResources.b(R.drawable.ic_product_image_unavailable, imageView.getContext()), productImageLoaderListener, 96);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.F = 8L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
