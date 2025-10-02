package au.com.woolworths.feature.rewards.account.sso;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.account.data.EndChatStateUpdate;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/account/sso/MandyActions;", "", "ShowSurvey", "UpdateEndChatState", "Lau/com/woolworths/feature/rewards/account/sso/MandyActions$ShowSurvey;", "Lau/com/woolworths/feature/rewards/account/sso/MandyActions$UpdateEndChatState;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class MandyActions {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/sso/MandyActions$ShowSurvey;", "Lau/com/woolworths/feature/rewards/account/sso/MandyActions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowSurvey extends MandyActions {

        /* renamed from: a, reason: collision with root package name */
        public final String f5797a;

        public ShowSurvey(String str) {
            this.f5797a = str;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/sso/MandyActions$UpdateEndChatState;", "Lau/com/woolworths/feature/rewards/account/sso/MandyActions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdateEndChatState extends MandyActions {

        /* renamed from: a, reason: collision with root package name */
        public final EndChatStateUpdate f5798a;

        public UpdateEndChatState(EndChatStateUpdate endChatStateUpdate) {
            this.f5798a = endChatStateUpdate;
        }
    }
}
