package me.oriient.internal.services.dataManager.building;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.rest.RestHelper;

/* loaded from: classes7.dex */
public final class n extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25110a;
    public final /* synthetic */ v b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(v vVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.b = vVar;
        this.c = str;
        this.d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strConcat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25110a;
        if (i == 0) {
            ResultKt.b(obj);
            w wVar = (w) this.b.e.getD();
            String str = this.c;
            String str2 = this.d;
            this.f25110a = 1;
            D d = (D) wVar;
            if (str == null) {
                strConcat = "";
            } else {
                d.getClass();
                strConcat = "?filter=".concat(str);
            }
            obj = RestHelper.DefaultImpls.getStringData$default((RestHelper) d.b.getD(), "BuildingRest", ((OriientApiProvider) d.f25093a.getD()).getOriientApi().getRealtimeUrl() + "/v5/space/" + str2 + "/buildings" + strConcat, false, new B(d), this, 4, null);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return ((Outcome) obj).map(m.f25109a);
    }
}
