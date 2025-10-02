package com.google.accompanist.web;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.google.accompanist.web.WebViewNavigator", f = "WebView.kt", l = {454}, m = "handleNavigationEvents$web_release")
/* loaded from: classes4.dex */
final class WebViewNavigator$handleNavigationEvents$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ WebViewNavigator q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewNavigator$handleNavigationEvents$1(WebViewNavigator webViewNavigator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = webViewNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        this.q.a(null, this);
        return CoroutineSingletons.d;
    }
}
