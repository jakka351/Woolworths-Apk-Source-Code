package au.com.woolworths.feature.shop.onboarding.generated.callback;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes3.dex */
public final class OnClickListener implements View.OnClickListener {
    public final ViewDataBinding d;

    public interface Listener {
        void a(int i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnClickListener(Listener listener) {
        this.d = (ViewDataBinding) listener;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.databinding.ViewDataBinding, au.com.woolworths.feature.shop.onboarding.generated.callback.OnClickListener$Listener] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Callback.g(view);
        try {
            this.d.a(1);
        } finally {
            Callback.h();
        }
    }
}
