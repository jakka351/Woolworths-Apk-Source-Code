package au.com.woolworths.shop.deliveryunlimited.signup.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.TermItemUiModel;
import au.com.woolworths.shop.deliveryunlimited.signup.generated.callback.OnCheckedChangeListener;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentViewModel;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemDeliveryUnlimitedSignUpTermsAndConditionsBindingImpl extends EpoxyItemDeliveryUnlimitedSignUpTermsAndConditionsBinding implements OnCheckedChangeListener.Listener {
    public static final SparseIntArray D;
    public final OnCheckedChangeListener B;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.terms_label, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemDeliveryUnlimitedSignUpTermsAndConditionsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, D);
        CheckBox checkBox = (CheckBox) objArrT[1];
        super(dataBindingComponent, view, checkBox);
        this.C = -1L;
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.y.setTag(null);
        E(view);
        this.B = new OnCheckedChangeListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 == i) {
            this.A = (PaymentViewModel) obj;
            synchronized (this) {
                this.C |= 1;
            }
            h(273);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.z = (TermItemUiModel) obj;
        synchronized (this) {
            this.C |= 2;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.deliveryunlimited.signup.generated.callback.OnCheckedChangeListener.Listener
    public final void c(CompoundButton compoundButton, boolean z) {
        PaymentViewModel paymentViewModel = this.A;
        TermItemUiModel termItemUiModel = this.z;
        if (paymentViewModel != null) {
            paymentViewModel.v6(termItemUiModel, z);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        TermItemUiModel termItemUiModel = this.z;
        long j2 = 6 & j;
        boolean z = (j2 == 0 || termItemUiModel == null) ? false : termItemUiModel.c;
        if (j2 != 0) {
            CompoundButtonBindingAdapter.a(this.y, z);
        }
        if ((j & 4) != 0) {
            this.y.setOnCheckedChangeListener(this.B);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.C = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
