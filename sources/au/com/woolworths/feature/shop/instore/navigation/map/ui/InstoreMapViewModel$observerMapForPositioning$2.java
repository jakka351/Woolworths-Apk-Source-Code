package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import au.com.woolworths.feature.shop.instore.navigation.map.data.Building;
import au.com.woolworths.feature.shop.instore.navigation.map.data.Floor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientError;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientResult;", "", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError;", "building", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/Building;", "floor", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/Floor;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$observerMapForPositioning$2", f = "InstoreMapViewModel.kt", l = {1097, 1100}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InstoreMapViewModel$observerMapForPositioning$2 extends SuspendLambda implements Function3<Building, Floor, Continuation<? super OriientResult<Unit, OriientError>>, Object> {
    public int p;
    public /* synthetic */ Building q;
    public /* synthetic */ Floor r;
    public final /* synthetic */ InstoreMapViewModel s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreMapViewModel$observerMapForPositioning$2(InstoreMapViewModel instoreMapViewModel, Continuation continuation) {
        super(3, continuation);
        this.s = instoreMapViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InstoreMapViewModel$observerMapForPositioning$2 instoreMapViewModel$observerMapForPositioning$2 = new InstoreMapViewModel$observerMapForPositioning$2(this.s, (Continuation) obj3);
        instoreMapViewModel$observerMapForPositioning$2.q = (Building) obj;
        instoreMapViewModel$observerMapForPositioning$2.r = (Floor) obj2;
        return instoreMapViewModel$observerMapForPositioning$2.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Building building;
        InstoreMapViewModel instoreMapViewModel = this.s;
        PositioningInteractor positioningInteractor = instoreMapViewModel.j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            building = this.q;
            Floor floor = this.r;
            Timber.Forest forest = Timber.f27013a;
            forest.b("oriient buildingInteractor.currentBuilding = " + building, new Object[0]);
            forest.b("oriient buildingInteractor.currentFloor = " + floor, new Object[0]);
            if (!Intrinsics.c(positioningInteractor.a().getValue(), building.f7331a)) {
                this.q = building;
                this.p = 1;
                if (positioningInteractor.e(this) != coroutineSingletons) {
                }
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        building = this.q;
        ResultKt.b(obj);
        String str = building.f7331a;
        Floor floor2 = instoreMapViewModel.A;
        Integer num = floor2 != null ? new Integer(floor2.d) : null;
        this.q = null;
        this.p = 2;
        Object objD = positioningInteractor.d(str, num, this);
        return objD == coroutineSingletons ? coroutineSingletons : objD;
    }
}
