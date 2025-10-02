package io.grpc.okhttp.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okio.Buffer;

/* loaded from: classes7.dex */
public class Platform {
    public static final Logger b;
    public static final String[] c;
    public static final Platform d;

    /* renamed from: a, reason: collision with root package name */
    public final Provider f24139a;

    /* renamed from: io.grpc.okhttp.internal.Platform$1, reason: invalid class name */
    class AnonymousClass1 implements PrivilegedExceptionAction<Method> {
        @Override // java.security.PrivilegedExceptionAction
        public final Method run() {
            return SSLEngine.class.getMethod("getApplicationProtocol", null);
        }
    }

    /* renamed from: io.grpc.okhttp.internal.Platform$2, reason: invalid class name */
    class AnonymousClass2 implements PrivilegedExceptionAction<Method> {
        @Override // java.security.PrivilegedExceptionAction
        public final Method run() {
            return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
        }
    }

    /* renamed from: io.grpc.okhttp.internal.Platform$3, reason: invalid class name */
    class AnonymousClass3 implements PrivilegedExceptionAction<Method> {
        @Override // java.security.PrivilegedExceptionAction
        public final Method run() {
            return SSLSocket.class.getMethod("getApplicationProtocol", null);
        }
    }

    public static class Android extends Platform {
        public final OptionalMethod e;
        public final OptionalMethod f;
        public final OptionalMethod g;
        public final OptionalMethod h;
        public final TlsExtensionType i;

        public Android(OptionalMethod optionalMethod, OptionalMethod optionalMethod2, OptionalMethod optionalMethod3, OptionalMethod optionalMethod4, Provider provider, TlsExtensionType tlsExtensionType) {
            super(provider);
            this.e = optionalMethod;
            this.f = optionalMethod2;
            this.g = optionalMethod3;
            this.h = optionalMethod4;
            this.i = tlsExtensionType;
        }

        @Override // io.grpc.okhttp.internal.Platform
        public final void c(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (str != null) {
                this.e.d(sSLSocket, Boolean.TRUE);
                this.f.d(sSLSocket, str);
            }
            Class<?> cls = sSLSocket.getClass();
            OptionalMethod optionalMethod = this.h;
            if (optionalMethod.a(cls) != null) {
                optionalMethod.e(sSLSocket, Platform.b(list));
            }
        }

        @Override // io.grpc.okhttp.internal.Platform
        public final String d(SSLSocket sSLSocket) {
            byte[] bArr;
            Class<?> cls = sSLSocket.getClass();
            OptionalMethod optionalMethod = this.g;
            if (optionalMethod.a(cls) == null || (bArr = (byte[]) optionalMethod.e(sSLSocket, new Object[0])) == null) {
                return null;
            }
            return new String(bArr, Util.b);
        }

        @Override // io.grpc.okhttp.internal.Platform
        public final TlsExtensionType e() {
            return this.i;
        }
    }

    public static class JdkAlpnPlatform extends Platform {
        public final Method e;
        public final Method f;

        public JdkAlpnPlatform(Provider provider, Method method, Method method2) {
            super(provider);
            this.e = method;
            this.f = method2;
        }

        @Override // io.grpc.okhttp.internal.Platform
        public final void c(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Protocol protocol = (Protocol) it.next();
                if (protocol != Protocol.HTTP_1_0) {
                    arrayList.add(protocol.d);
                }
            }
            try {
                this.e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // io.grpc.okhttp.internal.Platform
        public final String d(SSLSocket sSLSocket) {
            try {
                return (String) this.f.invoke(sSLSocket, null);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // io.grpc.okhttp.internal.Platform
        public final TlsExtensionType e() {
            return TlsExtensionType.d;
        }
    }

    public static class JdkWithJettyBootPlatform extends Platform {
        public final Method e;
        public final Method f;
        public final Method g;
        public final Class h;
        public final Class i;

        public JdkWithJettyBootPlatform(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
            super(provider);
            this.e = method;
            this.f = method2;
            this.g = method3;
            this.h = cls;
            this.i = cls2;
        }

        @Override // io.grpc.okhttp.internal.Platform
        public final void a(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                this.g.invoke(null, sSLSocket);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e) {
                Platform.b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e);
            }
        }

        @Override // io.grpc.okhttp.internal.Platform
        public final void c(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Protocol protocol = (Protocol) list.get(i);
                if (protocol != Protocol.HTTP_1_0) {
                    arrayList.add(protocol.d);
                }
            }
            try {
                this.e.invoke(null, sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.h, this.i}, new JettyNegoProvider(arrayList)));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // io.grpc.okhttp.internal.Platform
        public final String d(SSLSocket sSLSocket) {
            try {
                JettyNegoProvider jettyNegoProvider = (JettyNegoProvider) Proxy.getInvocationHandler(this.f.invoke(null, sSLSocket));
                boolean z = jettyNegoProvider.b;
                if (!z && jettyNegoProvider.c == null) {
                    Platform.b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                }
                if (z) {
                    return null;
                }
                return jettyNegoProvider.c;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                throw new AssertionError();
            }
        }

        @Override // io.grpc.okhttp.internal.Platform
        public final TlsExtensionType e() {
            return TlsExtensionType.d;
        }
    }

    public static class JettyNegoProvider implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f24140a;
        public boolean b;
        public String c;

        public JettyNegoProvider(ArrayList arrayList) {
            this.f24140a = arrayList;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = Util.f24142a;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.b = true;
                return null;
            }
            boolean zEquals = name.equals("protocols");
            ArrayList arrayList = this.f24140a;
            if (zEquals && objArr.length == 0) {
                return arrayList;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (arrayList.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.c = str;
                            return str;
                        }
                    }
                    String str2 = (String) arrayList.get(0);
                    this.c = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.c = (String) objArr[0];
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TlsExtensionType {
        public static final TlsExtensionType d;
        public static final TlsExtensionType e;
        public static final TlsExtensionType f;
        public static final /* synthetic */ TlsExtensionType[] g;

        static {
            TlsExtensionType tlsExtensionType = new TlsExtensionType("ALPN_AND_NPN", 0);
            d = tlsExtensionType;
            TlsExtensionType tlsExtensionType2 = new TlsExtensionType("NPN", 1);
            e = tlsExtensionType2;
            TlsExtensionType tlsExtensionType3 = new TlsExtensionType("NONE", 2);
            f = tlsExtensionType3;
            g = new TlsExtensionType[]{tlsExtensionType, tlsExtensionType2, tlsExtensionType3};
        }

        public static TlsExtensionType valueOf(String str) {
            return (TlsExtensionType) Enum.valueOf(TlsExtensionType.class, str);
        }

        public static TlsExtensionType[] values() {
            return (TlsExtensionType[]) g.clone();
        }
    }

    static {
        Provider provider;
        Provider provider2;
        Platform platform;
        Logger logger = Logger.getLogger(Platform.class.getName());
        b = logger;
        c = new String[]{"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i = 0;
        loop0: while (true) {
            if (i >= length) {
                logger.log(Level.WARNING, "Unable to find Conscrypt");
                provider = null;
                break;
            }
            Provider provider3 = providers[i];
            for (String str : c) {
                if (str.equals(provider3.getClass().getName())) {
                    logger.log(Level.FINE, "Found registered provider {0}", str);
                    provider = provider3;
                    break loop0;
                }
            }
            i++;
        }
        if (provider != null) {
            OptionalMethod optionalMethod = new OptionalMethod(null, "setUseSessionTickets", Boolean.TYPE);
            OptionalMethod optionalMethod2 = new OptionalMethod(null, "setHostname", String.class);
            OptionalMethod optionalMethod3 = new OptionalMethod(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            OptionalMethod optionalMethod4 = new OptionalMethod(null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            boolean zEquals = provider.getName().equals("GmsCore_OpenSSL");
            TlsExtensionType tlsExtensionType = TlsExtensionType.d;
            if (!zEquals && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    Platform.class.getClassLoader().loadClass("android.net.Network");
                } catch (ClassNotFoundException e) {
                    logger.log(Level.FINE, "Can't find class", (Throwable) e);
                    try {
                        Platform.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        tlsExtensionType = TlsExtensionType.e;
                    } catch (ClassNotFoundException e2) {
                        logger.log(Level.FINE, "Can't find class", (Throwable) e2);
                        tlsExtensionType = TlsExtensionType.f;
                    }
                }
            }
            platform = new Android(optionalMethod, optionalMethod2, optionalMethod3, optionalMethod4, provider, tlsExtensionType);
        } else {
            try {
                Provider provider4 = SSLContext.getDefault().getProvider();
                try {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS", provider4);
                        sSLContext.init(null, null, null);
                        ((Method) AccessController.doPrivileged(new AnonymousClass1())).invoke(sSLContext.createSSLEngine(), null);
                        platform = new JdkAlpnPlatform(provider4, (Method) AccessController.doPrivileged(new AnonymousClass2()), (Method) AccessController.doPrivileged(new AnonymousClass3()));
                    } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused2) {
                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        try {
                            platform = new JdkWithJettyBootPlatform(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider4);
                        } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                            provider2 = provider4;
                            platform = new Platform(provider2);
                            d = platform;
                        }
                    }
                } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                    provider2 = provider4;
                    platform = new Platform(provider2);
                    d = platform;
                }
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(e3);
            }
        }
        d = platform;
    }

    public Platform(Provider provider) {
        this.f24139a = provider;
    }

    public static byte[] b(List list) {
        Buffer buffer = new Buffer();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = (Protocol) list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                buffer.Y(protocol.d.length());
                buffer.t0(protocol.d);
            }
        }
        return buffer.j(buffer.e);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
    }

    public String d(SSLSocket sSLSocket) {
        return null;
    }

    public TlsExtensionType e() {
        return TlsExtensionType.f;
    }
}
