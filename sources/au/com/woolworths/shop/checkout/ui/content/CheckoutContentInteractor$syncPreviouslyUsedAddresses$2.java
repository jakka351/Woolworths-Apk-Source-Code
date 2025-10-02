package au.com.woolworths.shop.checkout.ui.content;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerError;
import au.com.woolworths.android.onesite.network.ServerErrorCode;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.base.shopapp.models.address.SaveAddressResult;
import au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository;
import io.reactivex.internal.operators.single.SingleCache;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import retrofit2.HttpException;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Lau/com/woolworths/base/shopapp/models/address/SaveAddressResult$Address;", "kotlin.jvm.PlatformType", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.content.CheckoutContentInteractor$syncPreviouslyUsedAddresses$2", f = "CheckoutContentInteractor.kt", l = {123}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CheckoutContentInteractor$syncPreviouslyUsedAddresses$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<SaveAddressResult.Address>>, Object> {
    public int p;
    public final /* synthetic */ CheckoutContentInteractor q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutContentInteractor$syncPreviouslyUsedAddresses$2(CheckoutContentInteractor checkoutContentInteractor, Continuation continuation) {
        super(2, continuation);
        this.q = checkoutContentInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutContentInteractor$syncPreviouslyUsedAddresses$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutContentInteractor$syncPreviouslyUsedAddresses$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws NoConnectivityException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                SingleCache singleCache = new SingleCache(((LegacyShoppingModeRepository) this.q.b.get()).o(true));
                this.p = 1;
                obj = RxAwaitKt.b(singleCache, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return (List) obj;
        } catch (IOException e) {
            throw new NoConnectivityException(e);
        } catch (HttpException e2) {
            throw new ServerErrorException(new ServerError(ServerErrorCode.e, e2.getMessage()), e2);
        }
    }
}
