package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import android.os.Parcelable;
import androidx.recyclerview.widget.ItemTouchHelper;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.ui.ShoppingListItemCheckOffSwipeCallback;
import au.com.woolworths.shop.lists.ui.shoppinglist.ui.ShoppingListItemSwipeListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ShoppingListDetailsActivity e;

    public /* synthetic */ b(ShoppingListDetailsActivity shoppingListDetailsActivity, int i) {
        this.d = i;
        this.e = shoppingListDetailsActivity;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$itemTouchHelper$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        final ShoppingListDetailsActivity shoppingListDetailsActivity = this.e;
        switch (i) {
            case 0:
                ShoppingListDetailsListController shoppingListDetailsListController = shoppingListDetailsActivity.H;
                if (shoppingListDetailsListController != null) {
                    return new ItemTouchHelper(new ShoppingListItemCheckOffSwipeCallback(shoppingListDetailsActivity, shoppingListDetailsListController, new ShoppingListItemSwipeListener() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$itemTouchHelper$2$1
                        @Override // au.com.woolworths.shop.lists.ui.shoppinglist.ui.ShoppingListItemSwipeListener
                        public final void a(ShoppingListItemUiModel shoppingListItemUiModel) {
                            boolean e = shoppingListItemUiModel.getE();
                            ShoppingListDetailsActivity shoppingListDetailsActivity2 = shoppingListDetailsActivity;
                            if (e) {
                                int i2 = ShoppingListDetailsActivity.R;
                                shoppingListDetailsActivity2.R4().s3(shoppingListItemUiModel);
                            } else {
                                int i3 = ShoppingListDetailsActivity.R;
                                shoppingListDetailsActivity2.R4().b6(shoppingListItemUiModel);
                            }
                        }
                    }));
                }
                Intrinsics.p("listController");
                throw null;
            case 1:
                int i2 = ShoppingListDetailsActivity.R;
                Parcelable parcelableExtra = shoppingListDetailsActivity.getIntent().getParcelableExtra("EXTRAS");
                if (parcelableExtra != null) {
                    return (Activities.ShoppingListDetails.Extras) parcelableExtra;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 2:
                int i3 = ShoppingListDetailsActivity.R;
                ShoppingListDetailsViewModel shoppingListDetailsViewModel = (ShoppingListDetailsViewModel) shoppingListDetailsActivity.E.getD();
                AnalyticsManager analyticsManager = shoppingListDetailsActivity.z;
                if (analyticsManager != null) {
                    return new ShoppingListDetailsAnalyticsDecorator(shoppingListDetailsViewModel, analyticsManager);
                }
                Intrinsics.p("analyticsManager");
                throw null;
            default:
                int i4 = ShoppingListDetailsActivity.R;
                shoppingListDetailsActivity.R4().Y2();
                return Unit.f24250a;
        }
    }
}
