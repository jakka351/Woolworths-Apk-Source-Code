package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public final class ChapterTocFrame extends Id3Frame {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final Id3Frame[] f;

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = id3FrameArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ChapterTocFrame.class == obj.getClass()) {
            ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
            if (this.c == chapterTocFrame.c && this.d == chapterTocFrame.d && Objects.equals(this.b, chapterTocFrame.b) && Arrays.equals(this.e, chapterTocFrame.e) && Arrays.equals(this.f, chapterTocFrame.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }
}
