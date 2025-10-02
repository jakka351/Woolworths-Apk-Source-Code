package io.grpc.okhttp;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.salesforce.marketingcloud.storage.db.k;
import io.grpc.internal.GrpcUtil;
import io.grpc.okhttp.internal.OptionalMethod;
import io.grpc.okhttp.internal.Platform;
import io.grpc.okhttp.internal.Protocol;
import io.grpc.okhttp.internal.Util;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes7.dex */
class OkHttpProtocolNegotiator {
    public static final Logger b;
    public static final OkHttpProtocolNegotiator c;

    /* renamed from: a, reason: collision with root package name */
    public final Platform f24124a;

    @VisibleForTesting
    public static final class AndroidNegotiator extends OkHttpProtocolNegotiator {
        public static final OptionalMethod d;
        public static final OptionalMethod e;
        public static final OptionalMethod f;
        public static final OptionalMethod g;
        public static final OptionalMethod h;
        public static final OptionalMethod i;
        public static final Method j;
        public static final Method k;
        public static final Method l;
        public static final Method m;
        public static final Method n;
        public static final Method o;
        public static final Constructor p;

        static {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Method method5;
            Method method6;
            Logger logger = OkHttpProtocolNegotiator.b;
            Class cls = Boolean.TYPE;
            Constructor<?> constructor = null;
            d = new OptionalMethod(null, "setUseSessionTickets", cls);
            e = new OptionalMethod(null, "setHostname", String.class);
            f = new OptionalMethod(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            g = new OptionalMethod(null, "setAlpnProtocols", byte[].class);
            h = new OptionalMethod(byte[].class, "getNpnSelectedProtocol", new Class[0]);
            i = new OptionalMethod(null, "setNpnProtocols", byte[].class);
            try {
                method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            } catch (ClassNotFoundException e2) {
                e = e2;
                method = null;
                method2 = null;
            } catch (NoSuchMethodException e3) {
                e = e3;
                method = null;
                method2 = null;
            }
            try {
                method2 = SSLParameters.class.getMethod("getApplicationProtocols", null);
                try {
                    method3 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                    try {
                        Class<?> cls2 = Class.forName("android.net.ssl.SSLSockets");
                        method4 = cls2.getMethod("isSupportedSocket", SSLSocket.class);
                        try {
                            method5 = cls2.getMethod("setUseSessionTickets", SSLSocket.class, cls);
                        } catch (ClassNotFoundException e4) {
                            e = e4;
                            logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                            method5 = null;
                            l = method;
                            m = method2;
                            n = method3;
                            j = method4;
                            k = method5;
                            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                            try {
                                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                            } catch (ClassNotFoundException e5) {
                                e = e5;
                                logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                                o = method6;
                                p = constructor;
                            } catch (NoSuchMethodException e6) {
                                e = e6;
                                logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                                o = method6;
                                p = constructor;
                            }
                            o = method6;
                            p = constructor;
                        } catch (NoSuchMethodException e7) {
                            e = e7;
                            logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                            method5 = null;
                            l = method;
                            m = method2;
                            n = method3;
                            j = method4;
                            k = method5;
                            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                            o = method6;
                            p = constructor;
                        }
                    } catch (ClassNotFoundException e8) {
                        e = e8;
                        method4 = null;
                    } catch (NoSuchMethodException e9) {
                        e = e9;
                        method4 = null;
                    }
                } catch (ClassNotFoundException e10) {
                    e = e10;
                    method3 = null;
                    method4 = method3;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    l = method;
                    m = method2;
                    n = method3;
                    j = method4;
                    k = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    o = method6;
                    p = constructor;
                } catch (NoSuchMethodException e11) {
                    e = e11;
                    method3 = null;
                    method4 = method3;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    l = method;
                    m = method2;
                    n = method3;
                    j = method4;
                    k = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    o = method6;
                    p = constructor;
                }
            } catch (ClassNotFoundException e12) {
                e = e12;
                method2 = null;
                method3 = method2;
                method4 = method3;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                l = method;
                m = method2;
                n = method3;
                j = method4;
                k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                o = method6;
                p = constructor;
            } catch (NoSuchMethodException e13) {
                e = e13;
                method2 = null;
                method3 = method2;
                method4 = method3;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                l = method;
                m = method2;
                n = method3;
                j = method4;
                k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                o = method6;
                p = constructor;
            }
            l = method;
            m = method2;
            n = method3;
            j = method4;
            k = method5;
            try {
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            } catch (ClassNotFoundException e14) {
                e = e14;
                method6 = null;
            } catch (NoSuchMethodException e15) {
                e = e15;
                method6 = null;
            }
            o = method6;
            p = constructor;
        }

        @Override // io.grpc.okhttp.OkHttpProtocolNegotiator
        public final void a(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Constructor constructor;
            Method method;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Protocol) it.next()).d);
            }
            boolean z = false;
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            if (str != null) {
                try {
                    try {
                        if (OkHttpProtocolNegotiator.c(str)) {
                            Method method2 = j;
                            if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                d.d(sSLSocket, Boolean.TRUE);
                            } else {
                                k.invoke(null, sSLSocket, Boolean.TRUE);
                            }
                            Method method3 = o;
                            if (method3 == null || (constructor = p) == null) {
                                e.d(sSLSocket, str);
                            } else {
                                method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                            }
                        }
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    } catch (InstantiationException e3) {
                        throw new RuntimeException(e3);
                    }
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException(e4);
                }
            }
            Method method4 = n;
            if (method4 != null) {
                try {
                    method4.invoke(sSLSocket, null);
                    l.invoke(sSLParameters, strArr);
                    z = true;
                } catch (InvocationTargetException e5) {
                    if (!(e5.getTargetException() instanceof UnsupportedOperationException)) {
                        throw e5;
                    }
                    OkHttpProtocolNegotiator.b.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
                }
            }
            sSLSocket.setSSLParameters(sSLParameters);
            if (z && (method = m) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
                return;
            }
            Object[] objArr = {Platform.b(list)};
            Platform platform = this.f24124a;
            if (platform.e() == Platform.TlsExtensionType.d) {
                g.e(sSLSocket, objArr);
            }
            if (platform.e() == Platform.TlsExtensionType.f) {
                throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
            }
            i.e(sSLSocket, objArr);
        }

        @Override // io.grpc.okhttp.OkHttpProtocolNegotiator
        public final String b(SSLSocket sSLSocket) {
            Logger logger = OkHttpProtocolNegotiator.b;
            Method method = n;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, null);
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e3) {
                    if (!(e3.getTargetException() instanceof UnsupportedOperationException)) {
                        throw new RuntimeException(e3);
                    }
                    logger.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                }
            }
            Platform platform = this.f24124a;
            if (platform.e() == Platform.TlsExtensionType.d) {
                try {
                    byte[] bArr = (byte[]) f.e(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, Util.b);
                    }
                } catch (Exception e4) {
                    logger.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e4);
                }
            }
            if (platform.e() != Platform.TlsExtensionType.f) {
                try {
                    byte[] bArr2 = (byte[]) h.e(sSLSocket, new Object[0]);
                    if (bArr2 != null) {
                        return new String(bArr2, Util.b);
                    }
                } catch (Exception e5) {
                    logger.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e5);
                }
            }
            return null;
        }

        @Override // io.grpc.okhttp.OkHttpProtocolNegotiator
        public final String d(SSLSocket sSLSocket, String str, List list) {
            String strB = b(sSLSocket);
            return strB == null ? super.d(sSLSocket, str, list) : strB;
        }
    }

    static {
        OkHttpProtocolNegotiator okHttpProtocolNegotiator;
        Logger logger = Logger.getLogger(OkHttpProtocolNegotiator.class.getName());
        b = logger;
        Platform platform = Platform.d;
        ClassLoader classLoader = OkHttpProtocolNegotiator.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            logger.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                logger.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e2);
                okHttpProtocolNegotiator = new OkHttpProtocolNegotiator(platform);
            }
        }
        okHttpProtocolNegotiator = new AndroidNegotiator(platform);
        c = okHttpProtocolNegotiator;
    }

    public OkHttpProtocolNegotiator(Platform platform) {
        Preconditions.j(platform, k.a.b);
        this.f24124a = platform;
    }

    public static boolean c(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            Preconditions.e("Userinfo must not be present on authority: '%s'", str, GrpcUtil.a(str).getAuthority().indexOf(64) == -1);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void a(SSLSocket sSLSocket, String str, List list) {
        this.f24124a.c(sSLSocket, str, list);
    }

    public String b(SSLSocket sSLSocket) {
        return this.f24124a.d(sSLSocket);
    }

    public String d(SSLSocket sSLSocket, String str, List list) {
        Platform platform = this.f24124a;
        if (list != null) {
            a(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String strB = b(sSLSocket);
            if (strB != null) {
                return strB;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            platform.a(sSLSocket);
        }
    }
}
