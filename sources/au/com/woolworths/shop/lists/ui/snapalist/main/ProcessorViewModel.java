package au.com.woolworths.shop.lists.ui.snapalist.main;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.lists.SnapAListAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.lists.network.ImageToTextResponse;
import au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorContract;
import au.com.woolworths.shop.lists.ui.snapalist.repository.ImageToTextRepository;
import com.woolworths.R;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/ui/snapalist/main/ProcessorViewModel;", "Landroidx/lifecycle/ViewModel;", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProcessorViewModel extends ViewModel {
    public final Context e;
    public final ImageToTextRepository f;
    public final AnalyticsManager g;
    public final MutableStateFlow h;
    public final SharedFlowImpl i;
    public final Flow j;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/shop/lists/ui/snapalist/main/ProcessorViewModel$Companion;", "", "", "JpgCompressionQuality", "I", "", "BytesInOneMb", "D", "", "ImageRotation", "F", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ProcessorViewModel(Context context, ImageToTextRepository imageToTextRepository, AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = context;
        this.f = imageToTextRepository;
        this.g = analyticsManager;
        this.h = StateFlowKt.a(new ProcessorContract.ViewState(7));
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.i = sharedFlowImplB;
        this.j = FlowKt.a(sharedFlowImplB);
    }

    public final void p6(int i) {
        MutableStateFlow mutableStateFlow = this.h;
        mutableStateFlow.f(ProcessorContract.ViewState.a((ProcessorContract.ViewState) mutableStateFlow.getValue(), false, false, null, 6));
        SnapAListAnalytics.ListDetails.Action.Companion companion = SnapAListAnalytics.ListDetails.Action.d;
        Context context = this.e;
        final String string = context.getString(R.string.shop_lists_snap_error_title);
        Intrinsics.g(string, "getString(...)");
        final String string2 = context.getString(i);
        Intrinsics.g(string2, "getString(...)");
        companion.getClass();
        this.g.g(new Event(string, string2) { // from class: au.com.woolworths.analytics.supers.lists.SnapAListAnalytics$ListDetails$Action$Companion$errorImpression$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(SnapAListAnalytics.ListDetails.e);
                spreadBuilder.a(new Pair("event.Category", "snap a list"));
                spreadBuilder.a(new Pair("event.Action", "error_impression"));
                a.z("event.Label", string, spreadBuilder, "event.Description", string2);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "snap_a_list_error_impression";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "snap_a_list_error_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        mutableStateFlow.f(ProcessorContract.ViewState.a((ProcessorContract.ViewState) mutableStateFlow.getValue(), false, false, new ProcessorContract.DialogMessage(i), 3));
    }

    public final void q6(ImageToTextResponse response) {
        Intrinsics.h(response, "response");
        MutableStateFlow mutableStateFlow = this.h;
        mutableStateFlow.f(ProcessorContract.ViewState.a((ProcessorContract.ViewState) mutableStateFlow.getValue(), false, false, null, 6));
        List productList = response.getProductList();
        if (productList != null && productList.isEmpty()) {
            p6(R.string.shop_lists_snap_error_description_no_text);
            return;
        }
        List productList2 = response.getProductList();
        if (productList2 == null) {
            productList2 = EmptyList.d;
        }
        this.i.f(new ProcessorContract.Action.FinishWithResult(productList2));
    }
}
