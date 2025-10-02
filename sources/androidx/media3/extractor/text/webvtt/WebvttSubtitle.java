package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.Subtitle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class WebvttSubtitle implements Subtitle {
    public final List d;
    public final long[] e;
    public final long[] f;

    public WebvttSubtitle(ArrayList arrayList) {
        this.d = Collections.unmodifiableList(new ArrayList(arrayList));
        this.e = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            WebvttCueInfo webvttCueInfo = (WebvttCueInfo) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = this.e;
            jArr[i2] = webvttCueInfo.b;
            jArr[i2 + 1] = webvttCueInfo.c;
        }
        long[] jArr2 = this.e;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final long a(int i) {
        Assertions.b(i >= 0);
        long[] jArr = this.f;
        Assertions.b(i < jArr.length);
        return jArr[i];
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final int b() {
        return this.f.length;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final int c(long j) {
        long[] jArr = this.f;
        int iA = Util.a(jArr, j, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final List d(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = this.d;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = this.e;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                WebvttCueInfo webvttCueInfo = (WebvttCueInfo) list.get(i);
                Cue cue = webvttCueInfo.f3397a;
                if (cue.e == -3.4028235E38f) {
                    arrayList2.add(webvttCueInfo);
                } else {
                    arrayList.add(cue);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new a(1));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            Cue.Builder builderA = ((WebvttCueInfo) arrayList2.get(i3)).f3397a.a();
            builderA.e = (-1) - i3;
            builderA.f = 1;
            arrayList.add(builderA.a());
        }
        return arrayList;
    }
}
