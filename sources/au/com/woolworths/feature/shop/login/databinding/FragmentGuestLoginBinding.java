package au.com.woolworths.feature.shop.login.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.login.guest.ui.fragment.GuestLoginViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentGuestLoginBinding extends ViewDataBinding {
    public static final /* synthetic */ int G = 0;
    public final TextView A;
    public final Button B;
    public final ImageView C;
    public final TextView D;
    public final Button E;
    public GuestLoginViewModel F;
    public final Button y;
    public final TextView z;

    public FragmentGuestLoginBinding(DataBindingComponent dataBindingComponent, View view, Button button, TextView textView, TextView textView2, Button button2, ImageView imageView, TextView textView3, Button button3) {
        super(dataBindingComponent, view, 1);
        this.y = button;
        this.z = textView;
        this.A = textView2;
        this.B = button2;
        this.C = imageView;
        this.D = textView3;
        this.E = button3;
    }

    public abstract void L(GuestLoginViewModel guestLoginViewModel);
}
