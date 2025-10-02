package androidx.camera.video.internal.audio;

import YU.a;
import androidx.camera.video.internal.audio.AutoValue_AudioSettings;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@AutoValue
/* loaded from: classes2.dex */
public abstract class AudioSettings {

    /* renamed from: a, reason: collision with root package name */
    public static final List f608a = Collections.unmodifiableList(Arrays.asList(48000, 44100, 22050, 11025, 8000, 4800));

    @AutoValue.Builder
    public static abstract class Builder {
        public final AudioSettings a() {
            AutoValue_AudioSettings.Builder builder = (AutoValue_AudioSettings.Builder) this;
            String strG = builder.f611a == null ? " audioSource" : "";
            if (builder.b == null) {
                strG = strG.concat(" sampleRate");
            }
            if (builder.c == null) {
                strG = a.g(strG, " channelCount");
            }
            if (builder.d == null) {
                strG = a.g(strG, " audioFormat");
            }
            if (!strG.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(strG));
            }
            int iIntValue = builder.f611a.intValue();
            int iIntValue2 = builder.b.intValue();
            int iIntValue3 = builder.c.intValue();
            int iIntValue4 = builder.d.intValue();
            AutoValue_AudioSettings autoValue_AudioSettings = new AutoValue_AudioSettings(iIntValue, iIntValue2, iIntValue3, iIntValue4);
            String strG2 = iIntValue != -1 ? "" : " audioSource";
            if (iIntValue2 <= 0) {
                strG2 = strG2.concat(" sampleRate");
            }
            if (iIntValue3 <= 0) {
                strG2 = a.g(strG2, " channelCount");
            }
            if (iIntValue4 == -1) {
                strG2 = a.g(strG2, " audioFormat");
            }
            if (strG2.isEmpty()) {
                return autoValue_AudioSettings;
            }
            throw new IllegalArgumentException("Required settings missing or non-positive:".concat(strG2));
        }

        public abstract Builder b(int i);

        public abstract Builder c(int i);

        public abstract Builder d(int i);

        public abstract Builder e(int i);
    }

    public static Builder a() {
        AutoValue_AudioSettings.Builder builder = new AutoValue_AudioSettings.Builder();
        builder.f611a = -1;
        builder.b = -1;
        builder.c = -1;
        builder.d = -1;
        return builder;
    }

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();
}
