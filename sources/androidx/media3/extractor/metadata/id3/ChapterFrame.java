package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public final class ChapterFrame extends Id3Frame {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final Id3Frame[] g;

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = id3FrameArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ChapterFrame.class == obj.getClass()) {
            ChapterFrame chapterFrame = (ChapterFrame) obj;
            if (this.c == chapterFrame.c && this.d == chapterFrame.d && this.e == chapterFrame.e && this.f == chapterFrame.f && Objects.equals(this.b, chapterFrame.b) && Arrays.equals(this.g, chapterFrame.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }
}
