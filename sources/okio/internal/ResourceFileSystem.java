package okio.internal;

import androidx.lifecycle.d;
import com.dynatrace.android.callback.Callback;
import com.medallia.digital.mobilesdk.q2;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okio.FileHandle;
import okio.FileMetadata;
import okio.FileSystem;
import okio.JvmSystemFileSystem;
import okio.Okio;
import okio.Path;
import okio.Sink;
import okio.Source;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokio/internal/ResourceFileSystem;", "Lokio/FileSystem;", "Companion", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ResourceFileSystem extends FileSystem {
    public static final Path j;
    public final ClassLoader g;
    public final FileSystem h;
    public final Lazy i;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/internal/ResourceFileSystem$Companion;", "", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static final boolean a(Path path) {
            Path path2 = ResourceFileSystem.j;
            return !StringsKt.v(path.b(), ".class", true);
        }

        public static Path b(Path path, Path base) {
            Intrinsics.h(path, "<this>");
            Intrinsics.h(base, "base");
            return ResourceFileSystem.j.e(StringsKt.R(StringsKt.L(base.d.y(), path.d.y()), '\\', '/'));
        }
    }

    static {
        String str = Path.e;
        j = Path.Companion.a(q2.c, false);
    }

    public ResourceFileSystem(ClassLoader classLoader) {
        JvmSystemFileSystem systemFileSystem = FileSystem.d;
        Intrinsics.h(systemFileSystem, "systemFileSystem");
        this.g = classLoader;
        this.h = systemFileSystem;
        this.i = LazyKt.b(new d(this, 15));
    }

    public static String x(Path child) {
        Path path = j;
        path.getClass();
        Intrinsics.h(child, "child");
        return Path.b(path, child, true).d(path).d.y();
    }

    @Override // okio.FileSystem
    public final Sink a(Path file) throws IOException {
        Intrinsics.h(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public final void b(Path source, Path target) throws IOException {
        Intrinsics.h(source, "source");
        Intrinsics.h(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public final void d(Path dir) throws IOException {
        Intrinsics.h(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public final void e(Path path) throws IOException {
        Intrinsics.h(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public final List h(Path dir) throws FileNotFoundException {
        Intrinsics.h(dir, "dir");
        String strX = x(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (Pair pair : (List) this.i.getD()) {
            FileSystem fileSystem = (FileSystem) pair.d;
            Path path = (Path) pair.e;
            try {
                List listH = fileSystem.h(path.e(strX));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listH) {
                    if (Companion.a((Path) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Companion.b((Path) it.next(), path));
                }
                CollectionsKt.h(arrayList2, linkedHashSet);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return CollectionsKt.G0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // okio.FileSystem
    public final List i(Path dir) {
        Intrinsics.h(dir, "dir");
        String strX = x(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((List) this.i.getD()).iterator();
        boolean z = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            Pair pair = (Pair) it.next();
            FileSystem fileSystem = (FileSystem) pair.d;
            Path path = (Path) pair.e;
            List listI = fileSystem.i(path.e(strX));
            if (listI != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listI) {
                    if (Companion.a((Path) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Companion.b((Path) it2.next(), path));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                CollectionsKt.h(arrayList, linkedHashSet);
                z = true;
            }
        }
        if (z) {
            return CollectionsKt.G0(linkedHashSet);
        }
        return null;
    }

    @Override // okio.FileSystem
    public final FileMetadata k(Path path) {
        Intrinsics.h(path, "path");
        if (!Companion.a(path)) {
            return null;
        }
        String strX = x(path);
        for (Pair pair : (List) this.i.getD()) {
            FileMetadata fileMetadataK = ((FileSystem) pair.d).k(((Path) pair.e).e(strX));
            if (fileMetadataK != null) {
                return fileMetadataK;
            }
        }
        return null;
    }

    @Override // okio.FileSystem
    public final FileHandle l(Path path) throws FileNotFoundException {
        if (!Companion.a(path)) {
            throw new FileNotFoundException("file not found: " + path);
        }
        String strX = x(path);
        for (Pair pair : (List) this.i.getD()) {
            try {
                return ((FileSystem) pair.d).l(((Path) pair.e).e(strX));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + path);
    }

    @Override // okio.FileSystem
    public final FileHandle p(Path file) throws IOException {
        Intrinsics.h(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // okio.FileSystem
    public final Sink r(Path file, boolean z) throws IOException {
        Intrinsics.h(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public final Source v(Path file) throws IOException {
        Intrinsics.h(file, "file");
        if (!Companion.a(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        Path path = j;
        path.getClass();
        URL resource = this.g.getResource(Path.b(path, file, false).d(path).d.y());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + file);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        Callback.v(uRLConnectionOpenConnection);
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStreamB = Callback.b(uRLConnectionOpenConnection);
        Intrinsics.g(inputStreamB, "getInputStream(...)");
        return Okio.h(inputStreamB);
    }
}
