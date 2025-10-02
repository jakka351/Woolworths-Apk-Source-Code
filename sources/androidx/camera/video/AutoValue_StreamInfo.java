package androidx.camera.video;

import androidx.camera.core.SurfaceRequest;
import androidx.camera.video.StreamInfo;

/* loaded from: classes2.dex */
final class AutoValue_StreamInfo extends StreamInfo {
    public final int d;
    public final StreamInfo.StreamState e;

    public AutoValue_StreamInfo(int i, StreamInfo.StreamState streamState) {
        this.d = i;
        this.e = streamState;
    }

    @Override // androidx.camera.video.StreamInfo
    public final int a() {
        return this.d;
    }

    @Override // androidx.camera.video.StreamInfo
    public final SurfaceRequest.TransformationInfo b() {
        return null;
    }

    @Override // androidx.camera.video.StreamInfo
    public final StreamInfo.StreamState c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StreamInfo)) {
            return false;
        }
        StreamInfo streamInfo = (StreamInfo) obj;
        return this.d == streamInfo.a() && this.e.equals(streamInfo.c()) && streamInfo.b() == null;
    }

    public final int hashCode() {
        return (((this.d ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003;
    }

    public final String toString() {
        return "StreamInfo{id=" + this.d + ", streamState=" + this.e + ", inProgressTransformationInfo=null}";
    }
}
