package androidx.media3.extractor.metadata.id3;

import androidx.camera.core.impl.b;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes2.dex */
public final class BinaryFrame extends Id3Frame {
    public final byte[] b;

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BinaryFrame.class == obj.getClass()) {
            BinaryFrame binaryFrame = (BinaryFrame) obj;
            if (this.f3291a.equals(binaryFrame.f3291a) && Arrays.equals(this.b, binaryFrame.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + b.c(527, 31, this.f3291a);
    }
}
