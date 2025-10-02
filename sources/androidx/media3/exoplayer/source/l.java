package androidx.media3.exoplayer.source;

import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.extractor.Extractor;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements Consumer, Function {
    public final /* synthetic */ int d;

    public /* synthetic */ l(int i) {
        this.d = i;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((SampleQueue.SharedSampleMetadata) obj).b.release();
    }

    @Override // com.google.common.base.Function
    public Object apply(Object obj) {
        switch (this.d) {
            case 1:
                return ((Extractor) obj).c().getClass().getSimpleName();
            case 2:
                return ImmutableList.o(Lists.d(((MediaPeriod) obj).i().b, new l(3)));
            default:
                TrackGroupArray trackGroupArray = TrackGroupArray.d;
                return Integer.valueOf(((TrackGroup) obj).c);
        }
    }
}
