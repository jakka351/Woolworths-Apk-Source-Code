package androidx.media3.exoplayer.video;

import androidx.media3.container.ObuParser;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class Av1SampleDependencyParser {

    /* renamed from: a, reason: collision with root package name */
    public ObuParser.SequenceHeader f3190a;

    public final void a(ArrayList arrayList) {
        ObuParser.SequenceHeader sequenceHeader;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((ObuParser.Obu) arrayList.get(i)).f2949a == 1) {
                try {
                    sequenceHeader = new ObuParser.SequenceHeader((ObuParser.Obu) arrayList.get(i));
                } catch (ObuParser.NotYetImplementedException unused) {
                    sequenceHeader = null;
                }
                this.f3190a = sequenceHeader;
            }
        }
    }
}
