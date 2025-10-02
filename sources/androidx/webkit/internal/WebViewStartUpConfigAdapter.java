package androidx.webkit.internal;

import androidx.webkit.WebViewStartUpConfig;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface;

/* loaded from: classes2.dex */
public class WebViewStartUpConfigAdapter implements WebViewStartUpConfigBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    public final WebViewStartUpConfig f3866a;

    public WebViewStartUpConfigAdapter(WebViewStartUpConfig webViewStartUpConfig) {
        this.f3866a = webViewStartUpConfig;
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public final Executor getBackgroundExecutor() {
        return this.f3866a.f3843a;
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public final boolean shouldRunUiThreadStartUpTasks() {
        return this.f3866a.b;
    }
}
