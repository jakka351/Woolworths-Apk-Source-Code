package au.com.woolworths.shop.specials.ui;

import android.content.Context;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageUiKt;
import au.com.woolworths.shop.aem.components.model.chatentrycard.ChatEntryCard;
import au.com.woolworths.shop.aem.components.ui.chatentrycard.ChatEntryCardUiKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import au.com.woolworths.shop.specials.ConnectionErrorState;
import au.com.woolworths.shop.specials.ServerErrorState;
import au.com.woolworths.shop.specials.SpecialsHomeContract;
import au.com.woolworths.shop.specials.SpecialsHomePageErrorState;
import au.com.woolworths.shop.specials.SpecialsHomeViewModel;
import au.com.woolworths.shop.specials.model.SpecialsHome;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"specials_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SpecialsHomeScreenKt {
    public static final void a(ChatEntryCard chatEntryCard, Function0 function0, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-2138554714);
        if ((((composerImplV.I(chatEntryCard) ? 4 : 2) | i | (composerImplV.I(function0) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = AnimatableKt.a(0.3f);
                composerImplV.A(objG);
            }
            Animatable animatable = (Animatable) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == composer$Companion$Empty$1) {
                objD = AnimatableKt.a(BitmapDescriptorFactory.HUE_RED);
                composerImplV.A(objD);
            }
            Animatable animatable2 = (Animatable) objD;
            Object objD2 = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD2 == composer$Companion$Empty$1) {
                objD2 = SnapshotStateKt.f(Boolean.TRUE);
                composerImplV.A(objD2);
            }
            composerImplV.V(false);
            float f = 16;
            Modifier modifierA = AspectRatioKt.a(SizeKt.e(PaddingKt.h(Modifier.Companion.d, f, BitmapDescriptorFactory.HUE_RED, 2), 1.0f), 2.61f);
            WaveBackgroundModifierKt.b((MutableState) objD2, animatable, animatable2, f, modifierA, ChatEntryCardUiKt.c(chatEntryCard, function0, modifierA, composerImplV), composerImplV, 28224);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.productcard.ui.components.b(chatEntryCard, i, 7, function0);
        }
    }

    public static final void b(SpecialsHomePageErrorState specialsHomePageErrorState, Function0 function0, Composer composer, int i) {
        Function0 function02;
        ComposerImpl composerImpl;
        FullPageMessageSpec fullPageMessageSpecF;
        FullPageMessageSpec fullPageMessageSpecB;
        ComposerImpl composerImplV = composer.v(1863097162);
        if ((((composerImplV.n(specialsHomePageErrorState) ? 4 : 2) | i | (composerImplV.I(function0) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function02 = function0;
        } else {
            if (specialsHomePageErrorState instanceof ConnectionErrorState) {
                composerImplV.o(-564982279);
                fullPageMessageSpecB = FullPageMessageSpec.Companion.b(null, StringResources_androidKt.c(composerImplV, R.string.specials_connection_error), function0, composerImplV, 7);
                composerImplV.V(false);
                function02 = function0;
                composerImpl = composerImplV;
            } else {
                if (!(specialsHomePageErrorState instanceof ServerErrorState)) {
                    throw au.com.woolworths.android.onesite.a.w(-564983886, composerImplV, false);
                }
                composerImplV.o(-334351939);
                ServerErrorState serverErrorState = (ServerErrorState) specialsHomePageErrorState;
                if (Intrinsics.c(serverErrorState.e, Boolean.TRUE)) {
                    composerImplV.o(-334313840);
                    composerImpl = composerImplV;
                    fullPageMessageSpecF = FullPageMessageSpec.Companion.e(null, null, serverErrorState.getE().getText((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b)).toString(), null, function0, composerImpl, 23);
                    function02 = function0;
                    composerImpl.V(false);
                } else {
                    function02 = function0;
                    composerImpl = composerImplV;
                    composerImpl.o(-334040048);
                    Painter painterA = PainterResources_androidKt.a(R.drawable.ic_shop_server_error, 0, composerImpl);
                    Text d = serverErrorState.getD();
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = AndroidCompositionLocals_androidKt.b;
                    fullPageMessageSpecF = FullPageMessageSpec.Companion.f(painterA, d.getText((Context) composerImpl.x(staticProvidableCompositionLocal)).toString(), serverErrorState.getE().getText((Context) composerImpl.x(staticProvidableCompositionLocal)).toString());
                    composerImpl.V(false);
                }
                fullPageMessageSpecB = fullPageMessageSpecF;
                composerImpl.V(false);
            }
            composerImplV = composerImpl;
            FullPageMessageUiKt.a(fullPageMessageSpecB, null, null, composerImplV, 0, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.productcard.ui.components.b(specialsHomePageErrorState, i, 6, function02);
        }
    }

    public static final void c(ArrayList arrayList, List list, SpecialsHomeContract.Snackbar snackbar, SpecialsHomeViewModel specialsHomeViewModel, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-1282363526);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(list) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(snackbar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(specialsHomeViewModel) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.shop.ratingsandreviews.ui.shared.a(5);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(Modifier.Companion.d, false, (Function1) objG);
            float f = 16;
            PaddingValuesImpl paddingValuesImplA = PaddingKt.a(BitmapDescriptorFactory.HUE_RED, f, 1);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(f);
            composerImplV.o(-1746271574);
            boolean zI = composerImplV.I(arrayList) | composerImplV.I(specialsHomeViewModel) | composerImplV.I(list);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new d(arrayList, specialsHomeViewModel, list);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            LazyDslKt.b(modifierB, lazyListStateA, paddingValuesImplA, false, spacedAlignedG, null, null, false, null, (Function1) objG2, composerImplV, 24960, 488);
            composerImplV = composerImplV;
            e(snackbar, composerImplV, (i2 >> 6) & 14);
            composerImplV.o(5004770);
            boolean zI2 = composerImplV.I(specialsHomeViewModel);
            Object objG3 = composerImplV.G();
            if (zI2 || objG3 == composer$Companion$Empty$1) {
                objG3 = new i(specialsHomeViewModel, 8);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            ListItemsSeenEffectKt.a(ListItemsSeenEffectKt.e(lazyListStateA, BitmapDescriptorFactory.HUE_RED, (Function1) objG3, composerImplV, 0, 2), composerImplV, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.instore.presence.presentation.b(arrayList, list, snackbar, specialsHomeViewModel, i, 22);
        }
    }

    public static final void d(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-150317898);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
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
            ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 30, 0L, 0L, composerImplV, BoxScopeInstance.f944a.g(companion, Alignment.Companion.e));
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b(i, 8);
        }
    }

    public static final void e(final SpecialsHomeContract.Snackbar snackbar, Composer composer, final int i) {
        int i2;
        final SpecialsHomeContract.Snackbar snackbar2;
        String string;
        ComposerImpl composerImplV = composer.v(373979862);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(snackbar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            snackbar2 = snackbar;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = new SnackbarHostState();
                composerImplV.A(objG);
            }
            SnackbarHostState snackbarHostState = (SnackbarHostState) objG;
            composerImplV.V(false);
            Modifier modifierA = WindowInsetsPadding_androidKt.a(SizeKt.c);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            SnackbarHostKt.b(snackbarHostState, BoxScopeInstance.f944a.g(Modifier.Companion.d, Alignment.Companion.h), ComposableSingletons$SpecialsHomeScreenKt.f12943a, composerImplV, 390, 0);
            composerImplV.V(true);
            if (snackbar == null) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    final int i4 = 0;
                    recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.shop.specials.ui.e
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            int i5 = i4;
                            Composer composer2 = (Composer) obj2;
                            ((Integer) obj3).intValue();
                            switch (i5) {
                                case 0:
                                    SpecialsHomeScreenKt.e(snackbar, composer2, RecomposeScopeImplKt.a(i | 1));
                                    break;
                                default:
                                    SpecialsHomeScreenKt.e(snackbar, composer2, RecomposeScopeImplKt.a(i | 1));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            ResText resText = snackbar.f12936a;
            CompositionLocal compositionLocal = AndroidCompositionLocals_androidKt.b;
            String string2 = resText.getText((Context) composerImplV.x(compositionLocal)).toString();
            Text text = snackbar.b;
            composerImplV.o(-1382584717);
            String upperCase = null;
            CharSequence text2 = text == null ? null : text.getText((Context) composerImplV.x(compositionLocal));
            composerImplV.V(false);
            if (text2 != null && (string = text2.toString()) != null) {
                upperCase = string.toUpperCase(Locale.ROOT);
                Intrinsics.g(upperCase, "toUpperCase(...)");
            }
            String str = upperCase;
            composerImplV.o(-1224400529);
            boolean zI = composerImplV.I(snackbar) | composerImplV.n(string2) | composerImplV.n(str);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == obj) {
                snackbar2 = snackbar;
                Object specialsHomeScreenKt$Snackbar$3$1 = new SpecialsHomeScreenKt$Snackbar$3$1(snackbar2, string2, snackbarHostState, str, null);
                composerImplV.A(specialsHomeScreenKt$Snackbar$3$1);
                objG2 = specialsHomeScreenKt$Snackbar$3$1;
            } else {
                snackbar2 = snackbar;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, snackbar2, (Function2) objG2);
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            final int i5 = 1;
            recomposeScopeImplX2.d = new Function2() { // from class: au.com.woolworths.shop.specials.ui.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i52 = i5;
                    Composer composer2 = (Composer) obj2;
                    ((Integer) obj3).intValue();
                    switch (i52) {
                        case 0:
                            SpecialsHomeScreenKt.e(snackbar2, composer2, RecomposeScopeImplKt.a(i | 1));
                            break;
                        default:
                            SpecialsHomeScreenKt.e(snackbar2, composer2, RecomposeScopeImplKt.a(i | 1));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void f(SpecialsHomeViewModel viewModel, Composer composer, int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(viewModel, "viewModel");
        ComposerImpl composerImplV = composer.v(892111706);
        int i2 = (composerImplV.I(viewModel) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            MutableState mutableStateA = FlowExtKt.a(viewModel.p, composerImplV);
            SpecialsHomeContract.ViewState viewState = (SpecialsHomeContract.ViewState) mutableStateA.getD();
            composerImplV.o(-1674103702);
            if (viewState.f12937a) {
                d(composerImplV, 0);
            }
            composerImplV.V(false);
            SpecialsHome specialsHome = viewState.b;
            composerImplV.o(-1674101447);
            if (specialsHome != null) {
                c(specialsHome.f12942a, ((SpecialsHomeContract.ViewState) mutableStateA.getD()).d, ((SpecialsHomeContract.ViewState) mutableStateA.getD()).e, viewModel, composerImplV, (i2 << 9) & 7168);
            }
            composerImpl = composerImplV;
            composerImpl.V(false);
            SpecialsHomePageErrorState specialsHomePageErrorState = viewState.c;
            composerImpl.o(-1674092685);
            if (specialsHomePageErrorState != null) {
                composerImpl.o(5004770);
                boolean zI = composerImpl.I(viewModel);
                Object objG = composerImpl.G();
                if (zI || objG == Composer.Companion.f1624a) {
                    SpecialsHomeScreenKt$SpecialsHomeScreen$1$2$1$1 specialsHomeScreenKt$SpecialsHomeScreen$1$2$1$1 = new SpecialsHomeScreenKt$SpecialsHomeScreen$1$2$1$1(0, viewModel, SpecialsHomeViewModel.class, "onErrorTryAgain", "onErrorTryAgain()V", 0);
                    composerImpl.A(specialsHomeScreenKt$SpecialsHomeScreen$1$2$1$1);
                    objG = specialsHomeScreenKt$SpecialsHomeScreen$1$2$1$1;
                }
                composerImpl.V(false);
                b(specialsHomePageErrorState, (Function0) ((KFunction) objG), composerImpl, 0);
            }
            composerImpl.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.lists.ui.substitutions.c(i, 4, viewModel);
        }
    }
}
