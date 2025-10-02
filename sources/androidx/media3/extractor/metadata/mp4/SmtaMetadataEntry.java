package androidx.media3.extractor.metadata.mp4;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final float f3296a;
    public final int b;

    public SmtaMetadataEntry(float f, int i) {
        this.f3296a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SmtaMetadataEntry.class == obj.getClass()) {
            SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
            if (this.f3296a == smtaMetadataEntry.f3296a && this.b == smtaMetadataEntry.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f3296a).hashCode() + 527) * 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f3296a + ", svcTemporalLayerCount=" + this.b;
    }
}
