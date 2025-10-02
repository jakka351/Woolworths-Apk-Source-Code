package au.com.woolworths.design.wx.component.bottomsheet;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.filled.FavoriteKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$ModalBottomSheetLayoutKt$lambda$1501252514$1 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    public static final ComposableSingletons$ModalBottomSheetLayoutKt$lambda$1501252514$1 d = new ComposableSingletons$ModalBottomSheetLayoutKt$lambda$1501252514$1();

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        LazyItemScope items = (LazyItemScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        Intrinsics.h(items, "$this$items");
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= composer.r(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 145) == 144 && composer.c()) {
            composer.j();
        } else {
            Modifier modifierF = PaddingKt.f(Modifier.Companion.d, 16);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(32), Alignment.Companion.k, composer, 54);
            int p = composer.getP();
            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
            Modifier modifierD = ComposedModifierKt.d(composer, modifierF);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            if (composer.w() == null) {
                ComposablesKt.b();
                throw null;
            }
            composer.i();
            if (composer.getO()) {
                composer.K(function0);
            } else {
                composer.e();
            }
            Updater.b(composer, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composer, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                androidx.camera.core.impl.b.z(p, composer, p, function2);
            }
            Updater.b(composer, modifierD, ComposeUiNode.Companion.d);
            ImageVector imageVectorD = FavoriteKt.f1362a;
            if (imageVectorD == null) {
                ImageVector.Builder builder = new ImageVector.Builder("Filled.Favorite", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i = VectorKt.f1820a;
                SolidColor solidColor = new SolidColor(Color.b);
                PathBuilder pathBuilder = new PathBuilder();
                pathBuilder.i(12.0f, 21.35f);
                pathBuilder.h(-1.45f, -1.32f);
                pathBuilder.b(5.4f, 15.36f, 2.0f, 12.28f, 2.0f, 8.5f);
                pathBuilder.b(2.0f, 5.42f, 4.42f, 3.0f, 7.5f, 3.0f);
                pathBuilder.c(1.74f, BitmapDescriptorFactory.HUE_RED, 3.41f, 0.81f, 4.5f, 2.09f);
                pathBuilder.b(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f);
                pathBuilder.b(19.58f, 3.0f, 22.0f, 5.42f, 22.0f, 8.5f);
                pathBuilder.c(BitmapDescriptorFactory.HUE_RED, 3.78f, -3.4f, 6.86f, -8.55f, 11.54f);
                pathBuilder.g(12.0f, 21.35f);
                pathBuilder.a();
                builder.b((14420 & 16) != 0 ? 1.0f : 1.0f, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 0, 0, 2, solidColor, (14420 & 32) != 0 ? null : null, "", pathBuilder.f1816a);
                imageVectorD = builder.d();
                FavoriteKt.f1362a = imageVectorD;
            }
            IconKt.b(imageVectorD, "Localized description", null, 0L, composer, 48, 12);
            TextKt.b(YU.a.d(iIntValue, "Item "), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer).l, composer, 0, 0, 65534);
            composer.f();
        }
        return Unit.f24250a;
    }
}
