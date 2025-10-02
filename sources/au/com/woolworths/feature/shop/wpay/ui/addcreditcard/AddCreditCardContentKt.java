package au.com.woolworths.feature.shop.wpay.ui.addcreditcard;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertKt;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle;
import au.com.woolworths.design.core.ui.component.stable.alert.Placement;
import au.com.woolworths.design.core.ui.component.stable.corerow.SwitchRowKt;
import au.com.woolworths.design.core.ui.component.stable.corerow.d;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.AddCreditCardResponse;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardContract;
import au.com.woolworths.feature.shop.wpay.ui.common.component.LoadingScreenKt;
import au.com.woolworths.feature.shop.wpay.ui.common.component.WebViewScreenKt;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"wpay_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AddCreditCardContentKt {
    public static final void a(AddCreditCardContract.ViewState viewState, boolean z, Function1 onToggleSaveCreditCard, Function1 onWebViewCreated, Function0 onPageFinished, Function2 onPageLoadConnectionError, Function2 onPageLoadServerError, Function0 onPageReload, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        ComposerImpl composerImpl;
        boolean z2;
        Modifier modifier3;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(onToggleSaveCreditCard, "onToggleSaveCreditCard");
        Intrinsics.h(onWebViewCreated, "onWebViewCreated");
        Intrinsics.h(onPageFinished, "onPageFinished");
        Intrinsics.h(onPageLoadConnectionError, "onPageLoadConnectionError");
        Intrinsics.h(onPageLoadServerError, "onPageLoadServerError");
        Intrinsics.h(onPageReload, "onPageReload");
        ComposerImpl composerImplV = composer.v(1298905265);
        int i4 = (composerImplV.n(viewState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.I(onToggleSaveCreditCard) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= composerImplV.I(onWebViewCreated) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= composerImplV.I(onPageFinished) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= composerImplV.I(onPageLoadConnectionError) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= composerImplV.I(onPageLoadServerError) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= composerImplV.I(onPageReload) ? 8388608 : 4194304;
        }
        int i5 = i2 & 256;
        if (i5 != 0) {
            i3 = i4 | 100663296;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (composerImplV.n(modifier2) ? 67108864 : 33554432);
        }
        if ((38347923 & i3) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier2;
            composerImpl = composerImplV;
        } else {
            Modifier modifier4 = i5 != 0 ? Modifier.Companion.d : modifier2;
            Modifier modifierX0 = modifier4.x0(SizeKt.c);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i6 = composerImplV.P;
            int i7 = i3;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            PageResult pageResult = viewState.b;
            if (pageResult instanceof PageResult.Success) {
                composerImplV.o(-1047555752);
                z2 = false;
                b(viewState.c, viewState.d, (AddCreditCardResponse) ((PageResult.Success) pageResult).f8285a, z, onToggleSaveCreditCard, onWebViewCreated, onPageFinished, onPageLoadConnectionError, onPageLoadServerError, composerImplV, (i7 << 6) & 268434432);
                composerImpl = composerImplV;
                composerImpl.V(false);
            } else {
                composerImpl = composerImplV;
                z2 = false;
                if (pageResult instanceof PageResult.Fail) {
                    composerImpl.o(-1047533536);
                    boolean z3 = ((PageResult.Fail) pageResult).f8284a instanceof NoConnectivityException;
                    FullPageMessageUiKt.a(FullPageMessageSpec.Companion.d(PainterResources_androidKt.a(z3 ? R.drawable.empty_connection_error : R.drawable.empty_server_error, 0, composerImpl), StringResources_androidKt.c(composerImpl, z3 ? R.string.add_credit_card_connection_error_title : R.string.add_credit_card_server_error_title), StringResources_androidKt.c(composerImpl, z3 ? R.string.add_credit_card_connection_error_message : R.string.add_credit_card_server_error_message), StringResources_androidKt.c(composerImpl, R.string.try_again), onPageReload), null, null, composerImpl, 0, 6);
                    composerImpl.V(false);
                } else {
                    if (!Intrinsics.c(pageResult, PageResult.Uninitialized.f8286a)) {
                        throw au.com.woolworths.android.onesite.a.w(-1047557319, composerImpl, false);
                    }
                    composerImpl.o(-1047491857);
                    composerImpl.V(false);
                }
            }
            composerImpl.o(-1047491033);
            if (viewState.f8328a == LoadingState.e) {
                LoadingScreenKt.a(null, 0L, composerImpl, 0, 3);
            }
            composerImpl.V(z2);
            composerImpl.V(true);
            modifier3 = modifier4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(viewState, z, onToggleSaveCreditCard, onWebViewCreated, onPageFinished, onPageLoadConnectionError, onPageLoadServerError, onPageReload, modifier3, i, i2);
        }
    }

    public static final void b(String str, boolean z, AddCreditCardResponse addCreditCardResponse, boolean z2, Function1 function1, Function1 function12, Function0 function0, Function2 function2, Function2 function22, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        boolean z3;
        boolean z4;
        Modifier.Companion companion2;
        ComposerImpl composerImplV = composer.v(1123223837);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(addCreditCardResponse) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.p(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(function12) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.I(function2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerImplV.I(function22) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if ((i3 & 38347923) == 38347922 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion3 = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion3);
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
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-1705976364);
            if (str == null) {
                companion = companion3;
                z3 = false;
            } else {
                float f = 16;
                companion = companion3;
                z3 = false;
                AlertKt.c(AlertStyle.g, Placement.d, PaddingKt.j(companion, f, f, f, BitmapDescriptorFactory.HUE_RED, 8), null, str, null, null, composerImplV, 438, 104);
            }
            composerImplV.V(z3);
            float f2 = 12;
            Modifier modifierJ = PaddingKt.j(companion, f2, 16, f2, BitmapDescriptorFactory.HUE_RED, 8);
            composerImplV.o(-1633490746);
            boolean zI = ((i3 & 458752) == 131072 ? true : z3) | composerImplV.I(addCreditCardResponse);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new c(2, function12, addCreditCardResponse);
                composerImplV.A(objG);
            }
            composerImplV.V(z3);
            int i5 = i3 >> 15;
            WebViewScreenKt.a((Function1) objG, function0, function2, function22, modifierJ, false, false, composerImplV, (i5 & 7168) | (i5 & 112) | 24576 | (i5 & 896));
            composerImplV = composerImplV;
            composerImplV.o(-1705947005);
            if (!z || addCreditCardResponse.c) {
                z4 = z3;
                companion2 = companion;
            } else {
                companion2 = companion;
                int i6 = i3 >> 6;
                z4 = z3;
                SwitchRowKt.a(StringResources_androidKt.c(composerImplV, R.string.add_credit_card_save_to_account_message), z2, function1, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), null, null, null, null, null, composerImplV, (i6 & 112) | 3072 | (i6 & 896), 496);
            }
            composerImplV.V(z4);
            composerImplV.o(-1705934981);
            if (z) {
                boolean z5 = addCreditCardResponse.c;
                String str2 = addCreditCardResponse.d;
                if (z5 && str2 != null) {
                    AlertKt.b(AlertStyle.d, str2, PaddingKt.f(companion2, 8), composerImplV, 390);
                }
            }
            composerImplV.V(z4);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.corerow.b(str, z, addCreditCardResponse, z2, function1, function12, function0, function2, function22, i);
        }
    }
}
