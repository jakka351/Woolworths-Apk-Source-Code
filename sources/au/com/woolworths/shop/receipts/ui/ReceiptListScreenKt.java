package au.com.woolworths.shop.receipts.ui;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material.pullrefresh.PullRefreshStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.res.VectorResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.paging.CombinedLoadStates;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyFoundationExtensionsKt;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.bottomsheet.ModalBottomSheetLayoutKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.button.SecondaryButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.TextColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.bundles.ui.k;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageUiKt;
import au.com.woolworths.shop.receipts.ReceiptListContract;
import au.com.woolworths.shop.receipts.ShopReceiptListViewModel;
import au.com.woolworths.shop.receipts.data.ReceiptListItem;
import au.com.woolworths.shop.receipts.pagination.NoReceiptsError;
import au.com.woolworths.shop.receipts.pagination.ReceiptRowEntry;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003¨\u0006\u0005²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0004\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "isListAtTopPosition", "Landroidx/compose/ui/unit/Dp;", "topNavBarElevation", "showPaginationError", "receipts_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ReceiptListScreenKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f12881a = 16;

    public static final void a(FullPageMessage fullPageMessage, Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        FullPageMessageSpec fullPageMessageSpecF;
        ComposerImpl composerImpl2;
        ComposerImpl composerImplV = composer.v(-848683459);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(fullPageMessage) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function02) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl2 = composerImplV;
        } else {
            FillElement fillElement = SizeKt.c;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, fillElement);
            ComposeUiNode.e3.getClass();
            Function0 function03 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
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
            if (fullPageMessage instanceof FullPageMessage.Error.ConnectionError) {
                composerImplV.o(477496430);
                fullPageMessageSpecF = FullPageMessageSpec.Companion.b(null, StringResources_androidKt.c(composerImplV, R.string.receipt_list_network_error_message), function0, composerImplV, 7);
                composerImplV.V(false);
                composerImpl = composerImplV;
            } else if (fullPageMessage instanceof FullPageMessage.Error.ServerError) {
                composerImplV.o(477505417);
                composerImpl = composerImplV;
                fullPageMessageSpecF = FullPageMessageSpec.Companion.e(null, null, StringResources_androidKt.c(composerImplV, R.string.receipt_list_server_error_message), null, function0, composerImpl, 23);
                composerImpl.V(false);
            } else {
                composerImpl = composerImplV;
                if (!(fullPageMessage instanceof FullPageMessage.NoContent)) {
                    throw au.com.woolworths.android.onesite.a.w(477494099, composerImpl, false);
                }
                composerImpl.o(477514111);
                fullPageMessageSpecF = FullPageMessageSpec.Companion.f(PainterResources_androidKt.a(R.drawable.empty_receipt_list_error, 0, composerImpl), StringResources_androidKt.c(composerImpl, R.string.receipt_list_no_receipts_error_title), StringResources_androidKt.c(composerImpl, R.string.receipt_list_no_receipts_error_message));
                composerImpl.V(false);
            }
            ComposerImpl composerImpl3 = composerImpl;
            FullPageMessageUiKt.a(fullPageMessageSpecF, null, null, composerImpl3, 0, 6);
            composerImpl2 = composerImpl3;
            composerImpl2.o(477525313);
            if (fullPageMessage instanceof FullPageMessage.NoContent) {
                c((i2 >> 6) & 14, 0, composerImpl2, BoxScopeInstance.f944a.g(PaddingKt.f(Modifier.Companion.d, f12881a), Alignment.Companion.h), function02);
            }
            composerImpl2.V(false);
            composerImpl2.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(i, 28, fullPageMessage, function0, function02, false);
        }
    }

    public static final void b(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1349773724);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            FillElement fillElement = SizeKt.c;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, fillElement);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 30, 0L, 0L, composerImplV, BoxScopeInstance.f944a.g(Modifier.Companion.d, Alignment.Companion.e));
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b(i, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(int r14, int r15, androidx.compose.runtime.Composer r16, androidx.compose.ui.Modifier r17, kotlin.jvm.functions.Function0 r18) {
        /*
            r1 = r18
            java.lang.String r0 = "onViewMyOrdersClick"
            kotlin.jvm.internal.Intrinsics.h(r1, r0)
            r0 = -1480338338(0xffffffffa7c3d45e, float:-5.435362E-15)
            r2 = r16
            androidx.compose.runtime.ComposerImpl r6 = r2.v(r0)
            r0 = r14 & 6
            r2 = 4
            if (r0 != 0) goto L20
            boolean r0 = r6.I(r1)
            if (r0 == 0) goto L1d
            r0 = r2
            goto L1e
        L1d:
            r0 = 2
        L1e:
            r0 = r0 | r14
            goto L21
        L20:
            r0 = r14
        L21:
            r3 = r15 & 2
            if (r3 == 0) goto L2a
            r0 = r0 | 48
        L27:
            r4 = r17
            goto L3c
        L2a:
            r4 = r14 & 48
            if (r4 != 0) goto L27
            r4 = r17
            boolean r5 = r6.n(r4)
            if (r5 == 0) goto L39
            r5 = 32
            goto L3b
        L39:
            r5 = 16
        L3b:
            r0 = r0 | r5
        L3c:
            r5 = r0 & 19
            r7 = 18
            if (r5 != r7) goto L4e
            boolean r5 = r6.c()
            if (r5 != 0) goto L49
            goto L4e
        L49:
            r6.j()
            r2 = r4
            goto Lab
        L4e:
            if (r3 == 0) goto L53
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion.d
            goto L54
        L53:
            r3 = r4
        L54:
            au.com.woolworths.android.onesite.models.text.PlainText r10 = new au.com.woolworths.android.onesite.models.text.PlainText
            r4 = 2132018776(0x7f140658, float:1.9675868E38)
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.c(r6, r4)
            r10.<init>(r4)
            au.com.woolworths.android.onesite.modules.common.InlineErrorType r12 = au.com.woolworths.android.onesite.modules.common.InlineErrorType.f
            au.com.woolworths.android.onesite.modules.common.InlineErrorAction$AppLocal r11 = new au.com.woolworths.android.onesite.modules.common.InlineErrorAction$AppLocal
            au.com.woolworths.android.onesite.models.text.PlainText r4 = new au.com.woolworths.android.onesite.models.text.PlainText
            java.lang.String r5 = "VIEW"
            r4.<init>(r5)
            r11.<init>(r4)
            au.com.woolworths.android.onesite.modules.insetbanner.ActionPlacement r9 = au.com.woolworths.android.onesite.modules.insetbanner.ActionPlacement.RIGHT
            au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData r7 = new au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData
            r8 = 0
            au.com.woolworths.android.onesite.modules.common.InlineErrorCause$IconConfig$Default r13 = au.com.woolworths.android.onesite.modules.common.InlineErrorCause.IconConfig.Default.d
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r4 = 5004770(0x4c5de2, float:7.013177E-39)
            r6.o(r4)
            r4 = r0 & 14
            r5 = 0
            if (r4 != r2) goto L85
            r2 = 1
            goto L86
        L85:
            r2 = r5
        L86:
            java.lang.Object r4 = r6.G()
            if (r2 != 0) goto L90
            androidx.compose.runtime.Composer$Companion$Empty$1 r2 = androidx.compose.runtime.Composer.Companion.f1624a
            if (r4 != r2) goto L9a
        L90:
            au.com.woolworths.design.core.ui.component.experimental.quantitystepper.j r4 = new au.com.woolworths.design.core.ui.component.experimental.quantitystepper.j
            r2 = 20
            r4.<init>(r2, r1)
            r6.A(r4)
        L9a:
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r6.V(r5)
            r0 = r0 & 112(0x70, float:1.57E-43)
            r8 = 12
            r5 = r4
            r4 = 0
            r2 = r7
            r7 = r0
            au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt.b(r2, r3, r4, r5, r6, r7, r8)
            r2 = r3
        Lab:
            androidx.compose.runtime.RecomposeScopeImpl r6 = r6.X()
            if (r6 == 0) goto Lbb
            au.com.woolworths.design.core.ui.component.experimental.progressindicator.c r0 = new au.com.woolworths.design.core.ui.component.experimental.progressindicator.c
            r5 = 6
            r3 = r14
            r4 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.receipts.ui.ReceiptListScreenKt.c(int, int, androidx.compose.runtime.Composer, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0):void");
    }

    public static final void d(Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        Function0 function03;
        ComposerImpl composerImplV = composer.v(-630023911);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function02) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function03 = function0;
        } else {
            float f = 16;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierF = PaddingKt.f(companion, f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
            ComposeUiNode.e3.getClass();
            Function0 function04 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function04);
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
            float f2 = 160;
            ImageKt.b(VectorResources_androidKt.b(R.drawable.looking_for_more_receipts, 6, composerImplV), PaddingKt.j(SizeKt.a(companion, f2, f2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, 7), null, composerImplV, 432, 120);
            float f3 = 4;
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.receipt_list_older_activity_title), PaddingKt.h(companion, BitmapDescriptorFactory.HUE_RED, f3, 1), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).i, composerImplV, 48, 0, 65020);
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.receipt_list_older_activity_subtitle), SizeKt.e(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f3, BitmapDescriptorFactory.HUE_RED, f, 5), 1.0f), TextColors.b, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).l, composerImplV, 48, 0, 65016);
            PrimaryButtonKt.a(StringResources_androidKt.c(composerImplV, R.string.receipt_list_older_activity_got_it), function0, SizeKt.e(companion, 1.0f), false, false, null, null, null, null, composerImplV, ((i3 << 3) & 112) | KyberEngine.KyberPolyBytes, 1016);
            function03 = function0;
            SecondaryButtonKt.b(StringResources_androidKt.c(composerImplV, R.string.receipt_list_older_activity_chat_to_us), function02, SizeKt.e(companion, 1.0f), false, false, null, null, composerImplV, (i3 & 112) | KyberEngine.KyberPolyBytes, 120);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.web.file.uploader.permission.ui.a(function03, function02, i, 4);
        }
    }

    public static final void e(LoadState.Error error, Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-157050701);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(error) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function02) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Throwable th = error.b;
            a(th instanceof NoReceiptsError ? FullPageMessage.NoContent.f8921a : th instanceof NoConnectivityException ? FullPageMessage.Error.ConnectionError.f8919a : FullPageMessage.Error.ServerError.f8920a, function02, function0, composerImplV, ((i2 << 3) & 896) | ((i2 >> 3) & 112));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(i, 29, error, function0, function02, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [boolean, int] */
    public static final void f(final ShopReceiptListViewModel viewModel, final Function1 onReceiptClick, final Function0 onViewMyOrdersClick, final Function0 onChatToUsClicked, Function0 launchMyOrders, Function0 launchChatToUs, Function1 launchReceiptDetails, final Function0 onNavigateUp, Composer composer, int i) {
        Flow flow;
        Object receiptListScreenKt$ReceiptListScreen$1$1;
        ?? r12;
        ComposerImpl composerImpl;
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onReceiptClick, "onReceiptClick");
        Intrinsics.h(onViewMyOrdersClick, "onViewMyOrdersClick");
        Intrinsics.h(onChatToUsClicked, "onChatToUsClicked");
        Intrinsics.h(launchMyOrders, "launchMyOrders");
        Intrinsics.h(launchChatToUs, "launchChatToUs");
        Intrinsics.h(launchReceiptDetails, "launchReceiptDetails");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        ComposerImpl composerImplV = composer.v(-881101532);
        int i2 = i | (composerImplV.I(viewModel) ? 4 : 2) | (composerImplV.I(onReceiptClick) ? 32 : 16) | (composerImplV.I(onViewMyOrdersClick) ? 256 : 128) | (composerImplV.I(onChatToUsClicked) ? 2048 : 1024) | (composerImplV.I(launchMyOrders) ? 16384 : 8192) | (composerImplV.I(launchChatToUs) ? 131072 : 65536) | (composerImplV.I(launchReceiptDetails) ? 1048576 : 524288) | (composerImplV.I(onNavigateUp) ? 8388608 : 4194304);
        if ((i2 & 4793491) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Flow flow2 = viewModel.h;
            composerImplV.o(-1224400529);
            boolean zI = ((i2 & 57344) == 16384) | composerImplV.I(viewModel) | ((i2 & 3670016) == 1048576) | ((i2 & 458752) == 131072);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                flow = flow2;
                r12 = 0;
                receiptListScreenKt$ReceiptListScreen$1$1 = new ReceiptListScreenKt$ReceiptListScreen$1$1(viewModel, launchReceiptDetails, launchMyOrders, launchChatToUs, null);
                composerImplV.A(receiptListScreenKt$ReceiptListScreen$1$1);
            } else {
                flow = flow2;
                receiptListScreenKt$ReceiptListScreen$1$1 = objG;
                r12 = 0;
            }
            composerImplV.V(r12);
            EffectsKt.e(composerImplV, flow, (Function2) receiptListScreenKt$ReceiptListScreen$1$1);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objG2;
            final ModalBottomSheetState modalBottomSheetStateC = ModalBottomSheetKt.c(ModalBottomSheetValue.d, null, composerImplV, 3078, 6);
            final float fT1 = ((Density) composerImplV.x(CompositionLocalsKt.h)).T1(8);
            final LazyListState lazyListStateA = LazyListStateKt.a(r12, r12, 3, composerImplV);
            composerImplV.o(1849434622);
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = SnapshotStateKt.d(new Function0() { // from class: au.com.woolworths.shop.receipts.ui.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float f = ReceiptListScreenKt.f12881a;
                        LazyListState lazyListState = lazyListStateA;
                        return Boolean.valueOf(lazyListState.h() == 0 && ((float) lazyListState.i()) < fT1);
                    }
                });
                composerImplV.A(objG3);
            }
            composerImplV.V(r12);
            final State stateA = AnimateAsStateKt.a(((Boolean) ((State) objG3).getD()).booleanValue() ? (float) r12 : 4, null, null, null, composerImplV, 0, 14);
            Boolean boolValueOf = Boolean.valueOf(modalBottomSheetStateC.d());
            composerImplV.o(-1633490746);
            boolean zI2 = composerImplV.I(modalBottomSheetStateC) | composerImplV.I(viewModel);
            Object objG4 = composerImplV.G();
            if (zI2 || objG4 == composer$Companion$Empty$1) {
                objG4 = new ReceiptListScreenKt$ReceiptListScreen$2$1(modalBottomSheetStateC, viewModel, null);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, boolValueOf, (Function2) objG4);
            composerImplV.o(-1746271574);
            boolean zI3 = composerImplV.I(coroutineScope) | composerImplV.I(modalBottomSheetStateC) | ((i2 & 29360128) == 8388608);
            Object objG5 = composerImplV.G();
            if (zI3 || objG5 == composer$Companion$Empty$1) {
                objG5 = new d(0, coroutineScope, modalBottomSheetStateC, onNavigateUp);
                composerImplV.A(objG5);
            }
            composerImplV.V(false);
            BackHandlerKt.a(false, (Function0) objG5, composerImplV, 0, 1);
            ModalBottomSheetLayoutKt.a(ComposableLambdaKt.c(1592193846, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.receipts.ui.ReceiptListScreenKt$ReceiptListScreen$4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope ModalBottomSheetLayout = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        composer2.o(-1746271574);
                        ShopReceiptListViewModel shopReceiptListViewModel = viewModel;
                        boolean zI4 = composer2.I(shopReceiptListViewModel);
                        CoroutineScope coroutineScope2 = coroutineScope;
                        boolean zI5 = zI4 | composer2.I(coroutineScope2);
                        ModalBottomSheetState modalBottomSheetState = modalBottomSheetStateC;
                        boolean zI6 = zI5 | composer2.I(modalBottomSheetState);
                        Object objG6 = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                        if (zI6 || objG6 == composer$Companion$Empty$12) {
                            objG6 = new d(shopReceiptListViewModel, coroutineScope2, modalBottomSheetState);
                            composer2.A(objG6);
                        }
                        Function0 function0 = (Function0) objG6;
                        composer2.l();
                        composer2.o(-1633490746);
                        boolean zI7 = composer2.I(shopReceiptListViewModel);
                        Function0 function02 = onChatToUsClicked;
                        boolean zN = zI7 | composer2.n(function02);
                        Object objG7 = composer2.G();
                        if (zN || objG7 == composer$Companion$Empty$12) {
                            objG7 = new g(3, shopReceiptListViewModel, function02);
                            composer2.A(objG7);
                        }
                        composer2.l();
                        ReceiptListScreenKt.d(function0, (Function0) objG7, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, modalBottomSheetStateC, BitmapDescriptorFactory.HUE_RED, 0L, 0L, false, ComposableLambdaKt.c(-1576311585, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.receipts.ui.ReceiptListScreenKt$ReceiptListScreen$5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        FillElement fillElement = SizeKt.c;
                        final State state = stateA;
                        final Function0 function0 = onNavigateUp;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(1812529338, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.receipts.ui.ReceiptListScreenKt$ReceiptListScreen$5.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    String strC = StringResources_androidKt.c(composer3, R.string.receipt_list_title);
                                    float f = ReceiptListScreenKt.f12881a;
                                    float f2 = ((Dp) state.getD()).d;
                                    final Function0 function02 = function0;
                                    TopNavBarKt.b(strC, null, null, null, 0L, 0L, 0L, null, f2, ComposableLambdaKt.c(1620570121, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.receipts.ui.ReceiptListScreenKt.ReceiptListScreen.5.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            Composer composer4 = (Composer) obj5;
                                            if ((((Number) obj6).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                ImageVector imageVectorA = ArrowBackKt.a();
                                                String strC2 = StringResources_androidKt.c(composer4, R.string.content_description_back_button);
                                                composer4.o(5004770);
                                                Function0 function03 = function02;
                                                boolean zN = composer4.n(function03);
                                                Object objG6 = composer4.G();
                                                if (zN || objG6 == Composer.Companion.f1624a) {
                                                    objG6 = new au.com.woolworths.shop.lists.ui.magicmatch.ui.c(13, function03);
                                                    composer4.A(objG6);
                                                }
                                                composer4.l();
                                                IconButtonKt.c(imageVectorA, strC2, (Function0) objG6, null, false, 0L, composer4, 0, 56);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), null, composer3, 805306368, 0, 1278);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final ModalBottomSheetState modalBottomSheetState = modalBottomSheetStateC;
                        final LazyListState lazyListState = lazyListStateA;
                        final ShopReceiptListViewModel shopReceiptListViewModel = viewModel;
                        final Function1 function1 = onReceiptClick;
                        final Function0 function02 = onViewMyOrdersClick;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        ScaffoldKt.a(fillElement, null, composableLambdaImplC, null, null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(941861640, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.receipts.ui.ReceiptListScreenKt$ReceiptListScreen$5.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                PaddingValues paddingValues = (PaddingValues) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(paddingValues, "paddingValues");
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= composer3.n(paddingValues) ? 4 : 2;
                                }
                                if ((iIntValue & 19) == 18 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    Modifier modifierE = PaddingKt.e(Modifier.Companion.d, paddingValues);
                                    ShopReceiptListViewModel shopReceiptListViewModel2 = shopReceiptListViewModel;
                                    Flow flow3 = shopReceiptListViewModel2.k;
                                    composer3.o(-1633490746);
                                    CoroutineScope coroutineScope3 = coroutineScope2;
                                    boolean zI4 = composer3.I(coroutineScope3);
                                    ModalBottomSheetState modalBottomSheetState2 = modalBottomSheetState;
                                    boolean zI5 = zI4 | composer3.I(modalBottomSheetState2);
                                    Object objG6 = composer3.G();
                                    if (zI5 || objG6 == Composer.Companion.f1624a) {
                                        objG6 = new g(0, coroutineScope3, modalBottomSheetState2);
                                        composer3.A(objG6);
                                    }
                                    composer3.l();
                                    ReceiptListScreenKt.g(flow3, shopReceiptListViewModel2, function1, function02, (Function0) objG6, modifierE, lazyListState, composer3, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 390, 1018);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12583430, 122);
            composerImpl = composerImplV;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.offers.detail.composable.b(viewModel, onReceiptClick, onViewMyOrdersClick, onChatToUsClicked, launchMyOrders, launchChatToUs, launchReceiptDetails, onNavigateUp, i);
        }
    }

    public static final void g(final Flow flow, ReceiptListContract.ReceiptListAnalyticsHandler receiptListAnalyticsHandler, final Function1 function1, final Function0 function0, Function0 function02, final Modifier modifier, final LazyListState lazyListState, Composer composer, final int i) {
        Object receiptListScreenKt$ReceiptListScreenContent$2$1;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        CoroutineScope coroutineScope;
        int i2;
        final ReceiptListContract.ReceiptListAnalyticsHandler receiptListAnalyticsHandler2;
        final Function0 function03;
        int i3;
        boolean z;
        boolean z2;
        ComposerImpl composerImplV = composer.v(-863931192);
        int i4 = i | (composerImplV.I(flow) ? 4 : 2) | (composerImplV.n(receiptListAnalyticsHandler) ? 32 : 16) | (composerImplV.I(function1) ? 256 : 128) | (composerImplV.I(function0) ? 2048 : 1024) | (composerImplV.I(function02) ? 16384 : 8192) | (composerImplV.n(modifier) ? 131072 : 65536) | (composerImplV.n(lazyListState) ? 1048576 : 524288);
        if ((599187 & i4) == 599186 && composerImplV.c()) {
            composerImplV.j();
            receiptListAnalyticsHandler2 = receiptListAnalyticsHandler;
            function03 = function02;
        } else {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$12) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) objG;
            LazyPagingItems lazyPagingItemsA = LazyPagingItemsKt.a(flow, composerImplV);
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$12) {
                objG2 = new SnackbarHostState();
                composerImplV.A(objG2);
            }
            SnackbarHostState snackbarHostState = (SnackbarHostState) objG2;
            composerImplV.V(false);
            String strC = StringResources_androidKt.c(composerImplV, R.string.receipt_list_failed_to_refresh);
            String strC2 = StringResources_androidKt.c(composerImplV, R.string.receipt_list_snack_bar_try_again);
            LoadState loadState = lazyPagingItemsA.d().c;
            composerImplV.o(-1633490746);
            int i5 = i4 & 112;
            boolean zI = composerImplV.I(lazyPagingItemsA) | (i5 == 32);
            Object objG3 = composerImplV.G();
            if (zI || objG3 == composer$Companion$Empty$12) {
                objG3 = new ReceiptListScreenKt$ReceiptListScreenContent$1$1(lazyPagingItemsA, receiptListAnalyticsHandler, null);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, loadState, (Function2) objG3);
            LoadState loadState2 = lazyPagingItemsA.d().f3529a;
            composerImplV.o(-1224400529);
            boolean zI2 = composerImplV.I(lazyPagingItemsA) | (i5 == 32) | composerImplV.n(strC) | composerImplV.n(strC2);
            Object objG4 = composerImplV.G();
            if (zI2 || objG4 == composer$Companion$Empty$12) {
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                coroutineScope = coroutineScope2;
                i2 = i4;
                receiptListAnalyticsHandler2 = receiptListAnalyticsHandler;
                receiptListScreenKt$ReceiptListScreenContent$2$1 = new ReceiptListScreenKt$ReceiptListScreenContent$2$1(lazyPagingItemsA, receiptListAnalyticsHandler2, snackbarHostState, strC, strC2, null);
                composerImplV.A(receiptListScreenKt$ReceiptListScreenContent$2$1);
            } else {
                receiptListAnalyticsHandler2 = receiptListAnalyticsHandler;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                receiptListScreenKt$ReceiptListScreenContent$2$1 = objG4;
                i2 = i4;
                coroutineScope = coroutineScope2;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, loadState2, (Function2) receiptListScreenKt$ReceiptListScreenContent$2$1);
            LoadState loadState3 = lazyPagingItemsA.d().f3529a;
            LoadState.Loading loading = LoadState.Loading.b;
            boolean zC = Intrinsics.c(loadState3, loading);
            composerImplV.o(-1746271574);
            boolean zI3 = (i5 == 32) | composerImplV.I(coroutineScope) | composerImplV.I(lazyPagingItemsA);
            Object objG5 = composerImplV.G();
            if (zI3 || objG5 == composer$Companion$Empty$1) {
                objG5 = new d(receiptListAnalyticsHandler2, coroutineScope, lazyPagingItemsA);
                composerImplV.A(objG5);
            }
            composerImplV.V(false);
            PullRefreshState pullRefreshStateA = PullRefreshStateKt.a(zC, (Function0) objG5, composerImplV, 0);
            Modifier modifierA = PullRefreshKt.a(modifier, pullRefreshStateA, true);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
            ComposeUiNode.e3.getClass();
            Function0 function04 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function04);
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
            LoadState loadState4 = lazyPagingItemsA.d().f3529a;
            if (loadState4 instanceof LoadState.Error) {
                composerImplV.o(-43289928);
                if (lazyPagingItemsA.c().isEmpty()) {
                    LoadState.Error error = (LoadState.Error) loadState4;
                    receiptListAnalyticsHandler2.S(error.b);
                    composerImplV.o(-1746271574);
                    boolean zI4 = (i5 == 32) | composerImplV.I(loadState4) | composerImplV.I(lazyPagingItemsA);
                    Object objG6 = composerImplV.G();
                    if (zI4 || objG6 == composer$Companion$Empty$1) {
                        objG6 = new d(3, receiptListAnalyticsHandler2, loadState4, lazyPagingItemsA);
                        composerImplV.A(objG6);
                    }
                    z2 = false;
                    composerImplV.V(false);
                    e(error, function0, (Function0) objG6, composerImplV, (i2 >> 6) & 112);
                } else {
                    z2 = false;
                }
                composerImplV.V(z2);
            } else if (loadState4 instanceof LoadState.Loading) {
                composerImplV.o(-42594660);
                if (lazyPagingItemsA.c().isEmpty()) {
                    b(composerImplV, 0);
                }
                composerImplV.V(false);
            } else {
                if (!(loadState4 instanceof LoadState.NotLoading)) {
                    throw au.com.woolworths.android.onesite.a.w(-694135851, composerImplV, false);
                }
                composerImplV.o(-42425741);
                composerImplV.V(false);
            }
            composerImplV.o(-694102218);
            if (lazyPagingItemsA.c().isEmpty()) {
                function03 = function02;
                i3 = 16;
                z = false;
            } else {
                composerImplV.o(-1633490746);
                boolean z3 = ((i2 & 896) == 256) | (i5 == 32);
                Object objG7 = composerImplV.G();
                if (z3 || objG7 == composer$Companion$Empty$1) {
                    objG7 = new Function1() { // from class: au.com.woolworths.shop.receipts.ui.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ReceiptListItem it = (ReceiptListItem) obj;
                            float f = ReceiptListScreenKt.f12881a;
                            Intrinsics.h(it, "it");
                            function1.invoke(it);
                            receiptListAnalyticsHandler2.H4();
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG7);
                }
                Function1 function12 = (Function1) objG7;
                composerImplV.V(false);
                composerImplV.o(-1633490746);
                boolean z4 = ((i2 & 7168) == 2048) | (i5 == 32);
                Object objG8 = composerImplV.G();
                if (z4 || objG8 == composer$Companion$Empty$1) {
                    final int i7 = 0;
                    objG8 = new Function0() { // from class: au.com.woolworths.shop.receipts.ui.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i8 = i7;
                            Unit unit = Unit.f24250a;
                            ReceiptListContract.ReceiptListAnalyticsHandler receiptListAnalyticsHandler3 = receiptListAnalyticsHandler2;
                            Function0 function05 = function0;
                            switch (i8) {
                                case 0:
                                    float f = ReceiptListScreenKt.f12881a;
                                    function05.invoke();
                                    receiptListAnalyticsHandler3.Y0();
                                    break;
                                default:
                                    float f2 = ReceiptListScreenKt.f12881a;
                                    function05.invoke();
                                    receiptListAnalyticsHandler3.Y3();
                                    break;
                            }
                            return unit;
                        }
                    };
                    composerImplV.A(objG8);
                }
                Function0 function05 = (Function0) objG8;
                composerImplV.V(false);
                composerImplV.o(-1633490746);
                boolean z5 = ((57344 & i2) == 16384) | (i5 == 32);
                Object objG9 = composerImplV.G();
                if (z5 || objG9 == composer$Companion$Empty$1) {
                    final int i8 = 1;
                    function03 = function02;
                    objG9 = new Function0() { // from class: au.com.woolworths.shop.receipts.ui.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i82 = i8;
                            Unit unit = Unit.f24250a;
                            ReceiptListContract.ReceiptListAnalyticsHandler receiptListAnalyticsHandler3 = receiptListAnalyticsHandler2;
                            Function0 function052 = function03;
                            switch (i82) {
                                case 0:
                                    float f = ReceiptListScreenKt.f12881a;
                                    function052.invoke();
                                    receiptListAnalyticsHandler3.Y0();
                                    break;
                                default:
                                    float f2 = ReceiptListScreenKt.f12881a;
                                    function052.invoke();
                                    receiptListAnalyticsHandler3.Y3();
                                    break;
                            }
                            return unit;
                        }
                    };
                    composerImplV.A(objG9);
                } else {
                    function03 = function02;
                }
                Function0 function06 = (Function0) objG9;
                composerImplV.V(false);
                composerImplV.o(5004770);
                boolean z6 = i5 == 32;
                Object objG10 = composerImplV.G();
                if (z6 || objG10 == composer$Companion$Empty$1) {
                    objG10 = new au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c(receiptListAnalyticsHandler2, 4);
                    composerImplV.A(objG10);
                }
                Function0 function07 = (Function0) objG10;
                composerImplV.V(false);
                composerImplV.o(-1633490746);
                boolean zI5 = (i5 == 32) | composerImplV.I(lazyPagingItemsA);
                Object objG11 = composerImplV.G();
                if (zI5 || objG11 == composer$Companion$Empty$1) {
                    objG11 = new g(2, receiptListAnalyticsHandler2, lazyPagingItemsA);
                    composerImplV.A(objG11);
                }
                composerImplV.V(false);
                z = false;
                i3 = 16;
                h(lazyPagingItemsA, function12, function05, function06, function07, (Function0) objG11, lazyListState, composerImplV, 8 | (3670016 & i2));
                composerImplV = composerImplV;
            }
            composerImplV.V(z);
            composerImplV.o(-694067804);
            boolean zIsEmpty = lazyPagingItemsA.c().isEmpty();
            Modifier.Companion companion = Modifier.Companion.d;
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f944a;
            if (!zIsEmpty) {
                ComposerImpl composerImpl = composerImplV;
                PullRefreshIndicatorKt.a(Intrinsics.c(lazyPagingItemsA.d().f3529a, loading), pullRefreshStateA, boxScopeInstance.g(companion, Alignment.Companion.b), 0L, 0L, composerImpl, 64, 56);
                composerImplV = composerImpl;
            }
            composerImplV.V(z);
            SnackbarHostKt.b(snackbarHostState, PaddingKt.j(boxScopeInstance.g(companion, Alignment.Companion.h), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i3, 7), ComposableSingletons$ReceiptListScreenKt.f12880a, composerImplV, 390, 0);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            final ReceiptListContract.ReceiptListAnalyticsHandler receiptListAnalyticsHandler3 = receiptListAnalyticsHandler2;
            final Function0 function08 = function03;
            recomposeScopeImplX.d = new Function2(receiptListAnalyticsHandler3, function1, function0, function08, modifier, lazyListState, i) { // from class: au.com.woolworths.shop.receipts.ui.b
                public final /* synthetic */ ReceiptListContract.ReceiptListAnalyticsHandler e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function0 g;
                public final /* synthetic */ Function0 h;
                public final /* synthetic */ Modifier i;
                public final /* synthetic */ LazyListState j;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    ReceiptListScreenKt.g(this.d, this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void h(final LazyPagingItems lazyPagingItems, Function1 function1, Function0 function0, Function0 function02, Function0 function03, Function0 function04, LazyListState lazyListState, Composer composer, int i) {
        int i2;
        Function1 function12;
        Function0 function05;
        Function0 function06;
        Function0 function07;
        Function0 function08;
        int i3;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(143186074);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(lazyPagingItems) : composerImplV.I(lazyPagingItems) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function12 = function1;
            i2 |= composerImplV.I(function12) ? 32 : 16;
        } else {
            function12 = function1;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            function05 = function0;
            i2 |= composerImplV.I(function05) ? 256 : 128;
        } else {
            function05 = function0;
        }
        if ((i & 3072) == 0) {
            function06 = function02;
            i2 |= composerImplV.I(function06) ? 2048 : 1024;
        } else {
            function06 = function02;
        }
        if ((i & 24576) == 0) {
            function07 = function03;
            i2 |= composerImplV.I(function07) ? 16384 : 8192;
        } else {
            function07 = function03;
        }
        if ((196608 & i) == 0) {
            function08 = function04;
            i2 |= composerImplV.I(function08) ? 131072 : 65536;
        } else {
            function08 = function04;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.n(lazyListState) ? 1048576 : 524288;
        }
        if ((i2 & 599187) == 599186 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            CombinedLoadStates combinedLoadStatesD = lazyPagingItems.d();
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(combinedLoadStatesD);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zN || objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.d(new k(lazyPagingItems, 10));
                composerImplV.A(objG);
            }
            final State state = (State) objG;
            composerImplV.V(false);
            composerImplV.o(-1224400529);
            boolean zN2 = ((i2 & 14) == 4 || ((i2 & 8) != 0 && composerImplV.I(lazyPagingItems))) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((57344 & i2) == 16384) | ((i2 & 7168) == 2048) | composerImplV.n(state) | ((458752 & i2) == 131072);
            Object objG2 = composerImplV.G();
            if (zN2 || objG2 == composer$Companion$Empty$1) {
                i3 = i2;
                final Function1 function13 = function12;
                final Function0 function09 = function05;
                final Function0 function010 = function06;
                final Function0 function011 = function07;
                final Function0 function012 = function08;
                Function1 function14 = new Function1() { // from class: au.com.woolworths.shop.receipts.ui.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        float f = ReceiptListScreenKt.f12881a;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        final LazyPagingItems lazyPagingItems2 = lazyPagingItems;
                        int iB = lazyPagingItems2.b();
                        Function1 function1A = LazyFoundationExtensionsKt.a(lazyPagingItems2, new au.com.woolworths.shop.ratingsandreviews.ui.shared.a(3));
                        final Function1 function15 = function13;
                        final Function0 function013 = function09;
                        final Function0 function014 = function011;
                        final Function0 function015 = function010;
                        LazyListScope.g(LazyColumn, iB, function1A, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.receipts.ui.ReceiptListScreenKt$ReceiptListUI$1$1$2
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                LazyItemScope items = (LazyItemScope) obj2;
                                int iIntValue = ((Number) obj3).intValue();
                                Composer composer2 = (Composer) obj4;
                                int iIntValue2 = ((Number) obj5).intValue();
                                Intrinsics.h(items, "$this$items");
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= composer2.r(iIntValue) ? 32 : 16;
                                }
                                if ((iIntValue2 & 145) == 144 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    ReceiptRowEntry receiptRowEntry = (ReceiptRowEntry) lazyPagingItems2.a(iIntValue);
                                    if (receiptRowEntry instanceof ReceiptRowEntry.ReceiptItem) {
                                        composer2.o(-980874564);
                                        ReceiptRowEntry.ReceiptItem receiptItem = (ReceiptRowEntry.ReceiptItem) receiptRowEntry;
                                        ReceiptListItemUIKt.d(new ReceiptListItem(receiptItem.f12876a, receiptItem.b, receiptItem.c), function15, composer2, 0);
                                        composer2.l();
                                    } else if (receiptRowEntry instanceof ReceiptRowEntry.GroupHeader) {
                                        composer2.o(-980424630);
                                        ReceiptListItemUIKt.a(((ReceiptRowEntry.GroupHeader) receiptRowEntry).f12873a, composer2, 0);
                                        composer2.l();
                                    } else if (Intrinsics.c(receiptRowEntry, ReceiptRowEntry.MyOrdersBanner.f12874a)) {
                                        composer2.o(-980288819);
                                        ReceiptListScreenKt.c(48, 0, composer2, PaddingKt.f(Modifier.Companion.d, ReceiptListScreenKt.f12881a), function013);
                                        composer2.l();
                                    } else if (Intrinsics.c(receiptRowEntry, ReceiptRowEntry.NoMoreReceipts.f12875a)) {
                                        composer2.o(-979944440);
                                        function014.invoke();
                                        ReceiptListItemUIKt.c(0, composer2, null, function015);
                                        composer2.l();
                                    } else {
                                        composer2.o(1076773842);
                                        composer2.l();
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, true, 1400455480), 4);
                        if (lazyPagingItems2.d().c instanceof LoadState.Loading) {
                            LazyListScope.i(LazyColumn, null, null, ComposableSingletons$ReceiptListScreenKt.b, 3);
                        }
                        if (((Boolean) state.getD()).booleanValue()) {
                            final Function0 function016 = function012;
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.receipts.ui.ReceiptListScreenKt$ReceiptListUI$1$1$3
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        ReceiptPaginationErrorUiKt.a(48, 0, composer2, SizeKt.e(Modifier.Companion.d, 1.0f), function016);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 154531969), 3);
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(function14);
                objG2 = function14;
            } else {
                i3 = i2;
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            LazyDslKt.b(null, lazyListState, null, false, null, null, null, false, null, (Function1) objG2, composerImpl, (i3 >> 15) & 112, 509);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.a(lazyPagingItems, function1, function0, function02, function03, function04, lazyListState, i, 7);
        }
    }
}
