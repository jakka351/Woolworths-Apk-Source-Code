package au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui;

import android.webkit.WebView;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageGridState;
import au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageKt;
import au.com.woolworths.feature.shop.homepage.presentation.modeselector.ModeSelectorSubHeaderKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt$EmptyCallbacks$1;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection;
import au.com.woolworths.feature.shop.modeselector.ui.FeaturesSectionKt;
import au.com.woolworths.shared.ui.compose.CoachmarkKt;
import coil3.compose.AsyncImagePainter;
import com.woolworths.shop.product.ui.boost.BoostingState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;

    public /* synthetic */ b(MutableState mutableState, int i) {
        this.d = i;
        this.e = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        final MutableState mutableState = this.e;
        switch (i) {
            case 0:
                String it = (String) obj;
                Intrinsics.h(it, "it");
                mutableState.setValue(it);
                break;
            case 1:
                String newTitle = (String) obj;
                Intrinsics.h(newTitle, "newTitle");
                mutableState.setValue(newTitle);
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                mutableState.setValue(bool);
                break;
            case 3:
                mutableState.setValue(new IntSize(((IntSize) obj).f2202a));
                break;
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                mutableState.setValue(bool2);
                break;
            case 5:
                LayoutCoordinates it2 = (LayoutCoordinates) obj;
                int i2 = PromotionPageKt.d;
                Intrinsics.h(it2, "it");
                mutableState.setValue(PromotionPageGridState.a((PromotionPageGridState) mutableState.getD(), null, Float.intBitsToFloat((int) (it2.G(0L) & 4294967295L)), 1));
                break;
            case 6:
                float f = ModeSelectorSubHeaderKt.f7251a;
                mutableState.setValue(Integer.valueOf((int) (((IntSize) obj).f2202a & 4294967295L)));
                break;
            case 7:
                float f2 = ModeSelectorSubHeaderKt.f7251a;
                mutableState.setValue(Integer.valueOf((int) (((IntSize) obj).f2202a & 4294967295L)));
                break;
            case 8:
                float f3 = ModeSelectorSubHeaderKt.f7251a;
                mutableState.setValue(Integer.valueOf((int) (((IntSize) obj).f2202a & 4294967295L)));
                break;
            case 9:
                TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
                Intrinsics.h(textLayoutResult, "textLayoutResult");
                if (textLayoutResult.b.f == 2) {
                    mutableState.setValue(new Dp(6));
                    break;
                }
                break;
            case 10:
                DrawScope DefaultCanvas = (DrawScope) obj;
                InstoreMapScreenKt$EmptyCallbacks$1 instoreMapScreenKt$EmptyCallbacks$1 = InstoreMapScreenKt.f7385a;
                Intrinsics.h(DefaultCanvas, "$this$DefaultCanvas");
                ImageBitmap imageBitmap = (ImageBitmap) mutableState.getD();
                if (imageBitmap != null) {
                    DrawScope.U0(DefaultCanvas, imageBitmap, null, 62);
                    break;
                }
                break;
            case 11:
                LayoutCoordinates coordinates = (LayoutCoordinates) obj;
                Intrinsics.h(coordinates, "coordinates");
                mutableState.setValue(Integer.valueOf((int) (coordinates.a() & 4294967295L)));
                break;
            case 12:
                LayoutCoordinates coordinates2 = (LayoutCoordinates) obj;
                Intrinsics.h(coordinates2, "coordinates");
                mutableState.setValue(Integer.valueOf((int) (coordinates2.a() & 4294967295L)));
                break;
            case 13:
                TextLayoutResult textLayoutResult2 = (TextLayoutResult) obj;
                ShoppingModeSection.ShoppingModeSelectorStoreFeaturesData shoppingModeSelectorStoreFeaturesData = FeaturesSectionKt.f7547a;
                Intrinsics.h(textLayoutResult2, "textLayoutResult");
                if (textLayoutResult2.b.f == 2) {
                    mutableState.setValue(new Dp(8));
                    break;
                }
                break;
            case 14:
                TextFieldValue it3 = (TextFieldValue) obj;
                Intrinsics.h(it3, "it");
                mutableState.setValue(it3);
                break;
            case 15:
                mutableState.setValue(Boolean.valueOf(((Integer) obj).intValue() == 0));
                break;
            case 16:
                String it4 = (String) obj;
                Intrinsics.h(it4, "it");
                mutableState.setValue(it4);
                break;
            case 17:
                String it5 = (String) obj;
                Intrinsics.h(it5, "it");
                mutableState.setValue(it5);
                break;
            case 18:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                mutableState.setValue(bool3);
                break;
            case 19:
                WebView it6 = (WebView) obj;
                Intrinsics.h(it6, "it");
                mutableState.setValue(it6);
                break;
            case 20:
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                break;
            case 21:
                ((Float) obj).getClass();
                ((Function0) mutableState.getD()).invoke();
                break;
            case 22:
                ModalBottomSheetValue it7 = (ModalBottomSheetValue) obj;
                Intrinsics.h(it7, "it");
                if (it7 == ModalBottomSheetValue.d) {
                    mutableState.setValue(Boolean.FALSE);
                }
                break;
            case 23:
                LayoutCoordinates it8 = (LayoutCoordinates) obj;
                float f4 = CoachmarkKt.f10086a;
                Intrinsics.h(it8, "it");
                mutableState.setValue(new Offset(it8.G(0L)));
                break;
            case 24:
                Intrinsics.h((AsyncImagePainter.State.Error) obj, "it");
                mutableState.setValue(Boolean.TRUE);
                break;
            case 25:
                WebView it9 = (WebView) obj;
                Intrinsics.h(it9, "it");
                mutableState.setValue(it9);
                break;
            case 26:
                Intrinsics.h((AsyncImagePainter.State.Error) obj, "it");
                mutableState.setValue(Boolean.TRUE);
                break;
            case 27:
                Intrinsics.h((AsyncImagePainter.State.Error) obj, "it");
                mutableState.setValue(Boolean.FALSE);
                break;
            case 28:
                mutableState.setValue(BoostingState.e);
                break;
            default:
                BoostingState it10 = (BoostingState) obj;
                Intrinsics.h(it10, "it");
                mutableState.setValue(it10);
                break;
        }
        return unit;
    }
}
