package androidx.media3.exoplayer.text;

import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.collect.ImmutableList;

/* loaded from: classes2.dex */
interface CuesResolver {
    ImmutableList a(long j);

    long b(long j);

    void c(long j);

    void clear();

    boolean d(CuesWithTiming cuesWithTiming, long j);

    long e(long j);
}
