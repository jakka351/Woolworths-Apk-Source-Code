package me.oriient.internal.services.uploadingManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: me.oriient.internal.services.uploadingManager.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1515d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25631a;
    public final /* synthetic */ C1536n b;
    public final /* synthetic */ double c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1515d(C1536n c1536n, double d, Continuation continuation) {
        super(2, continuation);
        this.b = c1536n;
        this.c = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1515d(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1515d(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25631a;
        if (i == 0) {
            ResultKt.b(obj);
            C1536n.a(this.b).d("DataUploadManager", "clearAllCaches() called with: exceptLastDays = " + this.c);
            C1536n c1536n = this.b;
            double d = this.c;
            this.f25631a = 1;
            if (C1536n.a(c1536n, d, this) == coroutineSingletons) {
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
