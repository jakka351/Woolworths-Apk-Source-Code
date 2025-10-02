package com.woolworths.scanlibrary.ui.reward;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.ui.entry.launcher.errors.FetchSngErrorState;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/reward/SngRewardSetupContract;", "", "ViewState", "Actions", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SngRewardSetupContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/ui/reward/SngRewardSetupContract$Actions;", "", "LinkReward", "JoinReward", "LaunchSng", "Lcom/woolworths/scanlibrary/ui/reward/SngRewardSetupContract$Actions$JoinReward;", "Lcom/woolworths/scanlibrary/ui/reward/SngRewardSetupContract$Actions$LaunchSng;", "Lcom/woolworths/scanlibrary/ui/reward/SngRewardSetupContract$Actions$LinkReward;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/reward/SngRewardSetupContract$Actions$JoinReward;", "Lcom/woolworths/scanlibrary/ui/reward/SngRewardSetupContract$Actions;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class JoinReward extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final JoinReward f21315a = new JoinReward();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/reward/SngRewardSetupContract$Actions$LaunchSng;", "Lcom/woolworths/scanlibrary/ui/reward/SngRewardSetupContract$Actions;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchSng extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchSng f21316a = new LaunchSng();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/reward/SngRewardSetupContract$Actions$LinkReward;", "Lcom/woolworths/scanlibrary/ui/reward/SngRewardSetupContract$Actions;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LinkReward extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LinkReward f21317a = new LinkReward();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/reward/SngRewardSetupContract$ViewState;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f21318a;
        public final FetchSngErrorState b;

        public ViewState(boolean z, FetchSngErrorState fetchSngErrorState) {
            this.f21318a = z;
            this.b = fetchSngErrorState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f21318a == viewState.f21318a && this.b == viewState.b;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f21318a) * 31;
            FetchSngErrorState fetchSngErrorState = this.b;
            return iHashCode + (fetchSngErrorState == null ? 0 : fetchSngErrorState.hashCode());
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f21318a + ", errorState=" + this.b + ")";
        }
    }
}
