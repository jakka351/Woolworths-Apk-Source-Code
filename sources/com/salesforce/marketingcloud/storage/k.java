package com.salesforce.marketingcloud.storage;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.salesforce.marketingcloud.messages.Message;
import java.util.List;

@SuppressLint
/* loaded from: classes6.dex */
public interface k {
    int a(@NonNull String str);

    int a(@NonNull String str, int i);

    Message a(@NonNull String str, @NonNull com.salesforce.marketingcloud.util.c cVar);

    @NonNull
    List<Message> a(@NonNull com.salesforce.marketingcloud.util.c cVar);

    void a(@NonNull Message message, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception;

    @NonNull
    List<Message> b(@NonNull com.salesforce.marketingcloud.util.c cVar);

    int e(int i);
}
