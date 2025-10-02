package au.com.woolworths.feature.shop.barcode.scanner.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerViewModel;

/* loaded from: classes3.dex */
public abstract class ActivityBarcodeScannerBinding extends ViewDataBinding {
    public static final /* synthetic */ int F = 0;
    public final View A;
    public final Group B;
    public final Group C;
    public final Toolbar D;
    public BarcodeScannerViewModel E;
    public final FrameLayout y;
    public final Button z;

    public ActivityBarcodeScannerBinding(DataBindingComponent dataBindingComponent, View view, FrameLayout frameLayout, Button button, View view2, Group group, Group group2, Toolbar toolbar) {
        super(dataBindingComponent, view, 1);
        this.y = frameLayout;
        this.z = button;
        this.A = view2;
        this.B = group;
        this.C = group2;
        this.D = toolbar;
    }

    public abstract void L(BarcodeScannerViewModel barcodeScannerViewModel);
}
