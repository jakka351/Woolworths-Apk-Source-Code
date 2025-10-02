package me.oriient.internal.di;

import com.squareup.sqldelight.android.AndroidSqliteDriver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.internal.services.uploadingManager.DataUploaderItemsStorageImpl;
import me.oriient.internal.services.uploadingManager.database.UploadingSqlDatabase;

/* loaded from: classes7.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f24919a = new a();

    public a() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        UploadingSqlDatabase.Companion companion = UploadingSqlDatabase.INSTANCE;
        return new DataUploaderItemsStorageImpl(companion.invoke(new AndroidSqliteDriver(companion.getSchema(), ((ContextProvider) InternalDiKt.getDi().get(Reflection.f24268a.b(ContextProvider.class))).getContext(), "me.oriient.services.uploadingmanager.database")));
    }
}
