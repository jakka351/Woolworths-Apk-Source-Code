package androidx.webkit.internal;

import java.lang.reflect.InvocationHandler;
import java.util.HashMap;
import java.util.Map;
import org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface;

/* loaded from: classes2.dex */
public class SpeculativeLoadingParametersAdapter implements SpeculativeLoadingParametersBoundaryInterface {
    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public final Map getAdditionalHeaders() {
        return new HashMap();
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public final InvocationHandler getNoVarySearchData() {
        return null;
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public final boolean isJavaScriptEnabled() {
        return false;
    }
}
