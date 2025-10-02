package com.tealium.tagmanagementdispatcher;

import android.os.Build;
import android.os.SystemClock;
import com.medallia.digital.mobilesdk.q2;
import com.tealium.core.DispatcherFactory;
import com.tealium.core.JsonUtils;
import com.tealium.core.Logger;
import com.tealium.core.TealiumConfig;
import com.tealium.core.TealiumContext;
import com.tealium.core.consent.ConsentManagementPolicy;
import com.tealium.core.consent.UserConsentPreferences;
import com.tealium.core.messaging.AfterDispatchSendCallbacks;
import com.tealium.core.messaging.DispatchReadyListener;
import com.tealium.core.messaging.EvaluateJavascriptListener;
import com.tealium.core.messaging.UserConsentPreferencesUpdatedListener;
import com.tealium.core.network.Connectivity;
import com.tealium.core.network.ConnectivityRetriever;
import com.tealium.core.validation.DispatchValidator;
import com.tealium.dispatcher.Dispatch;
import com.tealium.dispatcher.Dispatcher;
import com.tealium.dispatcher.TealiumEvent;
import com.tealium.tagmanagementdispatcher.e.b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/tealium/tagmanagementdispatcher/TagManagementDispatcher;", "Lcom/tealium/dispatcher/Dispatcher;", "Lcom/tealium/core/messaging/DispatchReadyListener;", "Lcom/tealium/core/messaging/EvaluateJavascriptListener;", "Lcom/tealium/core/validation/DispatchValidator;", "Lcom/tealium/core/messaging/UserConsentPreferencesUpdatedListener;", "Companion", "tagmanagementdispatcher_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class TagManagementDispatcher implements Dispatcher, DispatchReadyListener, EvaluateJavascriptListener, DispatchValidator, UserConsentPreferencesUpdatedListener {

    @NotNull
    public static final String MODULE_VERSION = "1.2.2";
    public static final Companion i = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final TealiumContext f19206a;
    public final AfterDispatchSendCallbacks b;
    public final boolean c;
    public final boolean d;
    public final ContextScope e;
    public final e f;
    public final String g;
    public boolean h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tealium/tagmanagementdispatcher/TagManagementDispatcher$Companion;", "Lcom/tealium/core/DispatcherFactory;", "", "MODULE_NAME", "Ljava/lang/String;", "MODULE_VERSION", "tagmanagementdispatcher_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion implements DispatcherFactory {
        @Override // com.tealium.core.DispatcherFactory
        public final Dispatcher a(TealiumContext context, com.tealium.core.messaging.b callbacks) {
            Intrinsics.h(context, "context");
            Intrinsics.h(callbacks, "callbacks");
            return new TagManagementDispatcher(context, callbacks);
        }
    }

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19207a;

        static {
            int[] iArr = new int[com.tealium.tagmanagementdispatcher.a.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[5] = 3;
            iArr[3] = 4;
            iArr[2] = 5;
            f19207a = iArr;
        }
    }

    @DebugMetadata(c = "com.tealium.tagmanagementdispatcher.TagManagementDispatcher", f = "TagManagementDispatcher.kt", l = {66}, m = "onBatchDispatchSend")
    /* loaded from: classes6.dex */
    public final class b extends ContinuationImpl {
        public TagManagementDispatcher p;
        public Iterator q;
        public /* synthetic */ Object r;
        public int t;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.r = obj;
            this.t |= Integer.MIN_VALUE;
            return TagManagementDispatcher.this.o(null, this);
        }
    }

    @DebugMetadata(c = "com.tealium.tagmanagementdispatcher.TagManagementDispatcher$onEvaluateJavascript$1", f = "TagManagementDispatcher.kt", l = {}, m = "invokeSuspend")
    public final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation continuation) {
            super(2, continuation);
            this.q = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return TagManagementDispatcher.this.new c(this.q, continuation);
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
            try {
                TagManagementDispatcher.this.f.h().evaluateJavascript(this.q, null);
            } catch (Throwable th) {
                Logger.Companion companion = Logger.f19124a;
                String localizedMessage = th.getLocalizedMessage();
                Intrinsics.g(localizedMessage, "t.localizedMessage");
                Logger.Companion.c("Tealium-TagManagementDispatcher-1.2.2", localizedMessage);
            }
            return Unit.f24250a;
        }
    }

    public TagManagementDispatcher(TealiumContext context, AfterDispatchSendCallbacks afterDispatchSendCallbacks) {
        Connectivity connectivityA = ConnectivityRetriever.b.a(context.f19130a.f19129a);
        Intrinsics.h(context, "context");
        Intrinsics.h(afterDispatchSendCallbacks, "afterDispatchSendCallbacks");
        this.f19206a = context;
        this.b = afterDispatchSendCallbacks;
        TealiumConfig tealiumConfig = context.f19130a;
        LinkedHashMap linkedHashMap = tealiumConfig.k;
        Object obj = linkedHashMap.get("tag_management_remote_api_enabled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        this.c = bool != null ? bool.booleanValue() : true;
        Object obj2 = linkedHashMap.get("tag_management_webview_should_queue_on_failure");
        Boolean bool2 = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        this.d = bool2 != null ? bool2.booleanValue() : true;
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        this.e = CoroutineScopeKt.a(MainDispatcherLoader.f24726a);
        Object obj3 = linkedHashMap.get("override_tag_management_url");
        String strL = obj3 instanceof String ? (String) obj3 : null;
        if (strL == null) {
            strL = androidx.constraintlayout.core.state.a.l(YU.a.v("https://tags.tiqcdn.com/utag/", tealiumConfig.b, q2.c, tealiumConfig.c, q2.c), tealiumConfig.d.d, "/mobile.html?platform=android&device_os_version=", Build.VERSION.RELEASE, "&library_version=1.2.2&sdk_session_count=true");
        }
        this.f = new e(context, strL, afterDispatchSendCallbacks, connectivityA);
        this.g = "TagManagement";
        this.h = true;
    }

    @Override // com.tealium.core.Module
    /* renamed from: A, reason: from getter */
    public final boolean getH() {
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(com.tealium.dispatcher.Dispatch r6) throws org.json.JSONException {
        /*
            r5 = this;
            java.lang.String r0 = "dispatch"
            kotlin.jvm.internal.Intrinsics.h(r6, r0)
            java.lang.Object r0 = r6.get()
            java.lang.String r1 = "grant_full_consent"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L1d
            java.lang.Object r0 = r6.get()
            java.lang.String r1 = "grant_partial_consent"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L41
        L1d:
            com.tealium.core.TealiumContext r0 = r5.f19206a
            com.tealium.core.TealiumConfig r0 = r0.f19130a
            java.util.LinkedHashMap r0 = r0.k
            java.lang.String r1 = "consent_manager_logging_profile"
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L30
            java.lang.String r0 = (java.lang.String) r0
            goto L31
        L30:
            r0 = 0
        L31:
            if (r0 == 0) goto L41
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r2 = "tealium_profile"
            r1.<init>(r2, r0)
            java.util.Map r0 = kotlin.collections.MapsKt.i(r1)
            r6.b(r0)
        L41:
            java.util.Map r0 = r6.a()
            java.lang.String r1 = "tealium_event_type"
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r6 = r6.a()
            org.json.JSONObject r6 = com.tealium.core.JsonUtils.Companion.a(r6)
            java.lang.String r1 = "utag.track(\"link\", "
            java.lang.String r2 = ")"
            if (r0 == 0) goto L8c
            java.lang.String r3 = "event"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L8a
        L71:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "utag.track(\""
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = "\", "
            r3.append(r0)
            r3.append(r6)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
        L8a:
            if (r0 != 0) goto L9b
        L8c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
        L9b:
            r5.a(r0)
            android.webkit.CookieManager r6 = android.webkit.CookieManager.getInstance()
            r6.flush()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tealium.tagmanagementdispatcher.TagManagementDispatcher.E(com.tealium.dispatcher.Dispatch):void");
    }

    @Override // com.tealium.core.messaging.EvaluateJavascriptListener
    public final void a(String js) {
        Intrinsics.h(js, "js");
        if (this.f.f.get() != com.tealium.tagmanagementdispatcher.a.d) {
            return;
        }
        if (StringsKt.W(js, "javascript:", false)) {
            js = js.substring(11);
            Intrinsics.g(js, "this as java.lang.String).substring(startIndex)");
        }
        BuildersKt.c(this.e, null, null, new c(js, null), 3);
    }

    @Override // com.tealium.core.validation.DispatchValidator
    public final boolean b() {
        e eVar = this.f;
        return eVar.q >= eVar.n ? this.d : this.f.f.get() != com.tealium.tagmanagementdispatcher.a.d;
    }

    @Override // com.tealium.core.messaging.DispatchSendListener
    public final Object d(Dispatch dispatch, Continuation continuation) throws JSONException {
        E(dispatch);
        return Unit.f24250a;
    }

    @Override // com.tealium.core.Module
    /* renamed from: getName, reason: from getter */
    public final String getG() {
        return this.g;
    }

    @Override // com.tealium.core.messaging.UserConsentPreferencesUpdatedListener
    public final void n(UserConsentPreferences userConsentPreferences, ConsentManagementPolicy policy) throws JSONException {
        Intrinsics.h(policy, "policy");
        if (policy.getC()) {
            TealiumEvent tealiumEvent = new TealiumEvent(policy.getD(), policy.g());
            tealiumEvent.b(MapsKt.i(new Pair("tealium_event_type", policy.getD())));
            E(tealiumEvent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.tealium.core.messaging.BatchDispatchSendListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.util.List r6, kotlin.coroutines.Continuation r7) throws org.json.JSONException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.tealium.tagmanagementdispatcher.TagManagementDispatcher.b
            if (r0 == 0) goto L13
            r0 = r7
            com.tealium.tagmanagementdispatcher.TagManagementDispatcher$b r0 = (com.tealium.tagmanagementdispatcher.TagManagementDispatcher.b) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L1a
        L13:
            com.tealium.tagmanagementdispatcher.TagManagementDispatcher$b r0 = new com.tealium.tagmanagementdispatcher.TagManagementDispatcher$b
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r0.<init>(r7)
        L1a:
            java.lang.Object r7 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.util.Iterator r6 = r0.q
            com.tealium.tagmanagementdispatcher.TagManagementDispatcher r2 = r0.p
            kotlin.ResultKt.b(r7)
            goto L3d
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r7)
            java.util.Iterator r6 = r6.iterator()
            r2 = r5
        L3d:
            boolean r7 = r6.hasNext()
            kotlin.Unit r4 = kotlin.Unit.f24250a
            if (r7 == 0) goto L57
            java.lang.Object r7 = r6.next()
            com.tealium.dispatcher.Dispatch r7 = (com.tealium.dispatcher.Dispatch) r7
            r0.p = r2
            r0.q = r6
            r0.t = r3
            r2.d(r7, r0)
            if (r4 != r1) goto L3d
            return r1
        L57:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tealium.tagmanagementdispatcher.TagManagementDispatcher.o(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tealium.core.Module
    public final void setEnabled(boolean z) {
        this.h = z;
    }

    @Override // com.tealium.core.messaging.DispatchReadyListener
    public final void x(com.tealium.dispatcher.a aVar) throws JSONException {
        e eVar = this.f;
        com.tealium.tagmanagementdispatcher.a aVar2 = (com.tealium.tagmanagementdispatcher.a) eVar.f.get();
        int i2 = aVar2 == null ? -1 : a.f19207a[aVar2.ordinal()];
        if (i2 == 1) {
            if (this.c) {
                a("utag.track(\"remote_api\", " + JsonUtils.Companion.a(MapsKt.q(aVar.c)) + ")");
                return;
            }
            return;
        }
        if (i2 == 2 || i2 == 3) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - eVar.g;
            int i3 = eVar.i;
            if (i3 < 0) {
                i3 = 0;
            }
            if (jElapsedRealtime >= i3 * 1000) {
                eVar.i();
                return;
            }
            return;
        }
        if (i2 == 4) {
            Logger.f19124a.h("Tealium-TagManagementDispatcher-1.2.2", "WebView not loaded yet.");
            BuildersKt.a(eVar.j, null, eVar.new b(null), 3);
        } else {
            if (i2 != 5) {
                return;
            }
            Logger.f19124a.h("Tealium-TagManagementDispatcher-1.2.2", "WebView loading.");
        }
    }

    @Override // com.tealium.core.validation.DispatchValidator
    public final boolean y(com.tealium.dispatcher.a aVar) {
        return false;
    }
}
