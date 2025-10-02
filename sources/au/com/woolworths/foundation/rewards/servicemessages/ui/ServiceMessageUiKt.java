package au.com.woolworths.foundation.rewards.servicemessages.ui;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconKeyMapperUtilsKt;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"service-messages_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ServiceMessageUiKt {
    public static final void a(final RewardsServiceMessage message, Modifier modifier, final Function0 function0, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.h(message, "message");
        ComposerImpl composerImplV = composer.v(-1653284361);
        int i4 = (composerImplV.I(message) ? 4 : 2) | i;
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | KyberEngine.KyberPolyBytes;
        } else {
            i3 = i4 | (composerImplV.I(function0) ? 256 : 128);
        }
        if ((i3 & 131) == 130 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (i5 != 0) {
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                if (objG == Composer.Companion.f1624a) {
                    objG = new h(20);
                    composerImplV.A(objG);
                }
                function0 = (Function0) objG;
                composerImplV.V(false);
            }
            CoreThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-901983756, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.servicemessages.ui.ServiceMessageUiKt$FullServiceMessageUi$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Context context = (Context) composer2.x(AndroidCompositionLocals_androidKt.b);
                        RewardsServiceMessage rewardsServiceMessage = message;
                        String str = rewardsServiceMessage.b;
                        RewardsServiceMessage.ActionButton actionButton = rewardsServiceMessage.d;
                        String str2 = rewardsServiceMessage.e;
                        String str3 = rewardsServiceMessage.c;
                        composer2.o(777012518);
                        Function0 function02 = null;
                        Color color = str2 == null ? null : new Color(CoreTheme.b(composer2).e.c.f4854a);
                        composer2.l();
                        composer2.o(777015841);
                        Painter painterE = str2 == null ? null : VectorPainterKt.e(IconKeyMapperUtilsKt.a(CoreTheme.e(composer2), str2), composer2);
                        composer2.l();
                        composer2.o(777015214);
                        if (painterE == null) {
                            painterE = PainterResources_androidKt.a(R.drawable.ic_rewards_server_error, 0, composer2);
                        }
                        composer2.l();
                        String strC = actionButton != null ? actionButton.f8648a : null;
                        composer2.o(777026254);
                        if (strC == null) {
                            strC = StringResources_androidKt.c(composer2, R.string.try_again);
                        }
                        composer2.l();
                        String str4 = actionButton != null ? actionButton.b : null;
                        composer2.o(777031348);
                        if (str4 != null) {
                            composer2.o(-1633490746);
                            boolean zI = composer2.I(context) | composer2.n(str4);
                            Object objG2 = composer2.G();
                            if (zI || objG2 == Composer.Companion.f1624a) {
                                objG2 = new a(context, str4, 0);
                                composer2.A(objG2);
                            }
                            function02 = (Function0) objG2;
                            composer2.l();
                        }
                        composer2.l();
                        if (function02 == null) {
                            function02 = function0;
                        }
                        FullPageMessageUiKt.a(FullPageMessageSpec.Companion.f(painterE, color, str, str3, strC, function02, composer2, 0), null, null, composer2, 0, 6);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            modifier = Modifier.Companion.d;
        }
        Modifier modifier2 = modifier;
        Function0 function02 = function0;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.base.rewards.account.ui.a(message, modifier2, function02, i, i2, 16);
        }
    }

    public static final void b(final RewardsServiceMessage message, final Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.h(message, "message");
        ComposerImpl composerImplV = composer.v(1127763669);
        int i4 = (composerImplV.I(message) ? 4 : 2) | i;
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
            CoreThemeKt.b(6, composerImplV, ComposableLambdaKt.c(173912440, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.servicemessages.ui.ServiceMessageUiKt$PartialServiceMessageUi$1

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    static {
                        int[] iArr = new int[InlineErrorType.values().length];
                        try {
                            iArr[1] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            InlineErrorType inlineErrorType = InlineErrorType.f;
                            iArr[2] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            InlineErrorType inlineErrorType2 = InlineErrorType.f;
                            iArr[0] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            InlineErrorType inlineErrorType3 = InlineErrorType.f;
                            iArr[3] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            InlineErrorType inlineErrorType4 = InlineErrorType.f;
                            iArr[4] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
                @Override // kotlin.jvm.functions.Function2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13) {
                    /*
                        Method dump skipped, instructions count: 232
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.rewards.servicemessages.ui.ServiceMessageUiKt$PartialServiceMessageUi$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerImplV));
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.a(message, modifier2, i, i2, 10);
        }
    }
}
