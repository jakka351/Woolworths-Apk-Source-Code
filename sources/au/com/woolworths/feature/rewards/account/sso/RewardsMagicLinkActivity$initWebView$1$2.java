package au.com.woolworths.feature.rewards.account.sso;

import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkActivity$initWebView$1$2", "Landroid/webkit/WebChromeClient;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsMagicLinkActivity$initWebView$1$2 extends WebChromeClient {
    public static final /* synthetic */ int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RewardsMagicLinkActivity f5801a;

    public RewardsMagicLinkActivity$initWebView$1$2(RewardsMagicLinkActivity rewardsMagicLinkActivity) {
        this.f5801a = rewardsMagicLinkActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        RewardsMagicLinkActivity rewardsMagicLinkActivity = this.f5801a;
        rewardsMagicLinkActivity.B = null;
        rewardsMagicLinkActivity.O4().b(rewardsMagicLinkActivity, valueCallback, fileChooserParams, new e(rewardsMagicLinkActivity, 0), new e(rewardsMagicLinkActivity, 1));
        return true;
    }
}
