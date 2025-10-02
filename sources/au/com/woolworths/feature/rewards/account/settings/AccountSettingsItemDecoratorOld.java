package au.com.woolworths.feature.rewards.account.settings;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.modules.customviews.itemdividers.DefaultDividerItemDecoration;
import au.com.woolworths.base.rewards.account.data.AccountHomeFooter;
import au.com.woolworths.foundation.rewards.banner.model.RewardsNotificationBannerApiData;
import com.airbnb.epoxy.ComposeEpoxyModel;
import com.airbnb.epoxy.EpoxyControllerAdapter;
import com.airbnb.epoxy.EpoxyModel;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsItemDecoratorOld;", "Lau/com/woolworths/android/onesite/modules/customviews/itemdividers/DefaultDividerItemDecoration;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AccountSettingsItemDecoratorOld extends DefaultDividerItemDecoration {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSettingsItemDecoratorOld(@NotNull Context context) {
        super(context);
        Intrinsics.h(context, "context");
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.itemdividers.DefaultDividerItemDecoration
    public final boolean i(View child, RecyclerView recyclerView) {
        Intrinsics.h(child, "child");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            EpoxyControllerAdapter epoxyControllerAdapter = (EpoxyControllerAdapter) adapter;
            int iN = RecyclerView.N(child);
            int i = iN + 1;
            if (iN >= 0 && i < epoxyControllerAdapter.o) {
                EpoxyModel epoxyModelS = epoxyControllerAdapter.S(iN);
                ComposeEpoxyModel composeEpoxyModel = epoxyModelS instanceof ComposeEpoxyModel ? (ComposeEpoxyModel) epoxyModelS : null;
                Object[] objArr = composeEpoxyModel != null ? composeEpoxyModel.n : null;
                if (objArr == null) {
                    objArr = new Object[0];
                }
                int length = objArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        EpoxyModel epoxyModelS2 = epoxyControllerAdapter.S(i);
                        ComposeEpoxyModel composeEpoxyModel2 = epoxyModelS2 instanceof ComposeEpoxyModel ? (ComposeEpoxyModel) epoxyModelS2 : null;
                        Object[] objArr2 = composeEpoxyModel2 != null ? composeEpoxyModel2.n : null;
                        if (objArr2 != null) {
                            for (Object obj : objArr2) {
                                if (obj instanceof AccountHomeFooter) {
                                    return true;
                                }
                            }
                        } else {
                            int iL = epoxyControllerAdapter.S(i).l();
                            if (iL == R.layout.epoxy_item_account_home_section || iL == R.layout.epoxy_item_account_settings_app_version) {
                                return true;
                            }
                        }
                    } else {
                        if (objArr[i2] instanceof RewardsNotificationBannerApiData) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return false;
    }
}
