package me.oriient.internal.services.dataPriorityLoader;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25428a;
    public final /* synthetic */ DataPriorityLoaderImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DataPriorityLoaderImpl dataPriorityLoaderImpl, Continuation continuation) {
        super(2, continuation);
        this.b = dataPriorityLoaderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new e(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25428a;
        Unit unit = Unit.f24250a;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.b.maxConcurrent;
            DataPriorityLoaderImpl dataPriorityLoaderImpl = this.b;
            b bVar = new b(dataPriorityLoaderImpl);
            this.f25428a = 1;
            Object objCollect = flow.collect(new d(bVar, dataPriorityLoaderImpl), this);
            if (objCollect != coroutineSingletons) {
                objCollect = unit;
            }
            if (objCollect == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return unit;
    }
}
