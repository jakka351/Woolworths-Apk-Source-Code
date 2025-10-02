package me.oriient.ipssdk.base.di;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a&\u0010\t\u001a\u00020\u00022\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\n\b\u0000\u0010\f\u0018\u0001*\u00020\u000bH\u0087\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\n\b\u0000\u0010\f\u0018\u0001*\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b\u000e\u0010\u0012\u001a\u001c\u0010\u0013\u001a\u00028\u0000\"\n\b\u0000\u0010\f\u0018\u0001*\u00020\u000bH\u0087\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a&\u0010\u0013\u001a\u00028\u0000\"\n\b\u0000\u0010\f\u0018\u0001*\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0087\b¢\u0006\u0004\b\u0013\u0010\u0015\u001a&\u0010\u0017\u001a\u00020\u0016\"\n\b\u0000\u0010\f\u0018\u0001*\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0087\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a&\u0010\u0019\u001a\u00020\u0002\"\n\b\u0000\u0010\f\u0018\u0001*\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0087\b¢\u0006\u0004\b\u0019\u0010\u001a\"!\u0010!\u001a\u00020\u00068@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lme/oriient/ipssdk/base/di/DiModuleInitializer;", "initializer", "", "addDiModuleInitializer", "(Lme/oriient/ipssdk/base/di/DiModuleInitializer;)V", "Lkotlin/Function1;", "Lme/oriient/internal/infra/di/DependencyInjection;", "Lkotlin/ExtensionFunctionType;", "block", "initializeDiTest", "(Lkotlin/jvm/functions/Function1;)V", "Lme/oriient/internal/infra/utils/core/DiProvidable;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Lazy;", "inject", "()Lkotlin/Lazy;", "", "named", "(Ljava/lang/String;)Lkotlin/Lazy;", "get", "()Lme/oriient/internal/infra/utils/core/DiProvidable;", "(Ljava/lang/String;)Lme/oriient/internal/infra/utils/core/DiProvidable;", "", "isRegistered", "(Ljava/lang/String;)Z", "unregister", "(Ljava/lang/String;)V", "a", "Lkotlin/Lazy;", "getDi", "()Lme/oriient/internal/infra/di/DependencyInjection;", "getDi$annotations", "()V", "di", "me.oriient.sdk-base"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DependencyInjectionKt {

    /* renamed from: a, reason: collision with root package name */
    private static final Lazy f25682a = LazyKt.b(h.f25691a);
    private static final ArrayList b = new ArrayList();

    public static final void access$init(DependencyInjection dependencyInjection) {
        Iterator it = CollectionsKt.B(b).iterator();
        while (it.hasNext()) {
            DiModuleInitializer diModuleInitializer = (DiModuleInitializer) it.next();
            if (!diModuleInitializer.getIsInitialized()) {
                diModuleInitializer.initialize(dependencyInjection);
            }
        }
    }

    @Keep
    public static final void addDiModuleInitializer(@NotNull DiModuleInitializer initializer) {
        Intrinsics.h(initializer, "initializer");
        ArrayList arrayList = b;
        if (arrayList.contains(initializer)) {
            return;
        }
        arrayList.add(initializer);
    }

    @Keep
    public static final <T extends DiProvidable> T get() {
        getDi();
        Intrinsics.o();
        throw null;
    }

    @NotNull
    public static final DependencyInjection getDi() {
        return (DependencyInjection) f25682a.getD();
    }

    @PublishedApi
    public static /* synthetic */ void getDi$annotations() {
    }

    public static final void initializeDiTest(@NotNull Function1<? super DependencyInjection, Unit> block) {
        Intrinsics.h(block, "block");
        getDi().clear();
        block.invoke(getDi());
    }

    @Keep
    public static final <T extends DiProvidable> Lazy<T> inject() {
        getDi();
        Intrinsics.o();
        throw null;
    }

    @Keep
    public static final <T extends DiProvidable> boolean isRegistered(String str) {
        getDi();
        Intrinsics.o();
        throw null;
    }

    @Keep
    public static final <T extends DiProvidable> void unregister(String str) {
        getDi();
        Intrinsics.o();
        throw null;
    }

    @Keep
    public static final <T extends DiProvidable> T get(String str) {
        getDi();
        Intrinsics.o();
        throw null;
    }

    @Keep
    public static final <T extends DiProvidable> Lazy<T> inject(String named) {
        Intrinsics.h(named, "named");
        getDi();
        Intrinsics.o();
        throw null;
    }
}
