package androidx.media3.extractor.metadata.icy;

import YU.a;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes2.dex */
public final class IcyInfo implements Metadata.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3288a;
    public final String b;
    public final String c;

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.f3288a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void c(MediaMetadata.Builder builder) {
        String str = this.b;
        if (str != null) {
            builder.f2867a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f3288a, ((IcyInfo) obj).f3288a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3288a);
    }

    public final String toString() {
        return a.m(a.v("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""), this.f3288a.length, "\"");
    }
}
