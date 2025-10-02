package me.oriient.internal.services.eventManager;

import java.net.URI;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.websocket.SocketProvider;

/* loaded from: classes7.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f25453a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(w wVar, Continuation continuation) {
        super(2, continuation);
        this.f25453a = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f25453a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new d(this.f25453a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        w wVar = this.f25453a;
        wVar.h = true;
        wVar.a(wVar.f, EventManagerState.CONNECTING);
        Job job = this.f25453a.t;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        w wVar2 = this.f25453a;
        me.oriient.internal.services.websocket.e eVar = wVar2.g;
        if (eVar != null) {
            eVar.c = null;
        }
        SocketProvider socketProvider = wVar2.c;
        URI uriCreate = URI.create(wVar2.f25473a.getUrl());
        Intrinsics.g(uriCreate, "create(...)");
        wVar2.g = socketProvider.getSocket(uriCreate);
        w wVar3 = this.f25453a;
        me.oriient.internal.services.websocket.e eVar2 = wVar3.g;
        if (eVar2 != null) {
            eVar2.c = wVar3;
        }
        wVar3.a();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(wVar3.b.getTimeoutMillis());
        ((Logger) wVar3.p.getD()).d("EventManager", "Initiated socket connection timeout " + seconds);
        wVar3.l = BuildersKt.c(wVar3.j, null, null, new j(wVar3, null), 3);
        try {
            me.oriient.internal.services.websocket.e eVar3 = this.f25453a.g;
            if (eVar3 != null) {
                eVar3.a();
            }
        } catch (Exception e) {
            this.f25453a.a(e);
        }
        return Unit.f24250a;
    }
}
