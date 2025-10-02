package androidx.camera.video.internal.encoder;

import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes2.dex */
public abstract class VideoEncoderDataSpace {

    /* renamed from: a, reason: collision with root package name */
    public static final VideoEncoderDataSpace f635a = new AutoValue_VideoEncoderDataSpace(0, 0, 0);
    public static final VideoEncoderDataSpace b = new AutoValue_VideoEncoderDataSpace(1, 3, 2);
    public static final VideoEncoderDataSpace c = new AutoValue_VideoEncoderDataSpace(6, 7, 1);
    public static final VideoEncoderDataSpace d = new AutoValue_VideoEncoderDataSpace(6, 6, 1);

    public abstract int a();

    public abstract int b();

    public abstract int c();
}
