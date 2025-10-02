package kotlin.io.path;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2 extends FunctionReferenceImpl implements Function2<Path, BasicFileAttributes, FileVisitResult> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Path p0 = (Path) obj;
        BasicFileAttributes p1 = (BasicFileAttributes) obj2;
        Intrinsics.h(p0, "p0");
        Intrinsics.h(p1, "p1");
        try {
            throw null;
        } catch (Exception unused) {
            Intrinsics.h(null, "base");
            try {
                int i = PathRelativizer.f24266a;
                Intrinsics.h(null, "base");
                throw null;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(e.getMessage() + "\nthis path: " + p0 + "\nbase path: null", e);
            }
        }
    }
}
