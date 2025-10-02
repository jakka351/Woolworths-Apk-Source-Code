package com.google.crypto.tink;

import androidx.constraintlayout.core.state.a;
import com.google.crypto.tink.KeyManagerImpl;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class Registry {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f14983a = Logger.getLogger(Registry.class.getName());
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final ConcurrentHashMap e;

    /* renamed from: com.google.crypto.tink.Registry$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    class AnonymousClass1 implements KeyManagerContainer {
        @Override // com.google.crypto.tink.Registry.KeyManagerContainer
        public final Class a() {
            return null;
        }

        @Override // com.google.crypto.tink.Registry.KeyManagerContainer
        public final Class b() {
            throw null;
        }

        @Override // com.google.crypto.tink.Registry.KeyManagerContainer
        public final KeyManager c(Class cls) {
            throw null;
        }

        @Override // com.google.crypto.tink.Registry.KeyManagerContainer
        public final Set d() {
            throw null;
        }

        @Override // com.google.crypto.tink.Registry.KeyManagerContainer
        public final KeyManager e() {
            return null;
        }
    }

    /* renamed from: com.google.crypto.tink.Registry$2, reason: invalid class name */
    class AnonymousClass2 implements KeyManagerContainer {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KeyTypeManager f14984a;

        public AnonymousClass2(KeyTypeManager keyTypeManager) {
            this.f14984a = keyTypeManager;
        }

        @Override // com.google.crypto.tink.Registry.KeyManagerContainer
        public final Class a() {
            return null;
        }

        @Override // com.google.crypto.tink.Registry.KeyManagerContainer
        public final Class b() {
            return this.f14984a.getClass();
        }

        @Override // com.google.crypto.tink.Registry.KeyManagerContainer
        public final KeyManager c(Class cls) throws GeneralSecurityException {
            try {
                return new KeyManagerImpl(this.f14984a, cls);
            } catch (IllegalArgumentException e) {
                throw new GeneralSecurityException("Primitive type not supported", e);
            }
        }

        @Override // com.google.crypto.tink.Registry.KeyManagerContainer
        public final Set d() {
            return this.f14984a.b.keySet();
        }

        @Override // com.google.crypto.tink.Registry.KeyManagerContainer
        public final KeyManager e() {
            KeyTypeManager keyTypeManager = this.f14984a;
            return new KeyManagerImpl(keyTypeManager, keyTypeManager.c);
        }
    }

    /* renamed from: com.google.crypto.tink.Registry$4, reason: invalid class name */
    class AnonymousClass4 implements KeyDeriverContainer {
    }

    public interface KeyDeriverContainer {
    }

    public interface KeyManagerContainer {
        Class a();

        Class b();

        KeyManager c(Class cls);

        Set d();

        KeyManager e();
    }

    static {
        new ConcurrentHashMap();
        e = new ConcurrentHashMap();
    }

    public static synchronized void a(String str, Class cls, boolean z) {
        ConcurrentHashMap concurrentHashMap = b;
        if (concurrentHashMap.containsKey(str)) {
            KeyManagerContainer keyManagerContainer = (KeyManagerContainer) concurrentHashMap.get(str);
            if (keyManagerContainer.b().equals(cls)) {
                if (z && !((Boolean) d.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
                return;
            }
            f14983a.warning("Attempted overwrite of a registered key manager for key type " + str);
            throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + keyManagerContainer.b().getName() + ", cannot be re-registered with " + cls.getName());
        }
    }

    public static synchronized KeyManagerContainer b(String str) {
        ConcurrentHashMap concurrentHashMap;
        concurrentHashMap = b;
        if (!concurrentHashMap.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (KeyManagerContainer) concurrentHashMap.get(str);
    }

    public static Object c(String str, ByteString byteString, Class cls) throws GeneralSecurityException {
        KeyManagerContainer keyManagerContainerB = b(str);
        if (keyManagerContainerB.d().contains(cls)) {
            return keyManagerContainerB.c(cls).a(byteString);
        }
        StringBuilder sb = new StringBuilder("Primitive type ");
        a.x(cls, sb, " not supported by key manager of type ");
        sb.append(keyManagerContainerB.b());
        sb.append(", supported primitives: ");
        Set<Class> setD = keyManagerContainerB.d();
        StringBuilder sb2 = new StringBuilder();
        boolean z = true;
        for (Class cls2 : setD) {
            if (!z) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z = false;
        }
        sb.append(sb2.toString());
        throw new GeneralSecurityException(sb.toString());
    }

    public static synchronized MessageLite d(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
        ByteString value;
        KeyTypeManager keyTypeManager;
        try {
            KeyManager keyManagerE = b(keyTemplate.getTypeUrl()).e();
            if (!((Boolean) d.get(keyTemplate.getTypeUrl())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + keyTemplate.getTypeUrl());
            }
            value = keyTemplate.getValue();
            keyTypeManager = ((KeyManagerImpl) keyManagerE).f14971a;
            try {
            } catch (InvalidProtocolBufferException e2) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(keyTypeManager.c().b().getName()), e2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return new KeyManagerImpl.KeyFactoryHelper(keyTypeManager.c()).a(value);
    }

    public static synchronized KeyData e(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
        KeyManager keyManagerE;
        keyManagerE = b(keyTemplate.getTypeUrl()).e();
        if (!((Boolean) d.get(keyTemplate.getTypeUrl())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + keyTemplate.getTypeUrl());
        }
        return ((KeyManagerImpl) keyManagerE).b(keyTemplate.getValue());
    }

    public static synchronized void f(final PrivateKeyTypeManager privateKeyTypeManager, final KeyTypeManager keyTypeManager) {
        Class clsA;
        try {
            String strA = privateKeyTypeManager.a();
            String strA2 = keyTypeManager.a();
            a(strA, privateKeyTypeManager.getClass(), true);
            a(strA2, keyTypeManager.getClass(), false);
            if (strA.equals(strA2)) {
                throw new GeneralSecurityException("Private and public key type must be different.");
            }
            ConcurrentHashMap concurrentHashMap = b;
            if (concurrentHashMap.containsKey(strA) && (clsA = ((KeyManagerContainer) concurrentHashMap.get(strA)).a()) != null && !clsA.equals(keyTypeManager.getClass())) {
                f14983a.warning("Attempted overwrite of a registered key manager for key type " + strA + " with inconsistent public key type " + strA2);
                throw new GeneralSecurityException("public key manager corresponding to " + privateKeyTypeManager.getClass().getName() + " is already registered with " + clsA.getName() + ", cannot be re-registered with " + keyTypeManager.getClass().getName());
            }
            if (!concurrentHashMap.containsKey(strA) || ((KeyManagerContainer) concurrentHashMap.get(strA)).a() == null) {
                concurrentHashMap.put(strA, new KeyManagerContainer() { // from class: com.google.crypto.tink.Registry.3
                    @Override // com.google.crypto.tink.Registry.KeyManagerContainer
                    public final Class a() {
                        return keyTypeManager.getClass();
                    }

                    @Override // com.google.crypto.tink.Registry.KeyManagerContainer
                    public final Class b() {
                        return privateKeyTypeManager.getClass();
                    }

                    @Override // com.google.crypto.tink.Registry.KeyManagerContainer
                    public final KeyManager c(Class cls) throws GeneralSecurityException {
                        try {
                            return new PrivateKeyManagerImpl(privateKeyTypeManager, cls);
                        } catch (IllegalArgumentException e2) {
                            throw new GeneralSecurityException("Primitive type not supported", e2);
                        }
                    }

                    @Override // com.google.crypto.tink.Registry.KeyManagerContainer
                    public final Set d() {
                        return privateKeyTypeManager.b.keySet();
                    }

                    @Override // com.google.crypto.tink.Registry.KeyManagerContainer
                    public final KeyManager e() {
                        PrivateKeyTypeManager privateKeyTypeManager2 = privateKeyTypeManager;
                        return new PrivateKeyManagerImpl(privateKeyTypeManager2, privateKeyTypeManager2.c);
                    }
                });
                c.put(strA, new AnonymousClass4());
            }
            ConcurrentHashMap concurrentHashMap2 = d;
            concurrentHashMap2.put(strA, Boolean.TRUE);
            if (!concurrentHashMap.containsKey(strA2)) {
                concurrentHashMap.put(strA2, new AnonymousClass2(keyTypeManager));
            }
            concurrentHashMap2.put(strA2, Boolean.FALSE);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void g(KeyTypeManager keyTypeManager, boolean z) {
        try {
            String strA = keyTypeManager.a();
            a(strA, keyTypeManager.getClass(), z);
            ConcurrentHashMap concurrentHashMap = b;
            if (!concurrentHashMap.containsKey(strA)) {
                concurrentHashMap.put(strA, new AnonymousClass2(keyTypeManager));
                c.put(strA, new AnonymousClass4());
            }
            d.put(strA, Boolean.valueOf(z));
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void h(PrimitiveWrapper primitiveWrapper) {
        try {
            Class clsA = primitiveWrapper.a();
            ConcurrentHashMap concurrentHashMap = e;
            if (concurrentHashMap.containsKey(clsA)) {
                PrimitiveWrapper primitiveWrapper2 = (PrimitiveWrapper) concurrentHashMap.get(clsA);
                if (!primitiveWrapper.getClass().equals(primitiveWrapper2.getClass())) {
                    f14983a.warning("Attempted overwrite of a registered SetWrapper for type " + clsA.toString());
                    throw new GeneralSecurityException("SetWrapper for primitive (" + clsA.getName() + ") is already registered to be " + primitiveWrapper2.getClass().getName() + ", cannot be re-registered with " + primitiveWrapper.getClass().getName());
                }
            }
            concurrentHashMap.put(clsA, primitiveWrapper);
        } catch (Throwable th) {
            throw th;
        }
    }
}
