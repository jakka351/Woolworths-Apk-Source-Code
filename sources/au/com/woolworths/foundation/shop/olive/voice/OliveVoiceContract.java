package au.com.woolworths.foundation.shop.olive.voice;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract;", "", "Action", "ViewState", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OliveVoiceContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$Action;", "", "ShowProductFinder", "ShowSearchResults", "OpenAppSettings", "OpenDeviceSettings", "PerformHapticSuccess", "PerformHapticFailure", "DisplayFeedbackForm", "Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$Action$DisplayFeedbackForm;", "Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$Action$OpenAppSettings;", "Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$Action$OpenDeviceSettings;", "Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$Action$PerformHapticFailure;", "Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$Action$PerformHapticSuccess;", "Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$Action$ShowProductFinder;", "Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$Action$ShowSearchResults;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$Action$DisplayFeedbackForm;", "Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$Action;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DisplayFeedbackForm extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final DisplayFeedbackForm f8793a = new DisplayFeedbackForm();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof DisplayFeedbackForm);
            }

            public final int hashCode() {
                return -639738753;
            }

            public final String toString() {
                return "DisplayFeedbackForm";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$Action$OpenAppSettings;", "Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$Action;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenAppSettings extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final OpenAppSettings f8794a = new OpenAppSettings();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenAppSettings);
            }

            public final int hashCode() {
                return 1760678766;
            }

            public final String toString() {
                return "OpenAppSettings";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$Action$OpenDeviceSettings;", "Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$Action;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenDeviceSettings extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final OpenDeviceSettings f8795a = new OpenDeviceSettings();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenDeviceSettings);
            }

            public final int hashCode() {
                return 537979471;
            }

            public final String toString() {
                return "OpenDeviceSettings";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$Action$PerformHapticFailure;", "Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$Action;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PerformHapticFailure extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final PerformHapticFailure f8796a = new PerformHapticFailure();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PerformHapticFailure);
            }

            public final int hashCode() {
                return 1520022238;
            }

            public final String toString() {
                return "PerformHapticFailure";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$Action$PerformHapticSuccess;", "Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$Action;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PerformHapticSuccess extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final PerformHapticSuccess f8797a = new PerformHapticSuccess();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PerformHapticSuccess);
            }

            public final int hashCode() {
                return 739426647;
            }

            public final String toString() {
                return "PerformHapticSuccess";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$Action$ShowProductFinder;", "Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$Action;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowProductFinder extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowProductFinder f8798a = new ShowProductFinder();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowProductFinder);
            }

            public final int hashCode() {
                return 1822676908;
            }

            public final String toString() {
                return "ShowProductFinder";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$Action$ShowSearchResults;", "Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$Action;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSearchResults extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final VoiceSearchResult f8799a;

            public ShowSearchResults(VoiceSearchResult voiceSearchResult) {
                this.f8799a = voiceSearchResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSearchResults) && Intrinsics.c(this.f8799a, ((ShowSearchResults) obj).f8799a);
            }

            public final int hashCode() {
                return this.f8799a.hashCode();
            }

            public final String toString() {
                return "ShowSearchResults(voiceSearchResult=" + this.f8799a + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$ViewState;", "", "Onboarding", "Permission", "VoiceSearch", "Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$ViewState$Onboarding;", "Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$ViewState$Permission;", "Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$ViewState$VoiceSearch;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$ViewState$Onboarding;", "Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$ViewState;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Onboarding implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final Onboarding f8800a = new Onboarding();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Onboarding);
            }

            public final int hashCode() {
                return 627233289;
            }

            public final String toString() {
                return "Onboarding";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$ViewState$Permission;", "Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$ViewState;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Permission implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final Permission f8801a = new Permission();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Permission);
            }

            public final int hashCode() {
                return 88498621;
            }

            public final String toString() {
                return "Permission";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$ViewState$VoiceSearch;", "Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceContract$ViewState;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class VoiceSearch implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final VoiceSearchState f8802a;

            public VoiceSearch(VoiceSearchState voiceSearchState) {
                this.f8802a = voiceSearchState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof VoiceSearch) && Intrinsics.c(this.f8802a, ((VoiceSearch) obj).f8802a);
            }

            public final int hashCode() {
                return this.f8802a.hashCode();
            }

            public final String toString() {
                return "VoiceSearch(state=" + this.f8802a + ")";
            }
        }
    }
}
