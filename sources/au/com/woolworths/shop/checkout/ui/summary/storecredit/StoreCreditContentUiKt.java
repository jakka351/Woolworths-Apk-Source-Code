package au.com.woolworths.shop.checkout.ui.summary.storecredit;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.experimental.progressindicator.CircularProgressIndicatorKt;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import au.com.woolworths.shop.checkout.domain.model.CheckoutStoreCreditDetail;
import au.com.woolworths.shop.checkout.ui.content.ModalBottomSheetData;
import au.com.woolworths.shop.checkout.ui.content.StoreCreditContent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class StoreCreditContentUiKt {
    public static final void a(final ModalBottomSheetData.StoreCredit storeCredit, final Function0 onReloadButtonClick, final Function1 onApplyStoreCredit, final Function1 onRemoveStoreCredit, final Modifier modifier, Composer composer, final int i) {
        boolean z;
        Intrinsics.h(storeCredit, "storeCredit");
        Intrinsics.h(onReloadButtonClick, "onReloadButtonClick");
        Intrinsics.h(onApplyStoreCredit, "onApplyStoreCredit");
        Intrinsics.h(onRemoveStoreCredit, "onRemoveStoreCredit");
        ComposerImpl composerImplV = composer.v(917086656);
        int i2 = i | (composerImplV.I(storeCredit) ? 4 : 2) | (composerImplV.I(onReloadButtonClick) ? 32 : 16) | (composerImplV.I(onApplyStoreCredit) ? 256 : 128) | (composerImplV.I(onRemoveStoreCredit) ? 2048 : 1024) | (composerImplV.n(modifier) ? 16384 : 8192);
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            StoreCreditContent storeCreditContent = storeCredit.f10762a;
            if (Intrinsics.c(storeCreditContent, StoreCreditContent.ConnectionError.f10764a)) {
                composerImplV.o(851995556);
                FullPageMessageSpec fullPageMessageSpecC = FullPageMessageSpec.Companion.c(null, StringResources_androidKt.c(composerImplV, R.string.checkout_store_credit_connection_error_title), StringResources_androidKt.c(composerImplV, R.string.checkout_store_credit_connection_error_message), null, onReloadButtonClick, composerImplV, 19);
                composerImplV = composerImplV;
                FullPageMessageUiKt.a(fullPageMessageSpecC, modifier, null, composerImplV, (i2 >> 9) & 112, 4);
                composerImplV.V(false);
            } else if (Intrinsics.c(storeCreditContent, StoreCreditContent.ServerError.f10766a)) {
                composerImplV.o(852010780);
                FullPageMessageSpec fullPageMessageSpecC2 = FullPageMessageSpec.Companion.c(null, StringResources_androidKt.c(composerImplV, R.string.checkout_store_credit_server_error_title), StringResources_androidKt.c(composerImplV, R.string.checkout_store_credit_server_error_message), null, onReloadButtonClick, composerImplV, 19);
                composerImplV = composerImplV;
                FullPageMessageUiKt.a(fullPageMessageSpecC2, modifier, null, composerImplV, (i2 >> 9) & 112, 4);
                composerImplV.V(false);
            } else if (Intrinsics.c(storeCreditContent, StoreCreditContent.Loading.f10765a)) {
                composerImplV.o(852025351);
                Modifier modifierX0 = modifier.x0(SizeKt.c);
                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
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
                    androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
                }
                Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
                CircularProgressIndicatorKt.b(null, 0L, BitmapDescriptorFactory.HUE_RED, 0, composerImplV, 0, 15);
                composerImplV.V(true);
                composerImplV.V(false);
            } else {
                if (!(storeCreditContent instanceof StoreCreditContent.Success)) {
                    throw au.com.woolworths.android.onesite.a.w(851994284, composerImplV, false);
                }
                composerImplV.o(643212406);
                CheckoutStoreCreditDetail checkoutStoreCreditDetail = ((StoreCreditContent.Success) storeCreditContent).f10767a;
                if (checkoutStoreCreditDetail instanceof CheckoutStoreCreditDetail.Empty) {
                    composerImplV.o(852035570);
                    CheckoutStoreCreditDetail.Empty empty = (CheckoutStoreCreditDetail.Empty) checkoutStoreCreditDetail;
                    FullPageMessageUiKt.a(FullPageMessageSpec.Companion.g(PainterResources_androidKt.a(R.drawable.ic_store_credit_empty, 0, composerImplV), empty.f10584a, empty.b), modifier, null, composerImplV, (i2 >> 9) & 112, 4);
                    composerImplV.V(false);
                    z = false;
                } else if (checkoutStoreCreditDetail instanceof CheckoutStoreCreditDetail.Items) {
                    composerImplV.o(852049833);
                    CheckoutStoreCreditDetail.Items items = (CheckoutStoreCreditDetail.Items) checkoutStoreCreditDetail;
                    z = false;
                    StoreCreditListUiKt.a(items.f10585a, items.b, items.c, onApplyStoreCredit, onRemoveStoreCredit, modifier, composerImplV, (i2 << 3) & 523264, 0);
                    composerImplV = composerImplV;
                    composerImplV.V(false);
                } else {
                    z = false;
                    if (!(checkoutStoreCreditDetail instanceof CheckoutStoreCreditDetail.Unavailable)) {
                        throw au.com.woolworths.android.onesite.a.w(852032780, composerImplV, false);
                    }
                    composerImplV.o(852064107);
                    CheckoutStoreCreditDetail.Unavailable unavailable = (CheckoutStoreCreditDetail.Unavailable) checkoutStoreCreditDetail;
                    FullPageMessageUiKt.a(FullPageMessageSpec.Companion.d(null, unavailable.f10586a, unavailable.b, unavailable.c, onReloadButtonClick), modifier, null, composerImplV, (i2 >> 9) & 112, 4);
                    composerImplV.V(false);
                }
                composerImplV.V(z);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(onReloadButtonClick, onApplyStoreCredit, onRemoveStoreCredit, modifier, i) { // from class: au.com.woolworths.shop.checkout.ui.summary.storecredit.a
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function1 g;
                public final /* synthetic */ Modifier h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    StoreCreditContentUiKt.a(this.d, this.e, this.f, this.g, this.h, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
