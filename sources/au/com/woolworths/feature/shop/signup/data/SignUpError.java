package au.com.woolworths.feature.shop.signup.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/signup/data/SignUpError;", "", "NoBrowserInstalled", "Failed", "Lau/com/woolworths/feature/shop/signup/data/SignUpError$Failed;", "Lau/com/woolworths/feature/shop/signup/data/SignUpError$NoBrowserInstalled;", "signup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SignUpError {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/signup/data/SignUpError$Failed;", "Lau/com/woolworths/feature/shop/signup/data/SignUpError;", "signup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failed implements SignUpError {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public final int hashCode() {
            return -1358948863;
        }

        public final String toString() {
            return "Failed(message=Not a valid callback Uri)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/signup/data/SignUpError$NoBrowserInstalled;", "Lau/com/woolworths/feature/shop/signup/data/SignUpError;", "signup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoBrowserInstalled implements SignUpError {

        /* renamed from: a, reason: collision with root package name */
        public static final NoBrowserInstalled f8113a = new NoBrowserInstalled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoBrowserInstalled);
        }

        public final int hashCode() {
            return -724795022;
        }

        public final String toString() {
            return "NoBrowserInstalled";
        }
    }
}
