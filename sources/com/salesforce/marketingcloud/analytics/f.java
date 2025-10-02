package com.salesforce.marketingcloud.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import java.util.List;
import org.json.JSONObject;

@RestrictTo
/* loaded from: classes6.dex */
public interface f {
    void a(@NonNull InAppMessage inAppMessage);

    void a(@NonNull InAppMessage inAppMessage, @NonNull com.salesforce.marketingcloud.messages.iam.j jVar);

    void a(@NonNull InAppMessage inAppMessage, @NonNull JSONObject jSONObject);

    void a(@NonNull String str, @NonNull String str2, @NonNull List<String> list);

    void b(@NonNull InAppMessage inAppMessage);
}
