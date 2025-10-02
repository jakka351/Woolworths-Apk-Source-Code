package au.com.woolworths.feature.shop.storelocator.legacy;

import android.net.Uri;
import au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult;
import au.com.woolworths.foundation.shop.storelocator.network.StoreLocatorApiInterface;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Lau/com/woolworths/android/onesite/models/storelocator/StoreLocatorResult$Store;", "kotlin.jvm.PlatformType", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository$fetchNearbyStoresLegacy$2", f = "StoreLocatorRepository.kt", l = {44}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class StoreLocatorRepository$fetchNearbyStoresLegacy$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<StoreLocatorResult.Store>>, Object> {
    public int p;
    public final /* synthetic */ StoreLocatorRepository q;
    public final /* synthetic */ double r;
    public final /* synthetic */ double s;
    public final /* synthetic */ Integer t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreLocatorRepository$fetchNearbyStoresLegacy$2(StoreLocatorRepository storeLocatorRepository, double d, double d2, Integer num, Continuation continuation) {
        super(2, continuation);
        this.q = storeLocatorRepository;
        this.r = d;
        this.s = d2;
        this.t = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoreLocatorRepository$fetchNearbyStoresLegacy$2(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StoreLocatorRepository$fetchNearbyStoresLegacy$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            StoreLocatorRepository storeLocatorRepository = this.q;
            Uri.Builder builderBuildUpon = Uri.parse(storeLocatorRepository.b.a() + "/stores").buildUpon();
            builderBuildUpon.appendQueryParameter("lat", String.valueOf(this.r));
            builderBuildUpon.appendQueryParameter("lon", String.valueOf(this.s));
            builderBuildUpon.appendQueryParameter("type", "geocode");
            Integer num = this.t;
            if (num != null) {
                builderBuildUpon.appendQueryParameter("max", num.toString());
            }
            StoreLocatorApiInterface storeLocatorApiInterface = storeLocatorRepository.f8165a;
            String string = builderBuildUpon.build().toString();
            Intrinsics.g(string, "toString(...)");
            Single<StoreLocatorResult> singleA = storeLocatorApiInterface.a(string);
            this.p = 1;
            obj = RxAwaitKt.b(singleA, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return ((StoreLocatorResult) obj).getStores();
    }
}
