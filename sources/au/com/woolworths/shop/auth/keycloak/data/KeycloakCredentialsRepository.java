package au.com.woolworths.shop.auth.keycloak.data;

import android.util.Base64;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.PreferencesKt;
import au.com.woolworths.shop.auth.keycloak.model.KeycloakCredentials;
import au.com.woolworths.shop.auth.keycloak.utils.JwtValidator;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.Clock;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.Json;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/data/KeycloakCredentialsRepository;", "", "Companion", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class KeycloakCredentialsRepository {

    /* renamed from: a, reason: collision with root package name */
    public final KeycloakApiService f10242a;
    public final KeycloakCredentialsStore b;
    public final JwtValidator c;
    public final Clock d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/data/KeycloakCredentialsRepository$Companion;", "", "", "TOKEN_EXPIRY_THRESHOLD_SECONDS", "J", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public KeycloakCredentialsRepository(KeycloakApiService keycloakApiService, KeycloakCredentialsStore credentialsStore) {
        JwtValidator jwtValidator = new JwtValidator();
        Clock clock = Clock.systemDefaultZone();
        Intrinsics.h(credentialsStore, "credentialsStore");
        Intrinsics.h(clock, "clock");
        this.f10242a = keycloakApiService;
        this.b = credentialsStore;
        this.c = jwtValidator;
        this.d = clock;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
    
        if ((r2.getEpochSecond() - java.time.Instant.now(r11.d).getEpochSecond()) < 30) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsRepository.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object b(ContinuationImpl continuationImpl) {
        KeycloakCredentialsStore keycloakCredentialsStore = this.b;
        Object objA = PreferencesKt.a((DataStore) keycloakCredentialsStore.c.getValue(keycloakCredentialsStore.f10243a, KeycloakCredentialsStore.e[0]), new KeycloakCredentialsStore$clear$2(keycloakCredentialsStore, null), continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        Unit unit = Unit.f24250a;
        if (objA != coroutineSingletons) {
            objA = unit;
        }
        return objA == coroutineSingletons ? objA : unit;
    }

    public final Object c(ContinuationImpl continuationImpl) {
        final KeycloakCredentialsStore keycloakCredentialsStore = this.b;
        final Flow data = ((DataStore) keycloakCredentialsStore.c.getValue(keycloakCredentialsStore.f10243a, KeycloakCredentialsStore.e[0])).getD();
        return FlowKt.y(new Flow<KeycloakCredentials>() { // from class: au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsStore$get$$inlined$map$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsStore$get$$inlined$map$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;
                public final /* synthetic */ KeycloakCredentialsStore e;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsStore$get$$inlined$map$1$2", f = "KeycloakCredentialsStore.kt", l = {50}, m = "emit")
                /* renamed from: au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsStore$get$$inlined$map$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object p;
                    public int q;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.p = obj;
                        this.q |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, KeycloakCredentialsStore keycloakCredentialsStore) {
                    this.d = flowCollector;
                    this.e = keycloakCredentialsStore;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException, java.security.InvalidKeyException, java.security.KeyStoreException, java.security.NoSuchProviderException, java.security.InvalidAlgorithmParameterException {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsStore$get$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsStore$get$$inlined$map$1$2$1 r0 = (au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsStore$get$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsStore$get$$inlined$map$1$2$1 r0 = new au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsStore$get$$inlined$map$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r9)
                        goto L9e
                    L27:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L2f:
                        kotlin.ResultKt.b(r9)
                        androidx.datastore.preferences.core.Preferences r8 = (androidx.datastore.preferences.core.Preferences) r8
                        au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsStore r9 = r7.e
                        androidx.datastore.preferences.core.Preferences$Key r2 = r9.d
                        java.lang.Object r8 = r8.b(r2)
                        java.lang.String r8 = (java.lang.String) r8
                        if (r8 == 0) goto L92
                        java.lang.String r2 = "AES/GCM/NoPadding"
                        javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)
                        javax.crypto.SecretKey r9 = r9.a()
                        r4 = 0
                        byte[] r8 = android.util.Base64.decode(r8, r4)
                        kotlin.jvm.internal.Intrinsics.e(r8)
                        r5 = 12
                        kotlin.ranges.IntRange r4 = kotlin.ranges.RangesKt.o(r4, r5)
                        byte[] r4 = kotlin.collections.ArraysKt.e0(r8, r4)
                        int r6 = r8.length
                        kotlin.ranges.IntRange r5 = kotlin.ranges.RangesKt.o(r5, r6)
                        byte[] r8 = kotlin.collections.ArraysKt.e0(r8, r5)
                        javax.crypto.spec.GCMParameterSpec r5 = new javax.crypto.spec.GCMParameterSpec
                        r6 = 128(0x80, float:1.794E-43)
                        r5.<init>(r6, r4)
                        r4 = 2
                        r2.init(r4, r9, r5)
                        byte[] r8 = r2.doFinal(r8)
                        java.lang.String r9 = new java.lang.String
                        kotlin.jvm.internal.Intrinsics.e(r8)
                        java.nio.charset.Charset r2 = kotlin.text.Charsets.f24671a
                        r9.<init>(r8, r2)
                        kotlinx.serialization.json.Json$Default r8 = kotlinx.serialization.json.Json.d
                        r8.getClass()
                        au.com.woolworths.shop.auth.keycloak.model.KeycloakCredentials$Companion r2 = au.com.woolworths.shop.auth.keycloak.model.KeycloakCredentials.INSTANCE
                        kotlinx.serialization.KSerializer r2 = r2.serializer()
                        kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2
                        java.lang.Object r8 = r8.b(r2, r9)
                        au.com.woolworths.shop.auth.keycloak.model.KeycloakCredentials r8 = (au.com.woolworths.shop.auth.keycloak.model.KeycloakCredentials) r8
                        goto L93
                    L92:
                        r8 = 0
                    L93:
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r9 = r7.d
                        java.lang.Object r8 = r9.emit(r8, r0)
                        if (r8 != r1) goto L9e
                        return r1
                    L9e:
                        kotlin.Unit r8 = kotlin.Unit.f24250a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsStore$get$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = data.collect(new AnonymousClass2(flowCollector, keycloakCredentialsStore), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        }, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsRepository$hasCredentials$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsRepository$hasCredentials$1 r0 = (au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsRepository$hasCredentials$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsRepository$hasCredentials$1 r0 = new au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsRepository$hasCredentials$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.ResultKt.b(r5)
            r0.r = r3
            java.lang.Object r5 = r4.c(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            if (r5 == 0) goto L3e
            goto L3f
        L3e:
            r3 = 0
        L3f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsRepository.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsRepository$invalidateCredentials$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsRepository$invalidateCredentials$1 r0 = (au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsRepository$invalidateCredentials$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsRepository$invalidateCredentials$1 r0 = new au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsRepository$invalidateCredentials$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L41
            if (r2 == r6) goto L3d
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            kotlin.ResultKt.b(r8)
            return r3
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            au.com.woolworths.shop.auth.keycloak.model.KeycloakCredentials r2 = r0.p
            kotlin.ResultKt.b(r8)
            goto L5d
        L3d:
            kotlin.ResultKt.b(r8)
            goto L4d
        L41:
            kotlin.ResultKt.b(r8)
            r0.s = r6
            java.lang.Object r8 = r7.c(r0)
            if (r8 != r1) goto L4d
            goto L77
        L4d:
            r2 = r8
            au.com.woolworths.shop.auth.keycloak.model.KeycloakCredentials r2 = (au.com.woolworths.shop.auth.keycloak.model.KeycloakCredentials) r2
            if (r2 == 0) goto L78
            r0.p = r2
            r0.s = r5
            java.lang.Object r8 = r7.b(r0)
            if (r8 != r1) goto L5d
            goto L77
        L5d:
            java.lang.String r8 = r2.d
            r2 = 0
            r0.p = r2
            r0.s = r4
            au.com.woolworths.shop.auth.keycloak.data.KeycloakApiService r4 = r7.f10242a
            kotlinx.coroutines.CoroutineDispatcher r5 = r4.c
            au.com.woolworths.shop.auth.keycloak.data.KeycloakApiService$postLogout$2 r6 = new au.com.woolworths.shop.auth.keycloak.data.KeycloakApiService$postLogout$2
            r6.<init>(r4, r8, r2)
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.f(r5, r6, r0)
            if (r8 != r1) goto L74
            goto L75
        L74:
            r8 = r3
        L75:
            if (r8 != r1) goto L78
        L77:
            return r1
        L78:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsRepository.e(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object f(KeycloakCredentials keycloakCredentials, ContinuationImpl continuationImpl) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        KeycloakCredentialsStore keycloakCredentialsStore = this.b;
        keycloakCredentialsStore.getClass();
        String strC = Json.d.c(KeycloakCredentials.INSTANCE.serializer(), keycloakCredentials);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, keycloakCredentialsStore.a());
        byte[] iv = cipher.getIV();
        byte[] bytes = strC.getBytes(Charsets.f24671a);
        Intrinsics.g(bytes, "getBytes(...)");
        byte[] bArrDoFinal = cipher.doFinal(bytes);
        Intrinsics.e(iv);
        Intrinsics.e(bArrDoFinal);
        String strEncodeToString = Base64.encodeToString(ArraysKt.Z(iv, bArrDoFinal), 0);
        Intrinsics.g(strEncodeToString, "encodeToString(...)");
        Object objA = PreferencesKt.a((DataStore) keycloakCredentialsStore.c.getValue(keycloakCredentialsStore.f10243a, KeycloakCredentialsStore.e[0]), new KeycloakCredentialsStore$save$2(keycloakCredentialsStore, strEncodeToString, null), continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        Unit unit = Unit.f24250a;
        if (objA != coroutineSingletons) {
            objA = unit;
        }
        return objA == coroutineSingletons ? objA : unit;
    }
}
