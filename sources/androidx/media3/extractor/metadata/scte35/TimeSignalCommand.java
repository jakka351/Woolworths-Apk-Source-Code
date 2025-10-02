package androidx.media3.extractor.metadata.scte35;

import android.support.v4.media.session.a;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class TimeSignalCommand extends SpliceCommand {

    /* renamed from: a, reason: collision with root package name */
    public final long f3302a;
    public final long b;

    public TimeSignalCommand(long j, long j2) {
        this.f3302a = j;
        this.b = j2;
    }

    public static long d(long j, ParsableByteArray parsableByteArray) {
        long jU = parsableByteArray.u();
        if ((128 & jU) != 0) {
            return 8589934591L & ((((jU & 1) << 32) | parsableByteArray.w()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.f3302a);
        sb.append(", playbackPositionUs= ");
        return a.l(this.b, " }", sb);
    }
}
