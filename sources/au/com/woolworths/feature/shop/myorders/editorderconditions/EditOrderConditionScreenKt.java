package au.com.woolworths.feature.shop.myorders.editorderconditions;

import android.content.Context;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.component.stable.loadingbutton.PrimaryLoadingButtonKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui.e;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.h;
import au.com.woolworths.feature.shop.homepage.presentation.rewards.d;
import au.com.woolworths.feature.shop.myorders.details.models.EditOrderWarning;
import au.com.woolworths.feature.shop.myorders.details.models.EditOrderWarningItem;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EditOrderConditionScreenKt {
    public static final void a(EditOrderWarning editOrderWarning, PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        boolean z;
        ComposerImpl composerImplV = composer.v(-38585697);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(editOrderWarning) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(paddingValues) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Painter painterA = PainterResources_androidKt.a(R.drawable.ic_campaign_default, 0, composerImplV);
            Modifier modifierB = ScrollKt.b(PaddingKt.e(SizeKt.c, paddingValues), ScrollKt.a(composerImplV), true);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i3 = composerImplV.P;
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            float f = 24;
            Modifier.Companion companion = Modifier.Companion.d;
            SingletonAsyncImageKt.b(editOrderWarning.d, "Change My Order Image", SizeKt.g(SizeKt.w(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), BitmapDescriptorFactory.HUE_RED, 164, 1), 108), painterA, painterA, null, null, null, null, null, ContentScale.Companion.b, null, composerImplV, 432, 6, 31712);
            TextKt.b(editOrderWarning.e, PaddingKt.f(companion, 16), CoreTheme.b(composerImplV).e.d.d, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).d.c.b, composerImplV, 48, 0, 65016);
            composerImpl = composerImplV;
            b(editOrderWarning.f, composerImpl, 0);
            String str = editOrderWarning.j;
            composerImpl.o(371900137);
            if (str == null) {
                z = false;
            } else {
                z = false;
                TextKt.b(str, PaddingKt.g(SizeKt.e(companion, 1.0f), f, 8), CoreTheme.b(composerImpl).e.d.d, 0L, null, 0L, null, new TextAlign(5), 0L, 0, false, 0, 0, null, CoreTheme.f(composerImpl).f5120a.f5121a.b, composerImpl, 48, 0, 65016);
                composerImpl = composerImpl;
            }
            composerImpl.V(z);
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new h(editOrderWarning, i, 15, paddingValues);
        }
    }

    public static final void b(List list, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1471441094);
        int i2 = 2;
        if (((i | (composerImplV.I(list) ? 4 : 2)) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Iterator it = list.iterator();
            int i3 = 0;
            int i4 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                EditOrderWarningItem editOrderWarningItem = (EditOrderWarningItem) next;
                Modifier.Companion companion = Modifier.Companion.d;
                float f = 12;
                float f2 = 16;
                float f3 = 8;
                Modifier modifierI = PaddingKt.i(SizeKt.e(companion, 1.0f), f, f3, f2, f3);
                RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, i3);
                int i6 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
                Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierI);
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
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                    b.B(i6, composerImplV, i6, function2);
                }
                Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
                TextStyle textStyle = CoreTheme.f(composerImplV).f5120a.f5121a.f5122a;
                long j = CoreTheme.b(composerImplV).e.d.d;
                Modifier modifierH = PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, i2);
                int i7 = i2;
                ComposerImpl composerImpl = composerImplV;
                int i8 = i4;
                Iterator it2 = it;
                TextKt.b("•", modifierH, j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composerImpl, 54, 0, 65528);
                TextKt.b(editOrderWarningItem.d, null, CoreTheme.b(composerImpl).e.d.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImpl).f5120a.f5121a.f5122a, composerImpl, 0, 0, 65530);
                composerImplV = composerImpl;
                composerImplV.V(true);
                composerImplV.o(-1010619745);
                if (i8 == CollectionsKt.I(list)) {
                    DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 4, CoreTheme.b(composerImplV).e.b.f4852a, composerImplV, PaddingKt.g(companion, 24, f2));
                }
                composerImplV.V(false);
                i3 = 0;
                i4 = i5;
                i2 = i7;
                it = it2;
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(i, 3, list);
        }
    }

    public static final void c(final EditOrderWarning editOrderWarningData, final Function0 onBackButtonPressed, final Function0 onButtonClick, Flow actionFlow, Composer composer, int i) {
        final SnackbarHostState snackbarHostState;
        Flow flow;
        Intrinsics.h(editOrderWarningData, "editOrderWarningData");
        Intrinsics.h(onBackButtonPressed, "onBackButtonPressed");
        Intrinsics.h(onButtonClick, "onButtonClick");
        Intrinsics.h(actionFlow, "actionFlow");
        ComposerImpl composerImplV = composer.v(1234582591);
        int i2 = (composerImplV.I(editOrderWarningData) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onBackButtonPressed) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onButtonClick) ? 256 : 128;
        }
        if (((i2 | (composerImplV.I(actionFlow) ? 2048 : 1024)) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            flow = actionFlow;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG);
            }
            final MutableState mutableState = (MutableState) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == composer$Companion$Empty$1) {
                objD = new SnackbarHostState();
                composerImplV.A(objD);
            }
            SnackbarHostState snackbarHostState2 = (SnackbarHostState) objD;
            composerImplV.V(false);
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            composerImplV.o(-1224400529);
            boolean zI = composerImplV.I(actionFlow) | composerImplV.I(context);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                snackbarHostState = snackbarHostState2;
                flow = actionFlow;
                EditOrderConditionScreenKt$EditOrderConditionsScreen$1$1 editOrderConditionScreenKt$EditOrderConditionsScreen$1$1 = new EditOrderConditionScreenKt$EditOrderConditionsScreen$1$1(flow, mutableState, snackbarHostState, context, null);
                composerImplV.A(editOrderConditionScreenKt$EditOrderConditionsScreen$1$1);
                objG2 = editOrderConditionScreenKt$EditOrderConditionsScreen$1$1;
            } else {
                snackbarHostState = snackbarHostState2;
                flow = actionFlow;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) objG2);
            ScaffoldKt.a(SizeKt.c, ComposableLambdaKt.c(-727221501, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionScreenKt$EditOrderConditionsScreen$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String str = editOrderWarningData.h;
                        final Function0 function0 = onBackButtonPressed;
                        TopNavBarKt.a(str, null, 0L, 0L, 0L, null, null, ComposableLambdaKt.c(1139701109, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionScreenKt$EditOrderConditionsScreen$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(CoreTheme.e(composer3).f4879a.G, "Back", function0, null, false, null, 0L, composer3, 48, 120);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 100663296, 766);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(1481902980, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionScreenKt$EditOrderConditionsScreen$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierA = WindowInsetsPadding_androidKt.a(Modifier.Companion.d);
                        CoreElevation coreElevation = CoreTheme.c(composer2).e;
                        final MutableState mutableState2 = mutableState;
                        final Function0 function0 = onButtonClick;
                        final EditOrderWarning editOrderWarning = editOrderWarningData;
                        SurfaceKt.b(modifierA, null, 0L, 0L, null, coreElevation, ComposableLambdaKt.c(-1679590720, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionScreenKt$EditOrderConditionsScreen$3.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    Modifier modifierF = PaddingKt.f(SizeKt.e(Modifier.Companion.d, 1.0f), 16);
                                    String str = editOrderWarning.h;
                                    MutableState mutableState3 = mutableState2;
                                    boolean zBooleanValue = ((Boolean) mutableState3.getD()).booleanValue();
                                    composer3.o(-1633490746);
                                    Function0 function02 = function0;
                                    boolean zN = composer3.n(function02);
                                    Object objG3 = composer3.G();
                                    if (zN || objG3 == Composer.Companion.f1624a) {
                                        objG3 = new d(function02, mutableState3, 2);
                                        composer3.A(objG3);
                                    }
                                    composer3.l();
                                    PrimaryLoadingButtonKt.a(str, (Function0) objG3, zBooleanValue, modifierF, null, null, null, composer3, 3072, 496);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 30);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(-603939835, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionScreenKt$EditOrderConditionsScreen$4
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
            }, composerImplV), 0L, null, ComposableLambdaKt.c(-1325501364, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionScreenKt$EditOrderConditionsScreen$5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues paddingValues = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(paddingValues, "paddingValues");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(paddingValues) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        EditOrderConditionScreenKt.a(editOrderWarningData, paddingValues, composer2, (iIntValue << 3) & 112);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12586422, 112);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.d(editOrderWarningData, onBackButtonPressed, onButtonClick, flow, i, 24);
        }
    }
}
