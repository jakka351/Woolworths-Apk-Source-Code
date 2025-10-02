package androidx.camera.video;

import com.google.auto.value.AutoValue;

/* loaded from: classes2.dex */
public class FallbackStrategy {

    /* renamed from: a, reason: collision with root package name */
    public static final FallbackStrategy f585a = new AutoValue_FallbackStrategy_RuleStrategy(Quality.g, 0);

    @AutoValue
    public static abstract class RuleStrategy extends FallbackStrategy {
        public abstract Quality a();

        public abstract int b();
    }
}
