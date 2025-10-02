package me.oriient.internal.services.dataManager.plai;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.dataManager.building.BuildingId;

/* loaded from: classes7.dex */
public final class r extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25310a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C1372w c;
    public final /* synthetic */ BuildingId d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C1372w c1372w, BuildingId buildingId, Continuation continuation) {
        super(2, continuation);
        this.c = c1372w;
        this.d = buildingId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        r rVar = new r(this.c, this.d, continuation);
        rVar.b = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((Z) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25310a;
        if (i == 0) {
            ResultKt.b(obj);
            Z z = (Z) this.b;
            if (z != null && Math.abs(((TimeProvider) this.c.c.getD()).timeIntervalSinceNow(z.b)) <= ((InternalConfig) ((InternalConfigManager) this.c.b.getD()).getConfig().getValue()).getPlaiConfig().getPlaiInfoExpirationTimeMillis()) {
                InterfaceC1351a interfaceC1351a = (InterfaceC1351a) this.c.f25315a.getD();
                String value = this.d.getValue();
                this.f25310a = 1;
                C1364n c1364n = (C1364n) interfaceC1351a;
                c1364n.getClass();
                obj = c1364n.a(new C1359i(value), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return new Outcome.Success(null);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return ((Outcome) obj).map(C1367q.f25309a);
    }
}
