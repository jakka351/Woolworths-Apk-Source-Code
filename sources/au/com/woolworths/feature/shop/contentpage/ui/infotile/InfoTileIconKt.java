package au.com.woolworths.feature.shop.contentpage.ui.infotile;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.compose.utils.modifier.ConditionalModifierKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.catalogue.browse.page.promotion.b;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileIcon;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileIconSlot;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileIconSlotSize;
import coil3.compose.SingletonAsyncImageKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"content-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InfoTileIconKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[InfoTileIconSlotSize.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InfoTileIconSlotSize infoTileIconSlotSize = InfoTileIconSlotSize.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final void a(InfoTileIconSlotSize infoTileIconSlotSize, String str, Modifier modifier, Composer composer, int i) {
        TextStyle textStyle;
        int i2;
        Modifier modifierB;
        ComposerImpl composerImplV = composer.v(818839352);
        int i3 = i | (composerImplV.r(infoTileIconSlotSize.ordinal()) ? 4 : 2) | (composerImplV.n(str) ? 32 : 16) | (composerImplV.n(modifier) ? 256 : 128);
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            int iOrdinal = infoTileIconSlotSize.ordinal();
            if (iOrdinal == 0) {
                composerImplV.o(925610431);
                textStyle = CoreTheme.f(composerImplV).e.f5133a.b;
                composerImplV.V(false);
            } else {
                if (iOrdinal != 1) {
                    throw a.w(925607477, composerImplV, false);
                }
                composerImplV.o(925612958);
                textStyle = CoreTheme.f(composerImplV).d.c.f5132a;
                composerImplV.V(false);
            }
            int iOrdinal2 = infoTileIconSlotSize.ordinal();
            if (iOrdinal2 == 0) {
                i2 = 5;
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 3;
            }
            long j = CoreTheme.b(composerImplV).e.d.d;
            composerImplV.o(349107162);
            if (infoTileIconSlotSize == InfoTileIconSlotSize.e) {
                modifierB = BackgroundKt.b(modifier, CoreTheme.b(composerImplV).e.f4848a.d, RoundedCornerShapeKt.f1100a);
            } else {
                if (infoTileIconSlotSize != InfoTileIconSlotSize.d) {
                    throw new NoWhenBranchMatchedException();
                }
                modifierB = modifier;
            }
            composerImplV.V(false);
            TextKt.a(str, textStyle, modifierB, j, null, i2, 0, false, 1, null, composerImplV, ((i3 >> 3) & 14) | 100663296, 720);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(infoTileIconSlotSize, str, modifier, i, 18);
        }
    }

    public static final void b(InfoTileIconSlot iconSlotSpec, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.h(iconSlotSpec, "iconSlotSpec");
        ComposerImpl composerImplV = composer.v(-652726123);
        int i4 = (composerImplV.n(iconSlotSpec) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (composerImplV.n(modifier) ? 32 : 16);
        }
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (i5 != 0) {
                modifier = Modifier.Companion.d;
            }
            InfoTileIcon infoTileIcon = iconSlotSpec.f7029a;
            if (infoTileIcon instanceof InfoTileIcon.InfoTileBadge) {
                composerImplV.o(-2046779303);
                a(iconSlotSpec.b, ((InfoTileIcon.InfoTileBadge) infoTileIcon).f7028a, c(modifier, iconSlotSpec, composerImplV), composerImplV, 0);
                composerImplV.V(false);
            } else {
                if (!(infoTileIcon instanceof InfoTileIcon.HostedIcon)) {
                    throw a.w(-204574475, composerImplV, false);
                }
                composerImplV.o(-2046523522);
                String str = ((InfoTileIcon.HostedIcon) infoTileIcon).f7027a;
                Modifier modifierC = c(modifier, iconSlotSpec, composerImplV);
                boolean zBooleanValue = ((Boolean) composerImplV.x(InspectionModeKt.f1972a)).booleanValue();
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                if (objG == Composer.Companion.f1624a) {
                    objG = new b(22);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                SingletonAsyncImageKt.a(str, null, ConditionalModifierKt.b(modifierC, zBooleanValue, (Function1) objG, null, 4), null, null, composerImplV, 48, 2040);
                composerImplV.V(false);
            }
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.b(iconSlotSpec, modifier2, i, i2, 25);
        }
    }

    public static final Modifier c(Modifier modifier, InfoTileIconSlot infoTileIconSlot, Composer composer) {
        Modifier modifierU;
        composer.o(559870647);
        InfoTileIcon infoTileIcon = infoTileIconSlot.f7029a;
        InfoTileIconSlotSize infoTileIconSlotSize = infoTileIconSlot.b;
        boolean z = infoTileIcon instanceof InfoTileIcon.HostedIcon;
        Modifier.Companion companion = Modifier.Companion.d;
        if (z) {
            int iOrdinal = infoTileIconSlotSize.ordinal();
            if (iOrdinal == 0) {
                modifierU = SizeKt.q(companion, 44);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                modifierU = SizeKt.q(companion, 70);
            }
        } else {
            if (!(infoTileIcon instanceof InfoTileIcon.InfoTileBadge)) {
                throw new NoWhenBranchMatchedException();
            }
            int iOrdinal2 = infoTileIconSlotSize.ordinal();
            if (iOrdinal2 == 0) {
                modifierU = SizeKt.u(companion, 12);
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                modifierU = SizeKt.q(companion, 28);
            }
        }
        Modifier modifierX0 = modifier.x0(modifierU);
        composer.l();
        return modifierX0;
    }
}
