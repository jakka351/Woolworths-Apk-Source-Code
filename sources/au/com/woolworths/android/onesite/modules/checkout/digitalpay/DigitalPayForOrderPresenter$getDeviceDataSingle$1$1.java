package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import android.content.Context;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.CollectDeviceData;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.checkout.models.PayPalTokenResponse;
import com.braintreepayments.api.BraintreeClient;
import com.braintreepayments.api.DataCollector;
import com.braintreepayments.api.DataCollectorCallback;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/android/onesite/rxutils/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter$getDeviceDataSingle$1$1", f = "DigitalPayForOrderPresenter.kt", l = {3360}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DigitalPayForOrderPresenter$getDeviceDataSingle$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends String>>, Object> {
    public Result.Companion p;
    public int q;
    public final /* synthetic */ DigitalPayForOrderPresenter r;
    public final /* synthetic */ PayPalTokenResponse s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigitalPayForOrderPresenter$getDeviceDataSingle$1$1(DigitalPayForOrderPresenter digitalPayForOrderPresenter, PayPalTokenResponse payPalTokenResponse, Continuation continuation) {
        super(2, continuation);
        this.r = digitalPayForOrderPresenter;
        this.s = payPalTokenResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DigitalPayForOrderPresenter$getDeviceDataSingle$1$1(this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DigitalPayForOrderPresenter$getDeviceDataSingle$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Result.Companion companion;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            DigitalPayForOrderPresenter digitalPayForOrderPresenter = this.r;
            final CollectDeviceData collectDeviceData = digitalPayForOrderPresenter.n;
            Object obj2 = digitalPayForOrderPresenter.f4374a;
            Intrinsics.e(obj2);
            Context contextP3 = ((DigitalPayForOrderContract.View) obj2).P3();
            String clientToken = this.s.getClientToken();
            Intrinsics.g(clientToken, "getClientToken(...)");
            Result.Companion companion2 = Result.c;
            this.p = companion2;
            this.q = 1;
            collectDeviceData.getClass();
            final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.b(this));
            if (clientToken.length() == 0) {
                safeContinuation.resumeWith(null);
            }
            if (CollectDeviceData.b == null || !Intrinsics.c(CollectDeviceData.c, clientToken)) {
                CollectDeviceData.c = clientToken;
                CollectDeviceData.b = new DataCollector(new BraintreeClient(contextP3, clientToken));
            }
            DataCollector dataCollector = CollectDeviceData.b;
            Intrinsics.e(dataCollector);
            dataCollector.a(contextP3, new DataCollectorCallback() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.CollectDeviceData$invoke$2$1
                @Override // com.braintreepayments.api.DataCollectorCallback
                public final void b(String str) {
                    String str2;
                    if (str != null) {
                        Json json = collectDeviceData.f4280a;
                        json.getClass();
                        str2 = ((CollectDeviceData.DeviceData) json.b(CollectDeviceData.DeviceData.INSTANCE.serializer(), str)).f4282a;
                    } else {
                        str2 = null;
                    }
                    safeContinuation.resumeWith(str2);
                }
            });
            obj = safeContinuation.a();
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            companion = companion2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion = this.p;
            ResultKt.b(obj);
        }
        companion.getClass();
        return Result.Companion.b(obj);
    }
}
