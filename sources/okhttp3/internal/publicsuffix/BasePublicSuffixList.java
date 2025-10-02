package okhttp3.internal.publicsuffix;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import okio.Okio;
import okio.RealBufferedSource;
import okio.Source;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/publicsuffix/BasePublicSuffixList;", "Lokhttp3/internal/publicsuffix/PublicSuffixList;", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class BasePublicSuffixList implements PublicSuffixList {
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final CountDownLatch c = new CountDownLatch(1);
    public ByteString d;
    public ByteString e;

    public final ByteString a() {
        ByteString byteString = this.d;
        if (byteString != null) {
            return byteString;
        }
        Intrinsics.p("bytes");
        throw null;
    }

    public abstract Source b();

    public final void c() {
        try {
            RealBufferedSource realBufferedSourceC = Okio.c(b());
            try {
                ByteString byteStringP0 = realBufferedSourceC.p0(realBufferedSourceC.readInt());
                ByteString byteStringP02 = realBufferedSourceC.p0(realBufferedSourceC.readInt());
                realBufferedSourceC.close();
                synchronized (this) {
                    Intrinsics.e(byteStringP0);
                    this.d = byteStringP0;
                    Intrinsics.e(byteStringP02);
                    this.e = byteStringP02;
                }
            } finally {
            }
        } finally {
            this.c.countDown();
        }
    }
}
