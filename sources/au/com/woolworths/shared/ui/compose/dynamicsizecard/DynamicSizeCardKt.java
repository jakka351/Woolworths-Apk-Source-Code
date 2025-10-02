package au.com.woolworths.shared.ui.compose.dynamicsizecard;

import android.widget.ImageView;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.compose.utils.modifier.VisibilityModifierKt;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.offers.listpage.ui.e;
import au.com.woolworths.feature.shop.instore.cart.ui.c;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import coil3.compose.SingletonAsyncImageKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shared-ui-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class DynamicSizeCardKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10095a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f10095a = iArr;
        }
    }

    public static final void a(String str, String str2, ContentScale contentScale, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1833873986);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(str2) ? 32 : 16) | (composerImplV.n(contentScale) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(Boolean.valueOf(str == null || str.length() == 0));
                composerImplV.A(objG);
            }
            MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            FillElement fillElement = SizeKt.c;
            boolean zBooleanValue = ((Boolean) mutableState.getD()).booleanValue();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierX0 = fillElement.x0(zBooleanValue ? BackgroundKt.b(companion, ToneColors.j, RectangleShapeKt.f1779a) : companion);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierX0);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(5004770);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b(mutableState, 24);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            SingletonAsyncImageKt.b(str, str2, fillElement, null, null, null, null, null, (Function1) objG2, null, contentScale, null, composerImplV, (i2 & 112) | (i2 & 14) | 100663680, (i2 >> 6) & 14, 31480);
            Modifier modifierF = PaddingKt.f(BoxScopeInstance.f944a.g(SizeKt.z(companion, null, 3), Alignment.Companion.e), 8);
            composerImplV.o(5004770);
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = new e(mutableState, 14);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            TextKt.b(str2, VisibilityModifierKt.a(modifierF, (Function0) objG3), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 2, false, 2, 0, null, WxTheme.b(composerImplV).l, composerImplV, (i2 >> 3) & 14, 3120, 54780);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.marketplace.ui.personalised.b(str, str2, contentScale, i, 17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData r17, final androidx.compose.ui.Modifier r18, final kotlin.jvm.functions.Function1 r19, kotlin.jvm.functions.Function1 r20, androidx.compose.ui.layout.ContentScale r21, float r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shared.ui.compose.dynamicsizecard.DynamicSizeCardKt.b(au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.ui.layout.ContentScale, float, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(final DynamicSizeCardData dynamicSizeCardData, Function1 function1, final ContentScale contentScale, float f, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(872162592);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(dynamicSizeCardData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function1) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(contentScale) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.q(f) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            dynamicSizeCardData.getClass();
            Modifier modifierA = AspectRatioKt.a(SizeKt.A(Modifier.Companion.d, (3 & 1) != 0 ? Alignment.Companion.n : Alignment.Companion.o, false), dynamicSizeCardData.getHeight().getG());
            BorderStroke borderStrokeA = BorderStrokeKt.a(Color.b(ToneColors.c, 0.1f), 1);
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(dynamicSizeCardData) | ((i2 & 112) == 32);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.sdui.common.alert.a(4, function1, dynamicSizeCardData);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            CardKt.b((Function0) objG, modifierA, false, null, 0L, 0L, borderStrokeA, f, null, ComposableLambdaKt.c(534177018, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shared.ui.compose.dynamicsizecard.DynamicSizeCardKt$DynamicSizeCard$7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        DynamicSizeCardData dynamicSizeCardData2 = dynamicSizeCardData;
                        String d = dynamicSizeCardData2.getD();
                        String e = dynamicSizeCardData2.getE();
                        if (e == null) {
                            e = "";
                        }
                        DynamicSizeCardKt.a(d, e, contentScale, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, ((i2 << 12) & 29360128) | 805306368, 316);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(dynamicSizeCardData, function1, contentScale, f, i);
        }
    }
}
