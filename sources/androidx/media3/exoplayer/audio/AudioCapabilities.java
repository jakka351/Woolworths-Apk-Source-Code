package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ObjectArrays;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@UnstableApi
/* loaded from: classes2.dex */
public final class AudioCapabilities {
    public static final AudioCapabilities c = new AudioCapabilities(ImmutableList.w(AudioProfile.d));
    public static final ImmutableList d;
    public static final ImmutableMap e;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f3039a = new SparseArray();
    public final int b;

    @RequiresApi
    public static final class Api23 {
    }

    @RequiresApi
    public static final class Api29 {
    }

    @RequiresApi
    public static final class Api33 {
    }

    static {
        Object[] objArr = {2, 5, 6};
        ObjectArrays.a(3, objArr);
        d = ImmutableList.l(3, objArr);
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        builder.c(5, 6);
        builder.c(17, 6);
        builder.c(7, 6);
        builder.c(30, 10);
        builder.c(18, 6);
        builder.c(6, 8);
        builder.c(8, 8);
        builder.c(14, 8);
        e = builder.a(true);
    }

    public AudioCapabilities(List list) {
        for (int i = 0; i < list.size(); i++) {
            AudioProfile audioProfile = (AudioProfile) list.get(i);
            this.f3039a.put(audioProfile.f3040a, audioProfile);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.f3039a.size(); i2++) {
            iMax = Math.max(iMax, ((AudioProfile) this.f3039a.valueAt(i2)).b);
        }
        this.b = iMax;
    }

    public static ImmutableList a(int i, int[] iArr) {
        ImmutableList.Builder builderM = ImmutableList.m();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            builderM.h(new AudioProfile(i2, i));
        }
        return builderM.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.exoplayer.audio.AudioCapabilities b(android.content.Context r12, android.content.Intent r13, androidx.media3.common.AudioAttributes r14, androidx.media3.exoplayer.audio.AudioDeviceInfoApi23 r15) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.AudioCapabilities.b(android.content.Context, android.content.Intent, androidx.media3.common.AudioAttributes, androidx.media3.exoplayer.audio.AudioDeviceInfoApi23):androidx.media3.exoplayer.audio.AudioCapabilities");
    }

    public static AudioCapabilities c(Context context, AudioAttributes audioAttributes, AudioDeviceInfoApi23 audioDeviceInfoApi23) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), audioAttributes, audioDeviceInfoApi23);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair d(androidx.media3.common.Format r17, androidx.media3.common.AudioAttributes r18) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.AudioCapabilities.d(androidx.media3.common.Format, androidx.media3.common.AudioAttributes):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        boolean zContentEquals;
        if (this != obj) {
            if (obj instanceof AudioCapabilities) {
                AudioCapabilities audioCapabilities = (AudioCapabilities) obj;
                SparseArray sparseArray = audioCapabilities.f3039a;
                int i = Util.f2928a;
                SparseArray sparseArray2 = this.f3039a;
                if (sparseArray2 != null) {
                    if (sparseArray != null) {
                        if (Util.f2928a >= 31) {
                            zContentEquals = sparseArray2.contentEquals(sparseArray);
                        } else {
                            int size = sparseArray2.size();
                            if (size == sparseArray.size()) {
                                for (int i2 = 0; i2 < size; i2++) {
                                    if (Objects.equals(sparseArray2.valueAt(i2), sparseArray.get(sparseArray2.keyAt(i2)))) {
                                    }
                                }
                                zContentEquals = true;
                            }
                        }
                    }
                    zContentEquals = false;
                    break;
                } else {
                    if (sparseArray != null) {
                        zContentEquals = false;
                        break;
                    }
                    zContentEquals = true;
                }
                if (!zContentEquals || this.b != audioCapabilities.b) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        int i = Util.f2928a;
        SparseArray sparseArray = this.f3039a;
        if (i >= 31) {
            iHashCode = sparseArray.contentHashCode();
        } else {
            iHashCode = 17;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i2)) + ((sparseArray.keyAt(i2) + (iHashCode * 31)) * 31);
            }
        }
        return (iHashCode * 31) + this.b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.f3039a + "]";
    }

    public static final class AudioProfile {
        public static final AudioProfile d;

        /* renamed from: a, reason: collision with root package name */
        public final int f3040a;
        public final int b;
        public final ImmutableSet c;

        static {
            AudioProfile audioProfile;
            if (Util.f2928a >= 33) {
                ImmutableSet.Builder builder = new ImmutableSet.Builder();
                for (int i = 1; i <= 10; i++) {
                    builder.a(Integer.valueOf(Util.q(i)));
                }
                audioProfile = new AudioProfile(2, builder.k());
            } else {
                audioProfile = new AudioProfile(2, 10);
            }
            d = audioProfile;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AudioProfile(int i, Set set) {
            this.f3040a = i;
            ImmutableSet immutableSetQ = ImmutableSet.q(set);
            this.c = immutableSetQ;
            UnmodifiableIterator it = immutableSetQ.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
            }
            this.b = iMax;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioProfile)) {
                return false;
            }
            AudioProfile audioProfile = (AudioProfile) obj;
            return this.f3040a == audioProfile.f3040a && this.b == audioProfile.b && Objects.equals(this.c, audioProfile.c);
        }

        public final int hashCode() {
            int i = ((this.f3040a * 31) + this.b) * 31;
            ImmutableSet immutableSet = this.c;
            return i + (immutableSet == null ? 0 : immutableSet.hashCode());
        }

        public final String toString() {
            return "AudioProfile[format=" + this.f3040a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
        }

        public AudioProfile(int i, int i2) {
            this.f3040a = i;
            this.b = i2;
            this.c = null;
        }
    }
}
