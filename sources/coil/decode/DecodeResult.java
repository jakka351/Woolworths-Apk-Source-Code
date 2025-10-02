package coil.decode;

import android.graphics.drawable.BitmapDrawable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/decode/DecodeResult;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DecodeResult {

    /* renamed from: a, reason: collision with root package name */
    public final BitmapDrawable f12975a;
    public final boolean b;

    public DecodeResult(BitmapDrawable bitmapDrawable, boolean z) {
        this.f12975a = bitmapDrawable;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecodeResult)) {
            return false;
        }
        DecodeResult decodeResult = (DecodeResult) obj;
        return this.f12975a.equals(decodeResult.f12975a) && this.b == decodeResult.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f12975a.hashCode() * 31);
    }
}
