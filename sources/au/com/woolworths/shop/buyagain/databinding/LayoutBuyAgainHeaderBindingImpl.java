package au.com.woolworths.shop.buyagain.databinding;

import androidx.databinding.ViewDataBindingKtx;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainContractLegacy;
import au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public class LayoutBuyAgainHeaderBindingImpl extends LayoutBuyAgainHeaderBinding {
    public long A;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((BuyAgainViewModelLegacy) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.buyagain.databinding.LayoutBuyAgainHeaderBinding
    public final void L(BuyAgainViewModelLegacy buyAgainViewModelLegacy) throws Throwable {
        this.z = buyAgainViewModelLegacy;
        synchronized (this) {
            this.A |= 2;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.A;
            this.A = 0L;
        }
        BuyAgainViewModelLegacy buyAgainViewModelLegacy = this.z;
        long j2 = j & 7;
        boolean z = false;
        if (j2 != 0) {
            StateFlow stateFlow = buyAgainViewModelLegacy != null ? buyAgainViewModelLegacy.m : null;
            ViewDataBindingKtx.a(this, 0, stateFlow);
            BuyAgainContractLegacy.ViewState viewState = stateFlow != null ? (BuyAgainContractLegacy.ViewState) stateFlow.getValue() : null;
            BuyAgainContractLegacy.HeaderState headerState = viewState != null ? viewState.c : null;
            str = headerState != null ? headerState.f10290a : null;
            if (str != null) {
                z = true;
            }
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, str);
            BindingAdaptersKt.o(this.y, z);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.A = 4L;
        }
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
            this.A |= 1;
        }
        return true;
    }
}
