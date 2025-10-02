package androidx.media3.exoplayer.trackselection;

import android.util.Pair;
import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class MappingTrackSelector extends TrackSelector {

    public static final class MappedTrackInfo {

        /* renamed from: a, reason: collision with root package name */
        public final int f3167a;
        public final int[] b;
        public final TrackGroupArray[] c;
        public final int[] d;
        public final int[][][] e;
        public final TrackGroupArray f;

        @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface RendererSupport {
        }

        public MappedTrackInfo(int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.b = iArr;
            this.c = trackGroupArrayArr;
            this.e = iArr3;
            this.d = iArr2;
            this.f = trackGroupArray;
            this.f3167a = iArr.length;
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public final void d(Object obj) {
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public final TrackSelectorResult f(RendererCapabilities[] rendererCapabilitiesArr, TrackGroupArray trackGroupArray, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
        int[][][] iArr;
        int i;
        boolean z;
        int[] iArr2;
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        boolean z2 = true;
        int[] iArr3 = new int[rendererCapabilitiesArr.length + 1];
        int length = rendererCapabilitiesArr.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length][];
        int[][][] iArr4 = new int[rendererCapabilitiesArr.length + 1][][];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = trackGroupArray2.f3148a;
            trackGroupArr[i2] = new TrackGroup[i3];
            iArr4[i2] = new int[i3][];
        }
        int length2 = rendererCapabilitiesArr.length;
        int[] iArr5 = new int[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            iArr5[i4] = rendererCapabilitiesArr[i4].C();
        }
        int i5 = 0;
        while (i5 < trackGroupArray2.f3148a) {
            TrackGroup trackGroupA = trackGroupArray2.a(i5);
            int i6 = trackGroupA.c;
            Format[] formatArr = trackGroupA.d;
            int i7 = trackGroupA.f2879a;
            boolean z3 = i6 == 5 ? z2 : false;
            int length3 = rendererCapabilitiesArr.length;
            boolean z4 = z2;
            int i8 = 0;
            int i9 = 0;
            while (i8 < rendererCapabilitiesArr.length) {
                RendererCapabilities rendererCapabilities = rendererCapabilitiesArr[i8];
                int iMax = 0;
                int i10 = 0;
                while (i10 < i7) {
                    iMax = Math.max(iMax, rendererCapabilities.a(formatArr[i10]) & 7);
                    i10++;
                    iArr3 = iArr3;
                }
                int[] iArr6 = iArr3;
                boolean z5 = iArr6[i8] == 0 ? z4 : false;
                if (iMax > i9 || (iMax == i9 && z3 && !z4 && z5)) {
                    i9 = iMax;
                    z4 = z5;
                    length3 = i8;
                }
                i8++;
                iArr3 = iArr6;
            }
            int[] iArr7 = iArr3;
            if (length3 == rendererCapabilitiesArr.length) {
                iArr2 = new int[i7];
            } else {
                RendererCapabilities rendererCapabilities2 = rendererCapabilitiesArr[length3];
                int[] iArr8 = new int[i7];
                for (int i11 = 0; i11 < i7; i11++) {
                    iArr8[i11] = rendererCapabilities2.a(formatArr[i11]);
                }
                iArr2 = iArr8;
            }
            int i12 = iArr7[length3];
            trackGroupArr[length3][i12] = trackGroupA;
            iArr4[length3][i12] = iArr2;
            iArr7[length3] = i12 + 1;
            i5++;
            trackGroupArray2 = trackGroupArray;
            z2 = z4;
            iArr3 = iArr7;
        }
        int[] iArr9 = iArr3;
        boolean z6 = z2;
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[rendererCapabilitiesArr.length];
        String[] strArr = new String[rendererCapabilitiesArr.length];
        int[] iArr10 = new int[rendererCapabilitiesArr.length];
        for (int i13 = 0; i13 < rendererCapabilitiesArr.length; i13++) {
            int i14 = iArr9[i13];
            trackGroupArrayArr[i13] = new TrackGroupArray((TrackGroup[]) Util.K(i14, trackGroupArr[i13]));
            iArr4[i13] = (int[][]) Util.K(i14, iArr4[i13]);
            strArr[i13] = rendererCapabilitiesArr[i13].getName();
            iArr10[i13] = rendererCapabilitiesArr[i13].e();
        }
        MappedTrackInfo mappedTrackInfo = new MappedTrackInfo(iArr10, trackGroupArrayArr, iArr5, iArr4, new TrackGroupArray((TrackGroup[]) Util.K(iArr9[rendererCapabilitiesArr.length], trackGroupArr[rendererCapabilitiesArr.length])));
        Pair pairI = i(mappedTrackInfo, iArr4, iArr5, mediaPeriodId, timeline);
        TrackSelection[] trackSelectionArr = (TrackSelection[]) pairI.second;
        List[] listArr = new List[trackSelectionArr.length];
        for (int i15 = 0; i15 < trackSelectionArr.length; i15++) {
            TrackSelection trackSelection = trackSelectionArr[i15];
            listArr[i15] = trackSelection != null ? ImmutableList.w(trackSelection) : ImmutableList.t();
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i16 = 0;
        while (i16 < mappedTrackInfo.f3167a) {
            TrackGroupArray[] trackGroupArrayArr2 = mappedTrackInfo.c;
            TrackGroupArray trackGroupArray3 = trackGroupArrayArr2[i16];
            List list = listArr[i16];
            int i17 = 0;
            while (i17 < trackGroupArray3.f3148a) {
                TrackGroup trackGroupA2 = trackGroupArray3.a(i17);
                int i18 = trackGroupArrayArr2[i16].a(i17).f2879a;
                int[] iArr11 = new int[i18];
                int i19 = 0;
                int i20 = 0;
                while (true) {
                    iArr = mappedTrackInfo.e;
                    if (i19 >= i18) {
                        break;
                    }
                    if ((iArr[i16][i17][i19] & 7) == 4) {
                        iArr11[i20] = i19;
                        i20++;
                    }
                    i19++;
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr11, i20);
                int iMin = 16;
                String str = null;
                List[] listArr2 = listArr;
                int i21 = 0;
                boolean z7 = false;
                int i22 = 0;
                while (i21 < iArrCopyOf.length) {
                    String str2 = trackGroupArrayArr2[i16].a(i17).d[iArrCopyOf[i21]].n;
                    int i23 = i22 + 1;
                    if (i22 == 0) {
                        str = str2;
                    } else {
                        z7 |= !Objects.equals(str, str2);
                    }
                    iMin = Math.min(iMin, iArr[i16][i17][i21] & 24);
                    i21++;
                    i22 = i23;
                }
                if (z7) {
                    iMin = Math.min(iMin, mappedTrackInfo.d[i16]);
                }
                boolean z8 = iMin != 0 ? z6 : false;
                int i24 = trackGroupA2.f2879a;
                int[] iArr12 = new int[i24];
                boolean[] zArr = new boolean[i24];
                int i25 = 0;
                while (i25 < trackGroupA2.f2879a) {
                    iArr12[i25] = iArr[i16][i17][i25] & 7;
                    int i26 = 0;
                    while (true) {
                        if (i26 >= list.size()) {
                            i = i16;
                            z = false;
                            break;
                        }
                        TrackSelection trackSelection2 = (TrackSelection) list.get(i26);
                        i = i16;
                        if (trackSelection2.e().equals(trackGroupA2) && trackSelection2.d(i25) != -1) {
                            z = z6;
                            break;
                        }
                        i26++;
                        i16 = i;
                    }
                    zArr[i25] = z;
                    i25++;
                    i16 = i;
                }
                builder.h(new Tracks.Group(trackGroupA2, z8, iArr12, zArr));
                i17++;
                i16 = i16;
                listArr = listArr2;
            }
            i16++;
        }
        int i27 = 0;
        while (true) {
            TrackGroupArray trackGroupArray4 = mappedTrackInfo.f;
            if (i27 >= trackGroupArray4.f3148a) {
                return new TrackSelectorResult((RendererConfiguration[]) pairI.first, (ExoTrackSelection[]) pairI.second, new Tracks(builder.j()), mappedTrackInfo);
            }
            TrackGroup trackGroupA3 = trackGroupArray4.a(i27);
            int[] iArr13 = new int[trackGroupA3.f2879a];
            Arrays.fill(iArr13, 0);
            builder.h(new Tracks.Group(trackGroupA3, false, iArr13, new boolean[trackGroupA3.f2879a]));
            i27++;
        }
    }

    public abstract Pair i(MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline);
}
