package au.com.woolworths.feature.shop.countryselector.ui;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.core.ui.component.experimental.CardKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a;
import au.com.woolworths.feature.shop.contentpage.ui.n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Iterator;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/common/Region;", "region", "country-selector_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CountrySelectorUiKt {
    public static final void a(final Region region, boolean z, Function1 function1, Composer composer, int i) {
        int i2;
        long j;
        long j2;
        boolean z2;
        BorderStroke borderStroke;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(775144162);
        if ((i & 6) == 0) {
            i2 = (composerImplV.r(region.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function1) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            String strB = StringResources_androidKt.b(z ? R.string.content_description_country_selector_item_selected : R.string.content_description_country_selector_item_not_selected, new Object[]{region.e}, composerImplV);
            Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
            composerImplV.o(-1633490746);
            int i3 = i2 & 14;
            boolean zN = (i3 == 4) | composerImplV.n(strB);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zN || objG == composer$Companion$Empty$1) {
                objG = new a(4, region, strB);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierA = SemanticsModifierKt.a(modifierE, (Function1) objG);
            CoreElevation coreElevation = CoreTheme.c(composerImplV).f4876a;
            if (z) {
                composerImplV.o(-1718596468);
                j = CoreTheme.b(composerImplV).c.f4812a.f4813a.f4814a.b;
                composerImplV.V(false);
            } else {
                composerImplV.o(-1718507126);
                j = CoreTheme.b(composerImplV).c.f4812a.f4813a.b.f4816a;
                composerImplV.V(false);
            }
            if (z) {
                composerImplV.o(-1718339044);
                j2 = j;
                BorderStroke borderStrokeA = BorderStrokeKt.a(CoreTheme.b(composerImplV).c.b.f4820a.f4821a.f4822a, 1);
                composerImplV.V(false);
                borderStroke = borderStrokeA;
                z2 = true;
            } else {
                j2 = j;
                composerImplV.o(-1718233830);
                z2 = true;
                BorderStroke borderStrokeA2 = BorderStrokeKt.a(CoreTheme.b(composerImplV).c.b.f4820a.b.f4823a, 1);
                composerImplV.V(false);
                borderStroke = borderStrokeA2;
            }
            composerImplV.o(-1633490746);
            boolean z3 = ((i2 & 896) == 256 ? z2 : false) | (i3 == 4 ? z2 : false);
            Object objG2 = composerImplV.G();
            if (z3 || objG2 == composer$Companion$Empty$1) {
                objG2 = new n(2, function1, region);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            CardKt.b((Function0) objG2, modifierA, false, null, j2, 0L, 0L, 0L, coreElevation, borderStroke, null, ComposableLambdaKt.c(-989499257, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.countryselector.ui.CountrySelectorUiKt$CountrySelectorItem$3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope Card = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(Card, "$this$Card");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = 16;
                        Modifier modifierF = PaddingKt.f(Modifier.Companion.d, f);
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer2, 48);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierF);
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
                            b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        Region region2 = region;
                        ImageKt.a(PainterResources_androidKt.a(region2.g, 0, composer2), null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, composer2, 48, 124);
                        SpacerKt.b(f, composer2, 6);
                        TextKt.a(region2.e, CoreTheme.f(composer2).f5120a.f5121a.b, null, CoreTheme.b(composer2).c.c.f4824a.b.f4827a, null, 0, 0, false, 0, null, composer2, 0, 1012);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 0, 1260);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.filter.b(region, z, function1, i, 6);
        }
    }

    public static final void b(Region region, Function1 onRegionSelected, Modifier modifier, Composer composer, int i, int i2) {
        Intrinsics.h(onRegionSelected, "onRegionSelected");
        ComposerImpl composerImplV = composer.v(529251032);
        int i3 = (composerImplV.r(region == null ? -1 : region.ordinal()) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= composerImplV.I(onRegionSelected) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion.d;
            }
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(16), Alignment.Companion.m, composerImplV, 6);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(2040579867);
            Iterator it = ((AbstractList) Region.l).iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                Region region2 = (Region) it.next();
                if (region2 == region) {
                    z = true;
                }
                a(region2, z, onRegionSelected, composerImplV, (i3 << 3) & 896);
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.base.rewards.account.ui.a((Object) region, (Function) onRegionSelected, modifier2, i, i2, 6);
        }
    }
}
