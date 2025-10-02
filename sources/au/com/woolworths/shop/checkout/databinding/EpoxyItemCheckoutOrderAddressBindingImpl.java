package au.com.woolworths.shop.checkout.databinding;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.shop.checkout.domain.model.address.OrderAddress;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemCheckoutOrderAddressBindingImpl extends EpoxyItemCheckoutOrderAddressBinding {
    public static final ViewDataBinding.IncludedLayouts H;
    public long G;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        H = includedLayouts;
        includedLayouts.a(0, new int[]{5}, new int[]{R.layout.include_inset_banner}, new String[]{"include_inset_banner"});
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (86 == i) {
            this.F = (String) obj;
            synchronized (this) {
                this.G |= 2;
            }
            h(86);
            y();
            return true;
        }
        if (118 == i) {
            this.E = (InsetBannerData) obj;
            synchronized (this) {
                this.G |= 4;
            }
            h(118);
            y();
            return true;
        }
        if (4 != i) {
            return false;
        }
        this.D = (OrderAddress) obj;
        synchronized (this) {
            this.G |= 8;
        }
        h(4);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String str2;
        Drawable drawable;
        String f10642a;
        String c;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        String str3 = this.F;
        InsetBannerData insetBannerData = this.E;
        OrderAddress orderAddress = this.D;
        long j2 = 18 & j;
        long j3 = 20 & j;
        int iB = 0;
        boolean z = (j3 == 0 || insetBannerData == null) ? false : true;
        long j4 = j & 24;
        String b = null;
        if (j4 != 0) {
            if (orderAddress != null) {
                b = orderAddress.getB();
                f10642a = orderAddress.getF10642a();
                iB = orderAddress.b();
                c = orderAddress.getC();
            } else {
                f10642a = null;
                c = null;
            }
            drawable = this.h.getContext().getDrawable(iB);
            String str4 = f10642a;
            str = b;
            b = c;
            str2 = str4;
        } else {
            str = null;
            str2 = null;
            drawable = null;
        }
        if (j4 != 0) {
            TextViewBindingAdapter.b(this.y, b);
            ImageView imageView = this.A;
            BindingAdaptersKt.g(imageView, str, AppCompatResources.b(R.drawable.ic_circle_gray_placeholder, imageView.getContext()), drawable);
            TextViewBindingAdapter.b(this.C, str2);
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.z, str3);
            BindingAdaptersKt.n(this.z, str3);
        }
        if (j3 != 0) {
            this.B.L(insetBannerData);
            BindingAdaptersKt.o(this.B.h, z);
        }
        this.B.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.G != 0) {
                    return true;
                }
                return this.B.p();
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
        this.B.r();
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
            this.G |= 1;
        }
        return true;
    }
}
