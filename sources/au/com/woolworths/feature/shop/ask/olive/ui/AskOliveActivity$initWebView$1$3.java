package au.com.woolworths.feature.shop.ask.olive.ui;

import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/ask/olive/ui/AskOliveActivity$initWebView$1$3", "Landroid/webkit/WebChromeClient;", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AskOliveActivity$initWebView$1$3 extends WebChromeClient {
    public static final /* synthetic */ int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AskOliveActivity f6615a;

    public AskOliveActivity$initWebView$1$3(AskOliveActivity askOliveActivity) {
        this.f6615a = askOliveActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        AskOliveActivity askOliveActivity = this.f6615a;
        askOliveActivity.E = null;
        askOliveActivity.Q4().b(askOliveActivity, valueCallback, fileChooserParams, new f(askOliveActivity, 1), new f(askOliveActivity, 2));
        return true;
    }
}
