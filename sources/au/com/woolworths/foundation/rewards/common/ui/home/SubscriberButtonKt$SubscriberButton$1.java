package au.com.woolworths.foundation.rewards.common.ui.home;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class SubscriberButtonKt$SubscriberButton$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        Modifier.Companion companion = Modifier.Companion.d;
        Modifier modifierQ = SizeKt.q(companion, 40);
        composer.o(5004770);
        boolean zN = composer.n(null);
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            objG = new a(2);
            composer.A(objG);
        }
        composer.l();
        Modifier modifierA = SemanticsModifierKt.a(modifierQ, (Function1) objG);
        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
        int p = composer.getP();
        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
        Modifier modifierD = ComposedModifierKt.d(composer, modifierA);
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
        Updater.b(composer, measurePolicyD, ComposeUiNode.Companion.g);
        Updater.b(composer, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
        Function2 function2 = ComposeUiNode.Companion.j;
        if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
            b.z(p, composer, p, function2);
        }
        Updater.b(composer, modifierD, ComposeUiNode.Companion.d);
        IconButtonKt.a(null, TestTagKt.a(companion, "SubscriberIconTag"), false, ComposableLambdaKt.c(1406425839, new SubscriberButtonKt$SubscriberButton$1$2$1(), composer), composer, 3120, 4);
        throw null;
    }
}
