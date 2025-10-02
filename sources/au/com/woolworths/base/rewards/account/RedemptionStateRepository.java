package au.com.woolworths.base.rewards.account;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingsItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0006J\u0006\u0010\u0014\u001a\u00020\rR\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/base/rewards/account/RedemptionStateRepository;", "", "<init>", "()V", "mutableSelectedSetting", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionSettingsItem;", "selectedSetting", "Lkotlinx/coroutines/flow/StateFlow;", "getSelectedSetting", "()Lkotlinx/coroutines/flow/StateFlow;", "_valueChanged", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "valueChanged", "Lkotlinx/coroutines/flow/SharedFlow;", "getValueChanged", "()Lkotlinx/coroutines/flow/SharedFlow;", "setRedemptionSetting", "setting", "notifyValueChanged", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedemptionStateRepository {

    @NotNull
    private final MutableSharedFlow<Unit> _valueChanged;

    @NotNull
    private final MutableStateFlow<RewardsRedemptionSettingsItem> mutableSelectedSetting = StateFlowKt.a(null);

    @NotNull
    private final SharedFlow<Unit> valueChanged;

    public RedemptionStateRepository() {
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this._valueChanged = sharedFlowImplB;
        this.valueChanged = sharedFlowImplB;
    }

    @NotNull
    public final StateFlow<RewardsRedemptionSettingsItem> getSelectedSetting() {
        return this.mutableSelectedSetting;
    }

    @NotNull
    public final SharedFlow<Unit> getValueChanged() {
        return this.valueChanged;
    }

    public final void notifyValueChanged() {
        this._valueChanged.f(Unit.f24250a);
    }

    public final void setRedemptionSetting(@NotNull RewardsRedemptionSettingsItem setting) {
        Intrinsics.h(setting, "setting");
        this.mutableSelectedSetting.setValue(setting);
    }
}
