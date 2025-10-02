package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final class FilesKt__UtilsKt$copyRecursively$1 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws IOException {
        IOException exception = (IOException) obj2;
        Intrinsics.h((File) obj, "<unused var>");
        Intrinsics.h(exception, "exception");
        throw exception;
    }
}
