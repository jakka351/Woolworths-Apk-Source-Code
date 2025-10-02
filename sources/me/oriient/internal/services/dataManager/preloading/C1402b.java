package me.oriient.internal.services.dataManager.preloading;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.services.dataManager.building.Floor;

/* renamed from: me.oriient.internal.services.dataManager.preloading.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1402b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25369a;
    public final /* synthetic */ DataPreloader b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Floor d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1402b(DataPreloader dataPreloader, String str, Floor floor, Continuation continuation) {
        super(2, continuation);
        this.b = dataPreloader;
        this.c = str;
        this.d = floor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1402b(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1402b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25369a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        DataPreloader dataPreloader = this.b;
        FloorDataPreloaderId floorDataPreloaderId = new FloorDataPreloaderId(this.c, this.d.getId());
        this.f25369a = 1;
        Object objPreloadData = dataPreloader.preloadData(floorDataPreloaderId, this);
        return objPreloadData == coroutineSingletons ? coroutineSingletons : objPreloadData;
    }
}
