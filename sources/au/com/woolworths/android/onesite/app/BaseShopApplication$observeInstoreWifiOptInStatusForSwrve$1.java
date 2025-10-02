package au.com.woolworths.android.onesite.app;

import android.content.Context;
import au.com.woolworths.feature.shared.instore.wifi.notifications.InStoreWiFiNotificationHelper;
import au.com.woolworths.marketing.SwrveInteractor;
import au.com.woolworths.marketing.data.UserHasInstoreWifiSwrveUserProp;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.app.BaseShopApplication$observeInstoreWifiOptInStatusForSwrve$1", f = "BaseShopApplication.kt", l = {WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class BaseShopApplication$observeInstoreWifiOptInStatusForSwrve$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ BaseShopApplication q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.android.onesite.app.BaseShopApplication$observeInstoreWifiOptInStatusForSwrve$1$1", f = "BaseShopApplication.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.android.onesite.app.BaseShopApplication$observeInstoreWifiOptInStatusForSwrve$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        public /* synthetic */ boolean p;
        public final /* synthetic */ BaseShopApplication q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseShopApplication baseShopApplication, Continuation continuation) {
            super(2, continuation);
            this.q = baseShopApplication;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
            anonymousClass1.p = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(bool, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            boolean z = this.p;
            BaseShopApplication baseShopApplication = this.q;
            SwrveInteractor swrveInteractorQ = baseShopApplication.i().q();
            UserHasInstoreWifiSwrveUserProp userHasInstoreWifiSwrveUserProp = new UserHasInstoreWifiSwrveUserProp(z);
            swrveInteractorQ.getClass();
            SwrveInteractor.d(userHasInstoreWifiSwrveUserProp);
            InStoreWiFiNotificationHelper inStoreWiFiNotificationHelperI = baseShopApplication.i().i();
            Context applicationContext = baseShopApplication.getApplicationContext();
            Intrinsics.g(applicationContext, "getApplicationContext(...)");
            inStoreWiFiNotificationHelperI.b(applicationContext);
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseShopApplication$observeInstoreWifiOptInStatusForSwrve$1(BaseShopApplication baseShopApplication, Continuation continuation) {
        super(2, continuation);
        this.q = baseShopApplication;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseShopApplication$observeInstoreWifiOptInStatusForSwrve$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseShopApplication$observeInstoreWifiOptInStatusForSwrve$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            BaseShopApplication baseShopApplication = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(baseShopApplication, null), baseShopApplication.i().O().getH());
            this.p = 1;
            if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
