package me.oriient.internal.services.dataManager.mapGrid;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;

/* loaded from: classes7.dex */
public final class F extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25195a;
    public /* synthetic */ Object b;
    public final /* synthetic */ G c;
    public final /* synthetic */ C1324w d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(G g, C1324w c1324w, Continuation continuation) {
        super(2, continuation);
        this.c = g;
        this.d = c1324w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        F f = new F(this.c, this.d, continuation);
        f.b = obj;
        return f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((MapGridRecord) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25195a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Outcome outcome = (Outcome) this.b;
            ResultKt.b(obj);
            return outcome;
        }
        ResultKt.b(obj);
        MapGridRecord mapGridRecord = (MapGridRecord) this.b;
        G g = this.c;
        ((Logger) g.d.getD()).d("MapGridRepository", "decryptMapGrid() called with: mapGridInternal = " + mapGridRecord.getMapId());
        Outcome map = g.f25196a.a(mapGridRecord.getData(), mapGridRecord.getVector(), mapGridRecord.getTag()).map(new D(mapGridRecord));
        G g2 = this.c;
        C1324w c1324w = this.d;
        if (map instanceof Outcome.Failure) {
            InterfaceC1303a interfaceC1303a = g2.c;
            this.b = map;
            this.f25195a = 1;
            if (((C1305c) interfaceC1303a).cleanData(c1324w, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return map;
    }
}
