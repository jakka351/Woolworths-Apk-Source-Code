package au.com.woolworths.shop.checkout.ui.compose;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageUiKt;
import au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewModel;
import au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewState;
import com.google.accompanist.web.AccompanistWebViewClient;
import com.google.accompanist.web.WebContent;
import com.google.accompanist.web.WebViewKt;
import com.google.accompanist.web.WebViewState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationViewState;", "data", "shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class IdVerificationScreenKt {
    public static final void a(final IdVerificationViewModel viewModel, final Function0 onNavigateUp, Composer composer, int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        ComposerImpl composerImplV = composer.v(1442435609);
        if ((((composerImplV.I(viewModel) ? 4 : 2) | i | (composerImplV.I(onNavigateUp) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new AccompanistWebViewClient() { // from class: au.com.woolworths.shop.checkout.ui.compose.IdVerificationScreenKt$IdVerificationScreen$wcc$1$1
                    @Override // android.webkit.WebViewClient
                    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                        return viewModel.p6(webResourceRequest != null ? webResourceRequest.getUrl() : null);
                    }

                    @Override // android.webkit.WebViewClient
                    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                        return viewModel.p6(str != null ? Uri.parse(str) : null);
                    }
                };
                composerImplV.A(objG);
            }
            final IdVerificationScreenKt$IdVerificationScreen$wcc$1$1 idVerificationScreenKt$IdVerificationScreen$wcc$1$1 = (IdVerificationScreenKt$IdVerificationScreen$wcc$1$1) objG;
            composerImplV.V(false);
            composerImpl = composerImplV;
            ScaffoldKt.a(SizeKt.c, null, ComposableLambdaKt.c(-1113062754, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.compose.IdVerificationScreenKt$IdVerificationScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC = StringResources_androidKt.c(composer2, R.string.title_idv_webview_toolbar);
                        final Function0 function0 = onNavigateUp;
                        TopNavBarKt.b(strC, null, null, null, 0L, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(-1378964945, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.compose.IdVerificationScreenKt$IdVerificationScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(CloseKt.a(), StringResources_androidKt.c(composer3, R.string.close_button), function0, null, false, 0L, composer3, 0, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), ComposableLambdaKt.c(-817555383, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.compose.IdVerificationScreenKt$IdVerificationScreen$1.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                RowScope TopNavBar = (RowScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(TopNavBar, "$this$TopNavBar");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ButtonKt.c(function0, null, false, null, null, null, null, null, ComposableSingletons$IdVerificationScreenKt.f10712a, composer3, 805306368, 510);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 805306368, 6, 510);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(851512336, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.compose.IdVerificationScreenKt$IdVerificationScreen$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        IdVerificationViewModel idVerificationViewModel = viewModel;
                        IdVerificationViewState.Content content = ((IdVerificationViewState) FlowExtKt.a(idVerificationViewModel.h, composer2).getD()).f10802a;
                        boolean z = content instanceof IdVerificationViewState.Content.Loaded;
                        Object obj4 = Composer.Companion.f1624a;
                        if (z) {
                            composer2.o(1327346375);
                            String str = ((IdVerificationViewState.Content.Loaded) content).f10804a.f10797a;
                            int i2 = WebViewKt.f14380a;
                            composer2.F(1238013775);
                            Map map = EmptyMap.d;
                            composer2.F(-492369756);
                            Object objG2 = composer2.G();
                            if (objG2 == obj4) {
                                objG2 = new WebViewState(new WebContent.Url(str, map));
                                composer2.A(objG2);
                            }
                            composer2.N();
                            WebViewState webViewState = (WebViewState) objG2;
                            WebContent.Url url = new WebContent.Url(str, map);
                            webViewState.getClass();
                            ((SnapshotMutableStateImpl) webViewState.b).setValue(url);
                            composer2.N();
                            composer2.o(1849434622);
                            Object objG3 = composer2.G();
                            if (objG3 == obj4) {
                                objG3 = new au.com.woolworths.shop.cart.ui.productreview.h(28);
                                composer2.A(objG3);
                            }
                            Function1 function1 = (Function1) objG3;
                            composer2.l();
                            int i3 = AccompanistWebViewClient.c;
                            WebViewKt.b(webViewState, null, false, null, function1, null, idVerificationScreenKt$IdVerificationScreen$wcc$1$1, null, composer2, 2121728);
                            composer2.l();
                        } else if (content instanceof IdVerificationViewState.Content.Loading) {
                            composer2.o(1327828859);
                            SurfaceKt.a(SizeKt.c, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableSingletons$IdVerificationScreenKt.b, composer2, 1572870, 62);
                            composer2.l();
                        } else {
                            if (!(content instanceof IdVerificationViewState.Content.Error)) {
                                throw au.com.woolworths.android.onesite.a.x(composer2, -2035394151);
                            }
                            composer2.o(1328294696);
                            FullPageMessage.Error error = ((IdVerificationViewState.Content.Error) content).f10803a;
                            String strC = StringResources_androidKt.c(composer2, R.string.id_verification_connection_error_message);
                            String strC2 = StringResources_androidKt.c(composer2, R.string.id_verification_server_error_message);
                            composer2.o(5004770);
                            boolean zI = composer2.I(idVerificationViewModel);
                            Object objG4 = composer2.G();
                            if (zI || objG4 == obj4) {
                                objG4 = new c(idVerificationViewModel, 3);
                                composer2.A(objG4);
                            }
                            composer2.l();
                            FullPageMessageUiKt.a(FullPageMessageSpec.Companion.a(error, strC, strC2, (Function0) objG4, composer2, 1572864, 6), SizeKt.c, null, composer2, 48, 4);
                            composer2.l();
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 390, 1018);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(viewModel, i, 2, onNavigateUp);
        }
    }
}
