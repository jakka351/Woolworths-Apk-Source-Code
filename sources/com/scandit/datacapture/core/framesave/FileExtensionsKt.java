package com.scandit.datacapture.core.framesave;

import java.io.File;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.TransformingSequence;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0003"}, d2 = {"getLastFrameSequenceDirectoryName", "Ljava/io/File;", "getNextFrameSequenceDirectoryName", "scandit-capture-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class FileExtensionsKt {
    @NotNull
    public static final File getLastFrameSequenceDirectoryName(@NotNull File file) {
        Intrinsics.h(file, "<this>");
        TransformingSequence.AnonymousClass1 anonymousClass1 = new TransformingSequence.AnonymousClass1();
        int i = 0;
        while (true) {
            if (!anonymousClass1.d.hasNext()) {
                i = -1;
                break;
            }
            Object next = anonymousClass1.next();
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            if (!((File) next).exists()) {
                break;
            }
            i++;
        }
        int i2 = i - 1;
        return FilesKt.f(file, new File(YU.a.d(i2 >= 0 ? i2 : 0, "sequence_")));
    }

    @NotNull
    public static final File getNextFrameSequenceDirectoryName(@NotNull File file) {
        Intrinsics.h(file, "<this>");
        TransformingSequence.AnonymousClass1 anonymousClass1 = new TransformingSequence.AnonymousClass1();
        while (anonymousClass1.d.hasNext()) {
            File file2 = (File) anonymousClass1.next();
            if (!file2.exists()) {
                return file2;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }
}
