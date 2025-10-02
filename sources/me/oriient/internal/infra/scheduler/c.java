package me.oriient.internal.infra.scheduler;

import android.content.Context;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f24984a;
    public final /* synthetic */ WorkWrapper b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WorkWrapper workWrapper, Continuation continuation) {
        super(2, continuation);
        this.b = workWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new c(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f24984a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        String strB = this.b.getInputData().b("workerClassName");
        Intrinsics.e(strB);
        Constructor<?>[] constructors = Class.forName(strB, false, this.b.getApplicationContext().getClassLoader()).getConstructors();
        Intrinsics.g(constructors, "getConstructors(...)");
        Object objNewInstance = ((Constructor) ArraysKt.G(constructors)).newInstance(null);
        Intrinsics.f(objNewInstance, "null cannot be cast to non-null type me.oriient.internal.infra.scheduler.Work");
        Work work = (Work) objNewInstance;
        if (work instanceof WorkAndroid) {
            Context applicationContext = this.b.getApplicationContext();
            Intrinsics.g(applicationContext, "getApplicationContext(...)");
            ((WorkAndroid) work).setContext(applicationContext);
        }
        this.f24984a = 1;
        Object objDoWork = work.doWork(this);
        return objDoWork == coroutineSingletons ? coroutineSingletons : objDoWork;
    }
}
