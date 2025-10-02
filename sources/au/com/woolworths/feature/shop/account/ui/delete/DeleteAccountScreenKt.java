package au.com.woolworths.feature.shop.account.ui.delete;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.f;
import au.com.woolworths.analytics.supers.more.accountdeletion.AccountDeletionAnalytics;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.feature.product.list.compose.filter.h;
import au.com.woolworths.feature.shop.account.model.delete.DeleteAccountTnCData;
import au.com.woolworths.feature.shop.account.ui.model.DeletionError;
import au.com.woolworths.feature.shop.account.viewmodel.delete.AccountDeletionState;
import au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountContract;
import au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountViewModel;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt;
import com.airbnb.lottie.compose.LottieAnimatable;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResultImpl;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0006²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/viewmodel/delete/DeleteAccountContract$ViewState;", "viewState", "Lcom/airbnb/lottie/LottieComposition;", "composition", "", "progress", "account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DeleteAccountScreenKt {
    public static final void a(FullPageMessage.Error error, Function0 function0, Composer composer, int i) {
        int i2;
        FullPageMessageSpec fullPageMessageSpecF;
        Function0 function02;
        ComposerImpl composerImpl;
        ComposerImpl composerImpl2;
        ComposerImpl composerImplV = composer.v(-1039628420);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(error) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function02 = function0;
            composerImpl2 = composerImplV;
        } else {
            FillElement fillElement = SizeKt.c;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, fillElement);
            ComposeUiNode.e3.getClass();
            Function0 function03 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            if (error instanceof FullPageMessage.Error.ConnectionError) {
                composerImplV.o(-991402285);
                composerImpl = composerImplV;
                fullPageMessageSpecF = FullPageMessageSpec.Companion.c(null, null, StringResources_androidKt.c(composerImplV, R.string.delete_account_network_error), null, function0, composerImpl, 23);
                composerImpl.V(false);
                function02 = function0;
            } else {
                composerImplV.o(-991394762);
                fullPageMessageSpecF = FullPageMessageSpec.Companion.f(null, null, null, StringResources_androidKt.c(composerImplV, R.string.delete_account_content_server_error), null, function0, composerImplV, 23);
                function02 = function0;
                composerImpl = composerImplV;
                composerImpl.V(false);
            }
            ComposerImpl composerImpl3 = composerImpl;
            FullPageMessageUiKt.a(fullPageMessageSpecF, null, null, composerImpl3, 0, 6);
            composerImpl2 = composerImpl3;
            composerImpl2.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.b(error, i, 17, function02);
        }
    }

    public static final void b(final Function0 onNavigateUp, Function0 onLaunchHome, Function0 onLogoutUser, final DeleteAccountViewModel deleteAccountViewModel, Composer composer, int i) {
        boolean z;
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onLaunchHome, "onLaunchHome");
        Intrinsics.h(onLogoutUser, "onLogoutUser");
        ComposerImpl composerImplV = composer.v(-891940987);
        int i2 = i | (composerImplV.I(onNavigateUp) ? 4 : 2) | (composerImplV.I(onLaunchHome) ? 32 : 16) | (composerImplV.I(onLogoutUser) ? 256 : 128) | (composerImplV.I(deleteAccountViewModel) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final MutableState mutableStateA = FlowExtKt.a(deleteAccountViewModel.k, composerImplV);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerImplV.x(LocalLifecycleOwnerKt.f2808a);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new SnackbarHostState();
                composerImplV.A(objG);
            }
            final SnackbarHostState snackbarHostState = (SnackbarHostState) objG;
            composerImplV.V(false);
            Flow flow = deleteAccountViewModel.i;
            composerImplV.o(-1746271574);
            boolean zI = ((i2 & 896) == 256) | composerImplV.I(deleteAccountViewModel) | ((i2 & 112) == 32);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new DeleteAccountScreenKt$DeleteAccountScreen$1$1(deleteAccountViewModel, onLaunchHome, onLogoutUser, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) objG2);
            composerImplV.o(-1633490746);
            boolean zI2 = composerImplV.I(deleteAccountViewModel) | composerImplV.I(lifecycleOwner);
            Object objG3 = composerImplV.G();
            if (zI2 || objG3 == composer$Companion$Empty$1) {
                objG3 = new f(24, lifecycleOwner, deleteAccountViewModel);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            EffectsKt.c(lifecycleOwner, (Function1) objG3, composerImplV);
            ScaffoldKt.a(SizeKt.c, ComposableLambdaKt.c(295199553, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountScreenKt$DeleteAccountScreen$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC = StringResources_androidKt.c(composer2, R.string.title_activity_delete_account);
                        CoreElevation coreElevation = CoreTheme.c(composer2).f4876a;
                        final Function0 function0 = onNavigateUp;
                        final State state = mutableStateA;
                        TopNavBarKt.a(strC, null, 0L, 0L, 0L, null, coreElevation, ComposableLambdaKt.c(-2136638449, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountScreenKt$DeleteAccountScreen$3.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ImageVector imageVectorA = ArrowBackKt.a();
                                    String strC2 = StringResources_androidKt.c(composer3, R.string.content_description_back_button);
                                    AccountDeletionState accountDeletionStateA = ((DeleteAccountContract.ViewState) state.getD()).a();
                                    boolean z2 = false;
                                    if (accountDeletionStateA != null && !accountDeletionStateA.b) {
                                        z2 = true;
                                    }
                                    IconButtonKt.c(imageVectorA, strC2, function0, null, z2, null, 0L, composer3, 0, 104);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 100663296, 638);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, ComposableLambdaKt.c(-1670787201, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountScreenKt$DeleteAccountScreen$4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        SnackbarHostKt.b(snackbarHostState, null, composer2, 6, 2);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), 0L, null, ComposableLambdaKt.c(-1077912168, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountScreenKt$DeleteAccountScreen$5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer2;
                    PaddingValues paddingValues = (PaddingValues) obj;
                    Composer composer3 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(paddingValues, "paddingValues");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer3.n(paddingValues) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer3.c()) {
                        composer3.j();
                    } else {
                        Modifier modifierE = PaddingKt.e(SizeKt.c, paddingValues);
                        boolean z2 = false;
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                        int p = composer3.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                        Modifier modifierD = ComposedModifierKt.d(composer3, modifierE);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer3.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer3.i();
                        if (composer3.getO()) {
                            composer3.K(function0);
                        } else {
                            composer3.e();
                        }
                        Updater.b(composer3, measurePolicyD, ComposeUiNode.Companion.g);
                        Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer3, p, function2);
                        }
                        Updater.b(composer3, modifierD, ComposeUiNode.Companion.d);
                        State state = mutableStateA;
                        DeleteAccountContract.ViewState viewState = (DeleteAccountContract.ViewState) state.getD();
                        if (Intrinsics.c(viewState, DeleteAccountContract.ViewState.Loading.f6593a)) {
                            composer3.o(-17398463);
                            composer2 = composer3;
                            ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 31, 0L, 0L, composer2, null);
                            composer2.l();
                        } else {
                            composer2 = composer3;
                            boolean z3 = viewState instanceof DeleteAccountContract.ViewState.Content;
                            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                            final DeleteAccountViewModel deleteAccountViewModel2 = deleteAccountViewModel;
                            if (z3) {
                                composer2.o(-17239650);
                                DeleteAccountContract.ViewState viewState2 = (DeleteAccountContract.ViewState) state.getD();
                                Intrinsics.f(viewState2, "null cannot be cast to non-null type au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountContract.ViewState.Content");
                                DeleteAccountTnCData deleteAccountTnCData = ((DeleteAccountContract.ViewState.Content) viewState2).f6591a;
                                AccountDeletionState accountDeletionStateA = ((DeleteAccountContract.ViewState) state.getD()).a();
                                if (accountDeletionStateA != null && accountDeletionStateA.b) {
                                    z2 = true;
                                }
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(deleteAccountViewModel2);
                                Object objG4 = composer2.G();
                                if (zI3 || objG4 == composer$Companion$Empty$12) {
                                    objG4 = new a(deleteAccountViewModel2, 0);
                                    composer2.A(objG4);
                                }
                                Function1 function1 = (Function1) objG4;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(deleteAccountViewModel2);
                                Object objG5 = composer2.G();
                                if (zI4 || objG5 == composer$Companion$Empty$12) {
                                    final int i3 = 0;
                                    objG5 = new Function0() { // from class: au.com.woolworths.feature.shop.account.ui.delete.b
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i3) {
                                                case 0:
                                                    AccountDeletionAnalytics.CloseAccount.Action action = AccountDeletionAnalytics.CloseAccount.Action.h;
                                                    Intrinsics.h(action, "action");
                                                    DeleteAccountViewModel deleteAccountViewModel3 = deleteAccountViewModel2;
                                                    deleteAccountViewModel3.e.g(action);
                                                    deleteAccountViewModel3.q6();
                                                    break;
                                                default:
                                                    deleteAccountViewModel2.r6();
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG5);
                                }
                                composer2.l();
                                DeleteAccountTnCContentKt.a(deleteAccountTnCData, function1, (Function0) objG5, z2, composer2, 0, 0);
                                composer2.l();
                            } else {
                                if (!(viewState instanceof DeleteAccountContract.ViewState.Error)) {
                                    throw au.com.woolworths.android.onesite.a.x(composer2, 1939100406);
                                }
                                composer2.o(-16210481);
                                DeleteAccountContract.ViewState viewState3 = (DeleteAccountContract.ViewState) state.getD();
                                Intrinsics.f(viewState3, "null cannot be cast to non-null type au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountContract.ViewState.Error");
                                FullPageMessage.Error error = ((DeleteAccountContract.ViewState.Error) viewState3).f6592a;
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(deleteAccountViewModel2);
                                Object objG6 = composer2.G();
                                if (zI5 || objG6 == composer$Companion$Empty$12) {
                                    final int i4 = 1;
                                    objG6 = new Function0() { // from class: au.com.woolworths.feature.shop.account.ui.delete.b
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i4) {
                                                case 0:
                                                    AccountDeletionAnalytics.CloseAccount.Action action = AccountDeletionAnalytics.CloseAccount.Action.h;
                                                    Intrinsics.h(action, "action");
                                                    DeleteAccountViewModel deleteAccountViewModel3 = deleteAccountViewModel2;
                                                    deleteAccountViewModel3.e.g(action);
                                                    deleteAccountViewModel3.q6();
                                                    break;
                                                default:
                                                    deleteAccountViewModel2.r6();
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG6);
                                }
                                composer2.l();
                                DeleteAccountScreenKt.a(error, (Function0) objG6, composer2, 0);
                                composer2.l();
                            }
                        }
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12586038, 116);
            composerImplV.o(1838287841);
            AccountDeletionState accountDeletionStateA = ((DeleteAccountContract.ViewState) mutableStateA.getD()).a();
            if (accountDeletionStateA == null || !accountDeletionStateA.b) {
                z = false;
            } else {
                z = false;
                c(composerImplV, 0);
            }
            composerImplV.V(z);
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            AccountDeletionState accountDeletionStateA2 = ((DeleteAccountContract.ViewState) mutableStateA.getD()).a();
            DeletionError deletionError = accountDeletionStateA2 != null ? accountDeletionStateA2.c : null;
            composerImplV.o(-1224400529);
            boolean zN = composerImplV.n(mutableStateA) | composerImplV.I(context) | composerImplV.I(deleteAccountViewModel);
            Object objG4 = composerImplV.G();
            if (zN || objG4 == composer$Companion$Empty$1) {
                DeleteAccountScreenKt$DeleteAccountScreen$6$1 deleteAccountScreenKt$DeleteAccountScreen$6$1 = new DeleteAccountScreenKt$DeleteAccountScreen$6$1(context, snackbarHostState, deleteAccountViewModel, mutableStateA, null);
                composerImplV.A(deleteAccountScreenKt$DeleteAccountScreen$6$1);
                objG4 = deleteAccountScreenKt$DeleteAccountScreen$6$1;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, deletionError, (Function2) objG4);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a(onNavigateUp, onLaunchHome, onLogoutUser, deleteAccountViewModel, i);
        }
    }

    public static final void c(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-531341147);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            LottieCompositionResultImpl lottieCompositionResultImplC = RememberLottieCompositionKt.c(new LottieCompositionSpec.Asset("wwspinner.json"), composerImplV, 6);
            LottieAnimatable lottieAnimatableA = AnimateLottieCompositionAsStateKt.a(lottieCompositionResultImplC.getD(), null, Integer.MAX_VALUE, composerImplV, 958);
            Modifier modifierB = BackgroundKt.b(SizeKt.c, Color.b(CoreTheme.b(composerImplV).e.d.b, 0.4f), RectangleShapeKt.f1779a);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier modifierG = BoxScopeInstance.f944a.g(SizeKt.q(Modifier.Companion.d, 100), Alignment.Companion.e);
            LottieComposition lottieCompositionB = lottieCompositionResultImplC.getD();
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(lottieAnimatableA);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = new h(lottieAnimatableA, 5);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            LottieAnimationKt.b(lottieCompositionB, (Function0) objG, modifierG, false, false, false, null, false, null, null, null, false, false, null, null, false, composerImplV, 0, 0, 65528);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.instore.wifi.ui.b(i, 8);
        }
    }
}
