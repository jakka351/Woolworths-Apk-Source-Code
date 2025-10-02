package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import coil3.compose.SubcomposeAsyncImageScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OrderProofOfDeliveryDetailsItemKt {
    public static final void a(String str, String str2, InsetBannerData insetBannerData, Function0 onImageLoaded, Function0 onBannerLoaded, Function0 onExpandClicked, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        boolean z;
        Intrinsics.h(onImageLoaded, "onImageLoaded");
        Intrinsics.h(onBannerLoaded, "onBannerLoaded");
        Intrinsics.h(onExpandClicked, "onExpandClicked");
        ComposerImpl composerImplV = composer.v(867969121);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(insetBannerData) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onImageLoaded) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(onBannerLoaded) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(onExpandClicked) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            float fA = PrimitiveResources_androidKt.a(composerImplV, R.dimen.default_padding);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierF = PaddingKt.f(companion, fA);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
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
            TextKt.b(str, PaddingKt.h(companion, BitmapDescriptorFactory.HUE_RED, 8, 1), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).y, composerImplV, (i2 & 14) | 48, 0, 65532);
            composerImpl = composerImplV;
            SpacerKt.a(composerImpl, SizeKt.g(companion, 16));
            if ((str2 == null || str2.length() == 0) && insetBannerData != null) {
                composerImpl.o(-1122031949);
                composerImpl.o(1849434622);
                Object objG = composerImpl.G();
                if (objG == Composer.Companion.f1624a) {
                    objG = new l(2);
                    composerImpl.A(objG);
                }
                composerImpl.V(false);
                z = true;
                InsetBannerUiKt.b(insetBannerData, null, false, (Function1) objG, composerImpl, ((i2 >> 6) & 14) | 24576, 14);
                onBannerLoaded.invoke();
                composerImpl.V(false);
            } else {
                z = true;
                composerImpl.o(-1121861418);
                b(str, str2, onImageLoaded, onExpandClicked, composerImpl, (i2 & 126) | ((i2 >> 3) & 896) | ((i2 >> 6) & 7168));
                composerImpl.V(false);
            }
            composerImpl.V(z);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.tag.d(str, str2, insetBannerData, onImageLoaded, onBannerLoaded, onExpandClicked, i, 8);
        }
    }

    public static final void b(String str, String str2, Function0 function0, final Function0 function02, Composer composer, int i) {
        int i2;
        Object obj;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-984978272);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            obj = str2;
            i2 |= composerImplV.n(obj) ? 32 : 16;
        } else {
            obj = str2;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function02) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG);
            }
            final MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierA = ClipKt.a(SizeKt.g(SizeKt.e(companion, 1.0f), 200), RoundedCornerShapeKt.b(8));
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
            ComposeUiNode.e3.getClass();
            Function0 function03 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier modifierB = BackgroundKt.b(SizeKt.c, ToneColors.i, RectangleShapeKt.f1779a);
            ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(1347359981, new Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Loading, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderProofOfDeliveryDetailsItemKt$ProofOfDeliveryImage$1$1
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj2;
                    AsyncImagePainter.State.Loading it = (AsyncImagePainter.State.Loading) obj3;
                    Composer composer2 = (Composer) obj4;
                    int iIntValue = ((Number) obj5).intValue();
                    Intrinsics.h(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 129) == 128 && composer2.c()) {
                        composer2.j();
                    } else {
                        mutableState.setValue(Boolean.FALSE);
                        MeasurePolicy measurePolicyD2 = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier.Companion companion2 = Modifier.Companion.d;
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, companion2);
                        ComposeUiNode.e3.getClass();
                        Function0 function04 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function04);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, measurePolicyD2, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function22 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function22);
                        }
                        Updater.b(composer2, modifierD2, ComposeUiNode.Companion.d);
                        ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 28, WxTheme.a(composer2).f(), 0L, composer2, BoxScopeInstance.f944a.g(companion2, Alignment.Companion.e));
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV);
            ComposableLambdaImpl composableLambdaImplC2 = ComposableLambdaKt.c(2019889443, new Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Error, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderProofOfDeliveryDetailsItemKt$ProofOfDeliveryImage$1$2
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj2;
                    AsyncImagePainter.State.Error it = (AsyncImagePainter.State.Error) obj3;
                    Composer composer2 = (Composer) obj4;
                    int iIntValue = ((Number) obj5).intValue();
                    Intrinsics.h(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 129) == 128 && composer2.c()) {
                        composer2.j();
                    } else {
                        mutableState.setValue(Boolean.FALSE);
                        MeasurePolicy measurePolicyD2 = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier.Companion companion2 = Modifier.Companion.d;
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, companion2);
                        ComposeUiNode.e3.getClass();
                        Function0 function04 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function04);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, measurePolicyD2, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function22 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function22);
                        }
                        Updater.b(composer2, modifierD2, ComposeUiNode.Companion.d);
                        ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_image_load_failed, 0, composer2), null, BoxScopeInstance.f944a.g(companion2, Alignment.Companion.e), null, null, BitmapDescriptorFactory.HUE_RED, null, composer2, 48, 120);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV);
            composerImplV.o(-1633490746);
            boolean z = (i2 & 896) == 256;
            Object objG2 = composerImplV.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                objG2 = new m(mutableState, function0, 0);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            SingletonSubcomposeAsyncImageKt.b(obj, str, modifierB, composableLambdaImplC, composableLambdaImplC2, (Function1) objG2, ContentScale.Companion.f1880a, composerImplV, ((i2 << 3) & 112) | ((i2 >> 3) & 14) | 1597440, 48, 63144);
            AnimatedVisibilityKt.d(((Boolean) mutableState.getD()).booleanValue(), BoxScopeInstance.f944a.g(companion, Alignment.Companion.i), null, null, null, ComposableLambdaKt.c(-296819970, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderProofOfDeliveryDetailsItemKt$ProofOfDeliveryImage$1$4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj2;
                    Composer composer2 = (Composer) obj3;
                    ((Number) obj4).intValue();
                    Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                    IconButtonKt.b(PainterResources_androidKt.a(R.drawable.ic_btn_fullscreen, 0, composer2), "expand image", function02, BackgroundKt.b(ClipKt.a(PaddingKt.f(Modifier.Companion.d, 8), RoundedCornerShapeKt.f1100a), Color.f, RectangleShapeKt.f1779a), false, WxTheme.a(composer2).h(), composer2, 48, 16);
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 196608, 28);
            composerImpl = composerImplV;
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new n(str, str2, function0, function02, i, 0);
        }
    }
}
