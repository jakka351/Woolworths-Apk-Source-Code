package androidx.media3.extractor.metadata.id3;

import androidx.camera.core.impl.b;
import androidx.media3.common.util.UnstableApi;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public final class UrlLinkFrame extends Id3Frame {
    public final String b;
    public final String c;

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && UrlLinkFrame.class == obj.getClass()) {
            UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
            if (this.f3291a.equals(urlLinkFrame.f3291a) && Objects.equals(this.b, urlLinkFrame.b) && Objects.equals(this.c, urlLinkFrame.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iC = b.c(527, 31, this.f3291a);
        String str = this.b;
        int iHashCode = (iC + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f3291a + ": url=" + this.c;
    }
}
