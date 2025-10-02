package me.oriient.ipssdk.realtime.ofs;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.SharedFlow;
import me.oriient.internal.services.dataManager.preloading.DataPreloadingManager;
import me.oriient.ipssdk.realtime.ips.DataManager;

/* renamed from: me.oriient.ipssdk.realtime.ofs.p1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1704p1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26126a;

    public C1704p1(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1704p1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1704p1((Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26126a;
        if (i == 0) {
            ResultKt.b(obj);
            SharedFlow<DataPreloadingManager.PreloadingError> errors = DataManager.access$getDataPreloadingManager(DataManager.INSTANCE).getErrors();
            C1698o1 c1698o1 = C1698o1.f26120a;
            this.f26126a = 1;
            if (errors.collect(c1698o1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
