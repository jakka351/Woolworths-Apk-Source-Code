package me.oriient.ipssdk.common.ofs;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import me.oriient.ipssdk.common.services.geofencing.LiveGeofenceStatusesProviderImpl;

/* loaded from: classes2.dex */
public final class f0 extends SuspendLambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Map f25748a;
    public /* synthetic */ Map b;
    public final /* synthetic */ LiveGeofenceStatusesProviderImpl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(LiveGeofenceStatusesProviderImpl liveGeofenceStatusesProviderImpl, Continuation continuation) {
        super(3, continuation);
        this.c = liveGeofenceStatusesProviderImpl;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        f0 f0Var = new f0(this.c, (Continuation) obj3);
        f0Var.f25748a = (Map) obj;
        f0Var.b = (Map) obj2;
        return f0Var.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        Map map = this.f25748a;
        Map map2 = this.b;
        LiveGeofenceStatusesProviderImpl liveGeofenceStatusesProviderImpl = this.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.h(map2.size()));
        for (Map.Entry entry : map2.entrySet()) {
            linkedHashMap.put(entry.getKey(), LiveGeofenceStatusesProviderImpl.access$correctStatusTimestamp(liveGeofenceStatusesProviderImpl, map, entry));
        }
        return linkedHashMap;
    }
}
