package me.oriient.navigation.common;

import com.squareup.sqldelight.android.AndroidSqliteDriver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.internal.infra.utils.core.FileManager;

/* renamed from: me.oriient.navigation.common.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1767h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1767h f26243a = new C1767h();

    public C1767h() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        me.oriient.navigation.ondevice.navigationgraph.database.d.Companion.getClass();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        reflectionFactory.b(me.oriient.navigation.ondevice.navigationgraph.database.d.class);
        AndroidSqliteDriver androidSqliteDriver = new AndroidSqliteDriver(me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation.t.f26351a, ((ContextProvider) DiKt.a().get(reflectionFactory.b(ContextProvider.class), null)).getContext(), "me.oriient.navigation.ondevice.navgraph");
        reflectionFactory.b(me.oriient.navigation.ondevice.navigationgraph.database.d.class);
        return new me.oriient.navigation.ondevice.navgraph.v(new me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation.u(androidSqliteDriver), (FileManager) DiKt.a().get(reflectionFactory.b(FileManager.class), FileManager.FileManagerFolders.FILES.getDiKey()));
    }
}
