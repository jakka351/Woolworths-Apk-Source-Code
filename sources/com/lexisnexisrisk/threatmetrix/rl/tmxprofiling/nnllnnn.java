package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.Nonnull;

/* loaded from: classes6.dex */
public class nnllnnn {
    private static final String x0078007800780078x0078 = lqlqqll.u00750075u00750075u(nnllnnn.class);

    /* renamed from: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnllnnn$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] xxxxx00780078;

        static {
            int[] iArr = new int[nnlnlll.values().length];
            xxxxx00780078 = iArr;
            try {
                iArr[nnlnlll.MD5.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                xxxxx00780078[nnlnlll.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static MessageDigest o006F006F006Fo006Fo(String str) {
        if (lllqlql.h0068hhhh0068().h00680068h0068h0068()) {
            return null;
        }
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            lqlqqll.llqqqll.u007500750075uuu(x0078007800780078x0078, str + " digest failed", e);
            return null;
        }
    }

    public static String oo006F006Fo006Fo(@Nonnull nlllnnl nlllnnlVar, nnlnlll nnlnlllVar) throws InterruptedException {
        String strYy007900790079y0079 = lqlllll.yy007900790079y0079(nlllnnlVar);
        lqlqqll.llqqqll.u0075uu0075uu(x0078007800780078x0078, "sourceDir: " + strYy007900790079y0079);
        if (llqllqq.g006700670067006700670067g(strYy007900790079y0079)) {
            return oooo006F006Fo(strYy007900790079y0079, nnlnlllVar);
        }
        return null;
    }

    private static String oooo006F006Fo(@Nonnull String str, nnlnlll nnlnlllVar) throws InterruptedException, IOException {
        String str2;
        String str3;
        if (lllqlql.h0068hhhh0068().h00680068h0068h0068()) {
            return lllqlql.h0068hhhh0068().hhhh0068h0068(str, nnlnlllVar);
        }
        lqlqqll.llqqqll.yy00790079007900790079(x0078007800780078x0078, "Falling back to managed code for hashing");
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                MessageDigest messageDigestO006F006F006Fo006Fo = o006F006F006Fo006Fo(nnlnlllVar.kkkkkk006B);
                String str4 = AnonymousClass1.xxxxx00780078[nnlnlllVar.ordinal()] != 1 ? "%64s" : "%32s";
                if (messageDigestO006F006F006Fo006Fo == null) {
                    fileInputStream.close();
                    return null;
                }
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i <= 0) {
                        String strReplace = String.format(str4, new BigInteger(1, messageDigestO006F006F006Fo006Fo.digest()).toString(16)).replace(' ', '0');
                        lqlqqll.llqqqll.yy00790079007900790079(x0078007800780078x0078, "Got : " + strReplace);
                        fileInputStream.close();
                        return strReplace;
                    }
                    messageDigestO006F006F006Fo006Fo.update(bArr, 0, i);
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e) {
            e = e;
            str2 = x0078007800780078x0078;
            str3 = "Exception while getting FileInputStream";
            lqlqqll.llqqqll.u007500750075uuu(str2, str3, e);
            return null;
        } catch (IOException e2) {
            e = e2;
            str2 = x0078007800780078x0078;
            str3 = "Unable to process file for hashing";
            lqlqqll.llqqqll.u007500750075uuu(str2, str3, e);
            return null;
        }
    }
}
