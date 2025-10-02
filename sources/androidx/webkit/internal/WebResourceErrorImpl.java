package androidx.webkit.internal;

import android.webkit.WebResourceError;
import androidx.webkit.WebResourceErrorCompat;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* loaded from: classes2.dex */
public class WebResourceErrorImpl extends WebResourceErrorCompat {

    /* renamed from: a, reason: collision with root package name */
    public WebResourceError f3857a;
    public final WebResourceErrorBoundaryInterface b;

    public WebResourceErrorImpl(WebResourceError webResourceError) {
        this.f3857a = webResourceError;
    }

    public final CharSequence a() throws IllegalArgumentException {
        WebViewFeatureInternal.b.getClass();
        if (this.f3857a == null) {
            WebkitToCompatConverter webkitToCompatConverter = WebViewGlueCommunicator.LAZY_COMPAT_CONVERTER_HOLDER.f3859a;
            this.f3857a = (WebResourceError) webkitToCompatConverter.f3867a.convertWebResourceError(Proxy.getInvocationHandler(this.b));
        }
        return this.f3857a.getDescription();
    }

    public final int b() throws IllegalArgumentException {
        WebViewFeatureInternal.c.getClass();
        if (this.f3857a == null) {
            WebkitToCompatConverter webkitToCompatConverter = WebViewGlueCommunicator.LAZY_COMPAT_CONVERTER_HOLDER.f3859a;
            this.f3857a = (WebResourceError) webkitToCompatConverter.f3867a.convertWebResourceError(Proxy.getInvocationHandler(this.b));
        }
        return this.f3857a.getErrorCode();
    }

    public WebResourceErrorImpl(InvocationHandler invocationHandler) {
        this.b = (WebResourceErrorBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }
}
