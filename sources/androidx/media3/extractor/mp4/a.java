package androidx.media3.extractor.mp4;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.ReorderingSeiMessageQueue;
import androidx.media3.extractor.CeaUtil;
import com.google.common.base.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Function, ReorderingSeiMessageQueue.SeiConsumer {
    public final /* synthetic */ FragmentedMp4Extractor d;

    @Override // com.google.common.base.Function
    public Object apply(Object obj) {
        Track track = (Track) obj;
        this.d.getClass();
        return track;
    }

    @Override // androidx.media3.container.ReorderingSeiMessageQueue.SeiConsumer
    public void f(long j, ParsableByteArray parsableByteArray) {
        CeaUtil.a(j, parsableByteArray, this.d.H);
    }
}
