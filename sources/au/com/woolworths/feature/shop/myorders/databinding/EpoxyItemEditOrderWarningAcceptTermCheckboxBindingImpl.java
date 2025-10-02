package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionEventHandler;
import au.com.woolworths.feature.shop.myorders.generated.callback.OnCheckedChangeListener;

/* loaded from: classes3.dex */
public class EpoxyItemEditOrderWarningAcceptTermCheckboxBindingImpl extends EpoxyItemEditOrderWarningAcceptTermCheckboxBinding implements OnCheckedChangeListener.Listener {
    public final FrameLayout A;
    public final AppCompatCheckBox B;
    public final OnCheckedChangeListener C;
    public long D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyItemEditOrderWarningAcceptTermCheckboxBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
        this.D = -1L;
        FrameLayout frameLayout = (FrameLayout) objArrT[0];
        this.A = frameLayout;
        frameLayout.setTag(null);
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) objArrT[1];
        this.B = appCompatCheckBox;
        appCompatCheckBox.setTag(null);
        E(view);
        this.C = new OnCheckedChangeListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (92 == i) {
            this.z = (EditOrderConditionEventHandler) obj;
            synchronized (this) {
                this.D |= 1;
            }
            h(92);
            y();
            return true;
        }
        if (34 != i) {
            return false;
        }
        this.y = (String) obj;
        synchronized (this) {
            this.D |= 2;
        }
        h(34);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.OnCheckedChangeListener.Listener
    public final void c(CompoundButton compoundButton, boolean z) {
        EditOrderConditionEventHandler editOrderConditionEventHandler = this.z;
        if (editOrderConditionEventHandler != null) {
            editOrderConditionEventHandler.N5(z);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        String str = this.y;
        if ((6 & j) != 0) {
            TextViewBindingAdapter.b(this.B, str);
        }
        if ((j & 4) != 0) {
            this.B.setOnCheckedChangeListener(this.C);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.D = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
