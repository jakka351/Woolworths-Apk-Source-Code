package androidx.camera.video.internal.workaround;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.core.util.Preconditions;
import com.medallia.digital.mobilesdk.q2;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public class VideoEncoderInfoWrapper implements VideoEncoderInfo {

    /* renamed from: a, reason: collision with root package name */
    public final VideoEncoderInfo f638a;
    public final Range b;
    public final Range c;
    public final HashSet d;

    public VideoEncoderInfoWrapper(VideoEncoderInfo videoEncoderInfo) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.f638a = videoEncoderInfo;
        int iJ = videoEncoderInfo.j();
        this.b = Range.create(Integer.valueOf(iJ), Integer.valueOf(((int) Math.ceil(4096.0d / iJ)) * iJ));
        int iH = videoEncoderInfo.h();
        this.c = Range.create(Integer.valueOf(iH), Integer.valueOf(((int) Math.ceil(2160.0d / iH)) * iH));
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.f616a.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.EMPTY_SET);
    }

    public static VideoEncoderInfo k(VideoEncoderInfo videoEncoderInfo, Size size) {
        if (!(videoEncoderInfo instanceof VideoEncoderInfoWrapper)) {
            if (DeviceQuirks.f614a.b(MediaCodecInfoReportIncorrectInfoQuirk.class) != null) {
                videoEncoderInfo = new VideoEncoderInfoWrapper(videoEncoderInfo);
            } else if (size != null && !videoEncoderInfo.b(size.getWidth(), size.getHeight())) {
                Logger.e("VideoEncoderInfoWrapper", "Detected that the device does not support a size " + size + " that should be valid in widths/heights = " + videoEncoderInfo.e() + q2.c + videoEncoderInfo.f());
                videoEncoderInfo = new VideoEncoderInfoWrapper(videoEncoderInfo);
            }
        }
        if (size != null && (videoEncoderInfo instanceof VideoEncoderInfoWrapper)) {
            ((VideoEncoderInfoWrapper) videoEncoderInfo).d.add(size);
        }
        return videoEncoderInfo;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range a(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range range = this.c;
        boolean zContains = range.contains((Range) numValueOf);
        VideoEncoderInfo videoEncoderInfo = this.f638a;
        Preconditions.a("Not supported height: " + i + " which is not in " + range + " or can not be divided by alignment " + videoEncoderInfo.h(), zContains && i % videoEncoderInfo.h() == 0);
        return this.b;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range c() {
        return this.f638a.c();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range d(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range range = this.b;
        boolean zContains = range.contains((Range) numValueOf);
        VideoEncoderInfo videoEncoderInfo = this.f638a;
        Preconditions.a("Not supported width: " + i + " which is not in " + range + " or can not be divided by alignment " + videoEncoderInfo.j(), zContains && i % videoEncoderInfo.j() == 0);
        return this.c;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range e() {
        return this.b;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range f() {
        return this.c;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean g() {
        return this.f638a.g();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int h() {
        return this.f638a.h();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean i(int i, int i2) {
        VideoEncoderInfo videoEncoderInfo = this.f638a;
        if (videoEncoderInfo.i(i, i2)) {
            return true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getWidth() == i && size.getHeight() == i2) {
                return true;
            }
        }
        return this.b.contains((Range) Integer.valueOf(i)) && this.c.contains((Range) Integer.valueOf(i2)) && i % videoEncoderInfo.j() == 0 && i2 % videoEncoderInfo.h() == 0;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int j() {
        return this.f638a.j();
    }
}
