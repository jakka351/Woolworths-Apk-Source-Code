package me.oriient.navigation.ondevice;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.services.dataManager.building.Floor;
import me.oriient.navigation.ondevice.navgraph.NavGraphRepository;

/* renamed from: me.oriient.navigation.ondevice.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1789e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26284a;
    public final /* synthetic */ o b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Floor d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1789e(o oVar, String str, Floor floor, Continuation continuation) {
        super(2, continuation);
        this.b = oVar;
        this.c = str;
        this.d = floor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1789e(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1789e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26284a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        NavGraphRepository navGraphRepository = (NavGraphRepository) this.b.e.getD();
        String str = this.c;
        String id = this.d.getId();
        this.f26284a = 1;
        Object navGraph = navGraphRepository.getNavGraph(str, id, 0.0d, this);
        return navGraph == coroutineSingletons ? coroutineSingletons : navGraph;
    }
}
