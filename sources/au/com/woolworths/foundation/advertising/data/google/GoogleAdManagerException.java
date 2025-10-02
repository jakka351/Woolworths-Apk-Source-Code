package au.com.woolworths.foundation.advertising.data.google;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/advertising/data/google/GoogleAdManagerException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "advertising-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GoogleAdManagerException extends RuntimeException {
    public final String d;

    public GoogleAdManagerException(String str) {
        super(str);
        this.d = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.d;
    }
}
