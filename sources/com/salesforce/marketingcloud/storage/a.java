package com.salesforce.marketingcloud.storage;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.salesforce.marketingcloud.messages.Region;
import java.util.List;

@SuppressLint
/* loaded from: classes6.dex */
public interface a {
    int a();

    int a(int i);

    int a(String[] strArr);

    void a(com.salesforce.marketingcloud.analytics.b bVar, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception;

    int b(int i);

    int b(com.salesforce.marketingcloud.analytics.b bVar, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception;

    @NonNull
    List<com.salesforce.marketingcloud.analytics.b> b(@NonNull Region region, @NonNull com.salesforce.marketingcloud.util.c cVar);

    @NonNull
    List<com.salesforce.marketingcloud.analytics.b> c(@NonNull com.salesforce.marketingcloud.util.c cVar);

    boolean c(int i);

    int d();

    int e();

    int g(int i);

    @NonNull
    List<com.salesforce.marketingcloud.analytics.b> g(@NonNull com.salesforce.marketingcloud.util.c cVar);

    @NonNull
    List<com.salesforce.marketingcloud.analytics.b> h(@NonNull com.salesforce.marketingcloud.util.c cVar);

    @NonNull
    List<com.salesforce.marketingcloud.analytics.b> i(@NonNull com.salesforce.marketingcloud.util.c cVar);

    @NonNull
    List<com.salesforce.marketingcloud.analytics.b> o(@NonNull com.salesforce.marketingcloud.util.c cVar);
}
