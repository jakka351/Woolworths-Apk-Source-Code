package com.auth0.jwt.impl;

import com.auth0.jwt.interfaces.Header;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes4.dex */
class BasicHeader implements Header, Serializable {
    public final Map d;

    public BasicHeader(Map map) {
        this.d = Collections.unmodifiableMap(map);
    }
}
