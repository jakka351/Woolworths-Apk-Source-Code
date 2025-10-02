package au.com.woolworths.shop.aem.components.ui.pagecover;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.BlurKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import au.com.woolworths.compose.utils.extensions.ColorExtKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.pagecover.PageCoverContentFormat;
import au.com.woolworths.shop.aem.components.model.pagecover.PageCoverData;
import au.com.woolworths.shop.aem.components.model.pagecover.PageCoverImagePosition;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.CachePolicy;
import coil3.request.ImageRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PageCoverTopBarSectionKt {
    public static final void a(PageCoverData pageCoverData, Modifier modifier, Composer composer, int i) {
        PageCoverContentFormat pageCoverContentFormat;
        Intrinsics.h(pageCoverData, "pageCoverData");
        ComposerImpl composerImplV = composer.v(-1911577103);
        if ((((composerImplV.I(pageCoverData) ? 4 : 2) | i) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            int i2 = Color.l;
            long jA = ColorExtKt.a(CoreTheme.b(composerImplV).e.f4848a.c, pageCoverData.e.f10152a.f10151a);
            PageCoverImagePosition pageCoverImagePosition = pageCoverData.h;
            PageCoverImagePosition pageCoverImagePosition2 = PageCoverImagePosition.d;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            if (pageCoverImagePosition == pageCoverImagePosition2 && ((pageCoverContentFormat = pageCoverData.f) == PageCoverContentFormat.d || pageCoverContentFormat == PageCoverContentFormat.e)) {
                composerImplV.o(-821676176);
                ImageRequest.Builder builder = new ImageRequest.Builder((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b));
                ImageWithAltText imageWithAltText = pageCoverData.c;
                builder.c = imageWithAltText != null ? imageWithAltText.f10141a : null;
                builder.j = CachePolicy.f;
                SingletonAsyncImageKt.a(builder.a(), null, BlurKt.a(SizeKt.e(BackgroundKt.b(modifier, jA, rectangleShapeKt$RectangleShape$1), 1.0f), 30), null, ContentScale.Companion.f1880a, composerImplV, 1572912, 1976);
                composerImplV.V(false);
            } else {
                composerImplV.o(-821202496);
                BoxKt.a(BlurKt.a(SizeKt.e(BackgroundKt.b(modifier, jA, rectangleShapeKt$RectangleShape$1), 1.0f), 30), composerImplV, 0);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(pageCoverData, modifier, i, 1);
        }
    }
}
