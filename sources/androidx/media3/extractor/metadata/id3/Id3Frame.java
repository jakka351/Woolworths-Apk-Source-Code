package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class Id3Frame implements Metadata.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final String f3291a;

    public Id3Frame(String str) {
        this.f3291a = str;
    }

    public String toString() {
        return this.f3291a;
    }
}
