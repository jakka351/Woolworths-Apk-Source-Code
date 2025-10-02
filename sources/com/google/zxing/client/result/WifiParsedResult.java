package com.google.zxing.client.result;

/* loaded from: classes6.dex */
public final class WifiParsedResult extends ParsedResult {
    @Override // com.google.zxing.client.result.ParsedResult
    public final String a() {
        StringBuilder sb = new StringBuilder(80);
        ParsedResult.b(sb, Boolean.toString(false));
        return sb.toString();
    }
}
