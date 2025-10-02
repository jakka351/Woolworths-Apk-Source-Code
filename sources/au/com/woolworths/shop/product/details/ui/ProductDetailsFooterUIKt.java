package au.com.woolworths.shop.product.details.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.button.SecondaryButtonKt;
import au.com.woolworths.product.composeui.ProductCardButtonsKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.product.details.data.ButtonActionData;
import au.com.woolworths.shop.product.details.data.ButtonData;
import au.com.woolworths.shop.product.details.data.FooterButtonAction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsFooterUIKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12633a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[FooterButtonAction.values().length];
            try {
                FooterButtonAction footerButtonAction = FooterButtonAction.e;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FooterButtonAction footerButtonAction2 = FooterButtonAction.e;
                iArr[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12633a = iArr;
            int[] iArr2 = new int[ButtonStyleApiData.values().length];
            try {
                iArr2[ButtonStyleApiData.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ButtonStyleApiData.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ButtonStyleApiData.TERTIARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ButtonStyleApiData.INSTOCK.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ButtonStyleApiData.INFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
        }
    }

    public static final void a(ProductCard productCard, ButtonData buttonData, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-1820452465);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(productCard) : composerImplV.I(productCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(buttonData) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(modifier) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ButtonActionData buttonActionData = buttonData.d;
            FooterButtonAction footerButtonAction = buttonActionData != null ? buttonActionData.b : null;
            int i3 = footerButtonAction == null ? -1 : WhenMappings.f12633a[footerButtonAction.ordinal()];
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (i3 == 1) {
                composerImplV.o(-547070257);
                composerImplV.o(-1633490746);
                boolean zI = composerImplV.I(buttonData) | ((i2 & 896) == 256);
                Object objG = composerImplV.G();
                if (zI || objG == composer$Companion$Empty$1) {
                    objG = new b(function1, buttonData, 0);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                ProductCardButtonsKt.i(productCard, (Function0) objG, modifier, composerImplV, ProductCard.$stable | (i2 & 14) | ((i2 >> 3) & 896), 0);
                composerImplV.V(false);
            } else if (i3 != 2) {
                composerImplV.o(-546587711);
                b(buttonData, modifier, function1, composerImplV, (i2 & 896) | ((i2 >> 3) & 14) | ((i2 >> 6) & 112));
                composerImplV.V(false);
            } else {
                composerImplV.o(-546790668);
                composerImplV.o(-1633490746);
                boolean zI2 = composerImplV.I(buttonData) | ((i2 & 896) == 256);
                Object objG2 = composerImplV.G();
                if (zI2 || objG2 == composer$Companion$Empty$1) {
                    objG2 = new b(function1, buttonData, 1);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                ProductCardButtonsKt.c((i2 >> 6) & 112, 0, composerImplV, modifier, (Function0) objG2);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.instore.presence.presentation.b(productCard, buttonData, function1, modifier, i, 20);
        }
    }

    public static final void b(ButtonData buttonData, Modifier modifier, Function1 function1, Composer composer, int i) {
        int i2;
        String str = buttonData.b;
        ComposerImpl composerImplV = composer.v(-676339935);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(buttonData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function1) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ButtonStyleApiData buttonStyleApiData = buttonData.f;
            int i3 = buttonStyleApiData == null ? -1 : WhenMappings.b[buttonStyleApiData.ordinal()];
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (i3 == 1) {
                composerImplV.o(-1151186725);
                boolean z = buttonData.c;
                String str2 = buttonData.f12597a;
                composerImplV.o(-1633490746);
                boolean zI = composerImplV.I(buttonData) | ((i2 & 896) == 256);
                Object objG = composerImplV.G();
                if (zI || objG == composer$Companion$Empty$1) {
                    objG = new b(function1, buttonData, 2);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                PrimaryButtonKt.a(str, (Function0) objG, modifier, z, false, null, str2, null, null, composerImplV, (i2 << 3) & 896, 944);
                composerImplV = composerImplV;
                composerImplV.V(false);
            } else if (i3 == 2) {
                composerImplV.o(-1150821607);
                boolean z2 = buttonData.c;
                String str3 = buttonData.f12597a;
                composerImplV.o(-1633490746);
                boolean zI2 = composerImplV.I(buttonData) | ((i2 & 896) == 256);
                Object objG2 = composerImplV.G();
                if (zI2 || objG2 == composer$Companion$Empty$1) {
                    objG2 = new b(function1, buttonData, 3);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                SecondaryButtonKt.b(str, (Function0) objG2, modifier, z2, false, null, str3, composerImplV, (i2 << 3) & 896, 48);
                composerImplV.V(false);
            } else if (i3 == 3) {
                composerImplV.o(-1150444678);
                boolean z3 = buttonData.c;
                String str4 = buttonData.f12597a;
                composerImplV.o(-1633490746);
                boolean zI3 = composerImplV.I(buttonData) | ((i2 & 896) == 256);
                Object objG3 = composerImplV.G();
                if (zI3 || objG3 == composer$Companion$Empty$1) {
                    objG3 = new b(function1, buttonData, 4);
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                SecondaryButtonKt.b(str, (Function0) objG3, modifier, z3, false, null, str4, composerImplV, (i2 << 3) & 896, 48);
                composerImplV.V(false);
            } else if (i3 == 4) {
                composerImplV.o(-1149749410);
                ProductCardButtonsKt.g((i2 >> 3) & 14, 0, composerImplV, modifier);
                composerImplV.V(false);
            } else if (i3 != 5) {
                composerImplV.o(-1149372512);
                composerImplV.V(false);
            } else {
                composerImplV.o(-1149610499);
                composerImplV.o(-1633490746);
                boolean zI4 = composerImplV.I(buttonData) | ((i2 & 896) == 256);
                Object objG4 = composerImplV.G();
                if (zI4 || objG4 == composer$Companion$Empty$1) {
                    objG4 = new b(function1, buttonData, 5);
                    composerImplV.A(objG4);
                }
                composerImplV.V(false);
                ProductCardButtonsKt.f((Function0) objG4, str, modifier, null, composerImplV, (i2 << 3) & 896, 8);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(buttonData, modifier, function1, i, 23);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final au.com.woolworths.product.models.ProductCard r36, final au.com.woolworths.shop.product.details.data.FooterData r37, final kotlin.jvm.functions.Function1 r38, final au.com.woolworths.product.tile.ProductClickListener r39, final boolean r40, boolean r41, androidx.compose.ui.Modifier r42, androidx.compose.runtime.Composer r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.product.details.ui.ProductDetailsFooterUIKt.c(au.com.woolworths.product.models.ProductCard, au.com.woolworths.shop.product.details.data.FooterData, kotlin.jvm.functions.Function1, au.com.woolworths.product.tile.ProductClickListener, boolean, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
