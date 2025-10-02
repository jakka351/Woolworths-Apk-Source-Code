package au.com.woolworths.feature.shop.login.generated.callback;

import android.view.View;
import au.com.woolworths.feature.shop.login.databinding.FragmentGuestLoginBindingImpl;
import au.com.woolworths.feature.shop.login.guest.ui.fragment.GuestLoginContract;
import au.com.woolworths.feature.shop.login.guest.ui.fragment.GuestLoginViewModel;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes3.dex */
public final class OnClickListener implements View.OnClickListener {
    public final FragmentGuestLoginBindingImpl d;
    public final int e;

    public interface Listener {
    }

    public OnClickListener(FragmentGuestLoginBindingImpl fragmentGuestLoginBindingImpl, int i) {
        this.d = fragmentGuestLoginBindingImpl;
        this.e = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        GuestLoginViewModel guestLoginViewModel;
        Callback.g(view);
        try {
            FragmentGuestLoginBindingImpl fragmentGuestLoginBindingImpl = this.d;
            int i = this.e;
            if (i == 1) {
                GuestLoginViewModel guestLoginViewModel2 = fragmentGuestLoginBindingImpl.F;
                if (guestLoginViewModel2 != null) {
                    guestLoginViewModel2.e.f(GuestLoginContract.Actions.LaunchLogIn.f7458a);
                }
            } else if (i == 2) {
                GuestLoginViewModel guestLoginViewModel3 = fragmentGuestLoginBindingImpl.F;
                if (guestLoginViewModel3 != null) {
                    guestLoginViewModel3.e.f(GuestLoginContract.Actions.LaunchSignUp.f7459a);
                }
            } else if (i == 3 && (guestLoginViewModel = fragmentGuestLoginBindingImpl.F) != null) {
                guestLoginViewModel.e.f(GuestLoginContract.Actions.GuestMode.f7457a);
            }
        } finally {
            Callback.h();
        }
    }
}
