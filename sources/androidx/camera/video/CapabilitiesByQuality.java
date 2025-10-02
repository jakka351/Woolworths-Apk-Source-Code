package androidx.camera.video;

import android.util.Size;
import androidx.annotation.RestrictTo;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.video.Quality;
import androidx.camera.video.internal.DynamicRangeMatchedEncoderProfilesProvider;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.core.util.Preconditions;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

@RestrictTo
/* loaded from: classes2.dex */
public class CapabilitiesByQuality {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f584a = new LinkedHashMap();
    public final TreeMap b = new TreeMap(new CompareSizesByArea(false));
    public final VideoValidatedEncoderProfilesProxy c;
    public final VideoValidatedEncoderProfilesProxy d;

    public CapabilitiesByQuality(DynamicRangeMatchedEncoderProfilesProvider dynamicRangeMatchedEncoderProfilesProvider) {
        Quality quality = Quality.f586a;
        Iterator it = new ArrayList(Quality.i).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Quality quality2 = (Quality) it.next();
            Preconditions.f("Currently only support ConstantQuality", quality2 instanceof Quality.ConstantQuality);
            EncoderProfilesProxy encoderProfilesProxyC = dynamicRangeMatchedEncoderProfilesProvider.c(((Quality.ConstantQuality) quality2).c());
            if (encoderProfilesProxyC != null) {
                Logger.a("CapabilitiesByQuality", "profiles = " + encoderProfilesProxyC);
                VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxyE = encoderProfilesProxyC.d().isEmpty() ? null : VideoValidatedEncoderProfilesProxy.e(encoderProfilesProxyC);
                if (videoValidatedEncoderProfilesProxyE == null) {
                    Logger.e("CapabilitiesByQuality", "EncoderProfiles of quality " + quality2 + " has no video validated profiles.");
                } else {
                    EncoderProfilesProxy.VideoProfileProxy videoProfileProxyG = videoValidatedEncoderProfilesProxyE.g();
                    this.b.put(new Size(videoProfileProxyG.k(), videoProfileProxyG.h()), quality2);
                    this.f584a.put(quality2, videoValidatedEncoderProfilesProxyE);
                }
            }
        }
        if (this.f584a.isEmpty()) {
            Logger.b("CapabilitiesByQuality", "No supported EncoderProfiles");
            this.d = null;
            this.c = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.f584a.values());
            this.c = (VideoValidatedEncoderProfilesProxy) arrayDeque.peekFirst();
            this.d = (VideoValidatedEncoderProfilesProxy) arrayDeque.peekLast();
        }
    }

    public final VideoValidatedEncoderProfilesProxy a(Quality quality) {
        Preconditions.a("Unknown quality: " + quality, Quality.h.contains(quality));
        return quality == Quality.f ? this.c : quality == Quality.e ? this.d : (VideoValidatedEncoderProfilesProxy) this.f584a.get(quality);
    }
}
