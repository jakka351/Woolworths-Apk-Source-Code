package androidx.media3.exoplayer.trackselection;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.audio.k;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.errorprone.annotations.InlineMe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;

@UnstableApi
/* loaded from: classes2.dex */
public class DefaultTrackSelector extends MappingTrackSelector implements RendererCapabilities.Listener {
    public static final Ordering i = Ordering.b(new b(7));
    public final Object c;
    public final Context d;
    public final AdaptiveTrackSelection.Factory e;
    public Parameters f;
    public SpatializerWrapperV32 g;
    public AudioAttributes h;

    public static final class AudioTrackInfo extends TrackInfo<AudioTrackInfo> implements Comparable<AudioTrackInfo> {
        public final boolean A;
        public final int h;
        public final boolean i;
        public final String j;
        public final Parameters k;
        public final boolean l;
        public final int m;
        public final int n;
        public final int o;
        public final boolean p;
        public final boolean q;
        public final int r;
        public final int s;
        public final boolean t;
        public final int u;
        public final int v;
        public final int w;
        public final int x;
        public final boolean y;
        public final boolean z;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00a9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public AudioTrackInfo(int r14, androidx.media3.common.TrackGroup r15, int r16, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters r17, int r18, boolean r19, androidx.media3.exoplayer.trackselection.f r20, int r21) {
            /*
                Method dump skipped, instructions count: 422
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.trackselection.DefaultTrackSelector.AudioTrackInfo.<init>(int, androidx.media3.common.TrackGroup, int, androidx.media3.exoplayer.trackselection.DefaultTrackSelector$Parameters, int, boolean, androidx.media3.exoplayer.trackselection.f, int):void");
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public final int a() {
            return this.h;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public final boolean b(TrackInfo trackInfo) {
            int i;
            String str;
            AudioTrackInfo audioTrackInfo = (AudioTrackInfo) trackInfo;
            Format format = audioTrackInfo.g;
            this.k.getClass();
            Format format2 = this.g;
            int i2 = format2.D;
            if (i2 == -1 || i2 != format.D) {
                return false;
            }
            return (this.p || ((str = format2.n) != null && TextUtils.equals(str, format.n))) && (i = format2.E) != -1 && i == format.E && this.y == audioTrackInfo.y && this.z == audioTrackInfo.z;
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final int compareTo(AudioTrackInfo audioTrackInfo) {
            boolean z = this.l;
            boolean z2 = this.i;
            Ordering orderingG = (z2 && z) ? DefaultTrackSelector.i : DefaultTrackSelector.i.g();
            boolean z3 = audioTrackInfo.l;
            int i = audioTrackInfo.w;
            ComparisonChain comparisonChainC = ComparisonChain.f14880a.d(z, z3).c(Integer.valueOf(this.n), Integer.valueOf(audioTrackInfo.n), Ordering.c().g()).a(this.m, audioTrackInfo.m).a(this.o, audioTrackInfo.o).d(this.t, audioTrackInfo.t).d(this.q, audioTrackInfo.q).c(Integer.valueOf(this.r), Integer.valueOf(audioTrackInfo.r), Ordering.c().g()).a(this.s, audioTrackInfo.s).d(z2, audioTrackInfo.i).c(Integer.valueOf(this.x), Integer.valueOf(audioTrackInfo.x), Ordering.c().g());
            this.k.getClass();
            ComparisonChain comparisonChainC2 = comparisonChainC.d(this.y, audioTrackInfo.y).d(this.z, audioTrackInfo.z).d(this.A, audioTrackInfo.A).c(Integer.valueOf(this.u), Integer.valueOf(audioTrackInfo.u), orderingG).c(Integer.valueOf(this.v), Integer.valueOf(audioTrackInfo.v), orderingG);
            if (Objects.equals(this.j, audioTrackInfo.j)) {
                comparisonChainC2 = comparisonChainC2.c(Integer.valueOf(this.w), Integer.valueOf(i), orderingG);
            }
            return comparisonChainC2.f();
        }
    }

    public static final class ImageTrackInfo extends TrackInfo<ImageTrackInfo> implements Comparable<ImageTrackInfo> {
        public final int h;
        public final int i;

        public ImageTrackInfo(int i, TrackGroup trackGroup, int i2, Parameters parameters, int i3) {
            int i4;
            super(i, trackGroup, i2);
            this.h = RendererCapabilities.s(i3, parameters.B) ? 1 : 0;
            Format format = this.g;
            int i5 = format.u;
            int i6 = -1;
            if (i5 != -1 && (i4 = format.v) != -1) {
                i6 = i5 * i4;
            }
            this.i = i6;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public final int a() {
            return this.h;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public final /* bridge */ /* synthetic */ boolean b(TrackInfo trackInfo) {
            return false;
        }

        @Override // java.lang.Comparable
        public final int compareTo(ImageTrackInfo imageTrackInfo) {
            return Integer.compare(this.i, imageTrackInfo.i);
        }
    }

    public static final class OtherTrackScore implements Comparable<OtherTrackScore> {
        public final boolean d;
        public final boolean e;

        public OtherTrackScore(Format format, int i) {
            this.d = (format.e & 1) != 0;
            this.e = RendererCapabilities.s(i, false);
        }

        @Override // java.lang.Comparable
        public final int compareTo(OtherTrackScore otherTrackScore) {
            OtherTrackScore otherTrackScore2 = otherTrackScore;
            return ComparisonChain.f14880a.d(this.e, otherTrackScore2.e).d(this.d, otherTrackScore2.d).f();
        }
    }

    @Deprecated
    public static final class ParametersBuilder extends TrackSelectionParameters.Builder {
        public final Parameters.Builder v;

        public ParametersBuilder(Context context) {
            this.v = new Parameters.Builder(context);
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public final TrackSelectionParameters a() {
            Parameters.Builder builder = this.v;
            builder.getClass();
            return new Parameters(builder);
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public final TrackSelectionParameters.Builder b(int i) {
            this.v.j(i);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public final TrackSelectionParameters.Builder d() {
            this.v.r = -3;
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public final TrackSelectionParameters.Builder e(TrackSelectionOverride trackSelectionOverride) {
            this.v.k(trackSelectionOverride);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public final TrackSelectionParameters.Builder f() {
            this.v.l();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public final TrackSelectionParameters.Builder g(String[] strArr) {
            this.v.m(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public final TrackSelectionParameters.Builder h() {
            this.v.q = false;
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public final TrackSelectionParameters.Builder i(int i) {
            this.v.n(i);
            return this;
        }
    }

    public static final class SelectionOverride {
        static {
            Util.E(0);
            Util.E(1);
            Util.E(2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SelectionOverride.class == obj.getClass()) {
                if (Arrays.equals((int[]) null, (int[]) null)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode((int[]) null) * 31;
        }
    }

    @RequiresApi
    public static class SpatializerWrapperV32 {

        /* renamed from: a, reason: collision with root package name */
        public final Spatializer f3164a;
        public final boolean b;
        public final Handler c;
        public final Spatializer$OnSpatializerStateChangedListener d;

        public SpatializerWrapperV32(Context context, final DefaultTrackSelector defaultTrackSelector) {
            AudioManager audioManagerA = context == null ? null : AudioManagerCompat.a(context);
            if (audioManagerA != null) {
                context.getClass();
                if (!Util.H(context)) {
                    Spatializer spatializer = audioManagerA.getSpatializer();
                    this.f3164a = spatializer;
                    this.b = spatializer.getImmersiveAudioLevel() != 0;
                    Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = new Spatializer$OnSpatializerStateChangedListener() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SpatializerWrapperV32.1
                        public final void onSpatializerAvailableChanged(Spatializer spatializer2, boolean z) {
                            Ordering ordering = DefaultTrackSelector.i;
                            defaultTrackSelector.l();
                        }

                        public final void onSpatializerEnabledChanged(Spatializer spatializer2, boolean z) {
                            Ordering ordering = DefaultTrackSelector.i;
                            defaultTrackSelector.l();
                        }
                    };
                    this.d = spatializer$OnSpatializerStateChangedListener;
                    Looper looperMyLooper = Looper.myLooper();
                    Assertions.g(looperMyLooper);
                    Handler handler = new Handler(looperMyLooper);
                    this.c = handler;
                    spatializer.addOnSpatializerStateChangedListener(new k(handler), spatializer$OnSpatializerStateChangedListener);
                    return;
                }
            }
            this.f3164a = null;
            this.b = false;
            this.c = null;
            this.d = null;
        }
    }

    public static final class TextTrackInfo extends TrackInfo<TextTrackInfo> implements Comparable<TextTrackInfo> {
        public final int h;
        public final boolean i;
        public final boolean j;
        public final boolean k;
        public final int l;
        public final int m;
        public final int n;
        public final int o;
        public final boolean p;

        /* JADX WARN: Multi-variable type inference failed */
        public TextTrackInfo(int i, TrackGroup trackGroup, int i2, Parameters parameters, int i3, String str, String str2) {
            int iK;
            super(i, trackGroup, i2);
            int i4 = 0;
            this.i = RendererCapabilities.s(i3, false);
            int i5 = this.g.e;
            int i6 = parameters.r;
            ImmutableList immutableList = parameters.p;
            int i7 = i5 & (~i6);
            this.j = (i7 & 1) != 0;
            this.k = (i7 & 2) != 0;
            ImmutableList immutableListW = str2 != null ? ImmutableList.w(str2) : immutableList.isEmpty() ? ImmutableList.w("") : immutableList;
            int i8 = 0;
            while (true) {
                if (i8 >= immutableListW.size()) {
                    iK = 0;
                    i8 = Integer.MAX_VALUE;
                    break;
                } else {
                    iK = DefaultTrackSelector.k(this.g, (String) immutableListW.get(i8), false);
                    if (iK > 0) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            this.l = i8;
            this.m = iK;
            int i9 = str2 != null ? 1088 : 0;
            int i10 = this.g.f;
            Ordering ordering = DefaultTrackSelector.i;
            int iBitCount = (i10 == 0 || i10 != i9) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
            this.n = iBitCount;
            this.p = (1088 & this.g.f) != 0;
            int iK2 = DefaultTrackSelector.k(this.g, str, DefaultTrackSelector.m(str) == null);
            this.o = iK2;
            boolean z = iK > 0 || (immutableList.isEmpty() && iBitCount > 0) || this.j || (this.k && iK2 > 0);
            if (RendererCapabilities.s(i3, parameters.B) && z) {
                i4 = 1;
            }
            this.h = i4;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public final int a() {
            return this.h;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public final /* bridge */ /* synthetic */ boolean b(TrackInfo trackInfo) {
            return false;
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final int compareTo(TextTrackInfo textTrackInfo) {
            ComparisonChain comparisonChainC = ComparisonChain.f14880a.d(this.i, textTrackInfo.i).c(Integer.valueOf(this.l), Integer.valueOf(textTrackInfo.l), Ordering.c().g());
            int i = textTrackInfo.m;
            int i2 = this.m;
            ComparisonChain comparisonChainA = comparisonChainC.a(i2, i);
            int i3 = textTrackInfo.n;
            int i4 = this.n;
            ComparisonChain comparisonChainA2 = comparisonChainA.a(i4, i3).d(this.j, textTrackInfo.j).c(Boolean.valueOf(this.k), Boolean.valueOf(textTrackInfo.k), i2 == 0 ? Ordering.c() : Ordering.c().g()).a(this.o, textTrackInfo.o);
            if (i4 == 0) {
                comparisonChainA2 = comparisonChainA2.e(this.p, textTrackInfo.p);
            }
            return comparisonChainA2.f();
        }
    }

    public static abstract class TrackInfo<T extends TrackInfo<T>> {
        public final int d;
        public final TrackGroup e;
        public final int f;
        public final Format g;

        public interface Factory<T extends TrackInfo<T>> {
            List a(int i, TrackGroup trackGroup, int[] iArr);
        }

        public TrackInfo(int i, TrackGroup trackGroup, int i2) {
            this.d = i;
            this.e = trackGroup;
            this.f = i2;
            this.g = trackGroup.d[i2];
        }

        public abstract int a();

        public abstract boolean b(TrackInfo trackInfo);
    }

    public static final class VideoTrackInfo extends TrackInfo<VideoTrackInfo> {
        public final boolean h;
        public final Parameters i;
        public final boolean j;
        public final boolean k;
        public final boolean l;
        public final int m;
        public final int n;
        public final int o;
        public final int p;
        public final int q;
        public final int r;
        public final boolean s;
        public final int t;
        public final boolean u;
        public final int v;
        public final boolean w;
        public final boolean x;
        public final int y;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x016c  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x006a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public VideoTrackInfo(int r7, androidx.media3.common.TrackGroup r8, int r9, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters r10, int r11, java.lang.String r12, int r13, boolean r14) {
            /*
                Method dump skipped, instructions count: 468
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo.<init>(int, androidx.media3.common.TrackGroup, int, androidx.media3.exoplayer.trackselection.DefaultTrackSelector$Parameters, int, java.lang.String, int, boolean):void");
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public final int a() {
            return this.v;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public final boolean b(TrackInfo trackInfo) {
            VideoTrackInfo videoTrackInfo = (VideoTrackInfo) trackInfo;
            if (!this.u && !Objects.equals(this.g.n, videoTrackInfo.g.n)) {
                return false;
            }
            this.i.getClass();
            return this.w == videoTrackInfo.w && this.x == videoTrackInfo.x;
        }
    }

    public DefaultTrackSelector(Context context) {
        AdaptiveTrackSelection.Factory factory = new AdaptiveTrackSelection.Factory();
        Parameters parameters = Parameters.F;
        this.c = new Object();
        this.d = context != null ? context.getApplicationContext() : null;
        this.e = factory;
        if (parameters != null) {
            this.f = parameters;
        } else {
            parameters.getClass();
            Parameters.Builder builder = new Parameters.Builder(parameters);
            builder.c(parameters);
            this.f = new Parameters(builder);
        }
        this.h = AudioAttributes.b;
        if (this.f.A && context == null) {
            Log.g("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void j(TrackGroupArray trackGroupArray, TrackSelectionParameters trackSelectionParameters, HashMap map) {
        for (int i2 = 0; i2 < trackGroupArray.f3148a; i2++) {
            TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) trackSelectionParameters.t.get(trackGroupArray.a(i2));
            if (trackSelectionOverride != null) {
                TrackGroup trackGroup = trackSelectionOverride.f2880a;
                TrackSelectionOverride trackSelectionOverride2 = (TrackSelectionOverride) map.get(Integer.valueOf(trackGroup.c));
                if (trackSelectionOverride2 == null || (trackSelectionOverride2.b.isEmpty() && !trackSelectionOverride.b.isEmpty())) {
                    map.put(Integer.valueOf(trackGroup.c), trackSelectionOverride);
                }
            }
        }
    }

    public static int k(Format format, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(format.d)) {
            return 4;
        }
        String strM = m(str);
        String strM2 = m(format.d);
        if (strM2 == null || strM == null) {
            return (z && strM2 == null) ? 1 : 0;
        }
        if (strM2.startsWith(strM) || strM.startsWith(strM2)) {
            return 3;
        }
        int i2 = Util.f2928a;
        return strM2.split("-", 2)[0].equals(strM.split("-", 2)[0]) ? 2 : 0;
    }

    public static String m(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair n(int i2, MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, TrackInfo.Factory factory, Comparator comparator) {
        int i3;
        RandomAccess randomAccessW;
        MappingTrackSelector.MappedTrackInfo mappedTrackInfo2 = mappedTrackInfo;
        ArrayList arrayList = new ArrayList();
        int i4 = mappedTrackInfo2.f3167a;
        int i5 = 0;
        while (i5 < i4) {
            if (i2 == mappedTrackInfo2.b[i5]) {
                TrackGroupArray trackGroupArray = mappedTrackInfo2.c[i5];
                for (int i6 = 0; i6 < trackGroupArray.f3148a; i6++) {
                    TrackGroup trackGroupA = trackGroupArray.a(i6);
                    List listA = factory.a(i5, trackGroupA, iArr[i5][i6]);
                    int i7 = trackGroupA.f2879a;
                    boolean[] zArr = new boolean[i7];
                    int i8 = 0;
                    while (i8 < i7) {
                        TrackInfo trackInfo = (TrackInfo) listA.get(i8);
                        int iA = trackInfo.a();
                        if (zArr[i8] || iA == 0) {
                            i3 = i4;
                        } else {
                            if (iA == 1) {
                                randomAccessW = ImmutableList.w(trackInfo);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(trackInfo);
                                int i9 = i8 + 1;
                                while (i9 < i7) {
                                    TrackInfo trackInfo2 = (TrackInfo) listA.get(i9);
                                    int i10 = i4;
                                    if (trackInfo2.a() == 2 && trackInfo.b(trackInfo2)) {
                                        arrayList2.add(trackInfo2);
                                        zArr[i9] = true;
                                    }
                                    i9++;
                                    i4 = i10;
                                }
                                randomAccessW = arrayList2;
                            }
                            i3 = i4;
                            arrayList.add(randomAccessW);
                        }
                        i8++;
                        i4 = i3;
                    }
                }
            }
            i5++;
            mappedTrackInfo2 = mappedTrackInfo;
            i4 = i4;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            iArr2[i11] = ((TrackInfo) list.get(i11)).f;
        }
        TrackInfo trackInfo3 = (TrackInfo) list.get(0);
        return Pair.create(new ExoTrackSelection.Definition(0, trackInfo3.e, iArr2), Integer.valueOf(trackInfo3.d));
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities.Listener
    public final void a(Renderer renderer) {
        synchronized (this.c) {
            this.f.getClass();
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public final TrackSelectionParameters b() {
        Parameters parameters;
        synchronized (this.c) {
            parameters = this.f;
        }
        return parameters;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public final RendererCapabilities.Listener c() {
        return this;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public final void e() {
        SpatializerWrapperV32 spatializerWrapperV32;
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        if (Util.f2928a >= 32 && (spatializerWrapperV32 = this.g) != null) {
            Handler handler = spatializerWrapperV32.c;
            Spatializer spatializer = spatializerWrapperV32.f3164a;
            if (spatializer != null && (spatializer$OnSpatializerStateChangedListener = spatializerWrapperV32.d) != null && handler != null) {
                spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
                handler.removeCallbacksAndMessages(null);
            }
        }
        super.e();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public final void g(AudioAttributes audioAttributes) {
        if (this.h.equals(audioAttributes)) {
            return;
        }
        this.h = audioAttributes;
        l();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public final void h(TrackSelectionParameters trackSelectionParameters) {
        Parameters parameters;
        if (trackSelectionParameters instanceof Parameters) {
            o((Parameters) trackSelectionParameters);
        }
        synchronized (this.c) {
            parameters = this.f;
        }
        Parameters.Builder builder = new Parameters.Builder(parameters);
        builder.c(trackSelectionParameters);
        o(new Parameters(builder));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04e4  */
    @Override // androidx.media3.exoplayer.trackselection.MappingTrackSelector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair i(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo r28, int[][][] r29, final int[] r30, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId r31, androidx.media3.common.Timeline r32) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.trackselection.DefaultTrackSelector.i(androidx.media3.exoplayer.trackselection.MappingTrackSelector$MappedTrackInfo, int[][][], int[], androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, androidx.media3.common.Timeline):android.util.Pair");
    }

    public final void l() {
        boolean z;
        TrackSelector.InvalidationListener invalidationListener;
        SpatializerWrapperV32 spatializerWrapperV32;
        synchronized (this.c) {
            try {
                z = this.f.A && Util.f2928a >= 32 && (spatializerWrapperV32 = this.g) != null && spatializerWrapperV32.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (invalidationListener = this.f3169a) == null) {
            return;
        }
        invalidationListener.a();
    }

    public final void o(Parameters parameters) {
        boolean zEquals;
        parameters.getClass();
        synchronized (this.c) {
            zEquals = this.f.equals(parameters);
            this.f = parameters;
        }
        if (zEquals) {
            return;
        }
        if (parameters.A && this.d == null) {
            Log.g("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        TrackSelector.InvalidationListener invalidationListener = this.f3169a;
        if (invalidationListener != null) {
            invalidationListener.a();
        }
    }

    public static final class Parameters extends TrackSelectionParameters {
        public static final Parameters F = new Parameters(new Builder());
        public final boolean A;
        public final boolean B;
        public final boolean C;
        public final SparseArray D;
        public final SparseBooleanArray E;
        public final boolean w;
        public final boolean x;
        public final boolean y;
        public final boolean z;

        static {
            androidx.compose.ui.input.pointer.a.r(1000, 1001, 1002, 1003, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            androidx.compose.ui.input.pointer.a.r(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, 1006, 1007, 1008, 1009);
            androidx.compose.ui.input.pointer.a.r(1010, 1011, 1012, 1013, 1014);
            Util.E(1015);
            Util.E(1016);
            Util.E(1017);
            Util.E(1018);
        }

        public Parameters(Builder builder) {
            super(builder);
            this.w = builder.v;
            this.x = builder.w;
            this.y = builder.x;
            this.z = builder.y;
            this.A = builder.z;
            this.B = builder.A;
            this.C = builder.B;
            this.D = builder.C;
            this.E = builder.D;
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public final TrackSelectionParameters.Builder a() {
            return new Builder(this);
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Parameters.class == obj.getClass()) {
                Parameters parameters = (Parameters) obj;
                if (super.equals(parameters) && this.w == parameters.w && this.x == parameters.x && this.y == parameters.y && this.z == parameters.z && this.A == parameters.A && this.B == parameters.B && this.C == parameters.C) {
                    SparseBooleanArray sparseBooleanArray = parameters.E;
                    SparseBooleanArray sparseBooleanArray2 = this.E;
                    int size = sparseBooleanArray2.size();
                    if (sparseBooleanArray.size() == size) {
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                SparseArray sparseArray = parameters.D;
                                SparseArray sparseArray2 = this.D;
                                int size2 = sparseArray2.size();
                                if (sparseArray.size() == size2) {
                                    for (int i2 = 0; i2 < size2; i2++) {
                                        int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                                        if (iIndexOfKey >= 0) {
                                            Map map = (Map) sparseArray2.valueAt(i2);
                                            Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                            if (map2.size() == map.size()) {
                                                for (Map.Entry entry : map.entrySet()) {
                                                    TrackGroupArray trackGroupArray = (TrackGroupArray) entry.getKey();
                                                    if (!map2.containsKey(trackGroupArray) || !Objects.equals(entry.getValue(), map2.get(trackGroupArray))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return true;
                                }
                            } else {
                                if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) < 0) {
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
            }
            return false;
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public final int hashCode() {
            return (((((((((((((((super.hashCode() + 31) * 31) + (this.w ? 1 : 0)) * 961) + (this.x ? 1 : 0)) * 961) + (this.y ? 1 : 0)) * 28629151) + (this.z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 961) + (this.C ? 1 : 0)) * 31;
        }

        public static final class Builder extends TrackSelectionParameters.Builder {
            public final boolean A;
            public final boolean B;
            public final SparseArray C;
            public final SparseBooleanArray D;
            public final boolean v;
            public final boolean w;
            public final boolean x;
            public final boolean y;
            public boolean z;

            public Builder(Parameters parameters) {
                c(parameters);
                this.v = parameters.w;
                this.w = parameters.x;
                this.x = parameters.y;
                this.y = parameters.z;
                this.z = parameters.A;
                this.A = parameters.B;
                this.B = parameters.C;
                SparseArray sparseArray = parameters.D;
                SparseArray sparseArray2 = new SparseArray();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
                }
                this.C = sparseArray2;
                this.D = parameters.E.clone();
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public final TrackSelectionParameters a() {
                return new Parameters(this);
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public final TrackSelectionParameters.Builder b(int i) {
                super.b(i);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public final TrackSelectionParameters.Builder d() {
                this.r = -3;
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public final TrackSelectionParameters.Builder e(TrackSelectionOverride trackSelectionOverride) {
                super.e(trackSelectionOverride);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public final TrackSelectionParameters.Builder f() {
                super.f();
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public final TrackSelectionParameters.Builder g(String[] strArr) {
                super.g(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public final TrackSelectionParameters.Builder h() {
                this.q = false;
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public final TrackSelectionParameters.Builder i(int i) {
                super.i(i);
                return this;
            }

            public final void j(int i) {
                super.b(i);
            }

            public final void k(TrackSelectionOverride trackSelectionOverride) {
                super.e(trackSelectionOverride);
            }

            public final void l() {
                super.f();
            }

            public final void m(String... strArr) {
                super.g(strArr);
            }

            public final void n(int i) {
                super.i(i);
            }

            public Builder() {
                this.C = new SparseArray();
                this.D = new SparseBooleanArray();
                this.v = true;
                this.w = true;
                this.x = true;
                this.y = true;
                this.z = true;
                this.A = true;
                this.B = true;
            }

            @InlineMe
            @Deprecated
            public Builder(Context context) {
                this();
            }
        }
    }
}
