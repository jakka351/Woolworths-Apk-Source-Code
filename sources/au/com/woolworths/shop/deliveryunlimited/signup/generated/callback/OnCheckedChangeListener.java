package au.com.woolworths.shop.deliveryunlimited.signup.generated.callback;

import android.widget.CompoundButton;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes4.dex */
public final class OnCheckedChangeListener implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final ViewDataBinding f10875a;

    public interface Listener {
        void c(CompoundButton compoundButton, boolean z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnCheckedChangeListener(Listener listener) {
        this.f10875a = (ViewDataBinding) listener;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.databinding.ViewDataBinding, au.com.woolworths.shop.deliveryunlimited.signup.generated.callback.OnCheckedChangeListener$Listener] */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f10875a.c(compoundButton, z);
    }
}
