package androidx.media3.extractor;

import android.net.Uri;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.amr.AmrExtractor;
import androidx.media3.extractor.avi.AviExtractor;
import androidx.media3.extractor.avif.AvifExtractor;
import androidx.media3.extractor.bmp.BmpExtractor;
import androidx.media3.extractor.flac.FlacExtractor;
import androidx.media3.extractor.flv.FlvExtractor;
import androidx.media3.extractor.heif.HeifExtractor;
import androidx.media3.extractor.jpeg.JpegExtractor;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp3.Mp3Extractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.ogg.OggExtractor;
import androidx.media3.extractor.png.PngExtractor;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.ts.Ac3Extractor;
import androidx.media3.extractor.ts.Ac4Extractor;
import androidx.media3.extractor.ts.AdtsExtractor;
import androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.media3.extractor.wav.WavExtractor;
import androidx.media3.extractor.webp.WebpExtractor;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

@UnstableApi
/* loaded from: classes2.dex */
public final class DefaultExtractorsFactory implements ExtractorsFactory {
    public static final int[] h = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final ExtensionLoader i = new ExtensionLoader(new a(0));
    public static final ExtensionLoader j = new ExtensionLoader(new a(1));
    public ImmutableList d;
    public int g;
    public DefaultSubtitleParserFactory f = new DefaultSubtitleParserFactory();
    public boolean e = true;

    public static final class ExtensionLoader {

        /* renamed from: a, reason: collision with root package name */
        public final ConstructorSupplier f3230a;
        public final AtomicBoolean b = new AtomicBoolean(false);

        public interface ConstructorSupplier {
            Constructor e();
        }

        public ExtensionLoader(ConstructorSupplier constructorSupplier) {
            this.f3230a = constructorSupplier;
        }

        public final Extractor a(Object... objArr) {
            Constructor constructorE;
            synchronized (this.b) {
                if (!this.b.get()) {
                    try {
                        constructorE = this.f3230a.e();
                    } catch (ClassNotFoundException unused) {
                        this.b.set(true);
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating extension", e);
                    }
                }
                constructorE = null;
            }
            if (constructorE == null) {
                return null;
            }
            try {
                return (Extractor) constructorE.newInstance(objArr);
            } catch (Exception e2) {
                throw new IllegalStateException("Unexpected error creating extractor", e2);
            }
        }
    }

    public final void a(int i2, ArrayList arrayList) {
        switch (i2) {
            case 0:
                arrayList.add(new Ac3Extractor());
                break;
            case 1:
                arrayList.add(new Ac4Extractor());
                break;
            case 2:
                arrayList.add(new AdtsExtractor());
                break;
            case 3:
                arrayList.add(new AmrExtractor());
                break;
            case 4:
                Extractor extractorA = i.a(0);
                if (extractorA == null) {
                    arrayList.add(new FlacExtractor());
                    break;
                } else {
                    arrayList.add(extractorA);
                    break;
                }
            case 5:
                arrayList.add(new FlvExtractor());
                break;
            case 6:
                arrayList.add(new MatroskaExtractor(this.f, this.e ? 0 : 2));
                break;
            case 7:
                arrayList.add(new Mp3Extractor());
                break;
            case 8:
                arrayList.add(new FragmentedMp4Extractor(this.f, this.e ? 0 : 32));
                arrayList.add(new Mp4Extractor(this.f, this.e ? 0 : 16));
                break;
            case 9:
                arrayList.add(new OggExtractor());
                break;
            case 10:
                arrayList.add(new PsExtractor());
                break;
            case 11:
                if (this.d == null) {
                    this.d = ImmutableList.t();
                }
                arrayList.add(new TsExtractor(!this.e ? 1 : 0, this.f, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(this.d)));
                break;
            case 12:
                arrayList.add(new WavExtractor());
                break;
            case 14:
                arrayList.add(new JpegExtractor(this.g));
                break;
            case 15:
                Extractor extractorA2 = j.a(new Object[0]);
                if (extractorA2 != null) {
                    arrayList.add(extractorA2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new AviExtractor(!this.e ? 1 : 0, this.f));
                break;
            case 17:
                arrayList.add(new PngExtractor());
                break;
            case 18:
                arrayList.add(new WebpExtractor());
                break;
            case 19:
                arrayList.add(new BmpExtractor());
                break;
            case 20:
                arrayList.add(new HeifExtractor());
                break;
            case 21:
                arrayList.add(new AvifExtractor());
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0240 A[Catch: all -> 0x0244, TRY_ENTER, TryCatch #0 {all -> 0x0244, blocks: (B:4:0x0003, B:6:0x0019, B:9:0x0020, B:169:0x0240, B:172:0x0246, B:175:0x024e, B:177:0x0253, B:180:0x0259, B:181:0x025c, B:182:0x025f, B:14:0x002d), top: B:187:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0253 A[Catch: all -> 0x0244, TryCatch #0 {all -> 0x0244, blocks: (B:4:0x0003, B:6:0x0019, B:9:0x0020, B:169:0x0240, B:172:0x0246, B:175:0x024e, B:177:0x0253, B:180:0x0259, B:181:0x025c, B:182:0x025f, B:14:0x002d), top: B:187:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    @Override // androidx.media3.extractor.ExtractorsFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized androidx.media3.extractor.Extractor[] b(android.net.Uri r28, java.util.Map r29) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.DefaultExtractorsFactory.b(android.net.Uri, java.util.Map):androidx.media3.extractor.Extractor[]");
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final synchronized Extractor[] c() {
        return b(Uri.EMPTY, new HashMap());
    }
}
