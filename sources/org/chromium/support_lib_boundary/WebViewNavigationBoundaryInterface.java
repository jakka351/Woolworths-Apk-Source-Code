package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
import org.jspecify.annotations.NullMarked;

@NullMarked
/* loaded from: classes8.dex */
public interface WebViewNavigationBoundaryInterface extends IsomorphicObjectBoundaryInterface {
    boolean didCommit();

    boolean didCommitErrorPage();

    InvocationHandler getPage();

    int getStatusCode();

    String getUrl();

    boolean isBack();

    boolean isForward();

    boolean isHistory();

    boolean isReload();

    boolean isRestore();

    boolean isSameDocument();

    boolean wasInitiatedByPage();
}
