package com.salesforce.marketingcloud.sfmcsdk.components.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.sfmcsdk.components.encryption.EncryptedSharedPreferences;
import com.salesforce.marketingcloud.sfmcsdk.components.encryption.EncryptionManager;
import com.salesforce.marketingcloud.sfmcsdk.util.FileUtilsKt;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/storage/StorageManager;", "", "context", "Landroid/content/Context;", "encryptionManager", "Lcom/salesforce/marketingcloud/sfmcsdk/components/encryption/EncryptionManager;", "moduleAppId", "", "registrationId", "(Landroid/content/Context;Lcom/salesforce/marketingcloud/sfmcsdk/components/encryption/EncryptionManager;Ljava/lang/String;Ljava/lang/String;)V", "getSecurePrefs", "Landroid/content/SharedPreferences;", AppMeasurementSdk.ConditionalUserProperty.NAME, "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StorageManager {

    @NotNull
    private final Context context;

    @NotNull
    private final EncryptionManager encryptionManager;

    @NotNull
    private final String moduleAppId;

    @NotNull
    private final String registrationId;

    public StorageManager(@NotNull Context context, @NotNull EncryptionManager encryptionManager, @NotNull String moduleAppId, @NotNull String registrationId) {
        Intrinsics.h(context, "context");
        Intrinsics.h(encryptionManager, "encryptionManager");
        Intrinsics.h(moduleAppId, "moduleAppId");
        Intrinsics.h(registrationId, "registrationId");
        this.context = context;
        this.encryptionManager = encryptionManager;
        this.moduleAppId = moduleAppId;
        this.registrationId = registrationId;
    }

    @NotNull
    public final SharedPreferences getSecurePrefs(@NotNull String name) throws NoSuchAlgorithmException {
        Intrinsics.h(name, "name");
        SharedPreferences sharedPreferencesCreate = EncryptedSharedPreferences.create(this.context, FileUtilsKt.getFilenameForModuleInstallation(name, this.moduleAppId, this.registrationId), this.encryptionManager.getEncryptionKey());
        Intrinsics.g(sharedPreferencesCreate, "create(\n      context,\n …nager.encryptionKey\n    )");
        return sharedPreferencesCreate;
    }
}
