package com.tealium.core.persistence;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/tealium/core/persistence/KeyValueDao;", "K", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public interface KeyValueDao<K, T> {
    List F();

    Object b(String str);

    void c(e0 e0Var);

    void clear();

    int count();

    Map getAll();

    void h(Object obj);

    void i();
}
