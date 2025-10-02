package androidx.webkit.internal;

import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ WebViewNavigationBoundaryInterface e;

    public /* synthetic */ c(WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface, int i) {
        this.d = i;
        this.e = webViewNavigationBoundaryInterface;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.d) {
        }
        return new NavigationAdapter(this.e);
    }
}
