package au.com.woolworths.design.core.ui.component.experimental.coachmark;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.design.core.ui.component.experimental.coachmark.ComposableSingletons$CoachMarkKt$lambda$-1963882849$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$CoachMarkKt$lambda$1963882849$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            CoachMarkState state = CoachMarkKt.f(true, composer, 6, 6);
            long j = CoreTheme.b(composer).e.f4848a.c;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierB = BackgroundKt.b(companion, j, rectangleShapeKt$RectangleShape$1);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int p = composer.getP();
            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
            Modifier modifierD = ComposedModifierKt.d(composer, modifierB);
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
            Updater.b(composer, measurePolicyD, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composer, persistentCompositionLocalMapD, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                androidx.camera.core.impl.b.z(p, composer, p, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composer, modifierD, function24);
            Modifier modifierX0 = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 100, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13).x0(SizeKt.c);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composer, 48);
            int p2 = composer.getP();
            PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer.d();
            Modifier modifierD2 = ComposedModifierKt.d(composer, modifierX0);
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
            Updater.b(composer, columnMeasurePolicyA, function2);
            Updater.b(composer, persistentCompositionLocalMapD2, function22);
            if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p2))) {
                androidx.camera.core.impl.b.z(p2, composer, p2, function23);
            }
            Updater.b(composer, modifierD2, function24);
            Intrinsics.h(state, "state");
            TextKt.b("Coachmark target", OnGloballyPositionedModifierKt.a(companion, new androidx.navigation.fragment.e(state, 11)), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131068);
            composer.f();
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            CoachMarkKt.a(state, (Function0) objG, BitmapDescriptorFactory.HUE_RED, 20, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ComposableSingletons$CoachMarkKt.f4722a, composer, 100666416, 244);
            composer.f();
        }
        return Unit.f24250a;
    }
}
