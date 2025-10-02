package com.adobe.marketing.mobile.util;

import com.adobe.marketing.mobile.services.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class StreamUtils {
    public static String a(InputStream inputStream) throws IOException {
        try {
            if (inputStream == null) {
                return null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr, 0, 1024);
                        if (i == -1) {
                            String str = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                            byteArrayOutputStream.close();
                            try {
                                return str;
                            } catch (IOException e) {
                                return str;
                            }
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e2.getLocalizedMessage();
                Log.c();
                try {
                    inputStream.close();
                    return null;
                } catch (IOException e3) {
                    e3.getLocalizedMessage();
                    Log.c();
                    return null;
                }
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e4) {
                e4.getLocalizedMessage();
                Log.c();
            }
        }
    }
}
