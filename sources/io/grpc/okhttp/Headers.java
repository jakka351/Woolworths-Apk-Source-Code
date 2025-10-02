package io.grpc.okhttp;

import io.grpc.internal.GrpcUtil;
import io.grpc.okhttp.internal.framed.Header;
import okio.ByteString;

/* loaded from: classes7.dex */
class Headers {

    /* renamed from: a, reason: collision with root package name */
    public static final Header f24116a;
    public static final Header b;
    public static final Header c;
    public static final Header d;
    public static final Header e;
    public static final Header f;

    static {
        ByteString byteString = Header.g;
        f24116a = new Header(byteString, "https");
        b = new Header(byteString, "http");
        ByteString byteString2 = Header.e;
        c = new Header(byteString2, "POST");
        d = new Header(byteString2, "GET");
        e = new Header(GrpcUtil.i.f23960a, "application/grpc");
        f = new Header("te", "trailers");
    }
}
