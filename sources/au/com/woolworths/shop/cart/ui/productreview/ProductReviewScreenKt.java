package au.com.woolworths.shop.cart.ui.productreview;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.IntSize;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import au.com.woolworths.shop.cart.domain.model.PageResult;
import au.com.woolworths.shop.cart.domain.model.ProductReviewResult;
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
import kotlin.reflect.KFunction;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isEmptyScreenLoading", "shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductReviewScreenKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Timber.Forest f10526a;

    static {
        Timber.Forest forest = Timber.f27013a;
        forest.s("ProductReviewScreen");
        f10526a = forest;
    }

    public static final void a(boolean z, ProductsReviewCallbacks productsReviewCallbacks, Function0 function0, Function0 function02, Composer composer, int i) {
        Function0 function03;
        ComposerImpl composerImplV = composer.v(1338666946);
        int i2 = i | (composerImplV.p(z) ? 4 : 2) | (composerImplV.n(productsReviewCallbacks) ? 32 : 16) | (composerImplV.I(function02) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            function03 = function0;
        } else {
            productsReviewCallbacks.y5();
            composerImplV.o(-1633490746);
            boolean z2 = (i2 & 7168) == 2048;
            Object objG = composerImplV.G();
            if (z2 || objG == Composer.Companion.f1624a) {
                function03 = function0;
                objG = new ProductReviewScreenKt$EmptyScreen$1$1(function03, function02, null);
                composerImplV.A(objG);
            } else {
                function03 = function0;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, "Empty Screen Effect", (Function2) objG);
            AnimatedContentKt.b(Boolean.valueOf(z), null, null, null, "Empty Screen Content", null, ComposableSingletons$ProductReviewScreenKt.b, composerImplV, (i2 & 14) | 1597440, 46);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.d(z, productsReviewCallbacks, function03, function02, i);
        }
    }

    public static final void b(final ProductReviewResult.Response response, final ProductsReviewCallbacks productsReviewCallbacks, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(-1563714865);
        int i2 = (composerImplV.I(response) ? 4 : 2) | i | (composerImplV.n(productsReviewCallbacks) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            productsReviewCallbacks.d3(response.c);
            Modifier modifierA = AnimationModifierKt.a(BackgroundKt.b(SizeKt.c, Color.f, RectangleShapeKt.f1779a), AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntSize(VisibilityThresholdsKt.b()), 1), null);
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 112) == 32) | composerImplV.I(response);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new d(response, productsReviewCallbacks, 0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            LazyDslKt.b(modifierA, null, null, false, null, null, null, false, null, (Function1) objG, composerImplV, 0, 510);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(productsReviewCallbacks, i) { // from class: au.com.woolworths.shop.cart.ui.productreview.e
                public final /* synthetic */ ProductsReviewCallbacks e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    ProductReviewScreenKt.b(this.d, this.e, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void c(final boolean z, final PageResult productReview, final ProductsReviewCallbacks callbacks, final Function0 onBackButtonPressed, final Function0 onReviewFinished, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        Intrinsics.h(productReview, "productReview");
        Intrinsics.h(callbacks, "callbacks");
        Intrinsics.h(onBackButtonPressed, "onBackButtonPressed");
        Intrinsics.h(onReviewFinished, "onReviewFinished");
        ComposerImpl composerImplV = composer.v(-1377325046);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (composerImplV.n(productReview) ? 32 : 16) | (composerImplV.n(callbacks) ? 256 : 128);
        if ((i & 3072) == 0) {
            i3 |= composerImplV.I(onBackButtonPressed) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerImplV.I(onReviewFinished) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImpl = composerImplV;
            ScaffoldKt.a(SizeKt.c, null, ComposableLambdaKt.c(115124645, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productreview.ProductReviewScreenKt$ProductReviewScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC = StringResources_androidKt.c(composer2, R.string.product_review_title);
                        final Function0 function0 = onBackButtonPressed;
                        TopNavBarKt.b(strC, null, null, null, 0L, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(-1774676044, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productreview.ProductReviewScreenKt$ProductReviewScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(ArrowBackKt.a(), "Back", function0, null, false, 0L, composer3, 48, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 805306368, 0, 1534);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(-749687437, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productreview.ProductReviewScreenKt$ProductReviewScreen$2
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
                        final Function0 function0 = onReviewFinished;
                        final boolean z2 = z;
                        final PageResult pageResult = productReview;
                        final ProductsReviewCallbacks productsReviewCallbacks = callbacks;
                        SurfaceKt.a(modifierE, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(971284919, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productreview.ProductReviewScreenKt$ProductReviewScreen$2.1
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
                                    Function0 function02 = ComposeUiNode.Companion.b;
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function02);
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
                                        composer3.o(-2136422333);
                                        composer3.l();
                                    } else {
                                        boolean z3 = pageResult2 instanceof PageResult.Fail;
                                        final ProductsReviewCallbacks productsReviewCallbacks2 = productsReviewCallbacks;
                                        if (z3) {
                                            composer3.o(485276042);
                                            CoreThemeKt.c(6, composer3, ComposableLambdaKt.c(-905821182, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productreview.ProductReviewScreenKt$ProductReviewScreen$2$1$1$1
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj6, Object obj7) {
                                                    Composer composer4 = (Composer) obj6;
                                                    if ((((Number) obj7).intValue() & 3) == 2 && composer4.c()) {
                                                        composer4.j();
                                                    } else {
                                                        Painter painterA = PainterResources_androidKt.a(R.drawable.ic_order_server_error, 0, composer4);
                                                        String strC = StringResources_androidKt.c(composer4, ((PageResult.Fail) pageResult2).f10437a instanceof NoConnectivityException ? R.string.product_review_connection_error_title : R.string.product_review_server_error_title);
                                                        String strC2 = StringResources_androidKt.c(composer4, R.string.product_review_error_msg);
                                                        String strC3 = StringResources_androidKt.c(composer4, R.string.try_again_button_text);
                                                        composer4.o(5004770);
                                                        ProductsReviewCallbacks productsReviewCallbacks3 = productsReviewCallbacks2;
                                                        boolean zI = composer4.I(productsReviewCallbacks3);
                                                        Object objG = composer4.G();
                                                        if (zI || objG == Composer.Companion.f1624a) {
                                                            objG = new ProductReviewScreenKt$ProductReviewScreen$2$1$1$1$1$1(0, productsReviewCallbacks3, ProductsReviewCallbacks.class, "onRetryLoad", "onRetryLoad()V", 0);
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
                                                throw au.com.woolworths.android.onesite.a.x(composer3, 485273163);
                                            }
                                            composer3.o(-2135148667);
                                            composer3.o(1849434622);
                                            Object objG = composer3.G();
                                            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                            if (objG == composer$Companion$Empty$1) {
                                                objG = SnapshotStateKt.f(Boolean.TRUE);
                                                composer3.A(objG);
                                            }
                                            MutableState mutableState = (MutableState) objG;
                                            composer3.l();
                                            ProductReviewResult productReviewResult = (ProductReviewResult) ((PageResult.Success) pageResult2).f10438a;
                                            boolean z4 = productReviewResult instanceof ProductReviewResult.Empty;
                                            Function0 function03 = function0;
                                            if (z4) {
                                                composer3.o(-2134968712);
                                                boolean zBooleanValue = ((Boolean) mutableState.getD()).booleanValue();
                                                composer3.o(5004770);
                                                Object objG2 = composer3.G();
                                                if (objG2 == composer$Companion$Empty$1) {
                                                    objG2 = new au.com.woolworths.feature.rewards.offers.listpage.ui.e(mutableState, 15);
                                                    composer3.A(objG2);
                                                }
                                                composer3.l();
                                                ProductReviewScreenKt.a(zBooleanValue, productsReviewCallbacks2, (Function0) objG2, function03, composer3, KyberEngine.KyberPolyBytes);
                                                composer3.l();
                                            } else if (productReviewResult instanceof ProductReviewResult.Error) {
                                                composer3.o(-2134490909);
                                                composer3.l();
                                            } else {
                                                if (!(productReviewResult instanceof ProductReviewResult.Response)) {
                                                    throw au.com.woolworths.android.onesite.a.x(composer3, 485317259);
                                                }
                                                composer3.o(-2134393135);
                                                ProductReviewResult.Response response = (ProductReviewResult.Response) productReviewResult;
                                                if (response.b.isEmpty()) {
                                                    composer3.o(485342282);
                                                    boolean zBooleanValue2 = ((Boolean) mutableState.getD()).booleanValue();
                                                    composer3.o(5004770);
                                                    Object objG3 = composer3.G();
                                                    if (objG3 == composer$Companion$Empty$1) {
                                                        objG3 = new au.com.woolworths.feature.rewards.offers.listpage.ui.e(mutableState, 16);
                                                        composer3.A(objG3);
                                                    }
                                                    composer3.l();
                                                    ProductReviewScreenKt.a(zBooleanValue2, productsReviewCallbacks2, (Function0) objG3, function03, composer3, KyberEngine.KyberPolyBytes);
                                                    composer3.l();
                                                } else {
                                                    composer3.o(485357798);
                                                    ProductReviewScreenKt.b(response, productsReviewCallbacks2, composer3, 0);
                                                    composer3.l();
                                                }
                                                composer3.l();
                                            }
                                            composer3.l();
                                        }
                                    }
                                    composer3.o(485369579);
                                    if (z2) {
                                        LoadingScreenKt.a(null, composer3, 0, 1);
                                    }
                                    composer3.l();
                                    composer3.f();
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
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.card.unlock.a(z, productReview, callbacks, onBackButtonPressed, onReviewFinished, i);
        }
    }
}
