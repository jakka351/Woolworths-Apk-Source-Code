package au.com.woolworths.pay.sdk.models.config;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

@Keep
/* loaded from: classes4.dex */
public class Configuration {

    @Nullable
    private final Set<String> allowedPinningPublicKeyModuli;

    @NonNull
    private final String apiKey;
    private final int apiRequestTimeout;

    @NonNull
    private final String apiSecret;

    @NonNull
    private final Environment environment;
    private final boolean isDebug;
    private int maxRetryLimit;

    public Configuration(@NonNull String str, @NonNull String str2, boolean z, @NonNull Environment environment) {
        this(str, str2, z, environment, 60);
    }

    public boolean allowsInvalidSSL() {
        return this.environment.allowsInvalidSSL();
    }

    public int getAPIRequestTimeout() {
        return this.apiRequestTimeout;
    }

    @Nullable
    public Set<String> getAllowedPinningPublicKeyModuli() {
        return this.allowedPinningPublicKeyModuli;
    }

    @NonNull
    public String getApiKey() {
        return this.apiKey;
    }

    @NonNull
    public String getApiSecret() {
        return this.apiSecret;
    }

    @NonNull
    public String getBaseURL() {
        return this.environment.getBaseURL();
    }

    public int getMaxRetryLimit() {
        return this.maxRetryLimit;
    }

    public boolean isDebug() {
        return this.isDebug;
    }

    public Configuration(@NonNull String str, @NonNull String str2, boolean z, @NonNull Environment environment, int i) {
        this(str, str2, z, environment, i, 3);
    }

    public Configuration(@NonNull String str, @NonNull String str2, boolean z, @NonNull Environment environment, int i, int i2) {
        this.apiKey = str;
        this.apiSecret = str2;
        this.isDebug = z;
        this.environment = environment;
        this.allowedPinningPublicKeyModuli = environment.getAllowedPinningPublicKeyModuli();
        this.apiRequestTimeout = i;
        this.maxRetryLimit = i2;
    }
}
