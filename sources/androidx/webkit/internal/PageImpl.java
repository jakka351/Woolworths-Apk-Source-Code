package androidx.webkit.internal;

import androidx.webkit.Page;
import org.chromium.support_lib_boundary.WebViewPageBoundaryInterface;

/* loaded from: classes2.dex */
public class PageImpl implements Page {
    private final WebViewPageBoundaryInterface mPageBoundaryInterface;

    public PageImpl(WebViewPageBoundaryInterface webViewPageBoundaryInterface) {
        this.mPageBoundaryInterface = webViewPageBoundaryInterface;
    }
}
