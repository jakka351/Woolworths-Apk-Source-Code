package androidx.media3.exoplayer.source.mediaparser;

import android.media.MediaCodec;
import android.media.MediaParser;
import android.media.MediaParser$InputReader;
import android.media.MediaParser$OutputConsumer;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.media3.common.DataReader;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.f;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.NoOpExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackOutput;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RequiresApi
@UnstableApi
/* loaded from: classes2.dex */
public final class OutputConsumerAdapterV30 implements MediaParser$OutputConsumer {
    public static final Pair n = Pair.create(MediaParser.SeekPoint.START, MediaParser.SeekPoint.START);
    public static final Pattern o = Pattern.compile("pattern \\(encrypt: (\\d+), skip: (\\d+)\\)");
    public MediaParser.SeekMap g;
    public String h;
    public boolean k;
    public boolean l;
    public boolean m;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3155a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final DataReaderAdapter e = new DataReaderAdapter();
    public ExtractorOutput f = new NoOpExtractorOutput();
    public final long j = -9223372036854775807L;
    public final List i = ImmutableList.t();

    public static final class DataReaderAdapter implements DataReader {

        /* renamed from: a, reason: collision with root package name */
        public MediaParser$InputReader f3156a;

        @Override // androidx.media3.common.DataReader
        public final int read(byte[] bArr, int i, int i2) {
            MediaParser$InputReader mediaParser$InputReader = this.f3156a;
            int i3 = Util.f2928a;
            return f.j(mediaParser$InputReader).read(bArr, i, i2);
        }
    }

    public static final class SeekMapAdapter implements SeekMap {

        /* renamed from: a, reason: collision with root package name */
        public final MediaParser.SeekMap f3157a;

        public SeekMapAdapter(MediaParser.SeekMap seekMap) {
            this.f3157a = seekMap;
        }

        @Override // androidx.media3.extractor.SeekMap
        public final SeekMap.SeekPoints b(long j) {
            Pair seekPoints = this.f3157a.getSeekPoints(j);
            Object obj = seekPoints.first;
            if (obj == seekPoints.second) {
                MediaParser.SeekPoint seekPointL = f.l(obj);
                SeekPoint seekPoint = new SeekPoint(seekPointL.timeMicros, seekPointL.position);
                return new SeekMap.SeekPoints(seekPoint, seekPoint);
            }
            MediaParser.SeekPoint seekPointL2 = f.l(obj);
            SeekPoint seekPoint2 = new SeekPoint(seekPointL2.timeMicros, seekPointL2.position);
            MediaParser.SeekPoint seekPointL3 = f.l(seekPoints.second);
            return new SeekMap.SeekPoints(seekPoint2, new SeekPoint(seekPointL3.timeMicros, seekPointL3.position));
        }

        @Override // androidx.media3.extractor.SeekMap
        public final boolean d() {
            return this.f3157a.isSeekable();
        }

        @Override // androidx.media3.extractor.SeekMap
        public final long l() {
            long durationMicros = this.f3157a.getDurationMicros();
            if (durationMicros != -2147483648L) {
                return durationMicros;
            }
            return -9223372036854775807L;
        }
    }

    public final void a(int i) {
        for (int size = this.f3155a.size(); size <= i; size++) {
            this.f3155a.add(null);
            this.b.add(null);
            this.c.add(null);
            this.d.add(null);
        }
    }

    public final void b() {
        if (!this.k || this.l) {
            return;
        }
        int size = this.f3155a.size();
        for (int i = 0; i < size; i++) {
            if (this.f3155a.get(i) == null) {
                return;
            }
        }
        this.f.h();
        this.l = true;
    }

    public final void c(String str) {
        String str2;
        str.getClass();
        switch (str) {
            case "android.media.mediaparser.Mp4Parser":
            case "android.media.mediaparser.FragmentedMp4Parser":
                str2 = "video/mp4";
                break;
            case "android.media.mediaparser.OggParser":
                str2 = "audio/ogg";
                break;
            case "android.media.mediaparser.TsParser":
                str2 = "video/mp2t";
                break;
            case "android.media.mediaparser.AdtsParser":
                str2 = "audio/mp4a-latm";
                break;
            case "android.media.mediaparser.WavParser":
                str2 = "audio/raw";
                break;
            case "android.media.mediaparser.PsParser":
                str2 = "video/mp2p";
                break;
            case "android.media.mediaparser.Ac3Parser":
                str2 = "audio/ac3";
                break;
            case "android.media.mediaparser.AmrParser":
                str2 = "audio/amr";
                break;
            case "android.media.mediaparser.FlacParser":
                str2 = "audio/flac";
                break;
            case "android.media.mediaparser.MatroskaParser":
                str2 = "video/webm";
                break;
            case "android.media.mediaparser.Ac4Parser":
                str2 = "audio/ac4";
                break;
            case "android.media.mediaparser.Mp3Parser":
                str2 = "audio/mpeg";
                break;
            case "android.media.mediaparser.FlvParser":
                str2 = "video/x-flv";
                break;
            default:
                throw new IllegalArgumentException("Illegal parser name: ".concat(str));
        }
        this.h = str2;
    }

    public final void onSampleCompleted(int i, long j, int i2, int i3, int i4, MediaCodec.CryptoInfo cryptoInfo) throws NumberFormatException {
        int i5;
        int i6;
        TrackOutput trackOutput;
        TrackOutput.CryptoData cryptoData;
        TrackOutput.CryptoData cryptoData2;
        long j2 = this.j;
        if (j2 == -9223372036854775807L || j < j2) {
            TrackOutput trackOutput2 = (TrackOutput) this.f3155a.get(i);
            trackOutput2.getClass();
            if (cryptoInfo == null) {
                cryptoData2 = null;
            } else {
                ArrayList arrayList = this.c;
                MediaCodec.CryptoInfo cryptoInfo2 = (MediaCodec.CryptoInfo) arrayList.get(i);
                ArrayList arrayList2 = this.d;
                if (cryptoInfo2 != cryptoInfo) {
                    try {
                        Matcher matcher = o.matcher(cryptoInfo.toString());
                        matcher.find();
                        String strGroup = matcher.group(1);
                        int i7 = Util.f2928a;
                        i5 = Integer.parseInt(strGroup);
                        i6 = Integer.parseInt(matcher.group(2));
                    } catch (RuntimeException e) {
                        Log.d("OConsumerAdapterV30", "Unexpected error while parsing CryptoInfo: " + cryptoInfo, e);
                        i5 = 0;
                        i6 = 0;
                    }
                    TrackOutput.CryptoData cryptoData3 = new TrackOutput.CryptoData(cryptoInfo.mode, cryptoInfo.key, i5, i6);
                    arrayList.set(i, cryptoInfo);
                    arrayList2.set(i, cryptoData3);
                    trackOutput = trackOutput2;
                    cryptoData = cryptoData3;
                    trackOutput.g(j, i2, i3, i4, cryptoData);
                }
                cryptoData2 = (TrackOutput.CryptoData) arrayList2.get(i);
                cryptoData2.getClass();
            }
            cryptoData = cryptoData2;
            trackOutput = trackOutput2;
            trackOutput.g(j, i2, i3, i4, cryptoData);
        }
    }

    public final void onSampleDataFound(int i, MediaParser$InputReader mediaParser$InputReader) {
        a(i);
        this.e.f3156a = mediaParser$InputReader;
        TrackOutput trackOutputJ = (TrackOutput) this.f3155a.get(i);
        if (trackOutputJ == null) {
            trackOutputJ = this.f.j(i, -1);
            this.f3155a.set(i, trackOutputJ);
        }
        trackOutputJ.b(this.e, (int) mediaParser$InputReader.getLength(), true);
    }

    public final void onSeekMapFound(MediaParser.SeekMap seekMap) {
        SeekMap seekMapAdapter;
        this.g = seekMap;
        long durationMicros = seekMap.getDurationMicros();
        ExtractorOutput extractorOutput = this.f;
        if (this.m) {
            if (durationMicros == -2147483648L) {
                durationMicros = -9223372036854775807L;
            }
            seekMapAdapter = new SeekMap.Unseekable(durationMicros);
        } else {
            seekMapAdapter = new SeekMapAdapter(seekMap);
        }
        extractorOutput.q(seekMapAdapter);
    }

    public final void onTrackCountFound(int i) {
        this.k = true;
        b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onTrackDataFound(int r17, android.media.MediaParser.TrackData r18) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30.onTrackDataFound(int, android.media.MediaParser$TrackData):void");
    }
}
