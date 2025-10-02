package au.com.woolworths.base.shopapp.modules.collectionmode;

import au.com.woolworths.base.shopapp.models.address.DeleteAddressResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/base/shopapp/models/address/DeleteAddressResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.base.shopapp.modules.collectionmode.AddressInteractor$deleteAddress$1", f = "AddressInteractor.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AddressInteractor$deleteAddress$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DeleteAddressResult>, Object> {
    public int p;
    public final /* synthetic */ AddressInteractor q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressInteractor$deleteAddress$1(AddressInteractor addressInteractor, int i, Continuation continuation) {
        super(2, continuation);
        this.q = addressInteractor;
        this.r = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressInteractor$deleteAddress$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressInteractor$deleteAddress$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
        AddressApi addressApi = this.q.f4623a;
        this.p = 1;
        Object objB = addressApi.b(this.r, this);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }
}
