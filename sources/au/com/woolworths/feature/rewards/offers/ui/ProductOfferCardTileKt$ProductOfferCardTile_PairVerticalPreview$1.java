package au.com.woolworths.feature.rewards.offers.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class ProductOfferCardTileKt$ProductOfferCardTile_PairVerticalPreview$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer, 0);
        int p = composer.getP();
        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
        Modifier modifierD = ComposedModifierKt.d(composer, Modifier.Companion.d);
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
        throw null;
    }
}
