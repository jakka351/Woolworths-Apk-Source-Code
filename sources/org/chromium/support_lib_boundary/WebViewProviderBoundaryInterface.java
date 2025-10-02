package org.chromium.support_lib_boundary;

import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.jspecify.annotations.NullMarked;

@NullMarked
/* loaded from: classes8.dex */
public interface WebViewProviderBoundaryInterface {
    InvocationHandler addDocumentStartJavaScript(String str, String[] strArr);

    void addWebMessageListener(String str, String[] strArr, InvocationHandler invocationHandler);

    InvocationHandler[] createWebMessageChannel();

    InvocationHandler getProfile();

    WebChromeClient getWebChromeClient();

    WebViewClient getWebViewClient();

    InvocationHandler getWebViewNavigationClient();

    InvocationHandler getWebViewRenderer();

    InvocationHandler getWebViewRendererClient();

    void insertVisualStateCallback(long j, InvocationHandler invocationHandler);

    boolean isAudioMuted();

    void postMessageToMainFrame(InvocationHandler invocationHandler, Uri uri);

    void prerenderUrl(String str, CancellationSignal cancellationSignal, Executor executor, ValueCallback<Void> valueCallback, ValueCallback<Throwable> valueCallback2);

    void prerenderUrl(String str, CancellationSignal cancellationSignal, Executor executor, InvocationHandler invocationHandler, ValueCallback<Void> valueCallback, ValueCallback<Throwable> valueCallback2);

    void removeWebMessageListener(String str);

    void saveState(Bundle bundle, int i, boolean z);

    void setAudioMuted(boolean z);

    void setProfile(String str);

    void setWebViewNavigationClient(InvocationHandler invocationHandler);

    void setWebViewRendererClient(InvocationHandler invocationHandler);
}
