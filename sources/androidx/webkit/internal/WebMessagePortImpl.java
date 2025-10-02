package androidx.webkit.internal;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import androidx.webkit.WebMessagePortCompat;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* loaded from: classes2.dex */
public class WebMessagePortImpl extends WebMessagePortCompat {

    /* renamed from: a, reason: collision with root package name */
    public final WebMessagePortBoundaryInterface f3856a;

    public WebMessagePortImpl(InvocationHandler invocationHandler) {
        this.f3856a = (WebMessagePortBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebMessagePortBoundaryInterface.class, invocationHandler);
    }

    public static void a(WebMessage webMessage) {
        webMessage.getData();
        WebMessagePort[] ports = webMessage.getPorts();
        if (ports == null) {
            return;
        }
        WebMessagePortCompat[] webMessagePortCompatArr = new WebMessagePortCompat[ports.length];
        for (int i = 0; i < ports.length; i++) {
            WebMessagePort webMessagePort = ports[i];
            webMessagePortCompatArr[i] = new WebMessagePortImpl();
        }
    }
}
