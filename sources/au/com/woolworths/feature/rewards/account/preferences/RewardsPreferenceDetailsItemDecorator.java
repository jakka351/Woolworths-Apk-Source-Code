package au.com.woolworths.feature.rewards.account.preferences;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.modules.customviews.itemdividers.DefaultDividerItemDecoration;
import au.com.woolworths.feature.rewards.account.ItemPreferenceDetailsTextBindingModel_;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsController;
import com.airbnb.epoxy.EpoxyControllerAdapter;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Deprecated
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsItemDecorator;", "Lau/com/woolworths/android/onesite/modules/customviews/itemdividers/DefaultDividerItemDecoration;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsPreferenceDetailsItemDecorator extends DefaultDividerItemDecoration {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsPreferenceDetailsItemDecorator(@NotNull Context context) {
        super(context);
        Intrinsics.h(context, "context");
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
        int i = iN + 1;
        if (i >= epoxyControllerAdapter.o) {
            return false;
        }
        List listR = epoxyControllerAdapter.R();
        Intrinsics.g(listR, "getCopyOfModels(...)");
        return ((listR.get(iN) instanceof RewardsPreferenceDetailsController.PreferenceDetailsToggleGroupModelGroup) || (listR.get(iN) instanceof ItemPreferenceDetailsTextBindingModel_)) && (listR.get(i) instanceof RewardsPreferenceDetailsController.PreferenceDetailsToggleGroupModelGroup);
    }
}
