package me.oriient.ipssdk.realtime.ofs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.region.BuildingRegion;
import me.oriient.internal.services.dataManager.region.RegionRepository;
import me.oriient.ipssdk.api.listeners.IPSGetByIdListener;
import me.oriient.ipssdk.realtime.ips.Content;
import me.oriient.ipssdk.realtime.utils.ExtensionsKt;
import me.oriient.ipssdk.realtime.utils.models.RegionKt;

/* loaded from: classes8.dex */
public final class I extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25953a;
    public final /* synthetic */ String b;
    public final /* synthetic */ IPSGetByIdListener c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(String str, IPSGetByIdListener iPSGetByIdListener, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = iPSGetByIdListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new I(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new I(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25953a;
        if (i == 0) {
            ResultKt.b(obj);
            RegionRepository regionRepositoryAccess$getRegionRepository = Content.access$getRegionRepository(Content.INSTANCE);
            String str = this.b;
            this.f25953a = 1;
            obj = regionRepositoryAccess$getRegionRepository.getRegions(str, this);
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
        IPSGetByIdListener iPSGetByIdListener = this.c;
        if (outcome instanceof Outcome.Success) {
            List list = (List) ((Outcome.Success) outcome).getValue();
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(RegionKt.toRegion((BuildingRegion) it.next()));
            }
            iPSGetByIdListener.onResults(arrayList);
        }
        IPSGetByIdListener iPSGetByIdListener2 = this.c;
        if (outcome instanceof Outcome.Failure) {
            iPSGetByIdListener2.onError(ExtensionsKt.toIpsError((OriientError) ((Outcome.Failure) outcome).getValue()));
        }
        return Unit.f24250a;
    }
}
