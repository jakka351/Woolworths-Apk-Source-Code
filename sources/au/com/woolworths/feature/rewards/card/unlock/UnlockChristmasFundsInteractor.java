package au.com.woolworths.feature.rewards.card.unlock;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsInteractor;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnlockChristmasFundsInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final UnlockChristmasFundsRepository f5842a;
    public final SharedFlowImpl b = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);

    public UnlockChristmasFundsInteractor(UnlockChristmasFundsRepository unlockChristmasFundsRepository) {
        this.f5842a = unlockChristmasFundsRepository;
    }
}
