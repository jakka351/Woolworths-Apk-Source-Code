package com.auth0.jwt.impl;

import com.auth0.jwt.interfaces.Claim;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.Map;

/* loaded from: classes4.dex */
class JsonNodeClaim implements Claim {

    /* renamed from: com.auth0.jwt.impl.JsonNodeClaim$1, reason: invalid class name */
    class AnonymousClass1 extends TypeReference<Map<String, Object>> {
    }

    public final String toString() {
        return "Missing claim";
    }
}
