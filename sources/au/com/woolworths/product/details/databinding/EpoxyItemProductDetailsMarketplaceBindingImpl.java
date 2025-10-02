package au.com.woolworths.product.details.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.product.details.ProductDetailsClickHandler;
import au.com.woolworths.product.details.generated.callback.OnClickListener;
import au.com.woolworths.product.details.models.ProductDetailsMarketplace;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemProductDetailsMarketplaceBindingImpl extends EpoxyItemProductDetailsMarketplaceBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts J;
    public final OnClickListener G;
    public final OnClickListener H;
    public long I;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        J = includedLayouts;
        includedLayouts.a(0, new int[]{6}, new int[]{R.layout.include_horizontal_divider}, new String[]{"include_horizontal_divider"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemProductDetailsMarketplaceBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 7, J, null);
        super(dataBindingComponent, view, (IncludeHorizontalDividerBinding) objArrT[6], (TextView) objArrT[4], (ImageView) objArrT[1], (ImageButton) objArrT[5], (TextView) objArrT[3], (Button) objArrT[2]);
        this.I = -1L;
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding = this.y;
        if (includeHorizontalDividerBinding != null) {
            includeHorizontalDividerBinding.n = this;
        }
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        E(view);
        this.G = new OnClickListener(this, 2);
        this.H = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (35 == i) {
            this.F = (ProductDetailsClickHandler) obj;
            synchronized (this) {
                this.I |= 2;
            }
            h(35);
            y();
            return true;
        }
        if (168 != i) {
            return false;
        }
        this.E = (ProductDetailsMarketplace) obj;
        synchronized (this) {
            this.I |= 4;
        }
        h(168);
        y();
        return true;
    }

    @Override // au.com.woolworths.product.details.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        if (i == 1) {
            ProductDetailsClickHandler productDetailsClickHandler = this.F;
            ProductDetailsMarketplace productDetailsMarketplace = this.E;
            if (productDetailsClickHandler == null || productDetailsMarketplace == null) {
                return;
            }
            productDetailsClickHandler.z0(productDetailsMarketplace.getSellerName(), productDetailsMarketplace.getChannel(), productDetailsMarketplace.getFacet());
            return;
        }
        if (i != 2) {
            return;
        }
        ProductDetailsClickHandler productDetailsClickHandler2 = this.F;
        ProductDetailsMarketplace productDetailsMarketplace2 = this.E;
        if (productDetailsClickHandler2 == null || productDetailsMarketplace2 == null) {
            return;
        }
        productDetailsClickHandler2.g4(productDetailsMarketplace2.getInfo());
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String imageUrl;
        String str;
        String title;
        String sellerName;
        String dispatchNote;
        InfoSection info;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        ProductDetailsMarketplace productDetailsMarketplace = this.E;
        long j2 = 12 & j;
        if (j2 != 0) {
            if (productDetailsMarketplace != null) {
                dispatchNote = productDetailsMarketplace.getDispatchNote();
                title = productDetailsMarketplace.getTitle();
                info = productDetailsMarketplace.getInfo();
                sellerName = productDetailsMarketplace.getSellerName();
                imageUrl = productDetailsMarketplace.getImageUrl();
            } else {
                imageUrl = null;
                dispatchNote = null;
                title = null;
                info = null;
                sellerName = null;
            }
            title = info != null ? info.getTitle() : null;
            z = info == null;
            String str2 = dispatchNote;
            str = title;
            title = str2;
        } else {
            imageUrl = null;
            str = null;
            title = null;
            sellerName = null;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.z, title);
            ImageView imageView = this.A;
            BindingAdaptersKt.f(imageView, imageUrl, AppCompatResources.b(R.drawable.ic_everyday_market_logo_small, imageView.getContext()));
            BindingAdaptersKt.j(this.B, z);
            TextViewBindingAdapter.b(this.C, title);
            TextViewBindingAdapter.b(this.D, sellerName);
            if (ViewDataBinding.s >= 4) {
                this.B.setContentDescription(str);
            }
        }
        if ((j & 8) != 0) {
            this.B.setOnClickListener(this.G);
            this.D.setOnClickListener(this.H);
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.I != 0) {
                    return true;
                }
                return this.y.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.I = 8L;
        }
        this.y.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.I |= 1;
        }
        return true;
    }
}
