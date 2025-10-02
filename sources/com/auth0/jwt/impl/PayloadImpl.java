package com.auth0.jwt.impl;

import com.auth0.jwt.interfaces.Payload;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
class PayloadImpl implements Payload, Serializable {
    public final List d;
    public final Map e;

    public PayloadImpl(List list, Map map) {
        this.d = list != null ? Collections.unmodifiableList(list) : null;
        this.e = Collections.unmodifiableMap(map);
    }
}
