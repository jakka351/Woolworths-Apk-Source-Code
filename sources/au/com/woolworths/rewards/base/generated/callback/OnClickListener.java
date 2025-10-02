package au.com.woolworths.rewards.base.generated.callback;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes4.dex */
public final class OnClickListener implements View.OnClickListener {
    public final ViewDataBinding d;
    public final int e;

    public interface Listener {
        void a(int i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnClickListener(Listener listener, int i) {
        this.d = (ViewDataBinding) listener;
        this.e = i;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.databinding.ViewDataBinding, au.com.woolworths.rewards.base.generated.callback.OnClickListener$Listener] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Callback.g(view);
        try {
            this.d.a(this.e);
        } finally {
            Callback.h();
        }
    }
}
