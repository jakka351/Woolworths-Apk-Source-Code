package com.adobe.marketing.mobile.internal.util;

import com.adobe.marketing.mobile.services.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.io.ByteStreamsKt;
import kotlin.io.ExceptionsKt;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.FileSystemException;
import kotlin.io.NoSuchFileException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/internal/util/FileUtils;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FileUtils {
    public static final void a(File file, File file2) {
        if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        if (!file2.exists()) {
            file2.createNewFile();
        }
        if (!file.exists()) {
            throw new NoSuchFileException(file);
        }
        if (file2.exists() && !file2.delete()) {
            throw new FileAlreadyExistsException(file, file2, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (!file.isDirectory()) {
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    ByteStreamsKt.a(fileInputStream, fileOutputStream, 8192);
                    fileOutputStream.close();
                    fileInputStream.close();
                } finally {
                }
            } finally {
            }
        } else if (!file2.mkdirs()) {
            throw new FileSystemException(ExceptionsKt.a(file, file2, "Failed to create target directory."));
        }
        file.delete();
    }

    public static final String b(File file) throws IOException {
        try {
        } catch (SecurityException e) {
            e.toString();
            Log.a();
        }
        if (!file.exists() || !file.canRead() || !file.isFile()) {
            file.toString();
            Log.a();
            file.toString();
            Log.a();
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charsets.f24671a));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        return sb.toString();
                    }
                    sb.append(line);
                } finally {
                }
            }
        } catch (Exception e2) {
            file.toString();
            e2.toString();
            Log.a();
            return null;
        }
    }

    public static final boolean c(InputStream inputStream, File file) {
        Intrinsics.h(inputStream, "inputStream");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, false);
            try {
                ByteStreamsKt.a(inputStream, fileOutputStream, 4096);
                fileOutputStream.close();
                return true;
            } finally {
            }
        } catch (Exception e) {
            file.getPath();
            e.toString();
            Log.a();
            return false;
        }
    }
}
