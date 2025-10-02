package au.com.woolworths.shop.cart.ui.productalternative;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.outlined.InfoKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.work.impl.utils.c;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.button.TertiaryButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.account.closeaccount.ui.f;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import au.com.woolworths.product.composeui.ProductCardHorizontalUiKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.shop.cart.domain.model.PageResult;
import au.com.woolworths.shop.cart.domain.model.ProductReviewAlternativeResponseData;
import au.com.woolworths.shop.cart.domain.model.ProductReviewAlternativeResponseInfoData;
import au.com.woolworths.shop.cart.ui.productreview.BorderModifierKt;
import au.com.woolworths.shop.cart.ui.productreview.LoadingScreenKt;
import au.com.woolworths.shop.cart.ui.shared.InfoModalKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductReviewAlternativeScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v8, types: [androidx.compose.runtime.ComposerImpl] */
    /* JADX WARN: Type inference failed for: r12v9, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.ComposerImpl] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v18, types: [androidx.compose.runtime.internal.ComposableLambdaImpl] */
    public static final void a(ProductReviewAlternativeResponseData productReviewAlternativeResponseData, final ProductsReviewAlternativeCallbacks productsReviewAlternativeCallbacks, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        float f;
        int i2;
        BiasAlignment.Vertical vertical;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        Modifier.Companion companion;
        ?? r2;
        ?? r12;
        boolean z;
        ComposerImpl composerImpl;
        ComposerImpl composerImpl2;
        ComposableLambdaImpl composableLambdaImpl2;
        final ProductReviewAlternativeResponseData productReviewAlternativeResponseData2 = productReviewAlternativeResponseData;
        ComposerImpl composerImplV = composer.v(2122801076);
        int i3 = i | (composerImplV.I(productReviewAlternativeResponseData2) ? 4 : 2) | (composerImplV.n(productsReviewAlternativeCallbacks) ? 32 : 16);
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composableLambdaImpl2 = composableLambdaImpl;
            composerImpl2 = composerImplV;
        } else {
            productsReviewAlternativeCallbacks.q5(productReviewAlternativeResponseData2.h);
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierB = ScrollKt.b(SizeKt.c(companion2, 1.0f), ScrollKt.a(composerImplV), true);
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
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            float f2 = 16;
            Modifier modifierG = PaddingKt.g(SizeKt.e(companion2, 1.0f), f2, 6);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            BiasAlignment.Vertical vertical2 = Alignment.Companion.j;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$1, vertical2, composerImplV, 0);
            int i5 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            boolean z2 = true;
            CardKt.a(null, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(-1770323753, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeScreenKt$ProductReviewAlternative$1$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        TargetProductKt.a(productReviewAlternativeResponseData2.f10441a, null, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1572864, 63);
            composerImplV.V(true);
            Modifier modifierE = SizeKt.e(PaddingKt.i(companion2, f2, 20, 12, 8), 1.0f);
            String str = productReviewAlternativeResponseData.c;
            composerImplV.o(-1633490746);
            int i6 = i3 & 112;
            boolean zI = (i6 == 32) | composerImplV.I(productReviewAlternativeResponseData);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$12) {
                objG = new au.com.woolworths.sdui.common.alert.a(23, productsReviewAlternativeCallbacks, productReviewAlternativeResponseData);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            SearchButtonKt.a(str, (Function0) objG, modifierE, composerImplV, KyberEngine.KyberPolyBytes, 0);
            String str2 = productReviewAlternativeResponseData.d;
            composerImplV.o(-1314424284);
            if (str2 == null) {
                companion = companion2;
                productReviewAlternativeResponseData2 = productReviewAlternativeResponseData;
                i2 = i6;
                r2 = 0;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                f = f2;
                vertical = vertical2;
                r12 = composerImplV;
            } else {
                Modifier modifierG2 = PaddingKt.g(SizeKt.e(companion2, 1.0f), f2, f2);
                RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(arrangement$Start$1, vertical2, composerImplV, 0);
                int i7 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
                Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierG2);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, rowMeasurePolicyA2, function2);
                Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                    androidx.camera.core.impl.b.B(i7, composerImplV, i7, function23);
                }
                Updater.b(composerImplV, modifierD3, function24);
                productReviewAlternativeResponseData2 = productReviewAlternativeResponseData;
                f = f2;
                i2 = i6;
                vertical = vertical2;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                companion = companion2;
                r2 = 0;
                TextKt.b(str2, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, 0, 0, 65534);
                ComposerImpl composerImpl3 = composerImplV;
                composerImpl3.V(true);
                r12 = composerImpl3;
            }
            r12.V(r2);
            r12.o(-1314411413);
            ?? r122 = r12;
            for (final ProductCard productCard : productReviewAlternativeResponseData2.b) {
                Modifier.Companion companion3 = companion;
                Modifier modifierA = BorderModifierKt.a(SizeKt.e(companion3, 1.0f), ToneColors.j, BitmapDescriptorFactory.HUE_RED, 126);
                BiasAlignment.Vertical vertical3 = vertical;
                RowMeasurePolicy rowMeasurePolicyA3 = RowKt.a(Arrangement.f934a, vertical3, r122, r2);
                int i8 = r122.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = r122.Q();
                Modifier modifierD4 = ComposedModifierKt.d(r122, modifierA);
                ComposeUiNode.e3.getClass();
                Function0 function02 = ComposeUiNode.Companion.b;
                r122.i();
                if (r122.O) {
                    r122.K(function02);
                } else {
                    r122.e();
                }
                Updater.b(r122, rowMeasurePolicyA3, ComposeUiNode.Companion.g);
                Updater.b(r122, persistentCompositionLocalMapQ4, ComposeUiNode.Companion.f);
                Function2 function25 = ComposeUiNode.Companion.j;
                if (r122.O || !Intrinsics.c(r122.G(), Integer.valueOf(i8))) {
                    androidx.camera.core.impl.b.B(i8, r122, i8, function25);
                }
                Updater.b(r122, modifierD4, ComposeUiNode.Companion.d);
                float f3 = f;
                ComposerImpl composerImpl4 = r122;
                ProductCardHorizontalUiKt.a(productCard, true, true, PaddingKt.f(companion3, f3), false, false, false, null, false, false, false, false, false, false, null, null, null, ComposableLambdaKt.c(-1149666364, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeScreenKt$ProductReviewAlternative$1$4$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            Modifier modifierW = SizeKt.w(Modifier.Companion.d, 120, BitmapDescriptorFactory.HUE_RED, 2);
                            ProductCard productCard2 = productCard;
                            ProductTrolleyData trolley = productCard2.getTrolley();
                            String buttonLabel = trolley != null ? trolley.getButtonLabel() : null;
                            composer2.o(-1022775882);
                            if (buttonLabel == null) {
                                buttonLabel = StringResources_androidKt.c(composer2, R.string.product_review_alternative_replace_button);
                            }
                            String str3 = buttonLabel;
                            composer2.l();
                            composer2.o(-1746271574);
                            Object obj3 = productsReviewAlternativeCallbacks;
                            boolean zI2 = composer2.I(obj3);
                            Object obj4 = productReviewAlternativeResponseData2;
                            boolean zI3 = zI2 | composer2.I(obj4) | composer2.I(productCard2);
                            Object objG2 = composer2.G();
                            if (zI3 || objG2 == Composer.Companion.f1624a) {
                                objG2 = new c(22, obj3, obj4, productCard2);
                                composer2.A(objG2);
                            }
                            composer2.l();
                            PrimaryButtonKt.a(str3, (Function0) objG2, modifierW, false, false, null, null, null, null, composer2, KyberEngine.KyberPolyBytes, 1016);
                        }
                        return Unit.f24250a;
                    }
                }, r122), composerImpl4, ProductCard.$stable | 3504, 12582912, 131056);
                ComposerImpl composerImpl5 = composerImpl4;
                composerImpl5.V(true);
                f = f3;
                companion = companion3;
                vertical = vertical3;
                r122 = composerImpl5;
            }
            Modifier.Companion companion4 = companion;
            float f4 = f;
            BiasAlignment.Vertical vertical4 = vertical;
            r122.V(r2);
            String str3 = productReviewAlternativeResponseData2.e;
            r122.o(-1314370489);
            if (str3 == null) {
                z = r2;
                composerImpl = r122;
            } else {
                RowMeasurePolicy rowMeasurePolicyA4 = RowKt.a(Arrangement.f934a, vertical4, r122, r2);
                int i9 = r122.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ5 = r122.Q();
                Modifier modifierD5 = ComposedModifierKt.d(r122, companion4);
                ComposeUiNode.e3.getClass();
                Function0 function03 = ComposeUiNode.Companion.b;
                r122.i();
                if (r122.O) {
                    r122.K(function03);
                } else {
                    r122.e();
                }
                Function2 function26 = ComposeUiNode.Companion.g;
                Updater.b(r122, rowMeasurePolicyA4, function26);
                Function2 function27 = ComposeUiNode.Companion.f;
                Updater.b(r122, persistentCompositionLocalMapQ5, function27);
                Function2 function28 = ComposeUiNode.Companion.j;
                if (r122.O || !Intrinsics.c(r122.G(), Integer.valueOf(i9))) {
                    androidx.camera.core.impl.b.B(i9, r122, i9, function28);
                }
                Function2 function29 = ComposeUiNode.Companion.d;
                Updater.b(r122, modifierD5, function29);
                Modifier modifierH = PaddingKt.h(SizeKt.e(companion4, 1.0f), f4, BitmapDescriptorFactory.HUE_RED, 2);
                ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(Arrangement.c, Alignment.Companion.n, r122, 48);
                int i10 = r122.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ6 = r122.Q();
                Modifier modifierD6 = ComposedModifierKt.d(r122, modifierH);
                r122.i();
                if (r122.O) {
                    r122.K(function03);
                } else {
                    r122.e();
                }
                Updater.b(r122, columnMeasurePolicyA2, function26);
                Updater.b(r122, persistentCompositionLocalMapQ6, function27);
                if (r122.O || !Intrinsics.c(r122.G(), Integer.valueOf(i10))) {
                    androidx.camera.core.impl.b.B(i10, r122, i10, function28);
                }
                Updater.b(r122, modifierD6, function29);
                SpacerKt.a(r122, SizeKt.g(companion4, 32));
                ComposerImpl composerImpl6 = r122;
                TextKt.b(str3, PaddingKt.j(companion4, BitmapDescriptorFactory.HUE_RED, 4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), WxTheme.a(r122).f(), 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, TextStyle.a(WxTheme.b(r122).l, 0L, 0L, null, null, 0L, 0L, null, null, LineBreak.a(LineBreak.b), 14680063), composerImpl6, 48, 0, 65016);
                ComposerImpl composerImpl7 = composerImpl6;
                SpacerKt.a(composerImpl7, SizeKt.g(companion4, f4));
                String str4 = productReviewAlternativeResponseData2.f;
                composerImpl7.o(1215978593);
                if (str4 == null) {
                    z = false;
                } else {
                    composerImpl7.o(5004770);
                    boolean z3 = i2 == 32;
                    Object objG2 = composerImpl7.G();
                    if (z3 || objG2 == composer$Companion$Empty$1) {
                        z = false;
                        objG2 = new ProductReviewAlternativeScreenKt$ProductReviewAlternative$1$5$1$1$1$1$1(0, productsReviewAlternativeCallbacks, ProductsReviewAlternativeCallbacks.class, "onRetryLoad", "onRetryLoad()V", 0);
                        composerImpl7.A(objG2);
                    } else {
                        z = false;
                    }
                    composerImpl7.V(z);
                    TertiaryButtonKt.a(str4, (Function0) ((KFunction) objG2), null, false, false, null, null, composerImpl7, 0, 124);
                }
                z2 = true;
                android.support.v4.media.session.a.C(composerImpl7, z, true, true);
                composerImpl = composerImpl7;
            }
            composerImpl.V(z);
            ?? r3 = composableLambdaImpl;
            r3.invoke(composerImpl, 6);
            composerImpl.V(z2);
            composableLambdaImpl2 = r3;
            composerImpl2 = composerImpl;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.marketplace.ui.personalised.b(productReviewAlternativeResponseData2, productsReviewAlternativeCallbacks, composableLambdaImpl2, i, 24);
        }
    }

    public static final void b(final boolean z, final boolean z2, final PageResult productAlternativeReview, final ProductsReviewAlternativeCallbacks callbacks, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        Intrinsics.h(productAlternativeReview, "productAlternativeReview");
        Intrinsics.h(callbacks, "callbacks");
        ComposerImpl composerImplV = composer.v(1419967934);
        if ((i & 6) == 0) {
            i2 = i | (composerImplV.p(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z2) ? 32 : 16;
        }
        if (((i2 | (composerImplV.n(productAlternativeReview) ? 256 : 128) | (composerImplV.n(callbacks) ? 2048 : 1024)) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImpl = composerImplV;
            ScaffoldKt.a(SizeKt.c, null, ComposableLambdaKt.c(838327193, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeScreenKt$ProductReviewAlternativeScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final ProductsReviewAlternativeCallbacks productsReviewAlternativeCallbacks = callbacks;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-1360640792, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeScreenKt$ProductReviewAlternativeScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ImageVector imageVectorA = ArrowBackKt.a();
                                    composer3.o(5004770);
                                    ProductsReviewAlternativeCallbacks productsReviewAlternativeCallbacks2 = productsReviewAlternativeCallbacks;
                                    boolean zI = composer3.I(productsReviewAlternativeCallbacks2);
                                    Object objG = composer3.G();
                                    if (zI || objG == Composer.Companion.f1624a) {
                                        ProductReviewAlternativeScreenKt$ProductReviewAlternativeScreen$1$1$1$1 productReviewAlternativeScreenKt$ProductReviewAlternativeScreen$1$1$1$1 = new ProductReviewAlternativeScreenKt$ProductReviewAlternativeScreen$1$1$1$1(0, productsReviewAlternativeCallbacks2, ProductsReviewAlternativeCallbacks.class, "onBackButtonPressed", "onBackButtonPressed()V", 0);
                                        composer3.A(productReviewAlternativeScreenKt$ProductReviewAlternativeScreen$1$1$1$1);
                                        objG = productReviewAlternativeScreenKt$ProductReviewAlternativeScreen$1$1$1$1;
                                    }
                                    composer3.l();
                                    IconButtonKt.c(imageVectorA, "Back", (Function0) ((KFunction) objG), null, false, 0L, composer3, 48, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final PageResult pageResult = productAlternativeReview;
                        TopNavBarKt.b(StringResources_androidKt.c(composer2, R.string.product_review_alternative_title), null, null, null, 0L, 0L, 0L, null, 0, composableLambdaImplC, ComposableLambdaKt.c(399540622, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeScreenKt$ProductReviewAlternativeScreen$1.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                RowScope TopNavBar = (RowScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(TopNavBar, "$this$TopNavBar");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    PageResult pageResult2 = pageResult;
                                    if (pageResult2 instanceof PageResult.Success) {
                                        ImageVector imageVectorD = InfoKt.f1370a;
                                        if (imageVectorD == null) {
                                            ImageVector.Builder builder = new ImageVector.Builder("Outlined.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                            int i3 = VectorKt.f1820a;
                                            SolidColor solidColor = new SolidColor(Color.b);
                                            PathBuilder pathBuilder = new PathBuilder();
                                            pathBuilder.i(11.0f, 7.0f);
                                            pathBuilder.f(2.0f);
                                            pathBuilder.m(2.0f);
                                            pathBuilder.f(-2.0f);
                                            pathBuilder.a();
                                            pathBuilder.i(11.0f, 11.0f);
                                            pathBuilder.f(2.0f);
                                            pathBuilder.m(6.0f);
                                            pathBuilder.f(-2.0f);
                                            pathBuilder.a();
                                            pathBuilder.i(12.0f, 2.0f);
                                            pathBuilder.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                                            pathBuilder.k(4.48f, 10.0f, 10.0f, 10.0f);
                                            pathBuilder.k(10.0f, -4.48f, 10.0f, -10.0f);
                                            pathBuilder.j(17.52f, 2.0f, 12.0f, 2.0f);
                                            pathBuilder.a();
                                            pathBuilder.i(12.0f, 20.0f);
                                            pathBuilder.c(-4.41f, BitmapDescriptorFactory.HUE_RED, -8.0f, -3.59f, -8.0f, -8.0f);
                                            pathBuilder.k(3.59f, -8.0f, 8.0f, -8.0f);
                                            pathBuilder.k(8.0f, 3.59f, 8.0f, 8.0f);
                                            pathBuilder.k(-3.59f, 8.0f, -8.0f, 8.0f);
                                            pathBuilder.a();
                                            builder.b((14420 & 16) != 0 ? 1.0f : 1.0f, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 0, 0, 2, solidColor, (14420 & 32) != 0 ? null : null, "", pathBuilder.f1816a);
                                            imageVectorD = builder.d();
                                            InfoKt.f1370a = imageVectorD;
                                        }
                                        composer3.o(-1633490746);
                                        ProductsReviewAlternativeCallbacks productsReviewAlternativeCallbacks2 = productsReviewAlternativeCallbacks;
                                        boolean zI = composer3.I(productsReviewAlternativeCallbacks2) | composer3.I(pageResult2);
                                        Object objG = composer3.G();
                                        if (zI || objG == Composer.Companion.f1624a) {
                                            objG = new a(productsReviewAlternativeCallbacks2, pageResult2, 0);
                                            composer3.A(objG);
                                        }
                                        composer3.l();
                                        IconButtonKt.c(imageVectorD, "Info", (Function0) objG, null, false, 0L, composer3, 48, 56);
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 905969664, 6, 254);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(-1478911513, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeScreenKt$ProductReviewAlternativeScreen$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(it) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierE = PaddingKt.e(Modifier.Companion.d, it);
                        final ProductsReviewAlternativeCallbacks productsReviewAlternativeCallbacks = callbacks;
                        final boolean z3 = z2;
                        final boolean z4 = z;
                        final PageResult pageResult = productAlternativeReview;
                        SurfaceKt.a(modifierE, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(-1439891157, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeScreenKt$ProductReviewAlternativeScreen$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer3 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    FillElement fillElement = SizeKt.c;
                                    MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                                    int p = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                    Modifier modifierD = ComposedModifierKt.d(composer3, fillElement);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function0 = ComposeUiNode.Companion.b;
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function0);
                                    } else {
                                        composer3.e();
                                    }
                                    Updater.b(composer3, measurePolicyD, ComposeUiNode.Companion.g);
                                    Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                    Function2 function2 = ComposeUiNode.Companion.j;
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                        androidx.camera.core.impl.b.z(p, composer3, p, function2);
                                    }
                                    Updater.b(composer3, modifierD, ComposeUiNode.Companion.d);
                                    PageResult.Uninitialized uninitialized = PageResult.Uninitialized.f10439a;
                                    final PageResult pageResult2 = pageResult;
                                    if (Intrinsics.c(pageResult2, uninitialized)) {
                                        composer3.o(-797214097);
                                        composer3.l();
                                    } else {
                                        boolean z5 = pageResult2 instanceof PageResult.Fail;
                                        final ProductsReviewAlternativeCallbacks productsReviewAlternativeCallbacks2 = productsReviewAlternativeCallbacks;
                                        if (z5) {
                                            composer3.o(-1272638614);
                                            CoreThemeKt.c(6, composer3, ComposableLambdaKt.c(929303478, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeScreenKt$ProductReviewAlternativeScreen$2$1$1$1
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj6, Object obj7) {
                                                    Composer composer4 = (Composer) obj6;
                                                    if ((((Number) obj7).intValue() & 3) == 2 && composer4.c()) {
                                                        composer4.j();
                                                    } else {
                                                        Painter painterA = PainterResources_androidKt.a(R.drawable.ic_order_server_error, 0, composer4);
                                                        PageResult.Fail fail = (PageResult.Fail) pageResult2;
                                                        String strC = StringResources_androidKt.c(composer4, fail.f10437a instanceof NoConnectivityException ? R.string.product_review_connection_error_title : R.string.product_review_server_error_title);
                                                        String strC2 = StringResources_androidKt.c(composer4, fail.f10437a instanceof NoConnectivityException ? R.string.product_review_alternative_connectivity_error_msg : R.string.product_review_alternative_server_error_msg);
                                                        String strC3 = StringResources_androidKt.c(composer4, R.string.try_again_button_text);
                                                        composer4.o(5004770);
                                                        ProductsReviewAlternativeCallbacks productsReviewAlternativeCallbacks3 = productsReviewAlternativeCallbacks2;
                                                        boolean zI = composer4.I(productsReviewAlternativeCallbacks3);
                                                        Object objG = composer4.G();
                                                        if (zI || objG == Composer.Companion.f1624a) {
                                                            objG = new ProductReviewAlternativeScreenKt$ProductReviewAlternativeScreen$2$1$1$1$1$1(0, productsReviewAlternativeCallbacks3, ProductsReviewAlternativeCallbacks.class, "onRetryLoad", "onRetryLoad()V", 0);
                                                            composer4.A(objG);
                                                        }
                                                        composer4.l();
                                                        FullPageMessageUiKt.a(FullPageMessageSpec.Companion.d(painterA, strC, strC2, strC3, (Function0) ((KFunction) objG)), null, null, composer4, 0, 6);
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, composer3));
                                            composer3.l();
                                        } else {
                                            if (!(pageResult2 instanceof PageResult.Success)) {
                                                throw au.com.woolworths.android.onesite.a.x(composer3, -1272642221);
                                            }
                                            composer3.o(-795559596);
                                            ProductReviewAlternativeResponseData productReviewAlternativeResponseData = (ProductReviewAlternativeResponseData) ((PageResult.Success) pageResult2).f10438a;
                                            final boolean z6 = z3;
                                            ProductReviewAlternativeScreenKt.a(productReviewAlternativeResponseData, productsReviewAlternativeCallbacks2, ComposableLambdaKt.c(217635974, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeScreenKt$ProductReviewAlternativeScreen$2$1$1$2
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj6, Object obj7) {
                                                    Composer composer4 = (Composer) obj6;
                                                    if ((((Number) obj7).intValue() & 3) == 2 && composer4.c()) {
                                                        composer4.j();
                                                    } else if (z6) {
                                                        final PageResult pageResult3 = pageResult2;
                                                        final ProductsReviewAlternativeCallbacks productsReviewAlternativeCallbacks3 = productsReviewAlternativeCallbacks2;
                                                        CoreThemeKt.c(6, composer4, ComposableLambdaKt.c(-449944150, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeScreenKt$ProductReviewAlternativeScreen$2$1$1$2.1
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj8, Object obj9) {
                                                                Composer composer5 = (Composer) obj8;
                                                                if ((((Number) obj9).intValue() & 3) == 2 && composer5.c()) {
                                                                    composer5.j();
                                                                } else {
                                                                    PageResult pageResult4 = pageResult3;
                                                                    ProductReviewAlternativeResponseInfoData productReviewAlternativeResponseInfoData = ((ProductReviewAlternativeResponseData) ((PageResult.Success) pageResult4).f10438a).g;
                                                                    String str = productReviewAlternativeResponseInfoData.f10443a;
                                                                    String str2 = productReviewAlternativeResponseInfoData.b;
                                                                    String upperCase = productReviewAlternativeResponseInfoData.c.f10442a.toUpperCase(Locale.ROOT);
                                                                    Intrinsics.g(upperCase, "toUpperCase(...)");
                                                                    composer5.o(-1633490746);
                                                                    ProductsReviewAlternativeCallbacks productsReviewAlternativeCallbacks4 = productsReviewAlternativeCallbacks3;
                                                                    boolean zI = composer5.I(productsReviewAlternativeCallbacks4) | composer5.I(pageResult4);
                                                                    Object objG = composer5.G();
                                                                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                                                    if (zI || objG == composer$Companion$Empty$1) {
                                                                        objG = new a(productsReviewAlternativeCallbacks4, pageResult4, 1);
                                                                        composer5.A(objG);
                                                                    }
                                                                    Function0 function02 = (Function0) objG;
                                                                    composer5.l();
                                                                    composer5.o(5004770);
                                                                    ProductsReviewAlternativeCallbacks productsReviewAlternativeCallbacks5 = productsReviewAlternativeCallbacks3;
                                                                    boolean zI2 = composer5.I(productsReviewAlternativeCallbacks5);
                                                                    Object objG2 = composer5.G();
                                                                    if (zI2 || objG2 == composer$Companion$Empty$1) {
                                                                        ProductReviewAlternativeScreenKt$ProductReviewAlternativeScreen$2$1$1$2$1$2$1 productReviewAlternativeScreenKt$ProductReviewAlternativeScreen$2$1$1$2$1$2$1 = new ProductReviewAlternativeScreenKt$ProductReviewAlternativeScreen$2$1$1$2$1$2$1(0, productsReviewAlternativeCallbacks5, ProductsReviewAlternativeCallbacks.class, "onInfoModalDismissed", "onInfoModalDismissed()V", 0);
                                                                        composer5.A(productReviewAlternativeScreenKt$ProductReviewAlternativeScreen$2$1$1$2$1$2$1);
                                                                        objG2 = productReviewAlternativeScreenKt$ProductReviewAlternativeScreen$2$1$1$2$1$2$1;
                                                                    }
                                                                    composer5.l();
                                                                    InfoModalKt.a(str, str2, upperCase, function02, (Function0) ((KFunction) objG2), null, composer5, 0);
                                                                }
                                                                return Unit.f24250a;
                                                            }
                                                        }, composer4));
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, composer3), composer3, KyberEngine.KyberPolyBytes);
                                            composer3.l();
                                        }
                                    }
                                    composer3.f();
                                    if (z4) {
                                        LoadingScreenKt.a(null, composer3, 0, 1);
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 1572864, 62);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 390, 1018);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new f(z, z2, productAlternativeReview, callbacks, i);
        }
    }
}
