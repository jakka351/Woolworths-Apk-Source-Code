package coil3.fetch;

import coil3.decode.DataSource;
import coil3.decode.ImageSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/fetch/SourceFetchResult;", "Lcoil3/fetch/FetchResult;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SourceFetchResult implements FetchResult {

    /* renamed from: a, reason: collision with root package name */
    public final ImageSource f13100a;
    public final String b;
    public final DataSource c;

    public SourceFetchResult(ImageSource imageSource, String str, DataSource dataSource) {
        this.f13100a = imageSource;
        this.b = str;
        this.c = dataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceFetchResult)) {
            return false;
        }
        SourceFetchResult sourceFetchResult = (SourceFetchResult) obj;
        return Intrinsics.c(this.f13100a, sourceFetchResult.f13100a) && Intrinsics.c(this.b, sourceFetchResult.b) && this.c == sourceFetchResult.c;
    }

    public final int hashCode() {
        int iHashCode = this.f13100a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.f13100a + ", mimeType=" + this.b + ", dataSource=" + this.c + ')';
    }
}
