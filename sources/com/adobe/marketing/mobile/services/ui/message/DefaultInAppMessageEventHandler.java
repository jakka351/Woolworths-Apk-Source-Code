package com.adobe.marketing.mobile.services.ui.message;

import android.webkit.JavascriptInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/DefaultInAppMessageEventHandler;", "Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageEventHandler;", "Companion", "WebViewJavascriptInterface", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class DefaultInAppMessageEventHandler implements InAppMessageEventHandler {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/DefaultInAppMessageEventHandler$Companion;", "", "", "LOG_SOURCE", "Ljava/lang/String;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/DefaultInAppMessageEventHandler$WebViewJavascriptInterface;", "", "", "js", "", "run", "(Ljava/lang/String;)V", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class WebViewJavascriptInterface {
        @JavascriptInterface
        public final void run(@NotNull String js) {
            Intrinsics.h(js, "js");
            throw null;
        }
    }
}
