package au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui;

import android.content.Context;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import au.com.woolworths.android.onesite.extensions.IntExtKt;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.design.wx.foundation.RewardsColors;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelKt;
import au.com.woolworths.shared.ui.compose.price.PriceLabelKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "cardTopPadding", "everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SubscribePlanItemUiKt {

    /* renamed from: a, reason: collision with root package name */
    public static final long f6079a = ColorKt.d(4294963173L);
    public static final /* synthetic */ int b = 0;

    public static final void a(boolean z, String str, String str2, int i, BrandLabel brandLabel, final boolean z2, Function0 onPlanItemSelect, Modifier modifier, Composer composer, int i2) {
        Object cVar;
        Function2 function2;
        Modifier.Companion companion;
        final String str3;
        final int i3;
        final String str4;
        ComposerImpl composerImpl;
        boolean z3;
        boolean z4;
        Intrinsics.h(onPlanItemSelect, "onPlanItemSelect");
        ComposerImpl composerImplV = composer.v(-767151466);
        int i4 = i2 | (composerImplV.p(z) ? 4 : 2) | (composerImplV.n(str) ? 32 : 16) | (composerImplV.n(str2) ? 256 : 128) | (composerImplV.r(i) ? 2048 : 1024) | (composerImplV.I(brandLabel) ? 16384 : 8192) | (composerImplV.p(z2) ? 131072 : 65536) | (composerImplV.I(onPlanItemSelect) ? 1048576 : 524288) | (composerImplV.n(modifier) ? 8388608 : 4194304);
        if ((4793491 & i4) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function22 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicyD, function22);
            Function2 function23 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function23);
            Function2 function24 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function24);
            }
            Function2 function25 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function25);
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            Density density = (Density) composerImplV.x(CompositionLocalsKt.h);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = SnapshotStateKt.f(new Dp(0));
                composerImplV.A(objG);
            }
            MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(SizeKt.e(companion2, 1.0f), BitmapDescriptorFactory.HUE_RED, ((Dp) mutableState.getD()).d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            composerImplV.o(5004770);
            boolean z5 = (3670016 & i4) == 1048576;
            Object objG2 = composerImplV.G();
            if (z5 || objG2 == obj) {
                objG2 = new au.com.woolworths.design.core.ui.component.experimental.dialog.a(14, onPlanItemSelect);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier modifierD2 = ClickableKt.d(modifierJ, false, null, null, (Function0) objG2, 7);
            composerImplV.o(-1224400529);
            boolean zI = ((i4 & 112) == 32) | ((i4 & 7168) == 2048) | ((i4 & 896) == 256) | composerImplV.I(brandLabel) | composerImplV.I(context);
            Object objG3 = composerImplV.G();
            if (zI || objG3 == obj) {
                function2 = function23;
                companion = companion2;
                str3 = str;
                cVar = new c(str3, i, str2, brandLabel, context);
                i3 = i;
                str4 = str2;
                composerImplV.A(cVar);
            } else {
                str3 = str;
                cVar = objG3;
                function2 = function23;
                companion = companion2;
                i3 = i;
                str4 = str2;
            }
            composerImplV.V(false);
            Modifier modifierA = SemanticsModifierKt.a(modifierD2, (Function1) cVar);
            composerImplV.o(2041801145);
            long jA = z ? f6079a : WxTheme.a(composerImplV).a();
            composerImplV.V(false);
            CardKt.a(modifierA, null, jA, 0L, BorderStrokeKt.a(z ? RewardsColors.b : ToneColors.j, 2), BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(468621, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.SubscribePlanItemUiKt$SubscribePlanItemUi$1$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    if ((((Number) obj3).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier.Companion companion3 = Modifier.Companion.d;
                        Modifier modifierG = PaddingKt.g(SizeKt.e(companion3, 1.0f), 16, 24);
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer2, 48);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD3 = ComposedModifierKt.d(composer2, modifierG);
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
                        Function2 function26 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, rowMeasurePolicyA, function26);
                        Function2 function27 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function27);
                        Function2 function28 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function28);
                        }
                        Function2 function29 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD3, function29);
                        Modifier modifierA2 = RowScopeInstance.f974a.a(companion3, 1.0f, true);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD4 = ComposedModifierKt.d(composer2, modifierA2);
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
                        Updater.b(composer2, columnMeasurePolicyA, function26);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function27);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            androidx.camera.core.impl.b.z(p2, composer2, p2, function28);
                        }
                        Updater.b(composer2, modifierD4, function29);
                        TextKt.b(str3, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).k, composer2, 0, 0, 65534);
                        SpacerKt.c(ColumnScopeInstance.f948a, 4, composer2, 54);
                        TextKt.b(str4, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).l, composer2, 0, 0, 65534);
                        composer2.f();
                        int i6 = i3;
                        PriceLabelKt.a(null, null, IntExtKt.b(i6), z2 ? IntExtKt.a(i6) : "", null, 0L, composer2, 0, 51);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1572864, 42);
            composerImplV.o(2041842813);
            if (brandLabel == null) {
                composerImpl = composerImplV;
                z4 = true;
                z3 = false;
            } else {
                Modifier.Companion companion3 = companion;
                Modifier modifierH = PaddingKt.h(SizeKt.e(companion3, 1.0f), 16, BitmapDescriptorFactory.HUE_RED, 2);
                composerImplV.o(1849434622);
                Object objG4 = composerImplV.G();
                if (objG4 == obj) {
                    objG4 = new au.com.woolworths.feature.rewards.account.closeaccount.ui.d(16);
                    composerImplV.A(objG4);
                }
                composerImplV.V(false);
                Modifier modifierA2 = SemanticsModifierKt.a(modifierH, (Function1) objG4);
                MeasurePolicy measurePolicyD2 = BoxKt.d(Alignment.Companion.c, false);
                int i6 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierA2);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD2, function22);
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, function2);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                    androidx.camera.core.impl.b.B(i6, composerImplV, i6, function24);
                }
                Updater.b(composerImplV, modifierD3, function25);
                composerImplV.o(-1633490746);
                boolean zN = composerImplV.n(density);
                Object objG5 = composerImplV.G();
                if (zN || objG5 == obj) {
                    objG5 = new d(density, mutableState, 0);
                    composerImplV.A(objG5);
                }
                composerImplV.V(false);
                composerImpl = composerImplV;
                z3 = false;
                BrandLabelKt.a(brandLabel, false, true, OnGloballyPositionedModifierKt.a(companion3, (Function1) objG5), false, composerImpl, 432, 16);
                z4 = true;
                composerImpl.V(true);
            }
            composerImpl.V(z3);
            composerImpl.V(z4);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.legacy.compose.a(z, str, str2, i, brandLabel, z2, onPlanItemSelect, modifier, i2);
        }
    }
}
