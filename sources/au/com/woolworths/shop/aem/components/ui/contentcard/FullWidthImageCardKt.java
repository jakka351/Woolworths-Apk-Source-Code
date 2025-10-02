package au.com.woolworths.shop.aem.components.ui.contentcard;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.h;
import au.com.woolworths.product.details.d;
import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthImageCardData;
import au.com.woolworths.shop.aem.components.ui.ImagePlaceholderHelperKt;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class FullWidthImageCardKt {
    public static final void a(FullWidthImageCardData fullWidthImageCardData, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-696312024);
        int i2 = (composerImplV.n(fullWidthImageCardData) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.shop.aem.components.ui.chatentrycard.b(15);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifier, true, (Function1) objG);
            composerImplV.o(5004770);
            boolean z = (i2 & 14) == 4;
            Object objG2 = composerImplV.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                objG2 = new d(fullWidthImageCardData, 7);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier modifierA = SemanticsModifierKt.a(modifierB, (Function1) objG2);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            float f = 8;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(f), Alignment.Companion.m, composerImplV, 6);
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Painter painterA = ImagePlaceholderHelperKt.a(BitmapDescriptorFactory.HUE_RED, 0, 3, composerImplV);
            String str = fullWidthImageCardData.b;
            Modifier.Companion companion = Modifier.Companion.d;
            SingletonAsyncImageKt.b(str, null, BackgroundKt.b(ClipKt.a(AspectRatioKt.a(SizeKt.e(companion, 1.0f), 1.0f), RoundedCornerShapeKt.b(f)), ToneColors.i, RectangleShapeKt.f1779a), null, painterA, painterA, null, null, null, null, ContentScale.Companion.b, null, composerImplV, 48, 6, 31688);
            composerImpl = composerImplV;
            composerImpl.o(1513022869);
            String str2 = fullWidthImageCardData.d;
            if (str2 != null && str2.length() != 0) {
                TextKt.b(fullWidthImageCardData.d, SizeKt.e(companion, 1.0f), 0L, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, WxTheme.b(composerImpl).m, composerImpl, 48, 3120, 55292);
                composerImpl = composerImpl;
            }
            composerImpl.V(false);
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new h(fullWidthImageCardData, i, 25, modifier);
        }
    }
}
