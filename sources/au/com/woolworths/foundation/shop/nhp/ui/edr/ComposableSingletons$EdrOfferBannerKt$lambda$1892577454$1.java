package au.com.woolworths.foundation.shop.nhp.ui.edr;

import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.foundation.shop.nhp.ui.edr.ComposableSingletons$EdrOfferBannerKt$lambda$-1892577454$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$EdrOfferBannerKt$lambda$1892577454$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$EdrOfferBannerKt$lambda$1892577454$1 d = new ComposableSingletons$EdrOfferBannerKt$lambda$1892577454$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierG = PaddingKt.g(SizeKt.z(companion, null, 3), 12, 8);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.e, Alignment.Companion.k, composer, 54);
            int p = composer.getP();
            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
            Modifier modifierD = ComposedModifierKt.d(composer, modifierG);
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
            EdrOfferBannerKt.h(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 10, BitmapDescriptorFactory.HUE_RED, 11), composer, 6);
            TextKt.a(StringResources_androidKt.c(composer, R.string.offer_activated_badge_label), CoreTheme.f(composer).f5120a.b.b, null, CoreTheme.a(composer).f4774a.b.b, null, 0, 0, false, 0, null, composer, 0, 1012);
            composer.f();
        }
        return Unit.f24250a;
    }
}
