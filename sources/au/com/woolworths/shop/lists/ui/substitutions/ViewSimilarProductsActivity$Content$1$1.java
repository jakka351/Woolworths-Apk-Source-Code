package au.com.woolworths.shop.lists.ui.substitutions;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.lists.ListsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.lists.data.model.AlternativeProductCard;
import au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsContract;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class ViewSimilarProductsActivity$Content$1$1 extends FunctionReferenceImpl implements Function1<AlternativeProductCard, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AlternativeProductCard p0 = (AlternativeProductCard) obj;
        Intrinsics.h(p0, "p0");
        ViewSimilarProductsViewModel viewSimilarProductsViewModel = (ViewSimilarProductsViewModel) this.receiver;
        viewSimilarProductsViewModel.getClass();
        MutableStateFlow mutableStateFlow = viewSimilarProductsViewModel.k;
        Object value = mutableStateFlow.getValue();
        ViewSimilarProductsContract.ViewState.Content content = value instanceof ViewSimilarProductsContract.ViewState.Content ? (ViewSimilarProductsContract.ViewState.Content) value : null;
        if (content != null) {
            mutableStateFlow.f(ViewSimilarProductsContract.ViewState.Content.d(content, null, p0, null, 61));
        }
        AnalyticsManager analyticsManager = viewSimilarProductsViewModel.h;
        ListsAnalytics.ViewSimilarItems.Action.Companion companion = ListsAnalytics.ViewSimilarItems.Action.d;
        final String substitutionSource = p0.getSubstitutionSource();
        companion.getClass();
        Intrinsics.h(substitutionSource, "substitutionSource");
        analyticsManager.g(new Event(substitutionSource) { // from class: au.com.woolworths.analytics.supers.lists.ListsAnalytics$ViewSimilarItems$Action$Companion$select$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(ListsAnalytics.ViewSimilarItems.f);
                spreadBuilder.a(new Pair("event.Category", "button"));
                spreadBuilder.a(new Pair("event.Action", "click"));
                a.z("event.Label", "select", spreadBuilder, "event.Description", substitutionSource);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "button_click";
            }

            public final boolean equals(Object obj2) {
                if (!(obj2 instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj2;
                return "button_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        return Unit.f24250a;
    }
}
