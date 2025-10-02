package com.scandit.datacapture.core;

import com.dynatrace.android.callback.Callback;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.UnknownServiceException;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class C4 implements InterfaceC1078n7 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1036j1 f18303a;
    private final Lazy b;

    public C4(C1054l1 connectionFactory) {
        Intrinsics.h(connectionFactory, "connectionFactory");
        this.f18303a = connectionFactory;
        this.b = LazyKt.b(new B4(this));
    }

    private final HttpsURLConnection b() {
        return (HttpsURLConnection) this.b.getD();
    }

    public final int c() throws C1113r6 {
        try {
            return Callback.f(b());
        } catch (IOException e) {
            throw new C1113r6(e);
        }
    }

    public final void d() throws IOException, C1068m6 {
        try {
            b().connect();
        } catch (IOException e) {
            throw new C1068m6(e);
        }
    }

    public final Map e() throws C1104q6 {
        try {
            Map<String, List<String>> headerFields = b().getHeaderFields();
            Intrinsics.g(headerFields, "{\n        connection.headerFields\n    }");
            return headerFields;
        } catch (IOException e) {
            throw new C1104q6(e);
        }
    }

    public final InputStream f() throws C1185z6, C1086o6 {
        try {
            InputStream errorStream = b().getErrorStream();
            Intrinsics.g(errorStream, "{\n        connection.errorStream\n    }");
            return errorStream;
        } catch (UnknownServiceException e) {
            throw new C1185z6(e);
        } catch (IOException e2) {
            throw new C1086o6(e2);
        }
    }

    public final InputStream g() throws C1185z6, C1086o6 {
        try {
            InputStream inputStreamB = Callback.b(b());
            Intrinsics.g(inputStreamB, "{\n        connection.inputStream\n    }");
            return inputStreamB;
        } catch (UnknownServiceException e) {
            throw new C1185z6(e);
        } catch (IOException e2) {
            throw new C1086o6(e2);
        }
    }

    public final OutputStream h() throws C1095p6, A6 {
        try {
            if (b().getDoOutput()) {
                return Callback.c(b());
            }
            return null;
        } catch (UnknownServiceException e) {
            throw new A6(e);
        } catch (IOException e2) {
            throw new C1095p6(e2);
        }
    }

    public final void a() throws C1059l6 {
        try {
            b().disconnect();
        } catch (IOException e) {
            throw new C1059l6(e);
        }
    }
}
