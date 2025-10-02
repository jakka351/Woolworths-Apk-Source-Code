package androidx.media3.extractor.mp4;

import com.google.common.base.Splitter;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class SefReader {
    public static final Splitter d = Splitter.a(':');
    public static final Splitter e = Splitter.a('*');

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3336a = new ArrayList();
    public int b = 0;
    public int c;

    public static final class DataReference {

        /* renamed from: a, reason: collision with root package name */
        public final long f3337a;
        public final int b;

        public DataReference(long j, int i) {
            this.f3337a = j;
            this.b = i;
        }
    }
}
