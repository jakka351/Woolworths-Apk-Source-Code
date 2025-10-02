package au.com.woolworths.shared.ui.compose.breadcrumb;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.recipes.details.ui.i;
import au.com.woolworths.sdui.legacy.banner.c;
import au.com.woolworths.shared.ui.compose.a;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shared-ui-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProgressStepItemsKt {
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r43, java.lang.String r44, boolean r45, androidx.compose.runtime.Composer r46, int r47) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shared.ui.compose.breadcrumb.ProgressStepItemsKt.a(java.lang.String, java.lang.String, boolean, androidx.compose.runtime.Composer, int):void");
    }

    public static final void b(final List list, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-786977275);
        if (((i | KyberEngine.KyberPolyBytes) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-310792894, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shared.ui.compose.breadcrumb.ProgressStepItemsKt$ProgressStepItems$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final List list2 = list;
                        String strB = StringResources_androidKt.b(R.string.breadcrumb_bar_content_description, new Object[]{list2.get(1)}, composer2);
                        float f = 16;
                        Modifier modifierF = PaddingKt.f(SizeKt.e(Modifier.Companion.d, 1.0f), f);
                        composer2.o(1849434622);
                        Object objG = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (objG == composer$Companion$Empty$1) {
                            objG = new c(11);
                            composer2.A(objG);
                        }
                        composer2.l();
                        Modifier modifierB = SemanticsModifierKt.b(modifierF, true, (Function1) objG);
                        composer2.o(5004770);
                        boolean zN = composer2.n(strB);
                        Object objG2 = composer2.G();
                        if (zN || objG2 == composer$Companion$Empty$1) {
                            objG2 = new a(strB, 2);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        Modifier modifierA = SemanticsModifierKt.a(modifierB, (Function1) objG2);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        FlowLayoutKt.b(modifierA, Arrangement.g, Arrangement.i(f, Alignment.Companion.k), null, 0, 0, ComposableLambdaKt.c(1322937533, new Function3<FlowRowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shared.ui.compose.breadcrumb.ProgressStepItemsKt$ProgressStepItems$1.3
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                FlowRowScope FlowRow = (FlowRowScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(FlowRow, "$this$FlowRow");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    int i2 = 0;
                                    for (Object obj6 : list2) {
                                        int i3 = i2 + 1;
                                        if (i2 < 0) {
                                            CollectionsKt.z0();
                                            throw null;
                                        }
                                        String str = (String) obj6;
                                        String strValueOf = String.valueOf(i3);
                                        boolean z = true;
                                        if (i2 != 1) {
                                            z = false;
                                        }
                                        ProgressStepItemsKt.a(strValueOf, str, z, composer3, 0);
                                        i2 = i3;
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 1573296, 56);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            modifier = Modifier.Companion.d;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new i(list, modifier, i, 5);
        }
    }
}
