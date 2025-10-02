package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1;
import me.oriient.ipssdk.realtime.ips.Core;
import me.oriient.ipssdk.realtime.ips.Positioning;

/* renamed from: me.oriient.ipssdk.realtime.ofs.c3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1628c3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26055a;

    public C1628c3(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1628c3(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1628c3((Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26055a;
        if (i == 0) {
            ResultKt.b(obj);
            Positioning positioning = Positioning.INSTANCE;
            FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1I = FlowKt.i(positioning.isPreheatingEnabled(), Core.INSTANCE.getConnectionStateFlow(), Positioning.access$getConfigManager(positioning).getConfig(), new C1622b3(null));
            this.f26055a = 1;
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
