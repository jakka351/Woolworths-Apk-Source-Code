package androidx.compose.foundation.layout;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SpacerKt {
    public static final void a(Composer composer, Modifier modifier) {
        int p = composer.getP();
        Modifier modifierD = ComposedModifierKt.d(composer, modifier);
        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
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
        Updater.b(composer, SpacerMeasurePolicy.f978a, ComposeUiNode.Companion.g);
        Updater.b(composer, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
        Updater.b(composer, modifierD, ComposeUiNode.Companion.d);
        Function2 function2 = ComposeUiNode.Companion.j;
        if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
            b.z(p, composer, p, function2);
        }
        composer.f();
    }
}
