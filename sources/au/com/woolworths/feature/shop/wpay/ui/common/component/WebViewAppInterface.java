package au.com.woolworths.feature.shop.wpay.ui.common.component;

import android.webkit.JavascriptInterface;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/common/component/WebViewAppInterface;", "", "", "message", "", "postMessage", "(Ljava/lang/String;)V", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WebViewAppInterface {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f8347a;

    public WebViewAppInterface(Function1 function1) {
        this.f8347a = function1;
    }

    @JavascriptInterface
    public final void postMessage(@NotNull String message) {
        Intrinsics.h(message, "message");
        this.f8347a.invoke(message);
    }
}
