package androidx.media3.datasource;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

@UnstableApi
/* loaded from: classes2.dex */
public final class DataSchemeDataSource extends BaseDataSource {
    public DataSpec e;
    public byte[] f;
    public int g;
    public int h;

    @Override // androidx.media3.datasource.DataSource
    public final long a(DataSpec dataSpec) throws ParserException, DataSourceException {
        o(dataSpec);
        this.e = dataSpec;
        Uri uri = dataSpec.f2957a;
        long j = dataSpec.g;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        Assertions.a("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i = Util.f2928a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ParserException(android.support.v4.media.session.a.m(uriNormalizeScheme, "Unexpected URI format: "), null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new ParserException(YU.a.A("Error while parsing Base64 encoded string: ", str), e, true, 0);
            }
        } else {
            this.f = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = dataSpec.f;
        byte[] bArr = this.f;
        if (j2 > bArr.length) {
            this.f = null;
            throw new DataSourceException(2008);
        }
        int i2 = (int) j2;
        this.g = i2;
        int length = bArr.length - i2;
        this.h = length;
        if (j != -1) {
            this.h = (int) Math.min(length, j);
        }
        p(dataSpec);
        return j != -1 ? j : this.h;
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        if (this.f != null) {
            this.f = null;
            n();
        }
        this.e = null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        DataSpec dataSpec = this.e;
        if (dataSpec != null) {
            return dataSpec.f2957a;
        }
        return null;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        int i4 = Util.f2928a;
        System.arraycopy(bArr2, this.g, bArr, i, iMin);
        this.g += iMin;
        this.h -= iMin;
        m(iMin);
        return iMin;
    }
}
