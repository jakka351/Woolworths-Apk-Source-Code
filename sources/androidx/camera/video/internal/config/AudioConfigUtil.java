package androidx.camera.video.internal.config;

import android.media.AudioRecord;
import android.util.Range;
import androidx.camera.core.Logger;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.camera.video.internal.audio.AudioStreamImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class AudioConfigUtil {
    public static int a(AudioSpec audioSpec) {
        int iE = audioSpec.e();
        if (iE == -1) {
            Logger.a("AudioConfigUtil", "Using default AUDIO source: 5");
            return 5;
        }
        Logger.a("AudioConfigUtil", "Using provided AUDIO source: " + iE);
        return iE;
    }

    public static int b(AudioSpec audioSpec) {
        int iF = audioSpec.f();
        if (iF == -1) {
            Logger.a("AudioConfigUtil", "Using default AUDIO source format: 2");
            return 2;
        }
        Logger.a("AudioConfigUtil", "Using provided AUDIO source format: " + iF);
        return iF;
    }

    public static int c(Range range, int i, int i2, final int i3) {
        ArrayList arrayList = null;
        int i4 = 0;
        int iIntValue = i3;
        while (true) {
            if (range.contains((Range) Integer.valueOf(iIntValue))) {
                int i5 = AudioStreamImpl.f610a;
                if (iIntValue > 0 && i > 0) {
                    if (AudioRecord.getMinBufferSize(iIntValue, i == 1 ? 16 : 12, i2) > 0) {
                        return iIntValue;
                    }
                }
                StringBuilder sbQ = YU.a.q(iIntValue, i, "Sample rate ", "Hz is not supported by audio source with channel count ", " and source format ");
                sbQ.append(i2);
                Logger.a("AudioConfigUtil", sbQ.toString());
            } else {
                Logger.a("AudioConfigUtil", "Sample rate " + iIntValue + "Hz is not in target range " + range);
            }
            if (arrayList == null) {
                Logger.a("AudioConfigUtil", "Trying common sample rates in proximity order to target " + i3 + "Hz");
                arrayList = new ArrayList(AudioSettings.f608a);
                Collections.sort(arrayList, new Comparator() { // from class: androidx.camera.video.internal.config.a
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int iIntValue2 = ((Integer) obj).intValue();
                        int i6 = i3;
                        int iAbs = Math.abs(iIntValue2 - i6) - Math.abs(((Integer) obj2).intValue() - i6);
                        return (int) (iAbs == 0 ? Math.signum(r4.intValue() - r5.intValue()) : Math.signum(iAbs));
                    }
                });
            }
            if (i4 >= arrayList.size()) {
                Logger.a("AudioConfigUtil", "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return 44100;
            }
            iIntValue = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }
}
