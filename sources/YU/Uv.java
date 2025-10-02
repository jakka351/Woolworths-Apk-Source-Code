package YU;

import android.content.pm.Signature;
import com.cyberfend.cyfsecurity.CircleProgressBar;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class Uv {

    /* renamed from: a, reason: collision with root package name */
    public static String f33a = CircleProgressBar.a("JM^");

    public static String a(Signature signature) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(f33a);
        messageDigest.update(signature.toByteArray());
        byte[] bArrDigest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrDigest) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }
}
