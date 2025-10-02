package au.com.woolworths.shop.cart.databinding;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.foundation.shop.cart.data.model.CartPromotionInfo;
import au.com.woolworths.shop.cart.generated.callback.OnClickListener;
import au.com.woolworths.shop.cart.ui.ProductSectionItemListener;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class EpoxyCartItemPromotionInfoBindingImpl extends EpoxyCartItemPromotionInfoBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts I;
    public final ConstraintLayout E;
    public final OnClickListener F;
    public final OnClickListener G;
    public long H;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        I = includedLayouts;
        includedLayouts.a(0, new int[]{4}, new int[]{R.layout.include_horizontal_divider}, new String[]{"include_horizontal_divider"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyCartItemPromotionInfoBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, I, null);
        super(dataBindingComponent, view, (IncludeHorizontalDividerBinding) objArrT[4], (ImageView) objArrT[1], (TextView) objArrT[2], (ImageView) objArrT[3]);
        this.H = -1L;
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding = this.y;
        if (includeHorizontalDividerBinding != null) {
            includeHorizontalDividerBinding.n = this;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.E = constraintLayout;
        constraintLayout.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        E(view);
        this.F = new OnClickListener(this, 1);
        this.G = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (111 == i) {
            this.C = (CartPromotionInfo) obj;
            synchronized (this) {
                this.H |= 2;
            }
            h(111);
            y();
            return true;
        }
        if (157 != i) {
            return false;
        }
        this.D = (ProductSectionItemListener) obj;
        synchronized (this) {
            this.H |= 4;
        }
        h(157);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.cart.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        if (i == 1) {
            CartPromotionInfo cartPromotionInfo = this.C;
            ProductSectionItemListener productSectionItemListener = this.D;
            if (productSectionItemListener != null) {
                productSectionItemListener.q3(cartPromotionInfo);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        CartPromotionInfo cartPromotionInfo2 = this.C;
        ProductSectionItemListener productSectionItemListener2 = this.D;
        if (productSectionItemListener2 != null) {
            productSectionItemListener2.i6(cartPromotionInfo2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        int iN;
        boolean z;
        int iN2;
        int iN3;
        int iN4;
        String str;
        boolean z2;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        CartPromotionInfo cartPromotionInfo = this.C;
        long j2 = j & 10;
        String str2 = null;
        if (j2 != 0) {
            if (cartPromotionInfo != null) {
                str2 = cartPromotionInfo.b;
                str = cartPromotionInfo.c;
                z2 = cartPromotionInfo.f8686a;
            } else {
                z2 = false;
                str = null;
            }
            if (j2 != 0) {
                j |= z2 ? 2720L : 1360L;
            }
            z = !z2;
            ImageView imageView = this.B;
            iN2 = z2 ? ViewDataBinding.n(R.color.white, imageView) : ViewDataBinding.n(R.color.color_rewards_dark, imageView);
            ImageView imageView2 = this.z;
            iN3 = z2 ? ViewDataBinding.n(R.color.white, imageView2) : ViewDataBinding.n(R.color.color_rewards_dark, imageView2);
            ConstraintLayout constraintLayout = this.E;
            iN4 = z2 ? ViewDataBinding.n(R.color.color_rewards_dark, constraintLayout) : ViewDataBinding.n(R.color.white, constraintLayout);
            iN = z2 ? ViewDataBinding.n(R.color.white, this.A) : ViewDataBinding.n(R.color.color_rewards_dark, this.A);
        } else {
            iN = 0;
            z = false;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
            str = null;
        }
        if ((10 & j) != 0) {
            this.E.setBackground(new ColorDrawable(iN4));
            this.E.setEnabled(z);
            ImageView imageView3 = this.z;
            Intrinsics.h(imageView3, "<this>");
            imageView3.setColorFilter(iN3);
            ImageView imageView4 = this.z;
            d.z(this.z, R.drawable.ic_product_image_unavailable, imageView4, str2, AppCompatResources.b(R.drawable.ic_product_image_loading, imageView4.getContext()));
            TextViewBindingAdapter.b(this.A, str);
            this.A.setTextColor(iN);
            ImageView imageView5 = this.B;
            Intrinsics.h(imageView5, "<this>");
            imageView5.setColorFilter(iN2);
        }
        if ((j & 8) != 0) {
            this.E.setOnClickListener(this.F);
            this.B.setOnClickListener(this.G);
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.H != 0) {
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
            this.H = 8L;
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
            this.H |= 1;
        }
        return true;
    }
}
