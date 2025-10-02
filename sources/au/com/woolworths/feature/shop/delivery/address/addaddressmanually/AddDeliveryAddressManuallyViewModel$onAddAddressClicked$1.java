package au.com.woolworths.feature.shop.delivery.address.addaddressmanually;

import au.com.woolworths.base.shopapp.models.address.AddressResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyViewModel$onAddAddressClicked$1", f = "AddDeliveryAddressManuallyViewModel.kt", l = {182, 188}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AddDeliveryAddressManuallyViewModel$onAddAddressClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ AddDeliveryAddressManuallyViewModel q;
    public final /* synthetic */ AddressResult.ManualAddressToSave r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddDeliveryAddressManuallyViewModel$onAddAddressClicked$1(AddDeliveryAddressManuallyViewModel addDeliveryAddressManuallyViewModel, AddressResult.ManualAddressToSave manualAddressToSave, Continuation continuation) {
        super(2, continuation);
        this.q = addDeliveryAddressManuallyViewModel;
        this.r = manualAddressToSave;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddDeliveryAddressManuallyViewModel$onAddAddressClicked$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AddDeliveryAddressManuallyViewModel$onAddAddressClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
    
        if (r13.o(r12) == r1) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyViewModel r0 = r12.q
            kotlinx.coroutines.flow.SharedFlowImpl r10 = r0.j
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r12.p
            kotlin.Unit r11 = kotlin.Unit.f24250a
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L22
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L16
            kotlin.ResultKt.b(r13)     // Catch: java.lang.RuntimeException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8a
            goto L4e
        L16:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1e:
            kotlin.ResultKt.b(r13)     // Catch: java.lang.RuntimeException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8a
            goto L43
        L22:
            kotlin.ResultKt.b(r13)
            boolean r13 = r0.m     // Catch: java.lang.RuntimeException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8a
            if (r13 != 0) goto L2f
            boolean r13 = r0.l     // Catch: java.lang.RuntimeException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8a
            if (r13 != 0) goto L2f
            r13 = r4
            goto L30
        L2f:
            r13 = 0
        L30:
            au.com.woolworths.feature.shop.delivery.address.DeliveryAddressInteractor r2 = r0.f     // Catch: java.lang.RuntimeException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8a
            au.com.woolworths.base.shopapp.models.address.AddressResult$ManualAddressToSave r5 = r12.r     // Catch: java.lang.RuntimeException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8a
            r12.p = r4     // Catch: java.lang.RuntimeException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8a
            au.com.woolworths.feature.shop.delivery.address.DeliveryAddressRepository r2 = r2.f7045a     // Catch: java.lang.RuntimeException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8a
            java.lang.Object r13 = r2.a(r13, r5, r12)     // Catch: java.lang.RuntimeException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8a
            if (r13 != r1) goto L3f
            goto L40
        L3f:
            r13 = r11
        L40:
            if (r13 != r1) goto L43
            goto L4d
        L43:
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor r13 = r0.g     // Catch: java.lang.RuntimeException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8a
            r12.p = r3     // Catch: java.lang.RuntimeException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8a
            java.lang.Object r13 = r13.o(r12)     // Catch: java.lang.RuntimeException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8a
            if (r13 != r1) goto L4e
        L4d:
            return r1
        L4e:
            androidx.lifecycle.MutableLiveData r1 = r0.i     // Catch: java.lang.RuntimeException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8a
            r8 = 0
            r9 = 126(0x7e, float:1.77E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyViewModel.w6(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.RuntimeException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8a
            au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyContract$Actions$CloseScreen r13 = au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyContract.Actions.CloseScreen.f7047a     // Catch: java.lang.RuntimeException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8a
            r10.f(r13)     // Catch: java.lang.RuntimeException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8a
            au.com.woolworths.android.onesite.analytics.AnalyticsManager r13 = r0.h     // Catch: java.lang.RuntimeException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8a
            au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyActionData r1 = au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyActionData.h     // Catch: java.lang.RuntimeException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8a
            r13.c(r1)     // Catch: java.lang.RuntimeException -> L69 au.com.woolworths.android.onesite.network.NoConnectivityException -> L8a
            return r11
        L69:
            au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyActionData r13 = au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyActionData.g
            java.lang.String r1 = "Unable to add address. Please retry"
            au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyViewModel.r6(r0, r13, r1)
            androidx.lifecycle.MutableLiveData r1 = r0.i
            r8 = 0
            r9 = 126(0x7e, float:1.77E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyViewModel.w6(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyContract$Actions$ShowSnackbarMessage r13 = new au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyContract$Actions$ShowSnackbarMessage
            r0 = 2132017719(0x7f140237, float:1.9673724E38)
            r13.<init>(r0)
            r10.f(r13)
            goto L94
        L8a:
            au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyActionData r13 = au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyActionData.f
            java.lang.String r1 = "No network connection. Please retry."
            au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyViewModel.r6(r0, r13, r1)
            au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyViewModel.q6(r0)
        L94:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyViewModel$onAddAddressClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
