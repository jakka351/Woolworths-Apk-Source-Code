package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.devicefingerprint.DeviceFingerprintInteractor;
import au.com.woolworths.shop.checkout.CheckoutFeature;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/android/onesite/rxutils/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter$getDeviceFingerPrintIdSingle$1", f = "DigitalPayForOrderPresenter.kt", l = {3371}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DigitalPayForOrderPresenter$getDeviceFingerPrintIdSingle$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends String>>, Object> {
    public int p;
    public final /* synthetic */ DigitalPayForOrderPresenter q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigitalPayForOrderPresenter$getDeviceFingerPrintIdSingle$1(DigitalPayForOrderPresenter digitalPayForOrderPresenter, Continuation continuation) {
        super(2, continuation);
        this.q = digitalPayForOrderPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DigitalPayForOrderPresenter$getDeviceFingerPrintIdSingle$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DigitalPayForOrderPresenter$getDeviceFingerPrintIdSingle$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DigitalPayForOrderPresenter digitalPayForOrderPresenter = this.q;
        FeatureToggleManager featureToggleManager = digitalPayForOrderPresenter.o;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            if (!featureToggleManager.c(CheckoutFeature.f) || !featureToggleManager.c(CheckoutFeature.g)) {
                return Result.Companion.b(null);
            }
            DeviceFingerprintInteractor deviceFingerprintInteractor = digitalPayForOrderPresenter.h;
            String strH = androidx.constraintlayout.core.state.a.h("toString(...)");
            this.p = 1;
            obj = deviceFingerprintInteractor.b("woolworths_online", strH, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        DeviceFingerprintInteractor.ProfileResult profileResult = (DeviceFingerprintInteractor.ProfileResult) obj;
        DeviceFingerprintInteractor.ProfileResult.Success success = profileResult instanceof DeviceFingerprintInteractor.ProfileResult.Success ? (DeviceFingerprintInteractor.ProfileResult.Success) profileResult : null;
        return Result.Companion.b(success != null ? success.f5170a : null);
    }
}
