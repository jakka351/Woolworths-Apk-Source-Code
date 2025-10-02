package au.com.woolworths.shop.checkout.ui.substitution;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.substitution.CheckoutSubstitutionAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.product.details.d;
import au.com.woolworths.shop.checkout.ui.substitution.SubstitutionActivity;
import au.com.woolworths.shop.checkout.ui.substitution.SubstitutionContract;
import au.com.woolworths.shop.checkout.ui.substitution.component.SubstitutionScreenKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Extras", "Companion", "Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionContract$ViewState;", "viewState", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SubstitutionActivity extends Hilt_SubstitutionActivity {
    public static final /* synthetic */ int x = 0;
    public final ViewModelLazy w = new ViewModelLazy(Reflection.f24268a.b(SubstitutionViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.checkout.ui.substitution.SubstitutionActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.checkout.ui.substitution.SubstitutionActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.checkout.ui.substitution.SubstitutionActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionActivity$Companion;", "", "", "EXTRAS", "Ljava/lang/String;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static Intent a(FragmentActivity fragmentActivity, String str, double d) {
            Intent intent = new Intent(fragmentActivity, (Class<?>) SubstitutionActivity.class);
            intent.putExtra("Extra_Substitution", new Extras(str, d));
            return intent;
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionActivity$Extras;", "Landroid/os/Parcelable;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        public final String d;
        public final double e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extras(parcel.readString(), parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        public Extras(String productId, double d) {
            Intrinsics.h(productId, "productId");
            this.d = productId;
            this.e = d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Extras)) {
                return false;
            }
            Extras extras = (Extras) obj;
            return Intrinsics.c(this.d, extras.d) && Double.compare(this.e, extras.e) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.e) + (this.d.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.e, "Extras(productId=", this.d, ", quantity=");
            sbR.append(")");
            return sbR.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
            dest.writeDouble(this.e);
        }
    }

    public final SubstitutionViewModel N4() {
        return (SubstitutionViewModel) this.w.getD();
    }

    @Override // au.com.woolworths.shop.checkout.ui.substitution.Hilt_SubstitutionActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getF().a(this, new OnBackPressedCallback() { // from class: au.com.woolworths.shop.checkout.ui.substitution.SubstitutionActivity.onCreate.1
            @Override // androidx.activity.OnBackPressedCallback
            public final void e() {
                SubstitutionActivity substitutionActivity = SubstitutionActivity.this;
                SubstitutionViewModel substitutionViewModelN4 = substitutionActivity.N4();
                AnalyticsManager analyticsManager = substitutionViewModelN4.g;
                CheckoutSubstitutionAnalytics.SubstitutionPreference.Action.Companion companion = CheckoutSubstitutionAnalytics.SubstitutionPreference.Action.d;
                String str = substitutionViewModelN4.m;
                if (str == null) {
                    Intrinsics.p("productId");
                    throw null;
                }
                final List listQ = CollectionsKt.Q(str);
                companion.getClass();
                analyticsManager.g(new Event(listQ) { // from class: au.com.woolworths.analytics.supers.substitution.CheckoutSubstitutionAnalytics$SubstitutionPreference$Action$Companion$close$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                        spreadBuilder.b(CheckoutSubstitutionAnalytics.SubstitutionPreference.e);
                        spreadBuilder.a(new Pair("event.Category", "Substitution modal"));
                        spreadBuilder.a(new Pair("event.Action", "click"));
                        spreadBuilder.a(new Pair("event.Label", "Closed no changes"));
                        spreadBuilder.a(new Pair("product.ID", listQ));
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getE() {
                        return "substitution_modal_closed";
                    }

                    public final boolean equals(Object obj) {
                        if (!(obj instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj;
                        return "substitution_modal_closed".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
                substitutionActivity.finish();
            }
        });
        Parcelable parcelableExtra = getIntent().getParcelableExtra("Extra_Substitution");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("Extras are required for SubstitutionActivity. Use SubstitutionActivity.createLaunchIntent when launch this activity");
        }
        final Extras extras = (Extras) parcelableExtra;
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.substitution.SubstitutionActivity.onCreate.2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final SubstitutionActivity substitutionActivity = SubstitutionActivity.this;
                    final MutableState mutableStateA = FlowExtKt.a(substitutionActivity.N4().k, composer);
                    final Extras extras2 = extras;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(877071122, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.substitution.SubstitutionActivity.onCreate.2.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                SubstitutionContract.ViewState viewState = (SubstitutionContract.ViewState) mutableStateA.getD();
                                final SubstitutionActivity substitutionActivity2 = substitutionActivity;
                                SharedFlowImpl sharedFlowImpl = substitutionActivity2.N4().i;
                                composer2.o(5004770);
                                boolean zI = composer2.I(substitutionActivity2);
                                Object objG = composer2.G();
                                Object obj5 = Composer.Companion.f1624a;
                                if (zI || objG == obj5) {
                                    objG = new d(substitutionActivity2, 20);
                                    composer2.A(objG);
                                }
                                Function1 function1 = (Function1) objG;
                                composer2.l();
                                composer2.o(-1633490746);
                                boolean zI2 = composer2.I(substitutionActivity2);
                                final Extras extras3 = extras2;
                                boolean zN = zI2 | composer2.n(extras3);
                                Object objG2 = composer2.G();
                                if (zN || objG2 == obj5) {
                                    final int i = 0;
                                    objG2 = new Function0() { // from class: au.com.woolworths.shop.checkout.ui.substitution.a
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i) {
                                                case 0:
                                                    SubstitutionViewModel substitutionViewModelN4 = substitutionActivity2.N4();
                                                    SubstitutionActivity.Extras extras4 = extras3;
                                                    substitutionViewModelN4.r6(extras4.e, extras4.d);
                                                    break;
                                                default:
                                                    SubstitutionActivity substitutionActivity3 = substitutionActivity2;
                                                    SubstitutionViewModel substitutionViewModelN42 = substitutionActivity3.N4();
                                                    SubstitutionActivity.Extras extras5 = extras3;
                                                    String productId = extras5.d;
                                                    Intrinsics.h(productId, "productId");
                                                    AnalyticsManager analyticsManager = substitutionViewModelN42.g;
                                                    CheckoutSubstitutionAnalytics.SubstitutionPreference.Action.Companion companion = CheckoutSubstitutionAnalytics.SubstitutionPreference.Action.d;
                                                    List listQ = CollectionsKt.Q(productId);
                                                    companion.getClass();
                                                    analyticsManager.g(new Event(listQ) { // from class: au.com.woolworths.analytics.supers.substitution.CheckoutSubstitutionAnalytics$SubstitutionPreference$Action$Companion$noSubstitutionSuggestionsFoundTryAgain$1
                                                        public final Object d;

                                                        {
                                                            SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                                            spreadBuilder.b(CheckoutSubstitutionAnalytics.SubstitutionPreference.e);
                                                            spreadBuilder.a(new Pair("event.Category", "Checkout Substitutions"));
                                                            spreadBuilder.a(new Pair("event.Action", "click"));
                                                            spreadBuilder.a(new Pair("event.Label", "My choice - No suggestions found banner click"));
                                                            spreadBuilder.a(new Pair("product.ID", listQ));
                                                            ArrayList arrayList = spreadBuilder.f24269a;
                                                            this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                                        }

                                                        @Override // au.com.woolworths.analytics.Event
                                                        /* renamed from: d */
                                                        public final String getE() {
                                                            return "no_substitution_suggestions_found_try_again";
                                                        }

                                                        public final boolean equals(Object obj6) {
                                                            if (!(obj6 instanceof Event)) {
                                                                return false;
                                                            }
                                                            Event event = (Event) obj6;
                                                            return "no_substitution_suggestions_found_try_again".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                                        }

                                                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                                        @Override // au.com.woolworths.analytics.Event
                                                        public final Map getData() {
                                                            return this.d;
                                                        }
                                                    });
                                                    substitutionActivity3.N4().r6(extras5.e, productId);
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG2);
                                }
                                Function0 function0 = (Function0) objG2;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(substitutionActivity2);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == obj5) {
                                    objG3 = new au.com.woolworths.feature.shop.homepage.presentation.marketplace.a(substitutionActivity2, 27);
                                    composer2.A(objG3);
                                }
                                Function2 function2 = (Function2) objG3;
                                composer2.l();
                                Object f = substitutionActivity2.getF();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(f);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == obj5) {
                                    objG4 = new SubstitutionActivity$onCreate$2$1$4$1(0, f, OnBackPressedDispatcher.class, "onBackPressed", "onBackPressed()V", 0);
                                    composer2.A(objG4);
                                }
                                composer2.l();
                                Function0 function02 = (Function0) ((KFunction) objG4);
                                Object objN4 = substitutionActivity2.N4();
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(objN4);
                                Object objG5 = composer2.G();
                                if (zI5 || objG5 == obj5) {
                                    Object substitutionActivity$onCreate$2$1$5$1 = new SubstitutionActivity$onCreate$2$1$5$1(0, objN4, SubstitutionViewModel.class, "save", "save()V", 0);
                                    composer2.A(substitutionActivity$onCreate$2$1$5$1);
                                    objG5 = substitutionActivity$onCreate$2$1$5$1;
                                }
                                composer2.l();
                                Function0 function03 = (Function0) ((KFunction) objG5);
                                Object objN42 = substitutionActivity2.N4();
                                composer2.o(5004770);
                                boolean zI6 = composer2.I(objN42);
                                Object objG6 = composer2.G();
                                if (zI6 || objG6 == obj5) {
                                    objG6 = new SubstitutionActivity$onCreate$2$1$6$1(1, objN42, SubstitutionViewModel.class, "onCheaperSubstituteBannerDismiss", "onCheaperSubstituteBannerDismiss(Lau/com/woolworths/foundation/shop/banners/broadcastbanner/data/BroadcastBannerData;)V", 0);
                                    composer2.A(objG6);
                                }
                                composer2.l();
                                Function1 function12 = (Function1) ((KFunction) objG6);
                                composer2.o(-1633490746);
                                boolean zI7 = composer2.I(substitutionActivity2) | composer2.n(extras3);
                                Object objG7 = composer2.G();
                                if (zI7 || objG7 == obj5) {
                                    final int i2 = 1;
                                    objG7 = new Function0() { // from class: au.com.woolworths.shop.checkout.ui.substitution.a
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i2) {
                                                case 0:
                                                    SubstitutionViewModel substitutionViewModelN4 = substitutionActivity2.N4();
                                                    SubstitutionActivity.Extras extras4 = extras3;
                                                    substitutionViewModelN4.r6(extras4.e, extras4.d);
                                                    break;
                                                default:
                                                    SubstitutionActivity substitutionActivity3 = substitutionActivity2;
                                                    SubstitutionViewModel substitutionViewModelN42 = substitutionActivity3.N4();
                                                    SubstitutionActivity.Extras extras5 = extras3;
                                                    String productId = extras5.d;
                                                    Intrinsics.h(productId, "productId");
                                                    AnalyticsManager analyticsManager = substitutionViewModelN42.g;
                                                    CheckoutSubstitutionAnalytics.SubstitutionPreference.Action.Companion companion = CheckoutSubstitutionAnalytics.SubstitutionPreference.Action.d;
                                                    List listQ = CollectionsKt.Q(productId);
                                                    companion.getClass();
                                                    analyticsManager.g(new Event(listQ) { // from class: au.com.woolworths.analytics.supers.substitution.CheckoutSubstitutionAnalytics$SubstitutionPreference$Action$Companion$noSubstitutionSuggestionsFoundTryAgain$1
                                                        public final Object d;

                                                        {
                                                            SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                                            spreadBuilder.b(CheckoutSubstitutionAnalytics.SubstitutionPreference.e);
                                                            spreadBuilder.a(new Pair("event.Category", "Checkout Substitutions"));
                                                            spreadBuilder.a(new Pair("event.Action", "click"));
                                                            spreadBuilder.a(new Pair("event.Label", "My choice - No suggestions found banner click"));
                                                            spreadBuilder.a(new Pair("product.ID", listQ));
                                                            ArrayList arrayList = spreadBuilder.f24269a;
                                                            this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                                        }

                                                        @Override // au.com.woolworths.analytics.Event
                                                        /* renamed from: d */
                                                        public final String getE() {
                                                            return "no_substitution_suggestions_found_try_again";
                                                        }

                                                        public final boolean equals(Object obj6) {
                                                            if (!(obj6 instanceof Event)) {
                                                                return false;
                                                            }
                                                            Event event = (Event) obj6;
                                                            return "no_substitution_suggestions_found_try_again".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                                        }

                                                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                                        @Override // au.com.woolworths.analytics.Event
                                                        public final Map getData() {
                                                            return this.d;
                                                        }
                                                    });
                                                    substitutionActivity3.N4().r6(extras5.e, productId);
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG7);
                                }
                                composer2.l();
                                SubstitutionScreenKt.a(viewState, sharedFlowImpl, function1, function0, function2, function02, function03, function12, (Function0) objG7, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1709907126));
        N4().r6(extras.e, extras.d);
    }
}
