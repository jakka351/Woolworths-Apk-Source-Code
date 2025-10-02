package au.com.woolworths.feature.shop.storelocator.details;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.storelocator.details.StoreDetailsContract;
import au.com.woolworths.feature.shop.storelocator.details.analytics.LocationDetailActions;
import au.com.woolworths.feature.shop.storelocator.details.models.StoreExtKt;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import com.woolworths.R;
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
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.storelocator.details.StoreDetailsViewModel$onPickUpAddressSelected$1$1", f = "StoreDetailsViewModel.kt", l = {144}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class StoreDetailsViewModel$onPickUpAddressSelected$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ StoreDetailsViewModel q;
    public final /* synthetic */ String r;
    public final /* synthetic */ Store s;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreDetailsViewModel$onPickUpAddressSelected$1$1(StoreDetailsViewModel storeDetailsViewModel, String str, Store store, String str2, Continuation continuation) {
        super(2, continuation);
        this.q = storeDetailsViewModel;
        this.r = str;
        this.s = store;
        this.t = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoreDetailsViewModel$onPickUpAddressSelected$1$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StoreDetailsViewModel$onPickUpAddressSelected$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LocationDetailActions locationDetailActions;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        String str2 = this.r;
        StoreDetailsViewModel storeDetailsViewModel = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                AnalyticsManager analyticsManager = storeDetailsViewModel.g;
                Store store = this.s;
                if (str2.equals(StoreExtKt.b(store))) {
                    locationDetailActions = LocationDetailActions.e;
                } else {
                    if (!str2.equals(StoreExtKt.a(store))) {
                        throw new IllegalArgumentException("Selected pick up location address Id does not exist!");
                    }
                    locationDetailActions = LocationDetailActions.f;
                }
                TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.t3, store.d);
                trackingMetadataA.b(TrackableValue.x3, store.f);
                analyticsManager.j(locationDetailActions, trackingMetadataA);
                MutableStateFlow mutableStateFlow = storeDetailsViewModel.k;
                str = str2;
                mutableStateFlow.setValue(StoreDetailsContract.ViewState.a((StoreDetailsContract.ViewState) mutableStateFlow.getValue(), null, null, null, str, null, null, null, null, null, 1015));
                String str3 = this.t;
                this.p = 1;
                if (StoreDetailsViewModel.p6(storeDetailsViewModel, str, str3, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                str = str2;
            }
            MutableStateFlow mutableStateFlow2 = storeDetailsViewModel.k;
            mutableStateFlow2.setValue(StoreDetailsContract.ViewState.a((StoreDetailsContract.ViewState) mutableStateFlow2.getValue(), null, null, str, null, null, null, null, StoreDetailsContract.ViewAction.FinishSetUpPickUpLocator.f8137a, null, 755));
        } catch (Exception unused) {
            MutableStateFlow mutableStateFlow3 = storeDetailsViewModel.k;
            mutableStateFlow3.setValue(StoreDetailsContract.ViewState.a((StoreDetailsContract.ViewState) mutableStateFlow3.getValue(), null, null, null, null, new Integer(R.string.unable_to_select_pick_up_method_error), null, null, null, null, 999));
        }
        return Unit.f24250a;
    }
}
