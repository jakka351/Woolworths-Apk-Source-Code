package com.airbnb.lottie.network;

import androidx.annotation.RestrictTo;
import com.airbnb.lottie.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@RestrictTo
/* loaded from: classes4.dex */
public class NetworkCache {

    /* renamed from: a, reason: collision with root package name */
    public final a f13431a;

    public NetworkCache(a aVar) {
        this.f13431a = aVar;
    }

    public static String a(String str, FileExtension fileExtension, boolean z) throws NoSuchAlgorithmException {
        String strConcat = fileExtension.d;
        if (z) {
            strConcat = ".temp".concat(strConcat);
        }
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strConcat.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
                strReplaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return YU.a.h("lottie_cache_", strReplaceAll, strConcat);
    }

    public final File b(String str) {
        File file = new File(c(), a(str, FileExtension.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(c(), a(str, FileExtension.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(c(), a(str, FileExtension.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public final File c() {
        File file = new File(this.f13431a.f13352a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File d(String str, InputStream inputStream, FileExtension fileExtension) throws NoSuchAlgorithmException, IOException {
        File file = new File(c(), a(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }
}
