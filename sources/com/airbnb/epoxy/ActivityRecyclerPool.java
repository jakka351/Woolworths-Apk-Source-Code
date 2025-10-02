package com.airbnb.epoxy;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/epoxy/ActivityRecyclerPool;", "", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ActivityRecyclerPool {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13303a = new ArrayList(5);

    /* JADX WARN: Multi-variable type inference failed */
    public static Lifecycle a(Context context) {
        if (context instanceof LifecycleOwner) {
            return ((LifecycleOwner) context).getD();
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        Intrinsics.g(baseContext, "baseContext");
        return a(baseContext);
    }
}
