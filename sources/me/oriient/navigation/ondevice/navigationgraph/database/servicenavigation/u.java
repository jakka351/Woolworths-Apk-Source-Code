package me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation;

import com.squareup.sqldelight.TransacterImpl;
import com.squareup.sqldelight.android.AndroidSqliteDriver;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class u extends TransacterImpl implements me.oriient.navigation.ondevice.navigationgraph.database.d {

    /* renamed from: a, reason: collision with root package name */
    public final s f26352a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(AndroidSqliteDriver driver) {
        super(driver);
        Intrinsics.h(driver, "driver");
        this.f26352a = new s(this, driver);
    }
}
