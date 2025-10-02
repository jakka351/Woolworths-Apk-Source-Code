package au.com.woolworths.foundation.shop.editorder.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderBanner;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderDetails;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderStatus;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderStatusKt;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class IncludeEditOrderBannerBindingImpl extends IncludeEditOrderBannerBinding {
    public final ConstraintLayout E;
    public long F;

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeEditOrderBannerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, null, null);
        TextView textView = (TextView) objArrT[3];
        super(view, (Button) objArrT[4], (ImageView) objArrT[1], textView, (TextView) objArrT[2], dataBindingComponent);
        this.F = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.E = constraintLayout;
        constraintLayout.setTag(null);
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (53 != i) {
            return false;
        }
        L((EditOrderStatus) obj);
        return true;
    }

    @Override // au.com.woolworths.foundation.shop.editorder.databinding.IncludeEditOrderBannerBinding
    public final void L(EditOrderStatus editOrderStatus) throws Throwable {
        this.C = editOrderStatus;
        synchronized (this) {
            this.F |= 1;
        }
        h(53);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean zA;
        int i;
        String buttonTitle;
        String title;
        String message;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        EditOrderStatus editOrderStatus = this.C;
        long j2 = j & 3;
        if (j2 != 0) {
            EditOrderDetails details = editOrderStatus != null ? editOrderStatus.getDetails() : null;
            zA = EditOrderStatusKt.a(editOrderStatus);
            EditOrderBanner banner = details != null ? details.getBanner() : null;
            if (banner != null) {
                title = banner.getTitle();
                message = banner.getMessage();
                buttonTitle = banner.getButtonTitle();
            } else {
                buttonTitle = null;
                title = null;
                message = null;
            }
            z = buttonTitle == null;
            i = R.drawable.ic_pulse_animation;
            if (j2 != 0) {
                j |= z ? 8L : 4L;
            }
        } else {
            zA = false;
            i = 0;
            buttonTitle = null;
            title = null;
            message = null;
        }
        long j3 = j & 3;
        String string = j3 != 0 ? z ? this.A.getResources().getString(R.string.stop) : buttonTitle : null;
        if (j3 != 0) {
            BindingAdaptersKt.o(this.E, zA);
            TextViewBindingAdapter.b(this.y, message);
            BindingAdaptersKt.u(this.z, i);
            TextViewBindingAdapter.b(this.A, string);
            TextViewBindingAdapter.b(this.B, title);
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
            this.F = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
