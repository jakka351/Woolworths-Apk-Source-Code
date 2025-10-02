package me.oriient.internal.services.eventManager;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.networkManager.NetworkManager;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;
import me.oriient.internal.infra.serializerJson.Jsonable;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.auth.U;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.eventManager.model.EventError;
import me.oriient.internal.services.eventManager.model.EventManagerConfig;
import me.oriient.internal.services.eventManager.model.EventManagerContext;
import me.oriient.internal.services.eventManager.model.PublishMessage;
import me.oriient.internal.services.retryOperation.RetryStrategy;
import me.oriient.internal.services.websocket.SocketProvider;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class w implements EventManager, me.oriient.internal.services.websocket.d {

    @NotNull
    private static final c Companion = new c();

    /* renamed from: a, reason: collision with root package name */
    public final EventManagerContext f25473a;
    public final EventManagerConfig b;
    public final SocketProvider c;
    public final ELog d;
    public final NetworkManager e;
    public final MutableStateFlow f;
    public me.oriient.internal.services.websocket.e g;
    public boolean h;
    public final CoroutineScope i;
    public final CoroutineScope j;
    public final CoroutineScope k;
    public Job l;
    public int m;
    public final HashMap n;
    public final LinkedList o;
    public final Lazy p;
    public final Lazy q;
    public int r;
    public final RetryStrategy s;
    public Job t;

    public w(EventManagerContext context, EventManagerConfig config, SocketProvider socketProvider, ELog eLog, NetworkManager networkManager, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.h(context, "context");
        Intrinsics.h(config, "config");
        Intrinsics.h(socketProvider, "socketProvider");
        Intrinsics.h(eLog, "eLog");
        Intrinsics.h(networkManager, "networkManager");
        Intrinsics.h(coroutineContextProvider, "coroutineContextProvider");
        this.f25473a = context;
        this.b = config;
        this.c = socketProvider;
        this.d = eLog;
        this.e = networkManager;
        this.f = StateFlowKt.a(EventManagerState.OFFLINE);
        this.h = true;
        this.i = CoroutineScopeKt.a(coroutineContextProvider.getIo());
        ContextScope contextScopeA = CoroutineScopeKt.a(coroutineContextProvider.newSingleThreadCoroutineContext());
        this.j = contextScopeA;
        this.k = CoroutineScopeKt.a(coroutineContextProvider.getIo());
        this.n = new HashMap();
        this.o = new LinkedList();
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.p = di.inject(reflectionFactory.b(Logger.class));
        this.q = InternalDiKt.getDi().inject(reflectionFactory.b(U.class));
        this.s = RetryStrategy.EXPONENTIAL;
        BuildersKt.c(contextScopeA, null, null, new b(this, null), 3);
    }

    public static final void b(w wVar) {
        me.oriient.internal.services.websocket.e eVar = wVar.g;
        if (eVar == null) {
            return;
        }
        if (!eVar.f25668a.h.b()) {
            ((Logger) wVar.p.getD()).w("EventManager", "Can't send requests to closed socket");
            return;
        }
        if (!wVar.o.isEmpty()) {
            ((Logger) wVar.p.getD()).d("EventManager", "sending data from queue (" + wVar.o.size() + " chunks)");
        }
        while (!wVar.o.isEmpty()) {
            me.oriient.internal.services.eventManager.model.c cVar = (me.oriient.internal.services.eventManager.model.c) wVar.o.poll();
            PublishMessage publishMessage = cVar.f25463a;
            try {
                String strSerializeToJsonString = JsonSerializationKt.serializeToJsonString(publishMessage.toJsonElement());
                wVar.a(cVar);
                Outcome outcomeA = eVar.a(strSerializeToJsonString);
                if (outcomeA instanceof Outcome.Success) {
                    BuildersKt.c(wVar.k, null, null, new p(cVar, publishMessage, null), 3);
                } else if (outcomeA instanceof Outcome.Failure) {
                    Exception value = ((Outcome.Failure) outcomeA).getValue();
                    wVar.d.e("EventManager", "Failed to send command", MapsKt.i(new Pair("errorMessage", value.getLocalizedMessage())));
                    BuildersKt.c(wVar.k, null, null, new q(cVar, publishMessage, value, null), 3);
                }
            } catch (Exception e) {
                BuildersKt.c(wVar.k, null, null, new r(cVar, publishMessage, e, null), 3);
                ((Logger) wVar.p.getD()).e("EventManager", "Failed to parse message request with id " + publishMessage.getRequestId(), e);
            }
        }
    }

    public static final void c(w wVar) {
        if (!((Boolean) wVar.e.isConnected().getValue()).booleanValue()) {
            wVar.a();
            ((Logger) wVar.p.getD()).d("EventManager", "Skipping connection attempt as no connection");
        } else {
            wVar.a(wVar.f, EventManagerState.CONNECTING);
            wVar.connect();
            ((Logger) wVar.p.getD()).d("EventManager", "Socket is trying to reconnect");
        }
    }

    public final void a(EventError eventError) {
        a(this.f, EventManagerState.OFFLINE);
        me.oriient.internal.services.websocket.e eVar = this.g;
        if (eVar != null) {
            eVar.c = null;
        }
        this.g = null;
        a();
        ((Logger) this.p.getD()).d("EventManager", "Handling disconnection " + this.f.getValue() + ' ' + eventError.getLocalizedMessage());
        this.d.d("EventManager", "Handling disconnection", MapsKt.j(new Pair("state", ((EventManagerState) this.f.getValue()).getELogName()), new Pair("errorMessage", eventError.getLocalizedMessage())));
        int i = this.r + 1;
        this.r = i;
        long jCalculateDelay$internal_publishRelease = this.s.calculateDelay$internal_publishRelease(i, this.b.getConnectionRetryInitialIntervalMillis(), this.b.getConnectionRetryMaxIntervalMillis());
        Job job = this.t;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        this.t = BuildersKt.c(CoroutineScopeKt.a(Dispatchers.f24691a), null, null, new i(jCalculateDelay$internal_publishRelease, this, null), 3);
    }

    @Override // me.oriient.internal.services.eventManager.EventManager
    public final void connect() {
        BuildersKt.c(this.j, null, null, new d(this, null), 3);
    }

    @Override // me.oriient.internal.services.eventManager.EventManager
    public final void disconnect() {
        BuildersKt.c(this.j, null, null, new e(this, null), 3);
    }

    @Override // me.oriient.internal.services.eventManager.EventManager
    public final StateFlow getState() {
        return this.f;
    }

    @Override // me.oriient.internal.services.eventManager.EventManager
    public final void sendEvent(String topic, Jsonable data, Jsonable parameters, Function2 onSuccess, Function3 onFailure) {
        Intrinsics.h(topic, "topic");
        Intrinsics.h(data, "data");
        Intrinsics.h(parameters, "parameters");
        Intrinsics.h(onSuccess, "onSuccess");
        Intrinsics.h(onFailure, "onFailure");
        BuildersKt.c(this.j, null, null, new s(this, onFailure, topic, data, parameters, onSuccess, null), 3);
    }

    @Override // me.oriient.internal.services.eventManager.EventManager
    public final void setSenderName(String str) {
        BuildersKt.c(this.j, null, null, new t(this, str, null), 3);
    }

    public static final Logger a(w wVar) {
        return (Logger) wVar.p.getD();
    }

    public final void a() {
        ((Logger) this.p.getD()).d("EventManager", "Cancelled socket connection timeout");
        Job job = this.l;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        this.l = null;
    }

    public final void a(me.oriient.internal.services.eventManager.model.c cVar) {
        ((Logger) this.p.getD()).d("EventManager", "startMessageRequestTimeout " + cVar.f25463a.getRequestId());
        this.n.put(cVar, BuildersKt.c(this.i, null, null, new v(this, cVar, null), 3));
    }

    public final void a(Exception error) {
        Intrinsics.h(error, "error");
        BuildersKt.c(this.j, null, null, new m(this, error, null), 3);
    }

    public static final void a(w wVar, String str) {
        Object next;
        Set setKeySet = wVar.n.keySet();
        Intrinsics.g(setKeySet, "<get-keys>(...)");
        Iterator it = setKeySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.c(((me.oriient.internal.services.eventManager.model.c) next).f25463a.getRequestId(), str)) {
                    break;
                }
            }
        }
        me.oriient.internal.services.eventManager.model.c cVar = (me.oriient.internal.services.eventManager.model.c) next;
        if (cVar == null) {
            return;
        }
        Job job = (Job) wVar.n.get(cVar);
        if (job != null) {
            JobKt.f(job).cancel((CancellationException) null);
        }
        wVar.n.remove(cVar);
    }

    public final void a(MutableStateFlow mutableStateFlow, EventManagerState eventManagerState) {
        kotlin.reflect.jvm.internal.impl.types.checker.a.q("state", eventManagerState.getELogName(), this.d, "EventManager", "EventsManager state changed");
        mutableStateFlow.setValue(eventManagerState);
    }
}
