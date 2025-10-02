package au.com.woolworths.feature.shop.healthylifefoodtracker;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerRepository", f = "FoodTrackerRepository.kt", l = {156}, m = "updateFoodTrackerConsent")
/* loaded from: classes3.dex */
final class FoodTrackerRepository$updateFoodTrackerConsent$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ FoodTrackerRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoodTrackerRepository$updateFoodTrackerConsent$1(FoodTrackerRepository foodTrackerRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = foodTrackerRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(false, this);
    }
}
