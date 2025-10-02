package au.com.woolworths.feature.rewards.offers.detail;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composer;
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
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.haptic.HapticExtKt;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferScreen;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsParamsLegacy;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsViewModel;
import au.com.woolworths.feature.rewards.offers.detail.composable.RewardsOfferDetailsScreenLegacyKt;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.rewards.offers.model.OfferActivationMessage;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.lifecycle.HiltViewModelExtensions;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsActivityLegacy;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@Deprecated
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsOfferDetailsActivityLegacy extends Hilt_RewardsOfferDetailsActivityLegacy {
    public static final /* synthetic */ int x = 0;
    public final ViewModelLazy w = new ViewModelLazy(Reflection.f24268a.b(RewardsOfferDetailsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsActivityLegacy$special$$inlined$assistedViewModels$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsActivityLegacy$special$$inlined$assistedViewModels$2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsActivityLegacy$special$$inlined$assistedViewModels$3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            CreationExtras defaultViewModelCreationExtras = this.d.getDefaultViewModelCreationExtras();
            final RewardsOfferDetailsActivityLegacy rewardsOfferDetailsActivityLegacy = this;
            return HiltViewModelExtensions.a(defaultViewModelCreationExtras, new Function1<RewardsOfferDetailsViewModel.Factory, ViewModel>() { // from class: au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsActivityLegacy$special$$inlined$assistedViewModels$3.1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Activities.RewardsOfferDetailsOld.Extras extras;
                    Activities.RewardsOfferDetailsOld.Extras extras2;
                    Activities.RewardsOfferDetailsOld.Extras extras3;
                    RewardsOfferDetailsViewModel.Factory factory = (RewardsOfferDetailsViewModel.Factory) obj;
                    int i = RewardsOfferDetailsActivityLegacy.x;
                    RewardsOfferDetailsActivityLegacy rewardsOfferDetailsActivityLegacy2 = rewardsOfferDetailsActivityLegacy;
                    Intent intent = rewardsOfferDetailsActivityLegacy2.getIntent();
                    List list = null;
                    String stringExtra = (intent == null || (extras3 = (Activities.RewardsOfferDetailsOld.Extras) intent.getParcelableExtra("EXTRA_OFFER_DETAILS")) == null) ? null : extras3.d;
                    if (stringExtra == null) {
                        Intent intent2 = rewardsOfferDetailsActivityLegacy2.getIntent();
                        stringExtra = intent2 != null ? intent2.getStringExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.offerId") : null;
                        if (stringExtra == null) {
                            Bark.Companion companion = Bark.f8483a;
                            Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.e), "Offer Id MUST NOT be null", null);
                            stringExtra = "";
                        }
                    }
                    Intent intent3 = rewardsOfferDetailsActivityLegacy2.getIntent();
                    String stringExtra2 = (intent3 == null || (extras2 = (Activities.RewardsOfferDetailsOld.Extras) intent3.getParcelableExtra("EXTRA_OFFER_DETAILS")) == null) ? null : extras2.e;
                    if (stringExtra2 == null) {
                        Intent intent4 = rewardsOfferDetailsActivityLegacy2.getIntent();
                        stringExtra2 = intent4 != null ? intent4.getStringExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.offerType") : null;
                    }
                    OfferDetailsParamsLegacy offerIdWithOfferType = stringExtra2 != null ? new OfferDetailsParamsLegacy.OfferIdWithOfferType(stringExtra, stringExtra2) : new OfferDetailsParamsLegacy.OfferIdOnly(stringExtra);
                    Intent intent5 = rewardsOfferDetailsActivityLegacy2.getIntent();
                    boolean booleanExtra = intent5 != null ? intent5.getBooleanExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.hasPendingActivation", false) : false;
                    Intent intent6 = rewardsOfferDetailsActivityLegacy2.getIntent();
                    if (intent6 != null && (extras = (Activities.RewardsOfferDetailsOld.Extras) intent6.getParcelableExtra("EXTRA_OFFER_DETAILS")) != null) {
                        list = extras.f;
                    }
                    return factory.a(offerIdWithOfferType, booleanExtra, list);
                }
            });
        }
    });

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsActivityLegacy$Companion;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static void a(Activity activity, String offerId) {
            Intrinsics.h(activity, "activity");
            Intrinsics.h(offerId, "offerId");
            Intent intent = new Intent(activity, (Class<?>) RewardsOfferDetailsActivityLegacy.class);
            intent.putExtra("EXTRA_OFFER_DETAILS", new Activities.RewardsOfferDetailsOld.Extras(offerId, null, null));
            activity.startActivity(intent);
        }
    }

    @Override // au.com.woolworths.feature.rewards.offers.detail.Hilt_RewardsOfferDetailsActivityLegacy, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsActivityLegacy.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final RewardsOfferDetailsActivityLegacy rewardsOfferDetailsActivityLegacy = RewardsOfferDetailsActivityLegacy.this;
                    ThemeKt.a(48, composer, ComposableLambdaKt.c(-1633376878, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsActivityLegacy.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                final RewardsOfferDetailsActivityLegacy rewardsOfferDetailsActivityLegacy2 = rewardsOfferDetailsActivityLegacy;
                                WindowCompat.b(rewardsOfferDetailsActivityLegacy2.getWindow(), false);
                                rewardsOfferDetailsActivityLegacy2.getWindow().setStatusBarColor(0);
                                rewardsOfferDetailsActivityLegacy2.getWindow().setNavigationBarColor(0);
                                Modifier modifierB = WindowInsetsPadding_androidKt.b(SizeKt.c);
                                RewardsOfferDetailsViewModel rewardsOfferDetailsViewModel = (RewardsOfferDetailsViewModel) rewardsOfferDetailsActivityLegacy2.w.getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(rewardsOfferDetailsActivityLegacy2);
                                Object objG = composer2.G();
                                Object obj5 = Composer.Companion.f1624a;
                                if (zI || objG == obj5) {
                                    final int i = 0;
                                    objG = new Function0() { // from class: au.com.woolworths.feature.rewards.offers.detail.a
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i) {
                                                case 0:
                                                    rewardsOfferDetailsActivityLegacy2.finish();
                                                    break;
                                                case 1:
                                                    HapticExtKt.c(rewardsOfferDetailsActivityLegacy2);
                                                    break;
                                                default:
                                                    HapticExtKt.a(rewardsOfferDetailsActivityLegacy2);
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG);
                                }
                                Function0 function0 = (Function0) objG;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(rewardsOfferDetailsActivityLegacy2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == obj5) {
                                    final int i2 = 0;
                                    objG2 = new Function1() { // from class: au.com.woolworths.feature.rewards.offers.detail.b
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            int i3 = i2;
                                            Unit unit = Unit.f24250a;
                                            RewardsOfferDetailsActivityLegacy rewardsOfferDetailsActivityLegacy3 = rewardsOfferDetailsActivityLegacy2;
                                            switch (i3) {
                                                case 0:
                                                    String it = (String) obj6;
                                                    Intrinsics.h(it, "it");
                                                    ContextExtKt.e(rewardsOfferDetailsActivityLegacy3, it);
                                                    break;
                                                case 1:
                                                    OfferActivationMessage it2 = (OfferActivationMessage) obj6;
                                                    Intrinsics.h(it2, "it");
                                                    int i4 = RewardsOfferDetailsActivityLegacy.x;
                                                    new AlertDialog.Builder(rewardsOfferDetailsActivityLegacy3).setTitle(it2.getTitle()).setMessage(it2.getMessage()).setPositiveButton(it2.getButtonLabel(), (DialogInterface.OnClickListener) null).show();
                                                    break;
                                                default:
                                                    Text it3 = (Text) obj6;
                                                    Intrinsics.h(it3, "it");
                                                    int i5 = RewardsOfferDetailsActivityLegacy.x;
                                                    Toast.makeText(rewardsOfferDetailsActivityLegacy3, it3.getText(rewardsOfferDetailsActivityLegacy3), 0).show();
                                                    rewardsOfferDetailsActivityLegacy3.finish();
                                                    break;
                                            }
                                            return unit;
                                        }
                                    };
                                    composer2.A(objG2);
                                }
                                Function1 function1 = (Function1) objG2;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(rewardsOfferDetailsActivityLegacy2);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == obj5) {
                                    final int i3 = 1;
                                    objG3 = new Function1() { // from class: au.com.woolworths.feature.rewards.offers.detail.b
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            int i32 = i3;
                                            Unit unit = Unit.f24250a;
                                            RewardsOfferDetailsActivityLegacy rewardsOfferDetailsActivityLegacy3 = rewardsOfferDetailsActivityLegacy2;
                                            switch (i32) {
                                                case 0:
                                                    String it = (String) obj6;
                                                    Intrinsics.h(it, "it");
                                                    ContextExtKt.e(rewardsOfferDetailsActivityLegacy3, it);
                                                    break;
                                                case 1:
                                                    OfferActivationMessage it2 = (OfferActivationMessage) obj6;
                                                    Intrinsics.h(it2, "it");
                                                    int i4 = RewardsOfferDetailsActivityLegacy.x;
                                                    new AlertDialog.Builder(rewardsOfferDetailsActivityLegacy3).setTitle(it2.getTitle()).setMessage(it2.getMessage()).setPositiveButton(it2.getButtonLabel(), (DialogInterface.OnClickListener) null).show();
                                                    break;
                                                default:
                                                    Text it3 = (Text) obj6;
                                                    Intrinsics.h(it3, "it");
                                                    int i5 = RewardsOfferDetailsActivityLegacy.x;
                                                    Toast.makeText(rewardsOfferDetailsActivityLegacy3, it3.getText(rewardsOfferDetailsActivityLegacy3), 0).show();
                                                    rewardsOfferDetailsActivityLegacy3.finish();
                                                    break;
                                            }
                                            return unit;
                                        }
                                    };
                                    composer2.A(objG3);
                                }
                                Function1 function12 = (Function1) objG3;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(rewardsOfferDetailsActivityLegacy2);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == obj5) {
                                    final int i4 = 2;
                                    objG4 = new Function1() { // from class: au.com.woolworths.feature.rewards.offers.detail.b
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            int i32 = i4;
                                            Unit unit = Unit.f24250a;
                                            RewardsOfferDetailsActivityLegacy rewardsOfferDetailsActivityLegacy3 = rewardsOfferDetailsActivityLegacy2;
                                            switch (i32) {
                                                case 0:
                                                    String it = (String) obj6;
                                                    Intrinsics.h(it, "it");
                                                    ContextExtKt.e(rewardsOfferDetailsActivityLegacy3, it);
                                                    break;
                                                case 1:
                                                    OfferActivationMessage it2 = (OfferActivationMessage) obj6;
                                                    Intrinsics.h(it2, "it");
                                                    int i42 = RewardsOfferDetailsActivityLegacy.x;
                                                    new AlertDialog.Builder(rewardsOfferDetailsActivityLegacy3).setTitle(it2.getTitle()).setMessage(it2.getMessage()).setPositiveButton(it2.getButtonLabel(), (DialogInterface.OnClickListener) null).show();
                                                    break;
                                                default:
                                                    Text it3 = (Text) obj6;
                                                    Intrinsics.h(it3, "it");
                                                    int i5 = RewardsOfferDetailsActivityLegacy.x;
                                                    Toast.makeText(rewardsOfferDetailsActivityLegacy3, it3.getText(rewardsOfferDetailsActivityLegacy3), 0).show();
                                                    rewardsOfferDetailsActivityLegacy3.finish();
                                                    break;
                                            }
                                            return unit;
                                        }
                                    };
                                    composer2.A(objG4);
                                }
                                Function1 function13 = (Function1) objG4;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(rewardsOfferDetailsActivityLegacy2);
                                Object objG5 = composer2.G();
                                if (zI5 || objG5 == obj5) {
                                    final int i5 = 1;
                                    objG5 = new Function0() { // from class: au.com.woolworths.feature.rewards.offers.detail.a
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i5) {
                                                case 0:
                                                    rewardsOfferDetailsActivityLegacy2.finish();
                                                    break;
                                                case 1:
                                                    HapticExtKt.c(rewardsOfferDetailsActivityLegacy2);
                                                    break;
                                                default:
                                                    HapticExtKt.a(rewardsOfferDetailsActivityLegacy2);
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG5);
                                }
                                Function0 function02 = (Function0) objG5;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI6 = composer2.I(rewardsOfferDetailsActivityLegacy2);
                                Object objG6 = composer2.G();
                                if (zI6 || objG6 == obj5) {
                                    final int i6 = 2;
                                    objG6 = new Function0() { // from class: au.com.woolworths.feature.rewards.offers.detail.a
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i6) {
                                                case 0:
                                                    rewardsOfferDetailsActivityLegacy2.finish();
                                                    break;
                                                case 1:
                                                    HapticExtKt.c(rewardsOfferDetailsActivityLegacy2);
                                                    break;
                                                default:
                                                    HapticExtKt.a(rewardsOfferDetailsActivityLegacy2);
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG6);
                                }
                                composer2.l();
                                RewardsOfferDetailsScreenLegacyKt.g(rewardsOfferDetailsViewModel, function0, function1, function12, function13, function02, (Function0) objG6, modifierB, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1049768901));
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        ViewModelLazy viewModelLazy = this.w;
        ((RewardsOfferDetailsViewModel) viewModelLazy.getD()).q6();
        RewardsOfferDetailsViewModel rewardsOfferDetailsViewModel = (RewardsOfferDetailsViewModel) viewModelLazy.getD();
        rewardsOfferDetailsViewModel.h.a(RewardsOfferScreen.d);
    }
}
