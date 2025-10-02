package au.com.woolworths.shop.deliveryunlimited.signup.landing;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.shop.deliveryunlimited.signup.DeliveryUnlimitedSignUpInteractor;
import au.com.woolworths.shop.deliveryunlimited.signup.analytics.DeliveryUnlimitedSignUpActions;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribe;
import au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingViewModel$fetchDeliveryUnlimitedSignupIntro$1", f = "DeliveryUnlimitedSignUpLandingViewModel.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DeliveryUnlimitedSignUpLandingViewModel$fetchDeliveryUnlimitedSignupIntro$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Ref.ObjectRef p;
    public int q;
    public final /* synthetic */ Ref.ObjectRef r;
    public final /* synthetic */ DeliveryUnlimitedSignUpLandingViewModel s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryUnlimitedSignUpLandingViewModel$fetchDeliveryUnlimitedSignupIntro$1(Ref.ObjectRef objectRef, DeliveryUnlimitedSignUpLandingViewModel deliveryUnlimitedSignUpLandingViewModel, Continuation continuation) {
        super(2, continuation);
        this.r = objectRef;
        this.s = deliveryUnlimitedSignUpLandingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryUnlimitedSignUpLandingViewModel$fetchDeliveryUnlimitedSignupIntro$1(this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryUnlimitedSignUpLandingViewModel$fetchDeliveryUnlimitedSignupIntro$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Ref.ObjectRef objectRef;
        DeliveryUnlimitedSignUpLandingViewModel deliveryUnlimitedSignUpLandingViewModel = this.s;
        AnalyticsManager analyticsManager = deliveryUnlimitedSignUpLandingViewModel.f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        Ref.ObjectRef objectRef2 = this.r;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                DeliveryUnlimitedSignUpInteractor deliveryUnlimitedSignUpInteractor = deliveryUnlimitedSignUpLandingViewModel.e;
                this.p = objectRef2;
                this.q = 1;
                obj = deliveryUnlimitedSignUpInteractor.f10849a.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                objectRef = objectRef2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = this.p;
                ResultKt.b(obj);
            }
            objectRef.d = obj;
            deliveryUnlimitedSignUpLandingViewModel.j = null;
        } catch (NoConnectivityException unused) {
            deliveryUnlimitedSignUpLandingViewModel.j = DeliveryUnlimitedSignUpErrorState.d;
            analyticsManager.c(DeliveryUnlimitedSignUpActions.g);
        } catch (ServerErrorException unused2) {
            deliveryUnlimitedSignUpLandingViewModel.j = DeliveryUnlimitedSignUpErrorState.e;
            analyticsManager.c(DeliveryUnlimitedSignUpActions.e);
        }
        deliveryUnlimitedSignUpLandingViewModel.h.m(new DeliveryUnlimitedSignUpLandingContract.ViewState(false, (DeliveryUnlimitedSubscribe) objectRef2.d, deliveryUnlimitedSignUpLandingViewModel.j));
        return Unit.f24250a;
    }
}
