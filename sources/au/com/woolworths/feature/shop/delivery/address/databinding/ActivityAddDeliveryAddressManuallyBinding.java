package au.com.woolworths.feature.shop.delivery.address.databinding;

import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyViewModel;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public abstract class ActivityAddDeliveryAddressManuallyBinding extends ViewDataBinding {
    public final TextInputLayout A;
    public final TextInputEditText B;
    public final TextInputEditText C;
    public final AutoCompleteTextView D;
    public final TextInputLayout E;
    public final Toolbar F;
    public AddDeliveryAddressManuallyViewModel G;
    public final Button y;
    public final TextInputEditText z;

    public ActivityAddDeliveryAddressManuallyBinding(DataBindingComponent dataBindingComponent, View view, Button button, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, AutoCompleteTextView autoCompleteTextView, TextInputLayout textInputLayout2, Toolbar toolbar) {
        super(dataBindingComponent, view, 1);
        this.y = button;
        this.z = textInputEditText;
        this.A = textInputLayout;
        this.B = textInputEditText2;
        this.C = textInputEditText3;
        this.D = autoCompleteTextView;
        this.E = textInputLayout2;
        this.F = toolbar;
    }

    public abstract void L(AddDeliveryAddressManuallyViewModel addDeliveryAddressManuallyViewModel);
}
