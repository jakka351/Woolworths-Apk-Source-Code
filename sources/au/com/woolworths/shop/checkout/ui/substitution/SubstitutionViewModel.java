package au.com.woolworths.shop.checkout.ui.substitution;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.substitution.CheckoutSubstitutionAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.banners.broadcastbanner.BannerDismissInteractor;
import au.com.woolworths.shop.checkout.domain.interactor.SubstitutionInteractor;
import au.com.woolworths.shop.checkout.domain.model.substitution.ProductSubstitute;
import au.com.woolworths.shop.checkout.domain.model.substitution.ProductSubstitutesSection;
import au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreference;
import au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreferenceOption;
import au.com.woolworths.shop.checkout.ui.substitution.SubstitutionContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionViewModel;", "Landroidx/lifecycle/ViewModel;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SubstitutionViewModel extends ViewModel {
    public final SubstitutionInteractor e;
    public final BannerDismissInteractor f;
    public final AnalyticsManager g;
    public final SharedFlowImpl h;
    public final SharedFlowImpl i;
    public final MutableStateFlow j;
    public final StateFlow k;
    public String l;
    public String m;

    public SubstitutionViewModel(SubstitutionInteractor substitutionInteractor, BannerDismissInteractor bannerDismissInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = substitutionInteractor;
        this.f = bannerDismissInteractor;
        this.g = analyticsManager;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.h = sharedFlowImplB;
        this.i = sharedFlowImplB;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(SubstitutionContract.ViewState.Loading.f10817a);
        this.j = mutableStateFlowA;
        this.k = mutableStateFlowA;
    }

    public static final void p6(SubstitutionViewModel substitutionViewModel) {
        Object value;
        Object objA;
        AnalyticsManager analyticsManager = substitutionViewModel.g;
        CheckoutSubstitutionAnalytics.SubstitutionPreference.Action.Companion companion = CheckoutSubstitutionAnalytics.SubstitutionPreference.Action.d;
        String str = substitutionViewModel.m;
        if (str == null) {
            Intrinsics.p("productId");
            throw null;
        }
        final List listQ = CollectionsKt.Q(str);
        companion.getClass();
        analyticsManager.g(new Event(listQ) { // from class: au.com.woolworths.analytics.supers.substitution.CheckoutSubstitutionAnalytics$SubstitutionPreference$Action$Companion$saveError$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(CheckoutSubstitutionAnalytics.SubstitutionPreference.e);
                spreadBuilder.a(new Pair("event.Category", "Substitution error"));
                spreadBuilder.a(new Pair("event.Action", "error"));
                spreadBuilder.a(new Pair("event.Label", "Backend / saving preference error"));
                spreadBuilder.a(new Pair("product.ID", listQ));
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "substitution_error";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "substitution_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        substitutionViewModel.h.f(SubstitutionContract.Action.ShowSavingError.f10814a);
        MutableStateFlow mutableStateFlow = substitutionViewModel.j;
        do {
            value = mutableStateFlow.getValue();
            objA = (SubstitutionContract.ViewState) value;
            if (objA instanceof SubstitutionContract.ViewState.Content) {
                objA = SubstitutionContract.ViewState.Content.a((SubstitutionContract.ViewState.Content) objA, null, SubstitutionContract.ViewState.ButtonState.d, null, false, 27);
            }
        } while (!mutableStateFlow.d(value, objA));
    }

    public static final void q6(SubstitutionViewModel substitutionViewModel, SubstitutionContract.ViewState.Content content) {
        final ArrayList arrayList;
        final ArrayList arrayList2;
        substitutionViewModel.getClass();
        SubstitutionPreference substitutionPreference = content.f10815a;
        Map map = content.d;
        for (SubstitutionPreferenceOption substitutionPreferenceOption : substitutionPreference.c.c) {
            if (substitutionPreferenceOption.f10666a.equals(content.b)) {
                boolean z = substitutionPreferenceOption.f;
                if (z) {
                    arrayList = new ArrayList(map.size());
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) ((Map.Entry) it.next()).getKey());
                    }
                } else {
                    arrayList = null;
                }
                if (z) {
                    Collection collectionValues = map.values();
                    arrayList2 = new ArrayList(CollectionsKt.s(collectionValues, 10));
                    Iterator it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Boolean) it2.next()).booleanValue() ? "ticked" : "unticked");
                    }
                } else {
                    arrayList2 = null;
                }
                AnalyticsManager analyticsManager = substitutionViewModel.g;
                CheckoutSubstitutionAnalytics.SubstitutionPreference.Action.Companion companion = CheckoutSubstitutionAnalytics.SubstitutionPreference.Action.d;
                final String str = substitutionPreferenceOption.b;
                String str2 = substitutionViewModel.m;
                if (str2 == null) {
                    Intrinsics.p("productId");
                    throw null;
                }
                final List listQ = CollectionsKt.Q(str2);
                companion.getClass();
                analyticsManager.g(new Event(str, listQ, arrayList, arrayList2) { // from class: au.com.woolworths.analytics.supers.substitution.CheckoutSubstitutionAnalytics$SubstitutionPreference$Action$Companion$save$1
                    public final Object d;

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.collections.EmptyList] */
                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(8);
                        spreadBuilder.b(CheckoutSubstitutionAnalytics.SubstitutionPreference.e);
                        spreadBuilder.a(new Pair("event.Category", "Checkout Substitutions"));
                        spreadBuilder.a(new Pair("event.Action", "select"));
                        spreadBuilder.a(new Pair("event.Label", "edit"));
                        spreadBuilder.a(new Pair("event.Description", str));
                        spreadBuilder.a(new Pair("product.ID", listQ));
                        ?? r5 = EmptyList.d;
                        spreadBuilder.a(new Pair("product.SubID", arrayList == null ? r5 : arrayList));
                        spreadBuilder.a(new Pair("product.SubstitutionStatus", arrayList2 == null ? r5 : arrayList2));
                        ArrayList arrayList3 = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList3.toArray(new Pair[arrayList3.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getD() {
                        return "substitution_option_selected";
                    }

                    public final boolean equals(Object obj) {
                        if (!(obj instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj;
                        return "substitution_option_selected".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static LinkedHashMap t6(ProductSubstitutesSection productSubstitutesSection) {
        List<ProductSubstitute> list = productSubstitutesSection.f10662a;
        int iH = MapsKt.h(CollectionsKt.s(list, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        for (ProductSubstitute productSubstitute : list) {
            linkedHashMap.put(productSubstitute.c, Boolean.valueOf(productSubstitute.e));
        }
        return linkedHashMap;
    }

    public final void r6(double d, String productId) {
        Intrinsics.h(productId, "productId");
        this.m = productId;
        BuildersKt.c(ViewModelKt.a(this), null, null, new SubstitutionViewModel$fetchSubstitutionsData$1(this, productId, d, null), 3);
    }

    public final SubstitutionContract.ViewState.ButtonState s6(SubstitutionContract.ViewState.Content content, String str, Map map) {
        return (Intrinsics.c(this.l, str) && t6(content.f10815a.d).equals(map)) ? SubstitutionContract.ViewState.ButtonState.e : SubstitutionContract.ViewState.ButtonState.d;
    }
}
