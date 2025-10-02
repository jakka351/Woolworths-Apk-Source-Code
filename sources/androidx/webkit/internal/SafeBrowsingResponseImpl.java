package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import androidx.webkit.SafeBrowsingResponseCompat;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* loaded from: classes2.dex */
public class SafeBrowsingResponseImpl extends SafeBrowsingResponseCompat {

    /* renamed from: a, reason: collision with root package name */
    public SafeBrowsingResponse f3853a;
    public final SafeBrowsingResponseBoundaryInterface b;

    public SafeBrowsingResponseImpl(SafeBrowsingResponse safeBrowsingResponse) {
        this.f3853a = safeBrowsingResponse;
    }

    public final void a() throws IllegalArgumentException {
        WebViewFeatureInternal.d.getClass();
        if (this.f3853a == null) {
            WebkitToCompatConverter webkitToCompatConverter = WebViewGlueCommunicator.LAZY_COMPAT_CONVERTER_HOLDER.f3859a;
            this.f3853a = (SafeBrowsingResponse) webkitToCompatConverter.f3867a.convertSafeBrowsingResponse(Proxy.getInvocationHandler(this.b));
        }
        this.f3853a.showInterstitial(true);
    }

    public SafeBrowsingResponseImpl(InvocationHandler invocationHandler) {
        this.b = (SafeBrowsingResponseBoundaryInterface) BoundaryInterfaceReflectionUtil.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }
}
