package coil.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import okio.FileSystem;
import okio.Path;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName
/* renamed from: coil.util.-FileSystems, reason: invalid class name */
/* loaded from: classes4.dex */
public final class FileSystems {
    public static final void a(FileSystem fileSystem, Path path) throws IOException {
        try {
            IOException iOException = null;
            for (Path path2 : fileSystem.h(path)) {
                try {
                    if (fileSystem.j(path2).b) {
                        a(fileSystem, path2);
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
