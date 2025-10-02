package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import me.oriient.ipssdk.realtime.ips.Core;
import me.oriient.ipssdk.realtime.ips.Positioning;

/* renamed from: me.oriient.ipssdk.realtime.ofs.h3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1658h3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26083a;

    public C1658h3(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1658h3(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1658h3((Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26083a;
        if (i == 0) {
            ResultKt.b(obj);
            FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1L = FlowKt.l(Core.INSTANCE.getConnectionStateFlow(), Positioning.access$getConfigManager(Positioning.INSTANCE).getConfig(), new C1646f3(null));
            C1652g3 c1652g3 = C1652g3.f26078a;
            this.f26083a = 1;
            if (flowKt__ZipKt$combine$$inlined$unsafeFlow$1L.collect(c1652g3, this) == coroutineSingletons) {
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
