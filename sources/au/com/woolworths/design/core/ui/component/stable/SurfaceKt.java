package au.com.woolworths.design.core.ui.component.stable;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.color.ContentColorKt;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreShadowKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.BERTags;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SurfaceKt {
    public static final void a(final Function0 onClick, final Modifier modifier, boolean z, RoundedCornerShape roundedCornerShape, long j, long j2, CoreElevation coreElevation, BorderStroke borderStroke, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        Intrinsics.h(onClick, "onClick");
        composer.o(-911560868);
        final boolean z2 = (i & 4) != 0 ? true : z;
        final Shape shape = (i & 8) != 0 ? RectangleShapeKt.f1779a : roundedCornerShape;
        final long j3 = (i & 16) != 0 ? CoreTheme.b(composer).e.f4848a.c : j;
        final long j4 = (i & 32) != 0 ? CoreTheme.b(composer).e.d.d : j2;
        final CoreElevation coreElevation2 = (i & 64) != 0 ? CoreTheme.c(composer).f4876a : coreElevation;
        final BorderStroke borderStroke2 = (i & 128) != 0 ? null : borderStroke;
        composer.o(1849434622);
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            objG = InteractionSourceKt.a();
            composer.A(objG);
        }
        final MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objG;
        composer.l();
        CompositionLocalKt.a(androidx.camera.core.impl.b.g(j4, ContentColorKt.f4780a), ComposableLambdaKt.c(592049180, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.SurfaceKt$Surface$3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                    composer2.j();
                } else {
                    androidx.compose.material3.SurfaceKt.c(onClick, CoreShadowKt.a(modifier, coreElevation2, shape), z2, shape, j3, j4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, borderStroke2, mutableInteractionSource, composableLambdaImpl, composer2, 0, BERTags.PRIVATE);
                }
                return Unit.f24250a;
            }
        }, composer), composer, 56);
        composer.l();
    }

    public static final void b(Modifier modifier, RoundedCornerShape roundedCornerShape, long j, long j2, BorderStroke borderStroke, CoreElevation coreElevation, final Function2 content, Composer composer, int i) {
        Intrinsics.h(content, "content");
        composer.o(2007469925);
        if ((i & 1) != 0) {
            modifier = Modifier.Companion.d;
        }
        final Modifier modifier2 = modifier;
        Shape shape = roundedCornerShape;
        if ((i & 2) != 0) {
            shape = RectangleShapeKt.f1779a;
        }
        final Shape shape2 = shape;
        if ((i & 4) != 0) {
            j = CoreTheme.b(composer).e.f4848a.c;
        }
        final long j3 = j;
        final long j4 = (i & 8) != 0 ? CoreTheme.b(composer).e.d.d : j2;
        final BorderStroke borderStroke2 = (i & 16) != 0 ? null : borderStroke;
        final CoreElevation coreElevation2 = (i & 32) != 0 ? CoreTheme.c(composer).f4876a : coreElevation;
        CompositionLocalKt.a(androidx.camera.core.impl.b.g(j4, ContentColorKt.f4780a), ComposableLambdaKt.c(-998194523, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.SurfaceKt$Surface$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                    composer2.j();
                } else {
                    androidx.compose.material3.SurfaceKt.a(CoreShadowKt.a(modifier2, coreElevation2, shape2), shape2, j3, j4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, borderStroke2, content, composer2, 0, 48);
                }
                return Unit.f24250a;
            }
        }, composer), composer, 56);
        composer.l();
    }
}
