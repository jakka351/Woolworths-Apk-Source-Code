package au.com.woolworths.shop.product.details.ui.linkdedicatedviews;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.work.impl.utils.c;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.foundation.ui.image.gallery.GalleryImagesCarouselKt;
import au.com.woolworths.shop.checkout.ui.compose.k;
import au.com.woolworths.shop.product.details.ProductDetailsContract;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FullScreenImageGalleryScreenKt {
    public static final void a(final ProductDetailsContract.ViewState viewState, final PagerState imageGalleryPagerState, final Function0 onNavigateUp, final Function1 productDetailsEventSink, Composer composer, int i) {
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(imageGalleryPagerState, "imageGalleryPagerState");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(productDetailsEventSink, "productDetailsEventSink");
        ComposerImpl composerImplV = composer.v(-507808588);
        if ((((composerImplV.I(viewState) ? 4 : 2) | i | (composerImplV.n(imageGalleryPagerState) ? 32 : 16) | (composerImplV.I(onNavigateUp) ? 256 : 128) | (composerImplV.I(productDetailsEventSink) ? 2048 : 1024)) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(696309008, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.linkdedicatedviews.FullScreenImageGalleryScreenKt$FullScreenImageGalleryScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final List list = viewState.f;
                        Modifier modifierD = WindowInsetsPaddingKt.d(Modifier.Companion.d, WindowInsets_androidKt.b(composer2));
                        final Function0 function0 = onNavigateUp;
                        final PagerState pagerState = imageGalleryPagerState;
                        final Function1 function1 = productDetailsEventSink;
                        ScaffoldKt.a(modifierD, ComposableLambdaKt.c(-317261868, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.linkdedicatedviews.FullScreenImageGalleryScreenKt$FullScreenImageGalleryScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    CoreElevation coreElevation = CoreTheme.c(composer3).f4876a;
                                    final PagerState pagerState2 = pagerState;
                                    final Function0 function02 = function0;
                                    final Function1 function12 = function1;
                                    TopNavBarKt.a("", null, 0L, 0L, 0L, null, coreElevation, ComposableLambdaKt.c(521401414, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.linkdedicatedviews.FullScreenImageGalleryScreenKt.FullScreenImageGalleryScreen.1.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            Composer composer4 = (Composer) obj5;
                                            if ((((Number) obj6).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                ImageVector imageVector = CoreTheme.e(composer4).e.b;
                                                String strC = StringResources_androidKt.c(composer4, R.string.content_description_back_button);
                                                composer4.o(-1746271574);
                                                Function1 function13 = function12;
                                                boolean zN = composer4.n(function13);
                                                PagerState pagerState3 = pagerState2;
                                                boolean zN2 = zN | composer4.n(pagerState3);
                                                Function0 function03 = function02;
                                                boolean zN3 = zN2 | composer4.n(function03);
                                                Object objG = composer4.G();
                                                if (zN3 || objG == Composer.Companion.f1624a) {
                                                    objG = new c(27, function13, pagerState3, function03);
                                                    composer4.A(objG);
                                                }
                                                composer4.l();
                                                IconButtonKt.c(imageVector, strC, (Function0) objG, null, false, null, 0L, composer4, 0, 120);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), null, composer3, 100663302, 638);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, null, 0L, null, ComposableLambdaKt.c(-2090499555, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.linkdedicatedviews.FullScreenImageGalleryScreenKt$FullScreenImageGalleryScreen$1.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                PaddingValues it = (PaddingValues) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(it, "it");
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= composer3.n(it) ? 4 : 2;
                                }
                                if ((iIntValue & 19) == 18 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    Modifier modifierX0 = PaddingKt.e(Modifier.Companion.d, it).x0(SizeKt.c);
                                    ColorPainter colorPainter = new ColorPainter(CoreTheme.b(composer3).f4782a.f4783a.b.c);
                                    composer3.o(1849434622);
                                    Object objG = composer3.G();
                                    Object obj6 = Composer.Companion.f1624a;
                                    if (objG == obj6) {
                                        objG = new au.com.woolworths.foundation.shop.olive.voice.ui.permission.a(29);
                                        composer3.A(objG);
                                    }
                                    Function2 function2 = (Function2) objG;
                                    composer3.l();
                                    composer3.o(5004770);
                                    Function1 function12 = function1;
                                    boolean zN = composer3.n(function12);
                                    Object objG2 = composer3.G();
                                    if (zN || objG2 == obj6) {
                                        objG2 = new au.com.woolworths.feature.shop.contentpage.ui.c(27, function12);
                                        composer3.A(objG2);
                                    }
                                    Function1 function13 = (Function1) objG2;
                                    boolean zC = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.C(5004770, composer3, function12);
                                    Object objG3 = composer3.G();
                                    if (zC || objG3 == obj6) {
                                        objG3 = new au.com.woolworths.feature.product.list.compose.errorscreen.c(8, function12);
                                        composer3.A(objG3);
                                    }
                                    composer3.l();
                                    GalleryImagesCarouselKt.a(list, colorPainter, function2, pagerState, function13, modifierX0, (Function2) objG3, false, true, composer3, 100663680, 128);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 12582960, 124);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new k(viewState, imageGalleryPagerState, onNavigateUp, productDetailsEventSink, i, 4);
        }
    }
}
