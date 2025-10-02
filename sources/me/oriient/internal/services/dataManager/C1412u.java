package me.oriient.internal.services.dataManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.services.plai.database.PlaiSqlDatabase;

/* renamed from: me.oriient.internal.services.dataManager.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1412u extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1412u f25414a = new C1412u();

    public C1412u() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new me.oriient.internal.services.dataManager.plaiCategories.S((CoroutineScope) J.b.getD(), (PlaiSqlDatabase) J.d.getD());
    }
}
