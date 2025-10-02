package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.navigation.turnByTurn.TurnByTurnNavigationManagerImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.p4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1707p4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1707p4 f26129a = new C1707p4();

    public C1707p4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new TurnByTurnNavigationManagerImpl();
    }
}
