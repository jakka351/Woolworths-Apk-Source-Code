package okio;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokio/Path;", "", "Companion", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Path implements Comparable<Path> {
    public static final String e;
    public final ByteString d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokio/Path$Companion;", "", "", "DIRECTORY_SEPARATOR", "Ljava/lang/String;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static Path a(String str, boolean z) {
            Intrinsics.h(str, "<this>");
            ByteString byteString = okio.internal.Path.f26787a;
            Buffer buffer = new Buffer();
            buffer.t0(str);
            return okio.internal.Path.d(buffer, z);
        }

        public static Path b(File file) {
            String str = Path.e;
            String string = file.toString();
            Intrinsics.g(string, "toString(...)");
            return a(string, false);
        }
    }

    static {
        String separator = File.separator;
        Intrinsics.g(separator, "separator");
        e = separator;
    }

    public Path(ByteString bytes) {
        Intrinsics.h(bytes, "bytes");
        this.d = bytes;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = okio.internal.Path.a(this);
        ByteString byteString = this.d;
        if (iA == -1) {
            iA = 0;
        } else if (iA < byteString.c() && byteString.m(iA) == 92) {
            iA++;
        }
        int iC = byteString.c();
        int i = iA;
        while (iA < iC) {
            if (byteString.m(iA) == 47 || byteString.m(iA) == 92) {
                arrayList.add(byteString.t(i, iA));
                i = iA + 1;
            }
            iA++;
        }
        if (i < byteString.c()) {
            arrayList.add(byteString.t(i, byteString.c()));
        }
        return arrayList;
    }

    public final String b() {
        ByteString byteString = okio.internal.Path.f26787a;
        ByteString byteStringU = this.d;
        int iO = ByteString.o(byteStringU, byteString);
        if (iO == -1) {
            iO = ByteString.o(byteStringU, okio.internal.Path.b);
        }
        if (iO != -1) {
            byteStringU = ByteString.u(byteStringU, iO + 1, 0, 2);
        } else if (l() != null && byteStringU.c() == 2) {
            byteStringU = ByteString.g;
        }
        return byteStringU.y();
    }

    public final Path c() {
        ByteString byteString = okio.internal.Path.d;
        ByteString byteString2 = this.d;
        if (Intrinsics.c(byteString2, byteString)) {
            return null;
        }
        ByteString byteString3 = okio.internal.Path.f26787a;
        if (Intrinsics.c(byteString2, byteString3)) {
            return null;
        }
        ByteString byteString4 = okio.internal.Path.b;
        if (Intrinsics.c(byteString2, byteString4)) {
            return null;
        }
        ByteString suffix = okio.internal.Path.e;
        byteString2.getClass();
        Intrinsics.h(suffix, "suffix");
        int iC = byteString2.c();
        byte[] bArr = suffix.data;
        if (byteString2.q(iC - bArr.length, suffix, bArr.length) && (byteString2.c() == 2 || byteString2.q(byteString2.c() - 3, byteString3, 1) || byteString2.q(byteString2.c() - 3, byteString4, 1))) {
            return null;
        }
        int iO = ByteString.o(byteString2, byteString3);
        if (iO == -1) {
            iO = ByteString.o(byteString2, byteString4);
        }
        if (iO == 2 && l() != null) {
            if (byteString2.c() == 3) {
                return null;
            }
            return new Path(ByteString.u(byteString2, 0, 3, 1));
        }
        if (iO == 1 && byteString2.r(byteString4)) {
            return null;
        }
        if (iO != -1 || l() == null) {
            return iO == -1 ? new Path(byteString) : iO == 0 ? new Path(ByteString.u(byteString2, 0, 1, 1)) : new Path(ByteString.u(byteString2, 0, iO, 1));
        }
        if (byteString2.c() == 2) {
            return null;
        }
        return new Path(ByteString.u(byteString2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Path path) {
        Path other = path;
        Intrinsics.h(other, "other");
        return this.d.compareTo(other.d);
    }

    public final Path d(Path other) {
        Intrinsics.h(other, "other");
        ByteString byteString = other.d;
        int iA = okio.internal.Path.a(this);
        ByteString byteString2 = this.d;
        Path path = iA == -1 ? null : new Path(byteString2.t(0, iA));
        int iA2 = okio.internal.Path.a(other);
        if (!Intrinsics.c(path, iA2 != -1 ? new Path(byteString.t(0, iA2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = other.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i = 0;
        while (i < iMin && Intrinsics.c(arrayListA.get(i), arrayListA2.get(i))) {
            i++;
        }
        if (i == iMin && byteString2.c() == byteString.c()) {
            return Companion.a(".", false);
        }
        if (arrayListA2.subList(i, arrayListA2.size()).indexOf(okio.internal.Path.e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (Intrinsics.c(byteString, okio.internal.Path.d)) {
            return this;
        }
        Buffer buffer = new Buffer();
        ByteString byteStringC = okio.internal.Path.c(other);
        if (byteStringC == null && (byteStringC = okio.internal.Path.c(this)) == null) {
            byteStringC = okio.internal.Path.f(e);
        }
        int size = arrayListA2.size();
        for (int i2 = i; i2 < size; i2++) {
            buffer.T(okio.internal.Path.e);
            buffer.T(byteStringC);
        }
        int size2 = arrayListA.size();
        while (i < size2) {
            buffer.T((ByteString) arrayListA.get(i));
            buffer.T(byteStringC);
            i++;
        }
        return okio.internal.Path.d(buffer, false);
    }

    public final Path e(String child) {
        Intrinsics.h(child, "child");
        Buffer buffer = new Buffer();
        buffer.t0(child);
        return okio.internal.Path.b(this, okio.internal.Path.d(buffer, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Path) && Intrinsics.c(((Path) obj).d, this.d);
    }

    public final java.nio.file.Path f() {
        java.nio.file.Path path = Paths.get(this.d.y(), new String[0]);
        Intrinsics.g(path, "get(...)");
        return path;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final Character l() {
        ByteString byteString = okio.internal.Path.f26787a;
        ByteString byteString2 = this.d;
        if (ByteString.f(byteString2, byteString) != -1 || byteString2.c() < 2 || byteString2.m(1) != 58) {
            return null;
        }
        char cM = (char) byteString2.m(0);
        if (('a' > cM || cM >= '{') && ('A' > cM || cM >= '[')) {
            return null;
        }
        return Character.valueOf(cM);
    }

    public final File toFile() {
        return new File(this.d.y());
    }

    public final String toString() {
        return this.d.y();
    }
}
