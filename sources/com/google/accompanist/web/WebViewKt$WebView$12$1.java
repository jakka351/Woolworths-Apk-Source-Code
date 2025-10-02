package com.google.accompanist.web;

import android.support.v4.media.session.a;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.google.accompanist.web.WebViewKt$WebView$12$1", f = "WebView.kt", l = {175}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WebViewKt$WebView$12$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ WebViewNavigator q;
    public final /* synthetic */ WebView r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewKt$WebView$12$1(WebViewNavigator webViewNavigator, WebView webView, Continuation continuation) {
        super(2, continuation);
        this.q = webViewNavigator;
        this.r = webView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewKt$WebView$12$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((WebViewKt$WebView$12$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw a.v(obj);
        }
        ResultKt.b(obj);
        this.p = 1;
        this.q.a(this.r, this);
        return coroutineSingletons;
    }
}
