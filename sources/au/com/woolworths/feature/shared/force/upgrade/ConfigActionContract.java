package au.com.woolworths.feature.shared.force.upgrade;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shared/force/upgrade/ConfigActionContract;", "", "Action", "ViewState", "force-upgrade_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ConfigActionContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shared/force/upgrade/ConfigActionContract$Action;", "", "LaunchNextScreen", "Lau/com/woolworths/feature/shared/force/upgrade/ConfigActionContract$Action$LaunchNextScreen;", "force-upgrade_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/force/upgrade/ConfigActionContract$Action$LaunchNextScreen;", "Lau/com/woolworths/feature/shared/force/upgrade/ConfigActionContract$Action;", "force-upgrade_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchNextScreen extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchNextScreen f6499a = new LaunchNextScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchNextScreen);
            }

            public final int hashCode() {
                return 486061023;
            }

            public final String toString() {
                return "LaunchNextScreen";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shared/force/upgrade/ConfigActionContract$ViewState;", "", "NoContent", "Content", "FullScreenContent", "Lau/com/woolworths/feature/shared/force/upgrade/ConfigActionContract$ViewState$Content;", "Lau/com/woolworths/feature/shared/force/upgrade/ConfigActionContract$ViewState$FullScreenContent;", "Lau/com/woolworths/feature/shared/force/upgrade/ConfigActionContract$ViewState$NoContent;", "force-upgrade_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/force/upgrade/ConfigActionContract$ViewState$Content;", "Lau/com/woolworths/feature/shared/force/upgrade/ConfigActionContract$ViewState;", "force-upgrade_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Content implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final UpdateDialogType f6500a;

            public Content(UpdateDialogType updateDialogType) {
                this.f6500a = updateDialogType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Content) && Intrinsics.c(this.f6500a, ((Content) obj).f6500a);
            }

            public final int hashCode() {
                return this.f6500a.hashCode();
            }

            public final String toString() {
                return "Content(dialogType=" + this.f6500a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/force/upgrade/ConfigActionContract$ViewState$FullScreenContent;", "Lau/com/woolworths/feature/shared/force/upgrade/ConfigActionContract$ViewState;", "force-upgrade_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class FullScreenContent implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final UpdateFullScreenType f6501a;

            public FullScreenContent(UpdateFullScreenType updateFullScreenType) {
                this.f6501a = updateFullScreenType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FullScreenContent) && Intrinsics.c(this.f6501a, ((FullScreenContent) obj).f6501a);
            }

            public final int hashCode() {
                return this.f6501a.hashCode();
            }

            public final String toString() {
                return "FullScreenContent(fullScreenType=" + this.f6501a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/force/upgrade/ConfigActionContract$ViewState$NoContent;", "Lau/com/woolworths/feature/shared/force/upgrade/ConfigActionContract$ViewState;", "force-upgrade_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NoContent implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final NoContent f6502a = new NoContent();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NoContent);
            }

            public final int hashCode() {
                return -220581621;
            }

            public final String toString() {
                return "NoContent";
            }
        }
    }
}
