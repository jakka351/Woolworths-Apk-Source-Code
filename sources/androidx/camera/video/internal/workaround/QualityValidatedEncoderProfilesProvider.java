package androidx.camera.video.internal.workaround;

import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.Quality;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class QualityValidatedEncoderProfilesProvider implements EncoderProfilesProvider {
    public static final HashMap e;
    public final EncoderProfilesProvider b;
    public final CameraInfoInternal c;
    public final Quirks d;

    static {
        HashMap map = new HashMap();
        e = map;
        map.put(1, Quality.f);
        map.put(8, Quality.d);
        map.put(6, Quality.c);
        map.put(5, Quality.b);
        map.put(4, Quality.f586a);
        map.put(0, Quality.e);
    }

    public QualityValidatedEncoderProfilesProvider(CameraInfoInternal cameraInfoInternal, EncoderProfilesProvider encoderProfilesProvider, Quirks quirks) {
        this.b = encoderProfilesProvider;
        this.c = cameraInfoInternal;
        this.d = quirks;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final EncoderProfilesProxy a(int i) {
        if (b(i)) {
            return this.b.a(i);
        }
        return null;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final boolean b(int i) {
        if (!this.b.b(i)) {
            return false;
        }
        Quality quality = (Quality) e.get(Integer.valueOf(i));
        if (quality == null) {
            return true;
        }
        Iterator it = this.d.c(VideoQualityQuirk.class).iterator();
        while (it.hasNext()) {
            VideoQualityQuirk videoQualityQuirk = (VideoQualityQuirk) it.next();
            if (videoQualityQuirk != null && videoQualityQuirk.d(this.c, quality) && (!(videoQualityQuirk instanceof SurfaceProcessingQuirk) || !((SurfaceProcessingQuirk) videoQualityQuirk).b())) {
                return false;
            }
        }
        return true;
    }
}
