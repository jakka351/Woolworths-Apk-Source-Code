package me.oriient.positioningengine.ondevice.mappingData;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.services.dataManager.mapGrid.MapGridRepository;

/* loaded from: classes8.dex */
public final class u extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26449a;
    public final /* synthetic */ w b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ double f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, String str, String str2, String str3, double d, Continuation continuation) {
        super(2, continuation);
        this.b = wVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new u(this.b, this.c, this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26449a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        MapGridRepository mapGridRepository = (MapGridRepository) this.b.d.getD();
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        double d = this.f;
        this.f26449a = 1;
        Object mapGrid = mapGridRepository.getMapGrid(str, str2, str3, d, this);
        return mapGrid == coroutineSingletons ? coroutineSingletons : mapGrid;
    }
}
