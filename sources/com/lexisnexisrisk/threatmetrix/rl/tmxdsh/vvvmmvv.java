package com.lexisnexisrisk.threatmetrix.rl.tmxdsh;

import YU.a;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public class vvvmmvv {
    public static int i00690069ii0069i = 51;
    public static int i0069i0069i0069i = 0;
    public static int i0069iii0069i = 1;
    public static int ii0069ii0069i = 2;
    private static final char[] ww0077w0077w0077;

    static {
        int i = i00690069ii0069i;
        if (((i0069iii0069i + i) * i) % ii0069ii0069i != 0) {
            try {
                i00690069ii0069i = ((Integer) Class.forName(vvvmmvm.n006E006En006Enn("\u0012\u001f\u001e_\u001f\u0019-\u001f*&\u001e2$//'2+n6+6*';5.>=5E{A<~F@L9I?\u0006OPQIJTU", (char) (vmmmvvm.hh0068h006800680068() ^ 263258422), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587848)))).getMethod(vvvmmvm.n006En006E006Enn("KJIHG\r\f\u0011\u0013B", (char) (vmmmvvm.hh0068h006800680068() ^ 263258571), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843231)), (char) (vmmmvvm.hh0068h006800680068() ^ 263258528)), null).invoke(null, null)).intValue();
                i0069i0069i0069i = 37;
            } catch (InvocationTargetException e) {
                throw e.getCause();
            }
        }
        ww0077w0077w0077 = vvvmmvm.n006En006E006Enn("=vN\bc\u001dt.\nAB}W\u000fh$", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587981)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496191)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496242))).toCharArray();
        int i2 = i00690069ii0069i;
        try {
            if (((i0069iii0069i + i2) * i2) % ii0069ii0069i != ((Integer) Class.forName(vvvmmvm.n006En006E006Enn("\u007fd-W\u00037}y]\u001a\u0010i\u000b>4Gy\u0005\fw(\u0001d_]/\u0002Y({m\u007f!\u0015\r\u0013!KUWM0Nkx~f:\u0007", (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843235)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587838)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496243)))).getMethod(vvvmmvm.n006E006En006Enn("\u0017k7l:\u000b0f\u0006LJ56", (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843072)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496246))), null).invoke(null, null)).intValue()) {
                i00690069ii0069i = 81;
                i0069i0069i0069i = 92;
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static int b006200620062b0062b(char c) throws Throwable {
        if ('0' <= c && c <= '9') {
            return c - '0';
        }
        if ('A' <= c && c <= 'F') {
            return c - '7';
        }
        if ('a' > c || c > 'f') {
            return -1;
        }
        int i = i00690069ii0069i;
        int i2 = i0069iii0069i;
        int i3 = ii0069ii0069i;
        int i4 = ((i + i2) * i) % i3;
        int i5 = i0069i0069i0069i;
        if (i4 != i5) {
            if (a.z(i, i2, i, i3) != i5) {
                i00690069ii0069i = 51;
                try {
                    i0069i0069i0069i = ((Integer) Class.forName(vvvmmvm.n006E006En006Enn("~\f\u000bL\f\u0006\u001a\f\u0017\u0013\u000b\u001f\u0011\u001c\u001c\u0014\u001f\u0018[#\u0018#\u0017\u0014(\"\u001b+*\"2h.)k3-9&6,r<=>67AB", (char) (vmmmvvm.hh0068h006800680068() ^ 263258605), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587848)))).getMethod(vvvmmvm.n006E006En006Enn("dcba`&%*,[", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587885)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843032))), null).invoke(null, null)).intValue();
                } catch (InvocationTargetException e) {
                    throw e.getCause();
                }
            }
            i00690069ii0069i = 67;
            try {
                i0069i0069i0069i = ((Integer) Class.forName(vvvmmvm.n006E006En006Enn("_lk-lfzlwsk\u007fq||t\u007fx<\u0004x\u0004wt\t\u0003{\f\u000b\u0003\u0013I\u000f\nL\u0014\u000e\u001a\u0007\u0017\rS\u001d\u001e\u001f\u0017\u0018\"#", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587882)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843025)))).getMethod(vvvmmvm.n006En006E006Enn("\b&Db\u0001e\u0004(E\u0014", (char) (vmmmvvm.hh0068h006800680068() ^ 263258432), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496213)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587843))), null).invoke(null, null)).intValue();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return c - 'W';
    }

    public static String bb00620062b0062b(byte[] bArr) throws Throwable {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            byte b = bArr[i];
            char[] cArr = ww0077w0077w0077;
            sb.append(cArr[(b >> 4) & 15]);
            int i2 = b & 15;
            int i3 = i00690069ii0069i;
            try {
                try {
                    if (((((Integer) Class.forName(vvvmmvm.n006E006En006Enn("I&u\u0012@t\u0018@s^SHn\u0003]:\u0018}\b2oE\u0012\nv?\u0019s6=b<'=e`y+u\u0015\u0010{ptU:\u0002Eq", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496019)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496246)))).getMethod(vvvmmvm.n006E006En006Enn("=<\u0002\u0001\u0006\b}|\u0002\u00043xw|~.", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496100)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587841))), null).invoke(null, null)).intValue() + i3) * i3) % ((Integer) Class.forName(vvvmmvm.n006E006En006Enn(",98y93G9D@8L>IIALE\tPEPDAUOHXWO_\u0016[V\u0019`ZfScY ijkcdno", (char) (vmmmvvm.hh0068h006800680068() ^ 263258500), (char) (vmmmvvm.hh0068h006800680068() ^ 263258535))).getMethod(vvvmmvm.n006E006En006Enn("u=>EIABIMEFMQ\u0003JKRV\b", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587847)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496242))), null).invoke(null, null)).intValue() != 0) {
                        i00690069ii0069i = 51;
                        try {
                            i0069i0069i0069i = ((Integer) Class.forName(vvvmmvm.n006E006En006Enn("ALI\tF>P@IC9K;DB8A8y?2;-(:2)74*8l0)i/'1\u001c*\u001eb*)(\u001e\u001d%$", (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843012)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843027)))).getMethod(vvvmmvm.n006E006En006Enn("\u0014n:\u0019~w*6\u000e\u0001", (char) (vmmmvvm.hh0068h006800680068() ^ 263258506), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843026))), null).invoke(null, null)).intValue();
                        } catch (InvocationTargetException e) {
                            throw e.getCause();
                        }
                    }
                    sb.append(cArr[i2]);
                    i++;
                    int i4 = i00690069ii0069i;
                    if (((i0069iii0069i + i4) * i4) % ii0069ii0069i != i0069i0069i0069i) {
                        try {
                            i00690069ii0069i = ((Integer) Class.forName(vvvmmvm.n006E006En006Enn("(30o-%7'0* 2\"+)\u001f(\u001f`&\u0019\"\u0014\u000f!\u0019\u0010\u001e\u001b\u0011\u001fS\u0017\u0010P\u0016\u000e\u0018\u0003\u0011\u0005I\u0011\u0010\u000f\u0005\u0004\f\u000b", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496077)), (char) (vmmmvvm.hh0068h006800680068() ^ 263258529))).getMethod(vvvmmvm.n006E006En006Enn("\u0003\u0002\u0001\u007f~DCHJy", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036588002)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496244))), null).invoke(null, null)).intValue();
                            i0069i0069i0069i = 67;
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
        return sb.toString();
    }

    public static byte[] bbbb00620062b(String str) throws Throwable {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            char cCharAt = str.charAt(i);
            Class<?> cls = Class.forName(vvvmmvm.n006E006En006Enn("t\u007f\u0001@\u0002y\u0010\u007f\r\u0007\u0001\u0013\u0007\u0010\u0012\btk1vmvlg}up~\u007fu\b<$\u001da'#-\u001c*\"f214*-5\u0018", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587823)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496241))));
            String strN006En006E006Enn = vvvmmvm.n006En006E006Enn("\u0010A\u0006N\u000f3w@\u0001e*r3\n\u001c^)\t\u007f", (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843199)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587901)), (char) (vmmmvvm.hh0068h006800680068() ^ 263258535));
            Class cls2 = Character.TYPE;
            try {
                int iIntValue = ((Integer) cls.getDeclaredMethod(strN006En006E006Enn, cls2).invoke(null, Character.valueOf(cCharAt))).intValue();
                try {
                    int iIntValue2 = ((Integer) Class.forName(vvvmmvm.n006E006En006Enn("3\u0010,\bV\u001b\u0016F.()R\u0015\u001d\f\u001cqS}Hy+\u0004{|U+aQ\u0016\r\u001c@\u0014ttS>1.#@bD\u0002`k%\u0017", (char) (vmmmvvm.hh0068h006800680068() ^ 263258478), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843026)))).getDeclaredMethod(vvvmmvm.n006E006En006Enn("[*+2/./6323:7h78?<m", (char) (vmmmvvm.hh0068h006800680068() ^ 263258584), (char) (vmmmvvm.hh0068h006800680068() ^ 263258537)), cls2).invoke(null, Character.valueOf(str.charAt(i + 1)))).intValue();
                    int i2 = i / 2;
                    int i3 = iIntValue * 16;
                    try {
                        int iIntValue3 = ((Integer) Class.forName(vvvmmvm.n006En006E006Enn("\u0015 \u001d\\\u001a\u0012$\u0014\u001d\u0017\r\u001f\u000f\u0018\u0016\f\u0015\fM\u0013\u0006\u000f\u0001{\u000e\u0006|\u000b\b}\f@\u0004|=\u0003z\u0005o}q6}|{qpxw", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587987)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496179)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496247)))).getMethod(vvvmmvm.n006En006E006Enn("Ft]Ek#\u000bw#C", (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843087)), (char) (vmmmvvm.hh0068h006800680068() ^ 263258615), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587848))), null).invoke(null, null)).intValue();
                        int i4 = i0069iii0069i;
                        int i5 = (iIntValue3 + i4) * iIntValue3;
                        int i6 = i00690069ii0069i;
                        try {
                            if (((i4 + i6) * i6) % ii0069ii0069i != ((Integer) Class.forName(vvvmmvm.n006En006E006Enn("\"?uk\u0013bb\u0011\u007f\u0010yH=Rg{\u0019\u0016Kdm\u0003Ro\u001dA\u0005P;\u000eZOz{N\u0001{\u0016Mx\u0019(\u0013\f(D\u0011+g", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036588030)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587798)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587846)))).getMethod(vvvmmvm.n006E006En006Enn("/0-tqxx*}~\u0002\u00063", (char) (vmmmvvm.hh0068h006800680068() ^ 263258393), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587847))), null).invoke(null, null)).intValue()) {
                                try {
                                    i00690069ii0069i = ((Integer) Class.forName(vvvmmvm.n006E006En006Enn("\u001cWClz8wpQ!\u001a\u0007BBe7m{vU\u007fB\u0017\u0017\u0011}T\u0014\u00105p@\u001d=Wh\u007f'41\"\u007f\u001b\u0019w\u0003wHZ", (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843249)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587849)))).getMethod(vvvmmvm.n006En006E006Enn("/& \u0016\bD>:?e", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496205)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496144)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496245))), null).invoke(null, null)).intValue();
                                    i0069iii0069i = 25;
                                } catch (InvocationTargetException e) {
                                    throw e.getCause();
                                }
                            }
                            if (i5 % ii0069ii0069i != 0) {
                                i0069iii0069i = 93;
                            }
                            bArr[i2] = (byte) (i3 + iIntValue2);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
        return bArr;
    }

    public static int i006900690069i0069i() {
        return 2;
    }

    public static int ii00690069i0069i() {
        return 1;
    }

    public static int iii0069i0069i() {
        return 0;
    }

    public static int iiiii0069i() {
        return 61;
    }
}
