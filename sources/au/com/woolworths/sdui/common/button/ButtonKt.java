package au.com.woolworths.sdui.common.button;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.design.core.ui.component.stable.button.DestructiveButtonKt;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.component.stable.button.SecondaryButtonKt;
import au.com.woolworths.design.core.ui.component.stable.button.TertiaryButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.icon.IconKeyMapperUtilsKt;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.button.model.CoreButtonModel;
import au.com.woolworths.sdui.common.button.model.CoreButtonStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ButtonKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CoreButtonStyle.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CoreButtonStyle coreButtonStyle = CoreButtonStyle.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CoreButtonStyle coreButtonStyle2 = CoreButtonStyle.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CoreButtonStyle coreButtonStyle3 = CoreButtonStyle.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final void a(final CoreButtonModel coreButtonModel, final Function1 onButtonClick, Modifier modifier, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        Intrinsics.h(coreButtonModel, "coreButtonModel");
        Intrinsics.h(onButtonClick, "onButtonClick");
        ComposerImpl composerImplV = composer.v(-1236547679);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(coreButtonModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onButtonClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            IconAsset.CoreIcon coreIcon = coreButtonModel.f;
            String str = coreIcon != null ? coreIcon.d : null;
            composerImplV.o(1383628411);
            ImageVector imageVectorA = str == null ? null : IconKeyMapperUtilsKt.a(CoreTheme.e(composerImplV), str);
            composerImplV.V(false);
            IconAsset.CoreIcon coreIcon2 = coreButtonModel.g;
            String str2 = coreIcon2 != null ? coreIcon2.d : null;
            composerImplV.o(1383632507);
            ImageVector imageVectorA2 = str2 != null ? IconKeyMapperUtilsKt.a(CoreTheme.e(composerImplV), str2) : null;
            composerImplV.V(false);
            int iOrdinal = coreButtonModel.d.ordinal();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (iOrdinal == 0) {
                composerImplV.o(-56926733);
                String str3 = coreButtonModel.e;
                boolean z = coreButtonModel.i;
                composerImplV.o(-1633490746);
                boolean zI = composerImplV.I(coreButtonModel) | ((i2 & 112) == 32);
                Object objG = composerImplV.G();
                if (zI || objG == composer$Companion$Empty$1) {
                    final int i3 = 0;
                    objG = new Function0() { // from class: au.com.woolworths.sdui.common.button.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i3) {
                                case 0:
                                    onButtonClick.invoke(coreButtonModel.h);
                                    break;
                                case 1:
                                    onButtonClick.invoke(coreButtonModel.h);
                                    break;
                                case 2:
                                    onButtonClick.invoke(coreButtonModel.h);
                                    break;
                                default:
                                    onButtonClick.invoke(coreButtonModel.h);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                PrimaryButtonKt.a(str3, (Function0) objG, modifier, z, null, imageVectorA, imageVectorA2, null, composerImplV, i2 & 896, 144);
                composerImpl = composerImplV;
                composerImpl.V(false);
            } else if (iOrdinal == 1) {
                composerImplV.o(-56524911);
                String str4 = coreButtonModel.e;
                boolean z2 = coreButtonModel.i;
                composerImplV.o(-1633490746);
                boolean zI2 = composerImplV.I(coreButtonModel) | ((i2 & 112) == 32);
                Object objG2 = composerImplV.G();
                if (zI2 || objG2 == composer$Companion$Empty$1) {
                    final int i4 = 1;
                    objG2 = new Function0() { // from class: au.com.woolworths.sdui.common.button.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i4) {
                                case 0:
                                    onButtonClick.invoke(coreButtonModel.h);
                                    break;
                                case 1:
                                    onButtonClick.invoke(coreButtonModel.h);
                                    break;
                                case 2:
                                    onButtonClick.invoke(coreButtonModel.h);
                                    break;
                                default:
                                    onButtonClick.invoke(coreButtonModel.h);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                SecondaryButtonKt.a(str4, (Function0) objG2, modifier, z2, null, imageVectorA, imageVectorA2, null, composerImplV, i2 & 896, 144);
                composerImpl = composerImplV;
                composerImpl.V(false);
            } else if (iOrdinal == 2) {
                composerImplV.o(-56122190);
                String str5 = coreButtonModel.e;
                boolean z3 = coreButtonModel.i;
                composerImplV.o(-1633490746);
                boolean zI3 = composerImplV.I(coreButtonModel) | ((i2 & 112) == 32);
                Object objG3 = composerImplV.G();
                if (zI3 || objG3 == composer$Companion$Empty$1) {
                    final int i5 = 2;
                    objG3 = new Function0() { // from class: au.com.woolworths.sdui.common.button.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i5) {
                                case 0:
                                    onButtonClick.invoke(coreButtonModel.h);
                                    break;
                                case 1:
                                    onButtonClick.invoke(coreButtonModel.h);
                                    break;
                                case 2:
                                    onButtonClick.invoke(coreButtonModel.h);
                                    break;
                                default:
                                    onButtonClick.invoke(coreButtonModel.h);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                TertiaryButtonKt.a(str5, (Function0) objG3, modifier, z3, imageVectorA, imageVectorA2, null, composerImplV, i2 & 896, 144);
                composerImpl = composerImplV;
                composerImpl.V(false);
            } else {
                if (iOrdinal != 3) {
                    throw au.com.woolworths.android.onesite.a.w(1383636107, composerImplV, false);
                }
                composerImplV.o(-55718942);
                String str6 = coreButtonModel.e;
                composerImplV.o(-1633490746);
                boolean zI4 = composerImplV.I(coreButtonModel) | ((i2 & 112) == 32);
                Object objG4 = composerImplV.G();
                if (zI4 || objG4 == composer$Companion$Empty$1) {
                    final int i6 = 3;
                    objG4 = new Function0() { // from class: au.com.woolworths.sdui.common.button.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i6) {
                                case 0:
                                    onButtonClick.invoke(coreButtonModel.h);
                                    break;
                                case 1:
                                    onButtonClick.invoke(coreButtonModel.h);
                                    break;
                                case 2:
                                    onButtonClick.invoke(coreButtonModel.h);
                                    break;
                                default:
                                    onButtonClick.invoke(coreButtonModel.h);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG4);
                }
                composerImplV.V(false);
                composerImpl = composerImplV;
                DestructiveButtonKt.a(str6, (Function0) objG4, modifier, imageVectorA, imageVectorA2, null, composerImpl, i2 & 896, 72);
                composerImpl.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(i, 9, coreButtonModel, onButtonClick, modifier, false);
        }
    }
}
