package au.com.woolworths.feature.shop.storelocator.legacy;

import android.location.Location;
import au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult;
import au.com.woolworths.foundation.shop.storelocator.network.StoreLocatorApiInterface;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/android/onesite/models/storelocator/StoreLocatorResult$Store;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository$getStoreDetail$2", f = "StoreLocatorRepository.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class StoreLocatorRepository$getStoreDetail$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super StoreLocatorResult.Store>, Object> {
    public int p;
    public final /* synthetic */ StoreLocatorRepository q;
    public final /* synthetic */ String r;
    public final /* synthetic */ Location s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreLocatorRepository$getStoreDetail$2(StoreLocatorRepository storeLocatorRepository, String str, Location location, Continuation continuation) {
        super(2, continuation);
        this.q = storeLocatorRepository;
        this.r = str;
        this.s = location;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoreLocatorRepository$getStoreDetail$2(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StoreLocatorRepository$getStoreDetail$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        StoreLocatorApiInterface storeLocatorApiInterface = this.q.f8165a;
        Location location = this.s;
        Single<StoreLocatorResult.Store> singleC = storeLocatorApiInterface.c(this.r, location != null ? new Double(location.getLatitude()) : null, location != null ? new Double(location.getLongitude()) : null);
        this.p = 1;
        Object objB = RxAwaitKt.b(singleC, this);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }
}
