package au.com.woolworths.shop.checkout.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager2.widget.ViewPager2;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.shop.checkout.domain.model.DeliveryNowWindow;
import au.com.woolworths.shop.checkout.domain.model.DirectToBootNowWindow;
import au.com.woolworths.shop.checkout.generated.callback.OnClickListener;
import au.com.woolworths.shop.checkout.ui.components.ItemCheckoutFulfilmentWindows;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowErrorState;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsViewModel;
import au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsSlotListener;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import com.woolworths.R;
import org.bouncycastle.asn1.BERTags;

/* loaded from: classes4.dex */
public class FragmentFulfilmentWindowsBindingImpl extends FragmentFulfilmentWindowsBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts X;
    public static final SparseIntArray Y;
    public final AppBarLayout R;
    public final IncludeHorizontalDividerBinding S;
    public final IncludeHorizontalDividerBinding T;
    public final TextView U;
    public final OnClickListener V;
    public long W;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(17);
        X = includedLayouts;
        includedLayouts.a(1, new int[]{13}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        includedLayouts.a(2, new int[]{12}, new int[]{R.layout.include_horizontal_divider}, new String[]{"include_horizontal_divider"});
        includedLayouts.a(3, new int[]{7, 8, 9, 10, 11}, new int[]{R.layout.include_inset_banner, R.layout.include_horizontal_divider, R.layout.include_checkout_delivery_now, R.layout.include_extra_info_button, R.layout.include_checkout_direct_to_boot_now}, new String[]{"include_inset_banner", "include_horizontal_divider", "include_checkout_delivery_now", "include_extra_info_button", "include_checkout_direct_to_boot_now"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        Y = sparseIntArray;
        sparseIntArray.put(R.id.view_loading, 6);
        sparseIntArray.put(R.id.component_fulfilment_windows, 14);
        sparseIntArray.put(R.id.fulfilment_window_group_tab, 15);
        sparseIntArray.put(R.id.footer_container, 16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentFulfilmentWindowsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 17, X, Y);
        super(dataBindingComponent, view, (ItemCheckoutFulfilmentWindows) objArrT[14], (IncludeGenericErrorStateBinding) objArrT[13], (ComposeView) objArrT[16], (ViewPager2) objArrT[5], (TabLayout) objArrT[15], (IncludeCheckoutDeliveryNowBinding) objArrT[9], (IncludeCheckoutDirectToBootNowBinding) objArrT[11], (IncludeExtraInfoButtonBinding) objArrT[10], (IncludeInsetBannerBinding) objArrT[7], (View) objArrT[6]);
        this.W = -1L;
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = this.z;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        this.B.setTag(null);
        IncludeCheckoutDeliveryNowBinding includeCheckoutDeliveryNowBinding = this.D;
        if (includeCheckoutDeliveryNowBinding != null) {
            includeCheckoutDeliveryNowBinding.n = this;
        }
        IncludeCheckoutDirectToBootNowBinding includeCheckoutDirectToBootNowBinding = this.E;
        if (includeCheckoutDirectToBootNowBinding != null) {
            includeCheckoutDirectToBootNowBinding.n = this;
        }
        IncludeExtraInfoButtonBinding includeExtraInfoButtonBinding = this.F;
        if (includeExtraInfoButtonBinding != null) {
            includeExtraInfoButtonBinding.n = this;
        }
        IncludeInsetBannerBinding includeInsetBannerBinding = this.G;
        if (includeInsetBannerBinding != null) {
            includeInsetBannerBinding.n = this;
        }
        ((ConstraintLayout) objArrT[0]).setTag(null);
        ((CoordinatorLayout) objArrT[1]).setTag(null);
        AppBarLayout appBarLayout = (AppBarLayout) objArrT[2];
        this.R = appBarLayout;
        appBarLayout.setTag(null);
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding = (IncludeHorizontalDividerBinding) objArrT[12];
        this.S = includeHorizontalDividerBinding;
        if (includeHorizontalDividerBinding != null) {
            includeHorizontalDividerBinding.n = this;
        }
        ((LinearLayout) objArrT[3]).setTag(null);
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding2 = (IncludeHorizontalDividerBinding) objArrT[8];
        this.T = includeHorizontalDividerBinding2;
        if (includeHorizontalDividerBinding2 != null) {
            includeHorizontalDividerBinding2.n = this;
        }
        TextView textView = (TextView) objArrT[4];
        this.U = textView;
        textView.setTag(null);
        E(view);
        this.V = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.G.D(lifecycleOwner);
        this.T.D(lifecycleOwner);
        this.D.D(lifecycleOwner);
        this.F.D(lifecycleOwner);
        this.E.D(lifecycleOwner);
        this.S.D(lifecycleOwner);
        this.z.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (276 == i) {
            S((InsetBanner) obj);
            return true;
        }
        if (224 == i) {
            Q((String) obj);
            return true;
        }
        if (157 == i) {
            P((FulfilmentWindowsSlotListener) obj);
            return true;
        }
        if (131 == i) {
            O((Boolean) obj);
            return true;
        }
        if (58 == i) {
            M((DirectToBootNowWindow) obj);
            return true;
        }
        if (55 == i) {
            L((DeliveryNowWindow) obj);
            return true;
        }
        if (76 == i) {
            N((FulfilmentWindowErrorState) obj);
            return true;
        }
        if (273 != i) {
            return false;
        }
        R((FulfilmentWindowsViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.checkout.databinding.FragmentFulfilmentWindowsBinding
    public final void L(DeliveryNowWindow deliveryNowWindow) throws Throwable {
        this.K = deliveryNowWindow;
        synchronized (this) {
            this.W |= llqqqql.c00630063c0063c0063;
        }
        h(55);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.databinding.FragmentFulfilmentWindowsBinding
    public final void M(DirectToBootNowWindow directToBootNowWindow) throws Throwable {
        this.L = directToBootNowWindow;
        synchronized (this) {
            this.W |= 512;
        }
        h(58);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.databinding.FragmentFulfilmentWindowsBinding
    public final void N(FulfilmentWindowErrorState fulfilmentWindowErrorState) throws Throwable {
        this.P = fulfilmentWindowErrorState;
        synchronized (this) {
            this.W |= llqqqql.ccc00630063c0063;
        }
        h(76);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.databinding.FragmentFulfilmentWindowsBinding
    public final void O(Boolean bool) throws Throwable {
        this.J = bool;
        synchronized (this) {
            this.W |= 256;
        }
        h(131);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.databinding.FragmentFulfilmentWindowsBinding
    public final void P(FulfilmentWindowsSlotListener fulfilmentWindowsSlotListener) throws Throwable {
        this.M = fulfilmentWindowsSlotListener;
        synchronized (this) {
            this.W |= 128;
        }
        h(157);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.databinding.FragmentFulfilmentWindowsBinding
    public final void Q(String str) throws Throwable {
        this.I = str;
        synchronized (this) {
            this.W |= 64;
        }
        h(BERTags.FLAGS);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.databinding.FragmentFulfilmentWindowsBinding
    public final void R(FulfilmentWindowsViewModel fulfilmentWindowsViewModel) throws Throwable {
        this.O = fulfilmentWindowsViewModel;
        synchronized (this) {
            this.W |= 4096;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.databinding.FragmentFulfilmentWindowsBinding
    public final void S(InsetBanner insetBanner) throws Throwable {
        this.N = insetBanner;
        synchronized (this) {
            this.W |= 32;
        }
        h(276);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.generated.callback.OnClickListener.Listener
    public final void a(int i) {
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        int i;
        boolean zB;
        long j3;
        boolean z;
        long j4;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        synchronized (this) {
            j = this.W;
            this.W = 0L;
        }
        InsetBanner insetBanner = this.N;
        String str = this.I;
        FulfilmentWindowsSlotListener fulfilmentWindowsSlotListener = this.M;
        Boolean bool = this.J;
        DirectToBootNowWindow directToBootNowWindow = this.L;
        DeliveryNowWindow deliveryNowWindow = this.K;
        FulfilmentWindowErrorState fulfilmentWindowErrorState = this.P;
        FulfilmentWindowsViewModel fulfilmentWindowsViewModel = this.O;
        boolean z4 = ((j & 8224) == 0 || insetBanner == null) ? false : true;
        long j5 = j & 8448;
        if (j5 != 0) {
            zB = ViewDataBinding.B(bool);
            if (j5 != 0) {
                j |= zB ? llqqqql.ccccc00630063 : llqqqql.c0063006300630063c0063;
            }
            i = zB ? 8 : 0;
            j2 = 0;
        } else {
            j2 = 0;
            i = 0;
            zB = false;
        }
        int i4 = ((j & 8704) > j2 ? 1 : ((j & 8704) == j2 ? 0 : -1));
        if (i4 != 0) {
            z = directToBootNowWindow != null;
            j3 = 8224;
        } else {
            j3 = 8224;
            z = false;
        }
        long j6 = j & 9216;
        if (j6 != j2) {
            long j7 = j;
            z2 = deliveryNowWindow != null;
            j4 = j7;
        } else {
            j4 = j;
            z2 = false;
        }
        int i5 = ((j4 & 10240) > j2 ? 1 : ((j4 & 10240) == j2 ? 0 : -1));
        if (i5 != 0) {
            i2 = i5;
            z3 = fulfilmentWindowErrorState != null;
        } else {
            i2 = i5;
            z3 = false;
        }
        long j8 = j4 & 12288;
        if (i2 != 0) {
            i3 = i4;
            BindingAdaptersKt.o(this.z.h, z3);
            this.z.M(fulfilmentWindowErrorState);
        } else {
            i3 = i4;
        }
        if (j8 != j2) {
            this.z.L(fulfilmentWindowsViewModel);
        }
        if ((j4 & 8448) != j2) {
            this.B.setVisibility(i);
            this.R.setVisibility(i);
            BindingAdaptersKt.o(this.H, zB);
        }
        if (j6 != j2) {
            this.D.L(deliveryNowWindow);
            BindingAdaptersKt.o(this.D.h, z2);
        }
        if ((j4 & 8320) != j2) {
            this.D.M(fulfilmentWindowsSlotListener);
            this.E.M(fulfilmentWindowsSlotListener);
        }
        if (i3 != 0) {
            this.E.L(directToBootNowWindow);
            BindingAdaptersKt.o(this.E.h, z);
        }
        if ((j4 & j3) != j2) {
            this.G.L(insetBanner);
            BindingAdaptersKt.o(this.G.h, z4);
        }
        if ((j4 & 8256) != j2) {
            TextViewBindingAdapter.b(this.U, str);
        }
        if ((j4 & 8192) != j2) {
            this.H.setOnClickListener(this.V);
        }
        this.G.k();
        this.T.k();
        this.D.k();
        this.F.k();
        this.E.k();
        this.S.k();
        this.z.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.W != 0) {
                    return true;
                }
                return this.G.p() || this.T.p() || this.D.p() || this.F.p() || this.E.p() || this.S.p() || this.z.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.W = 8192L;
        }
        this.G.r();
        this.T.r();
        this.D.r();
        this.F.r();
        this.E.r();
        this.S.r();
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
                this.W |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.W |= 2;
            }
            return true;
        }
        if (i == 2) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.W |= 4;
            }
            return true;
        }
        if (i == 3) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.W |= 8;
            }
            return true;
        }
        if (i != 4) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.W |= 16;
        }
        return true;
    }
}
