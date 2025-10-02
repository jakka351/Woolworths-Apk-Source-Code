package androidx.camera.video;

import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public interface VideoCapabilities {

    /* renamed from: a, reason: collision with root package name */
    public static final VideoCapabilities f596a = new AnonymousClass1();

    /* renamed from: androidx.camera.video.VideoCapabilities$1, reason: invalid class name */
    public class AnonymousClass1 implements VideoCapabilities {
        @Override // androidx.camera.video.VideoCapabilities
        public final ArrayList b(DynamicRange dynamicRange) {
            return new ArrayList();
        }
    }

    default VideoValidatedEncoderProfilesProxy a(Size size, DynamicRange dynamicRange) {
        return null;
    }

    ArrayList b(DynamicRange dynamicRange);

    default VideoValidatedEncoderProfilesProxy c(Quality quality, DynamicRange dynamicRange) {
        return null;
    }
}
