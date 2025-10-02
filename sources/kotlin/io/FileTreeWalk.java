package kotlin.io;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/FileTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "WalkState", "DirectoryState", "FileTreeWalkIterator", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FileTreeWalk implements Sequence<File> {

    /* renamed from: a, reason: collision with root package name */
    public final File f24261a;
    public final FileWalkDirection b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\"\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/FileTreeWalk$DirectoryState;", "Lkotlin/io/FileTreeWalk$WalkState;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static abstract class DirectoryState extends WalkState {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;", "Lkotlin/collections/AbstractIterator;", "Ljava/io/File;", "BottomUpDirectoryState", "TopDownDirectoryState", "SingleFileState", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class FileTreeWalkIterator extends AbstractIterator<File> {
        public final ArrayDeque f;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public final class BottomUpDirectoryState extends DirectoryState {
            public boolean b;
            public File[] c;
            public int d;
            public boolean e;

            @Override // kotlin.io.FileTreeWalk.WalkState
            public final File a() {
                boolean z = this.e;
                File file = this.f24262a;
                if (!z && this.c == null) {
                    File[] fileArrListFiles = file.listFiles();
                    this.c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        this.e = true;
                    }
                }
                File[] fileArr = this.c;
                if (fileArr == null || this.d >= fileArr.length) {
                    if (this.b) {
                        return null;
                    }
                    this.b = true;
                    return file;
                }
                Intrinsics.e(fileArr);
                int i = this.d;
                this.d = i + 1;
                return fileArr[i];
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState;", "Lkotlin/io/FileTreeWalk$WalkState;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @SourceDebugExtension
        public final class SingleFileState extends WalkState {
            public boolean b;

            @Override // kotlin.io.FileTreeWalk.WalkState
            public final File a() {
                if (this.b) {
                    return null;
                }
                this.b = true;
                return this.f24262a;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public final class TopDownDirectoryState extends DirectoryState {
            public boolean b;
            public File[] c;
            public int d;

            @Override // kotlin.io.FileTreeWalk.WalkState
            public final File a() {
                boolean z = this.b;
                File file = this.f24262a;
                if (!z) {
                    this.b = true;
                    return file;
                }
                File[] fileArr = this.c;
                if (fileArr != null && this.d >= fileArr.length) {
                    return null;
                }
                if (fileArr == null) {
                    File[] fileArrListFiles = file.listFiles();
                    this.c = fileArrListFiles;
                    if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                        return null;
                    }
                }
                File[] fileArr2 = this.c;
                Intrinsics.e(fileArr2);
                int i = this.d;
                this.d = i + 1;
                return fileArr2[i];
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    FileWalkDirection fileWalkDirection = FileWalkDirection.d;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        public FileTreeWalkIterator() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f = arrayDeque;
            File file = FileTreeWalk.this.f24261a;
            if (file.isDirectory()) {
                arrayDeque.push(b(file));
            } else if (file.isFile()) {
                arrayDeque.push(new SingleFileState(file));
            } else {
                this.d = 2;
            }
        }

        @Override // kotlin.collections.AbstractIterator
        public final void a() {
            File file;
            File fileA;
            while (true) {
                ArrayDeque arrayDeque = this.f;
                WalkState walkState = (WalkState) arrayDeque.peek();
                if (walkState == null) {
                    file = null;
                    break;
                }
                fileA = walkState.a();
                if (fileA == null) {
                    arrayDeque.pop();
                } else if (fileA.equals(walkState.f24262a) || !fileA.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    break;
                } else {
                    arrayDeque.push(b(fileA));
                }
            }
            file = fileA;
            if (file == null) {
                this.d = 2;
            } else {
                this.e = file;
                this.d = 1;
            }
        }

        public final DirectoryState b(File file) {
            int iOrdinal = FileTreeWalk.this.b.ordinal();
            if (iOrdinal == 0) {
                return new TopDownDirectoryState(file);
            }
            if (iOrdinal == 1) {
                return new BottomUpDirectoryState(file);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\"\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/FileTreeWalk$WalkState;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class WalkState {

        /* renamed from: a, reason: collision with root package name */
        public final File f24262a;

        public WalkState(File file) {
            this.f24262a = file;
        }

        public abstract File a();
    }

    public FileTreeWalk(File file) {
        FileWalkDirection fileWalkDirection = FileWalkDirection.d;
        this.f24261a = file;
        this.b = fileWalkDirection;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new FileTreeWalkIterator();
    }
}
