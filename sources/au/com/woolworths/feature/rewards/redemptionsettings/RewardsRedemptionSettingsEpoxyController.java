package au.com.woolworths.feature.rewards.redemptionsettings;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingsItem;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsContract;
import au.com.woolworths.feature.rewards.redemptionsettings.data.RewardsRedemptionAction;
import au.com.woolworths.feature.rewards.redemptionsettings.data.RewardsRedemptionActionsList;
import com.airbnb.epoxy.TypedEpoxyController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsEpoxyController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$ViewState;", "viewModel", "Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsViewModel;", "<init>", "(Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsViewModel;)V", "buildModels", "", "viewState", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsRedemptionSettingsEpoxyController extends TypedEpoxyController<RewardsRedemptionSettingsContract.ViewState> {
    public static final int $stable = 8;

    @NotNull
    private final RewardsRedemptionSettingsViewModel viewModel;

    public RewardsRedemptionSettingsEpoxyController(@NotNull RewardsRedemptionSettingsViewModel viewModel) {
        Intrinsics.h(viewModel, "viewModel");
        this.viewModel = viewModel;
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@NotNull RewardsRedemptionSettingsContract.ViewState viewState) {
        Intrinsics.h(viewState, "viewState");
        RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem = viewState.e;
        List<RewardsRedemptionSettingsItem> list = viewState.b;
        if (list != null) {
            for (RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem2 : list) {
                ItemRedemptionSettingsBindingModel_ itemRedemptionSettingsBindingModel_ = new ItemRedemptionSettingsBindingModel_();
                boolean z = true;
                itemRedemptionSettingsBindingModel_.r(Integer.valueOf(rewardsRedemptionSettingsItem2.hashCode()));
                itemRedemptionSettingsBindingModel_.t();
                itemRedemptionSettingsBindingModel_.n = rewardsRedemptionSettingsItem2;
                RewardsRedemptionSettingsViewModel rewardsRedemptionSettingsViewModel = this.viewModel;
                itemRedemptionSettingsBindingModel_.t();
                itemRedemptionSettingsBindingModel_.o = rewardsRedemptionSettingsViewModel;
                if (!rewardsRedemptionSettingsItem2.isSelected() || rewardsRedemptionSettingsItem != null) {
                    z = false;
                }
                itemRedemptionSettingsBindingModel_.t();
                itemRedemptionSettingsBindingModel_.p = z;
                boolean zEquals = rewardsRedemptionSettingsItem2.equals(rewardsRedemptionSettingsItem);
                itemRedemptionSettingsBindingModel_.t();
                itemRedemptionSettingsBindingModel_.q = zEquals;
                add(itemRedemptionSettingsBindingModel_);
            }
        }
        RewardsRedemptionActionsList rewardsRedemptionActionsList = viewState.c;
        if (rewardsRedemptionActionsList != null) {
            ItemRedemptionActionsListTitleBindingModel_ itemRedemptionActionsListTitleBindingModel_ = new ItemRedemptionActionsListTitleBindingModel_();
            itemRedemptionActionsListTitleBindingModel_.M();
            String title = rewardsRedemptionActionsList.getTitle();
            itemRedemptionActionsListTitleBindingModel_.t();
            itemRedemptionActionsListTitleBindingModel_.n = title;
            add(itemRedemptionActionsListTitleBindingModel_);
            for (RewardsRedemptionAction rewardsRedemptionAction : rewardsRedemptionActionsList.getItems()) {
                ItemRedemptionActionBindingModel_ itemRedemptionActionBindingModel_ = new ItemRedemptionActionBindingModel_();
                itemRedemptionActionBindingModel_.M("redemption_action_" + rewardsRedemptionAction.hashCode());
                itemRedemptionActionBindingModel_.t();
                itemRedemptionActionBindingModel_.n = rewardsRedemptionAction;
                RewardsRedemptionSettingsViewModel rewardsRedemptionSettingsViewModel2 = this.viewModel;
                itemRedemptionActionBindingModel_.t();
                itemRedemptionActionBindingModel_.o = rewardsRedemptionSettingsViewModel2;
                add(itemRedemptionActionBindingModel_);
            }
        }
    }
}
