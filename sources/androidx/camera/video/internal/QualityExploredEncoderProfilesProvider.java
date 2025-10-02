package androidx.camera.video.internal;

import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;

/* loaded from: classes2.dex */
public class QualityExploredEncoderProfilesProvider implements EncoderProfilesProvider {
    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final EncoderProfilesProxy a(int i) {
        return c(i);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final boolean b(int i) {
        return c(i) != null;
    }

    public final EncoderProfilesProxy c(int i) {
        throw null;
    }
}
