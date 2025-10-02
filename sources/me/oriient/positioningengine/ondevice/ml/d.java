package me.oriient.positioningengine.ondevice.ml;

import java.io.File;
import java.security.MessageDigest;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Exception f26453a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ File c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Exception exc, byte[] bArr, File file, f fVar) {
        super(0);
        this.f26453a = exc;
        this.b = bArr;
        this.c = file;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Pair pair = new Pair("errorMessage", this.f26453a.getMessage());
        Pair pair2 = new Pair("rk", Integer.valueOf(this.b.length));
        Pair pair3 = new Pair("fs", Long.valueOf(this.c.length()));
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(this.b);
        Intrinsics.e(bArrDigest);
        return MapsKt.j(pair, pair2, pair3, new Pair("rkh", ArraysKt.T(bArrDigest, "", e.f26454a, 30)));
    }
}
