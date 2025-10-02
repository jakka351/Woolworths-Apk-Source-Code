package androidx.webkit;

import androidx.annotation.AnyThread;
import androidx.webkit.internal.WebViewFeatureInternal;

@AnyThread
/* loaded from: classes2.dex */
public abstract class TracingController {

    public static class LAZY_HOLDER {
        static {
            WebViewFeatureInternal.f.getClass();
            android.webkit.TracingController.getInstance();
        }
    }
}
