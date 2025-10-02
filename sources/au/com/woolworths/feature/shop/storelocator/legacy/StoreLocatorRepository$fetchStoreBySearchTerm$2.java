package au.com.woolworths.feature.shop.storelocator.legacy;

import android.net.Uri;
import au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult;
import au.com.woolworths.foundation.shop.storelocator.network.StoreLocatorApiInterface;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.StoreLocatorExtKt;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lau/com/woolworths/foundation/shop/storelocator/pickup/models/Store;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository$fetchStoreBySearchTerm$2", f = "StoreLocatorRepository.kt", l = {63}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class StoreLocatorRepository$fetchStoreBySearchTerm$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Store>>, Object> {
    public int p;
    public final /* synthetic */ StoreLocatorRepository q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreLocatorRepository$fetchStoreBySearchTerm$2(StoreLocatorRepository storeLocatorRepository, String str, Continuation continuation) {
        super(2, continuation);
        this.q = storeLocatorRepository;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoreLocatorRepository$fetchStoreBySearchTerm$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StoreLocatorRepository$fetchStoreBySearchTerm$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            StoreLocatorRepository storeLocatorRepository = this.q;
            Uri.Builder builderBuildUpon = Uri.parse(storeLocatorRepository.b.a() + "/stores").buildUpon();
            builderBuildUpon.appendQueryParameter("q", this.r);
            builderBuildUpon.appendQueryParameter("max", "50");
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
        List<StoreLocatorResult.Store> stores = ((StoreLocatorResult) obj).getStores();
        Intrinsics.g(stores, "getStores(...)");
        List<StoreLocatorResult.Store> list = stores;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (StoreLocatorResult.Store store : list) {
            Intrinsics.e(store);
            arrayList.add(StoreLocatorExtKt.a(store));
        }
        return arrayList;
    }
}
