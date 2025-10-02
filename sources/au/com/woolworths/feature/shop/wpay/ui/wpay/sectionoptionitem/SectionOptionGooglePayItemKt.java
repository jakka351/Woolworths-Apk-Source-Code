package au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
import au.com.woolworths.feature.shop.wpay.ui.wpay.PayingAmountKt;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionHeaderIconType;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionHeaderSelectionType;
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

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"wpay_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SectionOptionGooglePayItemKt {
    public static final void a(final PaymentMethodItem.GooglePay googlePay, final boolean z, final Function1 onUiEvent, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.h(onUiEvent, "onUiEvent");
        ComposerImpl composerImplV = composer.v(-1711505075);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(googlePay) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onUiEvent) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(12);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierB = BackgroundKt.b(ClipKt.a(companion, roundedCornerShapeB), CoreTheme.b(composerImplV).e.f4848a.c, RectangleShapeKt.f1779a);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-1746271574);
            int i5 = i3 & 896;
            int i6 = i3 & 112;
            boolean zI = (i5 == 256) | composerImplV.I(googlePay) | (i6 == 32);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                final int i7 = 0;
                objG = new Function0() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                onUiEvent.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.GooglePay.Select(googlePay.f, z));
                                break;
                            default:
                                onUiEvent.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.GooglePay.Select(googlePay.f, z));
                                break;
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            SectionOptionHeaderSelectionType.Radio radio = new SectionOptionHeaderSelectionType.Radio(z, true, (Function0) objG);
            SectionOptionHeaderIconType.Resource resource = new SectionOptionHeaderIconType.Resource(R.drawable.google_pay);
            String str = googlePay.f8306a;
            composerImplV.o(-1746271574);
            boolean zI2 = (i6 == 32) | (i5 == 256) | composerImplV.I(googlePay);
            Object objG2 = composerImplV.G();
            if (zI2 || objG2 == composer$Companion$Empty$1) {
                final int i8 = 1;
                objG2 = new Function0() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i8) {
                            case 0:
                                onUiEvent.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.GooglePay.Select(googlePay.f, z));
                                break;
                            default:
                                onUiEvent.invoke(new WPayForOrderContract.UiEvent.PaymentMethod.GooglePay.Select(googlePay.f, z));
                                break;
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier modifierD2 = ClickableKt.d(companion, false, null, null, (Function0) objG2, 7);
            modifier2 = companion;
            SectionOptionHeaderTileKt.a(radio, resource, str, null, modifierD2, null, composerImplV, 199680, 0);
            AnimatedVisibilityKt.c(ColumnScopeInstance.f948a, googlePay.b, null, EnterExitTransitionKt.d(AnimationSpecKt.e(200, 0, null, 6), 14), EnterExitTransitionKt.l(AnimationSpecKt.e(200, 0, null, 6), 14), null, ComposableLambdaKt.c(-1000404837, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionGooglePayItemKt$SectionOptionGooglePayItem$1$3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                    Composer composer2 = (Composer) obj2;
                    ((Number) obj3).intValue();
                    Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                    float f = 16;
                    Modifier.Companion companion2 = Modifier.Companion.d;
                    DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 6, 0L, composer2, PaddingKt.j(companion2, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14));
                    PaymentMethodItem.GooglePay googlePay2 = googlePay;
                    PayingAmountKt.a(googlePay2.c, googlePay2.d, PaddingKt.f(companion2, f), composer2, KyberEngine.KyberPolyBytes, 0);
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1600518, 18);
            composerImplV = composerImplV;
            composerImplV.V(true);
            SpacerKt.a(composerImplV, SizeKt.g(modifier2, 8));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.pullrefresh.a(googlePay, z, onUiEvent, modifier2, i, 10);
        }
    }
}
