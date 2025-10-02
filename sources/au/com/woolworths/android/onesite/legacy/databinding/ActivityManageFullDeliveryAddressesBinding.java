package au.com.woolworths.android.onesite.legacy.databinding;

import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressEventHandler;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes3.dex */
public abstract class ActivityManageFullDeliveryAddressesBinding extends ViewDataBinding {
    public final TextView A;
    public final RecyclerView B;
    public final ScrollView C;
    public final Toolbar D;
    public ManageFullDeliveryAddressEventHandler E;
    public final FloatingActionButton y;
    public final TextView z;

    public ActivityManageFullDeliveryAddressesBinding(DataBindingComponent dataBindingComponent, View view, FloatingActionButton floatingActionButton, TextView textView, TextView textView2, RecyclerView recyclerView, ScrollView scrollView, Toolbar toolbar) {
        super(dataBindingComponent, view, 0);
        this.y = floatingActionButton;
        this.z = textView;
        this.A = textView2;
        this.B = recyclerView;
        this.C = scrollView;
        this.D = toolbar;
    }

    public abstract void L(ManageFullDeliveryAddressEventHandler manageFullDeliveryAddressEventHandler);
}
