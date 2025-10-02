package me.oriient.internal.services.dataManager.plaiCategories;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.OutcomeKt;
import me.oriient.internal.services.plai.database.PlaiSqlDatabase;

/* loaded from: classes7.dex */
public final class Q extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25333a;
    public final /* synthetic */ List b;
    public final /* synthetic */ S c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(String str, List list, S s) {
        super(1);
        this.f25333a = str;
        this.b = list;
        this.c = s;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PlaiSqlDatabase db = (PlaiSqlDatabase) obj;
        Intrinsics.h(db, "db");
        db.transaction(false, new P(db, this.f25333a, this.b, this.c));
        return OutcomeKt.toOutcomeSuccess(Unit.f24250a);
    }
}
