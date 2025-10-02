package androidx.camera.video;

import androidx.annotation.RestrictTo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.ConstantObservable;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@AutoValue
@RestrictTo
/* loaded from: classes2.dex */
public abstract class StreamInfo {

    /* renamed from: a, reason: collision with root package name */
    public static final StreamInfo f595a = new AutoValue_StreamInfo(0, StreamState.e);
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));
    public static final ConstantObservable c = new ConstantObservable(new AutoValue_StreamInfo(0, StreamState.d));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @RestrictTo
    public static final class StreamState {
        public static final StreamState d;
        public static final StreamState e;
        public static final /* synthetic */ StreamState[] f;

        static {
            StreamState streamState = new StreamState("ACTIVE", 0);
            d = streamState;
            StreamState streamState2 = new StreamState("INACTIVE", 1);
            e = streamState2;
            f = new StreamState[]{streamState, streamState2};
        }

        public static StreamState valueOf(String str) {
            return (StreamState) Enum.valueOf(StreamState.class, str);
        }

        public static StreamState[] values() {
            return (StreamState[]) f.clone();
        }
    }

    public abstract int a();

    public abstract SurfaceRequest.TransformationInfo b();

    public abstract StreamState c();
}
