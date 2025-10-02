package com.salesforce.marketingcloud.storage;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.salesforce.marketingcloud.messages.Region;
import java.util.List;

@SuppressLint
/* loaded from: classes6.dex */
public interface l {
    Region a(String str, @NonNull com.salesforce.marketingcloud.util.c cVar);

    @NonNull
    List<Region> a(int i, com.salesforce.marketingcloud.util.c cVar);

    void a(@NonNull Region region, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception;

    void a(@NonNull String str, boolean z);

    @NonNull
    List<String> c(@NonNull String str, int i);

    @NonNull
    List<String> d(int i);

    int f(int i);

    void l();

    Region m(@NonNull com.salesforce.marketingcloud.util.c cVar);
}
