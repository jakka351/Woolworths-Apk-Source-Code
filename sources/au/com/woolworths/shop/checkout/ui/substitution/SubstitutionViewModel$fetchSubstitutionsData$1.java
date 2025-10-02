package au.com.woolworths.shop.checkout.ui.substitution;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.substitution.CheckoutSubstitutionAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.shop.checkout.domain.interactor.SubstitutionInteractor;
import au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreference;
import au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreferenceOption;
import au.com.woolworths.shop.checkout.ui.substitution.SubstitutionContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.substitution.SubstitutionViewModel$fetchSubstitutionsData$1", f = "SubstitutionViewModel.kt", l = {65}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class SubstitutionViewModel$fetchSubstitutionsData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SubstitutionViewModel q;
    public final /* synthetic */ String r;
    public final /* synthetic */ double s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubstitutionViewModel$fetchSubstitutionsData$1(SubstitutionViewModel substitutionViewModel, String str, double d, Continuation continuation) {
        super(2, continuation);
        this.q = substitutionViewModel;
        this.r = str;
        this.s = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SubstitutionViewModel$fetchSubstitutionsData$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SubstitutionViewModel$fetchSubstitutionsData$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object objA;
        Object next;
        Object value4;
        SubstitutionContract.ViewState.ButtonState buttonState;
        LinkedHashMap linkedHashMapT6;
        BroadcastBannerData broadcastBannerData;
        SubstitutionViewModel substitutionViewModel = this.q;
        AnalyticsManager analyticsManager = substitutionViewModel.g;
        MutableStateFlow mutableStateFlow = substitutionViewModel.j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                do {
                    value3 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value3, SubstitutionContract.ViewState.Loading.f10817a));
                SubstitutionInteractor substitutionInteractor = substitutionViewModel.e;
                String str = this.r;
                double d = this.s;
                this.p = 1;
                objA = substitutionInteractor.a(str, d, this);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                objA = ((Result) obj).d;
            }
            ResultKt.b(objA);
            SubstitutionPreference substitutionPreference = (SubstitutionPreference) objA;
            Iterator it = substitutionPreference.c.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((SubstitutionPreferenceOption) next).c) {
                    break;
                }
            }
            SubstitutionPreferenceOption substitutionPreferenceOption = (SubstitutionPreferenceOption) next;
            String str2 = substitutionPreferenceOption != null ? substitutionPreferenceOption.f10666a : null;
            substitutionViewModel.l = str2;
            if (substitutionPreference.c.b != null) {
                CheckoutSubstitutionAnalytics.SubstitutionPreference.Action.Companion companion = CheckoutSubstitutionAnalytics.SubstitutionPreference.Action.d;
                String str3 = substitutionViewModel.m;
                if (str3 == null) {
                    Intrinsics.p("productId");
                    throw null;
                }
                final List listQ = CollectionsKt.Q(str3);
                companion.getClass();
                analyticsManager.g(new Event(listQ) { // from class: au.com.woolworths.analytics.supers.substitution.CheckoutSubstitutionAnalytics$SubstitutionPreference$Action$Companion$noSubstitutionSuggestionsFound$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                        spreadBuilder.b(CheckoutSubstitutionAnalytics.SubstitutionPreference.e);
                        spreadBuilder.a(new Pair("event.Category", "Checkout Substitutions"));
                        spreadBuilder.a(new Pair("event.Action", "impression"));
                        spreadBuilder.a(new Pair("event.Label", "My choice - No suggestions found"));
                        spreadBuilder.a(new Pair("product.ID", listQ));
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getD() {
                        return "no_substitution_suggestions_found";
                    }

                    public final boolean equals(Object obj2) {
                        if (!(obj2 instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj2;
                        return "no_substitution_suggestions_found".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
            }
            do {
                value4 = mutableStateFlow.getValue();
                buttonState = SubstitutionContract.ViewState.ButtonState.e;
                linkedHashMapT6 = SubstitutionViewModel.t6(substitutionPreference.d);
                broadcastBannerData = substitutionPreference.b.f10658a;
            } while (!mutableStateFlow.d(value4, new SubstitutionContract.ViewState.Content(substitutionPreference, str2, buttonState, linkedHashMapT6, broadcastBannerData != null ? substitutionViewModel.f.a(broadcastBannerData) : false)));
        } catch (Throwable th) {
            if (th instanceof NoConnectivityException) {
                CheckoutSubstitutionAnalytics.SubstitutionPreference.Action.Companion companion2 = CheckoutSubstitutionAnalytics.SubstitutionPreference.Action.d;
                String str4 = substitutionViewModel.m;
                if (str4 == null) {
                    Intrinsics.p("productId");
                    throw null;
                }
                final List listQ2 = CollectionsKt.Q(str4);
                companion2.getClass();
                analyticsManager.g(new Event(listQ2) { // from class: au.com.woolworths.analytics.supers.substitution.CheckoutSubstitutionAnalytics$SubstitutionPreference$Action$Companion$networkError$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                        spreadBuilder.b(CheckoutSubstitutionAnalytics.SubstitutionPreference.e);
                        spreadBuilder.a(new Pair("event.Category", "Substitution error"));
                        spreadBuilder.a(new Pair("event.Action", "error"));
                        spreadBuilder.a(new Pair("event.Label", "Network error"));
                        spreadBuilder.a(new Pair("product.ID", listQ2));
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getD() {
                        return "substitution_error";
                    }

                    public final boolean equals(Object obj2) {
                        if (!(obj2 instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj2;
                        return "substitution_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value2, new SubstitutionContract.ViewState.Error(FullPageMessage.Error.ConnectionError.f8915a)));
            } else if (th instanceof ServerErrorException) {
                CheckoutSubstitutionAnalytics.SubstitutionPreference.Action.Companion companion3 = CheckoutSubstitutionAnalytics.SubstitutionPreference.Action.d;
                String str5 = substitutionViewModel.m;
                if (str5 == null) {
                    Intrinsics.p("productId");
                    throw null;
                }
                final List listQ3 = CollectionsKt.Q(str5);
                companion3.getClass();
                analyticsManager.g(new Event(listQ3) { // from class: au.com.woolworths.analytics.supers.substitution.CheckoutSubstitutionAnalytics$SubstitutionPreference$Action$Companion$serverError$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                        spreadBuilder.b(CheckoutSubstitutionAnalytics.SubstitutionPreference.e);
                        spreadBuilder.a(new Pair("event.Category", "Substitution error"));
                        spreadBuilder.a(new Pair("event.Action", "error"));
                        spreadBuilder.a(new Pair("event.Label", "API timeout / no response"));
                        spreadBuilder.a(new Pair("product.ID", listQ3));
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getD() {
                        return "substitution_error";
                    }

                    public final boolean equals(Object obj2) {
                        if (!(obj2 instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj2;
                        return "substitution_error".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value, new SubstitutionContract.ViewState.Error(FullPageMessage.Error.ServerError.f8916a)));
            }
        }
        return Unit.f24250a;
    }
}
