package au.com.woolworths.feature.shop.myorders.generated.callback;

import android.widget.CompoundButton;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public final class OnCheckedChangeListener implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final ViewDataBinding f7847a;

    public interface Listener {
        void c(CompoundButton compoundButton, boolean z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnCheckedChangeListener(Listener listener, int i) {
        this.f7847a = (ViewDataBinding) listener;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.databinding.ViewDataBinding, au.com.woolworths.feature.shop.myorders.generated.callback.OnCheckedChangeListener$Listener] */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f7847a.c(compoundButton, z);
    }
}
