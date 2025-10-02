package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.android.appState.AppStateProviderImpl;

/* renamed from: me.oriient.ipssdk.common.ofs.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1560s extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1560s f25766a = new C1560s();

    public C1560s() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new AppStateProviderImpl();
    }
}
