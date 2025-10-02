package me.oriient.internal.services.dataManager.plai;

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
public final class M extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25283a;
    public /* synthetic */ Object b;
    public final /* synthetic */ S c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(S s, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.c = s;
        this.d = str;
        this.e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        M m = new M(this.c, this.d, this.e, continuation);
        m.b = obj;
        return m;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((C1365o) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25283a;
        if (i == 0) {
            ResultKt.b(obj);
            C1365o c1365o = (C1365o) this.b;
            int i2 = L.$EnumSwitchMapping$0[c1365o.b.ordinal()];
            if (i2 == 1) {
                return new Outcome.Success(this.c.a(this.d, this.e, c1365o.f25307a));
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                this.c.c.refreshDataInBackground(BuildingKt.getAsBuildingId(this.d));
                return new Outcome.Success(this.c.a(this.d, this.e, c1365o.f25307a));
            }
            S s = this.c;
            String str = this.d;
            String str2 = this.e;
            this.f25283a = 1;
            obj = S.a(s, str, str2, this);
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
