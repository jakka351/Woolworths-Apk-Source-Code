package com.apollographql.apollo.network;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.NetworkMonitorKt__NetworkMonitorKt$waitForNetwork$2", f = "NetworkMonitor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NetworkMonitorKt__NetworkMonitorKt$waitForNetwork$2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
    public /* synthetic */ Object p;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NetworkMonitorKt__NetworkMonitorKt$waitForNetwork$2 networkMonitorKt__NetworkMonitorKt$waitForNetwork$2 = new NetworkMonitorKt__NetworkMonitorKt$waitForNetwork$2(2, continuation);
        networkMonitorKt__NetworkMonitorKt$waitForNetwork$2.p = obj;
        return networkMonitorKt__NetworkMonitorKt$waitForNetwork$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NetworkMonitorKt__NetworkMonitorKt$waitForNetwork$2) create((Boolean) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return Boolean.valueOf(!Intrinsics.c((Boolean) this.p, Boolean.TRUE));
    }
}
