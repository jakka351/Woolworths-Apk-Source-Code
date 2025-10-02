package au.com.woolworths.feature.rewards.account.preferences;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractorKt;
import au.com.woolworths.base.rewards.account.data.PreferenceToggleData;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.SwitchKt;
import au.com.woolworths.design.wx.component.bottomsheet.ModalBottomSheetLayoutKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.button.SecondaryButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopBarLiftOnScrollElevationKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.d0;
import au.com.woolworths.feature.product.list.legacy.a0;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContract;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsFooterData;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsHeaderData;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsItem;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsTextData;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsToggleGroupData;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.markdown.compat.MarkdownTextViewStyle;
import au.com.woolworths.rewards.base.data.RewardsWebLink;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewState;", "viewState", "", "topNavBarTitle", "account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsPreferenceDetailsContentKt {
    public static final void a(RewardsPreferenceDetailsContract.ViewState viewState, Function2 function2, Function1 function1, Function0 function0, Function0 function02, boolean z, Composer composer, int i, int i2) {
        boolean z2;
        int i3;
        ComposerImpl composerImplV = composer.v(-1671355402);
        int i4 = i | (composerImplV.n(viewState) ? 4 : 2) | (composerImplV.I(function2) ? 32 : 16) | (composerImplV.I(function1) ? 256 : 128) | (composerImplV.I(function0) ? 2048 : 1024) | (composerImplV.I(function02) ? 16384 : 8192);
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 = i4 | 196608;
            z2 = z;
        } else {
            z2 = z;
            i3 = i4 | (composerImplV.p(z2) ? 131072 : 65536);
        }
        if ((74899 & i3) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean z3 = i5 != 0 ? true : z2;
            if (viewState instanceof RewardsPreferenceDetailsContract.ViewState.Content) {
                composerImplV.o(207489260);
                RewardsPreferenceDetailsContract.ViewState.Content content = (RewardsPreferenceDetailsContract.ViewState.Content) viewState;
                e(content.b, function2, function1, content.c, composerImplV, i3 & 1008);
                composerImplV.V(false);
                z2 = z3;
            } else if (viewState instanceof RewardsPreferenceDetailsContract.ViewState.Error) {
                composerImplV.o(207807568);
                z2 = z3;
                b((RewardsPreferenceDetailsContract.ViewState.Error) viewState, function02, function0, z2, composerImplV, ((i3 >> 9) & 112) | ((i3 >> 3) & 896) | ((i3 >> 6) & 7168));
                composerImplV.V(false);
            } else {
                z2 = z3;
                if (!Intrinsics.c(viewState, RewardsPreferenceDetailsContract.ViewState.Loading.f5734a)) {
                    throw au.com.woolworths.android.onesite.a.w(145238352, composerImplV, false);
                }
                composerImplV.o(208114313);
                c(composerImplV, 0);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.d(viewState, function2, function1, function0, function02, z2, i, i2);
        }
    }

    public static final void b(RewardsPreferenceDetailsContract.ViewState.Error error, Function0 function0, Function0 function02, boolean z, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        FullPageMessageSpec fullPageMessageSpecE;
        ComposerImpl composerImplV = composer.v(343341670);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(error) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.p(z) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i7 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
            ComposeUiNode.e3.getClass();
            Function0 function03 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                androidx.camera.core.impl.b.B(i7, composerImplV, i7, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Modifier modifierC = SizeKt.c(companion, 0.5f);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i8 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierC);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                androidx.camera.core.impl.b.B(i8, composerImplV, i8, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            if (Intrinsics.c(error, RewardsPreferenceDetailsContract.ViewState.Error.Network.f5731a)) {
                composerImplV.o(-1070149458);
                fullPageMessageSpecE = FullPageMessageSpec.Companion.c(null, null, null, null, function0, composerImplV, 31);
                composerImplV.V(false);
            } else if (Intrinsics.c(error, RewardsPreferenceDetailsContract.ViewState.Error.Server.f5733a)) {
                composerImplV.o(-1070143030);
                fullPageMessageSpecE = FullPageMessageSpec.Companion.f(null, null, null, null, null, function0, composerImplV, 31);
                composerImplV = composerImplV;
                composerImplV.V(false);
            } else {
                if (!Intrinsics.c(error, RewardsPreferenceDetailsContract.ViewState.Error.PushSettings.f5732a)) {
                    throw au.com.woolworths.android.onesite.a.w(-1070151944, composerImplV, false);
                }
                composerImplV.o(-1070135873);
                Painter painterA = PainterResources_androidKt.a(R.drawable.ic_push_settings, 0, composerImplV);
                String strC = StringResources_androidKt.c(composerImplV, R.string.rewards_push_setting_error_heading);
                if (z) {
                    i3 = -1070127401;
                    i4 = R.string.au_rewards_push_setting_error_subtitle;
                } else {
                    i3 = -1070124745;
                    i4 = R.string.nz_rewards_push_setting_error_subtitle;
                }
                String strL = au.com.woolworths.dynamic.page.ui.content.d.l(composerImplV, i3, i4, composerImplV, false);
                if (z) {
                    i5 = -1070120012;
                    i6 = R.string.au_rewards_push_setting_button_text;
                } else {
                    i5 = -1070117452;
                    i6 = R.string.nz_rewards_push_setting_button_text;
                }
                fullPageMessageSpecE = FullPageMessageSpec.Companion.e(painterA, strC, strL, au.com.woolworths.dynamic.page.ui.content.d.l(composerImplV, i5, i6, composerImplV, false), function02);
                composerImplV.V(false);
            }
            ComposerImpl composerImpl = composerImplV;
            FullPageMessageUiKt.a(fullPageMessageSpecE, null, null, composerImpl, 0, 6);
            composerImplV = composerImpl;
            composerImplV.V(true);
            SpacerKt.a(composerImplV, SizeKt.c);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.pullrefresh.a(error, function0, function02, z, i);
        }
    }

    public static final void c(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-725292158);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            FillElement fillElement = SizeKt.c;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, fillElement);
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
            ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 29, WxTheme.a(composerImplV).h(), 0L, composerImplV, null);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a0(i, 10);
        }
    }

    public static final void d(final RewardsPreferenceDetailsContract.ViewState viewState, Function2 function2, Function1 function1, Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        final Function2 function22;
        final Function1 function12;
        final Function0 function03;
        final Function0 function04;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(1382863854);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(viewState) : composerImplV.I(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function22 = function2;
            i2 |= composerImplV.I(function22) ? 32 : 16;
        } else {
            function22 = function2;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            function12 = function1;
            i2 |= composerImplV.I(function12) ? 256 : 128;
        } else {
            function12 = function1;
        }
        if ((i & 3072) == 0) {
            function03 = function0;
            i2 |= composerImplV.I(function03) ? 2048 : 1024;
        } else {
            function03 = function0;
        }
        if ((i & 24576) == 0) {
            function04 = function02;
            i2 |= composerImplV.I(function04) ? 16384 : 8192;
        } else {
            function04 = function02;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImpl = composerImplV;
            ModalBottomSheetLayoutKt.a(ComposableLambdaKt.c(1928461440, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContentKt$RewardsPreferenceDetailsBottomSheet$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope ModalBottomSheetLayout = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        RewardsPreferenceDetailsContentKt.a(viewState, function22, function12, function03, function04, false, composer2, 0, 32);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, ModalBottomSheetKt.c(ModalBottomSheetValue.e, null, composerImplV, 3078, 6), BitmapDescriptorFactory.HUE_RED, 0L, 0L, true, ComposableSingletons$RewardsPreferenceDetailsContentKt.f5721a, composerImpl, 14156294, 58);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d0(viewState, function2, function1, function0, function02, i, 4);
        }
    }

    public static final void e(final List items, final Function2 onToggleClick, final Function1 onButtonClick, final boolean z, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        Intrinsics.h(items, "items");
        Intrinsics.h(onToggleClick, "onToggleClick");
        Intrinsics.h(onButtonClick, "onButtonClick");
        ComposerImpl composerImplV = composer.v(302232467);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(items) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onToggleClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onButtonClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.p(z) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            FillElement fillElement = SizeKt.c;
            composerImplV.o(-1224400529);
            boolean zI = ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | composerImplV.I(items) | ((i2 & 896) == 256);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new Function1() { // from class: au.com.woolworths.feature.rewards.account.preferences.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        for (final PreferenceDetailsItem preferenceDetailsItem : items) {
                            final boolean z2 = z;
                            final Function2 function2 = onToggleClick;
                            final Function1 function1 = onButtonClick;
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContentKt$RewardsPreferenceDetailsContent$1$1$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        PreferenceDetailsItem preferenceDetailsItem2 = preferenceDetailsItem;
                                        if (preferenceDetailsItem2 instanceof PreferenceDetailsHeaderData) {
                                            composer2.o(1098082620);
                                            RewardsPreferenceDetailsContentKt.h((PreferenceDetailsHeaderData) preferenceDetailsItem2, null, composer2, 0);
                                            composer2.l();
                                        } else if (preferenceDetailsItem2 instanceof PreferenceDetailsToggleGroupData) {
                                            composer2.o(1098238736);
                                            RewardsPreferenceDetailsContentKt.k((PreferenceDetailsToggleGroupData) preferenceDetailsItem2, z2, function2, composer2, 0);
                                            composer2.l();
                                        } else if (preferenceDetailsItem2 instanceof PreferenceDetailsTextData) {
                                            composer2.o(1098550627);
                                            PreferenceDetailsTextData preferenceDetailsTextData = (PreferenceDetailsTextData) preferenceDetailsItem2;
                                            String str = preferenceDetailsTextData.f5750a;
                                            if (str != null) {
                                                RewardsPreferenceDetailsContentKt.i(str, preferenceDetailsTextData.b, composer2, 0);
                                            }
                                            composer2.l();
                                        } else {
                                            if (!(preferenceDetailsItem2 instanceof PreferenceDetailsFooterData)) {
                                                throw au.com.woolworths.android.onesite.a.x(composer2, -2042789083);
                                            }
                                            composer2.o(1098790164);
                                            PreferenceDetailsFooterData preferenceDetailsFooterData = (PreferenceDetailsFooterData) preferenceDetailsItem2;
                                            String str2 = preferenceDetailsFooterData.f5748a;
                                            if (str2 != null) {
                                                RewardsPreferenceDetailsContentKt.f(str2, preferenceDetailsFooterData.b, function1, composer2, RewardsWebLink.$stable << 3);
                                            }
                                            composer2.l();
                                        }
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 364354347), 3);
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            LazyDslKt.b(fillElement, null, null, false, null, null, null, false, null, (Function1) objG, composerImpl, 6, 510);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.pullrefresh.a(i, 4, items, onToggleClick, onButtonClick, z);
        }
    }

    public static final void f(String str, RewardsWebLink rewardsWebLink, Function1 onButtonClick, Composer composer, int i) {
        int i2;
        int i3;
        Modifier.Companion companion;
        boolean z;
        RewardsWebLink rewardsWebLink2;
        Function1 function1;
        Intrinsics.h(onButtonClick, "onButtonClick");
        ComposerImpl composerImplV = composer.v(-1425736110);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(rewardsWebLink) : composerImplV.I(rewardsWebLink) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onButtonClick) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            function1 = onButtonClick;
            rewardsWebLink2 = rewardsWebLink;
        } else {
            float f = 16;
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 7);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierJ);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-1782068341);
            if (str != null) {
                companion = companion2;
                i3 = i2;
                TextKt.b(str, PaddingKt.j(companion2, f, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12), WxTheme.a(composerImplV).f(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).r, composerImplV, (i2 & 14) | 48, 0, 65528);
                composerImplV = composerImplV;
                z = false;
            } else {
                i3 = i2;
                companion = companion2;
                z = false;
            }
            composerImplV.V(z);
            composerImplV.o(-1782059126);
            rewardsWebLink2 = rewardsWebLink;
            if (rewardsWebLink2 != null) {
                String label = rewardsWebLink2.getLabel();
                float f2 = 4;
                Modifier modifierJ2 = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, 11);
                PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f2, f2, f2, f2);
                composerImplV.o(-1633490746);
                int i5 = i3;
                boolean z2 = (((i5 & 112) == 32 || ((i5 & 64) != 0 && composerImplV.I(rewardsWebLink2))) ? true : z) | ((i5 & 896) == 256 ? true : z);
                Object objG = composerImplV.G();
                if (z2 || objG == Composer.Companion.f1624a) {
                    function1 = onButtonClick;
                    objG = new androidx.navigation.compose.a(21, function1, rewardsWebLink2);
                    composerImplV.A(objG);
                } else {
                    function1 = onButtonClick;
                }
                composerImplV.V(z);
                SecondaryButtonKt.b(label, (Function0) objG, modifierJ2, false, false, paddingValuesImpl, null, composerImplV, 221568, 72);
            } else {
                function1 = onButtonClick;
            }
            composerImplV.V(z);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.lifecycle.compose.c(str, rewardsWebLink2, function1, i, 27);
        }
    }

    public static final void g(final RewardsPreferenceDetailsContract.ViewState viewState, final SnackbarHostState snackbarHostState, final LazyListState lazyListState, final boolean z, final boolean z2, final Function2 function2, final Function1 function1, final Function0 function0, final Function0 function02, final Function0 function03, Composer composer, final int i) {
        int i2;
        Function0 function04;
        ComposerImpl composerImpl;
        String str;
        ComposerImpl composerImplV = composer.v(-759677674);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(viewState) : composerImplV.I(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(snackbarHostState) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(lazyListState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.p(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.p(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.I(function0) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerImplV.I(function02) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            function04 = function03;
            i2 |= composerImplV.I(function04) ? 536870912 : 268435456;
        } else {
            function04 = function03;
        }
        if ((i2 & 306783379) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            String strL = z ? au.com.woolworths.dynamic.page.ui.content.d.l(composerImplV, 94212234, R.string.rewards_push_preferences_title, composerImplV, false) : au.com.woolworths.dynamic.page.ui.content.d.l(composerImplV, 94215107, R.string.rewards_push_preferences_title_default, composerImplV, false);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = SnapshotStateKt.f(strL);
                composerImplV.A(objG);
            }
            final MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            if ((viewState instanceof RewardsPreferenceDetailsContract.ViewState.Content) && (str = ((RewardsPreferenceDetailsContract.ViewState.Content) viewState).f5730a) != null) {
                mutableState.setValue(str);
            }
            final Function0 function05 = function04;
            composerImpl = composerImplV;
            ScaffoldKt.a(TestTagKt.a(SizeKt.c, "NavigationTitle"), androidx.compose.material.ScaffoldKt.d(snackbarHostState, composerImplV, 1), ComposableLambdaKt.c(1978115291, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContentKt$RewardsPreferenceDetailsFullScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String str2 = (String) mutableState.getD();
                        long jA = WxTheme.a(composer2).a();
                        long jC = WxTheme.a(composer2).c();
                        float fA = TopBarLiftOnScrollElevationKt.a(lazyListState, composer2);
                        final Function0 function06 = function02;
                        TopNavBarKt.b(str2, null, null, null, 0L, jA, jC, null, fA, ComposableLambdaKt.c(754626220, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContentKt$RewardsPreferenceDetailsFullScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ImageVector imageVectorA = ArrowBackKt.a();
                                    String strC = StringResources_androidKt.c(composer3, R.string.content_description_back_button);
                                    composer3.o(5004770);
                                    Function0 function07 = function06;
                                    boolean zN = composer3.n(function07);
                                    Object objG2 = composer3.G();
                                    if (zN || objG2 == Composer.Companion.f1624a) {
                                        objG2 = new au.com.woolworths.design.core.ui.component.experimental.dialog.a(11, function07);
                                        composer3.A(objG2);
                                    }
                                    composer3.l();
                                    IconButtonKt.c(imageVectorA, strC, (Function0) objG2, null, false, 0L, composer3, 0, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 805306368, 0, 1182);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0, WxTheme.a(composerImplV).a(), 0L, null, null, ComposableLambdaKt.c(-420124979, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContentKt$RewardsPreferenceDetailsFullScreen$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        RewardsPreferenceDetailsContentKt.a(viewState, function2, function1, function0, function05, z2, composer2, 0, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 390, 952);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.rewards.account.preferences.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    RewardsPreferenceDetailsContentKt.g(viewState, snackbarHostState, lazyListState, z, z2, function2, function1, function0, function02, function03, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void h(PreferenceDetailsHeaderData data, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        float f;
        int i2;
        boolean z;
        Intrinsics.h(data, "data");
        ComposerImpl composerImplV = composer.v(623030969);
        if (((i | (composerImplV.n(data) ? 4 : 2) | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            float f2 = 16;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierF = PaddingKt.f(companion, f2);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            modifier2 = companion;
            SingletonAsyncImageKt.b(data.f5749a, null, SizeKt.g(companion, 100), PainterResources_androidKt.a(R.drawable.ic_rewards_logo_placeholder, 0, composerImplV), null, null, null, null, null, null, null, null, composerImplV, 432, 0, 32752);
            SpacerKt.a(composerImplV, SizeKt.g(modifier2, f2));
            TextKt.b(data.b, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).i, composerImplV, 0, 0, 65534);
            composerImplV = composerImplV;
            composerImplV.o(-1561460950);
            if (data.c != null) {
                SpacerKt.a(composerImplV, SizeKt.g(modifier2, 8));
                Modifier modifierH = PaddingKt.h(modifier2, f2, BitmapDescriptorFactory.HUE_RED, 2);
                f = f2;
                i2 = 8;
                TextKt.b(data.c, modifierH, 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).l, composerImplV, 48, 0, 65020);
                composerImplV = composerImplV;
            } else {
                f = f2;
                i2 = 8;
            }
            composerImplV.V(false);
            composerImplV.o(-1561449950);
            if (data.d != null) {
                SpacerKt.a(composerImplV, SizeKt.g(modifier2, i2));
                z = false;
                MarkdownCompatKt.a(data.d, PaddingKt.h(modifier2, f, BitmapDescriptorFactory.HUE_RED, 2), new MarkdownTextViewStyle((Density) composerImplV.x(CompositionLocalsKt.h), WxTheme.a(composerImplV).f(), WxTheme.b(composerImplV).n, new TextAlign(3), 16), null, false, null, null, false, null, null, composerImplV, 48, 1016);
            } else {
                z = false;
            }
            composerImplV.V(z);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.navigation.compose.d(data, i, 16, modifier2);
        }
    }

    public static final void i(String text, String str, Composer composer, int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(text, "text");
        ComposerImpl composerImplV = composer.v(1304454246);
        int i2 = i | (composerImplV.n(text) ? 4 : 2) | (composerImplV.n(str) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Modifier modifierF = PaddingKt.f(Modifier.Companion.d, 16);
            composerImplV.o(-1633490746);
            boolean z = (i2 & 112) == 32;
            int i3 = i2 & 14;
            boolean z2 = z | (i3 == 4);
            Object objG = composerImplV.G();
            if (z2 || objG == Composer.Companion.f1624a) {
                objG = new f(str, text, 0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            TextKt.b(text, SemanticsModifierKt.b(modifierF, false, (Function1) objG), WxTheme.a(composerImplV).f(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).r, composerImpl, i3, 0, 65528);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(text, str, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v17 */
    public static final void j(PreferenceToggleData data, boolean z, Function2 onClick, Composer composer, int i) {
        int i2;
        Function2 function2;
        Function2 function22;
        ?? r0;
        Modifier.Companion companion;
        Function2 function23;
        Function2 function24;
        Function0 function0;
        ComposerImpl composerImpl;
        long jF;
        ComposerImpl composerImpl2;
        Intrinsics.h(data, "data");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-163504958);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(data) : composerImplV.I(data) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onClick) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl2 = composerImplV;
        } else {
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion2, 1.0f);
            boolean z2 = !z;
            composerImplV.o(-1633490746);
            boolean z3 = ((i2 & 14) == 4 || ((i2 & 8) != 0 && composerImplV.I(data))) | ((i2 & 896) == 256);
            Object objG = composerImplV.G();
            if (z3 || objG == Composer.Companion.f1624a) {
                objG = new androidx.navigation.compose.a(22, onClick, data);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            float f = 12;
            Modifier modifierG = PaddingKt.g(ClickableKt.d(modifierE, z2, null, null, (Function0) objG, 6), f, 6);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierG);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Function2 function25 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function25);
            Function2 function26 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function26);
            Function2 function27 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function27);
            }
            Function2 function28 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function28);
            composerImplV.o(893486896);
            if (data.getIconUrl() != null) {
                float f2 = 56;
                function2 = function28;
                function24 = function27;
                function23 = function26;
                companion = companion2;
                function0 = function02;
                r0 = 0;
                function22 = function25;
                SingletonAsyncImageKt.b(data.getIconUrl(), null, PaddingKt.j(SizeKt.u(SizeKt.g(companion2, f2), f2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, 11), PainterResources_androidKt.a(R.drawable.ic_rewards_logo_placeholder, 0, composerImplV), null, null, null, null, null, null, null, null, composerImplV, 432, 0, 32752);
                composerImpl = composerImplV;
            } else {
                function2 = function28;
                function22 = function25;
                r0 = 0;
                companion = companion2;
                function23 = function26;
                function24 = function27;
                function0 = function02;
                composerImpl = composerImplV;
            }
            composerImpl.V(r0);
            Modifier.Companion companion3 = companion;
            Modifier modifierA = RowScopeInstance.f974a.a(companion3, 1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImpl, r0);
            int i4 = composerImpl.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImpl.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImpl, modifierA);
            composerImpl.i();
            if (composerImpl.O) {
                composerImpl.K(function0);
            } else {
                composerImpl.e();
            }
            Updater.b(composerImpl, columnMeasurePolicyA, function22);
            Updater.b(composerImpl, persistentCompositionLocalMapQ2, function23);
            if (composerImpl.O || !Intrinsics.c(composerImpl.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImpl, i4, function24);
            }
            Updater.b(composerImpl, modifierD2, function2);
            Composer composer2 = composerImpl;
            TextKt.b(data.getTitle(), null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, WxTheme.b(composerImpl).l, composer2, 0, 3120, 55294);
            ComposerImpl composerImpl3 = composer2;
            SpacerKt.a(composerImpl3, SizeKt.g(companion3, 2));
            composerImpl3.o(2078018926);
            ComposerImpl composerImpl4 = composerImpl3;
            if (data.getSubtitle() != null) {
                String subtitle = data.getSubtitle();
                Intrinsics.e(subtitle);
                TextStyle textStyle = WxTheme.b(composerImpl3).n;
                if (z) {
                    composerImpl3.o(2078025335);
                    jF = WxTheme.a(composerImpl3).d();
                } else {
                    composerImpl3.o(2078026648);
                    jF = WxTheme.a(composerImpl3).f();
                }
                composerImpl3.V(r0);
                TextKt.b(subtitle, null, jF, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, textStyle, composerImpl3, 0, 3120, 55290);
                composerImpl4 = composerImpl3;
            }
            composerImpl4.V(r0);
            composerImpl4.V(true);
            SwitchKt.a(48, 4, composerImpl4, null, null, data.getValue(), z2);
            composerImpl4.V(true);
            composerImpl2 = composerImpl4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.filter.b(data, z, onClick, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    public static final void k(PreferenceDetailsToggleGroupData data, boolean z, Function2 onToggleClick, Composer composer, int i) {
        Iterable iterable;
        boolean z2;
        Intrinsics.h(data, "data");
        Object obj = data.c;
        Intrinsics.h(onToggleClick, "onToggleClick");
        ComposerImpl composerImplV = composer.v(-962055294);
        int i2 = i | (composerImplV.I(data) ? 4 : 2) | (composerImplV.p(z) ? 32 : 16) | (composerImplV.I(onToggleClick) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-1386609200);
            String string = data.f5751a;
            if (string != null) {
                Locale locale = Locale.Companion.a().f2136a;
                if (string.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    char cCharAt = string.charAt(0);
                    sb.append((Object) (Character.isLowerCase(cCharAt) ? CharsKt.d(cCharAt, locale) : String.valueOf(cCharAt)));
                    String strSubstring = string.substring(1);
                    Intrinsics.g(strSubstring, "substring(...)");
                    sb.append(strSubstring);
                    string = sb.toString();
                }
                float f = 12;
                iterable = obj;
                z2 = false;
                TextKt.b(string, PaddingKt.j(companion, f, f, 16, BitmapDescriptorFactory.HUE_RED, 8), WxTheme.a(composerImplV).d(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).s, composerImplV, 0, 0, 65528);
                composerImplV = composerImplV;
            } else {
                iterable = obj;
                z2 = false;
            }
            composerImplV.V(z2);
            composerImplV.o(-1386597436);
            ?? r8 = z2;
            for (Object obj2 : iterable) {
                int i4 = r8 + 1;
                if (r8 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                j((PreferenceToggleData) obj2, z, onToggleClick, composerImplV, PreferenceToggleData.$stable | (i2 & 112) | (i2 & 896));
                composerImplV.o(-1386590874);
                if (r8 < iterable.size()) {
                    DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, ToneColors.i, composerImplV, null);
                }
                composerImplV.V(z2);
                r8 = i4;
            }
            composerImplV.V(z2);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.account.authentication.ui.a(data, z, onToggleClick, i, 1);
        }
    }

    public static final void l(final RewardsPreferenceDetailsViewModel viewModel, final boolean z, final Function2 onToggleClick, final Function1 onButtonClick, final Function0 onSettingsButtonClick, final Function0 onNavigateUp, final Function0 onRetry, final Function0 onGoToPushSettings, final Function1 onOpenUrl, Composer composer, final int i) {
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onToggleClick, "onToggleClick");
        Intrinsics.h(onButtonClick, "onButtonClick");
        Intrinsics.h(onSettingsButtonClick, "onSettingsButtonClick");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onRetry, "onRetry");
        Intrinsics.h(onGoToPushSettings, "onGoToPushSettings");
        Intrinsics.h(onOpenUrl, "onOpenUrl");
        ComposerImpl composerImplV = composer.v(-1451395434);
        int i2 = i | (composerImplV.I(viewModel) ? 4 : 2) | (composerImplV.I(onToggleClick) ? 256 : 128) | (composerImplV.I(onButtonClick) ? 2048 : 1024) | (composerImplV.I(onSettingsButtonClick) ? 16384 : 8192) | (composerImplV.I(onNavigateUp) ? 131072 : 65536) | (composerImplV.I(onRetry) ? 1048576 : 524288) | (composerImplV.I(onGoToPushSettings) ? 8388608 : 4194304) | (composerImplV.I(onOpenUrl) ? 67108864 : 33554432);
        if ((38347923 & i2) == 38347922 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MutableState mutableStateA = FlowExtKt.a(viewModel.s, composerImplV);
            LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new SnackbarHostState();
                composerImplV.A(objG);
            }
            SnackbarHostState snackbarHostState = (SnackbarHostState) objG;
            composerImplV.V(false);
            Flow flow = viewModel.t;
            composerImplV.o(-1746271574);
            boolean zI = composerImplV.I(viewModel) | ((i2 & 29360128) == 8388608) | ((i2 & 234881024) == 67108864);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new RewardsPreferenceDetailsContentKt$RewardsPreferenceDetailsUi$1$1(viewModel, onGoToPushSettings, onOpenUrl, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) objG2);
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            Flow flow2 = viewModel.u;
            composerImplV.o(-1746271574);
            boolean zI2 = composerImplV.I(viewModel) | composerImplV.I(context);
            Object objG3 = composerImplV.G();
            if (zI2 || objG3 == composer$Companion$Empty$1) {
                objG3 = new RewardsPreferenceDetailsContentKt$RewardsPreferenceDetailsUi$2$1(viewModel, snackbarHostState, context, null);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow2, (Function2) objG3);
            if (z) {
                composerImplV.o(-1083785605);
                d((RewardsPreferenceDetailsContract.ViewState) mutableStateA.getD(), onToggleClick, onButtonClick, onSettingsButtonClick, onRetry, composerImplV, (57344 & (i2 >> 6)) | ((i2 >> 3) & 8176));
                composerImplV.V(false);
            } else {
                composerImplV.o(-1083500405);
                int i3 = i2 << 9;
                g((RewardsPreferenceDetailsContract.ViewState) mutableStateA.getD(), snackbarHostState, lazyListStateA, viewModel.l, RewardsAccountInteractorKt.a(viewModel.g) == Region.i, onToggleClick, onButtonClick, onSettingsButtonClick, onNavigateUp, onRetry, composerImplV, (i3 & 1879048192) | (458752 & i3) | 48 | (3670016 & i3) | (i3 & 29360128) | (i3 & 234881024));
                composerImplV = composerImplV;
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(z, onToggleClick, onButtonClick, onSettingsButtonClick, onNavigateUp, onRetry, onGoToPushSettings, onOpenUrl, i) { // from class: au.com.woolworths.feature.rewards.account.preferences.h
                public final /* synthetic */ boolean e;
                public final /* synthetic */ Function2 f;
                public final /* synthetic */ Function1 g;
                public final /* synthetic */ Function0 h;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function0 j;
                public final /* synthetic */ Function0 k;
                public final /* synthetic */ Function1 l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(49);
                    RewardsPreferenceDetailsContentKt.l(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
