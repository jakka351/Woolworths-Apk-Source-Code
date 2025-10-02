package au.com.woolworths.feature.shop.voc.score;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnLayoutRectChangedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.button.SecondaryButtonKt;
import au.com.woolworths.design.wx.component.button.TertiaryButtonKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.compose.errorscreen.c;
import au.com.woolworths.feature.rewards.account.preferences.g;
import au.com.woolworths.feature.rewards.offers.listpage.ui.e;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.f;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.k;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.l;
import au.com.woolworths.feature.shop.recipes.recipes.list.b;
import au.com.woolworths.feature.shop.voc.data.SurveyData;
import au.com.woolworths.feature.shop.voc.data.VocSurveyData;
import au.com.woolworths.feature.shop.voc.score.VocContract;
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
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003¨\u0006\u0005²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0004\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "transitionComplete", "", "overlayAlpha", "isPressed", "voc_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class VocSurveyCardKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8237a;

        static {
            int[] iArr = new int[ButtonStyleApiData.values().length];
            try {
                iArr[ButtonStyleApiData.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonStyleApiData.TERTIARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8237a = iArr;
        }
    }

    public static final void a(String str, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1299943385);
        int i2 = i | (composerImplV.n(str) ? 4 : 2);
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            TextStyle textStyle = WxTheme.b(composerImplV).r;
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new b(13);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            float f = 20;
            composerImpl = composerImplV;
            TextKt.b(str, PaddingKt.j(SizeKt.e(SemanticsModifierKt.b(Modifier.Companion.d, false, (Function1) objG), 1.0f), f, 8, f, BitmapDescriptorFactory.HUE_RED, 8), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, textStyle, composerImpl, i2 & 14, 0, 65020);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.corerow.impl.b(str, i, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0198  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(au.com.woolworths.feature.shop.voc.score.VocContract.ViewState r18, kotlin.jvm.functions.Function0 r19, androidx.compose.runtime.Composer r20, int r21) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.voc.score.VocSurveyCardKt.b(au.com.woolworths.feature.shop.voc.score.VocContract$ViewState, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    public static final void c(String str, String str2, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-134183038);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(str2) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            TextStyle textStyle = WxTheme.b(composerImplV).m;
            Modifier modifierH = PaddingKt.h(SizeKt.e(Modifier.Companion.d, 1.0f), 20, BitmapDescriptorFactory.HUE_RED, 2);
            composerImplV.o(5004770);
            boolean z = (i2 & 112) == 32;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.a(str2, 14);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            TextKt.b(str, SemanticsModifierKt.b(modifierH, false, (Function1) objG), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, textStyle, composerImpl, i2 & 14, 0, 65020);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(str, str2, i, 2);
        }
    }

    public static final void d(VocContract.ViewState viewState, Function0 function0, Function3 function3, Composer composer, int i) {
        int i2;
        String str;
        VocSurveyData vocSurveyData;
        VocSurveyData vocSurveyData2;
        ComposerImpl composerImplV = composer.v(568582107);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function3) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean z = viewState.d;
            SurveyData surveyData = viewState.h;
            Modifier.Companion companion = Modifier.Companion.d;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z) {
                composerImplV.o(-721200642);
                label = surveyData != null ? surveyData.c : null;
                str = label != null ? label : "";
                Modifier modifierE = SizeKt.e(companion, 1.0f);
                composerImplV.o(5004770);
                boolean z2 = (i2 & 112) == 32;
                Object objG = composerImplV.G();
                if (z2 || objG == composer$Companion$Empty$1) {
                    objG = new k(10, function0);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                SecondaryButtonKt.b(str, (Function0) objG, modifierE, true, false, null, null, composerImplV, 3456, 112);
                composerImplV.V(false);
            } else if (viewState.e) {
                composerImplV.o(946576045);
                ButtonStyleApiData style = (surveyData == null || (vocSurveyData2 = surveyData.f) == null) ? null : vocSurveyData2.d.getStyle();
                if (surveyData != null && (vocSurveyData = surveyData.f) != null) {
                    label = vocSurveyData.d.getLabel();
                }
                str = label != null ? label : "";
                composerImplV.o(-1633490746);
                boolean zI = composerImplV.I(viewState) | ((i2 & 896) == 256);
                Object objG2 = composerImplV.G();
                if (zI || objG2 == composer$Companion$Empty$1) {
                    objG2 = new f(17, function3, viewState);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                i(style, str, (Function0) objG2, SizeKt.e(companion, 1.0f), composerImplV, 3072);
                composerImplV.V(false);
            } else {
                composerImplV.o(-720398393);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(i, 1, viewState, function0, function3, false);
        }
    }

    public static final void e(Function0 function0, Composer composer, int i) {
        Function0 function02;
        ComposerImpl composerImplV = composer.v(1301346278);
        int i2 = (composerImplV.I(function0) ? 32 : 16) | i;
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function02 = function0;
        } else {
            function02 = function0;
            IconButtonKt.c(CloseKt.a(), StringResources_androidKt.c(composerImplV, R.string.content_description_close_button), function02, BoxScopeInstance.f944a.g(SizeKt.q(PaddingKt.f(Modifier.Companion.d, 4), 32), Alignment.Companion.c), false, WxTheme.a(composerImplV).f(), composerImplV, (i2 << 3) & 896, 16);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.account.authentication.ui.b(i, 3, function02);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(au.com.woolworths.feature.shop.voc.score.VocContract.ViewState r19, kotlin.jvm.functions.Function0 r20, kotlin.jvm.functions.Function1 r21, kotlin.jvm.functions.Function0 r22, kotlin.jvm.functions.Function3 r23, androidx.compose.runtime.Composer r24, int r25) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.voc.score.VocSurveyCardKt.f(au.com.woolworths.feature.shop.voc.score.VocContract$ViewState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int):void");
    }

    public static final void g(int i, Composer composer, Function1 onPickScore) {
        Intrinsics.h(onPickScore, "onPickScore");
        ComposerImpl composerImplV = composer.v(508351004);
        int i2 = (composerImplV.I(onPickScore) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierE);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicyD, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Modifier modifierG = BoxScopeInstance.f944a.g(companion, Alignment.Companion.e);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(2), Alignment.Companion.j, composerImplV, 6);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierG);
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
            Updater.b(composerImplV, modifierD2, function24);
            composerImplV.o(-749160526);
            int i5 = 0;
            while (true) {
                if (i5 >= 11) {
                    break;
                }
                String strValueOf = String.valueOf(i5);
                composerImplV.o(-1633490746);
                boolean zR = ((i2 & 14) == 4) | composerImplV.r(i5);
                Object objG = composerImplV.G();
                if (zR || objG == Composer.Companion.f1624a) {
                    objG = new au.com.woolworths.design.core.ui.component.experimental.segmentedbuttons.b(i5, 3, onPickScore);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                h(strValueOf, (Function0) objG, composerImplV, 0);
                i5++;
            }
            android.support.v4.media.session.a.C(composerImplV, false, true, true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(i, 7, onPickScore);
        }
    }

    public static final void h(final String pointLabel, Function0 function0, Composer composer, int i) {
        long jH;
        long jE;
        Intrinsics.h(pointLabel, "pointLabel");
        ComposerImpl composerImplV = composer.v(1263266907);
        int i2 = (composerImplV.n(pointLabel) ? 4 : 2) | i | (composerImplV.I(function0) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = InteractionSourceKt.a();
                composerImplV.A(objG);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objG;
            composerImplV.V(false);
            MutableState mutableStateA = PressInteractionKt.a(mutableInteractionSource, composerImplV);
            if (((Boolean) mutableStateA.getD()).booleanValue()) {
                composerImplV.o(-1476236510);
                jH = WxTheme.a(composerImplV).h();
            } else {
                composerImplV.o(-1476237659);
                jH = WxTheme.a(composerImplV).a();
            }
            composerImplV.V(false);
            if (((Boolean) mutableStateA.getD()).booleanValue()) {
                composerImplV.o(-1476233143);
                jE = WxTheme.a(composerImplV).e();
            } else {
                composerImplV.o(-1476234206);
                jE = WxTheme.a(composerImplV).h();
            }
            composerImplV.V(false);
            composerImplV.o(-1476231848);
            float fB = ((Density) composerImplV.x(CompositionLocalsKt.h)).B((int) (((WindowInfo) composerImplV.x(CompositionLocalsKt.t)).a() >> 32));
            composerImplV.V(false);
            float f = ((fB - 64) - 20) / 11;
            final long j = jE;
            ButtonColors buttonColorsC = ButtonDefaults.c(jH, 0L, 0L, composerImplV, 6);
            BorderStroke borderStrokeA = BorderStrokeKt.a(WxTheme.a(composerImplV).h(), 1);
            Modifier modifierR = SizeKt.r(Modifier.Companion.d, f, (float) (f / 0.65d));
            float f2 = 0;
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f2, f2, f2, f2);
            composerImplV.o(5004770);
            boolean z = (i2 & 112) == 32;
            Object objG2 = composerImplV.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                objG2 = new k(11, function0);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(1787535256, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.voc.score.VocSurveyCardKt$NpsPoint$3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    RowScope TextButton = (RowScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(TextButton, "$this$TextButton");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        TextKt.b(pointLabel, null, j, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, WxTheme.b(composer2).j, composer2, 0, 3072, 57338);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV);
            composerImplV = composerImplV;
            ButtonKt.c((Function0) objG2, modifierR, false, mutableInteractionSource, null, borderStrokeA, buttonColorsC, paddingValuesImpl, composableLambdaImplC, composerImplV, 905972736, 52);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.wx.component.dialog.c(i, 2, pointLabel, function0);
        }
    }

    public static final void i(ButtonStyleApiData buttonStyleApiData, String str, Function0 function0, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(911255144);
        int i2 = i | (composerImplV.r(buttonStyleApiData == null ? -1 : buttonStyleApiData.ordinal()) ? 4 : 2) | (composerImplV.n(str) ? 32 : 16) | (composerImplV.I(function0) ? 256 : 128);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            int i3 = buttonStyleApiData != null ? WhenMappings.f8237a[buttonStyleApiData.ordinal()] : -1;
            if (i3 == 1) {
                composerImplV.o(-457127595);
                int i4 = i2 >> 3;
                PrimaryButtonKt.a(str, function0, modifier, true, false, null, null, null, null, composerImplV, (i4 & 112) | (i4 & 14) | 3072 | KyberEngine.KyberPolyBytes, 1008);
                composerImplV = composerImplV;
                composerImplV.V(false);
            } else if (i3 != 2) {
                composerImplV.o(-457115049);
                int i5 = i2 >> 3;
                SecondaryButtonKt.b(str, function0, modifier, true, false, null, null, composerImplV, (i5 & 112) | (i5 & 14) | 3072 | KyberEngine.KyberPolyBytes, 112);
                composerImplV.V(false);
            } else {
                composerImplV.o(-457121770);
                int i6 = i2 >> 3;
                TertiaryButtonKt.a(str, function0, modifier, true, false, null, null, composerImplV, (i6 & 112) | (i6 & 14) | 3072 | KyberEngine.KyberPolyBytes, 112);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a((Object) buttonStyleApiData, (Object) str, function0, modifier, i, 21);
        }
    }

    public static final void j(final VocContract.ViewState viewState, Modifier modifier, Function1 function1, Function0 function0, Function3 function3, Function0 function02, Function1 function12, Composer composer, int i, int i2) {
        Function1 function13;
        int i3;
        Function0 function03;
        int i4;
        Function3 function32;
        int i5;
        Function0 function04;
        int i6;
        Function1 function14;
        int i7;
        final Function3 function33;
        final Function0 function05;
        Modifier modifier2;
        Function0 function06;
        Function3 function34;
        Function0 function07;
        Intrinsics.h(viewState, "viewState");
        ComposerImpl composerImplV = composer.v(1251840797);
        int i8 = i | (composerImplV.I(viewState) ? 4 : 2);
        int i9 = i8 | 48;
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 = i8 | 432;
            function13 = function1;
        } else {
            function13 = function1;
            i3 = i9 | (composerImplV.I(function13) ? 256 : 128);
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i4 = i3 | 3072;
            function03 = function0;
        } else {
            function03 = function0;
            i4 = i3 | (composerImplV.I(function03) ? 2048 : 1024);
        }
        int i12 = i2 & 16;
        if (i12 != 0) {
            i5 = i4 | 24576;
            function32 = function3;
        } else {
            function32 = function3;
            i5 = i4 | (composerImplV.I(function32) ? 16384 : 8192);
        }
        int i13 = i2 & 32;
        if (i13 != 0) {
            i6 = i5 | 196608;
            function04 = function02;
        } else {
            function04 = function02;
            i6 = i5 | (composerImplV.I(function04) ? 131072 : 65536);
        }
        int i14 = i2 & 64;
        if (i14 != 0) {
            i7 = i6 | 1572864;
            function14 = function12;
        } else {
            function14 = function12;
            i7 = i6 | (composerImplV.I(function14) ? 1048576 : 524288);
        }
        if ((i7 & 599187) == 599186 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            function06 = function03;
            function34 = function32;
            function07 = function04;
        } else {
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (i10 != 0) {
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                if (objG == composer$Companion$Empty$1) {
                    objG = new l(22);
                    composerImplV.A(objG);
                }
                function13 = (Function1) objG;
                composerImplV.V(false);
            }
            if (i11 != 0) {
                composerImplV.o(1849434622);
                Object objG2 = composerImplV.G();
                if (objG2 == composer$Companion$Empty$1) {
                    objG2 = new h(20);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                function03 = (Function0) objG2;
            }
            if (i12 != 0) {
                composerImplV.o(1849434622);
                Object objG3 = composerImplV.G();
                if (objG3 == composer$Companion$Empty$1) {
                    objG3 = new androidx.camera.core.processing.concurrent.b(4);
                    composerImplV.A(objG3);
                }
                function33 = (Function3) objG3;
                composerImplV.V(false);
            } else {
                function33 = function32;
            }
            if (i13 != 0) {
                composerImplV.o(1849434622);
                Object objG4 = composerImplV.G();
                if (objG4 == composer$Companion$Empty$1) {
                    objG4 = new h(20);
                    composerImplV.A(objG4);
                }
                function05 = (Function0) objG4;
                composerImplV.V(false);
            } else {
                function05 = function04;
            }
            if (i14 != 0) {
                composerImplV.o(1849434622);
                Object objG5 = composerImplV.G();
                if (objG5 == composer$Companion$Empty$1) {
                    objG5 = new l(22);
                    composerImplV.A(objG5);
                }
                composerImplV.V(false);
                function14 = (Function1) objG5;
            }
            composerImplV.o(1849434622);
            Object objG6 = composerImplV.G();
            if (objG6 == composer$Companion$Empty$1) {
                objG6 = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG6);
            }
            MutableState mutableState = (MutableState) objG6;
            composerImplV.V(false);
            final State stateB = AnimateAsStateKt.b(((Boolean) mutableState.getD()).booleanValue() ? BitmapDescriptorFactory.HUE_RED : 1.0f, AnimationSpecKt.e(200, 0, EasingKt.d, 2), "overlay_alpha", null, composerImplV, 3072, 20);
            composerImplV.o(5004770);
            Object objG7 = composerImplV.G();
            if (objG7 == composer$Companion$Empty$1) {
                objG7 = new e(mutableState, 6);
                composerImplV.A(objG7);
            }
            final Function0 function08 = (Function0) objG7;
            composerImplV.V(false);
            float f = 4;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierF = PaddingKt.f(companion, 16);
            composerImplV.o(5004770);
            boolean z = (i7 & 3670016) == 1048576;
            Object objG8 = composerImplV.G();
            if (z || objG8 == composer$Companion$Empty$1) {
                objG8 = new au.com.woolworths.feature.shop.contentpage.ui.c(22, function14);
                composerImplV.A(objG8);
            }
            composerImplV.V(false);
            Modifier modifierA = OnLayoutRectChangedModifierKt.a(modifierF, (Function1) objG8);
            final Function1 function15 = function13;
            final Function0 function09 = function03;
            function13 = function15;
            CardKt.a(modifierA, null, 0L, 0L, null, f, ComposableLambdaKt.c(-1812788838, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.voc.score.VocSurveyCardKt$VocSurveyCard$7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        BiasAlignment biasAlignment = Alignment.Companion.f1719a;
                        MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, Modifier.Companion.d);
                        ComposeUiNode.e3.getClass();
                        Function0 function010 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function010);
                        } else {
                            composer2.e();
                        }
                        Function2 function2 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, measurePolicyD, function2);
                        Function2 function22 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function22);
                        Function2 function23 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function24);
                        VocContract.ViewState viewState2 = viewState;
                        VocSurveyCardKt.f(viewState2, function08, function15, function09, function33, composer2, 48);
                        composer2.o(1579832822);
                        composer2.o(1579832662);
                        boolean z2 = viewState2.e && !((Boolean) composer2.x(InspectionModeKt.f1972a)).booleanValue();
                        composer2.l();
                        if (z2) {
                            Modifier modifierB = BackgroundKt.b(GraphicsLayerModifierKt.b(BoxScopeInstance.f944a.i(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ((Number) stateB.getD()).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, false, 131067), Color.f, RectangleShapeKt.f1779a);
                            MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
                            int p2 = composer2.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                            Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierB);
                            if (composer2.w() == null) {
                                ComposablesKt.b();
                                throw null;
                            }
                            composer2.i();
                            if (composer2.getO()) {
                                composer2.K(function010);
                            } else {
                                composer2.e();
                            }
                            Updater.b(composer2, measurePolicyD2, function2);
                            Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                                androidx.camera.core.impl.b.z(p2, composer2, p2, function23);
                            }
                            Updater.b(composer2, modifierD2, function24);
                            composer2.f();
                        }
                        composer2.l();
                        VocSurveyCardKt.e(function05, composer2, 6);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1769472, 30);
            modifier2 = companion;
            function06 = function09;
            function34 = function33;
            function07 = function05;
        }
        Function1 function16 = function13;
        Function1 function17 = function14;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.dialog.b(viewState, modifier2, function16, function06, function34, function07, function17, i, i2);
        }
    }
}
