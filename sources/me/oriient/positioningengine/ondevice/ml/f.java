package me.oriient.positioningengine.ondevice.ml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.text.Charsets;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.FileManager;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.elog.ELog;
import me.oriient.positioningengine.common.DiKt;
import me.oriient.positioningengine.common.util.PositioningEngineError;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class f implements b {

    @NotNull
    private static final c Companion = new c();
    public static final byte[] d = {-91, -39, 45, 101, -101, 9, 107, 60, -91, -28, -60, 115, 26, 98, 53, -66};
    public static final byte[] e = {-90, 78, 2, 46, -38, -109, 100, 68, 55, -83, 25, -127, -123, 127, 63, 105};

    /* renamed from: a, reason: collision with root package name */
    public final FileManager f26455a;
    public final Lazy b;
    public final Lazy c;

    public f(FileManager fileManager) {
        Intrinsics.h(fileManager, "fileManager");
        this.f26455a = fileManager;
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.b = di.inject(reflectionFactory.b(Logger.class));
        this.c = DiKt.getDi().inject(reflectionFactory.b(ELog.class));
    }

    public final Outcome a() throws NoSuchAlgorithmException {
        Outcome failure;
        File fileFindFile = this.f26455a.findFile("oriientConfigurations", MlModel.MODEL_FILE_SUFFIX);
        if (fileFindFile == null) {
            return new Outcome.Failure(new PositioningEngineError.General("Ml Model was not found"));
        }
        byte[] bytes = "String".getBytes(Charsets.f24671a);
        Intrinsics.g(bytes, "getBytes(...)");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Intrinsics.g(messageDigest, "getInstance(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        byte[] bArrZ = ArraysKt.Z(d, e);
        ArrayList arrayList = new ArrayList(bArrZ.length);
        int length = bArrZ.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(Byte.valueOf((byte) (bArrDigest[i2] ^ bArrZ[i])));
            i++;
            i2++;
        }
        byte[] bArrB0 = CollectionsKt.B0(arrayList);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrB0, "AES");
        File orCreateFile = this.f26455a.getOrCreateFile("extracted.ptl");
        try {
            a(secretKeySpec, fileFindFile, orCreateFile);
            failure = new Outcome.Success(orCreateFile);
        } catch (Exception e2) {
            ((Logger) this.b.getD()).e("MlModelDecoder", "Failed to parse configurations", e2);
            ((ELog) this.c.getD()).e("MlModelDecoder", "Failed to parse configurations", new d(e2, bArrB0, fileFindFile, this));
            failure = new Outcome.Failure(new PositioningEngineError.DecryptionError("ml model"));
        }
        if (failure instanceof Outcome.Failure) {
            this.f26455a.deleteFile(fileFindFile);
        }
        return failure;
    }

    public static void a(SecretKeySpec secretKeySpec, File file, File file2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(new byte[cipher.getBlockSize()]));
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
                try {
                    ByteStreamsKt.a(cipherInputStream, fileOutputStream, 1024);
                    cipherInputStream.close();
                    fileOutputStream.close();
                    fileInputStream.close();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }
}
