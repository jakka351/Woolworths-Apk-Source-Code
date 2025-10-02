package au.com.woolworths.shop.buyagain.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBindingKtx;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainContractLegacy;
import au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy;
import com.woolworths.R;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public class FragmentBuyAgainBindingImpl extends FragmentBuyAgainBinding {
    public static final ViewDataBinding.IncludedLayouts F;
    public static final SparseIntArray G;
    public long E;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        F = includedLayouts;
        includedLayouts.a(0, new int[]{4}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        includedLayouts.a(1, new int[]{3}, new int[]{R.layout.layout_buy_again_header}, new String[]{"layout_buy_again_header"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.appbar, 5);
        sparseIntArray.put(R.id.toolbar, 6);
        sparseIntArray.put(R.id.product_list, 7);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.y.D(lifecycleOwner);
        this.z.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((BuyAgainViewModelLegacy) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.buyagain.databinding.FragmentBuyAgainBinding
    public final void L(BuyAgainViewModelLegacy buyAgainViewModelLegacy) throws Throwable {
        this.D = buyAgainViewModelLegacy;
        synchronized (this) {
            this.E |= 8;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        FullPageErrorCause fullPageErrorCause;
        BuyAgainContractLegacy.FooterState footerState;
        boolean z;
        BuyAgainContractLegacy.FooterState footerState2;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        BuyAgainViewModelLegacy buyAgainViewModelLegacy = this.D;
        long j2 = 25 & j;
        FullPageErrorCause fullPageErrorCause2 = null;
        if (j2 != 0) {
            StateFlow stateFlow = buyAgainViewModelLegacy != null ? buyAgainViewModelLegacy.m : null;
            ViewDataBindingKtx.a(this, 0, stateFlow);
            BuyAgainContractLegacy.ViewState viewState = stateFlow != null ? (BuyAgainContractLegacy.ViewState) stateFlow.getValue() : null;
            if (viewState != null) {
                fullPageErrorCause2 = viewState.g;
                footerState2 = viewState.d;
            } else {
                footerState2 = null;
            }
            boolean z2 = fullPageErrorCause2 != null;
            FullPageErrorCause fullPageErrorCause3 = fullPageErrorCause2;
            z = footerState2 != null ? footerState2.f10289a : false;
            z = z2;
            footerState = footerState2;
            fullPageErrorCause = fullPageErrorCause3;
        } else {
            fullPageErrorCause = null;
            footerState = null;
            z = false;
        }
        if ((j & 24) != 0) {
            this.y.L(buyAgainViewModelLegacy);
            this.z.L(buyAgainViewModelLegacy);
            this.A.setBuyAgainFooterListener(buyAgainViewModelLegacy);
        }
        if (j2 != 0) {
            this.z.M(fullPageErrorCause);
            BindingAdaptersKt.o(this.z.h, z);
            this.A.setFooterState(footerState);
            BindingAdaptersKt.o(this.A, z);
        }
        this.y.k();
        this.z.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.E != 0) {
                    return true;
                }
                return this.y.p() || this.z.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.E = 16L;
        }
        this.y.r();
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
                this.E |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.E |= 2;
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 4;
        }
        return true;
    }
}
