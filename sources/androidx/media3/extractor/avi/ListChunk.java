package androidx.media3.extractor.avi;

import androidx.compose.ui.input.pointer.a;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
final class ListChunk implements AviChunk {

    /* renamed from: a, reason: collision with root package name */
    public final ImmutableList f3266a;
    public final int b;

    public ListChunk(int i, ImmutableList immutableList) {
        this.b = i;
        this.f3266a = immutableList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ListChunk b(int i, ParsableByteArray parsableByteArray) {
        AviChunk streamFormatChunk;
        String str;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i2 = parsableByteArray.c;
        int iA = -2;
        while (parsableByteArray.a() > 8) {
            int i3 = parsableByteArray.i();
            int i4 = parsableByteArray.b + parsableByteArray.i();
            parsableByteArray.F(i4);
            if (i3 != 1414744396) {
                AviStreamHeaderChunk aviStreamHeaderChunk = null;
                switch (i3) {
                    case 1718776947:
                        if (iA == 2) {
                            parsableByteArray.H(4);
                            int i5 = parsableByteArray.i();
                            int i6 = parsableByteArray.i();
                            parsableByteArray.H(4);
                            int i7 = parsableByteArray.i();
                            switch (i7) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                Format.Builder builder2 = new Format.Builder();
                                builder2.t = i5;
                                builder2.u = i6;
                                builder2.m = MimeTypes.m(str);
                                streamFormatChunk = new StreamFormatChunk(new Format(builder2));
                                break;
                            } else {
                                a.t(i7, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                streamFormatChunk = aviStreamHeaderChunk;
                                break;
                            }
                        } else {
                            if (iA == 1) {
                                int iN = parsableByteArray.n();
                                String str2 = iN != 1 ? iN != 85 ? iN != 255 ? iN != 8192 ? iN != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int iN2 = parsableByteArray.n();
                                    int i8 = parsableByteArray.i();
                                    parsableByteArray.H(6);
                                    int iW = Util.w(parsableByteArray.n());
                                    int iN3 = parsableByteArray.a() > 0 ? parsableByteArray.n() : 0;
                                    Format.Builder builder3 = new Format.Builder();
                                    builder3.m = MimeTypes.m(str2);
                                    builder3.C = iN2;
                                    builder3.D = i8;
                                    if (str2.equals("audio/raw") && iW != 0) {
                                        builder3.E = iW;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && iN3 > 0) {
                                        byte[] bArr = new byte[iN3];
                                        parsableByteArray.e(0, iN3, bArr);
                                        builder3.p = ImmutableList.w(bArr);
                                    }
                                    streamFormatChunk = new StreamFormatChunk(new Format(builder3));
                                    break;
                                } else {
                                    a.t(iN, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                Log.g("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + Util.z(iA));
                            }
                            streamFormatChunk = aviStreamHeaderChunk;
                        }
                    case 1751742049:
                        int i9 = parsableByteArray.i();
                        parsableByteArray.H(8);
                        int i10 = parsableByteArray.i();
                        int i11 = parsableByteArray.i();
                        parsableByteArray.H(4);
                        parsableByteArray.i();
                        parsableByteArray.H(12);
                        streamFormatChunk = new AviMainHeaderChunk(i9, i10, i11);
                        break;
                    case 1752331379:
                        int i12 = parsableByteArray.i();
                        parsableByteArray.H(12);
                        parsableByteArray.i();
                        int i13 = parsableByteArray.i();
                        int i14 = parsableByteArray.i();
                        parsableByteArray.H(4);
                        int i15 = parsableByteArray.i();
                        int i16 = parsableByteArray.i();
                        parsableByteArray.H(4);
                        aviStreamHeaderChunk = new AviStreamHeaderChunk(i12, i13, i14, i15, i16, parsableByteArray.i());
                        streamFormatChunk = aviStreamHeaderChunk;
                        break;
                    case 1852994675:
                        streamFormatChunk = new StreamNameChunk(parsableByteArray.s(parsableByteArray.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        streamFormatChunk = aviStreamHeaderChunk;
                        break;
                }
            } else {
                streamFormatChunk = b(parsableByteArray.i(), parsableByteArray);
            }
            if (streamFormatChunk != null) {
                if (streamFormatChunk.getType() == 1752331379) {
                    iA = ((AviStreamHeaderChunk) streamFormatChunk).a();
                }
                builder.h(streamFormatChunk);
            }
            parsableByteArray.G(i4);
            parsableByteArray.F(i2);
        }
        return new ListChunk(i, builder.j());
    }

    public final AviChunk a(Class cls) {
        UnmodifiableListIterator unmodifiableListIteratorListIterator = this.f3266a.listIterator(0);
        while (unmodifiableListIteratorListIterator.hasNext()) {
            AviChunk aviChunk = (AviChunk) unmodifiableListIteratorListIterator.next();
            if (aviChunk.getClass() == cls) {
                return aviChunk;
            }
        }
        return null;
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public final int getType() {
        return this.b;
    }
}
