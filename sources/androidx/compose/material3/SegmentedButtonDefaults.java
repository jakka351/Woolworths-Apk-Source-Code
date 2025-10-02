package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/SegmentedButtonDefaults;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SegmentedButtonDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final SegmentedButtonDefaults f1488a = new SegmentedButtonDefaults();
    public static final float b;
    public static final float c;

    static {
        float f = OutlinedSegmentedButtonTokens.f1595a;
        b = OutlinedSegmentedButtonTokens.b;
        c = OutlinedSegmentedButtonTokens.c;
    }

    public final void a(Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(-1273041460);
        if ((i & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ImageVector imageVectorD = CheckKt.f1357a;
            if (imageVectorD == null) {
                ImageVector.Builder builder = new ImageVector.Builder("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i2 = VectorKt.f1820a;
                SolidColor solidColor = new SolidColor(Color.b);
                PathBuilder pathBuilder = new PathBuilder();
                pathBuilder.i(9.0f, 16.17f);
                pathBuilder.g(4.83f, 12.0f);
                pathBuilder.h(-1.42f, 1.41f);
                pathBuilder.g(9.0f, 19.0f);
                pathBuilder.g(21.0f, 7.0f);
                pathBuilder.h(-1.41f, -1.41f);
                pathBuilder.a();
                builder.b((14420 & 16) != 0 ? 1.0f : 1.0f, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 0, 0, 2, solidColor, (14420 & 32) != 0 ? null : null, "", pathBuilder.f1816a);
                imageVectorD = builder.d();
                CheckKt.f1357a = imageVectorD;
            }
            IconKt.b(imageVectorD, null, SizeKt.q(Modifier.Companion.d, c), 0L, composerImplV, 48, 8);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(i) { // from class: androidx.compose.material3.SegmentedButtonDefaults$ActiveIcon$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(7);
                    this.h.a((Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public final void b(boolean z, final Function2 function2, Composer composer, final int i) {
        final boolean z2;
        ComposerImpl composerImplV = composer.v(683517296);
        int i2 = (composerImplV.p(z) ? 4 : 2) | i | 432;
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            z2 = z;
        } else {
            function2 = ComposableSingletons$SegmentedButtonKt.f1423a;
            composerImplV.o(1631306250);
            z2 = z;
            AnimatedVisibilityKt.d(z2, null, EnterExitTransitionKt.e(AnimationSpecKt.e(350, 0, null, 6), 2).b(EnterExitTransitionKt.g(BitmapDescriptorFactory.HUE_RED, TransformOriginKt.a(BitmapDescriptorFactory.HUE_RED, 1.0f), AnimationSpecKt.e(350, 0, null, 6))), ExitTransition.f723a, null, ComposableLambdaKt.c(-750750819, new SegmentedButtonDefaults$Icon$1(3), composerImplV), composerImplV, (i2 & 14) | 196608, 18);
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(z2, function2, i) { // from class: androidx.compose.material3.SegmentedButtonDefaults$Icon$3
                public final /* synthetic */ boolean i;
                public final /* synthetic */ Function2 j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(3073);
                    this.h.b(this.i, this.j, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
