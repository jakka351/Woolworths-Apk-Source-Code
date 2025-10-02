package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.webvtt.WebvttCueParser;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

@UnstableApi
/* loaded from: classes2.dex */
public final class Mp4WebvttParser implements SubtitleParser {

    /* renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f3394a = new ParsableByteArray();

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final void a(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        Cue cueA;
        ParsableByteArray parsableByteArray = this.f3394a;
        parsableByteArray.E(i + i2, bArr);
        parsableByteArray.G(i);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.a() > 0) {
            Assertions.a("Incomplete Mp4Webvtt Top Level box header found.", parsableByteArray.a() >= 8);
            int iG = parsableByteArray.g();
            if (parsableByteArray.g() == 1987343459) {
                int i3 = iG - 8;
                CharSequence charSequenceF = null;
                Cue.Builder builderA = null;
                while (i3 > 0) {
                    Assertions.a("Incomplete vtt cue box header found.", i3 >= 8);
                    int iG2 = parsableByteArray.g();
                    int iG3 = parsableByteArray.g();
                    int i4 = iG2 - 8;
                    byte[] bArr2 = parsableByteArray.f2922a;
                    int i5 = parsableByteArray.b;
                    int i6 = Util.f2928a;
                    String str = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    parsableByteArray.H(i4);
                    i3 = (i3 - 8) - i4;
                    if (iG3 == 1937011815) {
                        WebvttCueParser.WebvttCueInfoBuilder webvttCueInfoBuilder = new WebvttCueParser.WebvttCueInfoBuilder();
                        WebvttCueParser.e(str, webvttCueInfoBuilder);
                        builderA = webvttCueInfoBuilder.a();
                    } else if (iG3 == 1885436268) {
                        charSequenceF = WebvttCueParser.f(null, str.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (builderA != null) {
                    builderA.f2897a = charSequenceF;
                    cueA = builderA.a();
                } else {
                    Pattern pattern = WebvttCueParser.f3398a;
                    WebvttCueParser.WebvttCueInfoBuilder webvttCueInfoBuilder2 = new WebvttCueParser.WebvttCueInfoBuilder();
                    webvttCueInfoBuilder2.c = charSequenceF;
                    cueA = webvttCueInfoBuilder2.a().a();
                }
                arrayList.add(cueA);
            } else {
                parsableByteArray.H(iG - 8);
            }
        }
        consumer.accept(new CuesWithTiming(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
