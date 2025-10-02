package au.com.woolworths.pay.internal.network;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import au.com.woolworths.pay.internal.services.HeadersRequestHelper;
import au.com.woolworths.pay.sdk.models.config.Configuration;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public abstract class APIRequest {
    private String accessToken;
    private Configuration configuration;

    public APIRequest(String str, Configuration configuration) {
        this.accessToken = str;
        this.configuration = configuration;
    }

    @Nullable
    public abstract String getData() throws JSONEncodingException;

    @NonNull
    public Map<String, List<String>> getHeaders() throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        HashMap map = new HashMap();
        String apiKey = this.configuration.getApiKey();
        String apiSecret = this.configuration.getApiSecret();
        char[] cArr = HeadersRequestHelper.f9186a;
        String strEncodeToString = Base64.encodeToString((apiKey + ":" + (System.currentTimeMillis() / 1000)).getBytes(), 2);
        SecretKeySpec secretKeySpec = new SecretKeySpec(apiSecret.getBytes(), "HmacSHA1");
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(secretKeySpec);
        byte[] bArrDoFinal = mac.doFinal(strEncodeToString.getBytes());
        char[] cArr2 = new char[bArrDoFinal.length * 2];
        for (int i = 0; i < bArrDoFinal.length; i++) {
            byte b = bArrDoFinal[i];
            int i2 = i * 2;
            char[] cArr3 = HeadersRequestHelper.f9186a;
            cArr2[i2] = cArr3[(b & 255) >>> 4];
            cArr2[i2 + 1] = cArr3[b & 15];
        }
        String[] strArr = {strEncodeToString, new String(cArr2)};
        map.put("X-Auth-Key", Collections.singletonList(strArr[0]));
        map.put("X-Auth-Digest", Collections.singletonList(strArr[1]));
        map.put("Authorization", Collections.singletonList("Bearer " + this.accessToken));
        map.put("User-Agent", Collections.singletonList("woolworth-pay"));
        return map;
    }

    public abstract String getMethod();

    public abstract String getRelativePath();
}
