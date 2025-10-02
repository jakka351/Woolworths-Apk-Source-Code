package kotlin.io;

import java.io.File;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/NoSuchFileException;", "Lkotlin/io/FileSystemException;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoSuchFileException extends FileSystemException {
    public NoSuchFileException(File file) {
        super(ExceptionsKt.a(file, null, "The source file doesn't exist."));
    }
}
