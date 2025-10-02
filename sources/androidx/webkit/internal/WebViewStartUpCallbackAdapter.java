package androidx.webkit.internal;

import androidx.webkit.BlockingStartUpLocation;
import androidx.webkit.WebViewStartUpResult;
import java.lang.reflect.InvocationHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* loaded from: classes2.dex */
public class WebViewStartUpCallbackAdapter implements WebViewStartUpCallbackBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.webkit.a f3864a;

    public static class BlockingStartUpLocationImpl implements BlockingStartUpLocation {
    }

    public WebViewStartUpCallbackAdapter(androidx.webkit.a aVar) {
        this.f3864a = aVar;
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface
    public final void onSuccess(InvocationHandler invocationHandler) {
        WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface = (WebViewStartUpResultBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebViewStartUpResultBoundaryInterface.class, invocationHandler);
        Objects.requireNonNull(webViewStartUpResultBoundaryInterface);
        this.f3864a.onSuccess(new WebViewStartUpResult() { // from class: androidx.webkit.internal.WebViewStartUpCallbackAdapter.1
            {
                List<Throwable> blockingStartUpLocations = this.f3865a.getBlockingStartUpLocations();
                ArrayList arrayList = new ArrayList();
                for (Throwable th : blockingStartUpLocations) {
                    arrayList.add(new BlockingStartUpLocationImpl());
                }
            }

            @Override // androidx.webkit.WebViewStartUpResult
            public final Long getTotalTimeInUiThreadMillis() {
                return this.f3865a.getTotalTimeInUiThreadMillis();
            }
        });
    }
}
