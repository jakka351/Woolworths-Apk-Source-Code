package au.com.woolworths.foundation.shop.olive.voice.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchState;", "", "Idle", "Listening", "Recognising", "Processing", "Failure", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchState$Failure;", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchState$Idle;", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchState$Listening;", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchState$Processing;", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchState$Recognising;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface VoiceSearchState {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchState$Failure;", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchState;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failure implements VoiceSearchState {

        /* renamed from: a, reason: collision with root package name */
        public final VoiceSearchError f8831a;

        public Failure(VoiceSearchError voiceSearchError) {
            this.f8831a = voiceSearchError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && Intrinsics.c(this.f8831a, ((Failure) obj).f8831a);
        }

        public final int hashCode() {
            return this.f8831a.hashCode();
        }

        public final String toString() {
            return "Failure(errorState=" + this.f8831a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchState$Idle;", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchState;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Idle implements VoiceSearchState {

        /* renamed from: a, reason: collision with root package name */
        public static final Idle f8832a = new Idle();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Idle);
        }

        public final int hashCode() {
            return 2139580032;
        }

        public final String toString() {
            return "Idle";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchState$Listening;", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchState;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Listening implements VoiceSearchState {

        /* renamed from: a, reason: collision with root package name */
        public static final Listening f8833a = new Listening();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Listening);
        }

        public final int hashCode() {
            return 1534002575;
        }

        public final String toString() {
            return "Listening";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchState$Processing;", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchState;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Processing implements VoiceSearchState {

        /* renamed from: a, reason: collision with root package name */
        public final String f8834a;

        public Processing(String str) {
            this.f8834a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Processing) && Intrinsics.c(this.f8834a, ((Processing) obj).f8834a);
        }

        public final int hashCode() {
            return this.f8834a.hashCode();
        }

        public final String toString() {
            return a.h("Processing(textProcessing=", this.f8834a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchState$Recognising;", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchState;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Recognising implements VoiceSearchState {

        /* renamed from: a, reason: collision with root package name */
        public final String f8835a;

        public Recognising(String str) {
            this.f8835a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Recognising) && Intrinsics.c(this.f8835a, ((Recognising) obj).f8835a);
        }

        public final int hashCode() {
            return this.f8835a.hashCode();
        }

        public final String toString() {
            return a.h("Recognising(recognisedText=", this.f8835a, ")");
        }
    }
}
