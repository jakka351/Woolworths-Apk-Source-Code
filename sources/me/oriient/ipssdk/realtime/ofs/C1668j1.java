package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1;
import me.oriient.ipssdk.realtime.ips.DataManager;
import me.oriient.ipssdk.realtime.ips.Positioning;

/* renamed from: me.oriient.ipssdk.realtime.ofs.j1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1668j1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26092a;

    public C1668j1(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1668j1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1668j1((Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26092a;
        if (i == 0) {
            ResultKt.b(obj);
            DataManager dataManager = DataManager.INSTANCE;
            FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1I = FlowKt.i(DataManager.access$getAuthManager(dataManager).getCredentials(), DataManager.access$getRemoteConfigManager(dataManager).getConfig(), Positioning.INSTANCE.isPreheatingEnabled(), new C1662i1(null));
            this.f26092a = 1;
            if (FlowKt.g(flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1I, this) == coroutineSingletons) {
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
