package androidx.compose.ui.text.font;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceRequest;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TypefaceRequest {

    /* renamed from: a, reason: collision with root package name */
    public final FontFamily f2106a;
    public final FontWeight b;
    public final int c;
    public final int d;
    public final Object e;

    public TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i, int i2, Object obj) {
        this.f2106a = fontFamily;
        this.b = fontWeight;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypefaceRequest)) {
            return false;
        }
        TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
        return Intrinsics.c(this.f2106a, typefaceRequest.f2106a) && Intrinsics.c(this.b, typefaceRequest.b) && this.c == typefaceRequest.c && this.d == typefaceRequest.d && Intrinsics.c(this.e, typefaceRequest.e);
    }

    public final int hashCode() {
        FontFamily fontFamily = this.f2106a;
        int iA = b.a(this.d, b.a(this.c, (((fontFamily == null ? 0 : fontFamily.hashCode()) * 31) + this.b.d) * 31, 31), 31);
        Object obj = this.e;
        return iA + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f2106a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        sb.append((Object) FontStyle.a(this.c));
        sb.append(", fontSynthesis=");
        int i = this.d;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Weight" : i == 2 ? "Style" : i == 65535 ? "All" : "Invalid"));
        sb.append(", resourceLoaderCacheKey=");
        return a.s(sb, this.e, ')');
    }
}
