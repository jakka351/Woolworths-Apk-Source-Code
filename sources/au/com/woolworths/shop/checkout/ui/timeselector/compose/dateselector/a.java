package au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.datastore.core.CorruptionException;
import au.com.woolworths.pagingutils.NumericPageListing;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot;
import au.com.woolworths.shop.checkout.ui.timeselector.uimodel.DateItem;
import au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeOfDay;
import au.com.woolworths.shop.lists.data.ListsDataStoreImplKt;
import au.com.woolworths.shop.lists.data.model.SuggestedListItem;
import au.com.woolworths.shop.lists.ui.lists.menu.ListAction;
import au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                Intrinsics.h((DateItem) it, "it");
                break;
            case 1:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) it;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.g(semantics);
                break;
            case 2:
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) it;
                Intrinsics.h(semantics2, "$this$semantics");
                SemanticsPropertiesKt.g(semantics2);
                break;
            case 3:
                SemanticsPropertyReceiver semantics3 = (SemanticsPropertyReceiver) it;
                Intrinsics.h(semantics3, "$this$semantics");
                SemanticsPropertiesKt.g(semantics3);
                break;
            case 4:
                SemanticsPropertyReceiver semantics4 = (SemanticsPropertyReceiver) it;
                Intrinsics.h(semantics4, "$this$semantics");
                SemanticsPropertiesKt.g(semantics4);
                break;
            case 5:
                Intrinsics.h((TimeOfDay) it, "it");
                break;
            case 6:
                Intrinsics.h((FulfilmentSlot) it, "it");
                break;
            case 7:
                Intrinsics.h((TimeOfDay) it, "it");
                break;
            case 8:
                Intrinsics.h((TimeOfDay) it, "it");
                break;
            case 9:
                Intrinsics.h((FulfilmentSlot) it, "it");
                break;
            case 10:
                Intrinsics.h((TimeOfDay) it, "it");
                break;
            case 11:
                Intrinsics.h((TimeOfDay) it, "it");
                break;
            case 12:
                Intrinsics.h((FulfilmentSlot) it, "it");
                break;
            case 13:
                Intrinsics.h((TimeOfDay) it, "it");
                break;
            case 14:
                Intrinsics.h(it, "it");
                break;
            case 15:
                KProperty[] kPropertyArr = ListsDataStoreImplKt.f12254a;
                Intrinsics.h((CorruptionException) it, "it");
                break;
            case 16:
                SemanticsPropertyReceiver semantics5 = (SemanticsPropertyReceiver) it;
                Intrinsics.h(semantics5, "$this$semantics");
                SemanticsPropertiesKt.g(semantics5);
                break;
            case 17:
                Intrinsics.h((SuggestedListItem) it, "it");
                break;
            case 18:
                Intrinsics.h((ListAction) it, "it");
                break;
            case 19:
                break;
            case 20:
                KProperty[] kPropertyArr2 = SuggestedListsFragment.m;
                break;
            case 21:
                NumericPageListing it2 = (NumericPageListing) it;
                Intrinsics.h(it2, "it");
                break;
            case 22:
                NumericPageListing it3 = (NumericPageListing) it;
                Intrinsics.h(it3, "it");
                break;
            case 23:
                NumericPageListing it4 = (NumericPageListing) it;
                Intrinsics.h(it4, "it");
                break;
            case 24:
                Intrinsics.h((String) it, "it");
                break;
            case 25:
                Intrinsics.h((String) it, "it");
                break;
            case 26:
                Intrinsics.h((String) it, "it");
                break;
            case 27:
                Intrinsics.h((ProductItemUiModel) it, "it");
                break;
            case 28:
                Intrinsics.h((ProductItemUiModel) it, "it");
                break;
            default:
                Intrinsics.h((ProductItemUiModel) it, "it");
                break;
        }
        return unit;
    }
}
