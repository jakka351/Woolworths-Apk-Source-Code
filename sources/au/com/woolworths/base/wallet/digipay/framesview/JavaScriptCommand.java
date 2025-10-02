package au.com.woolworths.base.wallet.digipay.framesview;

import android.webkit.WebView;
import androidx.camera.core.processing.g;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/JavaScriptCommand;", "", "Companion", "Lau/com/woolworths/base/wallet/digipay/framesview/ActionCompleteCommand;", "Lau/com/woolworths/base/wallet/digipay/framesview/BuildFramesCommand;", "Lau/com/woolworths/base/wallet/digipay/framesview/ChallengeActionCompleteCommand;", "Lau/com/woolworths/base/wallet/digipay/framesview/ClearFormCommand;", "Lau/com/woolworths/base/wallet/digipay/framesview/CreateActionCommand;", "Lau/com/woolworths/base/wallet/digipay/framesview/CreateFramesControlCommand;", "Lau/com/woolworths/base/wallet/digipay/framesview/InitFramesLoadCommand;", "Lau/com/woolworths/base/wallet/digipay/framesview/InjectCardDetailsCommand;", "Lau/com/woolworths/base/wallet/digipay/framesview/InstantiateFramesSDKCommand;", "Lau/com/woolworths/base/wallet/digipay/framesview/StartActionCommand;", "Lau/com/woolworths/base/wallet/digipay/framesview/SubmitFormCommand;", "Lau/com/woolworths/base/wallet/digipay/framesview/TestFramesLoadedCommand;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class JavaScriptCommand {

    /* renamed from: a, reason: collision with root package name */
    public final String f4680a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/JavaScriptCommand$Companion;", "", "", "THIS_JS_OBJECT_NAME", "Ljava/lang/String;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public JavaScriptCommand(String str) {
        this.f4680a = str;
    }

    public static void a(JavaScriptCommand javaScriptCommand, WebView webView) {
        Intrinsics.h(webView, "webView");
        webView.post(new g(12, webView, javaScriptCommand, (Object) null));
    }
}
