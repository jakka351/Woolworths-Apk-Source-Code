package okhttp3.internal.publicsuffix;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;
import okio.Path;
import okio.Source;
import okio.internal.ResourceFileSystem;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/publicsuffix/ResourcePublicSuffixList;", "Lokhttp3/internal/publicsuffix/BasePublicSuffixList;", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ResourcePublicSuffixList extends BasePublicSuffixList {
    public static final Path h;
    public final Path f;
    public final FileSystem g;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/publicsuffix/ResourcePublicSuffixList$Companion;", "", "<init>", "()V", "PUBLIC_SUFFIX_RESOURCE", "Lokio/Path;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        String str = Path.e;
        h = Path.Companion.a("okhttp3/internal/publicsuffix/PublicSuffixDatabase.list", false);
    }

    public ResourcePublicSuffixList() {
        ResourceFileSystem fileSystem = FileSystem.f;
        Path path = h;
        Intrinsics.h(path, "path");
        Intrinsics.h(fileSystem, "fileSystem");
        this.f = path;
        this.g = fileSystem;
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public final Source b() {
        return this.g.v(this.f);
    }
}
