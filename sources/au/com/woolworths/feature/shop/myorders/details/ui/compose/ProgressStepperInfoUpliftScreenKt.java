package au.com.woolworths.feature.shop.myorders.details.ui.compose;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec;
import au.com.woolworths.design.core.ui.component.stable.corerow.SimpleRowKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c;
import au.com.woolworths.feature.shop.myorders.details.models.StepsToolTip;
import au.com.woolworths.feature.shop.myorders.details.models.ToolTipStepInfo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProgressStepperInfoUpliftScreenKt {
    public static final void a(final StepsToolTip stepsToolTip, final Function0 onUpClicked, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.h(stepsToolTip, "stepsToolTip");
        Intrinsics.h(onUpClicked, "onUpClicked");
        ComposerImpl composerImplV = composer.v(-864292625);
        int i2 = i | (composerImplV.I(stepsToolTip) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onUpClicked) ? 32 : 16;
        }
        if (((i2 | KyberEngine.KyberPolyBytes) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            ScaffoldKt.a(SizeKt.c, ComposableLambdaKt.c(-667382093, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.ProgressStepperInfoUpliftScreenKt$ProgressStepperInfoUpliftScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC = StringResources_androidKt.c(composer2, R.string.order_tracking);
                        long j = CoreTheme.b(composer2).e.f4848a.c;
                        CoreElevation coreElevation = CoreTheme.c(composer2).f4876a;
                        final Function0 function0 = onUpClicked;
                        TopNavBarKt.a(strC, null, j, 0L, 0L, null, coreElevation, ComposableLambdaKt.c(-1851083611, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.ProgressStepperInfoUpliftScreenKt$ProgressStepperInfoUpliftScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(ArrowBackKt.a(), StringResources_androidKt.c(composer3, R.string.content_description_back_button), function0, null, false, null, CoreTheme.b(composer3).e.c.f4854a, composer3, 0, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 100663296, 630);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0L, null, ComposableLambdaKt.c(-88712772, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.ProgressStepperInfoUpliftScreenKt$ProgressStepperInfoUpliftScreen$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues padding = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(padding, "padding");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(padding) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierX0 = PaddingKt.e(companion, padding).x0(SizeKt.c);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierX0);
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
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        Modifier modifierF = PaddingKt.f(companion, 16);
                        StepsToolTip stepsToolTip2 = stepsToolTip;
                        Modifier.Companion companion2 = companion;
                        TextKt.b(stepsToolTip2.d, modifierF, CoreTheme.b(composer2).e.c.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer2).f5120a.b.f5123a, composer2, 0, 0, 65528);
                        composer2.o(820772200);
                        for (ToolTipStepInfo toolTipStepInfo : stepsToolTip2.e) {
                            String str = toolTipStepInfo.g;
                            String str2 = toolTipStepInfo.h;
                            String str3 = toolTipStepInfo.i;
                            if (str3 == null) {
                                str3 = "";
                            }
                            CoreRowSpec.Image.RemoteImage remoteImage = new CoreRowSpec.Image.RemoteImage(str3, null, CoreRowSpec.ImageSize.b, 2);
                            Modifier.Companion companion3 = companion2;
                            Modifier modifierH = PaddingKt.h(companion3, 8, BitmapDescriptorFactory.HUE_RED, 2);
                            composer2.o(1849434622);
                            Object objG = composer2.G();
                            if (objG == Composer.Companion.f1624a) {
                                objG = new h(20);
                                composer2.A(objG);
                            }
                            composer2.l();
                            SimpleRowKt.a(str, (Function0) objG, modifierH, str2, null, remoteImage, null, null, null, composer2, 262192, 464);
                            companion2 = companion3;
                        }
                        composer2.l();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12582960, 124);
            modifier2 = Modifier.Companion.d;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(stepsToolTip, onUpClicked, modifier2, i, 21);
        }
    }
}
