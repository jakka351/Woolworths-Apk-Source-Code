package au.com.woolworths.design.core.ui.component.stable.corerow;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.design.core.ui.component.stable.CheckBoxState;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarPreviewProvider;
import au.com.woolworths.design.wx.component.bottomsheet.ComposableSingletons$ModalBottomSheetLayoutKt;
import au.com.woolworths.feature.product.list.ComposeProductListActivity;
import au.com.woolworths.feature.product.list.ProductListFragment;
import au.com.woolworths.feature.product.list.data.ProductListChip;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ c(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                CheckBoxState it = (CheckBoxState) obj;
                Intrinsics.h(it, "it");
                return unit;
            case 1:
                CheckBoxState it2 = (CheckBoxState) obj;
                Intrinsics.h(it2, "it");
                return unit;
            case 2:
                String it3 = (String) obj;
                Intrinsics.h(it3, "it");
                return it3.concat(" ");
            case 3:
                String it4 = (String) obj;
                SnackbarPreviewProvider.TestCase[] testCaseArr = SnackbarPreviewProvider.TestCase.d;
                Intrinsics.h(it4, "it");
                return it4.concat(" ");
            case 4:
                String it5 = (String) obj;
                SnackbarPreviewProvider.TestCase[] testCaseArr2 = SnackbarPreviewProvider.TestCase.d;
                Intrinsics.h(it5, "it");
                return it5.concat(" ");
            case 5:
                String it6 = (String) obj;
                SnackbarPreviewProvider.TestCase[] testCaseArr3 = SnackbarPreviewProvider.TestCase.d;
                Intrinsics.h(it6, "it");
                return it6.concat(" ");
            case 6:
                String it7 = (String) obj;
                SnackbarPreviewProvider.TestCase[] testCaseArr4 = SnackbarPreviewProvider.TestCase.d;
                Intrinsics.h(it7, "it");
                return it7.concat(" ");
            case 7:
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.h(LazyColumn, "$this$LazyColumn");
                LazyListScope.g(LazyColumn, 20, null, ComposableSingletons$ModalBottomSheetLayoutKt.c, 6);
                return unit;
            case 8:
                TextLayoutResult it8 = (TextLayoutResult) obj;
                Intrinsics.h(it8, "it");
                return unit;
            case 9:
                TextLayoutResult it9 = (TextLayoutResult) obj;
                Intrinsics.h(it9, "it");
                return unit;
            case 10:
                TextLayoutResult it10 = (TextLayoutResult) obj;
                Intrinsics.h(it10, "it");
                return unit;
            case 11:
                TextFieldValue it11 = (TextFieldValue) obj;
                Intrinsics.h(it11, "it");
                return unit;
            case 12:
                TextFieldValue it12 = (TextFieldValue) obj;
                Intrinsics.h(it12, "it");
                return unit;
            case 13:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                return unit;
            case 14:
                ((Float) obj).getClass();
                return unit;
            case 15:
                ProductCard it13 = (ProductCard) obj;
                int i2 = ComposeProductListActivity.H;
                Intrinsics.h(it13, "it");
                return unit;
            case 16:
                float f = ProductListFragment.u;
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 17:
                float f2 = ProductListFragment.u;
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 18:
                float f3 = ProductListFragment.u;
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 19:
                float f4 = ProductListFragment.u;
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 20:
                float f5 = ProductListFragment.u;
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 21:
                float f6 = ProductListFragment.u;
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 22:
                float f7 = ProductListFragment.u;
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 23:
                float f8 = ProductListFragment.u;
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 24:
                float f9 = ProductListFragment.u;
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 25:
                float f10 = ProductListFragment.u;
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 26:
                float f11 = ProductListFragment.u;
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 27:
                InsetBanner it14 = (InsetBanner) obj;
                Intrinsics.h(it14, "it");
                return unit;
            case 28:
                ProductListChip it15 = (ProductListChip) obj;
                Intrinsics.h(it15, "it");
                return it15.getText().getText();
            default:
                ProductCard it16 = (ProductCard) obj;
                Intrinsics.h(it16, "it");
                String source = it16.getSource();
                return source != null ? source : "";
        }
    }
}
