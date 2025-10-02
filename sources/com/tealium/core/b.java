package com.tealium.core;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.tealium.core.messaging.ActivityObserverListener;
import com.tealium.core.persistence.Expiry;
import com.tealium.core.persistence.f0;
import com.tealium.dispatcher.TealiumEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/b;", "Lcom/tealium/core/messaging/ActivityObserverListener;", "a", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b implements ActivityObserverListener {

    /* renamed from: a, reason: collision with root package name */
    public final TealiumContext f19132a;
    public final ContextScope b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/tealium/core/b$a;", "", "", "KILL_VISITOR_SESSION", "Ljava/lang/String;", "LEAVE_TRACE_QUERY_PARAM", "TRACE_ID_QUERY_PARAM", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.core.DeepLinkHandler$onActivityResumed$1$1", f = "DeepLinkHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.tealium.core.b$b, reason: collision with other inner class name */
    final class C0381b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Activity q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0381b(Activity activity, Continuation continuation) {
            super(2, continuation);
            this.q = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new C0381b(this.q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            C0381b c0381b = (C0381b) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            c0381b.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Uri data;
            String queryParameter;
            Unit unit;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            TealiumContext tealiumContext = b.this.f19132a;
            TealiumConfig tealiumConfig = tealiumContext.f19130a;
            Intent intent = this.q.getIntent();
            Unit unit2 = Unit.f24250a;
            if (intent != null && "android.intent.action.VIEW".equals(intent.getAction()) && (data = intent.getData()) != null && !data.isOpaque()) {
                f0 f0Var = tealiumContext.c;
                boolean z = tealiumConfig.m;
                Expiry expiry = Expiry.f19166a;
                if (z && (queryParameter = data.getQueryParameter("tealium_trace_id")) != null) {
                    if (data.getQueryParameter("kill_visitor_session") != null) {
                        tealiumContext.a(new TealiumEvent("kill_visitor_session", MapsKt.f(new Pair("event", "kill_visitor_session"))));
                    }
                    if (data.getQueryParameter("leave_trace") != null) {
                        f0Var.K("cp.trace_id");
                        unit = unit2;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        f0Var.J("cp.trace_id", queryParameter, expiry);
                    }
                }
                if (tealiumConfig.l && !data.isOpaque() && !data.equals(Uri.EMPTY)) {
                    if (!Intrinsics.c(data.toString(), f0Var.G("deep_link_url"))) {
                        List listG0 = CollectionsKt.G0(CollectionsKt.N0(f0Var.f19169a.keySet(), f0Var.d.F()));
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listG0) {
                            if (StringsKt.W((String) obj2, "deep_link_param", false)) {
                                arrayList.add(obj2);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            f0Var.K((String) it.next());
                        }
                        String string = data.toString();
                        Intrinsics.g(string, "uri.toString()");
                        f0Var.J("deep_link_url", string, expiry);
                        Set<String> queryParameterNames = data.getQueryParameterNames();
                        Intrinsics.g(queryParameterNames, "uri.queryParameterNames");
                        for (String str : queryParameterNames) {
                            String queryParameter2 = data.getQueryParameter(str);
                            if (queryParameter2 != null) {
                                f0Var.J("deep_link_param_" + str, queryParameter2, expiry);
                            }
                        }
                    }
                }
            }
            return unit2;
        }
    }

    public b(TealiumContext tealiumContext, ContextScope contextScope) {
        this.f19132a = tealiumContext;
        this.b = contextScope;
    }

    @Override // com.tealium.core.messaging.ActivityObserverListener
    public final void m(Activity activity, boolean z) {
    }

    @Override // com.tealium.core.messaging.ActivityObserverListener
    public final void onActivityPaused(Activity activity) {
    }

    @Override // com.tealium.core.messaging.ActivityObserverListener
    public final void onActivityResumed(Activity activity) {
        BuildersKt.c(this.b, null, null, new C0381b(activity, null), 3);
    }
}
