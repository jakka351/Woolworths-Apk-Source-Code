package au.com.woolworths.pay.sdk.models.config;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

@Keep
/* loaded from: classes4.dex */
public enum Environment {
    LOCALHOST,
    UNIT_TESTS,
    WOOLWORTHS_DEV,
    WOOLWORTHS_TEST,
    WOOLWORTHS_UAT,
    LEGACY_PRODUCTION,
    PRODUCTION;

    /* renamed from: au.com.woolworths.pay.sdk.models.config.Environment$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$au$com$woolworths$pay$sdk$models$config$Environment;

        static {
            int[] iArr = new int[Environment.values().length];
            $SwitchMap$au$com$woolworths$pay$sdk$models$config$Environment = iArr;
            try {
                iArr[Environment.UNIT_TESTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$au$com$woolworths$pay$sdk$models$config$Environment[Environment.LOCALHOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$au$com$woolworths$pay$sdk$models$config$Environment[Environment.WOOLWORTHS_DEV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$au$com$woolworths$pay$sdk$models$config$Environment[Environment.WOOLWORTHS_TEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$au$com$woolworths$pay$sdk$models$config$Environment[Environment.WOOLWORTHS_UAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$au$com$woolworths$pay$sdk$models$config$Environment[Environment.LEGACY_PRODUCTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$au$com$woolworths$pay$sdk$models$config$Environment[Environment.PRODUCTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public boolean allowsInvalidSSL() {
        return AnonymousClass1.$SwitchMap$au$com$woolworths$pay$sdk$models$config$Environment[ordinal()] != 7;
    }

    @Nullable
    public Set<String> getAllowedPinningPublicKeyModuli() {
        return null;
    }

    @NonNull
    public String getBaseURL() {
        switch (AnonymousClass1.$SwitchMap$au$com$woolworths$pay$sdk$models$config$Environment[ordinal()]) {
            case 1:
                return "http://10.0.2.2:8800/wow/v1/pay";
            case 2:
                return "http://10.0.2.2:8888/wow/v1/pay";
            case 3:
                return "https://dev.mobile-api.woolworths.com.au/wow/v1/pay";
            case 4:
                return "https://test.mobile-api.woolworths.com.au/wow/v1/pay";
            case 5:
                return "https://uat.mobile-api.woolworths.com.au/wow/v1/pay";
            case 6:
                return "https://api.woolworths.com.au/wow/v1/pay";
            default:
                return "https://capi.woolworths.com.au/wow/v1/pay";
        }
    }
}
