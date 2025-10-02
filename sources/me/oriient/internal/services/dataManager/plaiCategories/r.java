package me.oriient.internal.services.dataManager.plaiCategories;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.building.BuildingKt;

/* loaded from: classes7.dex */
public final class r extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25354a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C1397w c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C1397w c1397w, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.c = c1397w;
        this.d = str;
        this.e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        r rVar = new r(this.c, this.d, this.e, continuation);
        rVar.b = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((C1376a) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25354a;
        if (i == 0) {
            ResultKt.b(obj);
            C1376a c1376a = (C1376a) this.b;
            int i2 = AbstractC1392q.$EnumSwitchMapping$0[c1376a.b.ordinal()];
            if (i2 == 1) {
                C1397w c1397w = this.c;
                String str = this.d;
                String str2 = this.e;
                List list = c1376a.f25339a;
                c1397w.getClass();
                return new Outcome.Success(C1397w.a(str, str2, list));
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                this.c.c.refreshDataInBackground(BuildingKt.getAsBuildingId(this.d));
                C1397w c1397w2 = this.c;
                String str3 = this.d;
                String str4 = this.e;
                List list2 = c1376a.f25339a;
                c1397w2.getClass();
                return new Outcome.Success(C1397w.a(str3, str4, list2));
            }
            C1397w c1397w3 = this.c;
            String str5 = this.d;
            String str6 = this.e;
            this.f25354a = 1;
            obj = C1397w.a(c1397w3, str5, str6, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return (Outcome) obj;
    }
}
