package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.DataRepository;

/* loaded from: classes7.dex */
public final class r extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25168a;
    public final /* synthetic */ FloorMetadataRepositoryImpl b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(FloorMetadataRepositoryImpl floorMetadataRepositoryImpl, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.b = floorMetadataRepositoryImpl;
        this.c = str;
        this.d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new r(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25168a;
        if (i == 0) {
            ResultKt.b(obj);
            DataRepository dataRepository = this.b.floorMetadataWithSvgImageRepository;
            FloorFetchData floorFetchData = new FloorFetchData(this.c, this.d);
            this.f25168a = 1;
            obj = dataRepository.getData(floorFetchData, true, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        Outcome outcome = (Outcome) obj;
        FloorMetadataRepositoryImpl floorMetadataRepositoryImpl = this.b;
        String str = this.d;
        if (outcome instanceof Outcome.Success) {
            kotlin.reflect.jvm.internal.impl.types.checker.a.q("floorId", str, floorMetadataRepositoryImpl.getELog(), "FloorMetadataRepository", "fetchFloorMetadataWithSvg");
        }
        FloorMetadataRepositoryImpl floorMetadataRepositoryImpl2 = this.b;
        String str2 = this.d;
        if (outcome instanceof Outcome.Failure) {
            floorMetadataRepositoryImpl2.getELog().e("FloorMetadataRepository", "Failed to fetchFloorMetadataWithSvg", MapsKt.j(new Pair("floorId", str2), new Pair("errorMessage", ((OriientError) ((Outcome.Failure) outcome).getValue()).getMessage())));
        }
        return outcome;
    }
}
