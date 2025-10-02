package com.lexisnexisrisk.threatmetrix.rl.tmxdsh;

import YU.a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public class vmvvvvv {
    public static int n006E006Enn006En = 2;
    public static int n006Ennn006En = 0;
    public static int nn006Enn006En = 1;
    public static int nnnnn006En = 50;

    public static int n006En006En006En() {
        return 2;
    }

    public static int nnn006En006En() {
        return 36;
    }

    public static byte[] p0070p00700070p0070(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, vvvmmvm.n006E006En006Enn("hm|", (char) (vmmmvvm.hh0068h006800680068() ^ 263258412), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587843))));
        int iHhhh006800680068 = vvmmvvm.hhhh006800680068();
        int i = nnnnn006En;
        if (((nn006Enn006En + i) * i) % n006E006Enn006En != 0) {
            try {
                try {
                    nnnnn006En = ((Integer) Class.forName(vvvmmvm.n006E006En006Enn("MZY\u001bZThZeaYm_jjbmf*qfqebvpiyxp\u00017|w:\u0002{\bt\u0005zA\u000b\u0003\r\u000e\u000f\u0010\u0011", (char) (vmmmvvm.hh0068h006800680068() ^ 263258569), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843036)))).getMethod(vvvmmvm.n006En006E006Enn("\u000b$=\u0018g\u0007/o\u0003\u001c9\"\\", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496150)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843068)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843025))), null).invoke(null, null)).intValue();
                    try {
                        n006Ennn006En = ((Integer) Class.forName(vvvmmvm.n006En006E006Enn("\u0001jB\\tG4~#wL9\u0004g@\u00115\u0007#G\u0015xE\u001bH\u001blU1\u0002jyX,Gg:#hQ`\u007f\"rU/\rf\u0001", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496024)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587941)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496245)))).getMethod(vvvmmvm.n006En006E006Enn("I\"w\u00142\u0012uxH#~(.", (char) (vmmmvvm.hh0068h006800680068() ^ 263258618), (char) (263258569 ^ vmmmvvm.hh0068h006800680068()), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587848))), null).invoke(null, null)).intValue();
                    } catch (InvocationTargetException e) {
                        throw e.getCause();
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (Exception e3) {
                throw e3;
            }
        }
        Cipher cipher = Cipher.getInstance(vvvmmvm.n006E006En006Enn("E\u001c:4v0\u0003e/\\P\u0005\u001b>-T'\u001cgF", (char) (iHhhh006800680068 ^ (-1058496243)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496246))));
        int i2 = nnnnn006En;
        try {
            if (((nn006Enn006En + i2) * i2) % ((Integer) Class.forName(vvvmmvm.n006E006En006Enn("\u000b\u0018\u0017X\u0018\u0012&\u0018#\u001f\u0017+\u001d(( +$g/$/# 4.'76.>t:5w?9E2B8~H@JKLMN", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587981)), (char) ((-1872843025) ^ vvvvmvm.h00680068h006800680068()))).getMethod(vvvmmvm.n006E006En006Enn("r\u0007\u0017;x\\of\u0015V{a\u0016$\u0011^", (char) (vmmmvvm.hh0068h006800680068() ^ 263258532), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587844))), null).invoke(null, null)).intValue() != 0) {
                try {
                    nnnnn006En = ((Integer) Class.forName(vvvmmvm.n006E006En006Enn("4A@\u0002A;OALH@TFQQI4-p8-8,)=70@?7G}c^!hbn[ka(qistuvW", (char) (vmmmvvm.hh0068h006800680068() ^ 263258608), (char) ((-1058496243) ^ vvmmvvm.hhhh006800680068()))).getMethod(vvvmmvm.n006E006En006Enn("%$#cbgu\u001e^]bp\u0019", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587913)), (char) (vmmmvvm.hh0068h006800680068() ^ 263258529)), null).invoke(null, null)).intValue();
                    n006Ennn006En = 70;
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            }
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    public static InputStream pp007000700070p0070(InputStream inputStream, byte[] bArr, byte[] bArr2) throws Throwable {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            int i = nnnnn006En;
            int i2 = nn006Enn006En;
            int i3 = n006E006Enn006En;
            int i4 = ((i + i2) * i) % i3;
            int i5 = n006Ennn006En;
            if (i4 != i5) {
                if (a.z(i, i2, i, i3) != i5) {
                    nnnnn006En = 63;
                    try {
                        n006Ennn006En = ((Integer) Class.forName(vvvmmvm.n006E006En006Enn("8C@\u007f=5G7@:0B2;9/8/p6)2$\u001f1) .+!/c' `&\u001e(\u0013!\u0015Y!\u0017\u001f\u001e\u001d\u001c\u001b", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587884)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496248)))).getMethod(vvvmmvm.n006E006En006Enn("U(\u0004#\u0001BkB1#\u0011wr", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496145)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843026))), null).invoke(null, null)).intValue();
                    } catch (InvocationTargetException e) {
                        throw e.getCause();
                    }
                }
                nnnnn006En = 12;
                n006Ennn006En = 54;
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, vvvmmvm.n006E006En006Enn("\u0016\u0019&", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587884)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496248))));
            Cipher cipher = Cipher.getInstance(vvvmmvm.n006E006En006Enn("(~h\"\u0014Ni\u0003Q>\u001e\u00069`S.\nzU4", (char) (vmmmvvm.hh0068h006800680068() ^ 263258566), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496246))));
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new vvmvvvv(inputStream, cipher);
        } catch (Exception e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public static byte[] ppp00700070p0070(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Throwable {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        int i = nnnnn006En;
        if (((nn006Enn006En + i) * i) % n006E006Enn006En != n006Ennn006En) {
            nnnnn006En = 66;
            n006Ennn006En = 28;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, vvvmmvm.n006E006En006Enn("+0?", (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843132)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843036))));
        Cipher cipher = Cipher.getInstance(vvvmmvm.n006En006E006Enn("]z\"\u0017z\u0013-0#7F0#U\u007f\\k\nhx", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496150)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587882)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843025))));
        int i2 = nnnnn006En;
        try {
            if (((nn006Enn006En + i2) * i2) % ((Integer) Class.forName(vvvmmvm.n006E006En006Enn("+87x82F8C?7K=HH@KD\bODOC@TNGWVN^\u0015ZU\u0018_YeRbX\u001fh`jklmn", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587779)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496245)))).getMethod(vvvmmvm.n006E006En006Enn(".nmr\u0001)ihm{$dchv\u001f", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496032)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843032))), null).invoke(null, null)).intValue() != 0) {
                try {
                    nnnnn006En = ((Integer) Class.forName(vvvmmvm.n006En006E006Enn("\u001b@T*~\u000e6=]mz'.Nbo\u0010\u001duQ[{\b\u001aCQ_\u0004\u0018%I\u0015o\u0003Z6Efg\r\u0018rQa\u0001\u0017,BX", (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843222)), (char) (vmmmvvm.hh0068h006800680068() ^ 263258440), (char) (vmmmvvm.hh0068h006800680068() ^ 263258530))).getMethod(vvvmmvm.n006En006E006Enn(">82\u000e\b(1t0*IR\u0016", (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843102)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496114)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587848))), null).invoke(null, null)).intValue();
                    try {
                        n006Ennn006En = ((Integer) Class.forName(vvvmmvm.n006E006En006Enn("dol,iasclf\\n^ge[d[\u001dbU^PK]ULZWM[\u0010SL\rRJT?MA\u0006MCKJIHG", (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843065)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843032)))).getMethod(vvvmmvm.n006E006En006Enn("kji*).<d%$)7_", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587905)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587841))), null).invoke(null, null)).intValue();
                    } catch (InvocationTargetException e) {
                        throw e.getCause();
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
