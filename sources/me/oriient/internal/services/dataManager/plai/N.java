package me.oriient.internal.services.dataManager.plai;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Outcome;

/* loaded from: classes7.dex */
public final class N extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25284a;
    public final /* synthetic */ S b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(S s, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.b = s;
        this.c = str;
        this.d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new N(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25284a;
        if (i == 0) {
            ResultKt.b(obj);
            C1372w c1372w = this.b.f25289a;
            String str = this.c;
            String str2 = this.d;
            this.f25284a = 1;
            obj = c1372w.getData(str, str2, this);
            if (obj != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        M m = new M(this.b, this.c, this.d, null);
        this.f25284a = 2;
        Object objThen = ((Outcome) obj).then(m, this);
        return objThen == coroutineSingletons ? coroutineSingletons : objThen;
    }
}
