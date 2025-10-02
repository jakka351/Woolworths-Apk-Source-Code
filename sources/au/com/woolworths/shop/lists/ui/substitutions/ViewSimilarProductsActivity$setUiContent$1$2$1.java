package au.com.woolworths.shop.lists.ui.substitutions;

import androidx.compose.material.ModalBottomSheetState;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.lists.ListsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.graphql.type.AlternativeProductsMode;
import au.com.woolworths.shop.lists.data.model.AlternativeProductCard;
import au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsContract;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsActivity$setUiContent$1$2$1", f = "ViewSimilarProductsActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ViewSimilarProductsActivity$setUiContent$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ModalBottomSheetState p;
    public final /* synthetic */ ViewSimilarProductsActivity q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewSimilarProductsActivity$setUiContent$1$2$1(ModalBottomSheetState modalBottomSheetState, ViewSimilarProductsActivity viewSimilarProductsActivity, Continuation continuation) {
        super(2, continuation);
        this.p = modalBottomSheetState;
        this.q = viewSimilarProductsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ViewSimilarProductsActivity$setUiContent$1$2$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ViewSimilarProductsActivity$setUiContent$1$2$1 viewSimilarProductsActivity$setUiContent$1$2$1 = (ViewSimilarProductsActivity$setUiContent$1$2$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        viewSimilarProductsActivity$setUiContent$1$2$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AlternativeProductCard alternativeProductCard;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        boolean zD = this.p.d();
        ViewSimilarProductsActivity viewSimilarProductsActivity = this.q;
        if (zD) {
            int i = ViewSimilarProductsActivity.C;
            ViewSimilarProductsViewModel viewSimilarProductsViewModelT4 = viewSimilarProductsActivity.T4();
            AnalyticsManager analyticsManager = viewSimilarProductsViewModelT4.h;
            MutableStateFlow mutableStateFlow = viewSimilarProductsViewModelT4.k;
            if (((ViewSimilarProductsContract.ViewState) mutableStateFlow.getValue()).c()) {
                Object value = mutableStateFlow.getValue();
                ViewSimilarProductsContract.ViewState.Content content = value instanceof ViewSimilarProductsContract.ViewState.Content ? (ViewSimilarProductsContract.ViewState.Content) value : null;
                if (content != null && (alternativeProductCard = content.b) != null) {
                    if (viewSimilarProductsViewModelT4.m == AlternativeProductsMode.f) {
                        analyticsManager.g(ListsAnalytics.LowerUnitPriceOptions.Action.d);
                    } else {
                        ListsAnalytics.ViewSimilarItems.Action.Companion companion = ListsAnalytics.ViewSimilarItems.Action.d;
                        final String substitutionSource = alternativeProductCard.getSubstitutionSource();
                        companion.getClass();
                        Intrinsics.h(substitutionSource, "substitutionSource");
                        analyticsManager.g(new Event(substitutionSource) { // from class: au.com.woolworths.analytics.supers.lists.ListsAnalytics$ViewSimilarItems$Action$Companion$addOrReplaceBottomSheet$1
                            public final Object d;

                            {
                                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                spreadBuilder.b(ListsAnalytics.ViewSimilarItems.f);
                                spreadBuilder.a(new Pair("event.Category", "bottomsheet"));
                                spreadBuilder.a(new Pair("event.Action", "impression"));
                                a.z("event.Label", "similar items options", spreadBuilder, "event.Description", substitutionSource);
                                ArrayList arrayList = spreadBuilder.f24269a;
                                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                            }

                            @Override // au.com.woolworths.analytics.Event
                            /* renamed from: d */
                            public final String getE() {
                                return "bottomsheet_impression";
                            }

                            public final boolean equals(Object obj2) {
                                if (!(obj2 instanceof Event)) {
                                    return false;
                                }
                                Event event = (Event) obj2;
                                return "bottomsheet_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                            }

                            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                            @Override // au.com.woolworths.analytics.Event
                            public final Map getData() {
                                return this.d;
                            }
                        });
                    }
                }
            } else if (((ViewSimilarProductsContract.ViewState) mutableStateFlow.getValue()).b()) {
                analyticsManager.g(ListsAnalytics.ViewSimilarItems.Action.f);
            }
        } else {
            int i2 = ViewSimilarProductsActivity.C;
            MutableStateFlow mutableStateFlow2 = viewSimilarProductsActivity.T4().k;
            Object value2 = mutableStateFlow2.getValue();
            ViewSimilarProductsContract.ViewState.Content content2 = value2 instanceof ViewSimilarProductsContract.ViewState.Content ? (ViewSimilarProductsContract.ViewState.Content) value2 : null;
            if (content2 != null) {
                mutableStateFlow2.f(ViewSimilarProductsContract.ViewState.Content.d(content2, null, null, null, 57));
            }
        }
        return Unit.f24250a;
    }
}
