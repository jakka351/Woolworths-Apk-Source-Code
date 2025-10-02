package androidx.camera.video.internal.encoder;

import android.util.Range;

/* loaded from: classes2.dex */
public interface VideoEncoderInfo extends EncoderInfo {
    Range a(int i);

    default boolean b(int i, int i2) {
        if (i(i, i2)) {
            return true;
        }
        return g() && i(i2, i);
    }

    Range c();

    Range d(int i);

    Range e();

    Range f();

    boolean g();

    int h();

    boolean i(int i, int i2);

    int j();
}
