package coil.fetch;

import coil.decode.DataSource;
import coil.decode.ImageSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/fetch/SourceResult;", "Lcoil/fetch/FetchResult;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SourceResult extends FetchResult {

    /* renamed from: a, reason: collision with root package name */
    public final ImageSource f12995a;
    public final String b;
    public final DataSource c;

    public SourceResult(ImageSource imageSource, String str, DataSource dataSource) {
        this.f12995a = imageSource;
        this.b = str;
        this.c = dataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceResult)) {
            return false;
        }
        SourceResult sourceResult = (SourceResult) obj;
        return Intrinsics.c(this.f12995a, sourceResult.f12995a) && Intrinsics.c(this.b, sourceResult.b) && this.c == sourceResult.c;
    }

    public final int hashCode() {
        int iHashCode = this.f12995a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
