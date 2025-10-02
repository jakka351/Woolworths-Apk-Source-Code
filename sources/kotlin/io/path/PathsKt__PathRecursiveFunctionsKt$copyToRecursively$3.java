package kotlin.io.path;

import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$3 implements Function3 {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Exception {
        Exception exception = (Exception) obj3;
        Intrinsics.h((Path) obj, "<unused var>");
        Intrinsics.h((Path) obj2, "<unused var>");
        Intrinsics.h(exception, "exception");
        throw exception;
    }
}
