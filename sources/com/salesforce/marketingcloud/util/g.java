package com.salesforce.marketingcloud.util;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import org.bouncycastle.i18n.LocalizedMessage;

@SuppressLint
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f17080a = Charset.forName("US-ASCII");
    public static final Charset b = Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
    public static final Charset c = Charset.forName("UTF-8");

    private g() {
    }

    public static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void b(@NonNull File file) {
        try {
            file.delete();
        } catch (Exception unused) {
        }
    }

    public static void a(File file, OutputStream outputStream) throws IOException {
        a(new FileInputStream(file), outputStream);
    }

    public static void a(InputStream inputStream, File file) throws IOException {
        a(inputStream, new FileOutputStream(file));
    }

    public static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int i = inputStream.read(bArr);
                if (-1 == i) {
                    outputStream.flush();
                    a((Closeable) inputStream);
                    a(outputStream);
                    return;
                }
                outputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            a((Closeable) inputStream);
            a(outputStream);
            throw th;
        }
    }

    public static void a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }

    public static String a(Reader reader) throws IOException {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int i = reader.read(cArr);
                if (i == -1) {
                    String string = stringWriter.toString();
                    reader.close();
                    return string;
                }
                stringWriter.write(cArr, 0, i);
            }
        } catch (Throwable th) {
            reader.close();
            throw th;
        }
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        a(byteArrayOutputStream);
        return byteArray;
    }
}
