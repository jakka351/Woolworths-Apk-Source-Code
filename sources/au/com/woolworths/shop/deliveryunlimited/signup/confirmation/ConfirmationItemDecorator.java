package au.com.woolworths.shop.deliveryunlimited.signup.confirmation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.modules.customviews.itemdividers.DefaultDividerItemDecoration;
import com.airbnb.epoxy.EpoxyControllerAdapter;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmation/ConfirmationItemDecorator;", "Lau/com/woolworths/android/onesite/modules/customviews/itemdividers/DefaultDividerItemDecoration;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ConfirmationItemDecorator extends DefaultDividerItemDecoration {
    public final Context h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmationItemDecorator(@NotNull Context context) {
        super(context);
        Intrinsics.h(context, "context");
        this.h = context;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.itemdividers.DefaultDividerItemDecoration
    public final boolean i(View child, RecyclerView recyclerView) {
        Intrinsics.h(child, "child");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return false;
        }
        EpoxyControllerAdapter epoxyControllerAdapter = (EpoxyControllerAdapter) adapter;
        int iN = RecyclerView.N(child);
        Drawable drawable = this.h.getDrawable(iN == 0 ? R.drawable.delivery_unlimited_sign_up_confirmation_divider_dotted : R.drawable.delivery_unlimited_sign_up_confirmation_divider_solid);
        Intrinsics.e(drawable);
        this.f3664a = drawable;
        this.f = drawable;
        return (iN + 1 >= epoxyControllerAdapter.o || iN == -1 || epoxyControllerAdapter.S(iN).l() == R.layout.item_spacer) ? false : true;
    }
}
