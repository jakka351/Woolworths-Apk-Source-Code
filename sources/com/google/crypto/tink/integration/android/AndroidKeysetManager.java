package com.google.crypto.tink.integration.android;

import android.content.Context;
import android.util.Log;
import com.google.crypto.tink.CleartextKeysetHandle;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.KeysetManager;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class AndroidKeysetManager {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPrefKeysetReader f14999a;
    public final SharedPrefKeysetWriter b;
    public final boolean c;
    public final AndroidKeystoreAesGcm d;
    public final KeyTemplate e;
    public final KeysetManager f;

    /* renamed from: com.google.crypto.tink.integration.android.AndroidKeysetManager$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15000a;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f15000a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15000a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15000a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15000a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public SharedPrefKeysetReader f15001a = null;
        public SharedPrefKeysetWriter b = null;
        public String c = null;
        public KeyTemplate d = null;

        public final void a(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            this.f15001a = new SharedPrefKeysetReader(context, str, str2);
            this.b = new SharedPrefKeysetWriter(context, str, str2);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:8|(2:89|9)|(1:11)(2:14|(1:16)(2:17|(1:19)(9:20|21|24|(1:26)(1:27)|28|93|29|58|59)))|23|24|(0)(0)|28|93|29|58|59) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ce, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        android.util.Log.i("AndroidKeysetManager", "cannot read keyset: " + r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e4, code lost:
    
        if (r9.e != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e6, code lost:
    
        r0 = com.google.crypto.tink.proto.Keyset.newBuilder();
        r10 = new com.google.crypto.tink.KeysetManager(r0);
        r1 = r9.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f1, code lost:
    
        monitor-enter(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f2, code lost:
    
        r1 = r1.f14973a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f4, code lost:
    
        monitor-enter(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f5, code lost:
    
        r1 = r10.c(r1);
        r0.g();
        ((com.google.crypto.tink.proto.Keyset) r0.e).addKey(r1);
        r1.getKeyId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0108, code lost:
    
        r0 = r10.a().a().getKeyInfo(0).getKeyId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0118, code lost:
    
        monitor-enter(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0125, code lost:
    
        r1 = ((com.google.crypto.tink.proto.Keyset) r10.f14979a.e).getKey(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0133, code lost:
    
        if (r1.getKeyId() == r0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013f, code lost:
    
        if (r1.getStatus().equals(com.google.crypto.tink.proto.KeyStatusType.ENABLED) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0141, code lost:
    
        r1 = r10.f14979a;
        r1.g();
        ((com.google.crypto.tink.proto.Keyset) r1.e).setPrimaryKeyId(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x014e, code lost:
    
        r0 = r9.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0152, code lost:
    
        if (r9.c != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0154, code lost:
    
        r10.a().d(r0, r9.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015e, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0160, code lost:
    
        com.google.crypto.tink.CleartextKeysetHandle.b(r10.a(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016f, code lost:
    
        throw new java.security.GeneralSecurityException(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0188, code lost:
    
        throw new java.security.GeneralSecurityException("cannot set key as primary because it's not enabled: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0189, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a2, code lost:
    
        throw new java.security.GeneralSecurityException("key not found: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b2, code lost:
    
        throw new java.security.GeneralSecurityException("cannot obtain keyset handle");
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AndroidKeysetManager(com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder r10) throws java.security.GeneralSecurityException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.integration.android.AndroidKeysetManager.<init>(com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder):void");
    }

    public final KeysetManager a() throws GeneralSecurityException, IOException {
        AndroidKeystoreAesGcm androidKeystoreAesGcm = this.d;
        SharedPrefKeysetReader sharedPrefKeysetReader = this.f14999a;
        boolean z = this.c;
        if (z) {
            try {
                return new KeysetManager(KeysetHandle.c(sharedPrefKeysetReader, androidKeystoreAesGcm).f14978a.toBuilder());
            } catch (InvalidProtocolBufferException | GeneralSecurityException e) {
                Log.i("AndroidKeysetManager", "cannot decrypt keyset: " + e);
            }
        }
        KeysetHandle keysetHandleA = CleartextKeysetHandle.a(sharedPrefKeysetReader);
        if (z) {
            keysetHandleA.d(this.b, androidKeystoreAesGcm);
        }
        return new KeysetManager(keysetHandleA.f14978a.toBuilder());
    }
}
