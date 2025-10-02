package au.com.woolworths.foundation.shop.olive.voice.ui.lottie;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/ui/lottie/OliveIntroLottiePhase;", "", "Intro", "Olive", "Lau/com/woolworths/foundation/shop/olive/voice/ui/lottie/OliveIntroLottiePhase$Intro;", "Lau/com/woolworths/foundation/shop/olive/voice/ui/lottie/OliveIntroLottiePhase$Olive;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OliveIntroLottiePhase {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/ui/lottie/OliveIntroLottiePhase$Intro;", "Lau/com/woolworths/foundation/shop/olive/voice/ui/lottie/OliveIntroLottiePhase;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Intro implements OliveIntroLottiePhase {

        /* renamed from: a, reason: collision with root package name */
        public static final Intro f8848a = new Intro();

        @Override // au.com.woolworths.foundation.shop.olive.voice.ui.lottie.OliveIntroLottiePhase
        public final int a() {
            return 36;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Intro);
        }

        @Override // au.com.woolworths.foundation.shop.olive.voice.ui.lottie.OliveIntroLottiePhase
        public final int getStart() {
            return 0;
        }

        public final int hashCode() {
            return -1756776933;
        }

        @Override // au.com.woolworths.foundation.shop.olive.voice.ui.lottie.OliveIntroLottiePhase
        public final boolean isLooping() {
            return false;
        }

        public final String toString() {
            return "Intro";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/ui/lottie/OliveIntroLottiePhase$Olive;", "Lau/com/woolworths/foundation/shop/olive/voice/ui/lottie/OliveIntroLottiePhase;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Olive implements OliveIntroLottiePhase {

        /* renamed from: a, reason: collision with root package name */
        public static final Olive f8849a = new Olive();

        @Override // au.com.woolworths.foundation.shop.olive.voice.ui.lottie.OliveIntroLottiePhase
        public final int a() {
            return 115;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Olive);
        }

        @Override // au.com.woolworths.foundation.shop.olive.voice.ui.lottie.OliveIntroLottiePhase
        public final int getStart() {
            return 36;
        }

        public final int hashCode() {
            return -1751305846;
        }

        @Override // au.com.woolworths.foundation.shop.olive.voice.ui.lottie.OliveIntroLottiePhase
        public final boolean isLooping() {
            return true;
        }

        public final String toString() {
            return "Olive";
        }
    }

    int a();

    int getStart();

    boolean isLooping();
}
