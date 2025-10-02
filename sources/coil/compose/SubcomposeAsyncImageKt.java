package coil.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-compose-base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SubcomposeAsyncImageKt {
    public static final void a(SubcomposeAsyncImageScope subcomposeAsyncImageScope, Modifier modifier, Painter painter, String str, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, Composer composer, final int i) {
        final SubcomposeAsyncImageScope subcomposeAsyncImageScope2;
        int i2;
        Painter painter2;
        int i3;
        String str2;
        Alignment alignment2;
        ContentScale contentScale2;
        float fA;
        ColorFilter colorFilterC;
        Modifier modifier2;
        ComposerImpl composerImpl;
        final Modifier modifier3;
        final Painter painter3;
        final String str3;
        final Alignment alignment3;
        final ContentScale contentScale3;
        final float f2;
        final ColorFilter colorFilter2;
        ComposerImpl composerImplV = composer.v(-263982313);
        if ((i & 14) == 0) {
            subcomposeAsyncImageScope2 = subcomposeAsyncImageScope;
            i2 = (composerImplV.n(subcomposeAsyncImageScope2) ? 4 : 2) | i;
        } else {
            subcomposeAsyncImageScope2 = subcomposeAsyncImageScope;
            i2 = i;
        }
        int i4 = i2 | 176;
        if ((i & 7168) == 0) {
            i4 = i2 | 1200;
        }
        if ((57344 & i) == 0) {
            i4 |= 8192;
        }
        if ((458752 & i) == 0) {
            i4 |= 65536;
        }
        if ((3670016 & i) == 0) {
            i4 |= 524288;
        }
        if ((29360128 & i) == 0) {
            i4 |= 4194304;
        }
        if ((23967451 & i4) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier;
            painter3 = painter;
            str3 = str;
            alignment3 = alignment;
            contentScale3 = contentScale;
            f2 = f;
            colorFilter2 = colorFilter;
            composerImpl = composerImplV;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                AsyncImagePainter asyncImagePainterB = subcomposeAsyncImageScope2.b();
                String contentDescription = subcomposeAsyncImageScope2.getContentDescription();
                Alignment alignment4 = subcomposeAsyncImageScope2.getAlignment();
                ContentScale contentScaleD = subcomposeAsyncImageScope2.d();
                painter2 = asyncImagePainterB;
                i3 = i4 & (-33554305);
                str2 = contentDescription;
                alignment2 = alignment4;
                contentScale2 = contentScaleD;
                fA = subcomposeAsyncImageScope2.a();
                colorFilterC = subcomposeAsyncImageScope2.c();
                modifier2 = Modifier.Companion.d;
            } else {
                composerImplV.j();
                i3 = i4 & (-33554305);
                modifier2 = modifier;
                painter2 = painter;
                str2 = str;
                alignment2 = alignment;
                contentScale2 = contentScale;
                fA = f;
                colorFilterC = colorFilter;
            }
            composerImplV.W();
            composerImpl = composerImplV;
            AsyncImageKt.a(modifier2, painter2, str2, alignment2, contentScale2, fA, colorFilterC, composerImpl, ((i3 >> 3) & 14) | 64);
            modifier3 = modifier2;
            painter3 = painter2;
            str3 = str2;
            alignment3 = alignment2;
            contentScale3 = contentScale2;
            f2 = fA;
            colorFilter2 = colorFilterC;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX == null) {
            return;
        }
        recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: coil.compose.SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ((Number) obj2).intValue();
                SubcomposeAsyncImageKt.a(subcomposeAsyncImageScope2, modifier3, painter3, str3, alignment3, contentScale3, f2, colorFilter2, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                return Unit.f24250a;
            }
        };
    }
}
