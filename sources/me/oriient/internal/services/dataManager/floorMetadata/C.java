package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.Outcome;

/* loaded from: classes7.dex */
public final class C extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25135a;
    public /* synthetic */ Object b;
    public final /* synthetic */ F c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(F f, Continuation continuation) {
        super(2, continuation);
        this.c = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C c = new C(this.c, continuation);
        c.b = obj;
        return c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C c = new C(this.c, (Continuation) obj2);
        c.b = (FloorMetadata) obj;
        return c.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FloorMetadata floorMetadata;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25135a;
        if (i == 0) {
            ResultKt.b(obj);
            FloorMetadata floorMetadata2 = (FloorMetadata) this.b;
            if (floorMetadata2 == null) {
                return new Outcome.Success(null);
            }
            FloorImagesProvider floorImagesProvider = (FloorImagesProvider) this.c.c.getD();
            this.b = floorMetadata2;
            this.f25135a = 1;
            Object cachedFloorImage = floorImagesProvider.getCachedFloorImage(floorMetadata2, this);
            if (cachedFloorImage == coroutineSingletons) {
                return coroutineSingletons;
            }
            floorMetadata = floorMetadata2;
            obj = cachedFloorImage;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floorMetadata = (FloorMetadata) this.b;
            ResultKt.b(obj);
        }
        return ((Outcome) obj).map(new B(floorMetadata));
    }
}
