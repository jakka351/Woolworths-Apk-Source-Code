package au.com.woolworths.foundation.ui.shimmers;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductsSkeletonKt$lambda$1992469607$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductsSkeletonKt$lambda$1992469607$1 d = new ComposableSingletons$ProductsSkeletonKt$lambda$1992469607$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(Card, "$this$Card");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 12;
            float f2 = 8;
            Modifier modifierI = PaddingKt.i(SizeKt.o(companion, 160), f2, f, f2, 16);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g, Alignment.Companion.n, composer, 54);
            int p = composer.getP();
            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
            Modifier modifierD = ComposedModifierKt.d(composer, modifierI);
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
            Updater.b(composer, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composer, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                androidx.camera.core.impl.b.z(p, composer, p, function2);
            }
            Updater.b(composer, modifierD, ComposeUiNode.Companion.d);
            float f3 = 88;
            float f4 = 24;
            ShimmerKt.a(PaddingKt.j(PaddingKt.h(companion, f4, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, 40, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), BitmapDescriptorFactory.HUE_RED, new Dp(f3), new Dp(f3), composer, 3462, 2);
            float f5 = 10;
            float f6 = 134;
            ShimmerKt.a(PaddingKt.j(PaddingKt.h(companion, f4, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, 14, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), BitmapDescriptorFactory.HUE_RED, new Dp(f5), new Dp(f6), composer, 3462, 2);
            float f7 = 36;
            ShimmerKt.a(PaddingKt.h(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f5, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), f7, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, new Dp(f5), new Dp(f6), composer, 3462, 2);
            float f8 = 70;
            ShimmerKt.a(SizeKt.r(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), f8, f7), BitmapDescriptorFactory.HUE_RED, new Dp(f7), new Dp(f8), composer, 3462, 2);
            ShimmerKt.a(PaddingKt.h(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 51, BitmapDescriptorFactory.HUE_RED, 20, 5), f2, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, new Dp(f7), new Dp(SubsamplingScaleImageView.ORIENTATION_180), composer, 3456, 2);
            composer.f();
        }
        return Unit.f24250a;
    }
}
