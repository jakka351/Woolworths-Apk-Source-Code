package me.oriient.internal.services.dataManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.utils.core.FileManager;
import me.oriient.internal.services.dataManager.database.DataManagerSqlDatabase;
import me.oriient.internal.services.dataManager.mapGrid.C1321t;

/* renamed from: me.oriient.internal.services.dataManager.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1269e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1269e f25131a = new C1269e();

    public C1269e() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new C1321t((CoroutineScope) J.f25075a.getD(), (DataManagerSqlDatabase) J.e.getD(), (FileManager) InternalDiKt.getDi().get(Reflection.f24268a.b(FileManager.class), FileManager.FileManagerFolders.FILES.getDiKey()));
    }
}
