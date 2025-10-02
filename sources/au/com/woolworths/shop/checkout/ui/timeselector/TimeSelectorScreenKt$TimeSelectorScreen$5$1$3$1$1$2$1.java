package au.com.woolworths.shop.checkout.ui.timeselector;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.checkout.TimeSelectorAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorContract;
import au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeOfDay;
import au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeSelectorUiItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class TimeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$2$1 extends FunctionReferenceImpl implements Function1<TimeOfDay, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TimeOfDay p0 = (TimeOfDay) obj;
        Intrinsics.h(p0, "p0");
        TimeSelectorViewModel timeSelectorViewModel = (TimeSelectorViewModel) this.receiver;
        timeSelectorViewModel.getClass();
        AnalyticsManager analyticsManager = timeSelectorViewModel.g;
        TimeSelectorAnalytics.WindowSelection.Action.Companion companion = TimeSelectorAnalytics.WindowSelection.Action.d;
        final String time = p0.f10843a;
        companion.getClass();
        Intrinsics.h(time, "time");
        analyticsManager.g(new Event(time) { // from class: au.com.woolworths.analytics.supers.checkout.TimeSelectorAnalytics$WindowSelection$Action$Companion$deliveryCollectionTimeClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(TimeSelectorAnalytics.WindowSelection.e);
                spreadBuilder.a(new Pair("event.Category", "button"));
                spreadBuilder.a(new Pair("event.Action", "click"));
                spreadBuilder.a(new Pair("event.Description", "Upfront Fulfilment"));
                androidx.constraintlayout.core.state.a.y("event.Label", "Checkout Collection Time " + time, spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "delivery_collection_time_click";
            }

            public final boolean equals(Object obj2) {
                if (!(obj2 instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj2;
                return "delivery_collection_time_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        MutableStateFlow mutableStateFlow = timeSelectorViewModel.i;
        TimeSelectorContract.ViewState viewState = (TimeSelectorContract.ViewState) mutableStateFlow.getValue();
        List<TimeSelectorUiItem> list = viewState.f10838a;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (TimeSelectorUiItem timeOfDaySelectorUiItem : list) {
            if (timeOfDaySelectorUiItem instanceof TimeSelectorUiItem.TimeOfDaySelectorUiItem) {
                TimeSelectorUiItem.TimeOfDaySelectorUiItem timeOfDaySelectorUiItem2 = (TimeSelectorUiItem.TimeOfDaySelectorUiItem) timeOfDaySelectorUiItem;
                List list2 = timeOfDaySelectorUiItem2.b;
                Integer numQ6 = timeSelectorViewModel.q6();
                List<TimeOfDay> list3 = list2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list3, 10));
                for (TimeOfDay timeOfDay : list3) {
                    arrayList2.add(Intrinsics.c(timeOfDay, p0) ? TimeOfDay.a(timeOfDay, true, null, 29) : TimeOfDay.a(timeOfDay, false, null, 29));
                }
                timeOfDaySelectorUiItem = new TimeSelectorUiItem.TimeOfDaySelectorUiItem(timeOfDaySelectorUiItem2.f10846a, TimeSelectorViewModelKt.a(arrayList2, numQ6));
            }
            arrayList.add(timeOfDaySelectorUiItem);
        }
        mutableStateFlow.setValue(TimeSelectorContract.ViewState.a(viewState, arrayList, null, null, null, null, 124));
        return Unit.f24250a;
    }
}
