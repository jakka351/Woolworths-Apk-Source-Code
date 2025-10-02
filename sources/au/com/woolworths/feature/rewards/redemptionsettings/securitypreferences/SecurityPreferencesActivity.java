package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences;

import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesContract;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.data.RewardsSecurePreference;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.SecurePreferenceScreenKt;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$ViewState;", "viewState", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SecurityPreferencesActivity extends Hilt_SecurityPreferencesActivity {
    public static final /* synthetic */ int y = 0;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(SecurityPreferencesViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    public final void O4(String str, ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        final ComposableLambdaImpl composableLambdaImpl2;
        final String str2 = str;
        ComposerImpl composerImplV = composer.v(-129241220);
        int i2 = i | (composerImplV.n(str2) ? 4 : 2) | (composerImplV.I(this) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composableLambdaImpl2 = composableLambdaImpl;
        } else {
            long jA = WxTheme.a(composerImplV).a();
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = WindowInsetsPaddingKt.d(BackgroundKt.b(companion, jA, rectangleShapeKt$RectangleShape$1), WindowInsets_androidKt.c(composerImplV));
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierD);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD2, function24);
            Modifier modifierG = SizeKt.g(SizeKt.e(companion, 1.0f), 56);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierG);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            float f = 4;
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            SpacerKt.d(rowScopeInstance, f, composerImplV, 54);
            ImageVector imageVectorA = ArrowBackKt.a();
            String strC = StringResources_androidKt.c(composerImplV, R.string.back_button_description);
            long jF = WxTheme.a(composerImplV).f();
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(this);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new f(this, 6);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            IconButtonKt.c(imageVectorA, strC, (Function0) objG, null, false, jF, composerImplV, 0, 24);
            SpacerKt.d(rowScopeInstance, f, composerImplV, 54);
            str2 = str;
            TextKt.b(str2, rowScopeInstance.a(companion, 1.0f, true), 0L, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, WxTheme.b(composerImplV).i, composerImplV, i2 & 14, 432, 59388);
            composerImplV = composerImplV;
            composerImplV.V(true);
            composableLambdaImpl2 = composableLambdaImpl;
            composableLambdaImpl2.invoke(composerImplV, 6);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(str2, composableLambdaImpl2, i) { // from class: au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.a
                public final /* synthetic */ String e;
                public final /* synthetic */ ComposableLambdaImpl f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int i5 = SecurityPreferencesActivity.y;
                    int iA = RecomposeScopeImplKt.a(49);
                    this.d.O4(this.e, this.f, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    @Override // au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.Hilt_SecurityPreferencesActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesActivity$setupUI$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                RewardsSecurePreference rewardsSecurePreference;
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final SecurityPreferencesActivity securityPreferencesActivity = this.d;
                    final MutableState mutableStateA = FlowExtKt.a(((SecurityPreferencesViewModel) securityPreferencesActivity.x.getD()).h, composer);
                    SecurityPreferencesContract.ViewAction viewAction = ((SecurityPreferencesContract.ViewState) mutableStateA.getD()).b;
                    if (viewAction != null) {
                        ((SecurityPreferencesContract.ViewState) mutableStateA.getD()).c.invoke(viewAction);
                        if (!(viewAction instanceof SecurityPreferencesContract.ViewAction.DoNothing)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    SecurityPreferencesContract.Content content = ((SecurityPreferencesContract.ViewState) mutableStateA.getD()).f6459a;
                    final String strC = null;
                    SecurityPreferencesContract.Content.Preference preference = content instanceof SecurityPreferencesContract.Content.Preference ? (SecurityPreferencesContract.Content.Preference) content : null;
                    if (preference != null && (rewardsSecurePreference = preference.f6454a) != null) {
                        strC = rewardsSecurePreference.f6465a;
                    }
                    composer.o(2000664715);
                    if (strC == null) {
                        strC = StringResources_androidKt.c(composer, R.string.rewards_redemption_security_preferences_title);
                    }
                    composer.l();
                    ThemeKt.a(48, composer, ComposableLambdaKt.c(1374668806, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesActivity$setupUI$1.2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                final MutableState mutableState = mutableStateA;
                                ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-955966769, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesActivity.setupUI.1.2.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj5, Object obj6) {
                                        Composer composer3 = (Composer) obj5;
                                        if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                            composer3.j();
                                        } else {
                                            SecurePreferenceScreenKt.b((SecurityPreferencesContract.ViewState) mutableState.getD(), SizeKt.c, composer3, 48);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer2);
                                int i = SecurityPreferencesActivity.y;
                                securityPreferencesActivity.O4(strC, composableLambdaImplC, composer2, 48);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -891771911));
    }
}
