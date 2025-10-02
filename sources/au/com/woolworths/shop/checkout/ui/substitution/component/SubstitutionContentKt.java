package au.com.woolworths.shop.checkout.ui.substitution.component;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.shop.checkout.domain.model.substitution.ProductToBeSubstituteSection;
import au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreference;
import au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreferenceOptionsSection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SubstitutionContentKt {
    public static final void a(final SubstitutionPreference substitutionPreference, final String str, final Function1 onOptionSelected, final Map map, final Function2 onProductSubstituteCheckedChange, final boolean z, final Function1 onCheaperSubstituteBannerDismiss, final Function0 onTryAgainClick, Composer composer, final int i) {
        SubstitutionPreferenceOptionsSection substitutionPreferenceOptionsSection = substitutionPreference.c;
        Intrinsics.h(onOptionSelected, "onOptionSelected");
        Intrinsics.h(onProductSubstituteCheckedChange, "onProductSubstituteCheckedChange");
        Intrinsics.h(onCheaperSubstituteBannerDismiss, "onCheaperSubstituteBannerDismiss");
        Intrinsics.h(onTryAgainClick, "onTryAgainClick");
        ComposerImpl composerImplV = composer.v(1235001496);
        int i2 = i | (composerImplV.I(substitutionPreference) ? 4 : 2) | (composerImplV.n(str) ? 32 : 16) | (composerImplV.I(onOptionSelected) ? 256 : 128) | (composerImplV.I(map) ? 2048 : 1024) | (composerImplV.I(onProductSubstituteCheckedChange) ? 16384 : 8192) | (composerImplV.p(z) ? 131072 : 65536) | (composerImplV.I(onCheaperSubstituteBannerDismiss) ? 1048576 : 524288) | (composerImplV.I(onTryAgainClick) ? 8388608 : 4194304);
        if ((4793491 & i2) == 4793490 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f = 16;
            Modifier modifierF = PaddingKt.f(ScrollKt.b(SizeKt.c, ScrollKt.a(composerImplV), true), f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            ProductToBeSubstituteSection productToBeSubstituteSection = substitutionPreference.f10664a;
            ProductSectionKt.a(productToBeSubstituteSection.f10663a, productToBeSubstituteSection.c, composerImplV, 0);
            BroadcastBannerData broadcastBannerData = substitutionPreference.b.f10658a;
            composerImplV.o(-1957441769);
            Modifier.Companion companion = Modifier.Companion.d;
            if (broadcastBannerData != null) {
                SpacerKt.a(composerImplV, SizeKt.g(companion, 8));
                CheaperSubtitutesBannerKt.a(broadcastBannerData, z, onCheaperSubstituteBannerDismiss, composerImplV, (i2 >> 12) & 1008);
            }
            composerImplV.V(false);
            SpacerKt.a(composerImplV, SizeKt.g(companion, f));
            String str2 = substitutionPreferenceOptionsSection.f10667a;
            InsetBannerApiData insetBannerApiData = substitutionPreferenceOptionsSection.b;
            int i4 = i2 << 9;
            PreferenceOptionSectionKt.b(str2, insetBannerApiData != null ? InsetBannerApiDataExtKt.toUiModel(insetBannerApiData) : null, substitutionPreferenceOptionsSection.c, str, onOptionSelected, substitutionPreference.d.f10662a, map, onProductSubstituteCheckedChange, onTryAgainClick, composerImplV, ((i2 << 3) & 234881024) | ((i2 << 6) & 64512) | (3670016 & i4) | (i4 & 29360128));
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(str, onOptionSelected, map, onProductSubstituteCheckedChange, z, onCheaperSubstituteBannerDismiss, onTryAgainClick, i) { // from class: au.com.woolworths.shop.checkout.ui.substitution.component.b
                public final /* synthetic */ String e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Map g;
                public final /* synthetic */ Function2 h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ Function1 j;
                public final /* synthetic */ Function0 k;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    SubstitutionContentKt.a(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
