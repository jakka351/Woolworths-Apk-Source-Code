package me.oriient.ipssdk.realtime.ips.proximity.local;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.ipssdk.ips.IPSLocalProximityEvent;
import me.oriient.ipssdk.realtime.ofs.T3;

/* loaded from: classes8.dex */
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProximityEventManagerImpl f25905a;
    public final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ProximityEventManagerImpl proximityEventManagerImpl, List list, Continuation continuation) {
        super(2, continuation);
        this.f25905a = proximityEventManagerImpl;
        this.b = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f25905a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b(this.f25905a, this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        boolean zAccess$verifyOrigin = ProximityEventManagerImpl.access$verifyOrigin(this.f25905a, this.b);
        Unit unit = Unit.f24250a;
        if (!zAccess$verifyOrigin) {
            ProximityEventManagerImpl.access$getLogger(this.f25905a).w("LocalProximityManager", "setProximityEvents: received events of different origin");
            return unit;
        }
        this.f25905a.j.clear();
        Set set = this.f25905a.j;
        List list = this.b;
        ProximityEventManagerImpl proximityEventManagerImpl = this.f25905a;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(LocalProximityEventWrapperImpl.INSTANCE.newInstance((IPSLocalProximityEvent) it.next(), proximityEventManagerImpl.i, new T3(proximityEventManagerImpl)));
        }
        set.addAll(arrayList);
        ProximityEventManagerImpl.access$getProximityStatsManager(this.f25905a).onNewTriggersCount(this.f25905a.f25902a, this.f25905a.j.size());
        return unit;
    }
}
