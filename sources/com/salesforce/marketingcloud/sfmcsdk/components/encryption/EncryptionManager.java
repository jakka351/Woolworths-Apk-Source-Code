package com.salesforce.marketingcloud.sfmcsdk.components.encryption;

import android.content.Context;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u0018\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eR\u0014\u0010\u0007\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/encryption/EncryptionManager;", "", "context", "Landroid/content/Context;", "moduleApplicationId", "", "(Landroid/content/Context;Ljava/lang/String;)V", "encryptionKey", "getEncryptionKey$sfmcsdk_release", "()Ljava/lang/String;", "decrypt", "data", "encrypt", "iv", "", "generateIV", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EncryptionManager {

    @NotNull
    private final String encryptionKey;

    public EncryptionManager(@NotNull Context context, @NotNull String moduleApplicationId) {
        Intrinsics.h(context, "context");
        Intrinsics.h(moduleApplicationId, "moduleApplicationId");
        String encryptionKey = new SalesforceKeyGenerator(context, new KeyStoreWrapper(context)).getEncryptionKey(moduleApplicationId);
        Intrinsics.g(encryptionKey, "salesforceKeyGenerator.g…nKey(moduleApplicationId)");
        this.encryptionKey = encryptionKey;
    }

    @Nullable
    public final String decrypt(@NotNull String data) {
        Intrinsics.h(data, "data");
        return Encryptor.decrypt(data, this.encryptionKey);
    }

    @Nullable
    public final String encrypt(@NotNull String data) {
        Intrinsics.h(data, "data");
        return Encryptor.encrypt(data, this.encryptionKey);
    }

    @NotNull
    public final byte[] generateIV() throws NoSuchAlgorithmException {
        byte[] bArrGenerateInitVector = Encryptor.generateInitVector();
        Intrinsics.g(bArrGenerateInitVector, "generateInitVector()");
        return bArrGenerateInitVector;
    }

    @NotNull
    /* renamed from: getEncryptionKey$sfmcsdk_release, reason: from getter */
    public final String getEncryptionKey() {
        return this.encryptionKey;
    }

    @Nullable
    public final String encrypt(@NotNull String data, @NotNull byte[] iv) {
        Intrinsics.h(data, "data");
        Intrinsics.h(iv, "iv");
        return Encryptor.encrypt(data, this.encryptionKey, iv);
    }
}
