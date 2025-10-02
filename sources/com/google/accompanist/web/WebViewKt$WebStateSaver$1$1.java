package com.google.accompanist.web;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Lcom/google/accompanist/web/WebViewState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class WebViewKt$WebStateSaver$1$1 extends Lambda implements Function2<SaverScope, WebViewState, Map<String, ? extends Object>> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SaverScope mapSaver = (SaverScope) obj;
        WebViewState it = (WebViewState) obj2;
        Intrinsics.h(mapSaver, "$this$mapSaver");
        Intrinsics.h(it, "it");
        Bundle bundle = new Bundle();
        WebView webView = (WebView) ((SnapshotMutableStateImpl) it.h).getD();
        if (webView != null) {
            webView.saveState(bundle);
        }
        return MapsKt.j(new Pair("pagetitle", (String) ((SnapshotMutableStateImpl) it.d).getD()), new Pair("lastloaded", (String) ((SnapshotMutableStateImpl) it.f14382a).getD()), new Pair("bundle", bundle));
    }
}
