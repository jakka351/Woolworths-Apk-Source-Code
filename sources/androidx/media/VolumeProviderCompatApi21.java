package androidx.media;

import android.media.VolumeProvider;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes2.dex */
class VolumeProviderCompatApi21 {

    /* renamed from: androidx.media.VolumeProviderCompatApi21$1, reason: invalid class name */
    final class AnonymousClass1 extends VolumeProvider {
        @Override // android.media.VolumeProvider
        public final void onAdjustVolume(int i) {
            throw null;
        }

        @Override // android.media.VolumeProvider
        public final void onSetVolumeTo(int i) {
            throw null;
        }
    }

    public interface Delegate {
    }
}
