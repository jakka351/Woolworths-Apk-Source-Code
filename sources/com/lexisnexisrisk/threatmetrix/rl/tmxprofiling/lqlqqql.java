package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.util.Base64;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.UUID;
import java.util.zip.CRC32;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public class lqlqqql {
    private static final int c00630063006300630063c = 36;
    private static final int c0063c006300630063c = 16;
    public static final String c0063cccc0063 = "AES/CTR/NoPadding";
    private static final int cc0063006300630063c = 16;
    private static final String ccc006300630063c = lqlqqll.u00750075u00750075u(lqlqqql.class);
    public static final String cccccc0063 = "AES/CTR/PKCS5Padding";

    private lqlqqql() {
    }

    public static byte[] j006A006A006A006Aj006A(byte[] bArr, String str, String str2) throws IOException, IllegalArgumentException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        Charset charset = StandardCharsets.UTF_8;
        byteBufferAllocate.putInt(jjjjj006A006A(bArr, str2.getBytes(charset)));
        byteBufferAllocate.putInt(jjjjj006A006A(bArr, str.getBytes(charset)));
        byteBufferAllocate.putInt(jjjjj006A006A(str2.getBytes(charset), bArr));
        byteBufferAllocate.putInt(jjjjj006A006A(str.getBytes(charset), bArr));
        return byteBufferAllocate.array();
    }

    @Nullable
    public static byte[] j006A006A006Ajj006A(@Nullable byte[] bArr, @Nullable byte[] bArr2, @Nullable byte[] bArr3, @Nullable String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (bArr != null && bArr2 != null && bArr3 != null && str != null && (str.equals(cccccc0063) || str.equals(c0063cccc0063))) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
                Cipher cipher = Cipher.getInstance(str);
                cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
                return cipher.doFinal(bArr);
            } catch (IllegalArgumentException | IllegalStateException | UnsupportedOperationException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                lqlqqll.llqqqll.u007500750075uuu(ccc006300630063c, "Obfuscation Error", e);
            }
        }
        return null;
    }

    @Nullable
    public static String j006A006Aj006Aj006A(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return jjj006A006Aj006A(str, str2, UUID.randomUUID().toString(), str3);
    }

    @Nullable
    public static String j006Aj006A006Aj006A(@Nullable String str, @Nullable String str2) {
        return jj006A006A006Aj006A(str, str2, UUID.randomUUID().toString());
    }

    public static boolean j006Ajj006Aj006A(@Nonnull byte[] bArr, int i, @Nonnull ByteBuffer byteBuffer, @Nonnull ByteBuffer byteBuffer2) {
        boolean z;
        if (bArr != null && bArr.length >= i) {
            int length = i * 2;
            try {
                if (bArr.length < length) {
                    length = (bArr.length - i) * 2;
                    z = true;
                } else {
                    z = false;
                }
                int i2 = 0;
                while (i2 < length) {
                    byteBuffer.put(bArr[i2]);
                    byteBuffer2.put(bArr[i2 + 1]);
                    i2 += 2;
                }
                while (i2 < bArr.length) {
                    if (z) {
                        byteBuffer2.put(bArr[i2]);
                    } else {
                        byteBuffer.put(bArr[i2]);
                    }
                    i2++;
                }
                return true;
            } catch (BufferOverflowException e) {
                e = e;
                lqlqqll.uu0075007500750075u(ccc006300630063c, "parse error - continue ", e.toString());
                return false;
            } catch (ReadOnlyBufferException e2) {
                e = e2;
                lqlqqll.uu0075007500750075u(ccc006300630063c, "parse error - continue ", e.toString());
                return false;
            }
        }
        return false;
    }

    public static byte[] j006Ajjj006A006A(@Nonnull byte[] bArr, @Nonnull byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        boolean z = length >= length2;
        int i = z ? length2 * 2 : length * 2;
        int i2 = z ? length : length2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + length2);
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4 += 2) {
            byteBufferAllocate.put(bArr[i3]);
            byteBufferAllocate.put(bArr2[i3]);
            i3++;
        }
        while (i3 < i2) {
            byteBufferAllocate.put(z ? bArr[i3] : bArr2[i3]);
            i3++;
        }
        return byteBufferAllocate.array();
    }

    @Nullable
    public static String jj006A006A006Aj006A(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return jjj006A006Aj006A(str, str2, str3, c0063cccc0063);
    }

    @Nullable
    public static byte[] jj006A006Ajj006A(@Nullable byte[] bArr, @Nullable byte[] bArr2, @Nullable byte[] bArr3, @Nullable String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (bArr != null && bArr2 != null && bArr3 != null && str != null && (str.equals(cccccc0063) || str.equals(c0063cccc0063))) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
                Cipher cipher = Cipher.getInstance(str);
                cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
                return cipher.doFinal(bArr);
            } catch (IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                lqlqqll.u0075uu00750075u(ccc006300630063c, "decrypt error: ", e);
            }
        }
        return null;
    }

    @Nullable
    public static String jj006Aj006Aj006A(@Nullable byte[] bArr, @Nullable String str, @Nullable String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (bArr != null && !llqllqq.ggggggg0067(str) && !llqllqq.ggggggg0067(str2)) {
            try {
                byte[] bArrDecode = Base64.decode(bArr, 0);
                if (bArrDecode != null && bArrDecode.length >= 32) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrDecode.length - 16);
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(16);
                    if (j006Ajj006Aj006A(bArrDecode, 16, byteBufferAllocate, byteBufferAllocate2) && byteBufferAllocate.hasArray() && byteBufferAllocate2.hasArray()) {
                        byte[] bArrJj006A006Ajj006A = jj006A006Ajj006A(byteBufferAllocate.array(), j006A006A006A006Aj006A(byteBufferAllocate2.array(), str, str2), byteBufferAllocate2.array(), c0063cccc0063);
                        if (bArrJj006A006Ajj006A == null) {
                            lqlqqll.llqqqll.uuu0075uuu(ccc006300630063c, "failed to decrypt the conf response");
                            return null;
                        }
                        String str3 = new String(bArrJj006A006Ajj006A, StandardCharsets.UTF_8);
                        lqlqqll.llqqqll.yy00790079007900790079(ccc006300630063c, "conf response ".concat(str3));
                        return str3;
                    }
                    lqlqqll.llqqqll.uuu0075uuu(ccc006300630063c, "Failure: failed to deinterlace nonce from input");
                }
                return null;
            } catch (IOException e) {
                e = e;
                lqlqqll.llqqqll.u007500750075uuu(ccc006300630063c, "Deobfuscate Error", e);
                return null;
            } catch (IllegalArgumentException e2) {
                e = e2;
                lqlqqll.llqqqll.u007500750075uuu(ccc006300630063c, "Deobfuscate Error", e);
                return null;
            }
        }
        return null;
    }

    @Nullable
    public static String jjj006A006Aj006A(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (!llqllqq.ggggggg0067(str) && !llqllqq.ggggggg0067(str2) && !llqllqq.ggggggg0067(str3)) {
            try {
                Charset charset = StandardCharsets.UTF_8;
                byte[] bArrGgg00670067gg0067 = llqllqq.ggg00670067gg0067((str3 + str2).getBytes(charset));
                if (bArrGgg00670067gg0067 == null) {
                    return null;
                }
                byte[] bytes = str3.getBytes(charset);
                byte[] bArrJ006A006A006Ajj006A = j006A006A006Ajj006A(str.getBytes(charset), Arrays.copyOfRange(bArrGgg00670067gg0067, 0, 16), Arrays.copyOfRange(bArrGgg00670067gg0067, 16, bArrGgg00670067gg0067.length), str4);
                if (bArrJ006A006A006Ajj006A == null) {
                    lqlqqll.llqqqll.uuu0075uuu(ccc006300630063c, "Failure: failed to encrypt the payload");
                    return null;
                }
                byte[] bArrEncode = Base64.encode(j006Ajjj006A006A(bArrJ006A006A006Ajj006A, bytes), 2);
                if (bArrEncode != null) {
                    return new String(bArrEncode, charset);
                }
                lqlqqll.llqqqll.uuu0075uuu(ccc006300630063c, "Failure: Base64 failed");
                return null;
            } catch (ArrayIndexOutOfBoundsException e) {
                e = e;
                lqlqqll.llqqqll.u007500750075uuu(ccc006300630063c, "Obfuscation Error", e);
                return null;
            } catch (IllegalArgumentException e2) {
                e = e2;
                lqlqqll.llqqqll.u007500750075uuu(ccc006300630063c, "Obfuscation Error", e);
                return null;
            } catch (NullPointerException e3) {
                e = e3;
                lqlqqll.llqqqll.u007500750075uuu(ccc006300630063c, "Obfuscation Error", e);
                return null;
            } catch (BufferOverflowException e4) {
                e = e4;
                lqlqqll.llqqqll.u007500750075uuu(ccc006300630063c, "Obfuscation Error", e);
                return null;
            } catch (ReadOnlyBufferException e5) {
                e = e5;
                lqlqqll.llqqqll.u007500750075uuu(ccc006300630063c, "Obfuscation Error", e);
                return null;
            }
        }
        return null;
    }

    public static String jjjj006Aj006A(@Nullable String str, @Nullable String str2, @Nullable String str3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (str != null && !llqllqq.ggggggg0067(str2)) {
            try {
                byte[] bArrDecode = Base64.decode(str, 2);
                if (bArrDecode != null && bArrDecode.length >= 36) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrDecode.length - 36);
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(36);
                    if (j006Ajj006Aj006A(bArrDecode, 36, byteBufferAllocate, byteBufferAllocate2) && byteBufferAllocate.hasArray() && byteBufferAllocate2.hasArray()) {
                        byte[] bArr = new byte[str2.length() + 36];
                        System.arraycopy(byteBufferAllocate2.array(), 0, bArr, 0, 36);
                        Charset charset = StandardCharsets.UTF_8;
                        System.arraycopy(str2.getBytes(charset), 0, bArr, 36, str2.length());
                        byte[] bArrGgg00670067gg0067 = llqllqq.ggg00670067gg0067(bArr);
                        if (bArrGgg00670067gg0067 == null) {
                            lqlqqll.llqqqll.uuu0075uuu(ccc006300630063c, "Failure: failed to generate sha256 hash");
                            return null;
                        }
                        byte[] bArrJj006A006Ajj006A = jj006A006Ajj006A(byteBufferAllocate.array(), Arrays.copyOfRange(bArrGgg00670067gg0067, 0, 16), Arrays.copyOfRange(bArrGgg00670067gg0067, 16, bArrGgg00670067gg0067.length), str3);
                        if (bArrJj006A006Ajj006A == null) {
                            lqlqqll.llqqqll.uuu0075uuu(ccc006300630063c, "Failure: failed to decrypt the payload");
                            return null;
                        }
                        String str4 = new String(bArrJj006A006Ajj006A, charset);
                        lqlqqll.llqqqll.yy00790079007900790079(ccc006300630063c, "Decoded String: ".concat(str4));
                        return str4;
                    }
                    lqlqqll.llqqqll.uuu0075uuu(ccc006300630063c, "Failure: failed to deinterlace random string from input");
                    return null;
                }
                lqlqqll.llqqqll.uuu0075uuu(ccc006300630063c, "Failure: decoded len is smaller than 36");
                return null;
            } catch (ArrayStoreException e) {
                e = e;
                lqlqqll.llqqqll.u007500750075uuu(ccc006300630063c, "De-obfuscation Error input was ".concat(str), e);
                return null;
            } catch (IllegalArgumentException e2) {
                e = e2;
                lqlqqll.llqqqll.u007500750075uuu(ccc006300630063c, "De-obfuscation Error input was ".concat(str), e);
                return null;
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
                lqlqqll.llqqqll.u007500750075uuu(ccc006300630063c, "De-obfuscation Error input was ".concat(str), e);
                return null;
            } catch (NullPointerException e4) {
                e = e4;
                lqlqqll.llqqqll.u007500750075uuu(ccc006300630063c, "De-obfuscation Error input was ".concat(str), e);
                return null;
            }
        }
        return null;
    }

    public static int jjjjj006A006A(@Nullable byte[] bArr, @Nullable byte[] bArr2) throws IOException, IllegalArgumentException {
        if (bArr == null || bArr2 == null) {
            throw new IllegalArgumentException("Illegal argument for CRC32 key");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(bArr);
        byteArrayOutputStream.write(bArr2);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArrayOutputStream.toByteArray());
        return (int) crc32.getValue();
    }
}
