package au.com.woolworths.feature.shop.login.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBindingKtx;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.login.generated.callback.OnClickListener;
import au.com.woolworths.feature.shop.login.guest.ui.fragment.GuestLoginViewModel;
import com.woolworths.R;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes3.dex */
public class FragmentGuestLoginBindingImpl extends FragmentGuestLoginBinding implements OnClickListener.Listener {
    public static final SparseIntArray L;
    public final OnClickListener H;
    public final OnClickListener I;
    public final OnClickListener J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.guest_message_left_guideline, 5);
        sparseIntArray.put(R.id.guest_message_right_guideline, 6);
        sparseIntArray.put(R.id.guest_actions_button_left_guideline, 7);
        sparseIntArray.put(R.id.guest_actions_button_right_guideline, 8);
        sparseIntArray.put(R.id.login_image_view, 9);
        sparseIntArray.put(R.id.guest_title, 10);
        sparseIntArray.put(R.id.message_body, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentGuestLoginBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 12, null, L);
        Button button = (Button) objArrT[4];
        super(dataBindingComponent, view, button, (TextView) objArrT[10], (TextView) objArrT[3], (Button) objArrT[1], (ImageView) objArrT[9], (TextView) objArrT[11], (Button) objArrT[2]);
        this.K = -1L;
        this.y.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.E.setTag(null);
        E(view);
        this.H = new OnClickListener(this, 3);
        this.I = new OnClickListener(this, 1);
        this.J = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((GuestLoginViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.login.databinding.FragmentGuestLoginBinding
    public final void L(GuestLoginViewModel guestLoginViewModel) throws Throwable {
        this.F = guestLoginViewModel;
        synchronized (this) {
            this.K |= 2;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.K;
            this.K = 0L;
        }
        GuestLoginViewModel guestLoginViewModel = this.F;
        long j2 = 7 & j;
        if (j2 != 0) {
            StateFlow stateFlow = guestLoginViewModel != null ? guestLoginViewModel.h : null;
            ViewDataBindingKtx.a(this, 0, stateFlow);
            if (stateFlow != null) {
            }
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.y, false);
            BindingAdaptersKt.o(this.A, false);
        }
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.H);
            this.B.setOnClickListener(this.I);
            this.E.setOnClickListener(this.J);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.K = 4L;
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
            this.K |= 1;
        }
        return true;
    }
}
