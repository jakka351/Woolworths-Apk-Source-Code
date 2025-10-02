package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
class ProfileTranscoder {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3641a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};

    public static byte[] a(DexProfileData[] dexProfileDataArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (DexProfileData dexProfileData : dexProfileDataArr) {
            length += ((((dexProfileData.g * 2) + 7) & (-8)) / 8) + (dexProfileData.e * 2) + b(dexProfileData.f3638a, dexProfileData.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + dexProfileData.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, ProfileVersion.c)) {
            int length2 = dexProfileDataArr.length;
            while (i < length2) {
                DexProfileData dexProfileData2 = dexProfileDataArr[i];
                k(byteArrayOutputStream, dexProfileData2, b(dexProfileData2.f3638a, dexProfileData2.b, bArr));
                j(byteArrayOutputStream, dexProfileData2);
                i++;
            }
        } else {
            for (DexProfileData dexProfileData3 : dexProfileDataArr) {
                k(byteArrayOutputStream, dexProfileData3, b(dexProfileData3.f3638a, dexProfileData3.b, bArr));
            }
            int length3 = dexProfileDataArr.length;
            while (i < length3) {
                j(byteArrayOutputStream, dexProfileDataArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static String b(String str, String str2, byte[] bArr) {
        byte[] bArr2 = ProfileVersion.e;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = ProfileVersion.d;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return YU.a.o(YU.a.s(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static int[] c(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iD = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iD += (int) Encoding.d(byteArrayInputStream, 2);
            iArr[i2] = iD;
        }
        return iArr;
    }

    public static DexProfileData[] d(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, DexProfileData[] dexProfileDataArr) throws IOException {
        byte[] bArr3 = ProfileVersion.f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, ProfileVersion.g)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iD = (int) Encoding.d(fileInputStream, 2);
            byte[] bArrC = Encoding.c(fileInputStream, (int) Encoding.d(fileInputStream, 4), (int) Encoding.d(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC);
            try {
                DexProfileData[] dexProfileDataArrF = f(byteArrayInputStream, bArr2, iD, dexProfileDataArr);
                byteArrayInputStream.close();
                return dexProfileDataArrF;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(ProfileVersion.f3644a, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iD2 = (int) Encoding.d(fileInputStream, 1);
        byte[] bArrC2 = Encoding.c(fileInputStream, (int) Encoding.d(fileInputStream, 4), (int) Encoding.d(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrC2);
        try {
            DexProfileData[] dexProfileDataArrE = e(byteArrayInputStream2, iD2, dexProfileDataArr);
            byteArrayInputStream2.close();
            return dexProfileDataArrE;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static DexProfileData[] e(ByteArrayInputStream byteArrayInputStream, int i, DexProfileData[] dexProfileDataArr) {
        if (byteArrayInputStream.available() == 0) {
            return new DexProfileData[0];
        }
        if (i != dexProfileDataArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iD = (int) Encoding.d(byteArrayInputStream, 2);
            iArr[i2] = (int) Encoding.d(byteArrayInputStream, 2);
            strArr[i2] = new String(Encoding.b(byteArrayInputStream, iD), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            DexProfileData dexProfileData = dexProfileDataArr[i3];
            if (!dexProfileData.b.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            dexProfileData.e = i4;
            dexProfileData.h = c(byteArrayInputStream, i4);
        }
        return dexProfileDataArr;
    }

    public static DexProfileData[] f(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, DexProfileData[] dexProfileDataArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new DexProfileData[0];
        }
        if (i != dexProfileDataArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            Encoding.d(byteArrayInputStream, 2);
            String str = new String(Encoding.b(byteArrayInputStream, (int) Encoding.d(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jD = Encoding.d(byteArrayInputStream, 4);
            int iD = (int) Encoding.d(byteArrayInputStream, 2);
            DexProfileData dexProfileData = null;
            if (dexProfileDataArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i3 = 0;
                while (true) {
                    if (i3 >= dexProfileDataArr.length) {
                        break;
                    }
                    if (dexProfileDataArr[i3].b.equals(strSubstring)) {
                        dexProfileData = dexProfileDataArr[i3];
                        break;
                    }
                    i3++;
                }
            }
            if (dexProfileData == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            dexProfileData.d = jD;
            int[] iArrC = c(byteArrayInputStream, iD);
            if (Arrays.equals(bArr, ProfileVersion.e)) {
                dexProfileData.e = iD;
                dexProfileData.h = iArrC;
            }
        }
        return dexProfileDataArr;
    }

    public static DexProfileData[] g(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, ProfileVersion.b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iD = (int) Encoding.d(fileInputStream, 1);
        byte[] bArrC = Encoding.c(fileInputStream, (int) Encoding.d(fileInputStream, 4), (int) Encoding.d(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC);
        try {
            DexProfileData[] dexProfileDataArrH = h(byteArrayInputStream, str, iD);
            byteArrayInputStream.close();
            return dexProfileDataArrH;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static DexProfileData[] h(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new DexProfileData[0];
        }
        DexProfileData[] dexProfileDataArr = new DexProfileData[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iD = (int) Encoding.d(byteArrayInputStream, 2);
            int iD2 = (int) Encoding.d(byteArrayInputStream, 2);
            dexProfileDataArr[i3] = new DexProfileData(str, new String(Encoding.b(byteArrayInputStream, iD), StandardCharsets.UTF_8), Encoding.d(byteArrayInputStream, 4), iD2, (int) Encoding.d(byteArrayInputStream, 4), (int) Encoding.d(byteArrayInputStream, 4), new int[iD2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            DexProfileData dexProfileData = dexProfileDataArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = dexProfileData.f;
            int i6 = dexProfileData.g;
            TreeMap treeMap = dexProfileData.i;
            int i7 = iAvailable - i5;
            int iD3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iD3 += (int) Encoding.d(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iD3), 1);
                int iD4 = (int) Encoding.d(byteArrayInputStream, 2);
                while (iD4 > 0) {
                    Encoding.d(byteArrayInputStream, 2);
                    int iD5 = (int) Encoding.d(byteArrayInputStream, 1);
                    if (iD5 != 6 && iD5 != 7) {
                        while (iD5 > 0) {
                            Encoding.d(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iD6 = (int) Encoding.d(byteArrayInputStream, 1); iD6 > 0; iD6--) {
                                Encoding.d(byteArrayInputStream, 2);
                            }
                            iD5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iD4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            dexProfileData.h = c(byteArrayInputStream, dexProfileData.e);
            BitSet bitSetValueOf = BitSet.valueOf(Encoding.b(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return dexProfileDataArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, DexProfileData[] dexProfileDataArr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = ProfileVersion.f3644a;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = ProfileVersion.b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrA = a(dexProfileDataArr, bArr3);
                Encoding.e(byteArrayOutputStream, dexProfileDataArr.length, 1);
                Encoding.e(byteArrayOutputStream, bArrA.length, 4);
                byte[] bArrA2 = Encoding.a(bArrA);
                Encoding.e(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr4 = ProfileVersion.d;
            if (Arrays.equals(bArr, bArr4)) {
                Encoding.e(byteArrayOutputStream, dexProfileDataArr.length, 1);
                for (DexProfileData dexProfileData : dexProfileDataArr) {
                    int size = dexProfileData.i.size() * 4;
                    String strB = b(dexProfileData.f3638a, dexProfileData.b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    Encoding.f(byteArrayOutputStream, strB.getBytes(charset).length);
                    Encoding.f(byteArrayOutputStream, dexProfileData.h.length);
                    Encoding.e(byteArrayOutputStream, size, 4);
                    Encoding.e(byteArrayOutputStream, dexProfileData.c, 4);
                    byteArrayOutputStream.write(strB.getBytes(charset));
                    Iterator it = dexProfileData.i.keySet().iterator();
                    while (it.hasNext()) {
                        Encoding.f(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        Encoding.f(byteArrayOutputStream, 0);
                    }
                    for (int i2 : dexProfileData.h) {
                        Encoding.f(byteArrayOutputStream, i2);
                    }
                }
                return true;
            }
            byte[] bArr5 = ProfileVersion.c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrA3 = a(dexProfileDataArr, bArr5);
                Encoding.e(byteArrayOutputStream, dexProfileDataArr.length, 1);
                Encoding.e(byteArrayOutputStream, bArrA3.length, 4);
                byte[] bArrA4 = Encoding.a(bArrA3);
                Encoding.e(byteArrayOutputStream, bArrA4.length, 4);
                byteArrayOutputStream.write(bArrA4);
                return true;
            }
            byte[] bArr6 = ProfileVersion.e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            Encoding.f(byteArrayOutputStream, dexProfileDataArr.length);
            for (DexProfileData dexProfileData2 : dexProfileDataArr) {
                String str = dexProfileData2.f3638a;
                TreeMap treeMap = dexProfileData2.i;
                String strB2 = b(str, dexProfileData2.b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                Encoding.f(byteArrayOutputStream, strB2.getBytes(charset2).length);
                Encoding.f(byteArrayOutputStream, treeMap.size());
                Encoding.f(byteArrayOutputStream, dexProfileData2.h.length);
                Encoding.e(byteArrayOutputStream, dexProfileData2.c, 4);
                byteArrayOutputStream.write(strB2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    Encoding.f(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i3 : dexProfileData2.h) {
                    Encoding.f(byteArrayOutputStream, i3);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            Encoding.f(byteArrayOutputStream2, dexProfileDataArr.length);
            int i4 = 2;
            int i5 = 2;
            for (DexProfileData dexProfileData3 : dexProfileDataArr) {
                Encoding.e(byteArrayOutputStream2, dexProfileData3.c, 4);
                Encoding.e(byteArrayOutputStream2, dexProfileData3.d, 4);
                Encoding.e(byteArrayOutputStream2, dexProfileData3.g, 4);
                String strB3 = b(dexProfileData3.f3638a, dexProfileData3.b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strB3.getBytes(charset3).length;
                Encoding.f(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(strB3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            WritableFileSection writableFileSection = new WritableFileSection(FileSectionType.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(writableFileSection);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            for (int i7 = 0; i7 < dexProfileDataArr.length; i7++) {
                try {
                    DexProfileData dexProfileData4 = dexProfileDataArr[i7];
                    Encoding.f(byteArrayOutputStream3, i7);
                    Encoding.f(byteArrayOutputStream3, dexProfileData4.e);
                    i6 = i6 + 4 + (dexProfileData4.e * i4);
                    int[] iArr = dexProfileData4.h;
                    int length3 = iArr.length;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < length3) {
                        int i10 = iArr[i8];
                        Encoding.f(byteArrayOutputStream3, i10 - i9);
                        i8++;
                        i4 = i4;
                        i9 = i10;
                    }
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i6 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray2.length);
            }
            WritableFileSection writableFileSection2 = new WritableFileSection(FileSectionType.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(writableFileSection2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < dexProfileDataArr.length) {
                try {
                    DexProfileData dexProfileData5 = dexProfileDataArr[i11];
                    Iterator it3 = dexProfileData5.i.entrySet().iterator();
                    int iIntValue = i;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        l(byteArrayOutputStream4, iIntValue, dexProfileData5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m(byteArrayOutputStream4, dexProfileData5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            Encoding.f(byteArrayOutputStream3, i11);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i13 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            Encoding.e(byteArrayOutputStream3, length4, 4);
                            Encoding.f(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i13 + length4;
                            i11++;
                            arrayList3 = arrayList4;
                            i = 0;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            WritableFileSection writableFileSection3 = new WritableFileSection(FileSectionType.METHODS, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(writableFileSection3);
            long j = 4;
            long size2 = j + j + 4 + (arrayList2.size() * 16);
            Encoding.e(byteArrayOutputStream, arrayList2.size(), 4);
            int i14 = 0;
            while (i14 < arrayList2.size()) {
                WritableFileSection writableFileSection4 = (WritableFileSection) arrayList2.get(i14);
                FileSectionType fileSectionType = writableFileSection4.f3645a;
                byte[] bArr7 = writableFileSection4.b;
                Encoding.e(byteArrayOutputStream, fileSectionType.d, 4);
                Encoding.e(byteArrayOutputStream, size2, 4);
                if (writableFileSection4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrA5 = Encoding.a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA5);
                    Encoding.e(byteArrayOutputStream, bArrA5.length, 4);
                    Encoding.e(byteArrayOutputStream, length5, 4);
                    length = bArrA5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    Encoding.e(byteArrayOutputStream, bArr7.length, 4);
                    Encoding.e(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i14++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i15));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void j(ByteArrayOutputStream byteArrayOutputStream, DexProfileData dexProfileData) throws IOException {
        m(byteArrayOutputStream, dexProfileData);
        int i = dexProfileData.g;
        int[] iArr = dexProfileData.h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            Encoding.f(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : dexProfileData.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, DexProfileData dexProfileData, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        Encoding.f(byteArrayOutputStream, str.getBytes(charset).length);
        Encoding.f(byteArrayOutputStream, dexProfileData.e);
        Encoding.e(byteArrayOutputStream, dexProfileData.f, 4);
        Encoding.e(byteArrayOutputStream, dexProfileData.c, 4);
        Encoding.e(byteArrayOutputStream, dexProfileData.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, int i, DexProfileData dexProfileData) throws IOException {
        int i2 = dexProfileData.g;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : dexProfileData.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, DexProfileData dexProfileData) throws IOException {
        int i = 0;
        for (Map.Entry entry : dexProfileData.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                Encoding.f(byteArrayOutputStream, iIntValue - i);
                Encoding.f(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }
}
