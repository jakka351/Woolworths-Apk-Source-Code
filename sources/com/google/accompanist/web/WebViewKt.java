package com.google.accompanist.web;

import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.RememberedCoroutineScope;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.MapSaverKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"web_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class WebViewKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14380a = 0;

    static {
        MapSaverKt.a(new WebViewKt$WebStateSaver$1$2(1), new WebViewKt$WebStateSaver$1$1(2));
    }

    public static final void a(final WebViewState webViewState, final FrameLayout.LayoutParams layoutParams, final boolean z, final WebViewNavigator webViewNavigator, final Function1 function1, final Function1 function12, final AccompanistWebViewClient accompanistWebViewClient, final AccompanistWebChromeClient accompanistWebChromeClient, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(-1401343589);
        final WebView webView = (WebView) ((SnapshotMutableStateImpl) webViewState.h).getD();
        BackHandlerKt.a(z && ((Boolean) ((SnapshotMutableStateImpl) webViewNavigator.c).getD()).booleanValue(), new Function0<Unit>() { // from class: com.google.accompanist.web.WebViewKt$WebView$11
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WebView webView2 = webView;
                if (webView2 != null) {
                    webView2.goBack();
                }
                return Unit.f24250a;
            }
        }, composerImplV, 0, 0);
        composerImplV.F(1370705762);
        if (webView != null) {
            EffectsKt.f(webView, webViewNavigator, new WebViewKt$WebView$12$1(webViewNavigator, webView, null), composerImplV);
            EffectsKt.f(webView, webViewState, new WebViewKt$WebView$12$2(webViewState, webView, null), composerImplV);
        }
        composerImplV.V(false);
        accompanistWebViewClient.getClass();
        accompanistWebViewClient.f14373a = webViewState;
        Intrinsics.h(webViewNavigator, "<set-?>");
        accompanistWebViewClient.b = webViewNavigator;
        accompanistWebChromeClient.getClass();
        accompanistWebChromeClient.f14372a = webViewState;
        Function1<Context, WebView> function13 = new Function1<Context, WebView>() { // from class: com.google.accompanist.web.WebViewKt$WebView$13
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Context context = (Context) obj;
                Intrinsics.h(context, "context");
                WebView webView2 = new WebView(context);
                function1.invoke(webView2);
                webView2.setLayoutParams(layoutParams);
                WebViewState webViewState2 = webViewState;
                Bundle bundle = webViewState2.g;
                if (bundle != null) {
                    webView2.restoreState(bundle);
                }
                webView2.setWebChromeClient(accompanistWebChromeClient);
                webView2.setWebViewClient(accompanistWebViewClient);
                ((SnapshotMutableStateImpl) webViewState2.h).setValue(webView2);
                return webView2;
            }
        };
        composerImplV.F(1157296644);
        boolean zN = composerImplV.n(function12);
        Object objG = composerImplV.G();
        if (zN || objG == Composer.Companion.f1624a) {
            objG = new Function1<WebView, Unit>() { // from class: com.google.accompanist.web.WebViewKt$WebView$14$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    WebView it = (WebView) obj;
                    Intrinsics.h(it, "it");
                    function12.invoke(it);
                    return Unit.f24250a;
                }
            };
            composerImplV.A(objG);
        }
        composerImplV.V(false);
        AndroidView_androidKt.b(function13, Modifier.Companion.d, null, (Function1) objG, null, composerImplV, (i >> 3) & 112, 20);
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX == null) {
            return;
        }
        recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.web.WebViewKt$WebView$15
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ((Number) obj2).intValue();
                WebViewKt.a(webViewState, layoutParams, z, webViewNavigator, function1, function12, accompanistWebViewClient, accompanistWebChromeClient, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                return Unit.f24250a;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [com.google.accompanist.web.WebViewKt$WebView$5, kotlin.jvm.internal.Lambda] */
    public static final void b(final WebViewState webViewState, Modifier modifier, boolean z, WebViewNavigator webViewNavigator, final Function1 function1, Function1 function12, final AccompanistWebViewClient accompanistWebViewClient, AccompanistWebChromeClient accompanistWebChromeClient, Composer composer, final int i) {
        int i2;
        final WebViewNavigator webViewNavigator2;
        final boolean z2;
        final AccompanistWebChromeClient accompanistWebChromeClient2;
        Modifier modifier2;
        final Function1 function13;
        ComposerImpl composerImplV = composer.v(1473276617);
        int i3 = i | (composerImplV.n(webViewState) ? 4 : 2) | 105055664;
        composerImplV.u0();
        if ((i & 1) == 0 || composerImplV.c0()) {
            composerImplV.F(1602323198);
            composerImplV.F(773894976);
            composerImplV.F(-492369756);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = new CompositionScopedCoroutineScopeCanceller(new RememberedCoroutineScope(composerImplV.y()));
                composerImplV.A(objG);
            }
            composerImplV.N();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objG).d;
            composerImplV.N();
            composerImplV.F(1157296644);
            boolean zN = composerImplV.n(coroutineScope);
            Object objG2 = composerImplV.G();
            if (zN || objG2 == obj) {
                objG2 = new WebViewNavigator(coroutineScope);
                composerImplV.A(objG2);
            }
            composerImplV.N();
            WebViewNavigator webViewNavigator3 = (WebViewNavigator) objG2;
            composerImplV.N();
            composerImplV.F(-492369756);
            Object objG3 = composerImplV.G();
            if (objG3 == Composer.Companion.f1624a) {
                objG3 = new AccompanistWebChromeClient();
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            i2 = i3 & (-29367297);
            webViewNavigator2 = webViewNavigator3;
            z2 = true;
            accompanistWebChromeClient2 = (AccompanistWebChromeClient) objG3;
            modifier2 = Modifier.Companion.d;
            function13 = WebViewKt$WebView$2.h;
        } else {
            composerImplV.j();
            i2 = i3 & (-29367297);
            modifier2 = modifier;
            z2 = z;
            webViewNavigator2 = webViewNavigator;
            function13 = function12;
            accompanistWebChromeClient2 = accompanistWebChromeClient;
        }
        final int i4 = i2;
        composerImplV.W();
        BoxWithConstraintsKt.a(modifier2, null, false, ComposableLambdaKt.b(composerImplV, -1606035789, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: com.google.accompanist.web.WebViewKt$WebView$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj2;
                Composer composer2 = (Composer) obj3;
                int iIntValue = ((Number) obj4).intValue();
                Intrinsics.h(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue & 14) == 0) {
                    iIntValue |= composer2.n(BoxWithConstraints) ? 4 : 2;
                }
                if ((iIntValue & 91) == 18 && composer2.c()) {
                    composer2.j();
                } else {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(Constraints.f(BoxWithConstraints.getB()) ? -1 : -2, Constraints.e(BoxWithConstraints.getB()) ? -1 : -2);
                    int i5 = i4;
                    int i6 = (i5 & 14) | 150995392;
                    int i7 = i5 << 3;
                    WebViewKt.a(webViewState, layoutParams, z2, webViewNavigator2, function1, function13, accompanistWebViewClient, accompanistWebChromeClient2, composer2, i6 | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (3670016 & i7) | (i7 & 1879048192));
                }
                return Unit.f24250a;
            }
        }), composerImplV, 3078, 6);
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX == null) {
            return;
        }
        final WebViewNavigator webViewNavigator4 = webViewNavigator2;
        final Function1 function14 = function13;
        final AccompanistWebChromeClient accompanistWebChromeClient3 = accompanistWebChromeClient2;
        final boolean z3 = z2;
        final Modifier modifier3 = modifier2;
        recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(modifier3, z3, webViewNavigator4, function1, function14, accompanistWebViewClient, accompanistWebChromeClient3, i) { // from class: com.google.accompanist.web.WebViewKt$WebView$6
            public final /* synthetic */ Modifier i;
            public final /* synthetic */ boolean j;
            public final /* synthetic */ WebViewNavigator k;
            public final /* synthetic */ Function1 l;
            public final /* synthetic */ Function1 m;
            public final /* synthetic */ AccompanistWebViewClient n;
            public final /* synthetic */ AccompanistWebChromeClient o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ((Number) obj3).intValue();
                int iA = RecomposeScopeImplKt.a(2121729);
                WebViewKt.b(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj2, iA);
                return Unit.f24250a;
            }
        };
    }
}
