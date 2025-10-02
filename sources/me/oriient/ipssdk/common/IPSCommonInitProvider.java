package me.oriient.ipssdk.common;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.startup.Initializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.base.ContextProviderKt;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.common.di.CommonDiModuleInitializer;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\t0\bH\u0016¨\u0006\u000b"}, d2 = {"Lme/oriient/ipssdk/common/IPSCommonInitProvider;", "Landroidx/startup/Initializer;", "", "()V", "create", "context", "Landroid/content/Context;", "dependencies", "", "Ljava/lang/Class;", "Companion", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IPSCommonInitProvider implements Initializer<Unit> {
    private static final String TAG = "IPSCommonInitProvider";

    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ Object create(Context context) {
        m434create(context);
        return Unit.f24250a;
    }

    @Override // androidx.startup.Initializer
    @NotNull
    public List<Class<? extends Initializer<?>>> dependencies() {
        return new ArrayList();
    }

    /* renamed from: create, reason: collision with other method in class */
    public void m434create(@NotNull Context context) {
        Intrinsics.h(context, "context");
        ContextProviderKt.setGlobalContext(context);
        DependencyInjectionKt.addDiModuleInitializer(new CommonDiModuleInitializer());
    }
}
