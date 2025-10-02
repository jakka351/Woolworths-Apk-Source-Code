package au.com.woolworths.shop.digipay;

import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.pay.internal.services.merchantprofile.MerchantProfileManager;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.models.merchantprofile.MerchantProfile;
import au.com.woolworths.shop.auth.ShopAppTokenAuthenticator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/pay/sdk/models/merchantprofile/MerchantProfile;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.digipay.DigipayInteractor$getMerchantProfileIfNeeded$2", f = "DigipayInteractor.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DigipayInteractor$getMerchantProfileIfNeeded$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MerchantProfile>, Object> {
    public int p;
    public final /* synthetic */ DigipayInteractor q;
    public final /* synthetic */ boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigipayInteractor$getMerchantProfileIfNeeded$2(DigipayInteractor digipayInteractor, boolean z, Continuation continuation) {
        super(2, continuation);
        this.q = digipayInteractor;
        this.r = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DigipayInteractor$getMerchantProfileIfNeeded$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DigipayInteractor$getMerchantProfileIfNeeded$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
        this.p = 1;
        DigipayInteractor digipayInteractor = this.q;
        DispatcherProvider dispatcherProvider = digipayInteractor.c;
        ShopAppTokenAuthenticator shopAppTokenAuthenticator = digipayInteractor.d;
        PayClient payClient = digipayInteractor.f10909a;
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.b(this));
        if (this.r) {
            DigipayResultCallback digipayResultCallback = new DigipayResultCallback(safeContinuation, shopAppTokenAuthenticator, dispatcherProvider);
            MerchantProfileManager merchantProfileManager = payClient.f9189a;
            merchantProfileManager.b();
            merchantProfileManager.c(digipayResultCallback);
        } else {
            payClient.f9189a.c(new DigipayResultCallback(safeContinuation, shopAppTokenAuthenticator, dispatcherProvider));
        }
        Object objA = safeContinuation.a();
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
