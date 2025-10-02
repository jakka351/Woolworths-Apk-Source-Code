package au.com.woolworths.feature.shop.homepage.presentation.deliverynowbanner;

import android.content.Context;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.WoolworthsColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.feature.shop.editorder.review.components.c;
import au.com.woolworths.feature.shop.homepage.data.DeliveryNowBottomBanner;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.CachePolicy;
import coil3.request.ImageRequest;
import coil3.request.ImageRequestsKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"homepage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DeliveryNowBannerKt {

    /* renamed from: a, reason: collision with root package name */
    public static final DeliveryNowBottomBanner f7248a = new DeliveryNowBottomBanner("", "Delivery Now", "Get it in 1-2 hours", null, null, null, null);

    public static final void a(final DeliveryNowBottomBanner deliveryNowBottomBanner, final Function0 function0, final Function0 function02, Composer composer, final int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1714528738);
        int i2 = (composerImplV.I(deliveryNowBottomBanner) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function02) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            if (deliveryNowBottomBanner == null) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    final int i3 = 0;
                    recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.shop.homepage.presentation.deliverynowbanner.a
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    DeliveryNowBannerKt.a(deliveryNowBottomBanner, function0, function02, composer2, RecomposeScopeImplKt.a(i | 1));
                                    break;
                                default:
                                    DeliveryNowBannerKt.a(deliveryNowBottomBanner, function0, function02, composer2, RecomposeScopeImplKt.a(i | 1));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierX = SizeKt.x(SizeKt.e(companion, 1.0f), Alignment.Companion.k, false);
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(deliveryNowBottomBanner);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new l(deliveryNowBottomBanner, 26);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifierX, true, (Function1) objG);
            composerImplV.o(5004770);
            boolean z = (i2 & 112) == 32;
            Object objG2 = composerImplV.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.design.core.ui.component.experimental.dialog.a(28, function0);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier modifierD = ClickableKt.d(modifierB, false, null, null, (Function0) objG2, 7);
            BiasAlignment biasAlignment = Alignment.Companion.f1719a;
            MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierD);
            ComposeUiNode.e3.getClass();
            Function0 function03 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicyD, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                b.B(i4, composerImplV, i4, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD2, function24);
            float f = 16;
            Modifier modifierJ = PaddingKt.j(BackgroundKt.b(SizeKt.b(SizeKt.e(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 32, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 1.0f), BitmapDescriptorFactory.HUE_RED, PrimitiveResources_androidKt.a(composerImplV, R.dimen.homepage_delivery_now_padding_height), 1), WoolworthsColors.c, RoundedCornerShapeKt.d(f, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12)), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 7);
            MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierJ);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            Modifier modifierQ = SizeKt.q(PaddingKt.f(companion, f), f);
            BiasAlignment biasAlignment2 = Alignment.Companion.c;
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f944a;
            Modifier modifierA = AlphaKt.a(boxScopeInstance.g(modifierQ, biasAlignment2), 0.5f);
            composerImplV.o(1849434622);
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = new c(11);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            Modifier modifierB2 = SemanticsModifierKt.b(modifierA, true, (Function1) objG3);
            composerImplV.o(5004770);
            boolean z2 = (i2 & 896) == 256;
            Object objG4 = composerImplV.G();
            if (z2 || objG4 == composer$Companion$Empty$1) {
                objG4 = new com.woolworths.scanlibrary.util.exceptions.b(1, function02);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            Modifier modifierD4 = ClickableKt.d(modifierB2, false, null, null, (Function0) objG4, 7);
            String strC = StringResources_androidKt.c(composerImplV, R.string.close_button);
            ImageVector imageVectorA = CloseKt.a();
            long j = Color.f;
            IconKt.b(imageVectorA, strC, modifierD4, j, composerImplV, 3072, 0);
            Modifier modifierJ2 = PaddingKt.j(SizeKt.z(companion, null, 3), BitmapDescriptorFactory.HUE_RED, 28, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            BiasAlignment biasAlignment3 = Alignment.Companion.b;
            Modifier modifierG = boxScopeInstance.g(modifierJ2, biasAlignment3);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD5 = ComposedModifierKt.d(composerImplV, modifierG);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                b.B(i6, composerImplV, i6, function23);
            }
            Object objF = au.com.woolworths.android.onesite.a.f(composerImplV, modifierD5, function24, 1849434622);
            if (objF == composer$Companion$Empty$1) {
                objF = new c(12);
                composerImplV.A(objF);
            }
            composerImplV.V(false);
            TextKt.b(deliveryNowBottomBanner.e, TestTagKt.a(SizeKt.z(SemanticsModifierKt.a(companion, (Function1) objF), null, 3), deliveryNowBottomBanner.e), j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).p, composerImplV, KyberEngine.KyberPolyBytes, 0, 65528);
            composerImplV.o(1849434622);
            Object objG5 = composerImplV.G();
            if (objG5 == composer$Companion$Empty$1) {
                objG5 = new c(13);
                composerImplV.A(objG5);
            }
            composerImplV.V(false);
            TextKt.b(deliveryNowBottomBanner.f, PaddingKt.j(SizeKt.z(TestTagKt.a(SemanticsModifierKt.a(companion, (Function1) objG5), deliveryNowBottomBanner.f), null, 3), 4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, KyberEngine.KyberPolyBytes, 0, 65528);
            composerImplV.V(true);
            composerImplV.V(true);
            Painter painterA = PainterResources_androidKt.a(R.drawable.ic_delivery_now_banner_pulse, 0, composerImplV);
            Modifier modifierG2 = boxScopeInstance.g(SizeKt.z(companion, null, 3), biasAlignment3);
            ImageRequest.Builder builder = new ImageRequest.Builder((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b));
            DownloadableAsset downloadableAsset = deliveryNowBottomBanner.h;
            builder.c = downloadableAsset != null ? downloadableAsset.getAssetUrl() : null;
            ImageRequestsKt.a(builder);
            builder.j = CachePolicy.g;
            SingletonAsyncImageKt.b(builder.a(), null, modifierG2, painterA, painterA, null, null, null, null, null, ContentScale.Companion.e, null, composerImplV, 48, 6, 31712);
            composerImpl = composerImplV;
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImpl.X();
        if (recomposeScopeImplX2 != null) {
            final int i7 = 1;
            recomposeScopeImplX2.d = new Function2() { // from class: au.com.woolworths.feature.shop.homepage.presentation.deliverynowbanner.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i7;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            DeliveryNowBannerKt.a(deliveryNowBottomBanner, function0, function02, composer2, RecomposeScopeImplKt.a(i | 1));
                            break;
                        default:
                            DeliveryNowBannerKt.a(deliveryNowBottomBanner, function0, function02, composer2, RecomposeScopeImplKt.a(i | 1));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }
}
