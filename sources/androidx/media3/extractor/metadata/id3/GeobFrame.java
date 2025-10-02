package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public final class GeobFrame extends Id3Frame {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && GeobFrame.class == obj.getClass()) {
            GeobFrame geobFrame = (GeobFrame) obj;
            if (Objects.equals(this.b, geobFrame.b) && Objects.equals(this.c, geobFrame.c) && Objects.equals(this.d, geobFrame.d) && Arrays.equals(this.e, geobFrame.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return Arrays.hashCode(this.e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f3291a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }
}
