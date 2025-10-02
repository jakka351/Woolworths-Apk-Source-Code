package au.com.woolworths.feature.shop.inbox.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.StringKt;
import androidx.compose.ui.text.intl.Locale;
import au.com.woolworths.design.core.ui.component.stable.textbutton.TextButtonKt;
import au.com.woolworths.design.core.ui.component.stable.textbutton.TextButtonSpec;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.homepage.presentation.modeselector.d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"inbox_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationsTitleHeaderKt {
    public static final void a(int i, int i2, Composer composer, Modifier modifier, final Function0 onClearAllClick, final boolean z) {
        Intrinsics.h(onClearAllClick, "onClearAllClick");
        ComposerImpl composerImplV = composer.v(-1113384120);
        int i3 = i | 6;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 54;
        } else if ((i & 48) == 0) {
            i3 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(onClearAllClick) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (i4 != 0) {
                z = false;
            }
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(-1323045780, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.inbox.ui.NotificationsTitleHeaderKt$NotificationsTitleHeader$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        long j = CoreTheme.b(composer2).e.f4848a.d;
                        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierJ = PaddingKt.j(SizeKt.b(SizeKt.e(BackgroundKt.b(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f), BitmapDescriptorFactory.HUE_RED, 48, 1), 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g, Alignment.Companion.k, composer2, 54);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierJ);
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
                        TextKt.b(StringResources_androidKt.c(composer2, R.string.inbox_notifications_header_title), null, CoreTheme.b(composer2).e.d.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer2).f5120a.f5121a.b, composer2, 0, 0, 65530);
                        composer2.o(926859316);
                        if (!z) {
                            composer2.o(1849434622);
                            Object objG = composer2.G();
                            if (objG == Composer.Companion.f1624a) {
                                objG = new d(15);
                                composer2.A(objG);
                            }
                            composer2.l();
                            TextButtonKt.a(onClearAllClick, StringKt.a(StringResources_androidKt.c(composer2, R.string.inbox_action_clear_all), Locale.Companion.a()), SemanticsModifierKt.a(companion, (Function1) objG), false, null, null, TextButtonSpec.Size.e, null, composer2, 12582912, 376);
                        }
                        composer2.l();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            modifier = Modifier.Companion.d;
        }
        Modifier modifier2 = modifier;
        boolean z2 = z;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(modifier2, z2, onClearAllClick, i, i2);
        }
    }
}
