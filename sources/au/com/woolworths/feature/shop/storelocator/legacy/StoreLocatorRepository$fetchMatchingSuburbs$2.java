package au.com.woolworths.feature.shop.storelocator.legacy;

import au.com.woolworths.feature.shop.storelocator.legacy.pickup.apis.PickUpSuburbResponseExtKt;
import au.com.woolworths.foundation.shop.storelocator.models.PickUpSuburbResponse;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.PickUpSuburb;
import io.reactivex.Single;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lau/com/woolworths/foundation/shop/storelocator/pickup/models/PickUpSuburb;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository$fetchMatchingSuburbs$2", f = "StoreLocatorRepository.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class StoreLocatorRepository$fetchMatchingSuburbs$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends PickUpSuburb>>, Object> {
    public int p;
    public final /* synthetic */ StoreLocatorRepository q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreLocatorRepository$fetchMatchingSuburbs$2(StoreLocatorRepository storeLocatorRepository, String str, Continuation continuation) {
        super(2, continuation);
        this.q = storeLocatorRepository;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoreLocatorRepository$fetchMatchingSuburbs$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StoreLocatorRepository$fetchMatchingSuburbs$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Single<PickUpSuburbResponse> singleB = this.q.f8165a.b(this.r);
            this.p = 1;
            obj = RxAwaitKt.b(singleB, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        Intrinsics.g(obj, "await(...)");
        return PickUpSuburbResponseExtKt.a((PickUpSuburbResponse) obj);
    }
}
