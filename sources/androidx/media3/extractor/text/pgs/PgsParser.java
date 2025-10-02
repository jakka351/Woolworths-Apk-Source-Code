package androidx.media3.extractor.text.pgs;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.zip.Inflater;

@UnstableApi
/* loaded from: classes2.dex */
public final class PgsParser implements SubtitleParser {

    /* renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f3375a = new ParsableByteArray();
    public final ParsableByteArray b = new ParsableByteArray();
    public final CueBuilder c = new CueBuilder();
    public Inflater d;

    public static final class CueBuilder {

        /* renamed from: a, reason: collision with root package name */
        public final ParsableByteArray f3376a = new ParsableByteArray();
        public final int[] b = new int[256];
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    @Override // androidx.media3.extractor.text.SubtitleParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(byte[] r26, int r27, int r28, androidx.media3.extractor.text.SubtitleParser.OutputOptions r29, androidx.media3.common.util.Consumer r30) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.pgs.PgsParser.a(byte[], int, int, androidx.media3.extractor.text.SubtitleParser$OutputOptions, androidx.media3.common.util.Consumer):void");
    }
}
