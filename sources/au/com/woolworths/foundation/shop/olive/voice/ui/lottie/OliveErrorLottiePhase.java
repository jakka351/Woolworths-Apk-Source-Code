package au.com.woolworths.foundation.shop.olive.voice.ui.lottie;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/ui/lottie/OliveErrorLottiePhase;", "", "Dizzy", "Loop", "Lau/com/woolworths/foundation/shop/olive/voice/ui/lottie/OliveErrorLottiePhase$Dizzy;", "Lau/com/woolworths/foundation/shop/olive/voice/ui/lottie/OliveErrorLottiePhase$Loop;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OliveErrorLottiePhase {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/ui/lottie/OliveErrorLottiePhase$Dizzy;", "Lau/com/woolworths/foundation/shop/olive/voice/ui/lottie/OliveErrorLottiePhase;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Dizzy implements OliveErrorLottiePhase {

        /* renamed from: a, reason: collision with root package name */
        public static final Dizzy f8845a = new Dizzy();

        @Override // au.com.woolworths.foundation.shop.olive.voice.ui.lottie.OliveErrorLottiePhase
        public final int a() {
            return 5;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dizzy);
        }

        @Override // au.com.woolworths.foundation.shop.olive.voice.ui.lottie.OliveErrorLottiePhase
        public final int getStart() {
            return 1;
        }

        public final int hashCode() {
            return -993996249;
        }

        @Override // au.com.woolworths.foundation.shop.olive.voice.ui.lottie.OliveErrorLottiePhase
        public final boolean isLooping() {
            return false;
        }

        public final String toString() {
            return "Dizzy";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/ui/lottie/OliveErrorLottiePhase$Loop;", "Lau/com/woolworths/foundation/shop/olive/voice/ui/lottie/OliveErrorLottiePhase;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Loop implements OliveErrorLottiePhase {

        /* renamed from: a, reason: collision with root package name */
        public static final Loop f8846a = new Loop();

        @Override // au.com.woolworths.foundation.shop.olive.voice.ui.lottie.OliveErrorLottiePhase
        public final int a() {
            return 65;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loop);
        }

        @Override // au.com.woolworths.foundation.shop.olive.voice.ui.lottie.OliveErrorLottiePhase
        public final int getStart() {
            return 5;
        }

        public final int hashCode() {
            return 1076558001;
        }

        @Override // au.com.woolworths.foundation.shop.olive.voice.ui.lottie.OliveErrorLottiePhase
        public final boolean isLooping() {
            return true;
        }

        public final String toString() {
            return "Loop";
        }
    }

    int a();

    int getStart();

    boolean isLooping();
}
