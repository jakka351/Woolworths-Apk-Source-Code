package androidx.webkit;

import android.webkit.ServiceWorkerController;
import androidx.annotation.AnyThread;
import androidx.webkit.internal.ServiceWorkerControllerImpl;
import androidx.webkit.internal.WebViewFeatureInternal;

@AnyThread
/* loaded from: classes2.dex */
public abstract class ServiceWorkerControllerCompat {

    public static class LAZY_HOLDER {
        static {
            ServiceWorkerControllerImpl serviceWorkerControllerImpl = new ServiceWorkerControllerImpl();
            WebViewFeatureInternal.f3858a.getClass();
            ServiceWorkerController serviceWorkerController = ServiceWorkerController.getInstance();
            serviceWorkerControllerImpl.f3854a = serviceWorkerController;
            if (serviceWorkerController == null) {
                serviceWorkerControllerImpl.f3854a = ServiceWorkerController.getInstance();
            }
            serviceWorkerControllerImpl.f3854a.getServiceWorkerWebSettings();
        }
    }
}
