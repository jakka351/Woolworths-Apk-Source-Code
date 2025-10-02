package me.oriient.internal.services.dataManager.preloading;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.building.BuildingRepository;

/* renamed from: me.oriient.internal.services.dataManager.preloading.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1405e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25372a;
    public /* synthetic */ Object b;
    public final /* synthetic */ BuildingDataPreloader c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1405e(BuildingDataPreloader buildingDataPreloader, String str, Continuation continuation) {
        super(2, continuation);
        this.c = buildingDataPreloader;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1405e c1405e = new C1405e(this.c, this.d, continuation);
        c1405e.b = obj;
        return c1405e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1405e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25372a;
        if (i == 0) {
            ResultKt.b(obj);
            coroutineScope = (CoroutineScope) this.b;
            BuildingRepository buildingRepository = this.c.getBuildingRepository();
            String str = this.d;
            this.b = coroutineScope;
            this.f25372a = 1;
            obj = buildingRepository.fetchBuilding(str, this);
            if (obj != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        coroutineScope = (CoroutineScope) this.b;
        ResultKt.b(obj);
        C1404d c1404d = new C1404d(this.c, coroutineScope, this.d, null);
        this.b = null;
        this.f25372a = 2;
        Object objThen = ((Outcome) obj).then(c1404d, this);
        return objThen == coroutineSingletons ? coroutineSingletons : objThen;
    }
}
