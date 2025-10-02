package com.google.android.play.core.integrity;

/* loaded from: classes6.dex */
final class a extends ap {

    /* renamed from: a, reason: collision with root package name */
    private String f14707a;
    private y b;

    @Override // com.google.android.play.core.integrity.ap
    public final ap a(y yVar) {
        this.b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final ap b(String str) {
        this.f14707a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final aq c() {
        y yVar;
        String str = this.f14707a;
        if (str != null && (yVar = this.b) != null) {
            return new aq(str, yVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f14707a == null) {
            sb.append(" token");
        }
        if (this.b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
