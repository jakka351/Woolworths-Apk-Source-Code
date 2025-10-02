package au.com.woolworths.devicefingerprint;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/devicefingerprint/DeviceFingerprintInteractor;", "", "ProfileResult", "device-fingerprint_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DeviceFingerprintInteractor {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/devicefingerprint/DeviceFingerprintInteractor$ProfileResult;", "", "Success", "Failure", "Lau/com/woolworths/devicefingerprint/DeviceFingerprintInteractor$ProfileResult$Failure;", "Lau/com/woolworths/devicefingerprint/DeviceFingerprintInteractor$ProfileResult$Success;", "device-fingerprint_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ProfileResult {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/devicefingerprint/DeviceFingerprintInteractor$ProfileResult$Failure;", "Lau/com/woolworths/devicefingerprint/DeviceFingerprintInteractor$ProfileResult;", "device-fingerprint_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Failure extends ProfileResult {

            /* renamed from: a, reason: collision with root package name */
            public final String f5169a;

            public Failure(String str) {
                this.f5169a = str;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/devicefingerprint/DeviceFingerprintInteractor$ProfileResult$Success;", "Lau/com/woolworths/devicefingerprint/DeviceFingerprintInteractor$ProfileResult;", "device-fingerprint_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Success extends ProfileResult {

            /* renamed from: a, reason: collision with root package name */
            public final String f5170a;

            public Success(String str) {
                this.f5170a = str;
            }
        }
    }

    void a();

    Object b(String str, String str2, ContinuationImpl continuationImpl);
}
