package au.com.woolworths.foundation.google.pay.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import com.google.pay.button.ButtonType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"google-pay_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PayButtonKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[PayButtonType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PayButtonType[] payButtonTypeArr = PayButtonType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PayButtonType[] payButtonTypeArr2 = PayButtonType.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PayButtonType[] payButtonTypeArr3 = PayButtonType.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                PayButtonType[] payButtonTypeArr4 = PayButtonType.d;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                PayButtonType[] payButtonTypeArr5 = PayButtonType.d;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                PayButtonType[] payButtonTypeArr6 = PayButtonType.d;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                PayButtonType[] payButtonTypeArr7 = PayButtonType.d;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static final void a(final String str, final Function0 onClick, final Modifier modifier, float f, Composer composer, final int i) {
        final float f2;
        PayButtonType[] payButtonTypeArr = PayButtonType.d;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(1056734345);
        int i2 = (composerImplV.n(str) ? 32 : 16) | i | (composerImplV.I(onClick) ? 256 : 128) | 24576;
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            f2 = f;
        } else {
            float f3 = 8;
            com.google.pay.button.PayButtonKt.a(onClick, str, TestTagKt.a(modifier, "payButton"), null, ButtonType.e, f3, false, null, composerImplV, (i2 & 112) | ((i2 >> 6) & 14) | 196608);
            f2 = f3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(str, onClick, modifier, f2, i) { // from class: au.com.woolworths.foundation.google.pay.ui.a
                public final /* synthetic */ String d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Modifier f;
                public final /* synthetic */ float g;

                {
                    PayButtonType[] payButtonTypeArr2 = PayButtonType.d;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    PayButtonType[] payButtonTypeArr2 = PayButtonType.d;
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(3079);
                    PayButtonKt.a(this.d, this.e, this.f, this.g, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
