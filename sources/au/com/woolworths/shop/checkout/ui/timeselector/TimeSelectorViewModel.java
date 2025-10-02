package au.com.woolworths.shop.checkout.ui.timeselector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.supers.checkout.TimeSelectorAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.shop.checkout.CheckoutFeature;
import au.com.woolworths.shop.checkout.domain.interactor.timeselector.GetTimeSelectorDataInteractor;
import au.com.woolworths.shop.checkout.domain.interactor.timeselector.ReserveTimeSlotInteractor;
import au.com.woolworths.shop.checkout.domain.model.DeliveryNowWindow;
import au.com.woolworths.shop.checkout.domain.model.DirectToBootNowWindow;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindows;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsFooter;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsGroup;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsOption;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsSlot;
import au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorContract;
import au.com.woolworths.shop.checkout.ui.timeselector.uimodel.DateItem;
import au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeOfDay;
import au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeSelectorDataMapperKt;
import au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeSelectorUiItem;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/TimeSelectorViewModel;", "Landroidx/lifecycle/ViewModel;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class TimeSelectorViewModel extends ViewModel {
    public final GetTimeSelectorDataInteractor e;
    public final ReserveTimeSlotInteractor f;
    public final AnalyticsManager g;
    public final FeatureToggleManager h;
    public final MutableStateFlow i;
    public final StateFlow j;
    public final BufferedChannel k;
    public final Flow l;
    public Integer m;

    public TimeSelectorViewModel(GetTimeSelectorDataInteractor getTimeSelectorDataInteractor, ReserveTimeSlotInteractor reserveTimeSlotInteractor, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = getTimeSelectorDataInteractor;
        this.f = reserveTimeSlotInteractor;
        this.g = analyticsManager;
        this.h = featureToggleManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(TimeSelectorContract.ViewState.h);
        this.i = mutableStateFlowA;
        this.j = FlowKt.b(mutableStateFlowA);
        BufferedChannel bufferedChannelA = ChannelKt.a(0, 7, null);
        this.k = bufferedChannelA;
        this.l = FlowKt.I(bufferedChannelA);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot p6(au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorContract.ViewState r4) {
        /*
            java.util.List r0 = r4.f10838a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeSelectorUiItem.TimeOfDaySelectorUiItem
            if (r3 == 0) goto Ld
            r1.add(r2)
            goto Ld
        L1f:
            java.lang.Object r0 = kotlin.collections.CollectionsKt.F(r1)
            au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeSelectorUiItem$TimeOfDaySelectorUiItem r0 = (au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeSelectorUiItem.TimeOfDaySelectorUiItem) r0
            r1 = 0
            if (r0 == 0) goto L67
            java.util.List r0 = r0.b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r0.next()
            r3 = r2
            au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeOfDay r3 = (au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeOfDay) r3
            boolean r3 = r3.b
            if (r3 == 0) goto L30
            goto L43
        L42:
            r2 = r1
        L43:
            au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeOfDay r2 = (au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeOfDay) r2
            if (r2 == 0) goto L67
            java.util.List r0 = r2.e
            if (r0 == 0) goto L67
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L51:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L63
            java.lang.Object r2 = r0.next()
            r3 = r2
            au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot r3 = (au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot) r3
            boolean r3 = r3.e
            if (r3 == 0) goto L51
            goto L64
        L63:
            r2 = r1
        L64:
            au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot r2 = (au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot) r2
            goto L68
        L67:
            r2 = r1
        L68:
            if (r2 != 0) goto Lae
            java.util.List r4 = r4.f10838a
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L77:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L89
            java.lang.Object r2 = r4.next()
            boolean r3 = r2 instanceof au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeSelectorUiItem.SuggestedTimeSlotUiItem
            if (r3 == 0) goto L77
            r0.add(r2)
            goto L77
        L89:
            java.lang.Object r4 = kotlin.collections.CollectionsKt.F(r0)
            au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeSelectorUiItem$SuggestedTimeSlotUiItem r4 = (au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeSelectorUiItem.SuggestedTimeSlotUiItem) r4
            if (r4 == 0) goto Lad
            java.util.List r4 = r4.f10845a
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L99:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lab
            java.lang.Object r0 = r4.next()
            r2 = r0
            au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot r2 = (au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot) r2
            boolean r2 = r2.e
            if (r2 == 0) goto L99
            r1 = r0
        Lab:
            au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot r1 = (au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot) r1
        Lad:
            return r1
        Lae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorViewModel.p6(au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorContract$ViewState):au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot");
    }

    public final Integer q6() {
        Object next;
        Object next2;
        DirectToBootNowWindow directToBootNowWindow;
        DeliveryNowWindow deliveryNowWindow;
        FulfilmentWindows fulfilmentWindows = ((TimeSelectorContract.ViewState) this.i.getValue()).f;
        if (fulfilmentWindows != null) {
            List list = fulfilmentWindows.e;
            List list2 = list;
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                CollectionsKt.h(((FulfilmentWindowsOption) it.next()).m, arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                FulfilmentWindowsGroup fulfilmentWindowsGroup = (FulfilmentWindowsGroup) it2.next();
                CollectionsKt.h(r6() ? fulfilmentWindowsGroup.g : fulfilmentWindowsGroup.f, arrayList2);
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                FulfilmentWindowsSlot fulfilmentWindowsSlot = (FulfilmentWindowsSlot) it3.next();
                arrayList3.add(new Pair(Integer.valueOf(fulfilmentWindowsSlot.d), Boolean.valueOf(fulfilmentWindowsSlot.f)));
            }
            ArrayList arrayListJ0 = CollectionsKt.J0(arrayList3);
            if (!r6()) {
                Iterator it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                    if (((FulfilmentWindowsOption) next2).d) {
                        break;
                    }
                }
                FulfilmentWindowsOption fulfilmentWindowsOption = (FulfilmentWindowsOption) next2;
                if (fulfilmentWindowsOption == null) {
                    fulfilmentWindowsOption = (FulfilmentWindowsOption) CollectionsKt.F(list);
                }
                if (fulfilmentWindowsOption != null && (deliveryNowWindow = fulfilmentWindowsOption.n) != null) {
                    arrayListJ0.add(new Pair(Integer.valueOf(deliveryNowWindow.f10596a), Boolean.valueOf(deliveryNowWindow.k)));
                }
                if (fulfilmentWindowsOption != null && (directToBootNowWindow = fulfilmentWindowsOption.o) != null) {
                    arrayListJ0.add(new Pair(Integer.valueOf(directToBootNowWindow.f10597a), Boolean.valueOf(directToBootNowWindow.h)));
                }
            }
            Iterator it5 = arrayListJ0.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    next = null;
                    break;
                }
                next = it5.next();
                if (((Boolean) ((Pair) next).e).booleanValue()) {
                    break;
                }
            }
            Pair pair = (Pair) next;
            if (pair != null) {
                return (Integer) pair.d;
            }
        }
        return null;
    }

    public final boolean r6() {
        return this.h.c(CheckoutFeature.l);
    }

    public final void s6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new TimeSelectorViewModel$loadScreen$1(this, null), 3);
    }

    public final void t6(DateItem dateItem) {
        TimeSelectorUiItem suggestedTimeSlotUiItem;
        Intrinsics.h(dateItem, "dateItem");
        this.g.g(TimeSelectorAnalytics.WindowSelection.Action.e);
        MutableStateFlow mutableStateFlow = this.i;
        TimeSelectorContract.ViewState viewState = (TimeSelectorContract.ViewState) mutableStateFlow.getValue();
        List<TimeSelectorUiItem> list = viewState.f10838a;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (TimeSelectorUiItem timeSelectorUiItem : list) {
            if (timeSelectorUiItem instanceof TimeSelectorUiItem.DateSelectorUiItem) {
                ArrayList<DateItem> arrayList2 = ((TimeSelectorUiItem.DateSelectorUiItem) timeSelectorUiItem).f10844a;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
                for (DateItem dateItem2 : arrayList2) {
                    arrayList3.add(DateItem.a(dateItem2, dateItem.equals(dateItem2)));
                }
                suggestedTimeSlotUiItem = new TimeSelectorUiItem.DateSelectorUiItem(arrayList3);
            } else if (timeSelectorUiItem instanceof TimeSelectorUiItem.TimeOfDaySelectorUiItem) {
                TimeSelectorUiItem.TimeOfDaySelectorUiItem timeOfDaySelectorUiItem = (TimeSelectorUiItem.TimeOfDaySelectorUiItem) timeSelectorUiItem;
                List list2 = dateItem.h;
                FulfilmentWindowsFooter fulfilmentWindowsFooter = ((TimeSelectorContract.ViewState) mutableStateFlow.getValue()).c;
                String str = fulfilmentWindowsFooter != null ? fulfilmentWindowsFooter.f10612a : null;
                boolean zR6 = r6();
                Iterator it = timeOfDaySelectorUiItem.b.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (((TimeOfDay) it.next()).b) {
                        break;
                    } else {
                        i++;
                    }
                }
                suggestedTimeSlotUiItem = new TimeSelectorUiItem.TimeOfDaySelectorUiItem(timeOfDaySelectorUiItem.f10846a, TimeSelectorDataMapperKt.d(list2, str, zR6, Integer.valueOf(i)));
            } else {
                if (!(timeSelectorUiItem instanceof TimeSelectorUiItem.SuggestedTimeSlotUiItem)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (r6()) {
                    suggestedTimeSlotUiItem = (TimeSelectorUiItem.SuggestedTimeSlotUiItem) timeSelectorUiItem;
                } else {
                    TimeSelectorUiItem.SuggestedTimeSlotUiItem suggestedTimeSlotUiItem2 = (TimeSelectorUiItem.SuggestedTimeSlotUiItem) timeSelectorUiItem;
                    suggestedTimeSlotUiItem = new TimeSelectorUiItem.SuggestedTimeSlotUiItem(CollectionsKt.S(dateItem.i), suggestedTimeSlotUiItem2.b, suggestedTimeSlotUiItem2.c);
                }
            }
            arrayList.add(suggestedTimeSlotUiItem);
        }
        mutableStateFlow.setValue(TimeSelectorContract.ViewState.a(viewState, arrayList, null, null, null, null, 124));
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u6(au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot r18) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorViewModel.u6(au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot):void");
    }
}
