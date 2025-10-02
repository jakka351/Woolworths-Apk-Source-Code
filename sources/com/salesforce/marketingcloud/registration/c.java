package com.salesforce.marketingcloud.registration;

import androidx.annotation.Size;
import com.salesforce.marketingcloud.registration.RegistrationManager;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public interface c {
    @NotNull
    RegistrationManager.Editor a(@NotNull String str, @NotNull String str2, boolean z);

    @NotNull
    RegistrationManager.Editor a(@Size @NotNull String str, @NotNull Map<String, String> map, boolean z);

    @NotNull
    RegistrationManager.Editor a(@Size @NotNull String str, boolean z);

    @NotNull
    RegistrationManager.Editor a(@NotNull Map<String, String> map, boolean z);
}
