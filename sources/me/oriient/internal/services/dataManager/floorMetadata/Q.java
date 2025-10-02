package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.Outcome;

/* loaded from: classes7.dex */
public final class Q extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25147a;
    public /* synthetic */ Object b;
    public final /* synthetic */ U c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(U u, Continuation continuation) {
        super(2, continuation);
        this.c = u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Q q = new Q(this.c, continuation);
        q.b = obj;
        return q;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Q q = new Q(this.c, (Continuation) obj2);
        q.b = (FloorMetadata) obj;
        return q.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FloorMetadata floorMetadata;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25147a;
        if (i == 0) {
            ResultKt.b(obj);
            FloorMetadata floorMetadata2 = (FloorMetadata) this.b;
            if (floorMetadata2 == null) {
                return new Outcome.Success(null);
            }
            FloorImagesProvider floorImagesProvider = (FloorImagesProvider) this.c.c.getD();
            this.b = floorMetadata2;
            this.f25147a = 1;
            Object cachedSvgFloorImage = floorImagesProvider.getCachedSvgFloorImage(floorMetadata2, this);
            if (cachedSvgFloorImage == coroutineSingletons) {
                return coroutineSingletons;
            }
            floorMetadata = floorMetadata2;
            obj = cachedSvgFloorImage;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floorMetadata = (FloorMetadata) this.b;
            ResultKt.b(obj);
        }
        return ((Outcome) obj).map(new P(floorMetadata));
    }
}
