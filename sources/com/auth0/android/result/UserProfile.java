package com.auth0.android.result;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/auth0/android/result/UserProfile;", "Ljava/io/Serializable;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserProfile implements Serializable {
    public final List d;
    public final Map e;
    public final Map f;
    public final Map g;

    public UserProfile(List list, Map map, Map map2, Map map3) {
        this.d = list;
        this.e = map;
        this.f = map2;
        this.g = map3;
    }
}
