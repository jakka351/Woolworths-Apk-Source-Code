package com.salesforce.marketingcloud;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import org.json.JSONObject;

@RestrictTo
/* loaded from: classes.dex */
public interface d {
    @NonNull
    String componentName();

    @Nullable
    JSONObject componentState();

    void tearDown(boolean z);
}
