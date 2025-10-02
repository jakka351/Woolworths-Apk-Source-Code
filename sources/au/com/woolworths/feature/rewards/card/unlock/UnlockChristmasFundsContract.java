package au.com.woolworths.feature.rewards.card.unlock;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.base.data.RewardsRedemptionUnlockConfirmation;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsContract;", "", "ViewState", "Actions", "UnlockState", "UnlockType", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface UnlockChristmasFundsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsContract$Actions;", "", "OpenUrl", "Dismiss", "ShowError", "ShowConfetti", "Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsContract$Actions$Dismiss;", "Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsContract$Actions$OpenUrl;", "Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsContract$Actions$ShowConfetti;", "Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsContract$Actions$ShowError;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsContract$Actions$Dismiss;", "Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsContract$Actions;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Dismiss extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final Dismiss f5836a = new Dismiss();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsContract$Actions$OpenUrl;", "Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsContract$Actions;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5837a;

            public OpenUrl(String str) {
                this.f5837a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenUrl) && Intrinsics.c(this.f5837a, ((OpenUrl) obj).f5837a);
            }

            public final int hashCode() {
                return this.f5837a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenUrl(url=", this.f5837a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsContract$Actions$ShowConfetti;", "Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsContract$Actions;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowConfetti extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowConfetti f5838a = new ShowConfetti();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsContract$Actions$ShowError;", "Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsContract$Actions;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowError extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowError f5839a = new ShowError();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsContract$UnlockState;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnlockState {
        public static final UnlockState d;
        public static final UnlockState e;
        public static final UnlockState f;
        public static final /* synthetic */ UnlockState[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            UnlockState unlockState = new UnlockState("STAND_BY", 0);
            d = unlockState;
            UnlockState unlockState2 = new UnlockState("IN_PROGRESS", 1);
            e = unlockState2;
            UnlockState unlockState3 = new UnlockState("DONE", 2);
            f = unlockState3;
            UnlockState[] unlockStateArr = {unlockState, unlockState2, unlockState3};
            g = unlockStateArr;
            h = EnumEntriesKt.a(unlockStateArr);
        }

        public static UnlockState valueOf(String str) {
            return (UnlockState) Enum.valueOf(UnlockState.class, str);
        }

        public static UnlockState[] values() {
            return (UnlockState[]) g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsContract$UnlockType;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnlockType {
        public static final UnlockType d;
        public static final UnlockType e;
        public static final /* synthetic */ UnlockType[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            UnlockType unlockType = new UnlockType("SLIDER", 0);
            d = unlockType;
            UnlockType unlockType2 = new UnlockType("BUTTON", 1);
            e = unlockType2;
            UnlockType[] unlockTypeArr = {unlockType, unlockType2};
            f = unlockTypeArr;
            g = EnumEntriesKt.a(unlockTypeArr);
        }

        public static UnlockType valueOf(String str) {
            return (UnlockType) Enum.valueOf(UnlockType.class, str);
        }

        public static UnlockType[] values() {
            return (UnlockType[]) f.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsContract$ViewState;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final UnlockState f5840a;
        public final UnlockType b;
        public final RewardsRedemptionUnlockConfirmation c;

        static {
            RewardsRedemptionUnlockConfirmation.Companion companion = RewardsRedemptionUnlockConfirmation.INSTANCE;
        }

        public ViewState(UnlockState unlockState, UnlockType unlockType, RewardsRedemptionUnlockConfirmation rewardsRedemptionUnlockConfirmation) {
            this.f5840a = unlockState;
            this.b = unlockType;
            this.c = rewardsRedemptionUnlockConfirmation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f5840a == viewState.f5840a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.f5840a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "ViewState(state=" + this.f5840a + ", type=" + this.b + ", data=" + this.c + ")";
        }
    }
}
