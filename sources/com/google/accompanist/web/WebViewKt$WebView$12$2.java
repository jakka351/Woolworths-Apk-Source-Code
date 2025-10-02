package com.google.accompanist.web;

import android.webkit.WebView;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.accompanist.web.WebContent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.google.accompanist.web.WebViewKt$WebView$12$2", f = "WebView.kt", l = {SubsamplingScaleImageView.ORIENTATION_180}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WebViewKt$WebView$12$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ WebViewState q;
    public final /* synthetic */ WebView r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewKt$WebView$12$2(WebViewState webViewState, WebView webView, Continuation continuation) {
        super(2, continuation);
        this.q = webViewState;
        this.r = webView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewKt$WebView$12$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewKt$WebView$12$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final WebViewState webViewState = this.q;
            Flow flowM = SnapshotStateKt.m(new Function0<WebContent>() { // from class: com.google.accompanist.web.WebViewKt$WebView$12$2.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return (WebContent) ((SnapshotMutableStateImpl) webViewState.b).getD();
                }
            });
            final WebView webView = this.r;
            FlowCollector<WebContent> flowCollector = new FlowCollector<WebContent>() { // from class: com.google.accompanist.web.WebViewKt$WebView$12$2.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    WebContent webContent = (WebContent) obj2;
                    if (webContent instanceof WebContent.Url) {
                        WebContent.Url url = (WebContent.Url) webContent;
                        webView.loadUrl(url.f14378a, url.b);
                    } else if (webContent instanceof WebContent.Data) {
                        webView.loadDataWithBaseURL(null, null, null, null, null);
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (((AbstractFlow) flowM).collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
