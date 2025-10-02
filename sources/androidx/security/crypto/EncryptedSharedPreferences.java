package androidx.security.crypto;

import YU.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import androidx.collection.ArraySet;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.aead.AesGcmKeyManager;
import com.google.crypto.tink.config.TinkConfig;
import com.google.crypto.tink.daead.AesSivKeyManager;
import com.google.crypto.tink.daead.DeterministicAeadWrapper;
import com.google.crypto.tink.hybrid.HybridConfig;
import com.google.crypto.tink.integration.android.AndroidKeysetManager;
import com.google.crypto.tink.prf.HkdfPrfKeyManager;
import com.google.crypto.tink.prf.PrfConfig;
import com.google.crypto.tink.prf.PrfSetWrapper;
import com.google.crypto.tink.proto.AesGcmKeyFormat;
import com.google.crypto.tink.proto.AesSivKeyFormat;
import com.google.crypto.tink.signature.SignatureConfig;
import com.google.crypto.tink.subtle.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class EncryptedSharedPreferences implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f3756a;
    public final ArrayList b = new ArrayList();
    public final String c;
    public final Aead d;
    public final DeterministicAead e;

    /* renamed from: androidx.security.crypto.EncryptedSharedPreferences$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3757a;

        static {
            int[] iArr = new int[EncryptedType.values().length];
            f3757a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3757a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3757a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3757a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3757a[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3757a[1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class Editor implements SharedPreferences.Editor {

        /* renamed from: a, reason: collision with root package name */
        public final EncryptedSharedPreferences f3758a;
        public final SharedPreferences.Editor b;
        public final AtomicBoolean d = new AtomicBoolean(false);
        public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

        public Editor(EncryptedSharedPreferences encryptedSharedPreferences, SharedPreferences.Editor editor) {
            this.f3758a = encryptedSharedPreferences;
            this.b = editor;
        }

        public final void a() {
            if (this.d.getAndSet(false)) {
                EncryptedSharedPreferences encryptedSharedPreferences = this.f3758a;
                for (String str : ((HashMap) encryptedSharedPreferences.getAll()).keySet()) {
                    if (!this.c.contains(str) && !EncryptedSharedPreferences.d(str)) {
                        this.b.remove(encryptedSharedPreferences.b(str));
                    }
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            a();
            this.b.apply();
            b();
        }

        public final void b() {
            EncryptedSharedPreferences encryptedSharedPreferences = this.f3758a;
            Iterator it = encryptedSharedPreferences.b.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
                Iterator it2 = this.c.iterator();
                while (it2.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(encryptedSharedPreferences, (String) it2.next());
                }
            }
        }

        public final void c(String str, byte[] bArr) {
            EncryptedSharedPreferences encryptedSharedPreferences = this.f3758a;
            encryptedSharedPreferences.getClass();
            if (EncryptedSharedPreferences.d(str)) {
                throw new SecurityException(a.g(str, " is a reserved key for the encryption keyset."));
            }
            this.c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String strB = encryptedSharedPreferences.b(str);
                Pair pair = new Pair(strB, Base64.b(encryptedSharedPreferences.d.a(bArr, strB.getBytes(StandardCharsets.UTF_8))));
                this.b.putString((String) pair.first, (String) pair.second);
            } catch (GeneralSecurityException e) {
                throw new SecurityException("Could not encrypt data: " + e.getMessage(), e);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor clear() {
            this.d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            CopyOnWriteArrayList copyOnWriteArrayList = this.c;
            a();
            try {
                return this.b.commit();
            } finally {
                b();
                copyOnWriteArrayList.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putBoolean(String str, boolean z) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
            byteBufferAllocate.putInt(5);
            byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putFloat(String str, float f) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(4);
            byteBufferAllocate.putFloat(f);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putInt(String str, int i) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(2);
            byteBufferAllocate.putInt(i);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putLong(String str, long j) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
            byteBufferAllocate.putInt(3);
            byteBufferAllocate.putLong(j);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bytes);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set set) {
            Set set2 = set;
            if (set == null) {
                ArraySet arraySet = new ArraySet(0);
                arraySet.add("__NULL__");
                set2 = arraySet;
            }
            ArrayList arrayList = new ArrayList(set2.size());
            int size = set2.size() * 4;
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
            byteBufferAllocate.putInt(1);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArr = (byte[]) it2.next();
                byteBufferAllocate.putInt(bArr.length);
                byteBufferAllocate.put(bArr);
            }
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor remove(String str) {
            EncryptedSharedPreferences encryptedSharedPreferences = this.f3758a;
            encryptedSharedPreferences.getClass();
            if (EncryptedSharedPreferences.d(str)) {
                throw new SecurityException(a.g(str, " is a reserved key for the encryption keyset."));
            }
            this.b.remove(encryptedSharedPreferences.b(str));
            this.c.remove(str);
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class EncryptedType {
        public static final EncryptedType d;
        public static final EncryptedType e;
        public static final EncryptedType f;
        public static final EncryptedType g;
        public static final EncryptedType h;
        public static final EncryptedType i;
        public static final /* synthetic */ EncryptedType[] j;

        static {
            EncryptedType encryptedType = new EncryptedType("STRING", 0);
            d = encryptedType;
            EncryptedType encryptedType2 = new EncryptedType("STRING_SET", 1);
            e = encryptedType2;
            EncryptedType encryptedType3 = new EncryptedType("INT", 2);
            f = encryptedType3;
            EncryptedType encryptedType4 = new EncryptedType("LONG", 3);
            g = encryptedType4;
            EncryptedType encryptedType5 = new EncryptedType("FLOAT", 4);
            h = encryptedType5;
            EncryptedType encryptedType6 = new EncryptedType("BOOLEAN", 5);
            i = encryptedType6;
            j = new EncryptedType[]{encryptedType, encryptedType2, encryptedType3, encryptedType4, encryptedType5, encryptedType6};
        }

        public static EncryptedType a(int i2) {
            if (i2 == 0) {
                return d;
            }
            if (i2 == 1) {
                return e;
            }
            if (i2 == 2) {
                return f;
            }
            if (i2 == 3) {
                return g;
            }
            if (i2 == 4) {
                return h;
            }
            if (i2 != 5) {
                return null;
            }
            return i;
        }

        public static EncryptedType valueOf(String str) {
            return (EncryptedType) Enum.valueOf(EncryptedType.class, str);
        }

        public static EncryptedType[] values() {
            return (EncryptedType[]) j.clone();
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class PrefKeyEncryptionScheme {
        public static final PrefKeyEncryptionScheme e;
        public static final /* synthetic */ PrefKeyEncryptionScheme[] f;
        public final KeyTemplate d;

        static {
            AesSivKeyFormat.Builder builderNewBuilder = AesSivKeyFormat.newBuilder();
            builderNewBuilder.g();
            ((AesSivKeyFormat) builderNewBuilder.e).setKeySize(64);
            AesSivKeyFormat aesSivKeyFormat = (AesSivKeyFormat) builderNewBuilder.p1();
            new AesSivKeyManager();
            PrefKeyEncryptionScheme prefKeyEncryptionScheme = new PrefKeyEncryptionScheme(KeyTemplate.a("type.googleapis.com/google.crypto.tink.AesSivKey", aesSivKeyFormat.toByteArray(), KeyTemplate.OutputPrefixType.d));
            e = prefKeyEncryptionScheme;
            f = new PrefKeyEncryptionScheme[]{prefKeyEncryptionScheme};
        }

        public PrefKeyEncryptionScheme(KeyTemplate keyTemplate) {
            this.d = keyTemplate;
        }

        public static PrefKeyEncryptionScheme valueOf(String str) {
            return (PrefKeyEncryptionScheme) Enum.valueOf(PrefKeyEncryptionScheme.class, str);
        }

        public static PrefKeyEncryptionScheme[] values() {
            return (PrefKeyEncryptionScheme[]) f.clone();
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class PrefValueEncryptionScheme {
        public static final PrefValueEncryptionScheme e;
        public static final /* synthetic */ PrefValueEncryptionScheme[] f;
        public final KeyTemplate d;

        static {
            AesGcmKeyFormat.Builder builderNewBuilder = AesGcmKeyFormat.newBuilder();
            builderNewBuilder.g();
            ((AesGcmKeyFormat) builderNewBuilder.e).setKeySize(32);
            AesGcmKeyFormat aesGcmKeyFormat = (AesGcmKeyFormat) builderNewBuilder.p1();
            new AesGcmKeyManager();
            PrefValueEncryptionScheme prefValueEncryptionScheme = new PrefValueEncryptionScheme(KeyTemplate.a("type.googleapis.com/google.crypto.tink.AesGcmKey", aesGcmKeyFormat.toByteArray(), KeyTemplate.OutputPrefixType.d));
            e = prefValueEncryptionScheme;
            f = new PrefValueEncryptionScheme[]{prefValueEncryptionScheme};
        }

        public PrefValueEncryptionScheme(KeyTemplate keyTemplate) {
            this.d = keyTemplate;
        }

        public static PrefValueEncryptionScheme valueOf(String str) {
            return (PrefValueEncryptionScheme) Enum.valueOf(PrefValueEncryptionScheme.class, str);
        }

        public static PrefValueEncryptionScheme[] values() {
            return (PrefValueEncryptionScheme[]) f.clone();
        }
    }

    public EncryptedSharedPreferences(String str, SharedPreferences sharedPreferences, Aead aead, DeterministicAead deterministicAead) {
        this.c = str;
        this.f3756a = sharedPreferences;
        this.d = aead;
        this.e = deterministicAead;
    }

    public static EncryptedSharedPreferences a(String str, String str2, Context context, PrefKeyEncryptionScheme prefKeyEncryptionScheme, PrefValueEncryptionScheme prefValueEncryptionScheme) {
        KeysetHandle keysetHandleA;
        KeysetHandle keysetHandleA2;
        int i = TinkConfig.f14992a;
        Registry.g(new AesSivKeyManager(), true);
        Registry.h(new DeterministicAeadWrapper());
        HybridConfig.a();
        SignatureConfig.a();
        int i2 = PrfConfig.f15010a;
        Registry.g(new HkdfPrfKeyManager(), true);
        Registry.h(new PrfSetWrapper());
        Context applicationContext = context.getApplicationContext();
        AndroidKeysetManager.Builder builder = new AndroidKeysetManager.Builder();
        builder.d = prefKeyEncryptionScheme.d;
        builder.a(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str);
        String str3 = "android-keystore://" + str2;
        if (!str3.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        builder.c = str3;
        AndroidKeysetManager androidKeysetManager = new AndroidKeysetManager(builder);
        synchronized (androidKeysetManager) {
            keysetHandleA = androidKeysetManager.f.a();
        }
        AndroidKeysetManager.Builder builder2 = new AndroidKeysetManager.Builder();
        builder2.d = prefValueEncryptionScheme.d;
        builder2.a(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str);
        String str4 = "android-keystore://" + str2;
        if (!str4.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        builder2.c = str4;
        AndroidKeysetManager androidKeysetManager2 = new AndroidKeysetManager(builder2);
        synchronized (androidKeysetManager2) {
            keysetHandleA2 = androidKeysetManager2.f.a();
        }
        return new EncryptedSharedPreferences(str, applicationContext.getSharedPreferences(str, 0), (Aead) keysetHandleA2.b(Aead.class), (DeterministicAead) keysetHandleA.b(DeterministicAead.class));
    }

    public static boolean d(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public final String b(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return Base64.b(this.e.b(str.getBytes(StandardCharsets.UTF_8), this.c.getBytes()));
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not encrypt key. " + e.getMessage(), e);
        }
    }

    public final Object c(String str) {
        if (d(str)) {
            throw new SecurityException(a.g(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strB = b(str);
            String string = this.f3756a.getString(strB, null);
            if (string != null) {
                byte[] bArrA = Base64.a(0, string);
                Aead aead = this.d;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(aead.b(bArrA, strB.getBytes(charset)));
                byteBufferWrap.position(0);
                int iOrdinal = EncryptedType.a(byteBufferWrap.getInt()).ordinal();
                if (iOrdinal == 0) {
                    int i = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                    byteBufferWrap.limit(i);
                    String string2 = charset.decode(byteBufferSlice).toString();
                    if (!string2.equals("__NULL__")) {
                        return string2;
                    }
                } else if (iOrdinal == 1) {
                    ArraySet arraySet = new ArraySet(0);
                    while (byteBufferWrap.hasRemaining()) {
                        int i2 = byteBufferWrap.getInt();
                        ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                        byteBufferSlice2.limit(i2);
                        byteBufferWrap.position(byteBufferWrap.position() + i2);
                        arraySet.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                    }
                    if (arraySet.f != 1 || !"__NULL__".equals(arraySet.e[0])) {
                        return arraySet;
                    }
                } else {
                    if (iOrdinal == 2) {
                        return Integer.valueOf(byteBufferWrap.getInt());
                    }
                    if (iOrdinal == 3) {
                        return Long.valueOf(byteBufferWrap.getLong());
                    }
                    if (iOrdinal == 4) {
                        return Float.valueOf(byteBufferWrap.getFloat());
                    }
                    if (iOrdinal == 5) {
                        return Boolean.valueOf(byteBufferWrap.get() != 0);
                    }
                }
            }
            return null;
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not decrypt value. " + e.getMessage(), e);
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (d(str)) {
            throw new SecurityException(a.g(str, " is a reserved key for the encryption keyset."));
        }
        return this.f3756a.contains(b(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new Editor(this, this.f3756a.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f3756a.getAll().entrySet()) {
            if (!d(entry.getKey())) {
                try {
                    String str = new String(this.e.a(Base64.a(0, entry.getKey()), this.c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    map.put(str, c(str));
                } catch (GeneralSecurityException e) {
                    throw new SecurityException("Could not decrypt key. " + e.getMessage(), e);
                }
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object objC = c(str);
        return (objC == null || !(objC instanceof Boolean)) ? z : ((Boolean) objC).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object objC = c(str);
        return (objC == null || !(objC instanceof Float)) ? f : ((Float) objC).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object objC = c(str);
        return (objC == null || !(objC instanceof Integer)) ? i : ((Integer) objC).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object objC = c(str);
        return (objC == null || !(objC instanceof Long)) ? j : ((Long) objC).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object objC = c(str);
        return (objC == null || !(objC instanceof String)) ? str2 : (String) objC;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object objC = c(str);
        Set arraySet = objC instanceof Set ? (Set) objC : new ArraySet(0);
        return arraySet.size() > 0 ? arraySet : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.remove(onSharedPreferenceChangeListener);
    }
}
