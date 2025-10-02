package au.com.woolworths.feature.rewards.offers.detail;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.feature.rewards.offers.data.OfferDetailsParams;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsViewModel;
import au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.lifecycle.HiltViewModelExtensions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OfferDetailsActivity extends Hilt_OfferDetailsActivity {
    public static final /* synthetic */ int x = 0;
    public final ViewModelLazy w = new ViewModelLazy(Reflection.f24268a.b(OfferDetailsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.offers.detail.OfferDetailsActivity$special$$inlined$assistedViewModels$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.offers.detail.OfferDetailsActivity$special$$inlined$assistedViewModels$2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.offers.detail.OfferDetailsActivity$special$$inlined$assistedViewModels$3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            CreationExtras defaultViewModelCreationExtras = this.d.getDefaultViewModelCreationExtras();
            final OfferDetailsActivity offerDetailsActivity = this;
            return HiltViewModelExtensions.a(defaultViewModelCreationExtras, new Function1<OfferDetailsViewModel.Factory, ViewModel>() { // from class: au.com.woolworths.feature.rewards.offers.detail.OfferDetailsActivity$special$$inlined$assistedViewModels$3.1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Activities.RewardsOfferDetails.Extras extras;
                    Activities.RewardsOfferDetails.Extras extras2;
                    Activities.RewardsOfferDetails.Extras extras3;
                    OfferDetailsViewModel.Factory factory = (OfferDetailsViewModel.Factory) obj;
                    int i = OfferDetailsActivity.x;
                    OfferDetailsActivity offerDetailsActivity2 = offerDetailsActivity;
                    Intent intent = offerDetailsActivity2.getIntent();
                    List list = null;
                    String stringExtra = (intent == null || (extras3 = (Activities.RewardsOfferDetails.Extras) intent.getParcelableExtra("EXTRA_OFFER_DETAILS")) == null) ? null : extras3.d;
                    if (stringExtra == null) {
                        Intent intent2 = offerDetailsActivity2.getIntent();
                        stringExtra = intent2 != null ? intent2.getStringExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.offerId") : null;
                        if (stringExtra == null) {
                            Bark.Companion companion = Bark.f8483a;
                            Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.e), "Offer Id MUST NOT be null", null);
                            stringExtra = "";
                        }
                    }
                    Intent intent3 = offerDetailsActivity2.getIntent();
                    String stringExtra2 = (intent3 == null || (extras2 = (Activities.RewardsOfferDetails.Extras) intent3.getParcelableExtra("EXTRA_OFFER_DETAILS")) == null) ? null : extras2.e;
                    if (stringExtra2 == null) {
                        Intent intent4 = offerDetailsActivity2.getIntent();
                        stringExtra2 = intent4 != null ? intent4.getStringExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.offerType") : null;
                    }
                    OfferDetailsParams offerDetailsParams = new OfferDetailsParams(stringExtra, stringExtra2);
                    Intent intent5 = offerDetailsActivity2.getIntent();
                    boolean booleanExtra = intent5 != null ? intent5.getBooleanExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.hasPendingActivation", false) : false;
                    Intent intent6 = offerDetailsActivity2.getIntent();
                    if (intent6 != null && (extras = (Activities.RewardsOfferDetails.Extras) intent6.getParcelableExtra("EXTRA_OFFER_DETAILS")) != null) {
                        list = extras.f;
                    }
                    return factory.a(offerDetailsParams, booleanExtra, list);
                }
            });
        }
    });

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsActivity$Companion;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static void a(Activity activity, String offerId) {
            int i = OfferDetailsActivity.x;
            Intrinsics.h(activity, "activity");
            Intrinsics.h(offerId, "offerId");
            Intent intent = new Intent(activity, (Class<?>) OfferDetailsActivity.class);
            intent.putExtra("EXTRA_OFFER_DETAILS", new Activities.RewardsOfferDetails.Extras(offerId, null, null));
            activity.startActivity(intent);
        }
    }

    @Override // au.com.woolworths.feature.rewards.offers.detail.Hilt_OfferDetailsActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.detail.OfferDetailsActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final OfferDetailsActivity offerDetailsActivity = OfferDetailsActivity.this;
                    WindowCompat.b(offerDetailsActivity.getWindow(), false);
                    offerDetailsActivity.getWindow().setStatusBarColor(0);
                    offerDetailsActivity.getWindow().setNavigationBarColor(0);
                    CoreThemeKt.b(6, composer, ComposableLambdaKt.c(219251784, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.detail.OfferDetailsActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                Modifier modifierB = WindowInsetsPadding_androidKt.b(SizeKt.c);
                                int i = OfferDetailsActivity.x;
                                OfferDetailsActivity offerDetailsActivity2 = offerDetailsActivity;
                                OfferDetailsViewModel offerDetailsViewModel = (OfferDetailsViewModel) offerDetailsActivity2.w.getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(offerDetailsActivity2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    OfferDetailsActivity$onCreate$1$1$1$1 offerDetailsActivity$onCreate$1$1$1$1 = new OfferDetailsActivity$onCreate$1$1$1$1(0, offerDetailsActivity2, OfferDetailsActivity.class, "finish", "finish()V", 0);
                                    composer2.A(offerDetailsActivity$onCreate$1$1$1$1);
                                    objG = offerDetailsActivity$onCreate$1$1$1$1;
                                }
                                composer2.l();
                                Function0 function0 = (Function0) ((KFunction) objG);
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(offerDetailsActivity2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    objG2 = new l(offerDetailsActivity2, 4);
                                    composer2.A(objG2);
                                }
                                composer2.l();
                                OfferDetailsScreenKt.g(offerDetailsViewModel, function0, (Function1) objG2, modifierB, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -602627035));
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        ((OfferDetailsViewModel) this.w.getD()).v6();
    }
}
