package androidx.media3.extractor.mp4;

import androidx.media3.common.MimeTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
final class MimeTypeResolver {
    public static String a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((TrackSampleTable) it.next()).f3342a.g.n;
            if (MimeTypes.l(str2)) {
                return "video/mp4";
            }
            if (MimeTypes.i(str2)) {
                z = true;
            } else if (MimeTypes.j(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z ? "audio/mp4" : str != null ? str : "application/mp4";
    }
}
