package com.halilibo.richtext.markdown;

import android.content.Context;
import android.util.Base64;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainterKt;
import coil.request.ImageRequest;
import coil.size.RealSizeResolver;
import coil.size.Size;
import coil.transition.CrossfadeTransition;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "sizeModifier", "richtext-markdown_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class MarkdownImageKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f16245a = 64;

    public static final void a(String url, final String str, Modifier modifier, Composer composer, int i) {
        Intrinsics.h(url, "url");
        ComposerImpl composerImplV = composer.v(1913083167);
        if ((((composerImplV.n(url) ? 4 : 2) | i | (composerImplV.n(str) ? 32 : 16)) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Object objDecode = (StringsKt.W(url, "data:image", false) && StringsKt.o(url, "base64", false)) ? Base64.decode(StringsKt.Z(url, "base64,", url), 0) : url;
            ImageRequest.Builder builder = new ImageRequest.Builder((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b));
            builder.c = objDecode;
            Size size = Size.c;
            Size size2 = Size.c;
            builder.m = new RealSizeResolver();
            builder.o = null;
            builder.p = null;
            builder.q = null;
            builder.g = new CrossfadeTransition.Factory(100);
            final AsyncImagePainter asyncImagePainterA = SingletonAsyncImagePainterKt.a(builder.a(), composerImplV);
            final Density density = (Density) composerImplV.x(CompositionLocalsKt.h);
            BoxWithConstraintsKt.a(modifier, Alignment.Companion.e, false, ComposableLambdaKt.c(-934771467, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: com.halilibo.richtext.markdown.MarkdownImageKt$MarkdownImage$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(BoxWithConstraints) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        composer2.o(-1344660740);
                        Density density2 = density;
                        boolean zN = composer2.n(density2);
                        AsyncImagePainter asyncImagePainter = asyncImagePainterA;
                        boolean zN2 = zN | composer2.n(asyncImagePainter);
                        Object objG = composer2.G();
                        if (zN2 || objG == Composer.Companion.f1624a) {
                            objG = SnapshotStateKt.d(new b(0, asyncImagePainter, BoxWithConstraints, density2));
                            composer2.A(objG);
                        }
                        composer2.l();
                        ImageKt.a(asyncImagePainter, str, (Modifier) ((State) objG).getD(), null, ContentScale.Companion.e, BitmapDescriptorFactory.HUE_RED, null, composer2, 0, 104);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 3126, 4);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.shippingcalculator.ui.a(url, str, modifier, i, 2);
        }
    }
}
