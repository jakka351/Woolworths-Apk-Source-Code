package com.lexisnexisrisk.threatmetrix.rl.tmxauth;

import android.annotation.TargetApi;
import android.security.KeyChain;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqbbqbq;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.util.Calendar;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes6.dex */
public class qqbbbbq {
    public static int a006100610061a00610061 = 2;
    public static int a0061a0061a00610061 = 0;
    public static int aa00610061a00610061 = 1;
    public static int aaa0061a00610061 = 40;
    private static final String www0077ww0077;

    static {
        if (((aa0061a006100610061() + aaa0061a00610061) * aaa0061a00610061) % a006100610061a00610061 != a0061aa006100610061()) {
            aaa0061a00610061 = aaaa006100610061();
            a0061a0061a00610061 = aaaa006100610061();
        }
        www0077ww0077 = qqbbqbq.b0062b006200620062b(qqbbbbq.class);
    }

    private qqbbbbq() {
    }

    public static int a0061aa006100610061() {
        return 0;
    }

    public static int aa0061a006100610061() {
        return 1;
    }

    public static int aaaa006100610061() {
        return 43;
    }

    @TargetApi
    public static boolean b00620062bb00620062(@Nullable PrivateKey privateKey, String str) {
        if (!qqqbbbq.ww0077www0077) {
            qqbbqbq.qbbbqbq.d(www0077ww0077, qqqqbbb.q0071q00710071q0071("Sp|4\u0001+mqmjq%oh{!\u0015\u0019\u000f\u0003H;\r~\n\r\u007f\byw2t\u001d\u0011\"!\u0012\u001fJ\u000b\u001b\rF\u0014\u0014\u0018B\u00037!(*\u001e\u001e'\u001ff", (char) (qbbqqbb.qqq007100710071q() ^ (-321957144)), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710750))));
            return false;
        }
        if (privateKey != null && qqqbbbq.w00770077007700770077w >= 23) {
            try {
                String algorithm = privateKey.getAlgorithm();
                int i = aaa0061a00610061;
                if (((aa00610061a00610061 + i) * i) % a006100610061a00610061 != a0061a0061a00610061) {
                    aaa0061a00610061 = 19;
                    a0061a0061a00610061 = aaaa006100610061();
                }
                KeyInfo keyInfo = (KeyInfo) KeyFactory.getInstance(algorithm, str).getKeySpec(privateKey, KeyInfo.class);
                qqbbqbq.qbbbqbq.d(www0077ww0077, qqqqbbb.q0071007100710071q0071("\u001a4F9M8J>y==@IDD\u0001", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014572), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014531), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710752))) + keyInfo.isInsideSecureHardware());
                return keyInfo.isInsideSecureHardware();
            } catch (NoSuchAlgorithmException e) {
                qqbbqbq.qbbbqbq.b0062bb00620062b(www0077ww0077, qqqqbbb.q0071q00710071q0071("\u000f,8oDn:<%'a50,e\u0010AT-MOQC|OP", (char) (qbbqqbb.qqq007100710071q() ^ (-321957293)), (char) (qbbqqbb.qqq007100710071q() ^ (-321957278))), e.toString());
            } catch (NoSuchProviderException e2) {
                e = e2;
                qqbbqbq.i(www0077ww0077, qqqqbbb.q0071007100710071q0071("[z\tB\u0011=\u0002\u0012\u0006\u0003\u0017\tDp\f!x\u000b\u0014\u001eL),", (char) (qqqbqbb.q00710071007100710071q() ^ 1589694485), (char) (qbbqqbb.qqq007100710071q() ^ (-321957286)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014676)), e.toString());
                return false;
            } catch (InvalidKeySpecException e3) {
                e = e3;
                qqbbqbq.i(www0077ww0077, qqqqbbb.q0071007100710071q0071("[z\tB\u0011=\u0002\u0012\u0006\u0003\u0017\tDp\f!x\u000b\u0014\u001eL),", (char) (qqqbqbb.q00710071007100710071q() ^ 1589694485), (char) (qbbqqbb.qqq007100710071q() ^ (-321957286)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014676)), e.toString());
                return false;
            } catch (Throwable th) {
                qqbbqbq.e(www0077ww0077, qqqqbbb.q0071007100710071q0071("_|\t@\r7y\byt\u0007v0Zs\u0007\\ls{(/xzrwkne\u001fcu_`jmafd\u001e\u0014no", (char) (qqqbqbb.q00710071007100710071q() ^ 1589694532), (char) (qbbqqbb.qqq007100710071q() ^ (-321957310)), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710749))), th.toString());
            }
        }
        return false;
    }

    @TargetApi
    public static KeyPair bb0062bb00620062(@Nonnull String str, String str2, @Nonnull String str3, @Nonnull String str4, @Nonnull BigInteger bigInteger, @Nonnull Calendar calendar, @Nonnull Calendar calendar2, boolean z, boolean z2, @Nonnull byte[] bArr) {
        if (!qqqbbbq.ww0077www0077) {
            qqbbqbq.qbbbqbq.d(www0077ww0077, qqqqbbb.q0071007100710071q0071("IN<i\u0018(`E?\u001b\tl`8c\u0014~wR\u0002V\u000eqbW2\u001c\u0004c\u00048(\u000e\u0005eL;N\u0001vZy)!\u0007\u0017IC\u001f\u000eq[=,\u0016E", (char) (qqqbqbb.q00710071007100710071q() ^ 1589694645), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014521), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710746))));
            return null;
        }
        if (!KeyChain.isKeyAlgorithmSupported(str)) {
            return null;
        }
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(str, str2);
            KeyGenParameterSpec.Builder certificateSerialNumber = new KeyGenParameterSpec.Builder(str3, 4).setDigests(qqqqbbb.q0071007100710071q0071("\u0006{ubhln", (char) (qbbqqbb.qqq007100710071q() ^ (-321957147)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014717), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694666))).setCertificateSerialNumber(bigInteger);
            int i = aaa0061a00610061;
            if (((aa00610061a00610061 + i) * i) % a006100610061a00610061 != a0061a0061a00610061) {
                aaa0061a00610061 = aaaa006100610061();
                a0061a0061a00610061 = aaaa006100610061();
            }
            KeyGenParameterSpec.Builder certificateNotAfter = certificateSerialNumber.setCertificateSubject(new X500Principal(qqqqbbb.q0071007100710071q0071("LXH", (char) (qbbqqbb.qqq007100710071q() ^ (-321957252)), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710838)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014676)) + str4)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime());
            if (qqqbbbq.w00770077007700770077w >= 24) {
                qbbbbbq.bbb0062b00620062(certificateNotAfter, bArr);
            }
            if (qqqqbbb.q0071007100710071q0071("\u001e \u000f", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014639), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710806)), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694666)).equals(str)) {
                certificateNotAfter.setSignaturePaddings(qqqqbbb.q0071q00710071q0071("#\u001d\u0014#\u007f", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710902)), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694668)));
            }
            if (z) {
                certificateNotAfter.setUserAuthenticationRequired(true);
                certificateNotAfter.setUserAuthenticationValidityDurationSeconds(60);
            }
            keyPairGenerator.initialize(certificateNotAfter.build());
            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            if (keyPairGenerateKeyPair != null && z2) {
                if (!b00620062bb00620062(keyPairGenerateKeyPair.getPrivate(), str2)) {
                    return null;
                }
            }
            return keyPairGenerateKeyPair;
        } catch (InvalidAlgorithmParameterException e) {
            e = e;
            qqbbqbq.i(www0077ww0077, qqqqbbb.q0071007100710071q0071("o\u000f\u001dV%Q\u0016&\u001a\u0017+\u001dX\u0005 5\r\u001f(2`=@", (char) (qbbqqbb.qqq007100710071q() ^ (-321957209)), (char) (qbbqqbb.qqq007100710071q() ^ (-321957234)), (char) (qbbqqbb.qqq007100710071q() ^ (-321957279))), e.toString());
            return null;
        } catch (NoSuchAlgorithmException e2) {
            qqbbqbq.qbbbqbq.e(www0077ww0077, qqqqbbb.q0071007100710071q0071("'?\u0001m\u00151_*$!u{\u0012\nLjoM_RtfZ", (char) (qbbqqbb.qqq007100710071q() ^ (-321957271)), (char) (qbbqqbb.qqq007100710071q() ^ (-321957291)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014678)), e2.toString());
            return null;
        } catch (NoSuchProviderException e3) {
            e = e3;
            qqbbqbq.i(www0077ww0077, qqqqbbb.q0071007100710071q0071("o\u000f\u001dV%Q\u0016&\u001a\u0017+\u001dX\u0005 5\r\u001f(2`=@", (char) (qbbqqbb.qqq007100710071q() ^ (-321957209)), (char) (qbbqqbb.qqq007100710071q() ^ (-321957234)), (char) (qbbqqbb.qqq007100710071q() ^ (-321957279))), e.toString());
            return null;
        } catch (Throwable th) {
            qqbbqbq.e(www0077ww0077, qqqqbbb.q0071q00710071q0071("+JX\u0012`\rQaURfX\u0014@[pHZcm\u001cx{", (char) (qqqbqbb.q00710071007100710071q() ^ 1589694651), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710748))), th.toString());
            return null;
        }
    }
}
