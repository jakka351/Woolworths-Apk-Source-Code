package au.com.woolworths.feature.rewards.card.unlock;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.compose.c;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.loadingbutton.PrimaryLoadingButtonKt;
import au.com.woolworths.design.core.ui.component.stable.textbutton.TextButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.product.list.compose.d;
import au.com.woolworths.rewards.base.data.RewardsRedemptionUnlockConfirmation;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"card_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class UnlockChristmasFundBottomSheetKt {
    public static final void a(RewardsRedemptionUnlockConfirmation data, Function0 onDismiss, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.h(data, "data");
        Intrinsics.h(onDismiss, "onDismiss");
        ComposerImpl composerImplV = composer.v(1026327270);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composerImplV.n(data) : composerImplV.I(data) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onDismiss) ? 32 : 16;
        }
        int i3 = i2 | KyberEngine.KyberPolyBytes;
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 16;
            Modifier modifierG = PaddingKt.g(SizeKt.e(companion, 1.0f), f, f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i4 = composerImplV.P;
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            d(data.getTitle(), data.getContent(), data.getIconUrl(), null, composerImplV, 6, 8);
            SpacerKt.a(composerImplV, SizeKt.g(companion, 24));
            TextButtonKt.a(onDismiss, data.getButton().getLabel(), SizeKt.e(companion, 1.0f), false, null, null, null, null, composerImplV, ((i3 >> 3) & 14) | KyberEngine.KyberPolyBytes, 504);
            composerImplV = composerImplV;
            composerImplV.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(data, onDismiss, modifier2, i, 28);
        }
    }

    public static final void b(RewardsRedemptionUnlockConfirmation data, boolean z, Function0 onUnlockNow, Function0 onMaybeLater, Modifier modifier, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        Modifier modifier2;
        Intrinsics.h(data, "data");
        Intrinsics.h(onUnlockNow, "onUnlockNow");
        Intrinsics.h(onMaybeLater, "onMaybeLater");
        ComposerImpl composerImplV = composer.v(-1579425239);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(data) : composerImplV.I(data) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onUnlockNow) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onMaybeLater) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((i3 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 16;
            Modifier modifierG = PaddingKt.g(SizeKt.e(companion, 1.0f), f, f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i4 = composerImplV.P;
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            d(data.getTitle(), data.getContent(), data.getIconUrl(), null, composerImplV, 6, 8);
            SpacerKt.a(composerImplV, SizeKt.g(companion, 24));
            PrimaryLoadingButtonKt.a(data.getButton().getLabel(), onUnlockNow, z, SizeKt.e(companion, 1.0f), null, null, null, composerImplV, ((i3 >> 3) & 112) | 3072 | ((i3 << 3) & 896), 496);
            composerImpl = composerImplV;
            SpacerKt.a(composerImpl, SizeKt.g(companion, f));
            ContentCta secondaryCta = data.getSecondaryCta();
            String label = secondaryCta != null ? secondaryCta.getLabel() : null;
            composerImpl.o(-1834472820);
            if (label != null) {
                TextButtonKt.a(onMaybeLater, label, SizeKt.e(companion, 1.0f), false, null, null, null, null, composerImpl, ((i3 >> 9) & 14) | KyberEngine.KyberPolyBytes, 504);
            }
            composerImpl.V(false);
            composerImpl.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(data, z, onUnlockNow, onMaybeLater, modifier2, i, 0);
        }
    }

    public static final void c(int i, Composer composer, Modifier modifier, Function0 onTryAgain) {
        Function0 function0;
        Intrinsics.h(onTryAgain, "onTryAgain");
        ComposerImpl composerImplV = composer.v(1809173135);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onTryAgain) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function0 = onTryAgain;
        } else {
            modifier = Modifier.Companion.d;
            float f = 16;
            Modifier modifierG = PaddingKt.g(SizeKt.e(modifier, 1.0f), f, f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierG);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            d(StringResources_androidKt.c(composerImplV, R.string.christmas_unlock_error_title), StringResources_androidKt.c(composerImplV, R.string.christmas_unlock_error_description), null, CoreTheme.e(composerImplV).i.f4888a, composerImplV, 6, 4);
            SpacerKt.a(composerImplV, SizeKt.g(modifier, 24));
            function0 = onTryAgain;
            TextButtonKt.a(function0, StringResources_androidKt.c(composerImplV, R.string.try_again), SizeKt.e(modifier, 1.0f), false, null, null, null, null, composerImplV, ((i2 >> 3) & 14) | KyberEngine.KyberPolyBytes, 504);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(modifier, function0, i, 0);
        }
    }

    public static final void d(String str, String str2, String str3, ImageVector imageVector, Composer composer, int i, int i2) {
        String str4;
        int i3;
        ImageVector imageVector2;
        int i4;
        String str5;
        ImageVector imageVector3;
        boolean z;
        ImageVector imageVector4;
        ComposerImpl composerImplV = composer.v(-850810836);
        int i5 = i | (composerImplV.n(str) ? 32 : 16) | (composerImplV.n(str2) ? 256 : 128);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i5 | 3072;
            str4 = str3;
        } else {
            str4 = str3;
            i3 = i5 | (composerImplV.n(str4) ? 2048 : 1024);
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i4 = i3 | 24576;
            imageVector2 = imageVector;
        } else {
            imageVector2 = imageVector;
            i4 = i3 | (composerImplV.n(imageVector2) ? 16384 : 8192);
        }
        int i8 = i4;
        if ((i8 & 9361) == 9360 && composerImplV.c()) {
            composerImplV.j();
            imageVector4 = imageVector2;
        } else {
            if (i6 != 0) {
                str4 = null;
            }
            ImageVector imageVector5 = i7 != 0 ? null : imageVector2;
            composerImplV.o(-1585420764);
            Modifier.Companion companion = Modifier.Companion.d;
            if (str4 != null) {
                String str6 = str4;
                SingletonAsyncImageKt.a(str6, null, SizeKt.q(companion, 48), null, ContentScale.Companion.b, composerImplV, ((i8 >> 9) & 14) | 1573296, 1976);
                str5 = str6;
            } else {
                str5 = str4;
            }
            composerImplV.V(false);
            composerImplV.o(-1585413643);
            if (imageVector5 != null) {
                ImageVector imageVector6 = imageVector5;
                z = false;
                IconKt.b(imageVector6, null, SizeKt.q(companion, 48), CoreTheme.b(composerImplV).b.b.f4805a, composerImplV, ((i8 >> 12) & 14) | 432, 0);
                imageVector3 = imageVector6;
            } else {
                imageVector3 = imageVector5;
                z = false;
            }
            composerImplV.V(z);
            SpacerKt.a(composerImplV, SizeKt.g(companion, 24));
            float f = 16;
            TextKt.a(str, CoreTheme.f(composerImplV).d.c.b, PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, 2), CoreTheme.b(composerImplV).e.d.d, null, 3, 0, false, 0, null, composerImplV, ((i8 >> 3) & 14) | KyberEngine.KyberPolyBytes, 976);
            SpacerKt.a(composerImplV, SizeKt.g(companion, 8));
            TextKt.a(str2, CoreTheme.f(composerImplV).f5120a.b.f5123a, PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, 2), CoreTheme.b(composerImplV).e.d.b, null, 3, 0, false, 0, null, composerImplV, ((i8 >> 6) & 14) | KyberEngine.KyberPolyBytes, 976);
            str4 = str5;
            imageVector4 = imageVector3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(str, str2, str4, imageVector4, i, i2);
        }
    }
}
