package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.ipssdk.realtime.services.tag.EventTaggingManagerImpl;
import me.oriient.ipssdk.realtime.services.tag.model.EventTagRecord;

/* loaded from: classes8.dex */
public final class Q1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25994a;
    public final /* synthetic */ EventTaggingManagerImpl b;
    public final /* synthetic */ EventTagRecord c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q1(EventTaggingManagerImpl eventTaggingManagerImpl, EventTagRecord eventTagRecord, Continuation continuation) {
        super(2, continuation);
        this.b = eventTaggingManagerImpl;
        this.c = eventTagRecord;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Q1(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Q1(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25994a;
        if (i == 0) {
            ResultKt.b(obj);
            EventTaggingManagerImpl eventTaggingManagerImpl = this.b;
            EventTagRecord eventTagRecord = this.c;
            this.f25994a = 1;
            if (EventTaggingManagerImpl.access$onRequestError(eventTaggingManagerImpl, eventTagRecord, this) == coroutineSingletons) {
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
