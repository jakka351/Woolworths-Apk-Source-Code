package au.com.woolworths.foundation.rewards.offers.ui;

import android.graphics.Color;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.compose.productfinder.g;
import au.com.woolworths.feature.rewards.offers.ui.e;
import au.com.woolworths.feature.rewards.offers.ui.f;
import au.com.woolworths.foundation.rewards.common.ui.PulsingIndicatorColor;
import au.com.woolworths.foundation.rewards.common.ui.PulsingIndicatorKt;
import au.com.woolworths.foundation.rewards.offers.model.CircularProgressIndicator;
import au.com.woolworths.foundation.rewards.offers.model.CircularProgressRing;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsCta;
import au.com.woolworths.foundation.rewards.offers.model.OfferProgressTracker;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.foundation.rewards.offers.model.RewardsStatusIcon;
import au.com.woolworths.shared.ui.compose.StatefulButtonKt;
import au.com.woolworths.shared.ui.compose.rewards.ContentCtaButtonKt;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RewardsOfferTileKt {
    public static final void a(RewardsOfferData rewardsOfferData, StatefulButtonState statefulButtonState, Function2 function2, Modifier modifier, Function1 function1, Composer composer, int i) {
        Function2 function22;
        boolean z;
        boolean z2;
        ComposerImpl composerImplV = composer.v(1065502746);
        int i2 = i | (composerImplV.I(rewardsOfferData) ? 4 : 2) | (composerImplV.r(statefulButtonState.ordinal()) ? 32 : 16) | (composerImplV.I(function2) ? 256 : 128) | (composerImplV.n(modifier) ? 2048 : 1024) | (composerImplV.I(function1) ? 16384 : 8192);
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            function22 = function2;
        } else {
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
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
            Function2 function23 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicyD, function23);
            Function2 function24 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function24);
            Function2 function25 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function25);
            }
            Function2 function26 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function26);
            ContentCta contentCta = rewardsOfferData.y;
            RewardsOfferStatus rewardsOfferStatus = rewardsOfferData.n;
            OfferDetailsCta offerDetailsCta = rewardsOfferData.A;
            Modifier.Companion companion = Modifier.Companion.d;
            Object obj = Composer.Companion.f1624a;
            if (contentCta != null) {
                composerImplV.o(1650940515);
                Modifier modifierI = SizeKt.i(companion, Dimens.d, BitmapDescriptorFactory.HUE_RED, 2);
                composerImplV.o(-1746271574);
                boolean zI = ((i2 & 896) == 256) | composerImplV.I(rewardsOfferData) | composerImplV.I(contentCta);
                Object objG = composerImplV.G();
                if (zI || objG == obj) {
                    objG = new androidx.work.impl.utils.c(14, function2, rewardsOfferData, contentCta);
                    composerImplV.A(objG);
                }
                Function0 function02 = (Function0) objG;
                composerImplV.V(false);
                z = true;
                ContentCtaButtonKt.b(contentCta, function02, modifierI, false, composerImplV, KyberEngine.KyberPolyBytes, 8);
                composerImplV.V(false);
                function22 = function2;
            } else if (offerDetailsCta != null) {
                composerImplV.o(1651271719);
                RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
                int i4 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, rowMeasurePolicyA, function23);
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, function24);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                    androidx.camera.core.impl.b.B(i4, composerImplV, i4, function25);
                }
                Updater.b(composerImplV, modifierD2, function26);
                if (rewardsOfferStatus == RewardsOfferStatus.ACTIVATED) {
                    composerImplV.o(1178581019);
                    PulsingIndicatorColor pulsingIndicatorColor = PulsingIndicatorColor.e;
                    composerImplV.o(1849434622);
                    Object objG2 = composerImplV.G();
                    if (objG2 == obj) {
                        objG2 = new au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a(13);
                        composerImplV.A(objG2);
                    }
                    composerImplV.V(false);
                    PulsingIndicatorKt.a(pulsingIndicatorColor, SemanticsModifierKt.a(companion, (Function1) objG2), composerImplV, 6, 0);
                    SpacerKt.d(RowScopeInstance.f974a, 16, composerImplV, 54);
                    String label = offerDetailsCta.getCta().getLabel();
                    boolean zC = Intrinsics.c(offerDetailsCta.getCta().getIsExternalUrl(), Boolean.TRUE);
                    composerImplV.o(-1746271574);
                    boolean zI2 = ((i2 & 896) == 256) | composerImplV.I(rewardsOfferData) | composerImplV.I(offerDetailsCta);
                    Object objG3 = composerImplV.G();
                    if (zI2 || objG3 == obj) {
                        function22 = function2;
                        objG3 = new f(function22, rewardsOfferData, offerDetailsCta, 1);
                        composerImplV.A(objG3);
                    } else {
                        function22 = function2;
                    }
                    z2 = false;
                    composerImplV.V(false);
                    z = true;
                    OfferCtaButtonKt.a(0, 8, composerImplV, null, label, (Function0) objG3, zC);
                    composerImplV = composerImplV;
                    composerImplV.V(false);
                } else {
                    function22 = function2;
                    z = true;
                    composerImplV.o(1179204584);
                    Modifier modifierI2 = SizeKt.i(companion, Dimens.d, BitmapDescriptorFactory.HUE_RED, 2);
                    ContentCta cta = offerDetailsCta.getCta();
                    composerImplV.o(-1746271574);
                    boolean zI3 = ((i2 & 896) == 256) | composerImplV.I(rewardsOfferData) | composerImplV.I(offerDetailsCta);
                    Object objG4 = composerImplV.G();
                    if (zI3 || objG4 == obj) {
                        objG4 = new f(function22, rewardsOfferData, offerDetailsCta, 2);
                        composerImplV.A(objG4);
                    }
                    z2 = false;
                    composerImplV.V(false);
                    ContentCtaButtonKt.b(cta, (Function0) objG4, modifierI2, false, composerImplV, KyberEngine.KyberPolyBytes, 8);
                    composerImplV.V(false);
                }
                composerImplV.V(z);
                composerImplV.V(z2);
            } else {
                function22 = function2;
                z = true;
                if (rewardsOfferStatus == RewardsOfferStatus.NOT_ACTIVATED) {
                    composerImplV.o(1652507999);
                    Modifier modifierA = TestTagKt.a(SizeKt.i(SizeKt.u(companion, Dimens.c), Dimens.d, BitmapDescriptorFactory.HUE_RED, 2), "BoostButtonTag");
                    String str = rewardsOfferData.m;
                    composerImplV.o(-1633490746);
                    boolean zI4 = composerImplV.I(rewardsOfferData) | ((57344 & i2) == 16384);
                    Object objG5 = composerImplV.G();
                    if (zI4 || objG5 == obj) {
                        objG5 = new e(function1, rewardsOfferData, 2);
                        composerImplV.A(objG5);
                    }
                    composerImplV.V(false);
                    StatefulButtonKt.b(str, "", modifierA, statefulButtonState, 0L, (Function0) objG5, composerImplV, ((i2 << 6) & 7168) | 432, 16);
                    composerImplV = composerImplV;
                    composerImplV.V(false);
                } else {
                    composerImplV.o(1653023157);
                    TintableTextSpec tintableTextSpecC = RewardsOfferDataExtKt.c(rewardsOfferData, null, composerImplV, 1);
                    if (tintableTextSpecC != null) {
                        Modifier modifierB = BackgroundKt.b(ClipKt.a(SizeKt.i(companion, Dimens.d, BitmapDescriptorFactory.HUE_RED, 2), RoundedCornerShapeKt.b(4)), WxTheme.a(composerImplV).a(), RectangleShapeKt.f1779a);
                        composerImplV.o(1849434622);
                        Object objG6 = composerImplV.G();
                        if (objG6 == obj) {
                            objG6 = new au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a(10);
                            composerImplV.A(objG6);
                        }
                        composerImplV.V(false);
                        TintableTextKt.a(tintableTextSpecC, SemanticsModifierKt.a(modifierB, (Function1) objG6), composerImplV, 0);
                    }
                    composerImplV.V(false);
                }
            }
            composerImplV.V(z);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(rewardsOfferData, statefulButtonState, function22, modifier, function1, i, 10);
        }
    }

    public static final void b(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(564525745);
        if (((i | 6) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = RewardsOfferTileKt$BottomCenterAligned$1$1.f8627a;
                composerImplV.A(objG);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objG;
            composerImplV.V(false);
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
            Updater.b(composerImplV, measurePolicy, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            android.support.v4.media.session.a.y(6, composableLambdaImpl, composerImplV, true);
            modifier = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.b(modifier, i, 1, composableLambdaImpl);
        }
    }

    public static final void c(final RewardsOfferData rewardsOfferData, final StatefulButtonState statefulButtonState, final boolean z, final Function2 function2, final Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-382930958);
        if (((i | (composerImplV.I(rewardsOfferData) ? 4 : 2) | (composerImplV.r(statefulButtonState.ordinal()) ? 32 : 16) | (composerImplV.p(z) ? 256 : 128) | (composerImplV.I(function2) ? 2048 : 1024) | (composerImplV.I(function1) ? 16384 : 8192) | 196608) & 74899) == 74898 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            float f = 16;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierF = PaddingKt.f(companion, f);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            FlowLayoutKt.b(modifierF, null, Arrangement.g(f), null, 0, 0, ComposableLambdaKt.c(618363373, new Function3<FlowRowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferTileKt$BottomSection$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FlowRowScope FlowRow = (FlowRowScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(FlowRow, "$this$FlowRow");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(FlowRow) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier.Companion companion2 = Modifier.Companion.d;
                        Modifier modifierA = SizeKt.A(companion2, (3 & 1) != 0 ? Alignment.Companion.n : Alignment.Companion.o, false);
                        BiasAlignment.Vertical vertical = Alignment.Companion.k;
                        RewardsOfferTileKt.d(rewardsOfferData, z, FlowRow.b(modifierA, vertical), composer2, 0);
                        RewardsOfferTileKt.a(rewardsOfferData, statefulButtonState, function2, FlowRow.b(FlowRow.a(SizeKt.A(companion2, (3 & 1) != 0 ? Alignment.Companion.n : Alignment.Companion.o, false), 1.0f, true), vertical), function1, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1573248, 58);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.loadingbutton.a(rewardsOfferData, statefulButtonState, z, function2, function1, modifier2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public static final void d(RewardsOfferData rewardsOfferData, boolean z, Modifier modifier, Composer composer, int i) {
        Modifier modifierA;
        Function2 function2;
        List list;
        ?? r3;
        Function2 function22;
        Function2 function23;
        Function0 function0;
        Function2 function24;
        ComposerImpl composerImpl;
        ComposerImpl composerImpl2;
        ComposerImpl composerImplV = composer.v(283391566);
        if (((i | (composerImplV.I(rewardsOfferData) ? 4 : 2) | (composerImplV.p(z) ? 32 : 16) | (composerImplV.n(modifier) ? 256 : 128)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl2 = composerImplV;
        } else {
            composerImplV.o(1756361970);
            Modifier.Companion companion = Modifier.Companion.d;
            if (z) {
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                if (objG == Composer.Companion.f1624a) {
                    objG = new au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a(11);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                modifierA = SemanticsModifierKt.a(companion, (Function1) objG);
            } else {
                modifierA = companion;
            }
            composerImplV.V(false);
            Modifier modifierX0 = modifier.x0(modifierA);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.e, Alignment.Companion.m, composerImplV, 6);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierX0);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Function2 function25 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function25);
            Function2 function26 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function26);
            Function2 function27 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function27);
            }
            Function2 function28 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function28);
            OfferProgressTracker offerProgressTracker = rewardsOfferData.F;
            List list2 = rewardsOfferData.q;
            if (offerProgressTracker != null) {
                composerImplV.o(-909816841);
                OfferProgressTracker offerProgressTracker2 = rewardsOfferData.F;
                if (offerProgressTracker2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                g(offerProgressTracker2, composerImplV, 0);
                composerImplV.V(false);
                r3 = 0;
                function2 = function26;
                function23 = function28;
                function22 = function27;
                function0 = function02;
                function24 = function25;
                list = list2;
                composerImpl = composerImplV;
            } else {
                composerImplV.o(-909662523);
                function2 = function26;
                list = list2;
                r3 = 0;
                function22 = function27;
                function23 = function28;
                function0 = function02;
                function24 = function25;
                TextKt.b(rewardsOfferData.o, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, WxTheme.b(composerImplV).s, composerImplV, 0, 3120, 55294);
                ComposerImpl composerImpl3 = composerImplV;
                composerImpl3.V(false);
                composerImpl = composerImpl3;
            }
            composerImpl.o(1494684476);
            if (!list.isEmpty()) {
                SpacerKt.c(ColumnScopeInstance.f948a, 4, composerImpl, 54);
                RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImpl, r3);
                int i3 = composerImpl.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImpl.Q();
                Modifier modifierD2 = ComposedModifierKt.d(composerImpl, companion);
                composerImpl.i();
                if (composerImpl.O) {
                    composerImpl.K(function0);
                } else {
                    composerImpl.e();
                }
                Updater.b(composerImpl, rowMeasurePolicyA, function24);
                Updater.b(composerImpl, persistentCompositionLocalMapQ2, function2);
                if (composerImpl.O || !Intrinsics.c(composerImpl.G(), Integer.valueOf(i3))) {
                    androidx.camera.core.impl.b.B(i3, composerImpl, i3, function22);
                }
                Updater.b(composerImpl, modifierD2, function23);
                composerImpl.o(1554349939);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ImageKt.a(PainterResources_androidKt.a(RewardsCalendarIconExtKt.a(((RewardsStatusIcon) it.next()).getIcon()), r3, composerImpl), null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImpl, 48, 124);
                }
                composerImpl.V(r3);
                composerImpl.V(true);
            }
            composerImpl.V(r3);
            composerImpl.V(true);
            composerImpl2 = composerImpl;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(rewardsOfferData, z, modifier, i, 0);
        }
    }

    public static final void e(final RewardsOfferData rewardsOfferData, Modifier modifier, Composer composer, int i) {
        boolean z;
        Modifier.Companion companion;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-1368384625);
        if ((((composerImplV.I(rewardsOfferData) ? 4 : 2) | i | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion2);
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
            final Painter painterA = PainterResources_androidKt.a(com.woolworths.R.drawable.ic_rewards_brand_icon_error, 0, composerImplV);
            b(null, ComposableLambdaKt.c(-1022052779, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferTileKt$ImagerySection$1$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        RewardsOfferData rewardsOfferData2 = rewardsOfferData;
                        String str = rewardsOfferData2.e;
                        Modifier.Companion companion3 = Modifier.Companion.d;
                        AutoAdjustBackgroundHeaderImageKt.a(str, AspectRatioKt.a(companion3, 2.3333333f), PainterResources_androidKt.a(com.woolworths.R.drawable.ic_rewards_offer_tile_no_image_placeholder, 0, composer2), composer2, 48, 0);
                        float f = 16;
                        Modifier modifierE = SizeKt.e(PaddingKt.h(companion3, f, BitmapDescriptorFactory.HUE_RED, 2), 1.0f);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(f), Alignment.Companion.k, composer2, 54);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
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
                        Updater.b(composer2, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function22 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function22);
                        }
                        Updater.b(composer2, modifierD2, ComposeUiNode.Companion.d);
                        composer2.o(448471476);
                        if (rewardsOfferData2.v != null) {
                            SingletonAsyncImageKt.b(rewardsOfferData2.v, null, SizeKt.g(companion3, Dimens.b), null, painterA, null, null, null, null, null, null, null, composer2, 432, 0, 32744);
                        }
                        composer2.l();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 48);
            composerImplV.o(-128196191);
            if (rewardsOfferData.f != null) {
                Modifier modifierJ = PaddingKt.j(SizeKt.e(SizeKt.u(companion2, 116), 1.0f), BitmapDescriptorFactory.HUE_RED, 24, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                String str = rewardsOfferData.f;
                Painter painterA2 = PainterResources_androidKt.a(com.woolworths.R.drawable.ic_team_only, 0, composerImplV);
                composerImplV.o(-128185131);
                Painter painterA3 = ((Boolean) composerImplV.x(InspectionModeKt.f1972a)).booleanValue() ? PainterResources_androidKt.a(com.woolworths.R.drawable.ic_team_only, 0, composerImplV) : null;
                composerImplV.V(false);
                z = false;
                companion = companion2;
                SingletonAsyncImageKt.b(str, StringResources_androidKt.c(composerImplV, com.woolworths.R.string.rewards_offer_team_only_banner_content_description), modifierJ, painterA2, painterA3, null, null, null, null, Alignment.Companion.d, ContentScale.Companion.d, null, composerImplV, 805306752, 6, 31200);
            } else {
                z = false;
                companion = companion2;
            }
            composerImplV.V(z);
            composerImplV.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.b(rewardsOfferData, i, 2, modifier2);
        }
    }

    public static final void f(final float f, int i, Composer composer, ComposableLambdaImpl composableLambdaImpl, Modifier modifier) {
        ComposerImpl composerImplV = composer.v(1622000383);
        int i2 = (composerImplV.q(f) ? 4 : 2) | i | 48;
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(5004770);
            boolean z = (i2 & 14) == 4;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new MeasurePolicy() { // from class: au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferTileKt$IntrinsicMinHeightLayout$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult c(MeasureScope Layout, List measurables, long j) {
                        Intrinsics.h(Layout, "$this$Layout");
                        Intrinsics.h(measurables, "measurables");
                        List list = measurables;
                        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            long j2 = j;
                            arrayList.add(((Measurable) it.next()).c0(Constraints.a(j2, 0, 0, 0, 0, 11)));
                            j = j2;
                        }
                        long j3 = j;
                        Iterator it2 = arrayList.iterator();
                        int i3 = 0;
                        while (it2.hasNext()) {
                            i3 += ((Placeable) it2.next()).e;
                        }
                        int iMax = Math.max(i3, Layout.r1(f));
                        return Layout.L0(Constraints.h(j3), iMax, EmptyMap.d, new au.com.woolworths.feature.shop.homepage.presentation.rewards.c(arrayList, iMax, 1));
                    }
                };
                composerImplV.A(objG);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objG;
            composerImplV.V(false);
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
            Updater.b(composerImplV, measurePolicy, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            android.support.v4.media.session.a.y(6, composableLambdaImpl, composerImplV, true);
            modifier = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.b(f, i, composableLambdaImpl, modifier);
        }
    }

    public static final void g(final OfferProgressTracker offerProgressTracker, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1086859818);
        if ((((composerImplV.I(offerProgressTracker) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-1314849715, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferTileKt$ProgressTrackerSection$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer2, 48);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierD = ComposedModifierKt.d(composer2, companion);
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
                        Function2 function2 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, rowMeasurePolicyA, function2);
                        Function2 function22 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function22);
                        Function2 function23 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function24);
                        composer2.o(-740416423);
                        OfferProgressTracker offerProgressTracker2 = offerProgressTracker;
                        CircularProgressIndicator circularProgressIndicator = offerProgressTracker2.g;
                        String str = offerProgressTracker2.e;
                        CircularProgressRing circularProgressRing = circularProgressIndicator.d;
                        float f = (float) circularProgressRing.d;
                        Modifier modifierQ = SizeKt.q(companion, 36);
                        composer2.o(1849434622);
                        Object objG = composer2.G();
                        if (objG == Composer.Companion.f1624a) {
                            objG = new au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a(14);
                            composer2.A(objG);
                        }
                        composer2.l();
                        float f2 = 4;
                        ProgressIndicatorKt.a(f, TestTagKt.a(SemanticsModifierKt.a(modifierQ, (Function1) objG), "offer_tile_progress_row_ring"), ColorKt.b(Color.parseColor(circularProgressRing.e)), f2, CoreTheme.b(composer2).e.b.f4852a, 1, composer2, 3072, 0);
                        SpacerKt.d(RowScopeInstance.f974a, f2, composer2, 54);
                        composer2.l();
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, companion);
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
                        Updater.b(composer2, columnMeasurePolicyA, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            androidx.camera.core.impl.b.z(p2, composer2, p2, function23);
                        }
                        Updater.b(composer2, modifierD2, function24);
                        composer2.o(-1394942883);
                        AnnotatedString.Builder builder = new AnnotatedString.Builder();
                        SpanStyle spanStyle = CoreTheme.f(composer2).f5120a.b.b.f2068a;
                        FontStyle fontStyle = spanStyle.fontStyle;
                        int iL = builder.l(new SpanStyle(CoreTheme.b(composer2).e.d.d, spanStyle.fontSize, spanStyle.fontWeight, fontStyle, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65520));
                        try {
                            builder.e(offerProgressTracker2.d);
                            builder.i(iL);
                            composer2.o(-1394923991);
                            if (str != null) {
                                SpanStyle spanStyle2 = CoreTheme.f(composer2).b.f5125a.f5126a.f2068a;
                                FontStyle fontStyle2 = spanStyle2.fontStyle;
                                iL = builder.l(new SpanStyle(CoreTheme.b(composer2).e.d.d, spanStyle2.fontSize, spanStyle2.fontWeight, fontStyle2, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65520));
                                try {
                                    builder.d.append((CharSequence) str);
                                } finally {
                                }
                            }
                            composer2.l();
                            AnnotatedString annotatedStringM = builder.m();
                            composer2.l();
                            TextKt.c(annotatedStringM, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, 0, 0, 262142);
                            TextKt.b(offerProgressTracker2.f, null, CoreTheme.b(composer2).e.d.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer2).b.f5125a.b, composer2, 0, 0, 65530);
                            composer2.f();
                            composer2.f();
                        } finally {
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.homepage.presentation.marketplace.a(i, 17, offerProgressTracker);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(final au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData r21, final au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState r22, final kotlin.jvm.functions.Function1 r23, final kotlin.jvm.functions.Function2 r24, final kotlin.jvm.functions.Function1 r25, androidx.compose.ui.Modifier r26, float r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferTileKt.h(au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData, au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, float, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void i(int i, Composer composer, Modifier modifier, String str) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(296023050);
        int i2 = 4;
        int i3 = (composerImplV.n(str) ? 4 : 2) | i;
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            float f = ((Density) composerImplV.x(CompositionLocalsKt.h)).getF();
            if (f < 1.5f) {
                i2 = 3;
            } else if (f >= 2.0f) {
                i2 = 5;
            }
            composerImpl = composerImplV;
            TextKt.b(str, modifier, WxTheme.a(composerImplV).f(), 0L, null, 0L, null, null, 0L, 2, false, i2, 0, null, WxTheme.b(composerImplV).n, composerImpl, i3 & 126, 48, 55288);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.badge.a(str, modifier, i, 12);
        }
    }

    public static final void j(RewardsOfferData rewardsOfferData, boolean z, Modifier modifier, Composer composer, int i) {
        Modifier modifierA;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-1494558318);
        if ((((composerImplV.I(rewardsOfferData) ? 4 : 2) | i | (composerImplV.p(z) ? 32 : 16) | KyberEngine.KyberPolyBytes) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierH = PaddingKt.h(companion, 16, BitmapDescriptorFactory.HUE_RED, 2);
            composerImplV.o(-1751457066);
            if (z) {
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                if (objG == Composer.Companion.f1624a) {
                    objG = new au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a(12);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                modifierA = SemanticsModifierKt.a(companion, (Function1) objG);
            } else {
                modifierA = companion;
            }
            composerImplV.V(false);
            Modifier modifierX0 = modifierH.x0(modifierA);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierX0);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
            SpacerKt.c(columnScopeInstance, 12, composerImplV, 54);
            k(0, composerImplV, null, rewardsOfferData.g);
            String str = rewardsOfferData.i;
            composerImplV.o(1410255775);
            if (str != null) {
                float f = 4;
                SpacerKt.c(columnScopeInstance, f, composerImplV, 54);
                i(48, composerImplV, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), str);
            }
            composerImplV.V(false);
            composerImplV.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(rewardsOfferData, z, modifier2, i, 1);
        }
    }

    public static final void k(int i, Composer composer, Modifier modifier, String str) {
        ComposerImpl composerImpl;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(166446104);
        int i2 = 2;
        int i3 = (composerImplV.n(str) ? 4 : 2) | i | 48;
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            modifier2 = modifier;
        } else {
            float f = ((Density) composerImplV.x(CompositionLocalsKt.h)).getF();
            if (f < 1.5f) {
                i2 = 1;
            } else if (f >= 2.0f) {
                i2 = 3;
            }
            int i4 = i2;
            composerImpl = composerImplV;
            modifier2 = Modifier.Companion.d;
            TextKt.b(str, modifier2, 0L, 0L, null, 0L, null, null, 0L, 2, false, i4, 0, null, WxTheme.b(composerImplV).i, composerImpl, i3 & 126, 48, 55292);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.badge.a(str, modifier2, i, 13);
        }
    }
}
