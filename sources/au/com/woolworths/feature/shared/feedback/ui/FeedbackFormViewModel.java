package au.com.woolworths.feature.shared.feedback.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor;
import au.com.woolworths.feature.shared.feedback.ui.FeedbackFormContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/ui/FeedbackFormViewModel;", "Landroidx/lifecycle/ViewModel;", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FeedbackFormViewModel extends ViewModel {
    public final MedalliaInteractor e;
    public final SharedFlowImpl f;
    public final MutableLiveData g;
    public final Flow h;
    public String i;
    public HashMap j;

    public FeedbackFormViewModel(MedalliaInteractor medalliaInteractor) {
        Intrinsics.h(medalliaInteractor, "medalliaInteractor");
        this.e = medalliaInteractor;
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.m(new FeedbackFormContract.ViewState());
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.f = sharedFlowImplB;
        this.g = mutableLiveData;
        this.h = FlowKt.a(sharedFlowImplB);
        this.j = new HashMap();
    }
}
