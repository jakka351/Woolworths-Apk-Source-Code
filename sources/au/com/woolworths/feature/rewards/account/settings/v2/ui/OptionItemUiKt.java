package au.com.woolworths.feature.rewards.account.settings.v2.ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOption;
import com.woolworths.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OptionItemUiKt {
    public static final void a(final AccountHomeOption accountHomeOption, Modifier modifier, long j, Function1 function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        int i4;
        Function1 function12;
        int i5;
        Modifier.Companion companion;
        int i6;
        final Modifier modifier3;
        final Function1 function13;
        final long j3;
        ComposerImpl composerImplV = composer.v(-128387097);
        int i7 = i | (composerImplV.n(accountHomeOption) ? 4 : 2);
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 = i7 | 48;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i7 | (composerImplV.n(modifier2) ? 32 : 16);
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i4 = i3 | KyberEngine.KyberPolyBytes;
            j2 = j;
        } else {
            j2 = j;
            i4 = i3 | (composerImplV.s(j2) ? 256 : 128);
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i5 = i4 | 3072;
            function12 = function1;
        } else {
            function12 = function1;
            i5 = i4 | (composerImplV.I(function12) ? 2048 : 1024);
        }
        if ((i5 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier2;
            j3 = j2;
            function13 = function12;
        } else {
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifier4 = i8 != 0 ? companion2 : modifier2;
            long j4 = i9 != 0 ? Color.k : j2;
            Function1 function14 = i10 != 0 ? null : function12;
            Modifier modifierE = SizeKt.e(modifier4, 1.0f);
            composerImplV.o(-1633490746);
            long j5 = j4;
            boolean z = ((i5 & 14) == 4) | ((i5 & 7168) == 2048);
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new androidx.navigation.compose.a(29, function14, accountHomeOption);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierG = PaddingKt.g(ClickableKt.d(modifierE, false, null, null, (Function0) objG, 7), 16, 12);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i11 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierG);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i11))) {
                androidx.camera.core.impl.b.B(i11, composerImplV, i11, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            String b = accountHomeOption.getB();
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            Function1 function15 = function14;
            Modifier modifier5 = modifier4;
            TextKt.b(b, rowScopeInstance.a(companion2, 1.0f, true), j5, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).l, composerImplV, i5 & 896, 0, 65528);
            composerImplV = composerImplV;
            composerImplV.o(1580670085);
            if (Intrinsics.c(accountHomeOption.getD(), Boolean.TRUE)) {
                SpacerKt.d(rowScopeInstance, 8, composerImplV, 54);
                String upperCase = StringResources_androidKt.c(composerImplV, R.string.rewards_account_new).toUpperCase(Locale.ROOT);
                Intrinsics.g(upperCase, "toUpperCase(...)");
                companion = companion2;
                i6 = 8;
                TextKt.b(upperCase, null, WxTheme.a(composerImplV).h(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, 0, 0, 65530);
                composerImplV = composerImplV;
            } else {
                companion = companion2;
                i6 = 8;
            }
            composerImplV.V(false);
            composerImplV.o(1580679709);
            if (accountHomeOption.getE()) {
                SpacerKt.d(rowScopeInstance, i6, composerImplV, 54);
                IconKt.a(PainterResources_androidKt.a(R.drawable.ic_top_right_arrow, 0, composerImplV), null, SizeKt.q(companion, 24), ToneColors.f, composerImplV, 432, 0);
            }
            composerImplV.V(false);
            composerImplV.V(true);
            modifier3 = modifier5;
            function13 = function15;
            j3 = j5;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(modifier3, j3, function13, i, i2) { // from class: au.com.woolworths.feature.rewards.account.settings.v2.ui.f
                public final /* synthetic */ Modifier e;
                public final /* synthetic */ long f;
                public final /* synthetic */ Function1 g;
                public final /* synthetic */ int h;

                {
                    this.h = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    OptionItemUiKt.a(this.d, this.e, this.f, this.g, (Composer) obj, iA, this.h);
                    return Unit.f24250a;
                }
            };
        }
    }
}
