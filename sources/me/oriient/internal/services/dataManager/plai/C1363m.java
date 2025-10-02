package me.oriient.internal.services.dataManager.plai;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.OutcomeKt;
import me.oriient.internal.services.plai.database.PlaiSqlDatabase;

/* renamed from: me.oriient.internal.services.dataManager.plai.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1363m extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25305a;
    public final /* synthetic */ List b;
    public final /* synthetic */ C1364n c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1363m(String str, List list, C1364n c1364n) {
        super(1);
        this.f25305a = str;
        this.b = list;
        this.c = c1364n;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PlaiSqlDatabase db = (PlaiSqlDatabase) obj;
        Intrinsics.h(db, "db");
        db.transaction(false, new C1362l(db, this.f25305a, this.b, this.c));
        return OutcomeKt.toOutcomeSuccess(Unit.f24250a);
    }
}
