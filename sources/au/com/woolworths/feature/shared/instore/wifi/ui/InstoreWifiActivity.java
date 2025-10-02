package au.com.woolworths.feature.shared.instore.wifi.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shared.instore.wifi.analytics.InstoreWifiAction;
import au.com.woolworths.feature.shared.instore.wifi.analytics.ShopInstoreWifiAnalyticsInteractor;
import au.com.woolworths.feature.shared.instore.wifi.ui.content.AppSpecificContent;
import au.com.woolworths.feature.shared.instore.wifi.ui.content.RewardsAppSpecificContent;
import au.com.woolworths.feature.shared.instore.wifi.ui.content.ShopAppSpecificContent;
import au.com.woolworths.foundation.feature.app.AppIdentifier;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/InstoreWifiActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Companion", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstoreWifiActivity extends Hilt_InstoreWifiActivity {
    public static final /* synthetic */ int D = 0;
    public Boolean A;
    public final ActivityResultLauncher B;
    public final ActivityResultLauncher C;
    public AppConfig w;
    public FeatureToggleManager x;
    public AppIdentifier y;
    public final ViewModelLazy z = new ViewModelLazy(Reflection.f24268a.b(InstoreWifiViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/InstoreWifiActivity$Companion;", "", "", "VIEW_MODE_BUNDLE_KEY", "Ljava/lang/String;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public InstoreWifiActivity() {
        final int i = 0;
        this.B = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.f
            public final /* synthetic */ InstoreWifiActivity e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                Intent intent;
                Text text;
                int i2 = i;
                InstoreWifiActivity instoreWifiActivity = this.e;
                ActivityResult result = (ActivityResult) obj;
                switch (i2) {
                    case 0:
                        int i3 = InstoreWifiActivity.D;
                        Intrinsics.h(result, "result");
                        if (result.d == -1) {
                            InstoreWifiViewModel instoreWifiViewModelN4 = instoreWifiActivity.N4();
                            String string = instoreWifiActivity.getString(R.string.message_wifi_setup_complete);
                            Intrinsics.g(string, "getString(...)");
                            Boolean bool = instoreWifiActivity.A;
                            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                            InstoreWifiViewModel.r6(instoreWifiViewModelN4, instoreWifiViewModelN4.h, null, false, string.toString(), null, 23);
                            instoreWifiViewModelN4.g.f6517a.c(new InstoreWifiAction.SetupCompleteSnackbarImpression(InstoreWifiViewModel.q6(zBooleanValue)));
                            break;
                        }
                        break;
                    default:
                        int i4 = InstoreWifiActivity.D;
                        Intrinsics.h(result, "result");
                        if (result.d == -1 && (intent = result.e) != null && (text = (Text) intent.getParcelableExtra("FEEDBACK_FORM_RESULT_MESSAGE")) != null) {
                            InstoreWifiViewModel instoreWifiViewModelN42 = instoreWifiActivity.N4();
                            CharSequence resultMessage = text.getText(instoreWifiActivity);
                            Intrinsics.h(resultMessage, "resultMessage");
                            InstoreWifiViewModel.r6(instoreWifiViewModelN42, instoreWifiViewModelN42.h, null, false, resultMessage.toString(), null, 23);
                            break;
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        this.C = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.f
            public final /* synthetic */ InstoreWifiActivity e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                Intent intent;
                Text text;
                int i22 = i2;
                InstoreWifiActivity instoreWifiActivity = this.e;
                ActivityResult result = (ActivityResult) obj;
                switch (i22) {
                    case 0:
                        int i3 = InstoreWifiActivity.D;
                        Intrinsics.h(result, "result");
                        if (result.d == -1) {
                            InstoreWifiViewModel instoreWifiViewModelN4 = instoreWifiActivity.N4();
                            String string = instoreWifiActivity.getString(R.string.message_wifi_setup_complete);
                            Intrinsics.g(string, "getString(...)");
                            Boolean bool = instoreWifiActivity.A;
                            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                            InstoreWifiViewModel.r6(instoreWifiViewModelN4, instoreWifiViewModelN4.h, null, false, string.toString(), null, 23);
                            instoreWifiViewModelN4.g.f6517a.c(new InstoreWifiAction.SetupCompleteSnackbarImpression(InstoreWifiViewModel.q6(zBooleanValue)));
                            break;
                        }
                        break;
                    default:
                        int i4 = InstoreWifiActivity.D;
                        Intrinsics.h(result, "result");
                        if (result.d == -1 && (intent = result.e) != null && (text = (Text) intent.getParcelableExtra("FEEDBACK_FORM_RESULT_MESSAGE")) != null) {
                            InstoreWifiViewModel instoreWifiViewModelN42 = instoreWifiActivity.N4();
                            CharSequence resultMessage = text.getText(instoreWifiActivity);
                            Intrinsics.h(resultMessage, "resultMessage");
                            InstoreWifiViewModel.r6(instoreWifiViewModelN42, instoreWifiViewModelN42.h, null, false, resultMessage.toString(), null, 23);
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final InstoreWifiViewModel N4() {
        return (InstoreWifiViewModel) this.z.getD();
    }

    @Override // au.com.woolworths.feature.shared.instore.wifi.ui.Hilt_InstoreWifiActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Boolean boolValueOf = null;
        if (bundle != null) {
            if (!bundle.containsKey("forceConnectedMode")) {
                bundle = null;
            }
            if (bundle != null) {
                boolValueOf = Boolean.valueOf(bundle.getBoolean("forceConnectedMode"));
            }
        }
        this.A = boolValueOf;
        final ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(new Function3<AppSpecificContent, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiActivity$onCreate$content$1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                AppSpecificContent it = (AppSpecificContent) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                Intrinsics.h(it, "it");
                final int i = 2;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? composer.n(it) : composer.I(it) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && composer.c()) {
                    composer.j();
                } else {
                    composer.o(5004770);
                    final InstoreWifiActivity instoreWifiActivity = this.d;
                    boolean zI = composer.I(instoreWifiActivity);
                    Object objG = composer.G();
                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                    if (zI || objG == composer$Companion$Empty$1) {
                        InstoreWifiActivity$onCreate$content$1$1$1 instoreWifiActivity$onCreate$content$1$1$1 = new InstoreWifiActivity$onCreate$content$1$1$1(0, instoreWifiActivity, InstoreWifiActivity.class, "finish", "finish()V", 0);
                        composer.A(instoreWifiActivity$onCreate$content$1$1$1);
                        objG = instoreWifiActivity$onCreate$content$1$1$1;
                    }
                    composer.l();
                    Function0 function0 = (Function0) ((KFunction) objG);
                    composer.o(5004770);
                    boolean zI2 = composer.I(instoreWifiActivity);
                    Object objG2 = composer.G();
                    if (zI2 || objG2 == composer$Companion$Empty$1) {
                        InstoreWifiActivity$onCreate$content$1$2$1 instoreWifiActivity$onCreate$content$1$2$1 = new InstoreWifiActivity$onCreate$content$1$2$1(0, instoreWifiActivity, InstoreWifiActivity.class, "launchJoinActivityForResult", "launchJoinActivityForResult()V", 0);
                        composer.A(instoreWifiActivity$onCreate$content$1$2$1);
                        objG2 = instoreWifiActivity$onCreate$content$1$2$1;
                    }
                    composer.l();
                    Function0 function02 = (Function0) ((KFunction) objG2);
                    composer.o(5004770);
                    boolean zI3 = composer.I(instoreWifiActivity);
                    Object objG3 = composer.G();
                    if (zI3 || objG3 == composer$Companion$Empty$1) {
                        final int i2 = 0;
                        objG3 = new Function1() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.g
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i3 = i2;
                                InstoreWifiActivity instoreWifiActivity2 = instoreWifiActivity;
                                Unit unit = Unit.f24250a;
                                switch (i3) {
                                    case 0:
                                        String formId = (String) obj4;
                                        Intrinsics.h(formId, "formId");
                                        int i4 = InstoreWifiActivity.D;
                                        Activities.FeedbackForm.Extras extras = new Activities.FeedbackForm.Extras(formId, null, null, null, null, null, null, null);
                                        ActivityResultLauncher activityResultLauncher = instoreWifiActivity2.C;
                                        Intent intentA = ActivityNavigatorKt.a(Activities.FeedbackForm.f4474a, ApplicationType.e);
                                        intentA.putExtra("FEEDBACK_FORM_EXTRA", extras);
                                        activityResultLauncher.a(intentA, null);
                                        break;
                                    case 1:
                                        String url = (String) obj4;
                                        Intrinsics.h(url, "url");
                                        ContextExtKt.j(instoreWifiActivity, url, null, null, null, 62);
                                        break;
                                    default:
                                        Boolean bool = (Boolean) obj4;
                                        boolean zBooleanValue = bool.booleanValue();
                                        instoreWifiActivity2.A = bool;
                                        ShopInstoreWifiAnalyticsInteractor shopInstoreWifiAnalyticsInteractor = instoreWifiActivity2.N4().g;
                                        shopInstoreWifiAnalyticsInteractor.f6517a.a(InstoreWifiViewModel.q6(zBooleanValue));
                                        break;
                                }
                                return unit;
                            }
                        };
                        composer.A(objG3);
                    }
                    Function1 function1 = (Function1) objG3;
                    composer.l();
                    composer.o(5004770);
                    boolean zI4 = composer.I(instoreWifiActivity);
                    Object objG4 = composer.G();
                    if (zI4 || objG4 == composer$Companion$Empty$1) {
                        InstoreWifiActivity$onCreate$content$1$4$1 instoreWifiActivity$onCreate$content$1$4$1 = new InstoreWifiActivity$onCreate$content$1$4$1(1, instoreWifiActivity, InstoreWifiActivity.class, "onErrorDialogDismissed", "onErrorDialogDismissed(Lau/com/woolworths/feature/shared/instore/wifi/ui/InstoreWifiContract$ErrorType;)V", 0);
                        composer.A(instoreWifiActivity$onCreate$content$1$4$1);
                        objG4 = instoreWifiActivity$onCreate$content$1$4$1;
                    }
                    composer.l();
                    Function1 function12 = (Function1) ((KFunction) objG4);
                    composer.o(5004770);
                    boolean zI5 = composer.I(instoreWifiActivity);
                    Object objG5 = composer.G();
                    if (zI5 || objG5 == composer$Companion$Empty$1) {
                        InstoreWifiActivity$onCreate$content$1$5$1 instoreWifiActivity$onCreate$content$1$5$1 = new InstoreWifiActivity$onCreate$content$1$5$1(1, instoreWifiActivity, InstoreWifiActivity.class, "onLoginDialogDismissed", "onLoginDialogDismissed(Z)V", 0);
                        composer.A(instoreWifiActivity$onCreate$content$1$5$1);
                        objG5 = instoreWifiActivity$onCreate$content$1$5$1;
                    }
                    composer.l();
                    Function1 function13 = (Function1) ((KFunction) objG5);
                    composer.o(5004770);
                    boolean zI6 = composer.I(instoreWifiActivity);
                    Object objG6 = composer.G();
                    if (zI6 || objG6 == composer$Companion$Empty$1) {
                        final int i3 = 1;
                        objG6 = new Function1() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.g
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i32 = i3;
                                InstoreWifiActivity instoreWifiActivity2 = instoreWifiActivity;
                                Unit unit = Unit.f24250a;
                                switch (i32) {
                                    case 0:
                                        String formId = (String) obj4;
                                        Intrinsics.h(formId, "formId");
                                        int i4 = InstoreWifiActivity.D;
                                        Activities.FeedbackForm.Extras extras = new Activities.FeedbackForm.Extras(formId, null, null, null, null, null, null, null);
                                        ActivityResultLauncher activityResultLauncher = instoreWifiActivity2.C;
                                        Intent intentA = ActivityNavigatorKt.a(Activities.FeedbackForm.f4474a, ApplicationType.e);
                                        intentA.putExtra("FEEDBACK_FORM_EXTRA", extras);
                                        activityResultLauncher.a(intentA, null);
                                        break;
                                    case 1:
                                        String url = (String) obj4;
                                        Intrinsics.h(url, "url");
                                        ContextExtKt.j(instoreWifiActivity, url, null, null, null, 62);
                                        break;
                                    default:
                                        Boolean bool = (Boolean) obj4;
                                        boolean zBooleanValue = bool.booleanValue();
                                        instoreWifiActivity2.A = bool;
                                        ShopInstoreWifiAnalyticsInteractor shopInstoreWifiAnalyticsInteractor = instoreWifiActivity2.N4().g;
                                        shopInstoreWifiAnalyticsInteractor.f6517a.a(InstoreWifiViewModel.q6(zBooleanValue));
                                        break;
                                }
                                return unit;
                            }
                        };
                        composer.A(objG6);
                    }
                    Function1 function14 = (Function1) objG6;
                    composer.l();
                    int i4 = InstoreWifiActivity.D;
                    InstoreWifiViewModel instoreWifiViewModelN4 = instoreWifiActivity.N4();
                    AppConfig appConfig = instoreWifiActivity.w;
                    if (appConfig == null) {
                        Intrinsics.p("appConfig");
                        throw null;
                    }
                    String l = appConfig.getL();
                    Boolean bool = instoreWifiActivity.A;
                    composer.o(5004770);
                    boolean zI7 = composer.I(instoreWifiActivity);
                    Object objG7 = composer.G();
                    if (zI7 || objG7 == composer$Companion$Empty$1) {
                        objG7 = new Function1() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.g
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i32 = i;
                                InstoreWifiActivity instoreWifiActivity2 = instoreWifiActivity;
                                Unit unit = Unit.f24250a;
                                switch (i32) {
                                    case 0:
                                        String formId = (String) obj4;
                                        Intrinsics.h(formId, "formId");
                                        int i42 = InstoreWifiActivity.D;
                                        Activities.FeedbackForm.Extras extras = new Activities.FeedbackForm.Extras(formId, null, null, null, null, null, null, null);
                                        ActivityResultLauncher activityResultLauncher = instoreWifiActivity2.C;
                                        Intent intentA = ActivityNavigatorKt.a(Activities.FeedbackForm.f4474a, ApplicationType.e);
                                        intentA.putExtra("FEEDBACK_FORM_EXTRA", extras);
                                        activityResultLauncher.a(intentA, null);
                                        break;
                                    case 1:
                                        String url = (String) obj4;
                                        Intrinsics.h(url, "url");
                                        ContextExtKt.j(instoreWifiActivity, url, null, null, null, 62);
                                        break;
                                    default:
                                        Boolean bool2 = (Boolean) obj4;
                                        boolean zBooleanValue = bool2.booleanValue();
                                        instoreWifiActivity2.A = bool2;
                                        ShopInstoreWifiAnalyticsInteractor shopInstoreWifiAnalyticsInteractor = instoreWifiActivity2.N4().g;
                                        shopInstoreWifiAnalyticsInteractor.f6517a.a(InstoreWifiViewModel.q6(zBooleanValue));
                                        break;
                                }
                                return unit;
                            }
                        };
                        composer.A(objG7);
                    }
                    composer.l();
                    InstoreWifiScreenKt.g(function0, function02, function1, function12, function13, function14, instoreWifiViewModelN4, l, bool, (Function1) objG7, it, null, composer, 0, iIntValue & 14);
                }
                return Unit.f24250a;
            }
        }, true, -911092141);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiActivity.onCreate.2

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiActivity$onCreate$2$WhenMappings */
            public /* synthetic */ class WhenMappings {
                static {
                    int[] iArr = new int[AppIdentifier.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        AppIdentifier appIdentifier = AppIdentifier.d;
                        iArr[1] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final InstoreWifiActivity instoreWifiActivity = this;
                    AppIdentifier appIdentifier = instoreWifiActivity.y;
                    if (appIdentifier == null) {
                        Intrinsics.p("appIdentifier");
                        throw null;
                    }
                    int iOrdinal = appIdentifier.ordinal();
                    final ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                    if (iOrdinal == 0) {
                        composer.o(-535017903);
                        ThemeKt.b(6, composer, ComposableLambdaKt.c(2096833949, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiActivity.onCreate.2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    AppConfig appConfig = instoreWifiActivity.w;
                                    if (appConfig == null) {
                                        Intrinsics.p("appConfig");
                                        throw null;
                                    }
                                    composableLambdaImpl2.invoke(new ShopAppSpecificContent(appConfig.getL()), composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                        composer.l();
                    } else {
                        if (iOrdinal != 1) {
                            throw au.com.woolworths.android.onesite.a.x(composer, -535019648);
                        }
                        composer.o(-535013865);
                        ThemeKt.a(48, composer, ComposableLambdaKt.c(1855482897, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiActivity.onCreate.2.2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    AppConfig appConfig = instoreWifiActivity.w;
                                    if (appConfig == null) {
                                        Intrinsics.p("appConfig");
                                        throw null;
                                    }
                                    composableLambdaImpl2.invoke(new RewardsAppSpecificContent(appConfig.getL()), composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                        composer.l();
                    }
                }
                return Unit.f24250a;
            }
        }, true, -1068711971));
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        InstoreWifiViewModel instoreWifiViewModelN4 = N4();
        Boolean bool = this.A;
        BuildersKt.c(ViewModelKt.a(instoreWifiViewModelN4), null, null, new InstoreWifiViewModel$updateProfileState$1(instoreWifiViewModelN4, bool != null ? bool.booleanValue() : false, null), 3);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.h(outState, "outState");
        super.onSaveInstanceState(outState);
        Boolean bool = this.A;
        if (bool != null) {
            outState.putBoolean("forceConnectedMode", bool.booleanValue());
        }
    }
}
