package androidx.media3.exoplayer.text;

import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.UnstableApi;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public interface TextOutput {
    default void q(List list) {
    }

    void t(CueGroup cueGroup);
}
