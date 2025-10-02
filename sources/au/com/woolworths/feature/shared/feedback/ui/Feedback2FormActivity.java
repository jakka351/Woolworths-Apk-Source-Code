package au.com.woolworths.feature.shared.feedback.ui;

import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.design.wx.foundation.ThemeContext;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor;
import au.com.woolworths.feature.shared.feedback.ui.Feedback2FormContract;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/ui/Feedback2FormActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class Feedback2FormActivity extends Hilt_Feedback2FormActivity {
    public static final /* synthetic */ int y = 0;
    public AppConfig w;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(Feedback2FormViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shared.feedback.ui.Feedback2FormActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shared.feedback.ui.Feedback2FormActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shared.feedback.ui.Feedback2FormActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    public final Feedback2FormViewModel N4() {
        return (Feedback2FormViewModel) this.x.getD();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    @Override // au.com.woolworths.feature.shared.feedback.ui.Hilt_Feedback2FormActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final Activities.Feedback2Form.ExtrasEncoded extrasEncoded = (Activities.Feedback2Form.ExtrasEncoded) getIntent().getParcelableExtra("FEEDBACK2_FORM_EXTRA_ENCODED");
        final Activities.Feedback2Form.ExtrasPlain extrasPlain = (Activities.Feedback2Form.ExtrasPlain) getIntent().getParcelableExtra("FEEDBACK2_FORM_EXTRA_PLAIN");
        if (N4().e.c == MedalliaInteractor.InitState.d) {
            throw new IllegalArgumentException("Initialize Medallia to enable Feedback");
        }
        if (extrasEncoded != null) {
            Feedback2FormViewModel feedback2FormViewModelN4 = N4();
            String paramString = extrasEncoded.d;
            Intrinsics.h(paramString, "paramString");
            BuildersKt.c(ViewModelKt.a(feedback2FormViewModelN4), null, null, new Feedback2FormViewModel$launchShowFeedbackForm$1(feedback2FormViewModelN4, paramString, null), 3);
        } else {
            if (extrasPlain == null) {
                throw new IllegalArgumentException("Extras must be present!");
            }
            N4().s6(extrasPlain.d, extrasPlain.e);
        }
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.feedback.ui.Feedback2FormActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    int i = Feedback2FormActivity.y;
                    final Feedback2FormActivity feedback2FormActivity = this;
                    ThemeContext themeContext = feedback2FormActivity.N4().i;
                    final Activities.Feedback2Form.ExtrasEncoded extrasEncoded2 = extrasEncoded;
                    final Activities.Feedback2Form.ExtrasPlain extrasPlain2 = extrasPlain;
                    ThemeKt.c(themeContext, ComposableLambdaKt.c(643053915, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.feedback.ui.Feedback2FormActivity.onCreate.1.1

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: au.com.woolworths.feature.shared.feedback.ui.Feedback2FormActivity$onCreate$1$1$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            static {
                                int[] iArr = new int[Feedback2FormContract.Status.values().length];
                                try {
                                    iArr[0] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    Feedback2FormContract.Status status = Feedback2FormContract.Status.d;
                                    iArr[1] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                int i2 = Feedback2FormActivity.y;
                                final Feedback2FormActivity feedback2FormActivity2 = feedback2FormActivity;
                                Feedback2FormContract.ViewState viewState = (Feedback2FormContract.ViewState) FlowExtKt.a(feedback2FormActivity2.N4().h, composer2).getD();
                                Feedback2FormContract.Actions actions = viewState.b;
                                composer2.o(-1633490746);
                                boolean zN = composer2.n(viewState) | composer2.I(feedback2FormActivity2);
                                Object objG = composer2.G();
                                Object obj5 = Composer.Companion.f1624a;
                                if (zN || objG == obj5) {
                                    objG = new Feedback2FormActivity$onCreate$1$1$1$1(viewState, feedback2FormActivity2, null);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                EffectsKt.e(composer2, actions, (Function2) objG);
                                Modifier modifierA = TestTagKt.a(SizeKt.c, "feedback_form");
                                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                                int p = composer2.getP();
                                PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                                Modifier modifierD = ComposedModifierKt.d(composer2, modifierA);
                                ComposeUiNode.e3.getClass();
                                Function0 function0 = ComposeUiNode.Companion.b;
                                if (composer2.w() == null) {
                                    ComposablesKt.b();
                                    throw null;
                                }
                                composer2.i();
                                if (composer2.getO()) {
                                    composer2.K(function0);
                                } else {
                                    composer2.e();
                                }
                                Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                                Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                Function2 function2 = ComposeUiNode.Companion.j;
                                if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                    b.z(p, composer2, p, function2);
                                }
                                Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                                int iOrdinal = viewState.f6490a.ordinal();
                                if (iOrdinal == 0) {
                                    composer2.o(95762955);
                                    ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 28, WxTheme.a(composer2).h(), 0L, composer2, BoxScopeInstance.f944a.g(Modifier.Companion.d, Alignment.Companion.e));
                                    composer2 = composer2;
                                    composer2.l();
                                } else if (iOrdinal != 1) {
                                    composer2.o(-551062471);
                                    composer2.l();
                                } else {
                                    composer2.o(96100142);
                                    composer2.o(-1746271574);
                                    final Activities.Feedback2Form.ExtrasEncoded extrasEncoded3 = extrasEncoded2;
                                    boolean zI = composer2.I(extrasEncoded3) | composer2.I(feedback2FormActivity2);
                                    final Activities.Feedback2Form.ExtrasPlain extrasPlain3 = extrasPlain2;
                                    boolean zI2 = zI | composer2.I(extrasPlain3);
                                    Object objG2 = composer2.G();
                                    if (zI2 || objG2 == obj5) {
                                        objG2 = new Function0() { // from class: au.com.woolworths.feature.shared.feedback.ui.a
                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Activities.Feedback2Form.ExtrasEncoded extrasEncoded4 = extrasEncoded3;
                                                Feedback2FormActivity feedback2FormActivity3 = feedback2FormActivity2;
                                                if (extrasEncoded4 != null) {
                                                    int i3 = Feedback2FormActivity.y;
                                                    Feedback2FormViewModel feedback2FormViewModelN42 = feedback2FormActivity3.N4();
                                                    String paramString2 = extrasEncoded4.d;
                                                    Intrinsics.h(paramString2, "paramString");
                                                    BuildersKt.c(ViewModelKt.a(feedback2FormViewModelN42), null, null, new Feedback2FormViewModel$launchShowFeedbackForm$1(feedback2FormViewModelN42, paramString2, null), 3);
                                                } else {
                                                    Activities.Feedback2Form.ExtrasPlain extrasPlain4 = extrasPlain3;
                                                    if (extrasPlain4 != null) {
                                                        int i4 = Feedback2FormActivity.y;
                                                        feedback2FormActivity3.N4().s6(extrasPlain4.d, extrasPlain4.e);
                                                    }
                                                }
                                                return Unit.f24250a;
                                            }
                                        };
                                        composer2.A(objG2);
                                    }
                                    Function0 function02 = (Function0) objG2;
                                    composer2.l();
                                    composer2.o(5004770);
                                    boolean zI3 = composer2.I(feedback2FormActivity2);
                                    Object objG3 = composer2.G();
                                    if (zI3 || objG3 == obj5) {
                                        objG3 = new f(feedback2FormActivity2, 8);
                                        composer2.A(objG3);
                                    }
                                    composer2.l();
                                    ErrorPageKt.a(function02, (Function0) objG3, feedback2FormActivity2.N4().j, null, composer2, 0);
                                    composer2.l();
                                }
                                composer2.f();
                            }
                            return Unit.f24250a;
                        }
                    }, composer), composer, 48);
                }
                return Unit.f24250a;
            }
        }, true, -1239883905));
    }
}
