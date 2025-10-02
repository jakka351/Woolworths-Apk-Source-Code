package com.salesforce.marketingcloud.storage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public interface n {
    void a(@NonNull com.salesforce.marketingcloud.events.h hVar) throws Exception;

    int b(@NonNull com.salesforce.marketingcloud.events.h hVar);

    int b(@NonNull Collection<String> collection);

    @Nullable
    com.salesforce.marketingcloud.events.h b(@NonNull String str);

    @NonNull
    List<com.salesforce.marketingcloud.events.h> g(@NonNull String str);

    void k();

    @NonNull
    JSONArray m();
}
