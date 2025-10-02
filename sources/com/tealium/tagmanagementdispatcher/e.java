package com.tealium.tagmanagementdispatcher;

import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.webkit.CookieManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tealium.core.Logger;
import com.tealium.core.TealiumConfig;
import com.tealium.core.TealiumContext;
import com.tealium.core.messaging.AfterDispatchSendCallbacks;
import com.tealium.core.messaging.LibrarySettingsUpdatedListener;
import com.tealium.core.messaging.SessionStartedListener;
import com.tealium.core.messaging.ValidationChangedListener;
import com.tealium.core.messaging.ValidationChangedMessenger;
import com.tealium.core.network.Connectivity;
import com.tealium.core.network.HttpClient;
import com.tealium.core.settings.LibrarySettings;
import com.tealium.remotecommands.RemoteCommandRequest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes.dex */
public final class e implements LibrarySettingsUpdatedListener, SessionStartedListener {

    /* renamed from: a, reason: collision with root package name */
    public final TealiumContext f19209a;
    public final String b;
    public final AfterDispatchSendCallbacks c;
    public final Connectivity d;
    public final com.tealium.tagmanagementdispatcher.d e;
    public final AtomicReference f;
    public long g;
    public boolean h;
    public int i;
    public final ContextScope j;
    public final ContextScope k;
    public long l;
    public final AtomicBoolean m;
    public final int n;
    public final boolean o;
    public Map p;
    public volatile int q;
    public volatile WebView r;
    public final C0399e s;

    public static final class a {
    }

    @DebugMetadata(c = "com.tealium.tagmanagementdispatcher.WebViewLoader$initializeWebView$1", f = "WebViewLoader.kt", l = {290}, m = "invokeSuspend")
    public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public e p;
        public int q;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            e eVar;
            com.tealium.tagmanagementdispatcher.a aVar = com.tealium.tagmanagementdispatcher.a.g;
            Unit unit = Unit.f24250a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.q;
            try {
                if (i == 0) {
                    ResultKt.b(obj);
                    AtomicReference atomicReference = e.this.f;
                    com.tealium.tagmanagementdispatcher.a aVar2 = com.tealium.tagmanagementdispatcher.a.h;
                    while (true) {
                        if (atomicReference.compareAndSet(aVar, aVar2)) {
                            e eVar2 = e.this;
                            if (eVar2.q < eVar2.n) {
                                e eVar3 = e.this;
                                eVar3.r = (WebView) eVar3.e.invoke();
                                e eVar4 = e.this;
                                this.p = eVar4;
                                this.q = 1;
                                Object objB = e.b(eVar4, this);
                                if (objB == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                eVar = eVar4;
                                obj = objB;
                            }
                        } else if (atomicReference.get() != aVar) {
                            break;
                        }
                    }
                    return unit;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar = this.p;
                ResultKt.b(obj);
                eVar.p = (Map) obj;
                WebView webViewH = e.this.h();
                e eVar5 = e.this;
                WebSettings settings = webViewH.getSettings();
                settings.setDatabaseEnabled(true);
                settings.setJavaScriptEnabled(true);
                settings.setDomStorageEnabled(true);
                settings.setCacheMode(-1);
                webViewH.setLayerType(1, null);
                webViewH.setWebChromeClient(new com.tealium.tagmanagementdispatcher.b());
                webViewH.setWebViewClient(eVar5.s);
                e.this.f.set(com.tealium.tagmanagementdispatcher.a.i);
                e.this.i();
                e eVar6 = e.this;
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.setAcceptCookie(true);
                cookieManager.setAcceptThirdPartyCookies(eVar6.h(), true);
                Logger.f19124a.b("Tealium-TagManagementDispatcher-1.2.2", "WebView: " + eVar6.h() + " created and cookies enabled");
                return unit;
            } catch (Exception e) {
                e.this.q++;
                e.this.f.set(aVar);
                Logger.Companion companion = Logger.f19124a;
                companion.h("Tealium-TagManagementDispatcher-1.2.2", "Exception whilst creating the WebView: " + e.getMessage());
                companion.h("Tealium-TagManagementDispatcher-1.2.2", ExceptionsKt.b(e));
                e.this.f19209a.e.a(new com.tealium.tagmanagementdispatcher.c(e));
                return unit;
            }
        }
    }

    @DebugMetadata(c = "com.tealium.tagmanagementdispatcher.WebViewLoader$loadUrlToWebView$1", f = "WebViewLoader.kt", l = {}, m = "invokeSuspend")
    public final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation continuation) {
            super(2, continuation);
            this.q = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e.this.new c(this.q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            c cVar = (c) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            cVar.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            e.this.h().loadUrl(this.q);
            return Unit.f24250a;
        }
    }

    @DebugMetadata(c = "com.tealium.tagmanagementdispatcher.WebViewLoader$registerNewSessionIfNeeded$1", f = "WebViewLoader.kt", l = {426}, m = "invokeSuspend")
    public final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ long r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, Continuation continuation) {
            super(2, continuation);
            this.r = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e.this.new d(this.r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TealiumContext tealiumContext = e.this.f19209a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                TealiumConfig tealiumConfig = tealiumContext.f19130a;
                Locale locale = Locale.ROOT;
                String str = tealiumConfig.b;
                String str2 = tealiumConfig.c;
                long j = this.r;
                String str3 = String.format(locale, "https://tags.tiqcdn.com/utag/tiqapp/utag.v.js?a=%s/%s/%s&cb=%s", Arrays.copyOf(new Object[]{str, str2, Long.valueOf(j), Long.valueOf(j)}, 4));
                Logger.f19124a.b("Tealium-TagManagementDispatcher-1.2.2", "Registering new Tag Management session - ".concat(str3));
                HttpClient httpClient = tealiumContext.d;
                this.p = 1;
                if (httpClient.c(str3, this) == coroutineSingletons) {
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

    public e(TealiumContext context, String urlString, AfterDispatchSendCallbacks afterDispatchSendCallbacks, Connectivity connectivity) {
        com.tealium.tagmanagementdispatcher.d dVar = new com.tealium.tagmanagementdispatcher.d(context);
        Intrinsics.h(context, "context");
        Intrinsics.h(urlString, "urlString");
        Intrinsics.h(afterDispatchSendCallbacks, "afterDispatchSendCallbacks");
        this.f19209a = context;
        this.b = urlString;
        this.c = afterDispatchSendCallbacks;
        this.d = connectivity;
        this.e = dVar;
        this.f = new AtomicReference(com.tealium.tagmanagementdispatcher.a.g);
        this.i = -1;
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        ContextScope contextScopeA = CoroutineScopeKt.a(MainDispatcherLoader.f24726a);
        this.j = contextScopeA;
        this.k = CoroutineScopeKt.a(DefaultIoScheduler.f);
        this.l = -1L;
        this.m = new AtomicBoolean(false);
        this.n = 3;
        Object obj = context.f19130a.k.get("tag_management_session_counting_enabled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        this.o = bool != null ? bool.booleanValue() : true;
        this.p = EmptyMap.d;
        this.s = new C0399e();
        BuildersKt.a(contextScopeA, null, new b(null), 3);
        context.e.f19153a.i(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.tealium.tagmanagementdispatcher.e r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof com.tealium.tagmanagementdispatcher.g
            if (r0 == 0) goto L13
            r0 = r6
            com.tealium.tagmanagementdispatcher.g r0 = (com.tealium.tagmanagementdispatcher.g) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            com.tealium.tagmanagementdispatcher.g r0 = new com.tealium.tagmanagementdispatcher.g
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.LinkedHashMap r5 = r0.p
            kotlin.ResultKt.b(r6)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L4f
            goto L58
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r6)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            com.tealium.tagmanagementdispatcher.h r2 = new com.tealium.tagmanagementdispatcher.h     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L4e
            r4 = 0
            r2.<init>(r5, r6, r4)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L4e
            r0.p = r6     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L4e
            r0.s = r3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L4e
            r3 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r5 = kotlinx.coroutines.TimeoutKt.b(r3, r2, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L4e
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r5 = r6
            goto L58
        L4e:
            r5 = r6
        L4f:
            com.tealium.core.Logger$Companion r6 = com.tealium.core.Logger.f19124a
            java.lang.String r0 = "Tealium-TagManagementDispatcher-1.2.2"
            java.lang.String r1 = "Timeout reached when fetching query parameters"
            r6.h(r0, r1)
        L58:
            java.util.Map r5 = kotlin.collections.MapsKt.q(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tealium.tagmanagementdispatcher.e.b(com.tealium.tagmanagementdispatcher.e, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.tealium.core.messaging.LibrarySettingsUpdatedListener
    public final void C(LibrarySettings settings) {
        Intrinsics.h(settings, "settings");
        this.h = settings.e;
        this.i = settings.f;
    }

    public final void c(long j) {
        if (j != -1 && this.d.isConnected() && this.f.get() == com.tealium.tagmanagementdispatcher.a.d && this.m.compareAndSet(true, false) && this.o) {
            BuildersKt.c(this.k, null, null, new d(j, null), 3);
        }
    }

    public final WebView h() {
        WebView webView = this.r;
        if (webView != null) {
            return webView;
        }
        Intrinsics.p("webView");
        throw null;
    }

    public final void i() {
        String string;
        com.tealium.tagmanagementdispatcher.a aVar;
        boolean z = this.h;
        Connectivity connectivity = this.d;
        if ((!z || connectivity.a()) && connectivity.isConnected()) {
            while (true) {
                AtomicReference atomicReference = this.f;
                com.tealium.tagmanagementdispatcher.a aVar2 = com.tealium.tagmanagementdispatcher.a.i;
                com.tealium.tagmanagementdispatcher.a aVar3 = com.tealium.tagmanagementdispatcher.a.f;
                if (atomicReference.compareAndSet(aVar2, aVar3)) {
                    break;
                }
                if (atomicReference.get() != aVar2) {
                    do {
                        aVar = com.tealium.tagmanagementdispatcher.a.e;
                        if (atomicReference.compareAndSet(aVar, aVar3)) {
                        }
                    } while (atomicReference.get() == aVar);
                    return;
                }
            }
            Map map = this.p;
            boolean zIsEmpty = map.isEmpty();
            String str = this.b;
            if (zIsEmpty) {
                string = str;
            } else {
                Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
                for (Map.Entry entry : map.entrySet()) {
                    Iterator it = ((Iterable) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) it.next());
                    }
                }
                string = builderBuildUpon.build().toString();
                Intrinsics.g(string, "uriBuilder.build().toString()");
            }
            try {
                BuildersKt.c(this.j, null, null, new c(string + (StringsKt.o(str, "?", false) ? '&' : '?') + androidx.camera.core.impl.b.k(System.currentTimeMillis() / 1000, "timestamp_unix="), null), 3);
            } catch (Throwable th) {
                Logger.Companion companion = Logger.f19124a;
                String localizedMessage = th.getLocalizedMessage();
                Intrinsics.g(localizedMessage, "t.localizedMessage");
                Logger.Companion.c("Tealium-TagManagementDispatcher-1.2.2", localizedMessage);
            }
        }
    }

    @Override // com.tealium.core.messaging.SessionStartedListener
    public final void z(long j) {
        long j2 = this.l;
        if (j2 != -1 && j2 != j) {
            while (true) {
                AtomicReference atomicReference = this.f;
                com.tealium.tagmanagementdispatcher.a aVar = com.tealium.tagmanagementdispatcher.a.d;
                if (atomicReference.compareAndSet(aVar, com.tealium.tagmanagementdispatcher.a.e)) {
                    i();
                    break;
                } else if (atomicReference.get() != aVar) {
                    break;
                }
            }
        }
        this.l = j;
        this.m.set(true);
        c(j);
    }

    /* renamed from: com.tealium.tagmanagementdispatcher.e$e, reason: collision with other inner class name */
    public final class C0399e extends WebViewClient {

        @DebugMetadata(c = "com.tealium.tagmanagementdispatcher.WebViewLoader$webViewClient$1$shouldOverrideUrlLoading$1$1", f = "WebViewLoader.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.tealium.tagmanagementdispatcher.e$e$a */
        public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ e p;
            public final /* synthetic */ String q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, String str, Continuation continuation) {
                super(2, continuation);
                this.p = eVar;
                this.q = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.p, this.q, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) create((CoroutineScope) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                aVar.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                e eVar = this.p;
                eVar.c.b(new RemoteCommandRequest(new f(eVar), this.q));
                return Unit.f24250a;
            }
        }

        public C0399e() {
        }

        @Override // android.webkit.WebViewClient
        public final void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            Logger.f19124a.b("Tealium-TagManagementDispatcher-1.2.2", "Loaded Resource: " + str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            e eVar = e.this;
            eVar.g = jElapsedRealtime;
            AtomicReference atomicReference = eVar.f;
            Object obj = atomicReference.get();
            com.tealium.tagmanagementdispatcher.a aVar = com.tealium.tagmanagementdispatcher.a.e;
            if (aVar != obj) {
                atomicReference.set(com.tealium.tagmanagementdispatcher.a.d);
                eVar.c(eVar.l);
                eVar.f19209a.e.a(new ValidationChangedMessenger(Reflection.f24268a.b(ValidationChangedListener.class)));
                if (webView != null) {
                    webView.loadUrl("javascript:(function(){\n    var payload = {};\n    try {\n        var ts = new RegExp(\"ut[0-9]+\\.[0-9]+\\.[0-9]{12}\").exec(document.childNodes[0].textContent)[0];\n        ts = ts.substring(ts.length - 12, ts.length);\n        var y = ts.substring(0, 4);\n        var mo = ts.substring(4, 6);\n        var d = ts.substring(6, 8);\n        var h = ts.substring(8, 10);\n        var mi = ts.substring(10, 12);\n        var t = Date.from(y+'/'+mo+'/'+d+' '+h+':'+mi+' UTC');\n        if(!isNaN(t)){\n            payload.published = t;\n        }\n    } catch(e) {    }\n    var f=document.cookie.indexOf('trace_id=');\n    if(f>=0){\n        payload.trace_id = document.cookie.substring(f+9).split(';')[0];\n    }\n})()");
                    return;
                }
                return;
            }
            atomicReference.set(aVar);
            Logger.f19124a.b("Tealium-TagManagementDispatcher-1.2.2", "Error loading URL " + str + " in WebView " + webView);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            if (str2 != null) {
                Locale locale = Locale.ROOT;
                if (StringsKt.o(androidx.constraintlayout.core.state.a.m(locale, "ROOT", str2, locale, "this as java.lang.String).toLowerCase(locale)"), "favicon.ico", false) || StringsKt.W(androidx.constraintlayout.core.state.a.m(locale, "ROOT", str2, locale, "this as java.lang.String).toLowerCase(locale)"), "about:", false)) {
                    return;
                }
            }
            super.onReceivedError(webView, i, str, str2);
            e eVar = e.this;
            AtomicReference atomicReference = eVar.f;
            com.tealium.tagmanagementdispatcher.a aVar = com.tealium.tagmanagementdispatcher.a.e;
            if (aVar == atomicReference.getAndSet(aVar)) {
                return;
            }
            eVar.g = SystemClock.uptimeMillis();
            Logger.Companion companion = Logger.f19124a;
            StringBuilder sbP = androidx.constraintlayout.core.state.a.p("Received err: {\n\tcode: ", i, ",\n\tdesc:\"", str != null ? StringsKt.Q(str, "\"", "\\\"", false) : null, "\",\n\turl:\"");
            sbP.append(str2);
            sbP.append("\"\n}");
            Logger.Companion.c("Tealium-TagManagementDispatcher-1.2.2", sbP.toString());
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest != null) {
                String string = webResourceRequest.getUrl().toString();
                Intrinsics.g(string, "it.url.toString()");
                e eVar = e.this;
                if (StringsKt.W(string, eVar.b, false)) {
                    eVar.f.set(com.tealium.tagmanagementdispatcher.a.e);
                }
            }
            if (webResourceResponse == null || webResourceRequest == null) {
                return;
            }
            Logger.Companion companion = Logger.f19124a;
            Logger.Companion.c("Tealium-TagManagementDispatcher-1.2.2", "Received http error with " + webResourceRequest.getUrl() + ": " + webResourceResponse.getStatusCode() + ": " + webResourceResponse.getReasonPhrase());
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            e.this.f.set(com.tealium.tagmanagementdispatcher.a.e);
            if (webView != null) {
                Logger.f19124a.b("Tealium-TagManagementDispatcher-1.2.2", "Received SSL Error in WebView " + webView + " (" + webView.getUrl() + "): " + sslError);
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }

        @Override // android.webkit.WebViewClient
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView != null) {
                webView.destroy();
            }
            e eVar = e.this;
            eVar.f.set(com.tealium.tagmanagementdispatcher.a.g);
            BuildersKt.a(eVar.j, null, eVar.new b(null), 3);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (str != null) {
                Locale locale = Locale.ROOT;
                if (!StringsKt.o(androidx.constraintlayout.core.state.a.m(locale, "ROOT", str, locale, "this as java.lang.String).toLowerCase(locale)"), "favicon.ico", false)) {
                    return null;
                }
            }
            return new WebResourceResponse("image/png", null, null);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str == null || !StringsKt.W(str, "tealium://", false)) {
                return true;
            }
            e eVar = e.this;
            BuildersKt.c(eVar.k, null, null, new a(eVar, str, null), 3);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            shouldOverrideUrlLoading(webView, String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null));
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldInterceptRequest(webView, String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null));
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (webResourceError != null) {
                onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null));
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }
}
