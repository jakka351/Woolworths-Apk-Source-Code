package androidx.media3.extractor.text;

import androidx.media3.common.util.Consumer;
import androidx.media3.extractor.text.SubtitleExtractor;
import com.google.common.collect.ImmutableList;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Consumer {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        switch (this.d) {
            case 0:
                SubtitleExtractor subtitleExtractor = (SubtitleExtractor) this.e;
                CuesWithTiming cuesWithTiming = (CuesWithTiming) obj;
                SubtitleExtractor.Sample sample = new SubtitleExtractor.Sample(cuesWithTiming.b, CueEncoder.a(cuesWithTiming.f3353a, cuesWithTiming.c));
                subtitleExtractor.c.add(sample);
                long j = subtitleExtractor.j;
                if (j == -9223372036854775807L || cuesWithTiming.b >= j) {
                    subtitleExtractor.b(sample);
                    break;
                }
                break;
            default:
                ((ImmutableList.Builder) this.e).h((CuesWithTiming) obj);
                break;
        }
    }
}
