package au.com.woolworths.base.wallet.databinding;

import android.view.View;
import android.widget.Button;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.wallet.ocr.OverlayClickHandler;
import com.google.android.material.appbar.MaterialToolbar;

/* loaded from: classes3.dex */
public abstract class FragmentRewardsWalletOcrOverlayBinding extends ViewDataBinding {
    public static final /* synthetic */ int D = 0;
    public final Button A;
    public final MaterialToolbar B;
    public OverlayClickHandler C;
    public final View y;
    public final View z;

    public FragmentRewardsWalletOcrOverlayBinding(DataBindingComponent dataBindingComponent, View view, View view2, View view3, Button button, MaterialToolbar materialToolbar) {
        super(dataBindingComponent, view, 0);
        this.y = view2;
        this.z = view3;
        this.A = button;
        this.B = materialToolbar;
    }

    public abstract void L(OverlayClickHandler overlayClickHandler);
}
