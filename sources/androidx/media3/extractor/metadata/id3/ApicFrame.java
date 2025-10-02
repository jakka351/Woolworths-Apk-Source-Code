package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public final class ApicFrame extends Id3Frame {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void c(MediaMetadata.Builder builder) {
        builder.a(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ApicFrame.class == obj.getClass()) {
            ApicFrame apicFrame = (ApicFrame) obj;
            if (this.d == apicFrame.d && Objects.equals(this.b, apicFrame.b) && Objects.equals(this.c, apicFrame.c) && Arrays.equals(this.e, apicFrame.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (527 + this.d) * 31;
        String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return Arrays.hashCode(this.e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f3291a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
