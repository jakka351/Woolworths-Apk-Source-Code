package butterknife.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import au.com.woolworths.base.wallet.digipay.framesview.b;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes4.dex */
public abstract class DebouncingOnClickListener implements View.OnClickListener {
    public static final b d = new b(1);
    public static final Handler e = new Handler(Looper.getMainLooper());
    public static boolean f = true;

    public abstract void a();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Callback.g(view);
        try {
            if (f) {
                f = false;
                e.post(d);
                a();
            }
            Callback.h();
        } catch (Throwable th) {
            Callback.h();
            throw th;
        }
    }
}
