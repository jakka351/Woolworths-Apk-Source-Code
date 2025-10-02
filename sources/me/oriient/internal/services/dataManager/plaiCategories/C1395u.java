package me.oriient.internal.services.dataManager.plaiCategories;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: me.oriient.internal.services.dataManager.plaiCategories.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1395u extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25357a;
    public final /* synthetic */ C1397w b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1395u(C1397w c1397w, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.b = c1397w;
        this.c = str;
        this.d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1395u(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1395u) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25357a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        C1384i c1384i = this.b.f25359a;
        String str = this.c;
        String str2 = this.d;
        this.f25357a = 1;
        Object data = c1384i.getData(str, str2, this);
        return data == coroutineSingletons ? coroutineSingletons : data;
    }
}
