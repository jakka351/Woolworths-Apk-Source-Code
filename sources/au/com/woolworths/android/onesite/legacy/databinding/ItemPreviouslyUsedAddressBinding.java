package au.com.woolworths.android.onesite.legacy.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.PreviouslyUsedAddressItemEventHandler;

/* loaded from: classes3.dex */
public abstract class ItemPreviouslyUsedAddressBinding extends ViewDataBinding {
    public static final /* synthetic */ int D = 0;
    public final Button A;
    public final ConstraintLayout B;
    public PreviouslyUsedAddressItemEventHandler C;
    public final TextView y;
    public final ProgressBar z;

    public ItemPreviouslyUsedAddressBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, ProgressBar progressBar, Button button, ConstraintLayout constraintLayout) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = progressBar;
        this.A = button;
        this.B = constraintLayout;
    }

    public abstract void L(PreviouslyUsedAddressItemEventHandler previouslyUsedAddressItemEventHandler);
}
