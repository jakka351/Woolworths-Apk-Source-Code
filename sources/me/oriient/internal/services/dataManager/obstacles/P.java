package me.oriient.internal.services.dataManager.obstacles;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.floorMetadata.FloorImage;
import me.oriient.internal.services.dataManager.rest.RestHelper;

/* loaded from: classes7.dex */
public final class P extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f25241a;
    public final /* synthetic */ U b;
    public final /* synthetic */ FloorImage c;
    public final /* synthetic */ String d;
    public final /* synthetic */ C1349u e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(U u, FloorImage floorImage, String str, C1349u c1349u, Continuation continuation) {
        super(1, continuation);
        this.b = u;
        this.c = floorImage;
        this.d = str;
        this.e = c1349u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new P(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((P) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        P p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25241a;
        if (i == 0) {
            ResultKt.b(obj);
            I i2 = (I) this.b.e.getD();
            String url = this.c.getUrl();
            int version = this.c.getVersion();
            this.f25241a = 1;
            p = this;
            obj = ((RestHelper) ((L) i2).f25238a.getD()).getStringData("ObstaclesRest", url, true, new K(version), p);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            p = this;
        }
        return ((Outcome) obj).map(new O(p.d, p.e));
    }
}
