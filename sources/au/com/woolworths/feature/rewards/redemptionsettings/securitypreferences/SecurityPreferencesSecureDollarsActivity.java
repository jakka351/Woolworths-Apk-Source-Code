package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.core.content.IntentCompat;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.compose.utils.effect.ActionEffectKt;
import au.com.woolworths.compose.utils.effect.ChangedEffectKt;
import au.com.woolworths.design.wx.component.bottomsheet.ModalBottomSheetLayoutKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecureDollarsContract;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.SecureDollarsScreenKt;
import au.com.woolworths.rewards.base.extensions.ActivityExtKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesSecureDollarsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsContract$ViewState;", "viewState", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SecurityPreferencesSecureDollarsActivity extends Hilt_SecurityPreferencesSecureDollarsActivity {
    public static final /* synthetic */ int z = 0;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(SecureDollarsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesSecureDollarsActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesSecureDollarsActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesSecureDollarsActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final Lazy y = LazyKt.b(new Function0<Activities.SecurityPreferencesSecureDollarsActivity.Extras>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesSecureDollarsActivity$special$$inlined$extraOrThrow$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Parcelable parcelable = (Parcelable) IntentCompat.a(this.d.getIntent(), "SecureDollars", Activities.SecurityPreferencesSecureDollarsActivity.Extras.class);
            if (parcelable != null) {
                return parcelable;
            }
            throw new IllegalArgumentException("Value for SecureDollars must be provided and not null.");
        }
    });

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(1, 0, R.anim.fade_out_quickly);
        } else {
            overridePendingTransition(0, R.anim.fade_out_quickly);
        }
    }

    @Override // au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.Hilt_SecurityPreferencesSecureDollarsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityExtKt.a(this);
        SecureDollarsViewModel secureDollarsViewModel = (SecureDollarsViewModel) this.x.getD();
        Lazy lazy = this.y;
        String token = ((Activities.SecurityPreferencesSecureDollarsActivity.Extras) lazy.getD()).d;
        String bffAction = ((Activities.SecurityPreferencesSecureDollarsActivity.Extras) lazy.getD()).e;
        Intrinsics.h(token, "token");
        Intrinsics.h(bffAction, "bffAction");
        MutableStateFlow mutableStateFlow = secureDollarsViewModel.g;
        mutableStateFlow.setValue(SecureDollarsContract.ViewState.a((SecureDollarsContract.ViewState) mutableStateFlow.getValue(), token, bffAction, null, null, 121));
        BuildersKt.c(ViewModelKt.a(secureDollarsViewModel), null, null, new SecureDollarsViewModel$secureRewardsDollars$1(secureDollarsViewModel, null), 3);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesSecureDollarsActivity$setupUI$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    int i = SecurityPreferencesSecureDollarsActivity.z;
                    final SecurityPreferencesSecureDollarsActivity securityPreferencesSecureDollarsActivity = this.d;
                    final MutableState mutableStateA = FlowExtKt.a(((SecureDollarsViewModel) securityPreferencesSecureDollarsActivity.x.getD()).h, composer);
                    SecureDollarsContract.ViewAction viewAction = ((SecureDollarsContract.ViewState) mutableStateA.getD()).e;
                    composer.o(5004770);
                    boolean zI = composer.I(securityPreferencesSecureDollarsActivity);
                    Object objG = composer.G();
                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                    if (zI || objG == composer$Companion$Empty$1) {
                        objG = new SecurityPreferencesSecureDollarsActivity$setupUI$1$1$1(securityPreferencesSecureDollarsActivity, null);
                        composer.A(objG);
                    }
                    composer.l();
                    ActionEffectKt.a(viewAction, (Function3) objG, composer, 0);
                    final ModalBottomSheetState modalBottomSheetStateC = ModalBottomSheetKt.c(ModalBottomSheetValue.d, null, composer, 3078, 6);
                    Object objG2 = composer.G();
                    if (objG2 == composer$Companion$Empty$1) {
                        objG2 = android.support.v4.media.session.a.i(composer.y(), composer);
                    }
                    final CoroutineScope coroutineScope = (CoroutineScope) objG2;
                    composer.o(-1746271574);
                    boolean zI2 = composer.I(coroutineScope) | composer.I(modalBottomSheetStateC) | composer.I(securityPreferencesSecureDollarsActivity);
                    Object objG3 = composer.G();
                    if (zI2 || objG3 == composer$Companion$Empty$1) {
                        objG3 = new Function0() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                BuildersKt.c(coroutineScope, null, null, new SecurityPreferencesSecureDollarsActivity$setupUI$1$2$1$1(modalBottomSheetStateC, securityPreferencesSecureDollarsActivity, null), 3);
                                return Unit.f24250a;
                            }
                        };
                        composer.A(objG3);
                    }
                    composer.l();
                    BackHandlerKt.a(false, (Function0) objG3, composer, 0, 1);
                    ThemeKt.a(48, composer, ComposableLambdaKt.c(-1777853214, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesSecureDollarsActivity$setupUI$1.3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                final MutableState mutableState = mutableStateA;
                                ModalBottomSheetLayoutKt.a(ComposableLambdaKt.c(751017844, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesSecureDollarsActivity.setupUI.1.3.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                        ColumnScope ModalBottomSheetLayout = (ColumnScope) obj5;
                                        Composer composer3 = (Composer) obj6;
                                        int iIntValue = ((Number) obj7).intValue();
                                        Intrinsics.h(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                                        if ((iIntValue & 17) == 16 && composer3.c()) {
                                            composer3.j();
                                        } else {
                                            SecureDollarsScreenKt.c((SecureDollarsContract.ViewState) mutableState.getD(), SizeKt.g(Modifier.Companion.d, 360), composer3, 48);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer2), null, modalBottomSheetStateC, BitmapDescriptorFactory.HUE_RED, 0L, 0L, false, ComposableSingletons$SecurityPreferencesSecureDollarsActivityKt.f6439a, composer2, 12583430, 122);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                    composer.o(5004770);
                    boolean zI3 = composer.I(modalBottomSheetStateC);
                    Object objG4 = composer.G();
                    if (zI3 || objG4 == composer$Companion$Empty$1) {
                        objG4 = new SecurityPreferencesSecureDollarsActivity$setupUI$1$4$1(modalBottomSheetStateC, null);
                        composer.A(objG4);
                    }
                    composer.l();
                    EffectsKt.e(composer, modalBottomSheetStateC, (Function2) objG4);
                    composer.o(-1633490746);
                    boolean zI4 = composer.I(modalBottomSheetStateC) | composer.I(securityPreferencesSecureDollarsActivity);
                    Object objG5 = composer.G();
                    if (zI4 || objG5 == composer$Companion$Empty$1) {
                        objG5 = new SecurityPreferencesSecureDollarsActivity$setupUI$1$5$1(modalBottomSheetStateC, securityPreferencesSecureDollarsActivity, null);
                        composer.A(objG5);
                    }
                    composer.l();
                    ChangedEffectKt.a(modalBottomSheetStateC, (Function2) objG5, composer, 8);
                }
                return Unit.f24250a;
            }
        }, true, -29876459));
    }
}
