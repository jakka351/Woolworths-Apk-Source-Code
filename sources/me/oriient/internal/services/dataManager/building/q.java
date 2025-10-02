package me.oriient.internal.services.dataManager.building;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;

/* loaded from: classes7.dex */
public final class q extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25113a;
    public final /* synthetic */ v b;
    public final /* synthetic */ String c;
    public final /* synthetic */ WorldCoordinate d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(v vVar, String str, WorldCoordinate worldCoordinate, float f, float f2, String str2, Continuation continuation) {
        super(2, continuation);
        this.b = vVar;
        this.c = str;
        this.d = worldCoordinate;
        this.e = f;
        this.f = f2;
        this.g = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new q(this.b, this.c, this.d, this.e, this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25113a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        Collection<G> collectionValues = this.b.g.values();
        Intrinsics.g(collectionValues, "<get-values>(...)");
        WorldCoordinate location = this.d;
        float f = this.f;
        for (G g : collectionValues) {
            g.getClass();
            Intrinsics.h(location, "location");
            if (location.distanceTo(g.f25095a) + f <= g.b) {
                List list = g.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((BuildingSearchResult) obj2).isInsideRadius$internal_publishRelease(location, g.b)) {
                        arrayList.add(obj2);
                    }
                }
                h = new H(new BuildingsSearchResult(arrayList, null));
            } else {
                h = I.f25097a;
            }
            if (h instanceof H) {
                return new Outcome.Success(((H) h).f25096a);
            }
        }
        v vVar = this.b;
        String str = this.c;
        WorldCoordinate worldCoordinate = this.d;
        float f2 = this.e;
        float f3 = this.f;
        String str2 = this.g;
        this.f25113a = 1;
        Object objA = v.a(vVar, str, worldCoordinate, f2, f3, str2, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
