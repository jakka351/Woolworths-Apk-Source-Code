package au.com.woolworths.shop.digipay.databinding;

import android.view.View;
import android.widget.Button;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.digipay.creditcard.CardCaptureViewEventHandler;

/* loaded from: classes4.dex */
public abstract class IncludeDigipayCardCaptureErrorStateBinding extends ViewDataBinding {
    public final Button y;
    public CardCaptureViewEventHandler z;

    public IncludeDigipayCardCaptureErrorStateBinding(DataBindingComponent dataBindingComponent, View view, Button button) {
        super(dataBindingComponent, view, 0);
        this.y = button;
    }

    public abstract void L(CardCaptureViewEventHandler cardCaptureViewEventHandler);
}
