package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ts.TsPayloadReader;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public final class DefaultTsPayloadReaderFactory implements TsPayloadReader.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final List f3409a;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public DefaultTsPayloadReaderFactory(List list) {
        this.f3409a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    public final List a(TsPayloadReader.EsInfo esInfo) {
        String str;
        int i;
        List listSingletonList;
        ParsableByteArray parsableByteArray = new ParsableByteArray(esInfo.d);
        ArrayList arrayList = this.f3409a;
        while (parsableByteArray.a() > 0) {
            int iU = parsableByteArray.u();
            int iU2 = parsableByteArray.b + parsableByteArray.u();
            if (iU == 134) {
                arrayList = new ArrayList();
                int iU3 = parsableByteArray.u() & 31;
                for (int i2 = 0; i2 < iU3; i2++) {
                    String strS = parsableByteArray.s(3, StandardCharsets.UTF_8);
                    int iU4 = parsableByteArray.u();
                    boolean z = (iU4 & 128) != 0;
                    if (z) {
                        i = iU4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bU = (byte) parsableByteArray.u();
                    parsableByteArray.H(1);
                    if (z) {
                        boolean z2 = (bU & 64) != 0;
                        byte[] bArr = CodecSpecificDataUtil.f2907a;
                        listSingletonList = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    Format.Builder builder = new Format.Builder();
                    builder.m = MimeTypes.m(str);
                    builder.d = strS;
                    builder.H = i;
                    builder.p = listSingletonList;
                    arrayList.add(new Format(builder));
                }
            }
            parsableByteArray.G(iU2);
            arrayList = arrayList;
        }
        return arrayList;
    }
}
