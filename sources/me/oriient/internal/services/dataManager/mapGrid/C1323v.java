package me.oriient.internal.services.dataManager.mapGrid;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.CharArrayPoolBatchSize;
import kotlinx.serialization.json.internal.JavaStreamSerialReader;
import kotlinx.serialization.json.internal.ReaderJsonLexer;
import kotlinx.serialization.json.internal.StreamingJsonDecoder;
import kotlinx.serialization.json.internal.WriteMode;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;
import me.oriient.internal.infra.utils.core.DecryptionError;
import me.oriient.internal.infra.utils.core.InternalError;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.ParsingError;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import org.bouncycastle.math.Primes;
import org.jetbrains.annotations.NotNull;

/* renamed from: me.oriient.internal.services.dataManager.mapGrid.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1323v {

    @NotNull
    private static final C1322u Companion = new C1322u();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1325x f25226a = new C1327z();
    public final Lazy b;
    public final Lazy c;

    public C1323v() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.b = di.inject(reflectionFactory.b(Logger.class));
        this.c = InternalDiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
    }

    public final Outcome a(byte[] data, byte[] vector, byte[] tag) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, IOException, InvalidAlgorithmParameterException {
        Intrinsics.h(data, "data");
        Intrinsics.h(vector, "vector");
        Intrinsics.h(tag, "tag");
        String strB = Reflection.f24268a.b(String.class).B();
        if (strB == null) {
            return new Outcome.Failure(new InternalError("Failed to get map data"));
        }
        byte[] bytes = strB.getBytes(Charsets.f24671a);
        Intrinsics.g(bytes, "getBytes(...)");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Intrinsics.g(messageDigest, "getInstance(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        int[] iArr = {254, 34, 51, 74, 219, 108, 63, 231, 172, 151, 137, 172, 218, 161, 89, 39};
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < 16; i++) {
            arrayList.add(Byte.valueOf((byte) iArr[i]));
        }
        byte[] bArrB0 = CollectionsKt.B0(arrayList);
        int[] iArr2 = {30, 60, 176, 17, 119, 242, 215, 103, 131, 17, Primes.SMALL_FACTOR_LIMIT, 95, 205, 41, 254, 76};
        ArrayList arrayList2 = new ArrayList(16);
        for (int i2 = 0; i2 < 16; i2++) {
            arrayList2.add(Byte.valueOf((byte) iArr2[i2]));
        }
        byte[] bArrZ = ArraysKt.Z(bArrB0, CollectionsKt.B0(arrayList2));
        IntProgressionIterator it = RangesKt.o(0, Math.min(bArrDigest.length, bArrZ.length)).iterator();
        while (it.f) {
            int iNextInt = it.nextInt();
            bArrZ[iNextInt] = (byte) (bArrZ[iNextInt] ^ bArrDigest[iNextInt]);
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrZ, "AES");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(tag.length * 8, vector);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, secretKeySpec, gCMParameterSpec);
        try {
            byte[] bArrDoFinal = cipher.doFinal(ArraysKt.Z(data, tag));
            InterfaceC1325x interfaceC1325x = this.f25226a;
            Intrinsics.e(bArrDoFinal);
            C1327z c1327z = (C1327z) interfaceC1325x;
            c1327z.getClass();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrDoFinal);
                try {
                    Json json = JsonSerializationKt.getJson();
                    json.getClass();
                    KSerializer<MapGridResponse> deserializer = MapGridResponse.INSTANCE.serializer();
                    Intrinsics.h(deserializer, "deserializer");
                    JavaStreamSerialReader javaStreamSerialReader = new JavaStreamSerialReader(byteArrayInputStream);
                    try {
                        KSerializer<MapGridResponse> kSerializer = deserializer;
                        ReaderJsonLexer readerJsonLexer = new ReaderJsonLexer(javaStreamSerialReader, CharArrayPoolBatchSize.c.b(16384));
                        try {
                            Object objE = new StreamingJsonDecoder(json, WriteMode.f, readerJsonLexer, kSerializer.getB(), null).E(kSerializer);
                            readerJsonLexer.p();
                            readerJsonLexer.H();
                            javaStreamSerialReader.a();
                            Outcome.Success success = new Outcome.Success(((MapGridResponse) objE).toMapGrid$internal_publishRelease());
                            byteArrayInputStream.close();
                            return success;
                        } catch (Throwable th) {
                            readerJsonLexer.H();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        javaStreamSerialReader.a();
                        throw th2;
                    }
                } finally {
                }
            } catch (Exception e) {
                ParsingError parsingError = new ParsingError("map grid");
                if (e instanceof SerializationException) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    if (StringsKt.o(message, "Fields", false) && StringsKt.o(message, "are required", false) && StringsKt.o(message, "mgrid", false) && StringsKt.o(message, "mgridxqRange", false)) {
                        parsingError = new ParsingError("map grid because it is empty");
                    }
                }
                ((Logger) c1327z.f25228a.getD()).e("MapGridParserImpl", "failed parse", e);
                return new Outcome.Failure(parsingError);
            }
        } catch (Exception e2) {
            ((Logger) this.b.getD()).e("MapGridDecryptorImpl", "decryptMapGrid: fail", e2);
            return new Outcome.Failure(new DecryptionError("raw map grid"));
        }
    }
}
