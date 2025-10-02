package androidx.media3.extractor.metadata.scte35;

import android.support.v4.media.session.a;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class PrivateCommand extends SpliceCommand {

    /* renamed from: a, reason: collision with root package name */
    public final long f3297a;
    public final long b;

    public PrivateCommand(long j, long j2) {
        this.f3297a = j2;
        this.b = j;
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.f3297a);
        sb.append(", identifier= ");
        return a.l(this.b, " }", sb);
    }
}
