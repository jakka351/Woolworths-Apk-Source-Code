package com.google.accompanist.web;

import android.os.Bundle;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import com.google.accompanist.web.WebContent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/google/accompanist/web/WebViewState;", "it", "", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WebViewKt$WebStateSaver$1$2 extends Lambda implements Function1<Map<String, ? extends Object>, WebViewState> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map it = (Map) obj;
        Intrinsics.h(it, "it");
        WebViewState webViewState = new WebViewState(WebContent.NavigatorOnly.f14377a);
        ((SnapshotMutableStateImpl) webViewState.d).setValue((String) it.get("pagetitle"));
        ((SnapshotMutableStateImpl) webViewState.f14382a).setValue((String) it.get("lastloaded"));
        webViewState.g = (Bundle) it.get("bundle");
        return webViewState;
    }
}
