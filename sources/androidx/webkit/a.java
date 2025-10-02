package androidx.webkit;

import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.impl.utils.futures.e;
import androidx.webkit.WebViewCompat;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements WebViewCompat.WebViewStartUpCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebViewCompat.WebViewStartUpCallback f3845a;

    public /* synthetic */ a(WebViewCompat.WebViewStartUpCallback webViewStartUpCallback) {
        this.f3845a = webViewStartUpCallback;
    }

    @Override // androidx.webkit.WebViewCompat.WebViewStartUpCallback
    public final void onSuccess(WebViewStartUpResult webViewStartUpResult) {
        boolean z = WebViewCompat.f3842a;
        new Handler(Looper.getMainLooper()).post(new e(17, this.f3845a, webViewStartUpResult));
    }
}
