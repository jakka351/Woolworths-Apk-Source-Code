package androidx.browser.trusted;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
class PackageIdentityUtils {

    @RequiresApi
    public static class Api28Implementation implements SignaturesCompat {
        public final List a(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
            ArrayList arrayList = new ArrayList();
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (!signingInfo.hasMultipleSigners()) {
                arrayList.add(PackageIdentityUtils.a(signingInfo.getSigningCertificateHistory()[0]));
                return arrayList;
            }
            for (Signature signature : signingInfo.getApkContentsSigners()) {
                arrayList.add(PackageIdentityUtils.a(signature));
            }
            return arrayList;
        }

        public final boolean b(String str, PackageManager packageManager, TokenContents tokenContents) throws IOException {
            tokenContents.b();
            String str2 = tokenContents.b;
            if (str2 == null) {
                throw new IllegalStateException();
            }
            if (!str2.equals(str)) {
                return false;
            }
            ArrayList arrayList = (ArrayList) a(packageManager, str);
            if (arrayList.size() != 1) {
                return tokenContents.equals(TokenContents.a(str, arrayList));
            }
            tokenContents.b();
            ArrayList arrayList2 = tokenContents.c;
            if (arrayList2 != null) {
                return packageManager.hasSigningCertificate(str, Arrays.copyOf((byte[]) arrayList2.get(0), ((byte[]) tokenContents.c.get(0)).length), 1);
            }
            throw new IllegalStateException();
        }
    }

    public static class Pre28Implementation implements SignaturesCompat {
    }

    public interface SignaturesCompat {
    }

    public static byte[] a(Signature signature) {
        try {
            return MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
