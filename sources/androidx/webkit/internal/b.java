package androidx.webkit.internal;

import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewPageBoundaryInterface;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ WebViewPageBoundaryInterface e;

    public /* synthetic */ b(WebViewPageBoundaryInterface webViewPageBoundaryInterface, int i) {
        this.d = i;
        this.e = webViewPageBoundaryInterface;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.d) {
        }
        return new PageImpl(this.e);
    }
}
