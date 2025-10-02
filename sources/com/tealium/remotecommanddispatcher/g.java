package com.tealium.remotecommanddispatcher;

import com.tealium.core.Logger;
import com.tealium.core.network.ResourceEntity;
import com.tealium.core.network.ResponseStatus;
import com.tealium.remotecommanddispatcher.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/remotecommanddispatcher/g;", "Lcom/tealium/remotecommanddispatcher/d;", "a", "remotecommanddispatcher_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class g implements d {

    /* renamed from: a, reason: collision with root package name */
    public Deferred f19198a;
    public com.tealium.remotecommanddispatcher.c b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/remotecommanddispatcher/g$a;", "", "remotecommanddispatcher_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.remotecommanddispatcher.UrlRemoteCommandConfigRetriever$fetchRemoteSettings$2", f = "RemoteCommandConfigRetriever.kt", l = {131}, m = "invokeSuspend")
    final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public /* synthetic */ Object q;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/tealium/core/network/ResourceEntity;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.tealium.remotecommanddispatcher.UrlRemoteCommandConfigRetriever$fetchRemoteSettings$2$1", f = "RemoteCommandConfigRetriever.kt", l = {126}, m = "invokeSuspend")
        final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResourceEntity>, Object> {
            public int p;
            public /* synthetic */ Object q;
            public final /* synthetic */ g r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g gVar, Continuation continuation) {
                super(2, continuation);
                this.r = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(this.r, continuation);
                aVar.q = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                int i = this.p;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    return (ResourceEntity) obj;
                }
                ResultKt.b(obj);
                if (!CoroutineScopeKt.d((CoroutineScope) this.q)) {
                    return null;
                }
                this.p = 1;
                throw null;
            }
        }

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = g.this.new b(continuation);
            bVar.q = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws JSONException {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            com.tealium.remotecommanddispatcher.c cVarA = null;
            g gVar = g.this;
            if (i == 0) {
                ResultKt.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.q;
                Job job = gVar.f19198a;
                if (job == null || !((AbstractCoroutine) job).isActive()) {
                    Deferred deferredA = BuildersKt.a(coroutineScope, null, new a(gVar, null), 3);
                    gVar.f19198a = deferredA;
                    this.p = 1;
                    obj = deferredA.await(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return Unit.f24250a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            ResourceEntity resourceEntity = (ResourceEntity) obj;
            if (resourceEntity != null) {
                ResponseStatus responseStatus = resourceEntity.c;
                if (Intrinsics.c(responseStatus, ResponseStatus.Success.f19165a) || ((responseStatus instanceof ResponseStatus.Non200Response) && ((ResponseStatus.Non200Response) responseStatus).f19163a < 400)) {
                    Logger.f19124a.b("Tealium-RemoteCommandDispatcher-1.4.0", "Loaded Remote Command config from remote URL");
                    try {
                        String str = resourceEntity.f19160a;
                        String str2 = resourceEntity.b;
                        if (str != null) {
                            try {
                                JSONObject jSONObject = new JSONObject(str);
                                jSONObject.put("etag", str2);
                                cVarA = c.a.a(jSONObject);
                            } catch (JSONException unused) {
                            }
                        }
                        if (cVarA != null) {
                            String string = c.a.b(cVarA).toString();
                            Intrinsics.g(string, "RemoteCommandConfig.toJson(settings).toString()");
                            try {
                                Logger.f19124a.b("Tealium-RemoteCommandDispatcher-1.4.0", "Saving Remote Command settings to file");
                                FilesKt.h(null, string, Charsets.f24671a);
                            } catch (Exception unused2) {
                                Logger.f19124a.h("Tealium-RemoteCommandDispatcher-1.4.0", "Failed to save Remote Command settings to file");
                            }
                            gVar.b = cVarA;
                        }
                    } catch (JSONException unused3) {
                        Logger.f19124a.b("Tealium-RemoteCommandDispatcher-1.4.0", "Failed to parse remote command config from remote URL");
                    }
                } else {
                    Logger.f19124a.b("Tealium-RemoteCommandDispatcher-1.4.0", "No entity returned for remote command config from remote URL");
                }
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.remotecommanddispatcher.UrlRemoteCommandConfigRetriever$loadConfig$1", f = "RemoteCommandConfigRetriever.kt", l = {99}, m = "invokeSuspend")
    final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return g.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                this.p = 1;
                if (g.this.a(this) == coroutineSingletons) {
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

    @Override // com.tealium.remotecommanddispatcher.d
    public final Object a(Continuation continuation) {
        throw null;
    }

    @Override // com.tealium.remotecommanddispatcher.d
    /* renamed from: a, reason: from getter */
    public final com.tealium.remotecommanddispatcher.c getB() {
        return this.b;
    }
}
