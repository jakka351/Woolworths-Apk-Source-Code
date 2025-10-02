package me.oriient.internal.services.dataManager.plaiCategories;

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

/* renamed from: me.oriient.internal.services.dataManager.plaiCategories.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1379d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25343a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C1384i c;
    public final /* synthetic */ BuildingId d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1379d(C1384i c1384i, BuildingId buildingId, Continuation continuation) {
        super(2, continuation);
        this.c = c1384i;
        this.d = buildingId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1379d c1379d = new C1379d(this.c, this.d, continuation);
        c1379d.b = obj;
        return c1379d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1379d) create((Z) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25343a;
        if (i == 0) {
            ResultKt.b(obj);
            Z z = (Z) this.b;
            if (z != null && Math.abs(((TimeProvider) this.c.c.getD()).timeIntervalSinceNow(z.b)) <= ((InternalConfig) ((InternalConfigManager) this.c.b.getD()).getConfig().getValue()).getPlaiConfig().getPlaiInfoExpirationTimeMillis()) {
                E e = (E) this.c.f25348a.getD();
                String value = this.d.getValue();
                this.f25343a = 1;
                S s = (S) e;
                s.getClass();
                obj = s.a(new M(value, s), this);
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
        return ((Outcome) obj).map(C1378c.f25342a);
    }
}
