package androidx.media3.extractor.text;

import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public class CuesWithTiming {

    /* renamed from: a, reason: collision with root package name */
    public final ImmutableList f3353a;
    public final long b;
    public final long c;
    public final long d;

    public CuesWithTiming(List list, long j, long j2) {
        this.f3353a = ImmutableList.o(list);
        this.b = j;
        this.c = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.d = j3;
    }
}
