package au.com.woolworths.feature.shared.feedback.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaFormEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/ui/FeedbackFormContract;", "", "ViewState", "Actions", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FeedbackFormContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/ui/FeedbackFormContract$Actions;", "", "OnDisplayResult", "MedalliaEvent", "Lau/com/woolworths/feature/shared/feedback/ui/FeedbackFormContract$Actions$MedalliaEvent;", "Lau/com/woolworths/feature/shared/feedback/ui/FeedbackFormContract$Actions$OnDisplayResult;", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/ui/FeedbackFormContract$Actions$MedalliaEvent;", "Lau/com/woolworths/feature/shared/feedback/ui/FeedbackFormContract$Actions;", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class MedalliaEvent extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final MedalliaFormEvent f6493a;

            public MedalliaEvent(MedalliaFormEvent medalliaEvent) {
                Intrinsics.h(medalliaEvent, "medalliaEvent");
                this.f6493a = medalliaEvent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MedalliaEvent) && Intrinsics.c(this.f6493a, ((MedalliaEvent) obj).f6493a);
            }

            public final int hashCode() {
                return this.f6493a.hashCode();
            }

            public final String toString() {
                return "MedalliaEvent(medalliaEvent=" + this.f6493a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/ui/FeedbackFormContract$Actions$OnDisplayResult;", "Lau/com/woolworths/feature/shared/feedback/ui/FeedbackFormContract$Actions;", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OnDisplayResult extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ResText f6494a;

            public OnDisplayResult(ResText resText) {
                this.f6494a = resText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OnDisplayResult) && this.f6494a.equals(((OnDisplayResult) obj).f6494a);
            }

            public final int hashCode() {
                return this.f6494a.hashCode();
            }

            public final String toString() {
                return "OnDisplayResult(message=" + this.f6494a + ")";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/ui/FeedbackFormContract$ViewState;", "", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewState);
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "ViewState(isLoading=false)";
        }
    }
}
