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
import au.com.woolworths.feature.product.list.v2.ui.g;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
import au.com.woolworths.feature.shop.wpay.ui.wpay.PayingAmountKt;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionHeaderIconType;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionHeaderSelectionType;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"wpay_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SectionOptionLinkedPayPalItemKt {
    public static final void a(final PaymentMethodItem.PayPal.Linked linked, boolean z, Function0 onItemSelected, Function0 onDeleteClicked, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.h(onItemSelected, "onItemSelected");
        Intrinsics.h(onDeleteClicked, "onDeleteClicked");
        ComposerImpl composerImplV = composer.v(863081444);
        int i2 = i | (composerImplV.n(linked) ? 4 : 2) | (composerImplV.p(z) ? 32 : 16) | (composerImplV.I(onItemSelected) ? 256 : 128) | (composerImplV.I(onDeleteClicked) ? 2048 : 1024) | 24576;
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(12);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierB = BackgroundKt.b(ClipKt.a(companion, roundedCornerShapeB), CoreTheme.b(composerImplV).e.f4848a.c, RectangleShapeKt.f1779a);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
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
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            SectionOptionHeaderTileKt.a(new SectionOptionHeaderSelectionType.Radio(z, true, onItemSelected), new SectionOptionHeaderIconType.ImageUrl(linked.b, R.drawable.paypal), linked.c, null, ClickableKt.d(companion, false, null, null, onItemSelected, 7), onDeleteClicked, composerImplV, (458752 & (i2 << 6)) | 3072, 0);
            AnimatedVisibilityKt.c(ColumnScopeInstance.f948a, linked.d, null, EnterExitTransitionKt.d(AnimationSpecKt.e(200, 0, null, 6), 14), EnterExitTransitionKt.l(AnimationSpecKt.e(200, 0, null, 6), 14), null, ComposableLambdaKt.c(1060494166, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionLinkedPayPalItemKt$SectionOptionLinkedPayPalItem$1$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                    Composer composer2 = (Composer) obj2;
                    ((Number) obj3).intValue();
                    Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                    float f = 16;
                    Modifier.Companion companion2 = Modifier.Companion.d;
                    DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 6, 0L, composer2, PaddingKt.j(companion2, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14));
                    PaymentMethodItem.PayPal.Linked linked2 = linked;
                    PayingAmountKt.a(linked2.e, linked2.f, PaddingKt.f(companion2, f), composer2, KyberEngine.KyberPolyBytes, 0);
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1600518, 18);
            composerImplV = composerImplV;
            composerImplV.V(true);
            SpacerKt.a(composerImplV, SizeKt.g(companion, 8));
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(linked, z, onItemSelected, onDeleteClicked, modifier2, i, 4);
        }
    }
}
