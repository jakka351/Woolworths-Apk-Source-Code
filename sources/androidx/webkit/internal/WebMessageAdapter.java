package androidx.webkit.internal;

import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* loaded from: classes2.dex */
public class WebMessageAdapter implements WebMessageBoundaryInterface {
    public static final String[] d = {"WEB_MESSAGE_ARRAY_BUFFER"};

    public static WebMessageCompat a(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        WebMessagePortCompat[] webMessagePortCompatArr = new WebMessagePortCompat[ports.length];
        for (int i = 0; i < ports.length; i++) {
            webMessagePortCompatArr[i] = new WebMessagePortImpl(ports[i]);
        }
        if (!WebViewFeatureInternal.e.d()) {
            return new WebMessageCompat(webMessageBoundaryInterface.getData(), webMessagePortCompatArr);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new WebMessageCompat(webMessagePayloadBoundaryInterface.getAsString(), webMessagePortCompatArr);
        }
        if (type != 1) {
            return null;
        }
        return new WebMessageCompat(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), webMessagePortCompatArr);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public final String getData() {
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public final InvocationHandler getMessagePayload() {
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public final InvocationHandler[] getPorts() {
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return d;
    }
}
