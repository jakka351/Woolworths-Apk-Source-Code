package com.google.accompanist.web;

import android.support.v4.media.session.a;
import android.webkit.WebView;
import com.google.accompanist.web.WebViewNavigator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.google.accompanist.web.WebViewNavigator$handleNavigationEvents$2", f = "WebView.kt", l = {455}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WebViewNavigator$handleNavigationEvents$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
    public int p;
    public final /* synthetic */ WebViewNavigator q;
    public final /* synthetic */ WebView r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewNavigator$handleNavigationEvents$2(WebViewNavigator webViewNavigator, WebView webView, Continuation continuation) {
        super(2, continuation);
        this.q = webViewNavigator;
        this.r = webView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewNavigator$handleNavigationEvents$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((WebViewNavigator$handleNavigationEvents$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw a.v(obj);
        }
        ResultKt.b(obj);
        SharedFlowImpl sharedFlowImpl = this.q.b;
        final WebView webView = this.r;
        FlowCollector<WebViewNavigator.NavigationEvent> flowCollector = new FlowCollector<WebViewNavigator.NavigationEvent>() { // from class: com.google.accompanist.web.WebViewNavigator$handleNavigationEvents$2.1
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj2, Continuation continuation) {
                WebViewNavigator.NavigationEvent navigationEvent = (WebViewNavigator.NavigationEvent) obj2;
                boolean z = navigationEvent instanceof WebViewNavigator.NavigationEvent.Back;
                WebView webView2 = webView;
                if (z) {
                    webView2.goBack();
                } else if (navigationEvent instanceof WebViewNavigator.NavigationEvent.Forward) {
                    webView2.goForward();
                } else if (navigationEvent instanceof WebViewNavigator.NavigationEvent.Reload) {
                    webView2.reload();
                } else if (navigationEvent instanceof WebViewNavigator.NavigationEvent.StopLoading) {
                    webView2.stopLoading();
                } else {
                    if (navigationEvent instanceof WebViewNavigator.NavigationEvent.LoadHtml) {
                        throw null;
                    }
                    if (navigationEvent instanceof WebViewNavigator.NavigationEvent.LoadUrl) {
                        throw null;
                    }
                }
                return Unit.f24250a;
            }
        };
        this.p = 1;
        sharedFlowImpl.collect(flowCollector, this);
        return coroutineSingletons;
    }
}
