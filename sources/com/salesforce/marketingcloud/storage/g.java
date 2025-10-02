package com.salesforce.marketingcloud.storage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public interface g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f17065a = 1;
    public static final int b = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    int a(@NonNull InAppMessage inAppMessage, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception;

    int a(@NonNull Collection<String> collection);

    @Nullable
    InAppMessage a(@NonNull String str, @NonNull com.salesforce.marketingcloud.util.c cVar);

    @Nullable
    InAppMessage a(@NonNull Collection<String> collection, @NonNull com.salesforce.marketingcloud.util.c cVar);

    void a(@NonNull InAppMessage inAppMessage);

    void b(@NonNull String str, int i);

    @NonNull
    JSONArray d(@NonNull com.salesforce.marketingcloud.util.c cVar);

    @NonNull
    List<String> e(@NonNull com.salesforce.marketingcloud.util.c cVar);
}
