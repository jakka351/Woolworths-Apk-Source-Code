package androidx.camera.video.internal.audio;

import android.support.v4.media.session.a;
import androidx.camera.video.internal.audio.AudioStream;

/* loaded from: classes2.dex */
final class AutoValue_AudioStream_PacketInfo extends AudioStream.PacketInfo {
    @Override // androidx.camera.video.internal.audio.AudioStream.PacketInfo
    public final int a() {
        return 0;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream.PacketInfo
    public final long b() {
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioStream.PacketInfo)) {
            return false;
        }
        AudioStream.PacketInfo packetInfo = (AudioStream.PacketInfo) obj;
        return packetInfo.a() == 0 && 0 == packetInfo.b();
    }

    public final int hashCode() {
        return ((int) (0 ^ (0 >>> 32))) ^ ((1000003 ^ 0) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PacketInfo{sizeInBytes=");
        sb.append(0);
        sb.append(", timestampNs=");
        return a.l(0L, "}", sb);
    }
}
