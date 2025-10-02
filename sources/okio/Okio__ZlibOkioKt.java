package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.internal.ZipFilesKt;
import okio.internal.a;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okio"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "okio/Okio")
/* loaded from: classes8.dex */
final /* synthetic */ class Okio__ZlibOkioKt {
    public static final ZipFileSystem a(FileSystem fileSystem, Path path) {
        Intrinsics.h(fileSystem, "<this>");
        return ZipFilesKt.c(path, fileSystem, new a(1));
    }
}
