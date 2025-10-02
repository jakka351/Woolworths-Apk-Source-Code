package com.google.mlkit.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.mlkit.common.model.RemoteModelManager;
import com.google.mlkit.common.sdkinternal.Cleaner;
import com.google.mlkit.common.sdkinternal.CloseGuard;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.MlKitThreadPool;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import java.util.List;

@KeepForSdk
/* loaded from: classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        Component component = SharedPrefManager.b;
        Component.Builder builderB = Component.b(ModelFileHelper.class);
        builderB.a(Dependency.c(MlKitContext.class));
        builderB.f = new zza();
        Component componentB = builderB.b();
        Component.Builder builderB2 = Component.b(MlKitThreadPool.class);
        builderB2.f = new zzb();
        Component componentB2 = builderB2.b();
        Component.Builder builderB3 = Component.b(RemoteModelManager.class);
        builderB3.a(new Dependency(2, 0, RemoteModelManager.RemoteModelManagerRegistration.class));
        builderB3.f = new zzc();
        Component componentB3 = builderB3.b();
        Component.Builder builderB4 = Component.b(ExecutorSelector.class);
        builderB4.a(Dependency.d(MlKitThreadPool.class));
        builderB4.f = new zzd();
        Component componentB4 = builderB4.b();
        Component.Builder builderB5 = Component.b(Cleaner.class);
        builderB5.f = new zze();
        Component componentB5 = builderB5.b();
        Component.Builder builderB6 = Component.b(CloseGuard.Factory.class);
        builderB6.a(Dependency.c(Cleaner.class));
        builderB6.f = new zzf();
        Component componentB6 = builderB6.b();
        Component.Builder builderB7 = Component.b(com.google.mlkit.common.internal.model.zzg.class);
        builderB7.a(Dependency.c(MlKitContext.class));
        builderB7.f = new zzg();
        Component componentB7 = builderB7.b();
        Component.Builder builderB8 = Component.b(RemoteModelManager.RemoteModelManagerRegistration.class);
        builderB8.e = 1;
        builderB8.a(Dependency.d(com.google.mlkit.common.internal.model.zzg.class));
        builderB8.f = new zzh();
        return zzaf.zzi(component, componentB, componentB2, componentB3, componentB4, componentB5, componentB6, componentB7, builderB8.b());
    }
}
