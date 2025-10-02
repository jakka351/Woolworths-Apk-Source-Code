package me.oriient.internal.services.dataManager.plai;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class P extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25286a;
    public final /* synthetic */ S b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(S s, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.b = s;
        this.c = str;
        this.d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new P(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((P) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25286a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        C1372w c1372w = this.b.f25289a;
        String str = this.c;
        String str2 = this.d;
        this.f25286a = 1;
        Object data = c1372w.getData(str, str2, this);
        return data == coroutineSingletons ? coroutineSingletons : data;
    }
}
