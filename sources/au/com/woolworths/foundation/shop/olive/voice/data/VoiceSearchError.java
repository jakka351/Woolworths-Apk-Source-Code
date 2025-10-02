package au.com.woolworths.foundation.shop.olive.voice.data;

import YU.a;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError;", "", "ProductNotFound", "ApiError", "NoProductMatch", "VoiceRecognitionError", "ConnectionError", "InsufficientDeviceLevelPermissions", "UnsupportedLanguage", "LanguageNotAvailable", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError$ApiError;", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError$ConnectionError;", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError$InsufficientDeviceLevelPermissions;", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError$LanguageNotAvailable;", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError$NoProductMatch;", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError$ProductNotFound;", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError$UnsupportedLanguage;", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError$VoiceRecognitionError;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface VoiceSearchError {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError$ApiError;", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ApiError implements VoiceSearchError {

        /* renamed from: a, reason: collision with root package name */
        public static final ApiError f8822a = new ApiError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ApiError);
        }

        public final int hashCode() {
            return 141410595;
        }

        public final String toString() {
            return "ApiError";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError$ConnectionError;", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConnectionError implements VoiceSearchError {

        /* renamed from: a, reason: collision with root package name */
        public static final ConnectionError f8823a = new ConnectionError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConnectionError);
        }

        public final int hashCode() {
            return -847809771;
        }

        public final String toString() {
            return "ConnectionError";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError$InsufficientDeviceLevelPermissions;", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InsufficientDeviceLevelPermissions implements VoiceSearchError {

        /* renamed from: a, reason: collision with root package name */
        public static final InsufficientDeviceLevelPermissions f8824a = new InsufficientDeviceLevelPermissions();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InsufficientDeviceLevelPermissions);
        }

        public final int hashCode() {
            return 1377168782;
        }

        public final String toString() {
            return "InsufficientDeviceLevelPermissions";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError$LanguageNotAvailable;", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LanguageNotAvailable implements VoiceSearchError {

        /* renamed from: a, reason: collision with root package name */
        public static final LanguageNotAvailable f8825a = new LanguageNotAvailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LanguageNotAvailable);
        }

        public final int hashCode() {
            return 183648835;
        }

        public final String toString() {
            return "LanguageNotAvailable";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError$NoProductMatch;", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoProductMatch implements VoiceSearchError {

        /* renamed from: a, reason: collision with root package name */
        public static final NoProductMatch f8826a = new NoProductMatch();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoProductMatch);
        }

        public final int hashCode() {
            return 771348428;
        }

        public final String toString() {
            return "NoProductMatch";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError$ProductNotFound;", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductNotFound implements VoiceSearchError {

        /* renamed from: a, reason: collision with root package name */
        public final String f8827a;

        public ProductNotFound(String str) {
            this.f8827a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProductNotFound) && Intrinsics.c(this.f8827a, ((ProductNotFound) obj).f8827a);
        }

        public final int hashCode() {
            return this.f8827a.hashCode();
        }

        public final String toString() {
            return a.h("ProductNotFound(productName=", this.f8827a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError$UnsupportedLanguage;", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnsupportedLanguage implements VoiceSearchError {

        /* renamed from: a, reason: collision with root package name */
        public static final UnsupportedLanguage f8828a = new UnsupportedLanguage();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UnsupportedLanguage);
        }

        public final int hashCode() {
            return 1176628344;
        }

        public final String toString() {
            return "UnsupportedLanguage";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError$VoiceRecognitionError;", "Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VoiceRecognitionError implements VoiceSearchError {

        /* renamed from: a, reason: collision with root package name */
        public static final VoiceRecognitionError f8829a = new VoiceRecognitionError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof VoiceRecognitionError);
        }

        public final int hashCode() {
            return 825372398;
        }

        public final String toString() {
            return "VoiceRecognitionError";
        }
    }

    default String a(Context context) {
        Intrinsics.h(context, "context");
        if (this instanceof ProductNotFound) {
            String string = context.getString(R.string.olive_voice_failure_item_not_available_in_store, ((ProductNotFound) this).f8827a);
            Intrinsics.g(string, "getString(...)");
            return string;
        }
        if (this instanceof ApiError) {
            String string2 = context.getString(R.string.olive_voice_failure_api_error);
            Intrinsics.g(string2, "getString(...)");
            return string2;
        }
        if (this instanceof NoProductMatch) {
            String string3 = context.getString(R.string.olive_voice_failure_no_product_recognised);
            Intrinsics.g(string3, "getString(...)");
            return string3;
        }
        if (this instanceof VoiceRecognitionError) {
            String string4 = context.getString(R.string.olive_voice_failure_voice_recognition_error);
            Intrinsics.g(string4, "getString(...)");
            return string4;
        }
        if (this instanceof ConnectionError) {
            String string5 = context.getString(R.string.olive_voice_failure_connection_error);
            Intrinsics.g(string5, "getString(...)");
            return string5;
        }
        String string6 = context.getString(R.string.olive_voice_idle_state_title);
        Intrinsics.g(string6, "getString(...)");
        return string6;
    }

    default boolean b() {
        return (this instanceof InsufficientDeviceLevelPermissions) || (this instanceof UnsupportedLanguage) || (this instanceof LanguageNotAvailable);
    }
}
