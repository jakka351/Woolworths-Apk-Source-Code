package coil.fetch;

import android.webkit.MimeTypeMap;
import coil.decode.DataSource;
import coil.decode.FileImageSource;
import coil.fetch.Fetcher;
import coil.request.Options;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.io.FilesKt;
import okio.FileSystem;
import okio.Path;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/fetch/FileFetcher;", "Lcoil/fetch/Fetcher;", "Factory", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FileFetcher implements Fetcher {

    /* renamed from: a, reason: collision with root package name */
    public final File f12991a;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil/fetch/FileFetcher$Factory;", "Lcoil/fetch/Fetcher$Factory;", "Ljava/io/File;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Factory implements Fetcher.Factory<File> {
        @Override // coil.fetch.Fetcher.Factory
        public final Fetcher a(Object obj, Options options) {
            return new FileFetcher((File) obj);
        }
    }

    public FileFetcher(File file) {
        this.f12991a = file;
    }

    @Override // coil.fetch.Fetcher
    public final Object a(Continuation continuation) {
        String str = Path.e;
        File file = this.f12991a;
        return new SourceResult(new FileImageSource(Path.Companion.b(file), FileSystem.d, null, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(FilesKt.c(file)), DataSource.f);
    }
}
