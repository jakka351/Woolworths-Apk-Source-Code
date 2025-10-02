package kotlin.io;

import io.jsonwebtoken.JwtParser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractIterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"kotlin/io/FilesKt__FilePathComponentsKt", "kotlin/io/FilesKt__FileReadWriteKt", "kotlin/io/FilesKt__FileTreeWalkKt", "kotlin/io/FilesKt__UtilsKt"}, k = 4, mv = {2, 2, 0}, xi = 49)
/* loaded from: classes.dex */
public final class FilesKt extends FilesKt__UtilsKt {
    public static boolean b(File file) {
        FileWalkDirection fileWalkDirection = FileWalkDirection.d;
        Iterator it = new FileTreeWalk(file).iterator();
        while (true) {
            boolean z = true;
            while (true) {
                AbstractIterator abstractIterator = (AbstractIterator) it;
                if (!abstractIterator.hasNext()) {
                    return z;
                }
                File file2 = (File) abstractIterator.next();
                if (!file2.delete() && file2.exists()) {
                    z = false;
                } else {
                    if (z) {
                        break;
                    }
                    z = false;
                }
            }
        }
    }

    public static String c(File file) {
        Intrinsics.h(file, "<this>");
        String name = file.getName();
        Intrinsics.g(name, "getName(...)");
        return StringsKt.a0(JwtParser.SEPARATOR_CHAR, name, "");
    }

    public static byte[] d(File file) throws IOException {
        Intrinsics.h(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyOf = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream.read(bArrCopyOf, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
                Intrinsics.g(bArrCopyOf, "copyOf(...)");
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    ExposingBufferByteArrayOutputStream exposingBufferByteArrayOutputStream = new ExposingBufferByteArrayOutputStream();
                    exposingBufferByteArrayOutputStream.write(i5);
                    ByteStreamsKt.a(fileInputStream, exposingBufferByteArrayOutputStream, 8192);
                    int size = exposingBufferByteArrayOutputStream.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrA = exposingBufferByteArrayOutputStream.a();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    Intrinsics.g(bArrCopyOf, "copyOf(...)");
                    ArraysKt.p(i, 0, exposingBufferByteArrayOutputStream.size(), bArrA, bArrCopyOf);
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static String e(File file, Charset charset) {
        Intrinsics.h(file, "<this>");
        Intrinsics.h(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strB = TextStreamsKt.b(inputStreamReader);
            inputStreamReader.close();
            return strB;
        } finally {
        }
    }

    public static File f(File file, File file2) {
        int length;
        int iB;
        Intrinsics.h(file, "<this>");
        String path = file2.getPath();
        Intrinsics.g(path, "getPath(...)");
        char c = File.separatorChar;
        int iB2 = StringsKt.B(path, c, 0, 4);
        if (iB2 != 0) {
            length = (iB2 <= 0 || path.charAt(iB2 + (-1)) != ':') ? (iB2 == -1 && StringsKt.w(path, ':')) ? path.length() : 0 : iB2 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c || (iB = StringsKt.B(path, c, 2, 4)) < 0) {
            length = 1;
        } else {
            int iB3 = StringsKt.B(path, c, iB + 1, 4);
            length = iB3 >= 0 ? iB3 + 1 : path.length();
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        Intrinsics.g(string, "toString(...)");
        if ((string.length() == 0) || StringsKt.w(string, c)) {
            return new File(string + file2);
        }
        return new File(string + c + file2);
    }

    public static void g(File file, byte[] array) throws IOException {
        Intrinsics.h(file, "<this>");
        Intrinsics.h(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            fileOutputStream.close();
        } finally {
        }
    }

    public static void h(File file, String str, Charset charset) {
        Intrinsics.h(file, "<this>");
        Intrinsics.h(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            FilesKt__FileReadWriteKt.a(fileOutputStream, str, charset);
            fileOutputStream.close();
        } finally {
        }
    }
}
