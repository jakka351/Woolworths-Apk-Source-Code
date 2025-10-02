package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class nllnlll extends HashMap<String, String> {
    private static final String kk006Bkkk006B = lqlqqll.u00750075u00750075u(nllnlll.class);
    private int k006B006Bkkk006B = 0;

    @Nonnull
    private final HashMap<String, Integer> kkk006Bkk006B = new HashMap<>();

    private static byte[] dd0064dd00640064(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                gZIPOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Nonnull
    public nllnlll d0064006400640064d0064(String str, @Nullable String str2, Integer num) {
        this.kkk006Bkk006B.put(str, num);
        ddddd00640064(str, str2, false);
        return this;
    }

    public byte[] d006400640064d00640064() {
        byte[] bArrDd0064dd00640064;
        String strD0064d0064d00640064 = d0064d0064d00640064();
        try {
            bArrDd0064dd00640064 = dd0064dd00640064(strD0064d0064d00640064);
        } catch (IOException e) {
            lqlqqll.u0075uu00750075u(kk006Bkkk006B, "Cannot compress!", e);
            bArrDd0064dd00640064 = null;
        }
        return bArrDd0064dd00640064 == null ? strD0064d0064d00640064.getBytes() : bArrDd0064dd00640064;
    }

    public Integer d00640064dd00640064(String str) {
        return this.kkk006Bkk006B.get(str);
    }

    @Nonnull
    public String d0064d0064d00640064() {
        StringBuilder sb = new StringBuilder();
        for (String str : keySet()) {
            String strSubstring = (String) get(str);
            if (strSubstring != null && !strSubstring.isEmpty()) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(str);
                Integer num = this.kkk006Bkk006B.get(str);
                if (num != null && num.intValue() != -1 && strSubstring.length() > num.intValue()) {
                    strSubstring = strSubstring.substring(0, num.intValue());
                }
                if (num == null && this.k006B006Bkkk006B != 0) {
                    int length = strSubstring.length();
                    int i = this.k006B006Bkkk006B;
                    if (length > i) {
                        strSubstring = strSubstring.substring(0, i);
                    }
                }
                sb.append("=");
                sb.append(llqllqq.g0067ggg0067g0067(strSubstring));
            }
        }
        return sb.toString();
    }

    @Nonnull
    public nllnlll d0064ddd00640064(Map<String, String> map) {
        if (!(map instanceof nllnlll)) {
            putAll(map);
            return this;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Integer numD00640064dd00640064 = ((nllnlll) map).d00640064dd00640064(entry.getKey());
            if (numD00640064dd00640064 != null) {
                d0064006400640064d0064(entry.getKey(), entry.getValue(), numD00640064dd00640064);
            } else {
                dd006400640064d0064(entry.getKey(), entry.getValue());
            }
        }
        return this;
    }

    @Nonnull
    public nllnlll dd006400640064d0064(String str, @Nullable String str2) {
        ddddd00640064(str, str2, false);
        return this;
    }

    public void dd00640064d00640064(int i) {
        this.k006B006Bkkk006B = i;
    }

    public int ddd0064d00640064() {
        return this.k006B006Bkkk006B;
    }

    @Nonnull
    public nllnlll ddddd00640064(String str, @Nullable String str2, boolean z) {
        if (llqllqq.ggggggg0067(str2)) {
            return this;
        }
        if (z) {
            put(str, str2.toLowerCase(Locale.US));
            return this;
        }
        put(str, str2);
        return this;
    }
}
