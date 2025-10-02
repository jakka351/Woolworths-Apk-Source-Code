package au.com.woolworths.design.core.ui.component.stable.internal;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContentKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TextWithInlineIconKt {
    public static final void a(final String text, final long j, final long j2, final TextStyle textStyle, final ImageVector imageVector, float f, Composer composer, final int i) {
        int i2;
        final float f2;
        Intrinsics.h(text, "text");
        ComposerImpl composerImplV = composer.v(986852046);
        if ((i & 6) == 0) {
            i2 = i | (composerImplV.n(text) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (composerImplV.s(j) ? 32 : 16) | (composerImplV.n(textStyle) ? 2048 : 1024) | (composerImplV.n(imageVector) ? 16384 : 8192) | 196608;
        if ((74899 & i3) == 74898 && composerImplV.c()) {
            composerImplV.j();
            f2 = f;
        } else {
            final float f3 = 4;
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            builder.e(text);
            InlineTextContentKt.a(builder, "inlineIcon", "�");
            TextKt.b(builder.m(), textStyle, null, j, 0, 0, false, 0, MapsKt.i(new Pair("inlineIcon", new InlineTextContent(new Placeholder(TextUnitKt.c((int) (TextUnit.c(j2) + f3)), j2, 3), ComposableLambdaKt.c(670916474, new Function3<String, Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.internal.TextWithInlineIconKt$TextWithInlineIcon$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String it = (String) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        IconKt.b(imageVector, null, PaddingKt.j(SizeKt.c, f3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), j, composer2, 48, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV)))), null, composerImplV, ((i3 >> 6) & 112) | ((i3 << 6) & 7168), 1524);
            f2 = f3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.design.core.ui.component.stable.internal.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    TextWithInlineIconKt.a(text, j, j2, textStyle, imageVector, f2, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
