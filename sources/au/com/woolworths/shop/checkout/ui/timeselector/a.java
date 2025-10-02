package au.com.woolworths.shop.checkout.ui.timeselector;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.checkout.TimeSelectorAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.sdui.common.coretag.model.CoreTagModel;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot;
import au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                TimeSelectorViewModel timeSelectorViewModel = (TimeSelectorViewModel) this.e;
                FulfilmentSlot fulfilmentSlotP6 = TimeSelectorViewModel.p6((TimeSelectorContract.ViewState) timeSelectorViewModel.i.getValue());
                if (fulfilmentSlotP6 != null) {
                    AnalyticsManager analyticsManager = timeSelectorViewModel.g;
                    TimeSelectorAnalytics.WindowSelection.Action.Companion companion = TimeSelectorAnalytics.WindowSelection.Action.d;
                    ArrayList arrayListC0 = CollectionsKt.c0(fulfilmentSlotP6.j, fulfilmentSlotP6.i);
                    final ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListC0, 10));
                    Iterator it = arrayListC0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((CoreTagModel) it.next()).f9999a);
                    }
                    companion.getClass();
                    analyticsManager.g(new Event(arrayList) { // from class: au.com.woolworths.analytics.supers.checkout.TimeSelectorAnalytics$WindowSelection$Action$Companion$deliveryTimeClick$1
                        public final Object d;

                        {
                            SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                            spreadBuilder.b(TimeSelectorAnalytics.WindowSelection.e);
                            spreadBuilder.a(new Pair("event.Action", "click"));
                            spreadBuilder.a(new Pair("event.Category", "button"));
                            spreadBuilder.a(new Pair("event.Description", "Upfront Fulfilment"));
                            spreadBuilder.a(new Pair("event.Label", "Checkout Collection Window"));
                            spreadBuilder.a(new Pair("window.Label", arrayList));
                            ArrayList arrayList2 = spreadBuilder.f24269a;
                            this.d = MapsKt.j((Pair[]) arrayList2.toArray(new Pair[arrayList2.size()]));
                        }

                        @Override // au.com.woolworths.analytics.Event
                        /* renamed from: d */
                        public final String getD() {
                            return "delivery_time_click";
                        }

                        public final boolean equals(Object obj) {
                            if (!(obj instanceof Event)) {
                                return false;
                            }
                            Event event = (Event) obj;
                            return "delivery_time_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                        }

                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                        @Override // au.com.woolworths.analytics.Event
                        public final Map getData() {
                            return this.d;
                        }
                    });
                    BuildersKt.c(ViewModelKt.a(timeSelectorViewModel), null, null, new TimeSelectorViewModel$onFooterClick$2(timeSelectorViewModel, fulfilmentSlotP6, null), 3);
                }
                break;
            default:
                ((TimeSelectorActivity) this.e).finish();
                break;
        }
        return Unit.f24250a;
    }
}
