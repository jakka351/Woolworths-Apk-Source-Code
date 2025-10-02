package au.com.woolworths.shop.lists.ui.details.ui;

import au.com.woolworths.shop.lists.ui.details.ui.ListDetailsContract;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class ListDetailsView$initialiseBottomSheetBehaviour$1 extends FunctionReferenceImpl implements Function1<Float, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        ListDetailsViewModel listDetailsViewModel = (ListDetailsViewModel) this.receiver;
        MutableStateFlow mutableStateFlow = listDetailsViewModel.o;
        ListDetailsViewModel.s6(listDetailsViewModel, listDetailsViewModel.m, null, false, false, fFloatValue, 7);
        if (fFloatValue == BitmapDescriptorFactory.HUE_RED) {
            mutableStateFlow.f(ListDetailsContract.BottomSheetViewState.f);
        } else if (fFloatValue == 180.0f) {
            mutableStateFlow.f(ListDetailsContract.BottomSheetViewState.e);
        }
        return Unit.f24250a;
    }
}
