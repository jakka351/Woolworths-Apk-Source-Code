package au.com.woolworths.feature.shop.delivery.address;

import au.com.woolworths.base.shopapp.models.address.SuburbResult;
import io.reactivex.Observable;
import java.util.List;
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

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Lau/com/woolworths/base/shopapp/models/address/SuburbResult$Suburb;", "kotlin.jvm.PlatformType", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.delivery.address.DeliveryAddressRepository$searchSuburbsByPostcode$2", f = "DeliveryAddressRepository.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DeliveryAddressRepository$searchSuburbsByPostcode$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<SuburbResult.Suburb>>, Object> {
    public int p;
    public final /* synthetic */ DeliveryAddressRepository q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryAddressRepository$searchSuburbsByPostcode$2(DeliveryAddressRepository deliveryAddressRepository, String str, Continuation continuation) {
        super(2, continuation);
        this.q = deliveryAddressRepository;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryAddressRepository$searchSuburbsByPostcode$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryAddressRepository$searchSuburbsByPostcode$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
        Observable observableB = this.q.b.b(this.r);
        this.p = 1;
        Object objF = RxAwaitKt.f(observableB, this);
        return objF == coroutineSingletons ? coroutineSingletons : objF;
    }
}
