package au.com.woolworths.design.core.ui.component.stable.snackbar;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ShapesKt;
import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreShadowKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$SnackbarHostKt$lambda$1768203053$1 implements Function3<SnackbarData, Composer, Integer, Unit> {
    public static final ComposableSingletons$SnackbarHostKt$lambda$1768203053$1 d = new ComposableSingletons$SnackbarHostKt$lambda$1768203053$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        final SnackbarData snackbarData = (SnackbarData) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(snackbarData, "it");
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.n(snackbarData) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && composer.c()) {
            composer.j();
        } else {
            Intrinsics.h(snackbarData, "snackbarData");
            composer.o(78599701);
            final String b = snackbarData.getF4769a().getB();
            boolean zA = snackbarData.getF4769a().a();
            composer.o(-1775087570);
            ComposableLambdaImpl composableLambdaImplC = b != null ? ComposableLambdaKt.c(1041141623, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarKt$Snackbar$actionComposable$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    Composer composer2 = (Composer) obj4;
                    if ((((Number) obj5).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        PaddingValuesImpl paddingValuesImpl = ButtonDefaults.f1404a;
                        ButtonColors buttonColorsB = ButtonDefaults.b(0L, CoreTheme.b(composer2).f4782a.d.b.c.f4799a, composer2, 13);
                        composer2.o(5004770);
                        final SnackbarData snackbarData2 = snackbarData;
                        boolean zN = composer2.n(snackbarData2);
                        Object objG = composer2.G();
                        if (zN || objG == Composer.Companion.f1624a) {
                            objG = new e(snackbarData2, 1);
                            composer2.A(objG);
                        }
                        composer2.l();
                        final String str = b;
                        ButtonKt.b((Function0) objG, null, false, null, buttonColorsB, null, ComposableLambdaKt.c(171218330, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarKt$Snackbar$actionComposable$1.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                RowScope TextButton = (RowScope) obj6;
                                Composer composer3 = (Composer) obj7;
                                int iIntValue2 = ((Number) obj8).intValue();
                                Intrinsics.h(TextButton, "$this$TextButton");
                                if ((iIntValue2 & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    composer3.o(5004770);
                                    SnackbarData snackbarData3 = snackbarData2;
                                    boolean zN2 = composer3.n(snackbarData3);
                                    Object objG2 = composer3.G();
                                    if (zN2 || objG2 == Composer.Companion.f1624a) {
                                        objG2 = new e(snackbarData3, 2);
                                        composer3.A(objG2);
                                    }
                                    composer3.l();
                                    Modifier modifierD = ClickableKt.d(Modifier.Companion.d, false, null, null, (Function0) objG2, 7);
                                    long j = CoreTheme.b(composer3).f4782a.d.b.c.f4799a;
                                    TextKt.a(str, CoreTheme.f(composer3).f5120a.b.b, modifierD, j, null, 0, 0, false, 0, null, composer3, 0, 1008);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 805306368, 494);
                    }
                    return Unit.f24250a;
                }
            }, composer) : null;
            composer.l();
            androidx.compose.material3.SnackbarKt.a(CoreShadowKt.a(PaddingKt.f(Modifier.Companion.d, 12), CoreTheme.c(composer).c, RoundedCornerShapeKt.b(4)), composableLambdaImplC, null, zA, ShapesKt.b(SnackbarTokens.b, composer), CoreTheme.b(composer).e.f4848a.b.f4851a, CoreTheme.b(composer).e.d.c.b, CoreTheme.b(composer).f4782a.d.b.c.f4799a, 0L, ComposableLambdaKt.c(1977569776, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarKt$Snackbar$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    Composer composer2 = (Composer) obj4;
                    if ((((Number) obj5).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        TextKt.a(snackbarData.getF4769a().getF4770a(), CoreTheme.f(composer2).f5120a.b.f5123a, PaddingKt.h(SizeKt.e(Modifier.Companion.d, 1.0f), BitmapDescriptorFactory.HUE_RED, 8, 1), CoreTheme.b(composer2).e.d.c.b, null, 0, 0, false, 0, null, composer2, KyberEngine.KyberPolyBytes, 1008);
                    }
                    return Unit.f24250a;
                }
            }, composer), composer, 805306368, 260);
            composer.l();
        }
        return Unit.f24250a;
    }
}
