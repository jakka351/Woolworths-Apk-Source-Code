package au.com.woolworths.feature.shared.feedback.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/ui/Feedback2FormContract;", "", "ViewState", "Status", "Actions", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Feedback2FormContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/ui/Feedback2FormContract$Actions;", "", "Close", "Lau/com/woolworths/feature/shared/feedback/ui/Feedback2FormContract$Actions$Close;", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/ui/Feedback2FormContract$Actions$Close;", "Lau/com/woolworths/feature/shared/feedback/ui/Feedback2FormContract$Actions;", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Close extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final Close f6489a = new Close();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/ui/Feedback2FormContract$Status;", "", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        public static final Status d;
        public static final Status e;
        public static final Status f;
        public static final /* synthetic */ Status[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            Status status = new Status("Loading", 0);
            d = status;
            Status status2 = new Status("Error", 1);
            e = status2;
            Status status3 = new Status("ShowingForm", 2);
            f = status3;
            Status[] statusArr = {status, status2, status3, new Status("Success", 3)};
            g = statusArr;
            h = EnumEntriesKt.a(statusArr);
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) g.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/ui/Feedback2FormContract$ViewState;", "", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final Status f6490a;
        public final Actions b;

        public ViewState(Status status, Actions actions) {
            Intrinsics.h(status, "status");
            this.f6490a = status;
            this.b = actions;
        }

        public static ViewState a(ViewState viewState, Status status, int i) {
            if ((i & 1) != 0) {
                status = viewState.f6490a;
            }
            Actions actions = (i & 2) != 0 ? viewState.b : Actions.Close.f6489a;
            viewState.getClass();
            Intrinsics.h(status, "status");
            return new ViewState(status, actions);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f6490a == viewState.f6490a && Intrinsics.c(this.b, viewState.b);
        }

        public final int hashCode() {
            int iHashCode = this.f6490a.hashCode() * 31;
            Actions actions = this.b;
            return iHashCode + (actions == null ? 0 : actions.hashCode());
        }

        public final String toString() {
            return "ViewState(status=" + this.f6490a + ", action=" + this.b + ")";
        }
    }
}
