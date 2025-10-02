package io.noties.markwon.image.destination;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes7.dex */
public class ImageDestinationProcessorAssets extends ImageDestinationProcessor {
    @Override // io.noties.markwon.image.destination.ImageDestinationProcessor
    public final String b(String str) {
        if (TextUtils.isEmpty(Uri.parse(str).getScheme())) {
            throw null;
        }
        return str;
    }
}
