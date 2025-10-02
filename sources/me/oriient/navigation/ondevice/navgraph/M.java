package me.oriient.navigation.ondevice.navgraph;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.floorMetadata.FloorImage;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMetadata;
import me.oriient.internal.services.elog.ELog;

/* loaded from: classes8.dex */
public final class M extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26303a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Q c;
    public final /* synthetic */ w d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(Q q, w wVar, String str, Continuation continuation) {
        super(2, continuation);
        this.c = q;
        this.d = wVar;
        this.e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        M m = new M(this.c, this.d, this.e, continuation);
        m.b = obj;
        return m;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((FloorMetadata) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FloorImage floorImage;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26303a;
        if (i == 0) {
            ResultKt.b(obj);
            FloorImage navGraph = ((FloorMetadata) this.b).getNavGraph();
            if (navGraph == null || StringsKt.D(navGraph.getUrl())) {
                ((ELog) this.c.f26307a.getD()).i("NavGraphSource", "Map has empty navGraph", new K(this.d));
                w wVar = this.d;
                return new Outcome.Success(new NavGraphRecord(wVar.f26327a, wVar.b, this.e, Integer.MIN_VALUE, new NavGraph()));
            }
            B b = (B) this.c.d.getD();
            String url = navGraph.getUrl();
            this.b = navGraph;
            this.f26303a = 1;
            Object objA = ((G) b).a(url, this);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            floorImage = navGraph;
            obj = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floorImage = (FloorImage) this.b;
            ResultKt.b(obj);
        }
        return ((Outcome) obj).map(new L(this.d, this.e, floorImage));
    }
}
