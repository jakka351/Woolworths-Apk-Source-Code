package androidx.camera.video;

import android.util.Size;
import androidx.annotation.RestrictTo;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public class Quality {

    /* renamed from: a, reason: collision with root package name */
    public static final Quality f586a;
    public static final Quality b;
    public static final Quality c;
    public static final Quality d;
    public static final Quality e;
    public static final Quality f;
    public static final Quality g;
    public static final HashSet h;
    public static final List i;

    @AutoValue
    @RestrictTo
    public static abstract class ConstantQuality extends Quality {
        public abstract String a();

        public abstract List b();

        public abstract int c();
    }

    static {
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality = new AutoValue_Quality_ConstantQuality("SD", 4, Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        f586a = autoValue_Quality_ConstantQuality;
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality2 = new AutoValue_Quality_ConstantQuality("HD", 5, Collections.singletonList(new Size(1280, 720)));
        b = autoValue_Quality_ConstantQuality2;
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality3 = new AutoValue_Quality_ConstantQuality("FHD", 6, Collections.singletonList(new Size(1920, 1080)));
        c = autoValue_Quality_ConstantQuality3;
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality4 = new AutoValue_Quality_ConstantQuality("UHD", 8, Collections.singletonList(new Size(3840, 2160)));
        d = autoValue_Quality_ConstantQuality4;
        List list = Collections.EMPTY_LIST;
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality5 = new AutoValue_Quality_ConstantQuality("LOWEST", 0, list);
        e = autoValue_Quality_ConstantQuality5;
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality6 = new AutoValue_Quality_ConstantQuality("HIGHEST", 1, list);
        f = autoValue_Quality_ConstantQuality6;
        g = new AutoValue_Quality_ConstantQuality("NONE", -1, list);
        h = new HashSet(Arrays.asList(autoValue_Quality_ConstantQuality5, autoValue_Quality_ConstantQuality6, autoValue_Quality_ConstantQuality, autoValue_Quality_ConstantQuality2, autoValue_Quality_ConstantQuality3, autoValue_Quality_ConstantQuality4));
        i = Arrays.asList(autoValue_Quality_ConstantQuality4, autoValue_Quality_ConstantQuality3, autoValue_Quality_ConstantQuality2, autoValue_Quality_ConstantQuality);
    }
}
