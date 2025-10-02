package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.common.ips.EmptyTimeJumpReporter;

/* renamed from: me.oriient.ipssdk.common.ofs.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1559q extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1559q f25764a = new C1559q();

    public C1559q() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new EmptyTimeJumpReporter();
    }
}
