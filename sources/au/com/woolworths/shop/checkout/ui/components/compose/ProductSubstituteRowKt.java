package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.design.core.ui.component.stable.corerow.CheckboxRowKt;
import au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec;
import au.com.woolworths.design.core.ui.component.stable.corerow.SimpleRowKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.o;
import au.com.woolworths.shop.checkout.domain.model.substitution.CheckoutProductSubstitutionPreference;
import au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductSubstituteRowKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[SubstitutionState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SubstitutionState substitutionState = SubstitutionState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SubstitutionState substitutionState2 = SubstitutionState.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final void a(String str, String str2, String str3, Function0 function0, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(881727637);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function0) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            SimpleRowKt.a(str2, function0, null, null, str, new CoreRowSpec.Image.LocalImage(CoreTheme.e(composerImplV).f4879a.v, null, BitmapDescriptorFactory.HUE_RED, 6), new CoreRowSpec.Image.LocalImage(CoreTheme.e(composerImplV).e.n, null, BitmapDescriptorFactory.HUE_RED, 6), new CoreRowSpec.TrailingDisplay.Text(str3), null, composerImplV, ((i2 >> 3) & 14) | ((i2 >> 6) & 112) | ((i2 << 12) & 57344), 268);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new o(str, str2, str3, function0, i, 1);
        }
    }

    public static final void b(CheckoutProductSubstitutionPreference preference, Function1 onSubstituteChange, Function0 onEditTap, Composer composer, int i) {
        Intrinsics.h(preference, "preference");
        String str = preference.c;
        ButtonApiData buttonApiData = preference.d;
        SubstitutionState substitutionState = preference.f10659a;
        Intrinsics.h(onSubstituteChange, "onSubstituteChange");
        Intrinsics.h(onEditTap, "onEditTap");
        ComposerImpl composerImplV = composer.v(-1321830207);
        int i2 = i | (composerImplV.I(preference) ? 4 : 2) | (composerImplV.I(onSubstituteChange) ? 32 : 16) | (composerImplV.I(onEditTap) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            int iOrdinal = substitutionState.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                composerImplV.o(1911722203);
                c(substitutionState == SubstitutionState.d, onSubstituteChange, str, buttonApiData.getLabel(), onEditTap, composerImplV, (i2 & 112) | (57344 & (i2 << 6)));
                composerImplV.V(false);
            } else {
                if (iOrdinal != 2) {
                    throw au.com.woolworths.android.onesite.a.w(1031497139, composerImplV, false);
                }
                composerImplV.o(1912079230);
                a(preference.b, str, buttonApiData.getLabel(), onEditTap, composerImplV, (i2 << 3) & 7168);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.marketplace.ui.personalised.b(preference, onSubstituteChange, onEditTap, i, 25);
        }
    }

    public static final void c(boolean z, Function1 function1, String str, String str2, Function0 function0, Composer composer, int i) {
        boolean z2;
        int i2;
        String str3;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-2019689349);
        if ((i & 6) == 0) {
            z2 = z;
            i2 = (composerImplV.p(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function1) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            str3 = str;
            i2 |= composerImplV.n(str3) ? 256 : 128;
        } else {
            str3 = str;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function0) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            int i3 = i2 << 3;
            int i4 = ((i2 >> 6) & 14) | (i3 & 112) | (i3 & 896) | ((i2 << 9) & 29360128);
            composerImpl = composerImplV;
            CheckboxRowKt.b(str3, z2, function1, null, false, function0, new CoreRowSpec.Image.LocalImage(CoreTheme.e(composerImplV).e.n, null, BitmapDescriptorFactory.HUE_RED, 6), new CoreRowSpec.TrailingDisplay.Text(str2), null, composerImpl, i4);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.card.unlock.a(z, function1, str, str2, function0, i);
        }
    }
}
