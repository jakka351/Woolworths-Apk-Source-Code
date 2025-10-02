package kotlin.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@JvmName
/* loaded from: classes.dex */
public final class ByteStreamsKt {
    public static final long a(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        Intrinsics.h(inputStream, "<this>");
        byte[] bArr = new byte[i];
        int i2 = inputStream.read(bArr);
        long j = 0;
        while (i2 >= 0) {
            outputStream.write(bArr, 0, i2);
            j += i2;
            i2 = inputStream.read(bArr);
        }
        return j;
    }

    public static final byte[] b(InputStream inputStream) throws IOException {
        Intrinsics.h(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        a(inputStream, byteArrayOutputStream, 8192);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.g(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
