package androidx.media3.extractor.text;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public final class CuesWithTimingSubtitle implements Subtitle {
    public static final Ordering f = Ordering.c().f(new androidx.media3.extractor.a(10));
    public final ImmutableList d;
    public final long[] e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CuesWithTimingSubtitle(java.util.List r19) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.CuesWithTimingSubtitle.<init>(java.util.List):void");
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final long a(int i) {
        Assertions.b(i < this.d.size());
        return this.e[i];
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final int b() {
        return this.d.size();
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final int c(long j) {
        int iA = Util.a(this.e, j, false);
        if (iA < this.d.size()) {
            return iA;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.extractor.text.Subtitle
    public final List d(long j) {
        int iD = Util.d(this.e, j, false);
        return iD == -1 ? ImmutableList.t() : (ImmutableList) this.d.get(iD);
    }
}
