package com.lexisnexisrisk.threatmetrix.rl.tmxauth;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public class qbqqqqq {
    public static int q00710071qq00710071 = 0;
    public static int q0071q0071q00710071 = 2;
    public static int qq0071qq00710071 = 96;
    public static int qqq0071q00710071 = 1;

    public static byte[] k006B006Bkk006B006B(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Throwable {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, qqqqbbb.q0071q00710071q0071("_bo", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014525), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710751))));
        try {
            if (((((Integer) Class.forName(qqqqbbb.q0071007100710071q0071("S`_!`Zn`kg_sepphsl0wlwkh|vo\u007f~v\u0007=\u0003}@\b\u0002\u000ew\r\r\u0002H\r~\u000f\u0010\u0011\u0012\u0013", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014583), (char) (qbbqqbb.qqq007100710071q() ^ (-321957166)), (char) (qbbqqbb.qqq007100710071q() ^ (-321957276)))).getMethod(qqqqbbb.q0071007100710071q0071("h()1,,-500194u56>99:B=", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710876)), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710867)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014673)), null).invoke(null, null)).intValue() + qq0071qq00710071) * qq0071qq00710071) % q0071q0071q00710071 != q00710071qq00710071) {
                try {
                    qq0071qq00710071 = ((Integer) Class.forName(qqqqbbb.q0071q00710071q0071("%21r2,@2=91E7BB:E>\u0002I>I=:NHAQPHX\u000fTO\u0012YS_I^^S\u001a^P`abcd", (char) (qbbqqbb.qqq007100710071q() ^ (-321957192)), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694666))).getMethod(qqqqbbb.q0071007100710071q0071("\u0006J7(}\u001c\nX\u0010p}jY)Q=k;$", (char) (qbbqqbb.qqq007100710071q() ^ (-321957132)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014489), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694667)), null).invoke(null, null)).intValue();
                    try {
                        q00710071qq00710071 = ((Integer) Class.forName(qqqqbbb.q0071007100710071q0071("\u0006^)u\u0001Ff$:\u0002Ee#y\u0005H_$3\u0006F\u001d\u001de\u0005J\u000f+u9TV(n|O\u0015lbCN\u000f!q/\u000b\u0017cp=", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014704), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694592), (char) (qbbqqbb.qqq007100710071q() ^ (-321957280)))).getMethod(qqqqbbb.q0071007100710071q0071("\u001e\u001dZY_XVU[T\u0014QPVOMLRK", (char) (qqqbqbb.q00710071007100710071q() ^ 1589694541), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014466), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710745))), null).invoke(null, null)).intValue();
                    } catch (InvocationTargetException e) {
                        throw e.getCause();
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            Cipher cipher = Cipher.getInstance(qqqqbbb.q0071007100710071q0071("\t\u000e\u001dy\u000f\u000f\u0011} \u001c\u0015&\t%7;<BHB", (char) (qbbqqbb.qqq007100710071q() ^ (-321957216)), (char) (qbbqqbb.qqq007100710071q() ^ (-321957145)), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710747))));
            int i = qq0071qq00710071;
            if (((qqq0071q00710071 + i) * i) % q0071q0071q00710071 != q00710071qq00710071) {
                try {
                    qq0071qq00710071 = ((Integer) Class.forName(qqqqbbb.q0071q00710071q0071("?JG\u0007LDVFGA7IAJH>?6w=8A3.80'5:0>rng(mmw_rh[ bZhgf]\\", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014710), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014679))).getMethod(qqqqbbb.q0071007100710071q0071("\u00077d\u0015\u000f7'YOy-\u001c\u000bD/\\O\u0007o", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014534), (char) (qbbqqbb.qqq007100710071q() ^ (-321957321)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014677)), null).invoke(null, null)).intValue();
                    q00710071qq00710071 = 24;
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public static byte[] kk006Bkk006B006B(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, qqqqbbb.q0071007100710071q0071("16E", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710909)), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710893)), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694671)));
        try {
            if (((qq0071qq00710071 + ((Integer) Class.forName(qqqqbbb.q0071q00710071q0071(")65v60D6A=5I;FF>IB\u0006MBMA>RLEUTL\\\u0013XS\u0016]WcMbbW\u001ebTdefgh", (char) (qbbqqbb.qqq007100710071q() ^ (-321957135)), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710748)))).getMethod(qqqqbbb.q0071q00710071q0071("l*)/(&%+$\"!' _\u001d\u001c\"\u001b\u0019\u0018\u001e\u0017", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710899)), (char) (qbbqqbb.qqq007100710071q() ^ (-321957274))), null).invoke(null, null)).intValue()) * qq0071qq00710071) % q0071q0071q00710071 != q00710071qq00710071) {
                try {
                    qq0071qq00710071 = ((Integer) Class.forName(qqqqbbb.q0071007100710071q0071("\u001a'&g'!5'2.&:,77/:3v>3>2/C=6FE=M\u0004ID\u0007NHT>SSH\u000fSEUVWXY", (char) (qqqbqbb.q00710071007100710071q() ^ 1589694603), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710837)), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710752)))).getMethod(qqqqbbb.q0071q00710071q0071("lm-.6112:5v67?::;C>", (char) (qbbqqbb.qqq007100710071q() ^ (-321957157)), (char) (qbbqqbb.qqq007100710071q() ^ (-321957279))), null).invoke(null, null)).intValue();
                    q00710071qq00710071 = 8;
                } catch (InvocationTargetException e) {
                    throw e.getCause();
                } catch (Exception e2) {
                    throw e2;
                }
            }
            int iQq00710071q0071q = qbqqqbb.qq00710071q0071q() ^ (-1208710876);
            int i = qq0071qq00710071;
            if (((qqq0071q00710071 + i) * i) % q0071q0071q00710071 != 0) {
                try {
                    qq0071qq00710071 = ((Integer) Class.forName(qqqqbbb.q0071q00710071q0071("\u001f,+l,&:,73+?1<<4?8{C8C74HB;KJBR\tNI\fSMYCXXM\u0014XJZ[\\]^", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014568), (char) (qbbqqbb.qqq007100710071q() ^ (-321957276)))).getMethod(qqqqbbb.q0071q00710071q0071("|{98>754:3r0/5.,+1*", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014696), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014677)), null).invoke(null, null)).intValue();
                    q00710071qq00710071 = 30;
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            Cipher cipher = Cipher.getInstance(qqqqbbb.q0071007100710071q0071("8=L)>>@-OKDU8Tfjkqwq", (char) iQq00710071q0071q, (char) (qbbqqbb.qqq007100710071q() ^ (-321957140)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014673)));
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        } catch (Exception e5) {
            throw e5;
        }
    }

    public static InputStream kkk006Bk006B006B(InputStream inputStream, byte[] bArr, byte[] bArr2) throws Exception {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, qqqqbbb.q0071q00710071q0071("z,*", (char) (qbbqqbb.qqq007100710071q() ^ (-321957179)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014682)));
            int i = qq0071qq00710071;
            if (((qqq0071q00710071 + i) * i) % q0071q0071q00710071 != 0) {
                try {
                    qq0071qq00710071 = ((Integer) Class.forName(qqqqbbb.q0071q00710071q0071("\u0002\r\nI\u0007~\u0011\u0001\n\u0004y\f{\u0005\u0003x\u0002x:\u007fr{mhzriwtjx-pi*ogqYlj]\"dTba`_^", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710839)), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694667))).getMethod(qqqqbbb.q0071007100710071q0071("9:yz\u0003}}~\u0007\u0002C\u0003\u0004\f\u0007\u0007\b\u0010\u000b", (char) (qqqbqbb.q00710071007100710071q() ^ 1589694475), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710874)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014673)), null).invoke(null, null)).intValue();
                    q00710071qq00710071 = 42;
                } catch (InvocationTargetException e) {
                    throw e.getCause();
                }
            }
            Cipher cipher = Cipher.getInstance(qqqqbbb.q0071q00710071q0071("\u0006\u000b\u001av\f\f\u000ez\u001d\u0019\u0012#\u0006\"489?E?", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710780)), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710752))));
            int i2 = qq0071qq00710071;
            if (((qqq0071q00710071 + i2) * i2) % q0071q0071q00710071 != q00710071qq00710071) {
                try {
                    qq0071qq00710071 = ((Integer) Class.forName(qqqqbbb.q0071q00710071q0071("\u001dVDk{9vqR \u001b\u0006ACd8nzwT~C\u0016\u0018\u0012|U\u0015\u000f6o?\u001e<Vi\u0001&04-;S\u0013d\u0006|BV|", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014576), (char) (qbbqqbb.qqq007100710071q() ^ (-321957265)))).getMethod(qqqqbbb.q0071q00710071q0071("67vw\u007fzz{\u0004~@\u007f\u0001\t\u0004\u0004\u0005\r\b", (char) ((-1208710780) ^ qbqqqbb.qq00710071q0071q()), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710752))), null).invoke(null, null)).intValue();
                    q00710071qq00710071 = 55;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                } catch (Exception e3) {
                    throw e3;
                }
            }
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new qqbqqqq(inputStream, cipher);
        } catch (Exception e4) {
            throw new IOException(e4.getMessage());
        }
    }

    public static int q007100710071q00710071() {
        return 1;
    }

    public static int qq00710071q00710071() {
        return 31;
    }
}
