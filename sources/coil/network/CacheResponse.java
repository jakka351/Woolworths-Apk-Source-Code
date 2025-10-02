package coil.network;

import android.graphics.Bitmap;
import coil.util.Utils;
import java.io.EOFException;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.oriient.internal.infra.rest.RequestBuilder;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Response;
import okio.RealBufferedSink;
import okio.RealBufferedSource;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/network/CacheResponse;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CacheResponse {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13009a;
    public final Object b;
    public final long c;
    public final long d;
    public final boolean e;
    public final Headers f;

    public CacheResponse(RealBufferedSource realBufferedSource) throws NumberFormatException, EOFException {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.e;
        this.f13009a = LazyKt.a(lazyThreadSafetyMode, new Function0<CacheControl>() { // from class: coil.network.CacheResponse$cacheControl$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CacheControl.Companion companion = CacheControl.n;
                Headers headers = this.h.f;
                companion.getClass();
                return CacheControl.Companion.a(headers);
            }
        });
        this.b = LazyKt.a(lazyThreadSafetyMode, new Function0<MediaType>() { // from class: coil.network.CacheResponse$contentType$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String strB = this.h.f.b(RequestBuilder.CONTENT_TYPE);
                if (strB != null) {
                    MediaType.e.getClass();
                    try {
                        return MediaType.Companion.a(strB);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return null;
            }
        });
        this.c = Long.parseLong(realBufferedSource.n1(Long.MAX_VALUE));
        this.d = Long.parseLong(realBufferedSource.n1(Long.MAX_VALUE));
        this.e = Integer.parseInt(realBufferedSource.n1(Long.MAX_VALUE)) > 0;
        int i = Integer.parseInt(realBufferedSource.n1(Long.MAX_VALUE));
        Headers.Builder builder = new Headers.Builder();
        for (int i2 = 0; i2 < i; i2++) {
            String strN1 = realBufferedSource.n1(Long.MAX_VALUE);
            Bitmap.Config[] configArr = Utils.f13033a;
            int iB = StringsKt.B(strN1, ':', 0, 6);
            if (iB == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strN1).toString());
            }
            String strSubstring = strN1.substring(0, iB);
            Intrinsics.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string = StringsKt.k0(strSubstring).toString();
            String strSubstring2 = strN1.substring(iB + 1);
            Intrinsics.g(strSubstring2, "this as java.lang.String).substring(startIndex)");
            builder.d(string, strSubstring2);
        }
        this.f = builder.e();
    }

    public final void a(RealBufferedSink realBufferedSink) {
        realBufferedSink.n0(this.c);
        realBufferedSink.writeByte(10);
        realBufferedSink.n0(this.d);
        realBufferedSink.writeByte(10);
        realBufferedSink.n0(this.e ? 1L : 0L);
        realBufferedSink.writeByte(10);
        Headers headers = this.f;
        realBufferedSink.n0(headers.size());
        realBufferedSink.writeByte(10);
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            realBufferedSink.r1(headers.d(i));
            realBufferedSink.r1(": ");
            realBufferedSink.r1(headers.i(i));
            realBufferedSink.writeByte(10);
        }
    }

    public CacheResponse(Response response) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.e;
        this.f13009a = LazyKt.a(lazyThreadSafetyMode, new Function0<CacheControl>() { // from class: coil.network.CacheResponse$cacheControl$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CacheControl.Companion companion = CacheControl.n;
                Headers headers = this.h.f;
                companion.getClass();
                return CacheControl.Companion.a(headers);
            }
        });
        this.b = LazyKt.a(lazyThreadSafetyMode, new Function0<MediaType>() { // from class: coil.network.CacheResponse$contentType$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String strB = this.h.f.b(RequestBuilder.CONTENT_TYPE);
                if (strB != null) {
                    MediaType.e.getClass();
                    try {
                        return MediaType.Companion.a(strB);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return null;
            }
        });
        this.c = response.n;
        this.d = response.o;
        this.e = response.h != null;
        this.f = response.i;
    }
}
