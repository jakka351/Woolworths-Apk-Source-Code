package me.oriient.internal.services.dataManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.services.dataManager.plai.C1364n;
import me.oriient.internal.services.plai.database.PlaiSqlDatabase;

/* renamed from: me.oriient.internal.services.dataManager.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1413v extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1413v f25418a = new C1413v();

    public C1413v() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new C1364n((CoroutineScope) J.b.getD(), (PlaiSqlDatabase) J.d.getD());
    }
}
