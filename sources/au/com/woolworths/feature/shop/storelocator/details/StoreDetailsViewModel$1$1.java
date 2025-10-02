package au.com.woolworths.feature.shop.storelocator.details;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.feature.shop.storelocator.details.StoreDetailsContract;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class StoreDetailsViewModel$1$1 extends FunctionReferenceImpl implements Function1<StoreDetailsContract.Action, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m((StoreDetailsContract.Action) obj);
        return Unit.f24250a;
    }

    public final void m(StoreDetailsContract.Action p0) {
        Intrinsics.h(p0, "p0");
        StoreDetailsViewModel storeDetailsViewModel = (StoreDetailsViewModel) this.receiver;
        MutableStateFlow mutableStateFlow = storeDetailsViewModel.k;
        if (p0 instanceof StoreDetailsContract.ViewAction) {
            mutableStateFlow.setValue(StoreDetailsContract.ViewState.a((StoreDetailsContract.ViewState) mutableStateFlow.getValue(), null, null, null, null, null, null, null, (StoreDetailsContract.ViewAction) p0, null, 767));
            return;
        }
        if (!(p0 instanceof StoreDetailsContract.ViewModelAction)) {
            throw new NoWhenBranchMatchedException();
        }
        StoreDetailsContract.ViewModelAction viewModelAction = (StoreDetailsContract.ViewModelAction) p0;
        if (viewModelAction instanceof StoreDetailsContract.ViewModelAction.PickUpAddressSelected) {
            StoreDetailsContract.ViewModelAction.PickUpAddressSelected pickUpAddressSelected = (StoreDetailsContract.ViewModelAction.PickUpAddressSelected) p0;
            String str = pickUpAddressSelected.f8141a;
            String str2 = pickUpAddressSelected.b;
            Store store = ((StoreDetailsContract.ViewState) mutableStateFlow.getValue()).b;
            if (store != null) {
                BuildersKt.c(ViewModelKt.a(storeDetailsViewModel), null, null, new StoreDetailsViewModel$onPickUpAddressSelected$1$1(storeDetailsViewModel, str, store, str2, null), 3);
                return;
            }
            return;
        }
        if (!viewModelAction.equals(StoreDetailsContract.ViewModelAction.RetryOnError.f8142a)) {
            if (!(viewModelAction instanceof StoreDetailsContract.ViewModelAction.MessageShown)) {
                throw new NoWhenBranchMatchedException();
            }
            mutableStateFlow.setValue(StoreDetailsContract.ViewState.a((StoreDetailsContract.ViewState) mutableStateFlow.getValue(), null, null, null, null, null, null, null, null, null, 1007));
        } else {
            String str3 = storeDetailsViewModel.j;
            if (str3 != null) {
                storeDetailsViewModel.r6(str3);
            }
        }
    }
}
