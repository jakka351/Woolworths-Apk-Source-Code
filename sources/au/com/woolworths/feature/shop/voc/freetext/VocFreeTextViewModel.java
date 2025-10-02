package au.com.woolworths.feature.shop.voc.freetext;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.feature.shop.voc.data.SurveySubmitData;
import au.com.woolworths.feature.shop.voc.freetext.VocFreeTextContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/voc/freetext/VocFreeTextViewModel;", "Landroidx/lifecycle/ViewModel;", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class VocFreeTextViewModel extends ViewModel {
    public final VocFreeTextInteractor e;
    public final MutableStateFlow f;
    public final SharedFlowImpl g;
    public final StateFlow h;
    public final SharedFlow i;
    public SurveySubmitData j;
    public Integer k;

    public VocFreeTextViewModel(VocFreeTextInteractor vocFreeTextInteractor) {
        this.e = vocFreeTextInteractor;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new VocFreeTextContract.ViewState(7, null));
        this.f = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.d, 1);
        this.g = sharedFlowImplB;
        this.h = FlowKt.b(mutableStateFlowA);
        this.i = FlowKt.a(sharedFlowImplB);
        p6(null);
    }

    public final void p6(String str) {
        StatefulButtonState statefulButtonState = (this.j == null || this.k == null || str == null || !(StringsKt.D(str) ^ true)) ? StatefulButtonState.f : StatefulButtonState.d;
        int length = str != null ? str.length() : 0;
        MutableStateFlow mutableStateFlow = this.f;
        VocFreeTextContract.ViewState it = (VocFreeTextContract.ViewState) mutableStateFlow.getValue();
        Intrinsics.h(it, "it");
        mutableStateFlow.f(new VocFreeTextContract.ViewState(str, 500 - length, statefulButtonState));
    }
}
