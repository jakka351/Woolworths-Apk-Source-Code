package au.com.woolworths.feature.shop.foryou.settings;

import au.com.woolworths.feature.shop.foryou.ItemRewardsSettingsBindingModel_;
import com.airbnb.epoxy.TypedEpoxyController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsOption;", "viewModel", "Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsViewModel;", "<init>", "(Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsViewModel;)V", "buildModels", "", "data", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsSettingsController extends TypedEpoxyController<List<? extends RewardsSettingsOption>> {

    @NotNull
    private final RewardsSettingsViewModel viewModel;

    public RewardsSettingsController(@NotNull RewardsSettingsViewModel viewModel) {
        Intrinsics.h(viewModel, "viewModel");
        this.viewModel = viewModel;
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@Nullable List<? extends RewardsSettingsOption> data) {
        if (data != null) {
            for (RewardsSettingsOption rewardsSettingsOption : data) {
                ItemRewardsSettingsBindingModel_ itemRewardsSettingsBindingModel_ = new ItemRewardsSettingsBindingModel_();
                itemRewardsSettingsBindingModel_.r(Integer.valueOf(rewardsSettingsOption.getD()));
                itemRewardsSettingsBindingModel_.t();
                itemRewardsSettingsBindingModel_.n = rewardsSettingsOption;
                RewardsSettingsViewModel rewardsSettingsViewModel = this.viewModel;
                itemRewardsSettingsBindingModel_.t();
                itemRewardsSettingsBindingModel_.o = rewardsSettingsViewModel;
                add(itemRewardsSettingsBindingModel_);
            }
        }
    }
}
