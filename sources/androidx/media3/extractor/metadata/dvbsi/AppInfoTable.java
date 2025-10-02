package androidx.media3.extractor.metadata.dvbsi;

import YU.a;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class AppInfoTable implements Metadata.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final int f3281a;
    public final String b;

    public AppInfoTable(int i, String str) {
        this.f3281a = i;
        this.b = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f3281a);
        sb.append(",url=");
        return a.o(sb, this.b, ")");
    }
}
