package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import androidx.annotation.RequiresApi;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.audio.g;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes2.dex */
final class MediaCodecPerformancePointCoverageProvider {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f3107a;

    @RequiresApi
    public static final class Api29 {
        /* JADX WARN: Multi-variable type inference failed */
        public static int a(boolean z) {
            List supportedPerformancePoints;
            try {
                Format.Builder builder = new Format.Builder();
                builder.m = MimeTypes.m("video/avc");
                Format format = new Format(builder);
                String str = format.n;
                if (str != null) {
                    List listE = MediaCodecUtil.e(str, z, false);
                    String strB = MediaCodecUtil.b(format);
                    Iterable iterableT = strB == null ? ImmutableList.t() : MediaCodecUtil.e(strB, z, false);
                    ImmutableList.Builder builderM = ImmutableList.m();
                    builderM.f(listE);
                    builderM.f(iterableT);
                    ImmutableList immutableListJ = builderM.j();
                    for (int i = 0; i < immutableListJ.size(); i++) {
                        if (((MediaCodecInfo) immutableListJ.get(i)).d != null && ((MediaCodecInfo) immutableListJ.get(i)).d.getVideoCapabilities() != null && (supportedPerformancePoints = ((MediaCodecInfo) immutableListJ.get(i)).d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            g.h();
                            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointD = g.d();
                            for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                                if (g.f(supportedPerformancePoints.get(i2)).covers(performancePointD)) {
                                    return 2;
                                }
                            }
                            return 1;
                        }
                    }
                }
            } catch (MediaCodecUtil.DecoderQueryException unused) {
            }
            return 0;
        }
    }
}
