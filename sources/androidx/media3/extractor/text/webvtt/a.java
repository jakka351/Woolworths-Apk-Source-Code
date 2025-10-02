package androidx.media3.extractor.text.webvtt;

import androidx.media3.extractor.text.webvtt.WebvttCueParser;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Comparator {
    public final /* synthetic */ int d;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return Integer.compare(((WebvttCueParser.Element) obj).f3399a.b, ((WebvttCueParser.Element) obj2).f3399a.b);
            default:
                return Long.compare(((WebvttCueInfo) obj).b, ((WebvttCueInfo) obj2).b);
        }
    }
}
