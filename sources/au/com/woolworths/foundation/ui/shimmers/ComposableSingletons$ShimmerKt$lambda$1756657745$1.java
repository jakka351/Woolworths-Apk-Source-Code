package au.com.woolworths.foundation.ui.shimmers;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
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
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$ShimmerKt$lambda$1756657745$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ShimmerKt$lambda$1756657745$1 d = new ComposableSingletons$ShimmerKt$lambda$1756657745$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            float f = 10;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierU = SizeKt.u(PaddingKt.f(companion, f), 100);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(4), Alignment.Companion.m, composer, 6);
            int p = composer.getP();
            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
            Modifier modifierD = ComposedModifierKt.d(composer, modifierU);
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
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composer, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composer, persistentCompositionLocalMapD, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                androidx.camera.core.impl.b.z(p, composer, p, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composer, modifierD, function24);
            ShimmerKt.a(null, 0, null, null, composer, 432, 9);
            ShimmerKt.a(null, 5, new Dp(f), null, composer, 432, 9);
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g, Alignment.Companion.j, composer, 6);
            int p2 = composer.getP();
            PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer.d();
            Modifier modifierD2 = ComposedModifierKt.d(composer, modifierE);
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
            Updater.b(composer, rowMeasurePolicyA, function2);
            Updater.b(composer, persistentCompositionLocalMapD2, function22);
            if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p2))) {
                androidx.camera.core.impl.b.z(p2, composer, p2, function23);
            }
            Updater.b(composer, modifierD2, function24);
            float f2 = 45;
            ShimmerKt.a(null, BitmapDescriptorFactory.HUE_RED, null, new Dp(f2), composer, 3072, 7);
            ShimmerKt.a(null, BitmapDescriptorFactory.HUE_RED, null, new Dp(f2), composer, 3072, 7);
            composer.f();
            composer.f();
        }
        return Unit.f24250a;
    }
}
