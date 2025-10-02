package androidx.camera.core.impl;

import com.google.auto.value.AutoValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public interface EncoderProfilesProxy {

    @AutoValue
    public static abstract class AudioProfileProxy {

        @Retention(RetentionPolicy.SOURCE)
        public @interface AudioEncoder {
        }

        public static AudioProfileProxy a(String str, int i, int i2, int i3, int i4, int i5) {
            return new AutoValue_EncoderProfilesProxy_AudioProfileProxy(str, i, i2, i3, i4, i5);
        }

        public abstract int b();

        public abstract int c();

        public abstract int d();

        public abstract String e();

        public abstract int f();

        public abstract int g();
    }

    @AutoValue
    public static abstract class ImmutableEncoderProfilesProxy implements EncoderProfilesProxy {
        public static ImmutableEncoderProfilesProxy e(int i, int i2, List list, List list2) {
            return new AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy(i, i2, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
        }
    }

    @AutoValue
    public static abstract class VideoProfileProxy {

        @Retention(RetentionPolicy.SOURCE)
        public @interface VideoEncoder {
        }

        public static VideoProfileProxy a(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            return new AutoValue_EncoderProfilesProxy_VideoProfileProxy(i, str, i2, i3, i4, i5, i6, i7, i8, i9);
        }

        public abstract int b();

        public abstract int c();

        public abstract int d();

        public abstract int e();

        public abstract int f();

        public abstract int g();

        public abstract int h();

        public abstract String i();

        public abstract int j();

        public abstract int k();
    }

    int a();

    List b();

    int c();

    List d();
}
