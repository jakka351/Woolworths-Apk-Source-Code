package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.internal.SocketAsyncTimeout;

@Metadata(d1 = {"okio/Okio__JvmOkioKt", "okio/Okio__OkioKt", "okio/Okio__ZlibOkioKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Okio {
    public static final Sink a() {
        return new BlackholeSink();
    }

    public static final RealBufferedSink b(Sink sink) {
        Intrinsics.h(sink, "<this>");
        return new RealBufferedSink(sink);
    }

    public static final RealBufferedSource c(Source source) {
        Intrinsics.h(source, "<this>");
        return new RealBufferedSource(source);
    }

    public static final ZipFileSystem d(FileSystem fileSystem, Path path) {
        return Okio__ZlibOkioKt.a(fileSystem, path);
    }

    public static final AsyncTimeout$sink$1 e(java.net.Socket socket) throws IOException {
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.g(outputStream, "getOutputStream(...)");
        return new AsyncTimeout$sink$1(socketAsyncTimeout, new OutputStreamSink(outputStream, socketAsyncTimeout));
    }

    public static final AsyncTimeout$source$1 f(java.net.Socket socket) throws IOException {
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.g(inputStream, "getInputStream(...)");
        return new AsyncTimeout$source$1(socketAsyncTimeout, new InputStreamSource(inputStream, socketAsyncTimeout));
    }

    public static final Source g(File file) {
        Intrinsics.h(file, "<this>");
        return new InputStreamSource(new FileInputStream(file), Timeout.e);
    }

    public static final Source h(InputStream inputStream) {
        Intrinsics.h(inputStream, "<this>");
        return new InputStreamSource(inputStream, new Timeout());
    }
}
