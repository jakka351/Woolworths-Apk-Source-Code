package au.com.woolworths.design.core.ui.component.experimental.quantitystepper;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.component.experimental.quantitystepper.QuantityStepperSpec;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "isTalkbackEnabled", "ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class QuantityStepperKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Side.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Side side = Side.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final void a(double d, double d2, double d3, int i, int i2, Composer composer, Modifier modifier, FocusRequester focusRequester, String maxQuantityContentDescription, String str, String str2, Function0 onQuantityClick, Function1 onIncrementClick, Function1 onDecrementClick, boolean z) {
        Modifier modifier2;
        String str3;
        int i3;
        String str4;
        int i4;
        int i5;
        String str5;
        double d4;
        String str6;
        boolean z2;
        QuantityStepperSpec.Variant[] variantArr = QuantityStepperSpec.Variant.d;
        QuantityStepperSpec.Size size = QuantityStepperSpec.Size.e;
        Intrinsics.h(maxQuantityContentDescription, "maxQuantityContentDescription");
        Intrinsics.h(onIncrementClick, "onIncrementClick");
        Intrinsics.h(onDecrementClick, "onDecrementClick");
        Intrinsics.h(onQuantityClick, "onQuantityClick");
        ComposerImpl composerImplV = composer.v(-25218186);
        int i6 = i | (composerImplV.t(d) ? 32 : 16) | (composerImplV.t(d2) ? 256 : 128) | (composerImplV.n(maxQuantityContentDescription) ? 2048 : 1024) | (composerImplV.I(onIncrementClick) ? 131072 : 65536) | (composerImplV.I(onDecrementClick) ? 1048576 : 524288) | (composerImplV.I(onQuantityClick) ? 8388608 : 4194304);
        if ((i & 100663296) == 0) {
            modifier2 = modifier;
            i6 |= composerImplV.n(modifier2) ? 67108864 : 33554432;
        } else {
            modifier2 = modifier;
        }
        int i7 = i6 | 805306368;
        int i8 = i2 & 1024;
        if (i8 != 0) {
            i3 = 390;
            str3 = str;
        } else {
            str3 = str;
            i3 = 384 | (composerImplV.n(str3) ? 4 : 2);
        }
        int i9 = i3;
        int i10 = i9 | 48;
        int i11 = i2 & 8192;
        if (i11 != 0) {
            i4 = i9 | 3120;
            str4 = str2;
        } else {
            str4 = str2;
            i4 = i10 | (composerImplV.n(str4) ? 2048 : 1024);
        }
        int i12 = i4 | 24576;
        int i13 = i2 & 32768;
        if (i13 != 0) {
            i5 = i4 | 221184;
        } else {
            i5 = i12 | (composerImplV.p(z) ? 131072 : 65536);
        }
        int i14 = i5;
        if ((i7 & 306783379) == 306783378 && (i14 & 74899) == 74898 && composerImplV.c()) {
            composerImplV.j();
            z2 = z;
            str6 = str4;
            str5 = str3;
            d4 = d3;
        } else {
            if (i8 != 0) {
                str3 = null;
            }
            String str7 = i11 != 0 ? null : str4;
            boolean z3 = i13 != 0 ? true : z;
            str5 = str3;
            c(d, d2, 1.0d, (i7 & 1022) | ((i14 << 9) & 7168) | 24576 | ((i14 << 6) & 458752) | 920125440, ((i7 >> 15) & 1022) | ((i14 >> 6) & 7168) | ((i7 >> 12) & 57344) | (458752 & (i7 << 6)), composerImplV, modifier2, focusRequester, str5, str7, maxQuantityContentDescription, onQuantityClick, onIncrementClick, onDecrementClick, z3);
            d4 = 1.0d;
            str6 = str7;
            z2 = z3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(d, d2, maxQuantityContentDescription, onIncrementClick, onDecrementClick, onQuantityClick, modifier, d4, str5, focusRequester, str6, z2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final au.com.woolworths.design.core.ui.component.experimental.quantitystepper.Side r24, final androidx.compose.ui.graphics.vector.ImageVector r25, final java.lang.String r26, final boolean r27, final boolean r28, final kotlin.jvm.functions.Function0 r29, androidx.compose.ui.Modifier r30, androidx.compose.ui.Modifier r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.design.core.ui.component.experimental.quantitystepper.QuantityStepperKt.b(au.com.woolworths.design.core.ui.component.experimental.quantitystepper.Side, androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, boolean, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0786  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(double r43, double r45, final double r47, int r49, int r50, androidx.compose.runtime.Composer r51, androidx.compose.ui.Modifier r52, androidx.compose.ui.focus.FocusRequester r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, kotlin.jvm.functions.Function0 r57, kotlin.jvm.functions.Function1 r58, final kotlin.jvm.functions.Function1 r59, boolean r60) {
        /*
            Method dump skipped, instructions count: 2007
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.design.core.ui.component.experimental.quantitystepper.QuantityStepperKt.c(double, double, double, int, int, androidx.compose.runtime.Composer, androidx.compose.ui.Modifier, androidx.compose.ui.focus.FocusRequester, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean):void");
    }

    public static final void d(int i, Composer composer, Modifier modifier, String text) {
        int i2;
        Intrinsics.h(text, "text");
        ComposerImpl composerImplV = composer.v(327310480);
        if ((i & 6) == 0) {
            i2 = i | (composerImplV.n(text) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f = 4;
            Modifier modifierA = ZIndexModifierKt.a(SizeKt.g(PaddingKt.h(BackgroundKt.b(BorderKt.a(modifier, 1, CoreTheme.b(composerImplV).e.b.d, RoundedCornerShapeKt.b(f)), CoreTheme.b(composerImplV).e.f4848a.b.f4851a, RoundedCornerShapeKt.b(f)), f, BitmapDescriptorFactory.HUE_RED, 2), 16), 2.0f);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
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
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.a(text, CoreTheme.f(composerImplV).b.f5125a.f5126a, null, CoreTheme.b(composerImplV).e.c.c.b, null, 0, 0, false, 0, null, composerImplV, i2 & 14, 1012);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(text, modifier, i, 0, (byte) 0);
        }
    }
}
