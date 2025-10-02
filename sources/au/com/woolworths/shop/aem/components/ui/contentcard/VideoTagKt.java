package au.com.woolworths.shop.aem.components.ui.contentcard;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.rounded.PlayArrowKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VideoTagKt {
    public static final void a(int i, int i2, Composer composer, final Modifier modifier) {
        int i3;
        ComposerImpl composerImplV = composer.v(-2000561814);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (composerImplV.n(modifier) ? 4 : 2) | i;
        }
        if ((i3 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion.d;
            }
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(144462278, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.contentcard.VideoTagKt$VideoTag$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierB = BackgroundKt.b(modifier, Color.b(ToneColors.b, 0.6f), RoundedCornerShapeKt.b(4));
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer2, 48);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierB);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        ImageVector imageVectorD = PlayArrowKt.f1373a;
                        if (imageVectorD == null) {
                            ImageVector.Builder builder = new ImageVector.Builder("Rounded.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i5 = VectorKt.f1820a;
                            SolidColor solidColor = new SolidColor(Color.b);
                            PathBuilder pathBuilder = new PathBuilder();
                            pathBuilder.i(8.0f, 6.82f);
                            pathBuilder.m(10.36f);
                            pathBuilder.c(BitmapDescriptorFactory.HUE_RED, 0.79f, 0.87f, 1.27f, 1.54f, 0.84f);
                            pathBuilder.h(8.14f, -5.18f);
                            pathBuilder.c(0.62f, -0.39f, 0.62f, -1.29f, BitmapDescriptorFactory.HUE_RED, -1.69f);
                            pathBuilder.g(9.54f, 5.98f);
                            pathBuilder.b(8.87f, 5.55f, 8.0f, 6.03f, 8.0f, 6.82f);
                            pathBuilder.a();
                            builder.b((14420 & 16) != 0 ? 1.0f : 1.0f, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 0, 0, 2, solidColor, (14420 & 32) != 0 ? null : null, "", pathBuilder.f1816a);
                            imageVectorD = builder.d();
                            PlayArrowKt.f1373a = imageVectorD;
                        }
                        IconKt.b(imageVectorD, null, null, CoreTheme.a(composer2).f4774a.b.c, composer2, 48, 4);
                        TextKt.b(StringResources_androidKt.c(composer2, R.string.aem_video_indicator_label), PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, 11), CoreTheme.a(composer2).f4774a.b.c, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer2).f5120a.b.b, composer2, 48, 0, 65528);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.recipes.details.ui.a(modifier, i, i2, 5);
        }
    }
}
