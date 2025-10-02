package com.adobe.marketing.mobile.util;

import androidx.compose.runtime.internal.StabilityInferred;
import com.adobe.marketing.mobile.services.Log;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/util/StringEncoder;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class StringEncoder {
    public static final String a(String str) throws NoSuchAlgorithmException {
        if (str != null && str.length() != 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                Charset UTF_8 = StandardCharsets.UTF_8;
                Intrinsics.g(UTF_8, "UTF_8");
                byte[] bytes = str.getBytes(UTF_8);
                Intrinsics.g(bytes, "this as java.lang.String).getBytes(charset)");
                messageDigest.update(bytes);
                byte[] messageDigest2 = messageDigest.digest();
                StringBuilder sb = new StringBuilder();
                Intrinsics.g(messageDigest2, "messageDigest");
                for (byte b : messageDigest2) {
                    sb.append(String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(b & 255)}, 1)));
                }
                return sb.toString();
            } catch (NoSuchAlgorithmException e) {
                e.toString();
                Log.a();
            }
        }
        return null;
    }
}
