package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzaon {
    public static X509Certificate[][] zza(String str) throws SecurityException, IOException, zzaok {
        RandomAccessFile randomAccessFile;
        Pair pairZza;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
        try {
            pairZza = zzaoo.zza(randomAccessFile2);
        } catch (Throwable th) {
            th = th;
            randomAccessFile = randomAccessFile2;
        }
        try {
            if (pairZza == null) {
                long length = randomAccessFile2.length();
                StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 82);
                sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb.append(length);
                sb.append(" bytes");
                throw new zzaok(sb.toString());
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairZza.first;
            long jLongValue = ((Long) pairZza.second).longValue();
            long j = (-20) + jLongValue;
            if (j >= 0) {
                randomAccessFile2.seek(j);
                if (randomAccessFile2.readInt() == 1347094023) {
                    throw new zzaok("ZIP64 APK not supported");
                }
            }
            long jZzb = zzaoo.zzb(byteBuffer);
            if (jZzb >= jLongValue) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(jZzb).length() + 82 + String.valueOf(jLongValue).length());
                sb2.append("ZIP Central Directory offset out of range: ");
                sb2.append(jZzb);
                sb2.append(". ZIP End of Central Directory offset: ");
                sb2.append(jLongValue);
                throw new zzaok(sb2.toString());
            }
            if (zzaoo.zzd(byteBuffer) + jZzb != jLongValue) {
                throw new zzaok("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (jZzb < 32) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(jZzb).length() + 67);
                sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                sb3.append(jZzb);
                throw new zzaok(sb3.toString());
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile2.seek(jZzb - byteBufferAllocate.capacity());
            randomAccessFile2.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new zzaok("No APK Signing Block before ZIP Central Directory");
            }
            long j2 = jZzb;
            long j3 = byteBufferAllocate.getLong(0);
            if (j3 < byteBufferAllocate.capacity() || j3 > 2147483639) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(j3).length() + 37);
                sb4.append("APK Signing Block size out of range: ");
                sb4.append(j3);
                throw new zzaok(sb4.toString());
            }
            int i = (int) (8 + j3);
            long j4 = j2 - i;
            if (j4 < 0) {
                StringBuilder sb5 = new StringBuilder(String.valueOf(j4).length() + 39);
                sb5.append("APK Signing Block offset out of range: ");
                sb5.append(j4);
                throw new zzaok(sb5.toString());
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile2.seek(j4);
            randomAccessFile2.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j5 = byteBufferAllocate2.getLong(0);
            if (j5 != j3) {
                StringBuilder sb6 = new StringBuilder(String.valueOf(j5).length() + 63 + String.valueOf(j3).length());
                sb6.append("APK Signing Block sizes in header and footer do not match: ");
                sb6.append(j5);
                sb6.append(" vs ");
                sb6.append(j3);
                throw new zzaok(sb6.toString());
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j4));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            randomAccessFile = randomAccessFile2;
            if (iCapacity < 8) {
                StringBuilder sb7 = new StringBuilder(String.valueOf(iCapacity).length() + 17);
                sb7.append("end < start: ");
                sb7.append(iCapacity);
                sb7.append(" < 8");
                throw new IllegalArgumentException(sb7.toString());
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                StringBuilder sb8 = new StringBuilder(String.valueOf(iCapacity).length() + 19 + String.valueOf(iCapacity2).length());
                sb8.append("end > capacity: ");
                sb8.append(iCapacity);
                sb8.append(" > ");
                sb8.append(iCapacity2);
                throw new IllegalArgumentException(sb8.toString());
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                int i2 = 0;
                while (byteBufferSlice.hasRemaining()) {
                    i2++;
                    if (byteBufferSlice.remaining() < 8) {
                        StringBuilder sb9 = new StringBuilder(String.valueOf(i2).length() + 59);
                        sb9.append("Insufficient data to read size of APK Signing Block entry #");
                        sb9.append(i2);
                        throw new zzaok(sb9.toString());
                    }
                    long j6 = byteBufferSlice.getLong();
                    if (j6 < 4 || j6 > 2147483647L) {
                        StringBuilder sb10 = new StringBuilder(String.valueOf(i2).length() + 45 + String.valueOf(j6).length());
                        sb10.append("APK Signing Block entry #");
                        sb10.append(i2);
                        sb10.append(" size out of range: ");
                        sb10.append(j6);
                        throw new zzaok(sb10.toString());
                    }
                    int i3 = (int) j6;
                    int iPosition2 = byteBufferSlice.position() + i3;
                    if (i3 > byteBufferSlice.remaining()) {
                        int iRemaining = byteBufferSlice.remaining();
                        StringBuilder sb11 = new StringBuilder(String.valueOf(i2).length() + 45 + String.valueOf(i3).length() + 13 + String.valueOf(iRemaining).length());
                        sb11.append("APK Signing Block entry #");
                        sb11.append(i2);
                        sb11.append(" size out of range: ");
                        sb11.append(i3);
                        sb11.append(", available: ");
                        sb11.append(iRemaining);
                        throw new zzaok(sb11.toString());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrZzb = zzb(randomAccessFile.getChannel(), new zzaoj(zzi(byteBufferSlice, i3 - 4), jLongValue2, j2, jLongValue, byteBuffer, null));
                        randomAccessFile.close();
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused) {
                        }
                        return x509CertificateArrZzb;
                    }
                    long j7 = j2;
                    byteBufferSlice.position(iPosition2);
                    j2 = j7;
                }
                throw new zzaok("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th2) {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    private static X509Certificate[][] zzb(FileChannel fileChannel, zzaoj zzaojVar) throws SecurityException, CertificateException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferZzj = zzj(zzaojVar.zza());
                int i = 0;
                while (byteBufferZzj.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(zzc(zzj(byteBufferZzj), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(androidx.constraintlayout.core.state.a.k(new StringBuilder(String.valueOf(i).length() + 37), "Failed to parse/verify signer #", i, " block"), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                zzd(map, fileChannel, zzaojVar.zzb(), zzaojVar.zzc(), zzaojVar.zzd(), zzaojVar.zze());
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }

    private static X509Certificate[] zzc(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, SecurityException, InvalidAlgorithmParameterException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferZzj = zzj(byteBuffer);
        ByteBuffer byteBufferZzj2 = zzj(byteBuffer);
        byte[] bArrZzk = zzk(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrZzk2 = null;
        byte[] bArrZzk3 = null;
        int i = -1;
        int i2 = 0;
        while (byteBufferZzj2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer byteBufferZzj3 = zzj(byteBufferZzj2);
                if (byteBufferZzj3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i3 = byteBufferZzj3.getInt();
                arrayList.add(Integer.valueOf(i3));
                if (i3 != 513 && i3 != 514 && i3 != 769) {
                    switch (i3) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i != -1) {
                    int iZzf = zzf(i3);
                    int iZzf2 = zzf(i);
                    if (iZzf != 1 && iZzf2 == 1) {
                    }
                }
                bArrZzk3 = zzk(byteBufferZzj3);
                i = i3;
            } catch (IOException e) {
                e = e;
                throw new SecurityException(YU.a.n(new StringBuilder(String.valueOf(i2).length() + 34), "Failed to parse signature record #", i2), e);
            } catch (BufferUnderflowException e2) {
                e = e2;
                throw new SecurityException(YU.a.n(new StringBuilder(String.valueOf(i2).length() + 34), "Failed to parse signature record #", i2), e);
            }
        }
        if (i == -1) {
            if (i2 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            str = "DSA";
        }
        if (i == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i != 769) {
            switch (i) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrZzk));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferZzj);
            if (!signature.verify(bArrZzk3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferZzj.clear();
            ByteBuffer byteBufferZzj4 = zzj(byteBufferZzj);
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (byteBufferZzj4.hasRemaining()) {
                i4++;
                try {
                    ByteBuffer byteBufferZzj5 = zzj(byteBufferZzj4);
                    if (byteBufferZzj5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i5 = byteBufferZzj5.getInt();
                    arrayList2.add(Integer.valueOf(i5));
                    if (i5 == i) {
                        bArrZzk2 = zzk(byteBufferZzj5);
                    }
                } catch (IOException e3) {
                    e = e3;
                    throw new IOException(YU.a.n(new StringBuilder(String.valueOf(i4).length() + 31), "Failed to parse digest record #", i4), e);
                } catch (BufferUnderflowException e4) {
                    e = e4;
                    throw new IOException(YU.a.n(new StringBuilder(String.valueOf(i4).length() + 31), "Failed to parse digest record #", i4), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iZzf3 = zzf(i);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iZzf3), bArrZzk2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrZzk2)) {
                throw new SecurityException(zzg(iZzf3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferZzj6 = zzj(byteBufferZzj);
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            while (byteBufferZzj6.hasRemaining()) {
                i6++;
                byte[] bArrZzk4 = zzk(byteBufferZzj6);
                try {
                    arrayList3.add(new zzaol((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzk4)), bArrZzk4));
                } catch (CertificateException e5) {
                    throw new SecurityException(YU.a.n(new StringBuilder(String.valueOf(i6).length() + 30), "Failed to decode certificate #", i6), e5);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrZzk, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e6) {
            e = e6;
            throw new SecurityException(YU.a.p(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e7) {
            e = e7;
            throw new SecurityException(YU.a.p(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e8) {
            e = e8;
            throw new SecurityException(YU.a.p(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e9) {
            e = e9;
            throw new SecurityException(YU.a.p(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e10) {
            e = e10;
            throw new SecurityException(YU.a.p(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        }
    }

    private static void zzd(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        zzaoi zzaoiVar = new zzaoi(fileChannel, 0L, j);
        zzaoi zzaoiVar2 = new zzaoi(fileChannel, j2, j3 - j2);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        zzaoo.zzc(byteBufferDuplicate, j);
        zzaog zzaogVar = new zzaog(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        try {
            byte[][] bArrZze = zze(iArr, new zzaoh[]{zzaoiVar, zzaoiVar2, zzaogVar});
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = iArr[i2];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), bArrZze[i2])) {
                    throw new SecurityException(zzg(i3).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e) {
            throw new SecurityException("Failed to compute digest(s) of contents", e);
        }
    }

    private static byte[][] zze(int[] iArr, zzaoh[] zzaohVarArr) throws DigestException {
        long j;
        int i;
        int length;
        char c;
        int i2;
        String str;
        int i3 = 0;
        long jZza = 0;
        while (true) {
            j = llqqqql.c0063c0063c00630063;
            i = 3;
            if (i3 >= 3) {
                break;
            }
            jZza += (zzaohVarArr[i3].zza() + 1048575) / llqqqql.c0063c0063c00630063;
            i3++;
        }
        if (jZza >= 2097151) {
            throw new DigestException(au.com.woolworths.shop.checkout.ui.confirmation.c.m(jZza, "Too many chunks: ", new StringBuilder(String.valueOf(jZza).length() + 17)));
        }
        byte[][] bArr = new byte[iArr.length][];
        int i4 = 0;
        while (true) {
            length = iArr.length;
            c = 5;
            i2 = 1;
            if (i4 >= length) {
                break;
            }
            int i5 = (int) jZza;
            byte[] bArr2 = new byte[(zzh(iArr[i4]) * i5) + 5];
            bArr2[0] = 90;
            zzl(i5, bArr2, 1);
            bArr[i4] = bArr2;
            i4++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i6 = 0;
        while (true) {
            str = " digest not supported";
            if (i6 >= iArr.length) {
                break;
            }
            String strZzg = zzg(iArr[i6]);
            try {
                messageDigestArr[i6] = MessageDigest.getInstance(strZzg);
                i6++;
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(strZzg.concat(" digest not supported"), e);
            }
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < i) {
            zzaoh zzaohVar = zzaohVarArr[i7];
            int i10 = i7;
            long jZza2 = zzaohVar.zza();
            long j2 = 0;
            while (jZza2 > 0) {
                int i11 = i8;
                String str2 = str;
                int iMin = (int) Math.min(jZza2, j);
                zzl(iMin, bArr3, i2);
                for (int i12 = 0; i12 < length; i12++) {
                    messageDigestArr[i12].update(bArr3);
                }
                try {
                    zzaohVar.zzb(messageDigestArr, j2, iMin);
                    int i13 = 0;
                    while (i13 < iArr.length) {
                        int i14 = iArr[i13];
                        byte[] bArr4 = bArr[i13];
                        int iZzh = zzh(i14);
                        char c2 = c;
                        MessageDigest messageDigest = messageDigestArr[i13];
                        int iDigest = messageDigest.digest(bArr4, (i11 * iZzh) + 5, iZzh);
                        if (iDigest != iZzh) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb = new StringBuilder(String.valueOf(algorithm).length() + 35 + String.valueOf(iDigest).length());
                            sb.append("Unexpected output size of ");
                            sb.append(algorithm);
                            sb.append(" digest: ");
                            sb.append(iDigest);
                            throw new RuntimeException(sb.toString());
                        }
                        i13++;
                        c = c2;
                    }
                    long j3 = iMin;
                    j2 += j3;
                    jZza2 -= j3;
                    i8 = i11 + 1;
                    str = str2;
                    j = llqqqql.c0063c0063c00630063;
                    i2 = 1;
                } catch (IOException e2) {
                    throw new DigestException(au.com.woolworths.shop.checkout.ui.confirmation.c.l(i11, i9, "Failed to digest chunk #", " of section #", new StringBuilder(String.valueOf(i11).length() + 37 + String.valueOf(i9).length())), e2);
                }
            }
            i9++;
            i7 = i10 + 1;
            j = llqqqql.c0063c0063c00630063;
            i = 3;
            i2 = 1;
        }
        String str3 = str;
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i15 = 0; i15 < iArr.length; i15++) {
            int i16 = iArr[i15];
            byte[] bArr6 = bArr[i15];
            String strZzg2 = zzg(i16);
            try {
                bArr5[i15] = MessageDigest.getInstance(strZzg2).digest(bArr6);
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(strZzg2.concat(str3), e3);
            }
        }
        return bArr5;
    }

    private static int zzf(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
        }
    }

    private static String zzg(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(YU.a.n(new StringBuilder(String.valueOf(i).length() + 33), "Unknown content digest algorthm: ", i));
    }

    private static int zzh(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        throw new IllegalArgumentException(YU.a.n(new StringBuilder(String.valueOf(i).length() + 33), "Unknown content digest algorthm: ", i));
    }

    private static ByteBuffer zzi(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    private static ByteBuffer zzj(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            int iRemaining = byteBuffer.remaining();
            throw new IOException(YU.a.n(new StringBuilder(String.valueOf(iRemaining).length() + 82), "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", iRemaining));
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return zzi(byteBuffer, i);
        }
        int iRemaining2 = byteBuffer.remaining();
        throw new IOException(au.com.woolworths.shop.checkout.ui.confirmation.c.l(i, iRemaining2, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ", new StringBuilder(String.valueOf(i).length() + 79 + String.valueOf(iRemaining2).length())));
    }

    private static byte[] zzk(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        int iRemaining = byteBuffer.remaining();
        throw new IOException(au.com.woolworths.shop.checkout.ui.confirmation.c.l(i, iRemaining, "Underflow while reading length-prefixed value. Length: ", ", available: ", new StringBuilder(String.valueOf(i).length() + 68 + String.valueOf(iRemaining).length())));
    }

    private static void zzl(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }
}
