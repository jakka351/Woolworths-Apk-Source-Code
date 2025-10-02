package coil.key;

import coil.request.Options;
import java.io.File;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil/key/FileKeyer;", "Lcoil/key/Keyer;", "Ljava/io/File;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FileKeyer implements Keyer<File> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12999a;

    public FileKeyer(boolean z) {
        this.f12999a = z;
    }

    @Override // coil.key.Keyer
    public final String a(Object obj, Options options) {
        File file = (File) obj;
        if (!this.f12999a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
