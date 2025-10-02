package androidx.media3.extractor.metadata.scte35;

import android.support.v4.media.session.a;
import androidx.media3.common.util.UnstableApi;
import java.util.Collections;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public final class SpliceInsertCommand extends SpliceCommand {

    /* renamed from: a, reason: collision with root package name */
    public final long f3299a;
    public final long b;
    public final List c;

    public static final class ComponentSplice {
    }

    public SpliceInsertCommand(List list, long j, long j2) {
        this.f3299a = j;
        this.b = j2;
        this.c = Collections.unmodifiableList(list);
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.f3299a);
        sb.append(", programSplicePlaybackPositionUs= ");
        return a.l(this.b, " }", sb);
    }
}
