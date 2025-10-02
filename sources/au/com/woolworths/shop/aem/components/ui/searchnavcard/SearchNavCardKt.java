package au.com.woolworths.shop.aem.components.ui.searchnavcard;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.design.core.ui.component.experimental.CardKt;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.shared.ui.compose.a;
import au.com.woolworths.shop.aem.components.model.searchnavcard.SearchNavCardData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchNavCardKt {
    public static final void a(final SearchNavCardData searchNavCardData, final Function1 function1, final Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        ComposerImpl composerImplV = composer.v(-1405840650);
        int i4 = (composerImplV.I(searchNavCardData) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= composerImplV.I(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | KyberEngine.KyberPolyBytes;
        } else {
            i3 = i4 | (composerImplV.n(modifier) ? 256 : 128);
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (i5 != 0) {
                modifier = Modifier.Companion.d;
            }
            composerImplV.o(346616589);
            StringBuilder sb = new StringBuilder();
            sb.append(StringResources_androidKt.c(composerImplV, R.string.aem_search_bar_recipes_content_description_prefix));
            String str = searchNavCardData.f10181a;
            if (str != null) {
                sb.append(str);
            }
            final String string = sb.toString();
            composerImplV.V(false);
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(1741061970, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.searchnavcard.SearchNavCardKt$SearchNavCard$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierA = TestTagKt.a(modifier, "searchNavCard");
                        composer2.o(5004770);
                        String str2 = string;
                        boolean zN = composer2.n(str2);
                        Object objG = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (zN || objG == composer$Companion$Empty$1) {
                            objG = new a(str2, 11);
                            composer2.A(objG);
                        }
                        composer2.l();
                        Modifier modifierB = SemanticsModifierKt.b(modifierA, true, (Function1) objG);
                        CoreElevation coreElevation = CoreTheme.c(composer2).c;
                        composer2.o(-1633490746);
                        Function1 function12 = function1;
                        boolean zN2 = composer2.n(function12);
                        final SearchNavCardData searchNavCardData2 = searchNavCardData;
                        boolean zI = zN2 | composer2.I(searchNavCardData2);
                        Object objG2 = composer2.G();
                        if (zI || objG2 == composer$Companion$Empty$1) {
                            objG2 = new au.com.woolworths.sdui.common.alert.a(15, function12, searchNavCardData2);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        CardKt.b((Function0) objG2, modifierB, false, null, 0L, 0L, 0L, 0L, coreElevation, null, null, ComposableLambdaKt.c(-1709770249, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.searchnavcard.SearchNavCardKt$SearchNavCard$1.3
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                ColumnScope Card = (ColumnScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(Card, "$this$Card");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    Modifier.Companion companion = Modifier.Companion.d;
                                    float f = 16;
                                    Modifier modifierH = PaddingKt.h(SizeKt.g(companion, 46), f, BitmapDescriptorFactory.HUE_RED, 2);
                                    RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer3, 48);
                                    int p = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                    Modifier modifierD = ComposedModifierKt.d(composer3, modifierH);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function0 = ComposeUiNode.Companion.b;
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function0);
                                    } else {
                                        composer3.e();
                                    }
                                    Updater.b(composer3, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                                    Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                    Function2 function2 = ComposeUiNode.Companion.j;
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                        b.z(p, composer3, p, function2);
                                    }
                                    Updater.b(composer3, modifierD, ComposeUiNode.Companion.d);
                                    IconKt.b(SearchKt.a(), null, SizeKt.q(companion, 24), CoreTheme.b(composer3).c.c.f4824a.f4825a.f4826a, composer3, 432, 0);
                                    String str3 = searchNavCardData2.f10181a;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    String str4 = str3;
                                    TextStyle textStyle = CoreTheme.f(composer3).f5120a.f5121a.f5122a;
                                    Modifier modifierE = SizeKt.e(companion, 1.0f);
                                    composer3.o(1849434622);
                                    Object objG3 = composer3.G();
                                    if (objG3 == Composer.Companion.f1624a) {
                                        objG3 = new au.com.woolworths.shop.aem.components.ui.merchcard.a(13);
                                        composer3.A(objG3);
                                    }
                                    composer3.l();
                                    TextKt.a(str4, textStyle, PaddingKt.j(SemanticsModifierKt.b(modifierE, false, (Function1) objG3), f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), CoreTheme.b(composer3).e.c.b, null, 0, 0, false, 0, null, composer3, 0, 1008);
                                    composer3.f();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 0, 1788);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.base.rewards.account.ui.a((Object) searchNavCardData, (Function) function1, modifier2, i, i2, 26);
        }
    }
}
