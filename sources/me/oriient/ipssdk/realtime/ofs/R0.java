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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.building.BuildingRepository;
import me.oriient.internal.services.dataManager.building.BuildingSearchResult;
import me.oriient.internal.services.dataManager.building.BuildingsSearchResult;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;
import me.oriient.ipssdk.api.listeners.IPSBuildingsSearchListener;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.realtime.ips.BuildingSearchResultForApiKt;
import me.oriient.ipssdk.realtime.ips.CoreLogic;
import me.oriient.ipssdk.realtime.utils.ExtensionsKt;

/* loaded from: classes8.dex */
public final class R0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25998a;
    public final /* synthetic */ User b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ IPSBuildingsSearchListener g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(User user, float f, float f2, float f3, float f4, IPSBuildingsSearchListener iPSBuildingsSearchListener, Continuation continuation) {
        super(2, continuation);
        this.b = user;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = iPSBuildingsSearchListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new R0(this.b, this.c, this.d, this.e, this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((R0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        R0 r0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25998a;
        if (i == 0) {
            ResultKt.b(obj);
            BuildingRepository buildingRepositoryAccess$getBuildingRepository = CoreLogic.access$getBuildingRepository(CoreLogic.INSTANCE);
            String id = this.b.getSpace().getId();
            WorldCoordinate worldCoordinate = new WorldCoordinate(this.c, this.d, 0.0d, 4, (DefaultConstructorMarker) null);
            float f = this.e;
            float f2 = this.f;
            this.f25998a = 1;
            r0 = this;
            obj = buildingRepositoryAccess$getBuildingRepository.searchBuildings(id, worldCoordinate, f, f2, CoreLogic.SEARCH_BUILDING_REQUEST_ID, r0);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            r0 = this;
        }
        Outcome outcome = (Outcome) obj;
        if (outcome instanceof Outcome.Failure) {
            IPSError ipsError = ExtensionsKt.toIpsError((OriientError) ((Outcome.Failure) outcome).getValue());
            Logger loggerAccess$getLogger = CoreLogic.access$getLogger(CoreLogic.INSTANCE);
            String strAccess$getTAG$p = CoreLogic.access$getTAG$p();
            StringBuilder sbA = AbstractC1685m0.a(strAccess$getTAG$p, "access$getTAG$p(...)", "searchBuildingsByLocation onError() called with: error = [");
            sbA.append(ipsError.getMessage());
            sbA.append(']');
            loggerAccess$getLogger.e(strAccess$getTAG$p, sbA.toString());
            IPSBuildingsSearchListener iPSBuildingsSearchListener = r0.g;
            if (iPSBuildingsSearchListener != null) {
                iPSBuildingsSearchListener.onError(ipsError);
            }
        } else if (outcome instanceof Outcome.Success) {
            List<BuildingSearchResult> results = ((BuildingsSearchResult) ((Outcome.Success) outcome).getValue()).getResults();
            ArrayList arrayList = new ArrayList(CollectionsKt.s(results, 10));
            Iterator<T> it = results.iterator();
            while (it.hasNext()) {
                arrayList.add(BuildingSearchResultForApiKt.toIpsBuildingSearchResult((BuildingSearchResult) it.next()));
            }
            IPSBuildingsSearchListener iPSBuildingsSearchListener2 = r0.g;
            if (iPSBuildingsSearchListener2 != null) {
                iPSBuildingsSearchListener2.onBuildingsSearchReceived(arrayList);
            }
        }
        return Unit.f24250a;
    }
}
