package au.com.woolworths.shop.cart.ui.cart;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.cart.CartAnalytics;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.shop.cart.ui.cart.CartContract;
import com.woolworths.R;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public /* synthetic */ class CartFragment$createListResultLauncher$1 implements ActivityResultCallback, FunctionAdapter {
    public final /* synthetic */ CartFragment d;

    public CartFragment$createListResultLauncher$1(CartFragment cartFragment) {
        this.d = cartFragment;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void a(Object obj) {
        Intent intent;
        Activities.CreateUpdateShoppingList.CreateUpdateResult createUpdateResult;
        ActivityResult p0 = (ActivityResult) obj;
        Intrinsics.h(p0, "p0");
        if (p0.d == -1 && (intent = p0.e) != null && (createUpdateResult = (Activities.CreateUpdateShoppingList.CreateUpdateResult) intent.getParcelableExtra("EXTRA_RESULT")) != null && createUpdateResult.d) {
            CartViewModel cartViewModelI1 = this.d.I1();
            String str = createUpdateResult.f;
            Intrinsics.e(str);
            cartViewModelI1.l.k(new CartContract.Actions.ShowSnackbar(new ResWithArgText(R.string.cart_list_created_message, str)));
            cartViewModelI1.g.g((Event) new CartAnalytics.Cart().f.t.getD());
        }
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function b() {
        return new FunctionReferenceImpl(1, this.d, CartFragment.class, "onCreateUpdateShoppingListActivityResult", "onCreateUpdateShoppingListActivityResult(Landroidx/activity/result/ActivityResult;)V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ActivityResultCallback) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.c(b(), ((FunctionAdapter) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
