package au.com.woolworths.product.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.product.generated.callback.OnClickListener;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetListener;
import au.com.woolworths.views.BottomSheetWithHandle;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class FragmentProductMessageBottomSheetBindingImpl extends FragmentProductMessageBottomSheetBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts N;
    public static final SparseIntArray O;
    public final OnClickListener L;
    public long M;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(10);
        N = includedLayouts;
        includedLayouts.a(1, new int[]{4, 5}, new int[]{R.layout.layout_product_info, R.layout.include_horizontal_divider}, new String[]{"layout_product_info", "include_horizontal_divider"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.begin_guide_line, 6);
        sparseIntArray.put(R.id.end_guide_line, 7);
        sparseIntArray.put(R.id.title_text_view, 8);
        sparseIntArray.put(R.id.overlay_view, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentProductMessageBottomSheetBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 10, N, O);
        Button button = (Button) objArrT[3];
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding = (IncludeHorizontalDividerBinding) objArrT[5];
        super(dataBindingComponent, view, button, includeHorizontalDividerBinding, (LayoutProductInfoBinding) objArrT[4], (FrameLayout) objArrT[9], (TextView) objArrT[2], (ComposeView) objArrT[8]);
        this.M = -1L;
        this.y.setTag(null);
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding2 = this.z;
        if (includeHorizontalDividerBinding2 != null) {
            includeHorizontalDividerBinding2.n = this;
        }
        LayoutProductInfoBinding layoutProductInfoBinding = this.A;
        if (layoutProductInfoBinding != null) {
            layoutProductInfoBinding.n = this;
        }
        ((BottomSheetWithHandle) objArrT[0]).setTag(null);
        ((ConstraintLayout) objArrT[1]).setTag(null);
        this.C.setTag(null);
        E(view);
        this.L = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.A.D(lifecycleOwner);
        this.z.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (207 == i) {
            O((ProductCardConfig) obj);
            return true;
        }
        if (272 == i) {
            Q((ProductMessageBottomSheetListener) obj);
            return true;
        }
        if (132 == i) {
            M(((Boolean) obj).booleanValue());
            return true;
        }
        if (171 == i) {
            N((String) obj);
            return true;
        }
        if (100 == i) {
            this.E = (Screen) obj;
            return true;
        }
        if (208 != i) {
            return false;
        }
        P((ProductCard) obj);
        return true;
    }

    @Override // au.com.woolworths.product.databinding.FragmentProductMessageBottomSheetBinding
    public final void L(Screen screen) {
        this.E = screen;
    }

    @Override // au.com.woolworths.product.databinding.FragmentProductMessageBottomSheetBinding
    public final void M(boolean z) throws Throwable {
        this.J = z;
        synchronized (this) {
            this.M |= 16;
        }
        h(132);
        y();
    }

    @Override // au.com.woolworths.product.databinding.FragmentProductMessageBottomSheetBinding
    public final void N(String str) throws Throwable {
        this.H = str;
        synchronized (this) {
            this.M |= 32;
        }
        h(171);
        y();
    }

    @Override // au.com.woolworths.product.databinding.FragmentProductMessageBottomSheetBinding
    public final void O(ProductCardConfig productCardConfig) throws Throwable {
        this.F = productCardConfig;
        synchronized (this) {
            this.M |= 4;
        }
        h(207);
        y();
    }

    @Override // au.com.woolworths.product.databinding.FragmentProductMessageBottomSheetBinding
    public final void P(ProductCard productCard) throws Throwable {
        this.G = productCard;
        synchronized (this) {
            this.M |= 128;
        }
        h(208);
        y();
    }

    @Override // au.com.woolworths.product.databinding.FragmentProductMessageBottomSheetBinding
    public final void Q(ProductMessageBottomSheetListener productMessageBottomSheetListener) throws Throwable {
        this.I = productMessageBottomSheetListener;
        synchronized (this) {
            this.M |= 8;
        }
        h(272);
        y();
    }

    @Override // au.com.woolworths.product.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ProductMessageBottomSheetListener productMessageBottomSheetListener = this.I;
        if (productMessageBottomSheetListener != null) {
            productMessageBottomSheetListener.k();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.M;
            this.M = 0L;
        }
        ProductCardConfig productCardConfig = this.F;
        boolean z = this.J;
        String str = this.H;
        ProductCard productCard = this.G;
        long j2 = 260 & j;
        long j3 = 272 & j;
        long j4 = 288 & j;
        long j5 = 384 & j;
        if ((j & 256) != 0) {
            this.y.setOnClickListener(this.L);
            this.A.M(true);
        }
        if (j2 != 0) {
            this.A.O(productCardConfig);
        }
        if (j5 != 0) {
            this.A.P(productCard);
        }
        if (j3 != 0) {
            this.A.N(z);
        }
        if (j4 != 0) {
            TextViewBindingAdapter.b(this.C, str);
        }
        this.A.k();
        this.z.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.M != 0) {
                    return true;
                }
                return this.A.p() || this.z.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.M = 256L;
        }
        this.A.r();
        this.z.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.M |= 1;
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.M |= 2;
        }
        return true;
    }
}
