package me.oriient.internal.services.dataManager.building;

import com.google.android.gms.wallet.WalletConstants;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.ServerError;

/* loaded from: classes7.dex */
public final class k extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25107a;
    public final /* synthetic */ v b;
    public final /* synthetic */ BuildingSearchPage c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(v vVar, BuildingSearchPage buildingSearchPage, Continuation continuation) {
        super(2, continuation);
        this.b = vVar;
        this.c = buildingSearchPage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new k(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25107a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        w wVar = (w) this.b.e.getD();
        this.f25107a = 1;
        ((D) wVar).getClass();
        Outcome.Failure failure = new Outcome.Failure(new ServerError(WalletConstants.ERROR_CODE_INVALID_PARAMETERS, "API not supported"));
        return failure == coroutineSingletons ? coroutineSingletons : failure;
    }
}
