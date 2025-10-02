package androidx.navigation.compose;

import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.state.ToggleableState;
import androidx.core.graphics.Insets;
import androidx.navigation.NavHostController;
import au.com.woolworths.android.onesite.modules.customviews.WebViewActivity;
import au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesActivity;
import au.com.woolworths.base.shopapp.databinding.SimpleCoachMarkContentBinding;
import au.com.woolworths.compose.utils.graphics.ForwardingDrawInfo;
import au.com.woolworths.dynamic.page.ui.content.CategoryTileListUiKt;
import au.com.woolworths.feature.product.list.compose.filter.LoadingScreenKt;
import au.com.woolworths.feature.product.list.data.CustomMessage;
import au.com.woolworths.feature.product.list.data.FullScreenMessage;
import au.com.woolworths.feature.product.list.ui.FilterMenuItem;
import com.skydoves.balloon.Balloon;
import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;
import timber.log.Timber;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Function2 {
    public final /* synthetic */ int d;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        int i2 = 0;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                return ((NavHostController) obj2).i();
            case 1:
                ViewGroup.MarginLayoutParams applyInsets = (ViewGroup.MarginLayoutParams) obj;
                Insets it = (Insets) obj2;
                Intrinsics.h(applyInsets, "$this$applyInsets");
                Intrinsics.h(it, "it");
                applyInsets.bottomMargin = it.d;
                return unit;
            case 2:
                ViewGroup.MarginLayoutParams applyInsets2 = (ViewGroup.MarginLayoutParams) obj;
                Insets insets = (Insets) obj2;
                int i3 = WebViewActivity.F;
                Intrinsics.h(applyInsets2, "$this$applyInsets");
                Intrinsics.h(insets, "insets");
                applyInsets2.bottomMargin = insets.d;
                return unit;
            case 3:
                ViewGroup.MarginLayoutParams applyInsets3 = (ViewGroup.MarginLayoutParams) obj;
                Insets it2 = (Insets) obj2;
                int i4 = ManageFullDeliveryAddressesActivity.H;
                Intrinsics.h(applyInsets3, "$this$applyInsets");
                Intrinsics.h(it2, "it");
                applyInsets3.bottomMargin = it2.d;
                return unit;
            case 4:
                ViewGroup.MarginLayoutParams applyInsets4 = (ViewGroup.MarginLayoutParams) obj;
                Insets it3 = (Insets) obj2;
                int i5 = ManageFullDeliveryAddressesActivity.H;
                Intrinsics.h(applyInsets4, "$this$applyInsets");
                Intrinsics.h(it3, "it");
                applyInsets4.bottomMargin = it3.d;
                return unit;
            case 5:
                Throwable th = (Throwable) obj;
                int iIntValue = ((Integer) obj2).intValue();
                Intrinsics.h(th, "th");
                if ((th instanceof HttpException) && ((HttpException) th).d == 401) {
                    Timber.f27013a.o("Refreshing token failed with 401. No retrying.", new Object[0]);
                } else if (iIntValue <= 0) {
                    long j = iIntValue * 300;
                    Timber.f27013a.h("Retrying to refresh token, attempt : " + iIntValue + " with delay : " + j + "ms", new Object[0]);
                    return Observable.k(j, TimeUnit.MILLISECONDS);
                }
                Timber.f27013a.h("Max refreshToken retry attempt reached.", new Object[0]);
                return Observable.b(th);
            case 6:
                SimpleCoachMarkContentBinding simpleCoachMarkContentBinding = (SimpleCoachMarkContentBinding) obj;
                Balloon balloon = (Balloon) obj2;
                Intrinsics.h(simpleCoachMarkContentBinding, "<this>");
                Intrinsics.h(balloon, "balloon");
                simpleCoachMarkContentBinding.y.setOnClickListener(new au.com.woolworths.base.shopapp.customviews.a(balloon, i2));
                return unit;
            case 7:
                String url = (String) obj;
                String linkText = (String) obj2;
                Intrinsics.h(url, "url");
                Intrinsics.h(linkText, "linkText");
                Timber.f27013a.b("Link clicked: %s - %s", linkText, url);
                return unit;
            case 8:
                String url2 = (String) obj;
                String linkText2 = (String) obj2;
                Intrinsics.h(url2, "url");
                Intrinsics.h(linkText2, "linkText");
                Timber.f27013a.b("Link clicked: %s - %s", linkText2, url2);
                return unit;
            case 9:
                DrawScope drawScope = (DrawScope) obj;
                ForwardingDrawInfo info = (ForwardingDrawInfo) obj2;
                Intrinsics.h(drawScope, "<this>");
                Intrinsics.h(info, "info");
                info.f4708a.e(drawScope, drawScope.h(), info.b, info.c);
                return unit;
            case 10:
                Intrinsics.h((String) obj, "<unused var>");
                return unit;
            case 11:
                Intrinsics.h((String) obj, "<unused var>");
                return unit;
            case 12:
                float f = CategoryTileListUiKt.f5199a;
                Intrinsics.h((String) obj, "<unused var>");
                return unit;
            case 13:
                DrawScope forwardingPainter = (DrawScope) obj;
                ForwardingDrawInfo info2 = (ForwardingDrawInfo) obj2;
                Intrinsics.h(forwardingPainter, "$this$forwardingPainter");
                Intrinsics.h(info2, "info");
                float f2 = CategoryTileListUiKt.f5199a;
                float fT1 = forwardingPainter.T1(f2);
                float fT12 = forwardingPainter.T1(f2);
                long jFloatToRawIntBits = (Float.floatToRawIntBits(fT1) << 32) | (Float.floatToRawIntBits(fT12) & 4294967295L);
                float fIntBitsToFloat = (Float.intBitsToFloat((int) (forwardingPainter.h() >> 32)) / 2.0f) - (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) / 2.0f);
                float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (forwardingPainter.h() & 4294967295L)) / 2.0f) - (Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) / 2.0f);
                Painter painter = info2.f4708a;
                forwardingPainter.getE().f1798a.c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2);
                try {
                    painter.e(forwardingPainter, jFloatToRawIntBits, info2.b, info2.c);
                    return unit;
                } finally {
                    CanvasDrawScopeKt$asDrawTransform$1 canvasDrawScopeKt$asDrawTransform$1 = forwardingPainter.getE().f1798a;
                    float f3 = -fIntBitsToFloat;
                    float f4 = -fIntBitsToFloat2;
                    canvasDrawScopeKt$asDrawTransform$1.c(f3, f4, f3, f4);
                }
            case 14:
                Intrinsics.h((String) obj, "<unused var>");
                return unit;
            case 15:
                Intrinsics.h((String) obj, "<unused var>");
                return unit;
            case 16:
                Intrinsics.h((String) obj, "<unused var>");
                return unit;
            case 17:
                Intrinsics.h((String) obj, "<unused var>");
                return unit;
            case 18:
                Intrinsics.h((String) obj, "<unused var>");
                return unit;
            case 19:
                Intrinsics.h((String) obj, "<unused var>");
                return unit;
            case 20:
                Intrinsics.h((String) obj, "<unused var>");
                return unit;
            case 21:
                Intrinsics.h((String) obj, "<unused var>");
                return unit;
            case 22:
                Intrinsics.h((String) obj, "<unused var>");
                return unit;
            case 23:
                return Boolean.valueOf(!(((CustomMessage) obj2) instanceof FullScreenMessage));
            case 24:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                return unit;
            case 25:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                return unit;
            case 26:
                ((Integer) obj2).getClass();
                LoadingScreenKt.a((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 27:
                Intrinsics.h((FilterMenuItem) obj, "<unused var>");
                Intrinsics.h((ToggleableState) obj2, "<unused var>");
                return unit;
            case 28:
                Intrinsics.h((FilterMenuItem) obj, "<unused var>");
                Intrinsics.h((ToggleableState) obj2, "<unused var>");
                return unit;
            default:
                Intrinsics.h((FilterMenuItem) obj, "<unused var>");
                Intrinsics.h((ToggleableState) obj2, "<unused var>");
                return unit;
        }
    }

    public /* synthetic */ h(int i, byte b) {
        this.d = i;
    }
}
