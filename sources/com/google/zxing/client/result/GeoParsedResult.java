package com.google.zxing.client.result;

/* loaded from: classes6.dex */
public final class GeoParsedResult extends ParsedResult {
    @Override // com.google.zxing.client.result.ParsedResult
    public final String a() {
        StringBuilder sb = new StringBuilder(20);
        sb.append("0.0, 0.0");
        return sb.toString();
    }
}
