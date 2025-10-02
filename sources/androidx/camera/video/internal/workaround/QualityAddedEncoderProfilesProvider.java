package androidx.camera.video.internal.workaround;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import androidx.camera.video.internal.config.VideoConfigUtil;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class QualityAddedEncoderProfilesProvider implements EncoderProfilesProvider {
    public final EncoderProfilesProvider b;
    public final HashMap c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.HashMap] */
    public QualityAddedEncoderProfilesProvider(CameraInfoInternal cameraInfoInternal, EncoderProfilesProvider encoderProfilesProvider, Quirks quirks) {
        this.b = encoderProfilesProvider;
        ArrayList arrayListC = quirks.c(ExtraSupportedQualityQuirk.class);
        if (arrayListC.isEmpty()) {
            return;
        }
        ?? map = 0;
        VideoEncoderInfo videoEncoderInfoK = null;
        map = 0;
        map = 0;
        Preconditions.f(null, arrayListC.size() == 1);
        ((ExtraSupportedQualityQuirk) arrayListC.get(0)).getClass();
        if (!"motorola".equalsIgnoreCase(Build.BRAND) || !"moto c".equalsIgnoreCase(Build.MODEL)) {
            map = Collections.EMPTY_MAP;
        } else if ("1".equals(cameraInfoInternal.b()) && !encoderProfilesProvider.b(4)) {
            EncoderProfilesProxy encoderProfilesProxyA = encoderProfilesProvider.a(1);
            EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = (encoderProfilesProxyA == null || encoderProfilesProxyA.d().isEmpty()) ? null : (EncoderProfilesProxy.VideoProfileProxy) encoderProfilesProxyA.d().get(0);
            if (videoProfileProxy != null) {
                try {
                    videoEncoderInfoK = VideoEncoderInfoWrapper.k(VideoEncoderInfoImpl.k(VideoConfigUtil.e(videoProfileProxy)), null);
                } catch (InvalidConfigException e) {
                    Logger.f("VideoEncoderInfoImpl", "Unable to find a VideoEncoderInfoImpl", e);
                }
                Range rangeC = videoEncoderInfoK != null ? videoEncoderInfoK.c() : VideoSpec.b;
                Size size = SizeUtil.d;
                EncoderProfilesProxy.ImmutableEncoderProfilesProxy immutableEncoderProfilesProxyE = EncoderProfilesProxy.ImmutableEncoderProfilesProxy.e(encoderProfilesProxyA.c(), encoderProfilesProxyA.a(), encoderProfilesProxyA.b(), Collections.singletonList(EncoderProfilesProxy.VideoProfileProxy.a(videoProfileProxy.e(), videoProfileProxy.i(), VideoConfigUtil.d(videoProfileProxy.c(), videoProfileProxy.b(), videoProfileProxy.b(), videoProfileProxy.f(), videoProfileProxy.f(), size.getWidth(), videoProfileProxy.k(), size.getHeight(), videoProfileProxy.h(), rangeC), videoProfileProxy.f(), size.getWidth(), size.getHeight(), videoProfileProxy.j(), videoProfileProxy.b(), videoProfileProxy.d(), videoProfileProxy.g())));
                map = new HashMap();
                map.put(4, immutableEncoderProfilesProxyE);
                Size size2 = new Size(videoProfileProxy.k(), videoProfileProxy.h());
                if (size.getHeight() * size.getWidth() > size2.getHeight() * size2.getWidth()) {
                    map.put(1, immutableEncoderProfilesProxyE);
                }
            }
        }
        if (map != 0) {
            this.c = new HashMap((Map) map);
        }
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final EncoderProfilesProxy a(int i) {
        return c(i);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final boolean b(int i) {
        return c(i) != null;
    }

    public final EncoderProfilesProxy c(int i) {
        HashMap map = this.c;
        return (map == null || !map.containsKey(Integer.valueOf(i))) ? this.b.a(i) : (EncoderProfilesProxy) map.get(Integer.valueOf(i));
    }
}
