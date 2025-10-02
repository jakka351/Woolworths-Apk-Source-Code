package au.com.woolworths.foundation.shop.olive.voice.ui.permission;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.core.graphics.Insets;
import au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdBottomSheetUiKt;
import au.com.woolworths.markdown.compat.MarkdownTextViewStyle;
import au.com.woolworths.shared.ui.compose.shop.chatentrycard.AskOliveIconLottieKt;
import au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity;
import au.com.woolworths.shop.buyagain.ui.composable.ProductTileSkeletonKt;
import au.com.woolworths.shop.checkout.domain.model.PackagingMethodOption;
import au.com.woolworths.shop.lists.ui.ListTitleRowKt;
import au.com.woolworths.shop.lists.ui.lottie.CircleAndLoaderLottieKt;
import au.com.woolworths.shop.lists.ui.lottie.StarBurstLottieKt;
import au.com.woolworths.shop.lists.ui.magicmatch.ui.MagicMatchLoopedLottieKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.compose.ListDetailsEmptyUiKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import au.com.woolworths.shop.lists.ui.snapalist.ui.SnapAListLoopedLottieKt;
import au.com.woolworths.shop.lists.ui.substitutions.SelectAlternativeOptionsBottomSheetContentKt;
import au.com.woolworths.shop.lists.ui.substitutions.SimilarProductsScreenKt;
import au.com.woolworths.shop.product.details.ui.ProductDetailsScreenKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                PermissionDescContentKt.b((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                VideoAdBottomSheetUiKt.a((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 2:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                break;
            case 3:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                break;
            case 4:
                ((Integer) obj).intValue();
                Intrinsics.h((List) obj2, "<unused var>");
                break;
            case 5:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                break;
            case 6:
                ((Integer) obj).intValue();
                Intrinsics.h((List) obj2, "<unused var>");
                break;
            case 7:
                ((Integer) obj).intValue();
                Intrinsics.h((List) obj2, "<unused var>");
                break;
            case 8:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                break;
            case 9:
                ((Integer) obj2).getClass();
                AskOliveIconLottieKt.a((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 10:
                ViewGroup.MarginLayoutParams applyInsets = (ViewGroup.MarginLayoutParams) obj;
                Insets it = (Insets) obj2;
                int i2 = CreateUpdateShoppingListActivity.A;
                Intrinsics.h(applyInsets, "$this$applyInsets");
                Intrinsics.h(it, "it");
                applyInsets.bottomMargin = it.d;
                break;
            case 11:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                break;
            case 12:
                ((Integer) obj2).getClass();
                ProductTileSkeletonKt.a((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 13:
                ((Integer) obj).intValue();
                PackagingMethodOption item = (PackagingMethodOption) obj2;
                Intrinsics.h(item, "item");
                break;
            case 14:
                ((Boolean) obj2).booleanValue();
                Intrinsics.h((String) obj, "<unused var>");
                break;
            case 15:
                TextView textView = (TextView) obj;
                MarkdownTextViewStyle markdownTextViewStyle = (MarkdownTextViewStyle) obj2;
                Intrinsics.h(textView, "textView");
                TextAlign textAlign = markdownTextViewStyle != null ? markdownTextViewStyle.d : null;
                if (textAlign == null || textAlign.f2156a != 5) {
                    if (textAlign != null && textAlign.f2156a == 3) {
                        textView.setGravity(17);
                        break;
                    }
                } else {
                    textView.setGravity(8388611);
                    break;
                }
                break;
            case 16:
                ((Integer) obj2).getClass();
                ListTitleRowKt.c((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                CircleAndLoaderLottieKt.a((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                StarBurstLottieKt.a((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                MagicMatchLoopedLottieKt.a((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 20:
                ((Boolean) obj2).booleanValue();
                Intrinsics.h((ProductItemUiModel) obj, "<unused var>");
                break;
            case 21:
                ((Boolean) obj2).booleanValue();
                Intrinsics.h((ProductItemUiModel) obj, "<unused var>");
                break;
            case 22:
                ((Integer) obj2).getClass();
                ListDetailsEmptyUiKt.c((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 23:
                ViewGroup.MarginLayoutParams applyInsets2 = (ViewGroup.MarginLayoutParams) obj;
                Insets it2 = (Insets) obj2;
                int i3 = ShoppingListDetailsActivity.R;
                Intrinsics.h(applyInsets2, "$this$applyInsets");
                Intrinsics.h(it2, "it");
                applyInsets2.topMargin = it2.b;
                break;
            case 24:
                ((Integer) obj2).getClass();
                SnapAListLoopedLottieKt.a((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                SelectAlternativeOptionsBottomSheetContentKt.a((Composer) obj, RecomposeScopeImplKt.a(7));
                break;
            case 26:
                ((Integer) obj2).getClass();
                SimilarProductsScreenKt.g((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                SimilarProductsScreenKt.e((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                ProductDetailsScreenKt.d((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            default:
                ((Integer) obj).intValue();
                Intrinsics.h((List) obj2, "<unused var>");
                break;
        }
        return unit;
    }

    public /* synthetic */ a(int i, int i2) {
        this.d = i2;
    }
}
