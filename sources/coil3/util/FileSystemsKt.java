package coil3.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import okio.FileSystem;
import okio.Path;
import okio.Sink;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FileSystemsKt {
    public static void a(FileSystem fileSystem, Path path) throws IOException {
        if (fileSystem.g(path)) {
            return;
        }
        Sink sinkR = fileSystem.r(path, false);
        Function1 function1 = UtilsKt.f13156a;
        try {
            sinkR.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void b(FileSystem fileSystem, Path path) throws IOException {
        try {
            IOException iOException = null;
            for (Path path2 : fileSystem.h(path)) {
                try {
                    if (fileSystem.j(path2).b) {
                        b(fileSystem, path2);
                    }
                    fileSystem.e(path2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
