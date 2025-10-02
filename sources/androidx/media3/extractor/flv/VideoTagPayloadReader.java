package androidx.media3.extractor.flv;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.TrackOutput;

/* loaded from: classes2.dex */
final class VideoTagPayloadReader extends TagPayloadReader {
    public final ParsableByteArray b;
    public final ParsableByteArray c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;

    public VideoTagPayloadReader(TrackOutput trackOutput) {
        super(trackOutput);
        this.b = new ParsableByteArray(NalUnitUtil.f2934a);
        this.c = new ParsableByteArray(4);
    }
}
