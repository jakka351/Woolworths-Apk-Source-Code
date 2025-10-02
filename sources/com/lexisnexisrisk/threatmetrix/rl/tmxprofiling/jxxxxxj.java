package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.annotation.Nonnull;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public class jxxxxxj {
    public static final short i0069006900690069i0069 = 9;
    public static final int i006900690069ii0069 = 20;
    public static final short i00690069i0069i0069 = 3;
    public static final short i0069i00690069i0069 = 6;
    public static final int i0069i0069ii0069 = 1024;
    public static final short i0069ii0069i0069 = 4;
    public static final short i0069iii00690069 = 21;
    public static final short ii006900690069i0069 = 8;
    public static final int ii00690069ii0069 = 20;
    private static final String ii0069i0069i0069 = lqlqqll.u00750075u00750075u(jxxxxxj.class);
    public static final short ii0069ii00690069 = 25;
    public static final short iii00690069i0069 = 272;
    public static final int iii0069ii0069 = 554869826;
    public static final int iiii0069i0069 = 12;
    public static final short iiiii00690069 = 20;
    private String i006900690069i00690069;
    private String i00690069ii00690069;
    private String i0069i0069i00690069;
    private String i0069ii006900690069;
    private String ii00690069i00690069;
    private int iii0069i00690069;
    private String iiii006900690069;
    public TMXProfilingConnectionsInterface ii0069i006900690069 = null;
    private SecureRandom i00690069i006900690069 = new SecureRandom();

    public class jjjjjjx implements TMXProfilingConnectionsInterface.TMXCallback {
        public jjjjjjx() {
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface.TMXCallback
        public boolean onComplete(@NonNull TMXProfilingConnectionsInterface.TMXHttpResponseCode tMXHttpResponseCode, @Nullable InputStream inputStream) {
            try {
                if (tMXHttpResponseCode.getHttpResponseCode() == -20 && inputStream != null) {
                    byte[] bArr = new byte[1024];
                    int iW00770077ww007700770077 = jxxxxxj.this.w00770077ww007700770077(inputStream, bArr, 1024);
                    if (iW00770077ww007700770077 >= 20 && w00770077007700770077w0077(bArr)) {
                        jxxxxxj jxxxxxjVar = jxxxxxj.this;
                        byte[] bArrWw007700770077w00770077 = jxxxxxjVar.ww007700770077w00770077(jxxxxxjVar.i0069i0069i00690069, jxxxxxj.this.ii00690069i00690069, jxxxxxj.this.i006900690069i00690069, jxxxxxj.this.iiii006900690069, jxxxxxj.this.i0069ii006900690069);
                        if (bArrWw007700770077w00770077 != null && bArrWw007700770077w00770077.length != 0) {
                            jxxxxxj jxxxxxjVar2 = jxxxxxj.this;
                            jxxxxxjVar2.ii0069i006900690069.sendSocketRequest(jxxxxxjVar2.i00690069ii00690069, jxxxxxj.this.iii0069i00690069, bArrWw007700770077w00770077, true, null);
                            lqlqqll.llqqqll.yy00790079007900790079(jxxxxxj.ii0069i0069i0069, "Success. End TURN Request");
                            return true;
                        }
                        lqlqqll.llqqqll.yy00790079007900790079(jxxxxxj.ii0069i0069i0069, "Zero length Auth packet. End TURN Request");
                        jxxxxxj jxxxxxjVar3 = jxxxxxj.this;
                        jxxxxxjVar3.ii0069i006900690069.closeSocket(jxxxxxjVar3.i00690069ii00690069, jxxxxxj.this.iii0069i00690069);
                        return false;
                    }
                    lqlqqll.llqqqll.yy00790079007900790079(jxxxxxj.ii0069i0069i0069, "Read length less then StunHeader: " + iW00770077ww007700770077 + " or parseUnAuthResponse failed. End TURN Request");
                    jxxxxxj jxxxxxjVar4 = jxxxxxj.this;
                    jxxxxxjVar4.ii0069i006900690069.closeSocket(jxxxxxjVar4.i00690069ii00690069, jxxxxxj.this.iii0069i00690069);
                    return false;
                }
                lqlqqll.llqqqll.yy00790079007900790079(jxxxxxj.ii0069i0069i0069, "Response Error " + tMXHttpResponseCode + " or empty socket input stream. End TURN Request");
                jxxxxxj jxxxxxjVar5 = jxxxxxj.this;
                jxxxxxjVar5.ii0069i006900690069.closeSocket(jxxxxxjVar5.i00690069ii00690069, jxxxxxj.this.iii0069i00690069);
                return false;
            } catch (IOException e) {
                lqlqqll.llqqqll.yy00790079007900790079(jxxxxxj.ii0069i0069i0069, "Failed TMXCallbackTurnUnAuth with exception" + e);
                return true;
            }
        }

        public boolean w00770077007700770077w0077(@Nonnull byte[] bArr) {
            byte[] bArrW0077w00770077w00770077;
            if (jxxxxxj.this.wwwww007700770077(bArr) != 275 || (bArrW0077w00770077w00770077 = jxxxxxj.this.w0077w00770077w00770077(bArr, (short) 9)) == null || bArrW0077w00770077w00770077.length == 0 || !new String(bArrW0077w00770077w00770077).regionMatches(true, 4, "Unauthorized", 0, 12)) {
                return false;
            }
            byte[] bArrW0077w00770077w007700772 = jxxxxxj.this.w0077w00770077w00770077(bArr, (short) 20);
            if (bArrW0077w00770077w007700772 != null && bArrW0077w00770077w007700772.length != 0) {
                jxxxxxj.this.iiii006900690069 = new String(bArrW0077w00770077w007700772);
            }
            byte[] bArrW0077w00770077w007700773 = jxxxxxj.this.w0077w00770077w00770077(bArr, (short) 21);
            if (bArrW0077w00770077w007700773 != null && bArrW0077w00770077w007700773.length != 0) {
                jxxxxxj.this.i0069ii006900690069 = new String(bArrW0077w00770077w007700773);
            }
            return llqllqq.g006700670067006700670067g(jxxxxxj.this.iiii006900690069) && llqllqq.g006700670067006700670067g(jxxxxxj.this.i0069ii006900690069);
        }
    }

    public void doTurnConnection(@Nonnull TMXProfilingConnectionsInterface tMXProfilingConnectionsInterface, @Nonnull String str, int i, @Nonnull String str2, @Nonnull String str3, @Nonnull String str4) {
        if (llqllqq.ggggggg0067(str) || llqllqq.ggggggg0067(str2) || llqllqq.ggggggg0067(str3) || llqllqq.ggggggg0067(str4) || tMXProfilingConnectionsInterface == null) {
            lqlqqll.llqqqll.yy00790079007900790079(ii0069i0069i0069, "Invalid Parameters for TURN Request");
            return;
        }
        String str5 = ii0069i0069i0069;
        lqlqqll.llqqqll.yy00790079007900790079(str5, "Starting TURN Request");
        this.ii0069i006900690069 = tMXProfilingConnectionsInterface;
        this.i00690069ii00690069 = str;
        this.iii0069i00690069 = i;
        this.i0069i0069i00690069 = str2;
        this.ii00690069i00690069 = str3;
        this.i006900690069i00690069 = str4;
        byte[] bArrW0077www007700770077 = w0077www007700770077();
        if (bArrW0077www007700770077 == null || bArrW0077www007700770077.length == 0) {
            lqlqqll.llqqqll.yy00790079007900790079(str5, "getUnauthorizedPacketInBuffer returned empty buffer. End Turn Request");
        } else {
            this.ii0069i006900690069.sendSocketRequest(this.i00690069ii00690069, this.iii0069i00690069, bArrW0077www007700770077, false, new jjjjjjx());
        }
    }

    public short w0077007700770077w00770077(@Nonnull byte[] bArr) {
        if (bArr.length < 20) {
            return (short) -1;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.put(bArr, 2, 2);
        byteBufferAllocate.rewind();
        return byteBufferAllocate.getShort();
    }

    public boolean w00770077w0077w00770077(@Nonnull byte[] bArr, @Nonnull byte[] bArr2) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        short sW0077007700770077w00770077 = w0077007700770077w00770077(bArr);
        int i = sW0077007700770077w00770077 + 20;
        if (!ww0077w0077w00770077(bArr, (short) 8, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0})) {
            return false;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "HmacSHA1");
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(secretKeySpec);
        mac.update(bArr, 0, i);
        System.arraycopy(mac.doFinal(), 0, bArr, sW0077007700770077w00770077 + 24, 20);
        return true;
    }

    public int w00770077ww007700770077(@Nonnull InputStream inputStream, @Nonnull byte[] bArr, int i) throws IOException {
        int i2 = inputStream.read(bArr, 0, i);
        if (i2 != 0) {
            return i2;
        }
        lqlqqll.llqqqll.yy00790079007900790079(ii0069i0069i0069, "Failed to read bytes");
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final byte[] w0077w00770077w00770077(@Nonnull byte[] bArr, short s) {
        short sW0077007700770077w00770077 = w0077007700770077w00770077(bArr);
        if (sW0077007700770077w00770077 == -1) {
            return null;
        }
        short s2 = 0;
        while (s2 < sW0077007700770077w00770077) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
            short s3 = (short) (s2 + 1);
            short s4 = (short) (s3 + 1);
            byteBufferAllocate.put(new byte[]{bArr[s2 + 20], bArr[s3 + 20]});
            byteBufferAllocate.rewind();
            short s5 = byteBufferAllocate.getShort();
            byteBufferAllocate.rewind();
            short s6 = (short) (s4 + 1);
            short s7 = (short) (s6 + 1);
            byteBufferAllocate.put(new byte[]{bArr[s4 + 20], bArr[s6 + 20]});
            byteBufferAllocate.rewind();
            int i = byteBufferAllocate.getShort();
            short sWw0077ww007700770077 = ww0077ww007700770077(i);
            if (s5 == s) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, s7 + 20, bArr2, 0, i);
                return bArr2;
            }
            if (8 == s) {
                return null;
            }
            s2 = (short) (s7 + sWw0077ww007700770077);
        }
        return null;
    }

    public boolean w0077w0077w007700770077(@Nonnull byte[] bArr, short s) {
        if (bArr.length < 20) {
            return false;
        }
        byte[] bArrArray = ByteBuffer.allocate(2).putShort(s).array();
        bArr[2] = bArrArray[0];
        bArr[3] = bArrArray[1];
        return true;
    }

    public byte[] w0077www007700770077() {
        byte[] bArr = new byte[1024];
        if (!www0077w007700770077(bArr, (short) 3)) {
            return null;
        }
        www00770077w00770077(bArr);
        short sW0077007700770077w00770077 = w0077007700770077w00770077(bArr);
        if (-1 == sW0077007700770077w00770077) {
            return null;
        }
        return Arrays.copyOfRange(bArr, 0, sW0077007700770077w00770077 + 20);
    }

    public byte[] ww007700770077w00770077(@Nonnull String str, @Nonnull String str2, String str3, @Nonnull String str4, @Nonnull String str5) {
        try {
            byte[] bArr = new byte[1024];
            if (www0077w007700770077(bArr, (short) 3)) {
                www00770077w00770077(bArr);
                String str6 = "1:" + str + ":" + str2;
                if (str3.length() > 0) {
                    str6 = str6 + ";" + str3;
                }
                Charset charset = StandardCharsets.UTF_8;
                ww0077w0077w00770077(bArr, (short) 6, str6.getBytes(charset));
                ww0077w0077w00770077(bArr, (short) 20, str4.getBytes(charset));
                ww0077w0077w00770077(bArr, (short) 21, str5.getBytes(charset));
                byte[] bArrG00670067gggg0067 = llqllqq.g00670067gggg0067(str6 + ":" + str4 + ":" + str2);
                if (bArrG00670067gggg0067 != null && bArrG00670067gggg0067.length != 0) {
                    w00770077w0077w00770077(bArr, bArrG00670067gggg0067);
                    short sW0077007700770077w00770077 = w0077007700770077w00770077(bArr);
                    if (-1 == sW0077007700770077w00770077) {
                        return null;
                    }
                    return Arrays.copyOfRange(bArr, 0, sW0077007700770077w00770077 + 20);
                }
            }
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
        }
        return null;
    }

    public boolean ww0077w0077w00770077(@Nonnull byte[] bArr, short s, @Nonnull byte[] bArr2) {
        short sW0077007700770077w00770077;
        if (bArr.length < 20 || -1 == (sW0077007700770077w00770077 = w0077007700770077w00770077(bArr))) {
            return false;
        }
        short sWw0077ww007700770077 = (short) (sW0077007700770077w00770077 + 4 + ww0077ww007700770077((short) bArr2.length));
        if (sWw0077ww007700770077 < sW0077007700770077w00770077 || bArr.length - 20 < sWw0077ww007700770077) {
            return false;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byte[] bArrArray = byteBufferAllocate.putShort(s).array();
        bArr[sW0077007700770077w00770077 + 20] = bArrArray[0];
        bArr[sW0077007700770077w00770077 + 21] = bArrArray[1];
        byteBufferAllocate.rewind();
        byte[] bArrArray2 = byteBufferAllocate.putShort((short) bArr2.length).array();
        bArr[sW0077007700770077w00770077 + 22] = bArrArray2[0];
        bArr[sW0077007700770077w00770077 + 23] = bArrArray2[1];
        System.arraycopy(bArr2, 0, bArr, sW0077007700770077w00770077 + 24, bArr2.length);
        return w0077w0077w007700770077(bArr, sWw0077ww007700770077);
    }

    public short ww0077ww007700770077(short s) {
        return (short) ((s + 3) & (-4));
    }

    public boolean www00770077w00770077(@Nonnull byte[] bArr) {
        return bArr.length >= 20 && ww0077w0077w00770077(bArr, (short) 25, new byte[]{17, 0, 0, 0});
    }

    public boolean www0077w007700770077(@Nonnull byte[] bArr, short s) {
        if (bArr.length < 20) {
            return false;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byte[] bArrArray = byteBufferAllocate.putShort(s).array();
        bArr[0] = bArrArray[0];
        bArr[1] = bArrArray[1];
        byteBufferAllocate.rewind();
        byte[] bArrArray2 = byteBufferAllocate.putShort((short) 0).array();
        bArr[2] = bArrArray2[0];
        bArr[3] = bArrArray2[1];
        byte[] bArrArray3 = ByteBuffer.allocate(4).putInt(iii0069ii0069).array();
        byte b = bArrArray3[0];
        bArr[4] = b;
        byte b2 = bArrArray3[1];
        bArr[5] = b2;
        bArr[6] = b;
        bArr[7] = b2;
        byte[] bArr2 = new byte[12];
        this.i00690069i006900690069.nextBytes(bArr2);
        System.arraycopy(bArr2, 0, bArr, 8, 12);
        return true;
    }

    public short wwwww007700770077(@Nonnull byte[] bArr) {
        if (bArr.length < 20) {
            return (short) -1;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.put(bArr, 0, 2);
        byteBufferAllocate.rewind();
        return byteBufferAllocate.getShort();
    }
}
