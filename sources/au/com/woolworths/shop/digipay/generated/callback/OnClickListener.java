package au.com.woolworths.shop.digipay.generated.callback;

import android.view.View;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes4.dex */
public final class OnClickListener implements View.OnClickListener {
    public final Listener d;
    public final int e;

    public interface Listener {
        void a(int i);
    }

    public OnClickListener(Listener listener, int i) {
        this.d = listener;
        this.e = i;
    }

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
