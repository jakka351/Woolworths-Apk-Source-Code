package androidx.media3.extractor.text.cea;

import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.text.Subtitle;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class CeaSubtitle implements Subtitle {
    public final List d;

    public CeaSubtitle(List list) {
        this.d = list;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final long a(int i) {
        Assertions.b(i == 0);
        return 0L;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final int b() {
        return 1;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final int c(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final List d(long j) {
        return j >= 0 ? this.d : Collections.EMPTY_LIST;
    }
}
