package au.com.woolworths.shop.checkout.ui.substitution.component;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.RadioButtonKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.design.core.ui.component.experimental.CardKt;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertKt;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertSpec;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle;
import au.com.woolworths.design.core.ui.component.stable.alert.Placement;
import au.com.woolworths.design.core.ui.component.stable.corerow.RadioRowKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.product.list.compose.filter.i;
import au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreferenceOption;
import au.com.woolworths.shop.checkout.ui.details.c;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PreferenceOptionSectionKt {
    public static final void a(String str, boolean z, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(964152948);
        int i2 = (composerImplV.n(str) ? 4 : 2) | i | (composerImplV.p(z) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 16;
            Modifier modifierJ = PaddingKt.j(SizeKt.i(SizeKt.e(companion, 1.0f), 56, BitmapDescriptorFactory.HUE_RED, 2), f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            BiasAlignment.Vertical vertical = Alignment.Companion.k;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$1, vertical, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierJ);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            float f2 = 8;
            RadioButtonKt.a(z, null, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f2, f, f2, 1), false, null, composerImplV, ((i2 >> 3) & 14) | 3120);
            Modifier modifierJ2 = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f2, f, f2, 1);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            TextKt.a(str, CoreTheme.f(composerImplV).f5120a.f5121a.f5122a, rowScopeInstance.a(rowScopeInstance.b(modifierJ2, vertical), 1.0f, true), CoreTheme.b(composerImplV).d.d.b, null, 0, 0, false, 0, null, composerImplV, i2 & 14, 1008);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.navigation.compose.internal.a(i, 3, str, z);
        }
    }

    public static final void b(String str, InsetBannerData insetBannerData, final List list, String str2, final Function1 onOptionSelected, List list2, final Map map, final Function2 onProductSubstituteCheckedChange, Function0 onTryAgainClick, Composer composer, int i) {
        int i2;
        String str3;
        List list3;
        ComposerImpl composerImpl;
        Intrinsics.h(onOptionSelected, "onOptionSelected");
        Intrinsics.h(onProductSubstituteCheckedChange, "onProductSubstituteCheckedChange");
        Intrinsics.h(onTryAgainClick, "onTryAgainClick");
        ComposerImpl composerImplV = composer.v(-1296966161);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(insetBannerData) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            str3 = str2;
            i2 |= composerImplV.n(str3) ? 2048 : 1024;
        } else {
            str3 = str2;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(onOptionSelected) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            list3 = list2;
            i2 |= composerImplV.I(list3) ? 131072 : 65536;
        } else {
            list3 = list2;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(map) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.I(onProductSubstituteCheckedChange) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerImplV.I(onTryAgainClick) ? 67108864 : 33554432;
        }
        if ((38347923 & i2) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
            ComposeUiNode.e3.getClass();
            int i4 = i2;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.a(str, CoreTheme.f(composerImplV).f5120a.b.b, null, CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, i4 & 14, 1012);
            composerImpl = composerImplV;
            float f = 16;
            SpacerKt.a(composerImpl, SizeKt.g(companion, f));
            composerImpl.o(68098118);
            if (insetBannerData != null) {
                AlertStyle alertStyle = AlertStyle.d;
                Placement placement = Placement.d;
                Text f2 = insetBannerData.getF();
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = AndroidCompositionLocals_androidKt.b;
                String string = f2.getText((Context) composerImpl.x(staticProvidableCompositionLocal)).toString();
                Text textA = insetBannerData.getE().a();
                composerImpl.o(68106408);
                AlertSpec.Action action = textA == null ? null : new AlertSpec.Action(false, textA.getText((Context) composerImpl.x(staticProvidableCompositionLocal)).toString(), onTryAgainClick);
                composerImpl.V(false);
                AlertKt.c(alertStyle, placement, null, action, null, string, null, composerImpl, 54, 84);
                SpacerKt.a(composerImpl, SizeKt.g(companion, f));
            }
            composerImpl.V(false);
            final String str4 = str3;
            final List list4 = list3;
            CardKt.a(null, RoundedCornerShapeKt.b(8), 0L, 0L, CoreTheme.c(composerImpl).f4876a, null, ComposableLambdaKt.c(216454630, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.substitution.component.PreferenceOptionSectionKt$PreferenceOptionSection$1$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer2;
                    int i5;
                    int i6;
                    ColumnScope Card = (ColumnScope) obj;
                    Composer composer3 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(Card, "$this$Card");
                    if ((iIntValue & 17) == 16 && composer3.c()) {
                        composer3.j();
                    } else {
                        Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
                        int i7 = 0;
                        ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer3, 0);
                        int p = composer3.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer3, modifierE);
                        ComposeUiNode.e3.getClass();
                        Function0 function02 = ComposeUiNode.Companion.b;
                        if (composer3.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer3.i();
                        if (composer3.getO()) {
                            composer3.K(function02);
                        } else {
                            composer3.e();
                        }
                        Updater.b(composer3, columnMeasurePolicyA2, ComposeUiNode.Companion.g);
                        Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function22 = ComposeUiNode.Companion.j;
                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer3, p, function22);
                        }
                        Updater.b(composer3, modifierD2, ComposeUiNode.Companion.d);
                        composer3.o(1875852903);
                        List list5 = list;
                        int i8 = 0;
                        for (Object obj4 : list5) {
                            int i9 = i8 + 1;
                            if (i8 < 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            SubstitutionPreferenceOption substitutionPreferenceOption = (SubstitutionPreferenceOption) obj4;
                            String str5 = substitutionPreferenceOption.f10666a;
                            int i10 = i8;
                            String str6 = substitutionPreferenceOption.b;
                            boolean zC = Intrinsics.c(str4, str5);
                            if (substitutionPreferenceOption.d) {
                                composer3.o(-883503773);
                                composer3.o(-1633490746);
                                Function1 function1 = onOptionSelected;
                                boolean zN = composer3.n(function1) | composer3.n(substitutionPreferenceOption);
                                Object objG = composer3.G();
                                if (zN || objG == Composer.Companion.f1624a) {
                                    objG = new c(9, function1, substitutionPreferenceOption);
                                    composer3.A(objG);
                                }
                                Function0 function03 = (Function0) objG;
                                composer3.l();
                                composer2 = composer3;
                                i5 = i10;
                                RadioRowKt.a(str6, zC, function03, null, zC ? substitutionPreferenceOption.e : null, null, null, null, null, composer2, 0, 488);
                                if (substitutionPreferenceOption.f && zC) {
                                    i6 = 0;
                                    ProductSubstituteItemKt.b(list4, map, onProductSubstituteCheckedChange, composer2, 0);
                                } else {
                                    i6 = 0;
                                }
                                composer2.l();
                            } else {
                                composer3.o(-883715906);
                                PreferenceOptionSectionKt.a(str6, zC, composer3, i7);
                                composer3.l();
                                i5 = i10;
                                composer2 = composer3;
                                i6 = i7;
                            }
                            composer2.o(1875887574);
                            if (i5 != CollectionsKt.I(list5)) {
                                DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, CoreTheme.b(composer2).e.b.e, composer2, null);
                            }
                            composer2.l();
                            i7 = i6;
                            composer3 = composer2;
                            i8 = i9;
                        }
                        Composer composer4 = composer3;
                        composer4.l();
                        composer4.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImpl), composerImpl, 1572864, 45);
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new i(str, insetBannerData, list, str2, onOptionSelected, list2, map, onProductSubstituteCheckedChange, onTryAgainClick, i);
        }
    }
}
