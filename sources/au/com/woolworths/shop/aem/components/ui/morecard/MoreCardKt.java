package au.com.woolworths.shop.aem.components.ui.morecard;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.shop.aem.components.model.morecard.MoreCardData;
import au.com.woolworths.shop.aem.components.model.morecard.MoreCardStyle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MoreCardKt {
    public static final void a(final MoreCardData moreCardData, final String contentDescription, final Function1 onCardClick, Modifier modifier, Composer composer, int i, int i2) {
        final Modifier modifier2;
        Intrinsics.h(contentDescription, "contentDescription");
        Intrinsics.h(onCardClick, "onCardClick");
        ComposerImpl composerImplV = composer.v(-770139099);
        int i3 = (composerImplV.I(moreCardData) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= composerImplV.n(contentDescription) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(onCardClick) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerImplV.n(modifier) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            modifier2 = i4 != 0 ? Modifier.Companion.d : modifier;
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(117363017, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.morecard.MoreCardKt$MoreCardUi$1

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    static {
                        int[] iArr = new int[MoreCardStyle.values().length];
                        try {
                            iArr[1] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            MoreCardStyle moreCardStyle = MoreCardStyle.d;
                            iArr[0] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final MoreCardData moreCardData2 = moreCardData;
                        int iOrdinal = moreCardData2.d.ordinal();
                        Modifier modifier3 = modifier2;
                        String str = contentDescription;
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        final Function1 function1 = onCardClick;
                        if (iOrdinal == 0) {
                            composer2.o(1116719776);
                            composer2.o(-1633490746);
                            boolean zN = composer2.n(function1) | composer2.I(moreCardData2);
                            Object objG = composer2.G();
                            if (zN || objG == composer$Companion$Empty$1) {
                                final int i5 = 1;
                                objG = new Function0() { // from class: au.com.woolworths.shop.aem.components.ui.morecard.b
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i5) {
                                            case 0:
                                                function1.invoke(moreCardData2);
                                                break;
                                            default:
                                                function1.invoke(moreCardData2);
                                                break;
                                        }
                                        return Unit.f24250a;
                                    }
                                };
                                composer2.A(objG);
                            }
                            composer2.l();
                            MoreCardKt.b(0, composer2, modifier3, str, (Function0) objG);
                            composer2.l();
                        } else {
                            if (iOrdinal != 1) {
                                throw au.com.woolworths.android.onesite.a.x(composer2, 1116710455);
                            }
                            composer2.o(1116712448);
                            composer2.o(-1633490746);
                            boolean zN2 = composer2.n(function1) | composer2.I(moreCardData2);
                            Object objG2 = composer2.G();
                            if (zN2 || objG2 == composer$Companion$Empty$1) {
                                final int i6 = 0;
                                objG2 = new Function0() { // from class: au.com.woolworths.shop.aem.components.ui.morecard.b
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i6) {
                                            case 0:
                                                function1.invoke(moreCardData2);
                                                break;
                                            default:
                                                function1.invoke(moreCardData2);
                                                break;
                                        }
                                        return Unit.f24250a;
                                    }
                                };
                                composer2.A(objG2);
                            }
                            composer2.l();
                            MoreCardKt.c(0, composer2, modifier3, str, (Function0) objG2);
                            composer2.l();
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.chip.b((Object) moreCardData, (Object) contentDescription, (Object) onCardClick, modifier2, i, i2, 19);
        }
    }

    public static final void b(int i, Composer composer, Modifier modifier, String str, Function0 function0) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-108256050);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.I(function0) ? 32 : 16) | (composerImplV.n(modifier) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Modifier modifierQ = SizeKt.q(modifier, 90);
            composerImplV.o(5004770);
            boolean z = (i2 & 14) == 4;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.shared.ui.compose.a(str, 9);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            CardKt.b(function0, SemanticsModifierKt.b(modifierQ, true, (Function1) objG), false, RoundedCornerShapeKt.f1100a, 0L, 0L, null, 8, null, ComposableSingletons$MoreCardKt.c, composerImpl, ((i2 >> 3) & 14) | 817889280, 372);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(str, function0, modifier, i, 1);
        }
    }

    public static final void c(int i, Composer composer, Modifier modifier, String str, Function0 function0) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1265437623);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.I(function0) ? 32 : 16) | (composerImplV.n(modifier) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(5004770);
            boolean z = (i2 & 14) == 4;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.shared.ui.compose.a(str, 8);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            CardKt.b(function0, SemanticsModifierKt.b(modifier, true, (Function1) objG), false, RoundedCornerShapeKt.b(12), 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, null, ComposableSingletons$MoreCardKt.b, composerImpl, ((i2 >> 3) & 14) | 805306368, 500);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(str, function0, modifier, i, 0);
        }
    }
}
