package me.oriient.internal.services.dataManager.plaiCategories;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.building.BuildingId;
import me.oriient.internal.services.dataManager.rest.RestHelper;

/* renamed from: me.oriient.internal.services.dataManager.plaiCategories.z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1400z extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25361a;
    public final /* synthetic */ D b;
    public final /* synthetic */ BuildingId c;
    public final /* synthetic */ a0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1400z(D d, BuildingId buildingId, a0 a0Var, Continuation continuation) {
        super(2, continuation);
        this.b = d;
        this.c = buildingId;
        this.d = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1400z(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1400z) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C1400z c1400z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25361a;
        if (i == 0) {
            ResultKt.b(obj);
            T t = (T) this.b.c.getD();
            String value = this.c.getValue();
            a0 a0Var = this.d;
            String str = a0Var.f25340a;
            String str2 = a0Var.b;
            this.f25361a = 1;
            Y y = (Y) t;
            ((Logger) y.b.getD()).d("PlaiCategoryRest", "fetchPlaiCategoryData() called with: url = " + str2);
            c1400z = this;
            obj = ((RestHelper) y.d.getD()).getStringData("PlaiCategoryRest", str2, true, new W(y, value, str), c1400z);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            c1400z = this;
        }
        Outcome outcome = (Outcome) obj;
        D d = c1400z.b;
        a0 a0Var2 = c1400z.d;
        if (outcome instanceof Outcome.Failure) {
            OriientError oriientError = (OriientError) ((Outcome.Failure) outcome).getValue();
            ((Logger) d.b.getD()).e("PlaiCategoriesSource", "failed to get data for floor " + a0Var2.f25340a, oriientError);
        }
        return outcome;
    }
}
