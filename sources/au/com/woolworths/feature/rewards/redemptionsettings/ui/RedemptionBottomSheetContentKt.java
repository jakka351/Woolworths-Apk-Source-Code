package au.com.woolworths.feature.rewards.redemptionsettings.ui;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.f;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingsItem;
import au.com.woolworths.compose.utils.modifier.OptionalModifierKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.redemptionsettings.RedemptionItemClickListener;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsContract;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsErrorState;
import au.com.woolworths.feature.rewards.redemptionsettings.data.RewardsRedemptionAction;
import au.com.woolworths.feature.rewards.redemptionsettings.data.RewardsRedemptionActionsList;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"redemption-settings_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RedemptionBottomSheetContentKt {
    public static final void a(RewardsRedemptionActionsList rewardsRedemptionActionsList, RedemptionItemClickListener redemptionItemClickListener, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1741672599);
        int i2 = (composerImplV.I(rewardsRedemptionActionsList) ? 32 : 16) | i | (composerImplV.n(redemptionItemClickListener) ? 256 : 128);
        if ((i2 & 145) == 144 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ActionListTitleKt.a(rewardsRedemptionActionsList.getTitle(), composerImplV, 0);
            for (RewardsRedemptionAction rewardsRedemptionAction : rewardsRedemptionActionsList.getItems()) {
                composerImplV.o(-1633490746);
                boolean zN = ((i2 & 896) == 256) | composerImplV.n(rewardsRedemptionAction);
                Object objG = composerImplV.G();
                if (zN || objG == Composer.Companion.f1624a) {
                    objG = new au.com.woolworths.feature.rewards.card.overlay.ui.b(17, redemptionItemClickListener, rewardsRedemptionAction);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                RedemptionActionKt.b(rewardsRedemptionAction, ClickableKt.d(Modifier.Companion.d, false, null, null, (Function0) objG, 7), composerImplV, 0, 4);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.navigation.compose.d(rewardsRedemptionActionsList, i, 28, redemptionItemClickListener);
        }
    }

    public static final void b(final RewardsRedemptionSettingsContract.ViewState viewState, final Function0 onReload, final RedemptionItemClickListener clickListener, Composer composer, int i) {
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(onReload, "onReload");
        Intrinsics.h(clickListener, "clickListener");
        ComposerImpl composerImplV = composer.v(1970974115);
        if ((((composerImplV.I(viewState) ? 4 : 2) | i | (composerImplV.I(onReload) ? 32 : 16) | (composerImplV.n(clickListener) ? 256 : 128)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            AnimatedContentKt.b(new Pair(Boolean.valueOf(viewState.f6432a), viewState.d), null, new au.com.woolworths.feature.shop.recipes.recipes.list.b(23), null, "showContent", null, ComposableLambdaKt.c(1832090640, new Function4<AnimatedContentScope, Pair<? extends Boolean, ? extends RewardsRedemptionSettingsErrorState>, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.ui.RedemptionBottomSheetContentKt$RedemptionBottomSheetContent$1
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj;
                    Pair destruct$ = (Pair) obj2;
                    Composer composer2 = (Composer) obj3;
                    ((Number) obj4).intValue();
                    Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
                    Intrinsics.h(destruct$, "$destruct$");
                    boolean zBooleanValue = ((Boolean) destruct$.d).booleanValue();
                    final RewardsRedemptionSettingsErrorState rewardsRedemptionSettingsErrorState = (RewardsRedemptionSettingsErrorState) destruct$.e;
                    Modifier.Companion companion = Modifier.Companion.d;
                    Unit unit = Unit.f24250a;
                    Unit unit2 = null;
                    if (zBooleanValue) {
                        composer2.o(-632080659);
                        Modifier modifierG = SizeKt.g(SizeKt.e(companion, 1.0f), 340);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierG);
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
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 30, 0L, 0L, composer2, BoxScopeInstance.f944a.g(companion, Alignment.Companion.e));
                        composer2.f();
                        composer2.l();
                        return unit;
                    }
                    composer2.o(-631725926);
                    Modifier modifierE = SizeKt.e(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                    int p2 = composer2.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                    Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierE);
                    ComposeUiNode.e3.getClass();
                    Function0 function02 = ComposeUiNode.Companion.b;
                    if (composer2.w() == null) {
                        ComposablesKt.b();
                        throw null;
                    }
                    composer2.i();
                    if (composer2.getO()) {
                        composer2.K(function02);
                    } else {
                        composer2.e();
                    }
                    Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                    Updater.b(composer2, persistentCompositionLocalMapD2, ComposeUiNode.Companion.f);
                    Function2 function22 = ComposeUiNode.Companion.j;
                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                        androidx.camera.core.impl.b.z(p2, composer2, p2, function22);
                    }
                    Updater.b(composer2, modifierD2, ComposeUiNode.Companion.d);
                    TextKt.b(StringResources_androidKt.c(composer2, R.string.rewards_redeemed_settings_bottom_sheet_title), LayoutIdKt.b(ColumnScopeInstance.f948a.b(PaddingKt.j(PaddingKt.f(companion, 16), BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), Alignment.Companion.n), "title"), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).m, composer2, 0, 0, 65532);
                    composer2.o(1262385771);
                    if (rewardsRedemptionSettingsErrorState != null) {
                        final Function0 function03 = onReload;
                        CoreThemeKt.b(6, composer2, ComposableLambdaKt.c(-1112194748, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.ui.RedemptionBottomSheetContentKt$RedemptionBottomSheetContent$1$2$1$1

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            public /* synthetic */ class WhenMappings {
                                static {
                                    int[] iArr = new int[RewardsRedemptionSettingsErrorState.values().length];
                                    try {
                                        iArr[0] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        RewardsRedemptionSettingsErrorState rewardsRedemptionSettingsErrorState = RewardsRedemptionSettingsErrorState.d;
                                        iArr[1] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                FullPageMessage.Error error;
                                Composer composer3 = (Composer) obj5;
                                if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    int iOrdinal = rewardsRedemptionSettingsErrorState.ordinal();
                                    if (iOrdinal == 0) {
                                        error = FullPageMessage.Error.ConnectionError.f8915a;
                                    } else {
                                        if (iOrdinal != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        error = FullPageMessage.Error.ServerError.f8916a;
                                    }
                                    FullPageMessageUiKt.a(FullPageMessageSpec.Companion.a(error, StringResources_androidKt.c(composer3, R.string.rewards_redemption_settings_connection_error), StringResources_androidKt.c(composer3, R.string.rewards_redemption_settings_unable_to_load_results), function03, composer3, 1572912, 4), SizeKt.i(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, 340, 1), null, composer3, 48, 4);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2));
                        unit2 = unit;
                    }
                    composer2.l();
                    composer2.o(1262385884);
                    if (unit2 == null) {
                        RewardsRedemptionSettingsContract.ViewState viewState2 = viewState;
                        List list = viewState2.b;
                        composer2.o(1262421653);
                        RedemptionItemClickListener redemptionItemClickListener = clickListener;
                        if (list != null) {
                            RedemptionBottomSheetContentKt.c(list, viewState2.e, redemptionItemClickListener, composer2, RewardsRedemptionSettingsItem.$stable << 6);
                        }
                        composer2.l();
                        RewardsRedemptionActionsList rewardsRedemptionActionsList = viewState2.c;
                        composer2.o(1262428553);
                        if (rewardsRedemptionActionsList != null) {
                            RedemptionBottomSheetContentKt.a(rewardsRedemptionActionsList, redemptionItemClickListener, composer2, 0);
                        }
                        composer2.l();
                        SpacerKt.a(composer2, SizeKt.g(companion, 48));
                    }
                    composer2.l();
                    composer2.f();
                    composer2.l();
                    return unit;
                }
            }, composerImplV), composerImplV, 1597440, 42);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(viewState, onReload, clickListener, i, 12);
        }
    }

    public static final void c(List list, RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem, RedemptionItemClickListener redemptionItemClickListener, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1308032373);
        if ((i & 48) == 0) {
            i2 = (composerImplV.I(list) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? composerImplV.n(rewardsRedemptionSettingsItem) : composerImplV.I(rewardsRedemptionSettingsItem) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerImplV.n(redemptionItemClickListener) : composerImplV.I(redemptionItemClickListener) ? 2048 : 1024;
        }
        if ((i2 & 1169) == 1168 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem2 = (RewardsRedemptionSettingsItem) it.next();
                boolean z = !rewardsRedemptionSettingsItem2.isSelected() || rewardsRedemptionSettingsItem2.getCta() == null;
                composerImplV.o(-1633490746);
                int i3 = i2 & 7168;
                boolean zI = (i3 == 2048 || ((i2 & 4096) != 0 && composerImplV.I(redemptionItemClickListener))) | composerImplV.I(rewardsRedemptionSettingsItem2);
                Object objG = composerImplV.G();
                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                if (zI || objG == composer$Companion$Empty$1) {
                    objG = new f(19, redemptionItemClickListener, rewardsRedemptionSettingsItem2);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                Modifier modifierA = OptionalModifierKt.a(Modifier.Companion.d, z, (Function1) objG);
                boolean z2 = rewardsRedemptionSettingsItem2.isSelected() && rewardsRedemptionSettingsItem == null;
                boolean z3 = rewardsRedemptionSettingsItem2 == rewardsRedemptionSettingsItem;
                composerImplV.o(-1633490746);
                boolean zI2 = (i3 == 2048 || ((i2 & 4096) != 0 && composerImplV.I(redemptionItemClickListener))) | composerImplV.I(rewardsRedemptionSettingsItem2);
                Object objG2 = composerImplV.G();
                if (zI2 || objG2 == composer$Companion$Empty$1) {
                    objG2 = new a(redemptionItemClickListener, rewardsRedemptionSettingsItem2, 0);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                RedemptionSettingKt.b(rewardsRedemptionSettingsItem2, (Function0) objG2, modifierA, z2, z3, composerImplV, RewardsRedemptionSettingsItem.$stable, 0);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c(list, rewardsRedemptionSettingsItem, redemptionItemClickListener, i, 7);
        }
    }
}
