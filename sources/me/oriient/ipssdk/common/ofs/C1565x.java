package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.android.TimeProviderImpl;

/* renamed from: me.oriient.ipssdk.common.ofs.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1565x extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1565x f25771a = new C1565x();

    public C1565x() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new TimeProviderImpl();
    }
}
