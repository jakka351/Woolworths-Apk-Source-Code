package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.design.core.ui.component.stable.corerow.SimpleRowKt;
import au.com.woolworths.design.core.ui.component.stable.corerow.SwitchRowKt;
import au.com.woolworths.shop.checkout.domain.model.substitution.CheckoutSubstitutionPreferences;
import au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutSubstitutesRowKt {

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

    public static final void a(CheckoutSubstitutionPreferences preferences, Function1 onCheckedChange, Modifier modifier, Composer composer, int i) {
        Intrinsics.h(preferences, "preferences");
        String str = preferences.f10660a;
        Intrinsics.h(onCheckedChange, "onCheckedChange");
        ComposerImpl composerImplV = composer.v(1098527438);
        int i2 = i | (composerImplV.n(preferences) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onCheckedChange) ? 32 : 16;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            int iOrdinal = preferences.c.ordinal();
            if (iOrdinal == 0) {
                composerImplV.o(-1419624855);
                SwitchRowKt.a(str, true, onCheckedChange, modifier, preferences.b, null, null, null, null, composerImplV, ((i2 << 3) & 896) | 3120, 480);
                composerImplV.V(false);
            } else if (iOrdinal == 1) {
                composerImplV.o(-1419339624);
                SwitchRowKt.a(str, false, onCheckedChange, modifier, null, null, null, null, null, composerImplV, ((i2 << 3) & 896) | 3120, 496);
                composerImplV.V(false);
            } else {
                if (iOrdinal != 2) {
                    throw au.com.woolworths.android.onesite.a.w(-877080283, composerImplV, false);
                }
                composerImplV.o(-1419117230);
                String str2 = preferences.b;
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                if (objG == Composer.Companion.f1624a) {
                    objG = new h(20);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                SimpleRowKt.a(str, (Function0) objG, modifier, str2, null, null, null, null, null, composerImplV, 432, 496);
                composerImplV = composerImplV;
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(i, 18, preferences, onCheckedChange, modifier, false);
        }
    }
}
